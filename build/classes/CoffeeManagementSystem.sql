-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: amans-webserver.cel7s2vhdev5.ap-south-1.rds.amazonaws.com:3306
-- Generation Time: Nov 24, 2020 at 09:06 PM
-- Server version: 8.0.17
-- PHP Version: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `CoffeeManagementSystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `cardtransaction`
--

CREATE TABLE `cardtransaction` (
  `id` varchar(10) NOT NULL,
  `datetime` date DEFAULT NULL,
  `item_purchased` varchar(500) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `card_type` varchar(7) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `cardtransaction`
--

INSERT INTO `cardtransaction` (`id`, `datetime`, `item_purchased`, `price`, `card_type`) VALUES
('Si:107475', '2020-11-25', 'Simple Coffee, Special Coffee, tea, ', 110, 'Visa'),
('Si:234162', '2020-11-25', 'Simple Coffee, tea, ', 80, 'Master');

-- --------------------------------------------------------

--
-- Table structure for table `cashtransaction`
--

CREATE TABLE `cashtransaction` (
  `id` varchar(10) NOT NULL,
  `datetime` date DEFAULT NULL,
  `item_purchased` varchar(500) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `amount_tendered` int(11) DEFAULT NULL,
  `change_given` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `inventry`
--

CREATE TABLE `inventry` (
  `id` varchar(10) NOT NULL,
  `item` varchar(100) DEFAULT NULL,
  `price` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `inventry`
--

INSERT INTO `inventry` (`id`, `item`, `price`) VALUES
('1', 'Simple Coffee', 10),
('2', 'Special Coffee', 20),
('3', 'tea', 20),
('4', 'simple tea', 32),
('co:98501', 'coffee11', 30);

-- --------------------------------------------------------

--
-- Table structure for table `pendingtransaction`
--

CREATE TABLE `pendingtransaction` (
  `id` varchar(10) NOT NULL,
  `item` varchar(500) DEFAULT NULL,
  `price` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cardtransaction`
--
ALTER TABLE `cardtransaction`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `cashtransaction`
--
ALTER TABLE `cashtransaction`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `inventry`
--
ALTER TABLE `inventry`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `item` (`item`);

--
-- Indexes for table `pendingtransaction`
--
ALTER TABLE `pendingtransaction`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
