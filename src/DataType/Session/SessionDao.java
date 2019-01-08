/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataType.Session;

import java.sql.Connection;

/**
 *
 * @author kumar
 */
public interface SessionDao {
    
     int insertSession(Session session);
     Session[] selectSession();
     Session[] calculateFeeInSessionChange(int id);
    int updateSession(Session session);
      public int calculateFeeNow(Session[] sessions,int id,Connection con);
}
