-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 08, 2019 at 03:29 PM
-- Server version: 10.1.34-MariaDB
-- PHP Version: 7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hemalayan`
--

-- --------------------------------------------------------

--
-- Table structure for table `admissiontable`
--

CREATE TABLE `admissiontable` (
  `AdmissionID` int(224) NOT NULL,
  `AdmissionSlNo` int(255) DEFAULT NULL,
  `StudentID` int(254) DEFAULT NULL,
  `RegNo` int(254) NOT NULL,
  `ClassID` int(254) NOT NULL,
  `Sec` varchar(2) NOT NULL,
  `Roll` int(254) NOT NULL,
  `TransportID` int(254) DEFAULT NULL,
  `Status` int(2) NOT NULL DEFAULT '0',
  `Session` int(254) NOT NULL,
  `transportFee` int(11) NOT NULL,
  `tutionFee` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admissiontable`
--

INSERT INTO `admissiontable` (`AdmissionID`, `AdmissionSlNo`, `StudentID`, `RegNo`, `ClassID`, `Sec`, `Roll`, `TransportID`, `Status`, `Session`, `transportFee`, `tutionFee`, `created_at`) VALUES
(120080, 10001, NULL, 2, 16, 'A', 1, 0, 1, 2, 200, 400, '2019-01-07 14:08:44'),
(120081, 10001, NULL, 2, 16, 'A', 1, 4, 1, 1, 230, 300, '2019-01-07 14:09:22'),
(120082, 10002, NULL, 3, 16, 'A', 2, 3, 1, 2, 400, 100, '2019-01-07 14:16:04');

-- --------------------------------------------------------

--
-- Table structure for table `cart_table`
--

CREATE TABLE `cart_table` (
  `cart_id` int(10) NOT NULL,
  `RegID` int(11) NOT NULL,
  `Price` double NOT NULL,
  `session` int(11) NOT NULL,
  `admission_id` int(11) NOT NULL,
  `paid` int(11) NOT NULL,
  `Discount` double NOT NULL,
  `Dues` double NOT NULL,
  `status` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cart_table`
--

INSERT INTO `cart_table` (`cart_id`, `RegID`, `Price`, `session`, `admission_id`, `paid`, `Discount`, `Dues`, `status`) VALUES
(1, 2, 2000, 1, 0, 1200, 100, 1100, 0),
(2, 2, 0, 1, 0, 0, 0, 400, 0);

-- --------------------------------------------------------

--
-- Table structure for table `classtable`
--

CREATE TABLE `classtable` (
  `ClassID` int(11) NOT NULL,
  `Name` varchar(254) NOT NULL,
  `examFee` int(254) NOT NULL,
  `computer` int(254) DEFAULT NULL,
  `annual` int(224) NOT NULL,
  `session` int(255) NOT NULL,
  `code` varchar(224) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `classtable`
--

INSERT INTO `classtable` (`ClassID`, `Name`, `examFee`, `computer`, `annual`, `session`, `code`) VALUES
(1, 'One', 10, 5, 100, 1, '10000'),
(2, 'Two', 20, 10, 200, 1, '20000'),
(3, 'Three', 30, 15, 300, 1, '30000'),
(4, '5th', 40, 20, 400, 1, '40000'),
(5, 'jTextField1', 50, 25, 500, 1, '50000'),
(6, 'Four', 60, 30, 600, 1, '60000'),
(7, 'jTextField1', 70, 35, 700, 1, '70000'),
(8, 'jTextField1', 80, 40, 800, 1, '80000'),
(9, 'test', 90, 45, 900, 1, '90000'),
(10, 'jTextField1', 100, 50, 1000, 1, '100000'),
(11, 'jTextField1', 110, 55, 1100, 1, '110000'),
(12, '', 120, 60, 1200, 1, '120000'),
(13, 'Four', 130, 65, 1300, 1, '130000'),
(14, 'Five', 140, 70, 1400, 1, '140000'),
(15, 'Six', 150, 75, 1500, 1, '150000'),
(16, 'Seven', 160, 80, 1600, 1, '160000'),
(17, '3th', 170, 85, 1700, 1, '170000'),
(18, '11th', 180, 90, 1800, 1, '180000'),
(19, '1st', 190, 95, 1900, 1, '190000');

-- --------------------------------------------------------

--
-- Table structure for table `employtable`
--

CREATE TABLE `employtable` (
  `EmpID` int(11) NOT NULL,
  `Name` varchar(254) NOT NULL,
  `address` varchar(6000) NOT NULL,
  `ph1` varchar(15) NOT NULL,
  `ph2` text NOT NULL,
  `email` varchar(254) NOT NULL,
  `type` varchar(224) NOT NULL,
  `session` int(254) NOT NULL DEFAULT '1',
  `cast` varchar(224) NOT NULL,
  `religion` varchar(224) NOT NULL,
  `father` varchar(224) NOT NULL,
  `mother` varchar(224) NOT NULL,
  `DOB` date NOT NULL,
  `Gender` int(254) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employtable`
--

INSERT INTO `employtable` (`EmpID`, `Name`, `address`, `ph1`, `ph2`, `email`, `type`, `session`, `cast`, `religion`, `father`, `mother`, `DOB`, `Gender`) VALUES
(1, 'jh', 'at-kri		', '655', '45', 'sff', 'Non-Teaching', 1, 'sca', 'sfa', 'hr', 'io', '2018-12-26', 1),
(2, 'Nishant kumar', 'At - kritaniya		', '898', '89', 'ni', 'Teacher', 1, 'cast', 'religion', 'Father', 'Mother', '2018-12-26', 1),
(3, 'Nishant kumar', 'AT - BHAGA', '54', '45', 'DF', 'Teacher', 1, 'DF', 'DF', 'fATHER', 'MOTHER', '2018-12-26', 1);

-- --------------------------------------------------------

--
-- Table structure for table `expansetable`
--

CREATE TABLE `expansetable` (
  `ExpenseID` int(11) NOT NULL,
  `Title` varchar(254) NOT NULL,
  `Price` int(254) NOT NULL,
  `Remark` varchar(2000) DEFAULT NULL,
  `create_at` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `expansetable`
--

INSERT INTO `expansetable` (`ExpenseID`, `Title`, `Price`, `Remark`, `create_at`) VALUES
(1, 'oil', 500, 'ture', '2018-12-27'),
(2, 'Oil', 900, 'iuy', '2018-12-04'),
(3, 'oile', 0, '', '2018-12-02'),
(4, 'ui', 0, '', '2018-12-27');

-- --------------------------------------------------------

--
-- Table structure for table `feereceiptmanagertable`
--

CREATE TABLE `feereceiptmanagertable` (
  `feeBookID` int(255) NOT NULL,
  `MonthCode` int(15) NOT NULL,
  `feeType` varchar(254) NOT NULL,
  `SessionID` int(11) NOT NULL,
  `ClassID` int(224) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `feereceiptmanagertable`
--

INSERT INTO `feereceiptmanagertable` (`feeBookID`, `MonthCode`, `feeType`, `SessionID`, `ClassID`, `created_at`) VALUES
(1, 11, 'Annual Fee', 1, 16, '2018-12-30 13:03:59'),
(2, 11, 'Examination Fee', 1, 16, '2018-12-30 13:38:12'),
(3, 11, 'Late Fine', 1, 16, '2018-12-30 13:38:12'),
(10, 11, 'Computer Fee', 1, 16, '2019-01-04 05:22:54'),
(11, 11, 'Tuition  Fee', 1, 16, '2019-01-04 05:57:55');

-- --------------------------------------------------------

--
-- Table structure for table `feetransactiontable`
--

CREATE TABLE `feetransactiontable` (
  `feeTransID` int(255) NOT NULL,
  `RegNo` int(255) NOT NULL,
  `sessionID` int(11) NOT NULL,
  `FeeType` varchar(255) NOT NULL,
  `feePaid` int(255) NOT NULL DEFAULT '0',
  `discount` int(255) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `feetypetable`
--

CREATE TABLE `feetypetable` (
  `feetypeId` int(224) NOT NULL,
  `Name` varchar(254) NOT NULL,
  `Price` int(254) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `productID` int(224) NOT NULL,
  `Name` varchar(254) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`productID`, `Name`, `created_at`) VALUES
(1, 'Notebook', '2018-12-28 00:49:33'),
(2, 'Tie', '2018-12-28 00:49:33'),
(3, 'shirts', '2018-12-28 00:49:33'),
(4, 'paints', '2018-12-28 00:49:33'),
(5, 'books', '2018-12-28 00:49:33');

-- --------------------------------------------------------

--
-- Table structure for table `productstocktable`
--

CREATE TABLE `productstocktable` (
  `ProductStockID` int(255) NOT NULL,
  `ProductID` int(255) DEFAULT '0',
  `SellPrice` double NOT NULL DEFAULT '0',
  `Size` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `Price` double NOT NULL DEFAULT '0',
  `Quantity` int(10) NOT NULL DEFAULT '0',
  `Rate` double NOT NULL DEFAULT '0',
  `Flag` int(10) NOT NULL DEFAULT '0',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `RQuantity` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `productstocktable`
--

INSERT INTO `productstocktable` (`ProductStockID`, `ProductID`, `SellPrice`, `Size`, `Price`, `Quantity`, `Rate`, `Flag`, `created_at`, `RQuantity`) VALUES
(1, 1, 120, '4x6', 100, 2, 60, 1, '2018-12-26 18:29:32', 2),
(2, 2, 120, 'A4', 100, 2, 60, 1, '2018-12-27 09:20:39', 2),
(3, 3, 120, 'A4', 100, 2, 60, 1, '2018-12-27 09:21:18', 2);

-- --------------------------------------------------------

--
-- Table structure for table `producttransactiontable`
--

CREATE TABLE `producttransactiontable` (
  `producttrID` int(224) NOT NULL,
  `AdmissionID` int(254) NOT NULL,
  `RegNo` int(254) NOT NULL,
  `ProductID` int(254) NOT NULL,
  `Quntity` int(254) NOT NULL,
  `Price` int(254) NOT NULL,
  `Pay` int(254) NOT NULL,
  `Discount` int(254) NOT NULL,
  `Session` year(4) NOT NULL,
  `create_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `producttransactiontable`
--

INSERT INTO `producttransactiontable` (`producttrID`, `AdmissionID`, `RegNo`, `ProductID`, `Quntity`, `Price`, `Pay`, `Discount`, `Session`, `create_at`) VALUES
(1, 120051, 2, 1, 1, 1000, 200, 100, 2001, '2018-12-31 06:42:32');

-- --------------------------------------------------------

--
-- Table structure for table `sessiontable`
--

CREATE TABLE `sessiontable` (
  `sessionID` int(11) NOT NULL,
  `Name` varchar(254) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sessiontable`
--

INSERT INTO `sessiontable` (`sessionID`, `Name`) VALUES
(1, '2018-2019');

-- --------------------------------------------------------

--
-- Table structure for table `studenttable`
--

CREATE TABLE `studenttable` (
  `studentID` int(11) NOT NULL,
  `Name` varchar(254) NOT NULL,
  `Father` varchar(254) NOT NULL,
  `Mother` varchar(254) NOT NULL,
  `At` varchar(254) NOT NULL,
  `PO` varchar(254) NOT NULL,
  `PS` varchar(254) NOT NULL,
  `Dist` varchar(254) NOT NULL,
  `State` varchar(254) NOT NULL,
  `Pin` varchar(254) NOT NULL,
  `ph1` varchar(254) NOT NULL,
  `ph2` varchar(254) NOT NULL,
  `Nationality` varchar(254) NOT NULL,
  `Gender` int(3) NOT NULL,
  `DOB` date NOT NULL,
  `Religion` varchar(254) NOT NULL,
  `Caste` varchar(254) NOT NULL,
  `refByID` varchar(254) NOT NULL,
  `RegID` varchar(254) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1',
  `create_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studenttable`
--

INSERT INTO `studenttable` (`studentID`, `Name`, `Father`, `Mother`, `At`, `PO`, `PS`, `Dist`, `State`, `Pin`, `ph1`, `ph2`, `Nationality`, `Gender`, `DOB`, `Religion`, `Caste`, `refByID`, `RegID`, `status`, `create_at`) VALUES
(2, 'Ritika', 'Bijay', 'Mother', 'nayagaon', 'sathkutti', 'parbatta', 'khagaria', 'Bihar', '812001', '8342669783', '9102166981', 'Indian', 2, '2000-06-29', 'Hindu', 'Bhumhiha', '1', '2', 0, '2018-12-27 03:48:14'),
(3, 'Aarav kumar singh garg', 'sudhir', 'nisha', 'nayagaon', 'sathkutti', 'parbatta', 'khagaria', 'Bihar', '812001', '8340669783', '9102163686', 'Indian', 1, '2018-12-06', 'Hindu', 'Bhumihar', '1', '3', 0, '2018-12-27 04:57:33'),
(4, 'sumit', 'ranjeet', 'akita devi', 'supariya', 'untaku', 'rokiya', 'chattisgah', 'UP', '854582', '8345282699', '4828548599', 'Indian', 2, '1998-12-17', 'Hindu', 'Lala', '1', '4', 0, '2018-12-27 19:37:04'),
(5, 'Aarun kumar', 'Varun tnti', 'Majulata devi', 'kheshar', 'antariya', 'Tokariya', 'Lodipur', 'MP', '854585', '854575845', '85467595', 'Pakistani', 1, '2018-12-04', 'Mushilm', 'Krilk', '1', '', 0, '2018-12-29 03:59:47'),
(6, 'Tukaram golke', 'Leua Golke', 'Jina Golke', 'Letapur', 'Jikura', 'Kitta', 'Mumbai', 'Maharastra', '812002', '8324785956', '7585976595', 'Indian', 1, '2019-01-01', 'Hindu', 'Kohari', '1', '', 1, '2019-01-07 08:46:47');

-- --------------------------------------------------------

--
-- Table structure for table `transactiontable`
--

CREATE TABLE `transactiontable` (
  `TransactionID` int(255) UNSIGNED NOT NULL,
  `AdmissionID` int(255) UNSIGNED NOT NULL,
  `FeeTypeID` int(255) UNSIGNED NOT NULL,
  `dues` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `date` date NOT NULL,
  `PayAmt` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `Discount` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `transportfeetable`
--

CREATE TABLE `transportfeetable` (
  `TransportFeeID` int(11) NOT NULL,
  `RegNo` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `session` int(255) NOT NULL,
  `routeID` int(255) NOT NULL,
  `status` varchar(500) COLLATE utf8_unicode_ci NOT NULL DEFAULT '1',
  `created_id` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `transportfeetable`
--

INSERT INTO `transportfeetable` (`TransportFeeID`, `RegNo`, `session`, `routeID`, `status`, `created_id`, `updated_at`) VALUES
(1, '2', 1, 4, '1', '2018-10-04 14:11:10', '2019-01-07 17:19:39'),
(2, '3', 2, 3, '1', '2018-07-16 14:16:04', '2019-01-07 17:19:46');

-- --------------------------------------------------------

--
-- Table structure for table `transporttable`
--

CREATE TABLE `transporttable` (
  `TransportID` int(11) NOT NULL,
  `Route` varchar(254) NOT NULL,
  `Price` int(254) NOT NULL,
  `busno` varchar(224) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transporttable`
--

INSERT INTO `transporttable` (`TransportID`, `Route`, `Price`, `busno`) VALUES
(1, 'K-mzc', 6000, '45638'),
(2, 'K2-mzc', 60, '45638'),
(3, 'K2-mzc', 6000, '45638'),
(4, 'K2-mz', 6000, '45638');

-- --------------------------------------------------------

--
-- Table structure for table `tutionfeetable`
--

CREATE TABLE `tutionfeetable` (
  `RegID` int(255) UNSIGNED NOT NULL,
  `Month` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `PaidFee` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `Discount` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admissiontable`
--
ALTER TABLE `admissiontable`
  ADD PRIMARY KEY (`AdmissionID`);

--
-- Indexes for table `cart_table`
--
ALTER TABLE `cart_table`
  ADD PRIMARY KEY (`cart_id`),
  ADD UNIQUE KEY `cart_id` (`cart_id`);

--
-- Indexes for table `classtable`
--
ALTER TABLE `classtable`
  ADD PRIMARY KEY (`ClassID`);

--
-- Indexes for table `employtable`
--
ALTER TABLE `employtable`
  ADD PRIMARY KEY (`EmpID`);

--
-- Indexes for table `expansetable`
--
ALTER TABLE `expansetable`
  ADD PRIMARY KEY (`ExpenseID`);

--
-- Indexes for table `feereceiptmanagertable`
--
ALTER TABLE `feereceiptmanagertable`
  ADD PRIMARY KEY (`feeBookID`);

--
-- Indexes for table `feetransactiontable`
--
ALTER TABLE `feetransactiontable`
  ADD PRIMARY KEY (`feeTransID`);

--
-- Indexes for table `feetypetable`
--
ALTER TABLE `feetypetable`
  ADD PRIMARY KEY (`feetypeId`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`productID`);

--
-- Indexes for table `productstocktable`
--
ALTER TABLE `productstocktable`
  ADD PRIMARY KEY (`ProductStockID`);

--
-- Indexes for table `producttransactiontable`
--
ALTER TABLE `producttransactiontable`
  ADD PRIMARY KEY (`producttrID`);

--
-- Indexes for table `sessiontable`
--
ALTER TABLE `sessiontable`
  ADD PRIMARY KEY (`sessionID`);

--
-- Indexes for table `studenttable`
--
ALTER TABLE `studenttable`
  ADD PRIMARY KEY (`studentID`);

--
-- Indexes for table `transactiontable`
--
ALTER TABLE `transactiontable`
  ADD PRIMARY KEY (`TransactionID`),
  ADD UNIQUE KEY `TransactionID` (`TransactionID`);

--
-- Indexes for table `transportfeetable`
--
ALTER TABLE `transportfeetable`
  ADD PRIMARY KEY (`TransportFeeID`),
  ADD UNIQUE KEY `TransportFeeID` (`TransportFeeID`);

--
-- Indexes for table `transporttable`
--
ALTER TABLE `transporttable`
  ADD PRIMARY KEY (`TransportID`);

--
-- Indexes for table `tutionfeetable`
--
ALTER TABLE `tutionfeetable`
  ADD PRIMARY KEY (`RegID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admissiontable`
--
ALTER TABLE `admissiontable`
  MODIFY `AdmissionID` int(224) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=120083;

--
-- AUTO_INCREMENT for table `classtable`
--
ALTER TABLE `classtable`
  MODIFY `ClassID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `employtable`
--
ALTER TABLE `employtable`
  MODIFY `EmpID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `expansetable`
--
ALTER TABLE `expansetable`
  MODIFY `ExpenseID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `feereceiptmanagertable`
--
ALTER TABLE `feereceiptmanagertable`
  MODIFY `feeBookID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `feetransactiontable`
--
ALTER TABLE `feetransactiontable`
  MODIFY `feeTransID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55;

--
-- AUTO_INCREMENT for table `feetypetable`
--
ALTER TABLE `feetypetable`
  MODIFY `feetypeId` int(224) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `productID` int(224) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `productstocktable`
--
ALTER TABLE `productstocktable`
  MODIFY `ProductStockID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `producttransactiontable`
--
ALTER TABLE `producttransactiontable`
  MODIFY `producttrID` int(224) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `sessiontable`
--
ALTER TABLE `sessiontable`
  MODIFY `sessionID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `studenttable`
--
ALTER TABLE `studenttable`
  MODIFY `studentID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `transportfeetable`
--
ALTER TABLE `transportfeetable`
  MODIFY `TransportFeeID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `transporttable`
--
ALTER TABLE `transporttable`
  MODIFY `TransportID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tutionfeetable`
--
ALTER TABLE `tutionfeetable`
  MODIFY `RegID` int(255) UNSIGNED NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
