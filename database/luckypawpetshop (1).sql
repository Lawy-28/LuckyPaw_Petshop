-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 19, 2025 at 03:24 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `luckypawpetshop`
--

-- --------------------------------------------------------

--
-- Table structure for table `datagroming`
--

CREATE TABLE `datagroming` (
  `code_groming` int(11) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `tanggal` date NOT NULL,
  `alamat` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `datagroming`
--

INSERT INTO `datagroming` (`code_groming`, `nama`, `tanggal`, `alamat`) VALUES
(1, 'TupaiGanteng', '2025-06-19', 'jl. Tupai'),
(2, 'abuaqila', '2025-06-04', 'Jl. abuabu');

-- --------------------------------------------------------

--
-- Table structure for table `dataluckypawpetshop`
--

CREATE TABLE `dataluckypawpetshop` (
  `id` int(11) NOT NULL,
  `Emailaddress` varchar(30) NOT NULL,
  `Username` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dataluckypawpetshop`
--

INSERT INTO `dataluckypawpetshop` (`id`, `Emailaddress`, `Username`, `Password`) VALUES
(1, 'tupai@gmail.com', 'tupai', 'qqqqqqqq'),
(2, 'abu@gmail.com', 'abu', '12345678');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `datagroming`
--
ALTER TABLE `datagroming`
  ADD PRIMARY KEY (`code_groming`);

--
-- Indexes for table `dataluckypawpetshop`
--
ALTER TABLE `dataluckypawpetshop`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `datagroming`
--
ALTER TABLE `datagroming`
  MODIFY `code_groming` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `dataluckypawpetshop`
--
ALTER TABLE `dataluckypawpetshop`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `datagroming`
--
ALTER TABLE `datagroming`
  ADD CONSTRAINT `datagroming_ibfk_1` FOREIGN KEY (`code_groming`) REFERENCES `dataluckypawpetshop` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
