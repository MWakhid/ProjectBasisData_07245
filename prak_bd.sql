-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 24, 2022 at 06:32 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.4.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `prak_bd`
--

-- --------------------------------------------------------

--
-- Table structure for table `detail_dsn`
--

CREATE TABLE `detail_dsn` (
  `dsn_id` int(11) DEFAULT NULL,
  `mk_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `detail_dsn`
--

INSERT INTO `detail_dsn` (`dsn_id`, `mk_id`) VALUES
(1, 13),
(2, 5),
(3, 9),
(3, 10),
(5, 2),
(6, 8),
(7, 3),
(7, 4),
(8, 5),
(9, 8),
(10, 15),
(11, 8),
(12, 15),
(4, 1),
(15, 14);

-- --------------------------------------------------------

--
-- Table structure for table `detail_jadwal`
--

CREATE TABLE `detail_jadwal` (
  `jadwal_id` int(11) DEFAULT NULL,
  `ruang_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `detail_jadwal`
--

INSERT INTO `detail_jadwal` (`jadwal_id`, `ruang_id`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(5, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10),
(11, 11),
(12, 12),
(13, 13),
(14, 14),
(15, 15);

-- --------------------------------------------------------

--
-- Table structure for table `detail_matkul`
--

CREATE TABLE `detail_matkul` (
  `jadwal_id` int(11) DEFAULT NULL,
  `mk_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `detail_matkul`
--

INSERT INTO `detail_matkul` (`jadwal_id`, `mk_id`) VALUES
(1, 1),
(1, 2),
(2, 3),
(2, 13),
(3, 4),
(4, 5),
(5, 6),
(7, 7),
(8, 11),
(9, 12),
(10, 14),
(11, 9),
(12, 10),
(14, 15),
(15, 15);

-- --------------------------------------------------------

--
-- Table structure for table `detail_mhs`
--

CREATE TABLE `detail_mhs` (
  `mhs_id` int(11) DEFAULT NULL,
  `mk_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `detail_mhs`
--

INSERT INTO `detail_mhs` (`mhs_id`, `mk_id`) VALUES
(1, 9),
(1, 10),
(1, 15),
(1, 14);

-- --------------------------------------------------------

--
-- Table structure for table `dosen`
--

CREATE TABLE `dosen` (
  `id_dosen` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `nip` varchar(15) NOT NULL,
  `email` varchar(50) NOT NULL,
  `passdsn` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dosen`
--

INSERT INTO `dosen` (`id_dosen`, `nama`, `nip`, `email`, `passdsn`) VALUES
(1, 'andy rahman', '011125', 'andyrchmn@gmail.com', '123b'),
(2, 'tutuk indriyani', '001117', 'tutukindry@gmail.com', '123b'),
(3, 'farida', '112062', 'farida@gmail.com', '123b'),
(4, 'sugiyanto', '112064', 'sugiyanto@gmail.com', '123b'),
(5, 'rani rotul muhima', '153052', 'ranirtl@gmail.com', '123b'),
(6, 'rinci kembang hapsari', '133011', 'rincikmb@gmail.com', '123b'),
(7, 'nanang fakhrur rozi', '122093', 'nanangfkh@gmail.com', '123b'),
(8, 'maftahul hakimah', '154082', 'maftahkm@gmail.com', '123b'),
(9, 'danang haryo sulaksono', '153070', 'dananghry@gmail.com', '123b'),
(10, 'hendro nugroho', '153047', 'hendrogrh@gmail.com', '123b'),
(11, 'muchamad kurniawan', '153045', 'mkrnwan@gmail.com', '123b'),
(12, 'rahmi rizkiana putri', '173133', 'rahmirzk@gmail.com', '123b'),
(13, 'gusti eka yuliastuti', '193165', 'gustieka@gmail.com', '123b'),
(14, 'citra nurina prabiantissa', '193170', 'citranrn@gmail.com', '123b'),
(15, 'dian puspita hapsari', '153076', 'dianpspt@gmail.com', '123b');

-- --------------------------------------------------------

--
-- Table structure for table `jadwal`
--

CREATE TABLE `jadwal` (
  `id_jadwal` int(11) NOT NULL,
  `hari` varchar(6) DEFAULT NULL,
  `jam` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `jadwal`
--

INSERT INTO `jadwal` (`id_jadwal`, `hari`, `jam`) VALUES
(1, 'senin', '08:00:00'),
(2, 'senin', '10:50:00'),
(3, 'senin', '14:20:00'),
(4, 'selasa', '08:00:00'),
(5, 'selasa', '10:50:00'),
(7, 'selasa', '14:20:00'),
(8, 'rabu', '08:00:00'),
(9, 'rabu', '10:50:00'),
(10, 'rabu', '14:20:00'),
(11, 'kamis', '08:00:00'),
(12, 'kamis', '10:50:00'),
(13, 'kamis', '14:20:00'),
(14, 'jumat', '08:00:00'),
(15, 'jumat', '14:20:00');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `id_mhs` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `npm` varchar(15) NOT NULL,
  `email` varchar(50) NOT NULL,
  `passmhs` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`id_mhs`, `nama`, `npm`, `email`, `passmhs`) VALUES
(1, 'wakhid', '07245', 'wakhid111@gmail.com', '456'),
(3, 'lala agustina', '07246', 'lalaags@gmail.com', '123a'),
(4, 'asirwanda irawan', '07247', 'asirwandairw@gmail.com', '123a'),
(5, 'bakiadi utama', '07248', 'bakiadiutm@gmail.com', '123a'),
(6, 'najam mahendra', '07249', 'najammhd@gmail.com', '123a'),
(7, 'icha yulianti', '07250', 'ichaylnt@gmail.com', '123a'),
(8, 'alika zulaika', '07251', 'alikazlk@gmail.com', '123a'),
(9, 'puji suartini', '07252', 'pujisrtn@gmail.com', '123a'),
(10, 'abyasa thamrin', '07253', 'abyasathm@gmail.com', '123a'),
(11, 'luluh suwarno', '07254', 'luluhswr@gmail.com', '123a'),
(12, 'irma wastuti', '07255', 'irmawst@gmail.com', '123a'),
(13, 'ajimin salahudin', '07256', 'ajiminslhd@gmail.com', '123a'),
(14, 'diana pertiwi', '07257', 'dianaprtw@gmail.com', '123a'),
(15, 'carla aryani', '07258', 'carlaryn@gmail.com', '123a');

-- --------------------------------------------------------

--
-- Table structure for table `matkul`
--

CREATE TABLE `matkul` (
  `id_matkul` int(11) NOT NULL,
  `nama_mk` varchar(30) NOT NULL,
  `sks` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `matkul`
--

INSERT INTO `matkul` (`id_matkul`, `nama_mk`, `sks`) VALUES
(1, 'PAI', 2),
(2, 'kewarganegaraan', 2),
(3, 'fisika', 2),
(4, 'fisika(responsi)', 1),
(5, 'matematika diskrit', 3),
(6, 'struktur data', 3),
(7, 'struktur data(responsi)', 1),
(8, 'statistik komputasi', 3),
(9, 'basis data', 3),
(10, 'basis data(responsi)', 1),
(11, 'jaringan komputer', 3),
(12, 'jaringan komputer(responsi)', 1),
(13, 'rekayasa perangkat lunak', 3),
(14, 'otomata', 3),
(15, 'kecerdasan buatan', 3);

-- --------------------------------------------------------

--
-- Table structure for table `ruang`
--

CREATE TABLE `ruang` (
  `id_ruang` int(11) NOT NULL,
  `nama_ruang` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ruang`
--

INSERT INTO `ruang` (`id_ruang`, `nama_ruang`) VALUES
(1, 'A-101'),
(2, 'A-102'),
(3, 'A-103'),
(4, 'A-104'),
(5, 'A-105'),
(6, 'A-201'),
(7, 'A-202'),
(8, 'A-203'),
(9, 'A-204'),
(10, 'A-205'),
(11, 'B-101'),
(12, 'B-102'),
(13, 'B-103'),
(14, 'B-104'),
(15, 'B-105');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `detail_dsn`
--
ALTER TABLE `detail_dsn`
  ADD KEY `fk_detail_dsn_dsn` (`dsn_id`),
  ADD KEY `fk_detail_matkul_mk` (`mk_id`);

--
-- Indexes for table `detail_jadwal`
--
ALTER TABLE `detail_jadwal`
  ADD KEY `fk_ruang` (`ruang_id`),
  ADD KEY `fk_detail_jadwal_jadwal` (`jadwal_id`);

--
-- Indexes for table `detail_matkul`
--
ALTER TABLE `detail_matkul`
  ADD KEY `fk_jadwal` (`jadwal_id`),
  ADD KEY `fk_detail_matkul_mk` (`mk_id`);

--
-- Indexes for table `detail_mhs`
--
ALTER TABLE `detail_mhs`
  ADD KEY `fk_detail_mhs_mhs` (`mhs_id`),
  ADD KEY `fk_detail_mhs_mk` (`mk_id`);

--
-- Indexes for table `dosen`
--
ALTER TABLE `dosen`
  ADD PRIMARY KEY (`id_dosen`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `jadwal`
--
ALTER TABLE `jadwal`
  ADD PRIMARY KEY (`id_jadwal`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`id_mhs`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `matkul`
--
ALTER TABLE `matkul`
  ADD PRIMARY KEY (`id_matkul`);

--
-- Indexes for table `ruang`
--
ALTER TABLE `ruang`
  ADD PRIMARY KEY (`id_ruang`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dosen`
--
ALTER TABLE `dosen`
  MODIFY `id_dosen` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `jadwal`
--
ALTER TABLE `jadwal`
  MODIFY `id_jadwal` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  MODIFY `id_mhs` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `matkul`
--
ALTER TABLE `matkul`
  MODIFY `id_matkul` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `ruang`
--
ALTER TABLE `ruang`
  MODIFY `id_ruang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `detail_dsn`
--
ALTER TABLE `detail_dsn`
  ADD CONSTRAINT `fk_detail_dsn_dsn` FOREIGN KEY (`dsn_id`) REFERENCES `dosen` (`id_dosen`),
  ADD CONSTRAINT `fk_detail_dsn_mk` FOREIGN KEY (`mk_id`) REFERENCES `matkul` (`id_matkul`);

--
-- Constraints for table `detail_jadwal`
--
ALTER TABLE `detail_jadwal`
  ADD CONSTRAINT `fk_detail_jadwal_jadwal` FOREIGN KEY (`jadwal_id`) REFERENCES `jadwal` (`id_jadwal`),
  ADD CONSTRAINT `fk_ruang` FOREIGN KEY (`ruang_id`) REFERENCES `ruang` (`id_ruang`);

--
-- Constraints for table `detail_matkul`
--
ALTER TABLE `detail_matkul`
  ADD CONSTRAINT `fk_detail_matkul_mk` FOREIGN KEY (`mk_id`) REFERENCES `matkul` (`id_matkul`),
  ADD CONSTRAINT `fk_jadwal` FOREIGN KEY (`jadwal_id`) REFERENCES `jadwal` (`id_jadwal`);

--
-- Constraints for table `detail_mhs`
--
ALTER TABLE `detail_mhs`
  ADD CONSTRAINT `fk_detail_mhs_mhs` FOREIGN KEY (`mhs_id`) REFERENCES `mahasiswa` (`id_mhs`),
  ADD CONSTRAINT `fk_detail_mhs_mk` FOREIGN KEY (`mk_id`) REFERENCES `matkul` (`id_matkul`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
