/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataType.Session;

/**
 *
 * @author kumar
 */
public interface SessionDao {
    
     int insertSession(Session session);
     Session[] selectSession();
     int calculateFeeInSessionChange();
    int updateSession(Session session);
}
