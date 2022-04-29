CREATE TABLE `customers` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255),
  `firstName` varchar(255),
  `adress` varchar(255),
  `mail` varchar(255),
  `phone` int
);

CREATE TABLE `orderLines` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `idBook` int,
  `quantity` int,
  `unitaryPrice` double,
  `idOrder` int
);

CREATE TABLE `orders` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `amountTotal` double,
  `date` date, NOT NULL DEFAULT NOW(),
  `idCustomer` int 
);

CREATE TABLE `books` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `title` varchar(255),
  `unitaryPrice` double,
  `descritpion` varchar(255),
  `publishing_house` varchar(255),
  `thematic_1` int,
  `thematic_2` int,
  `thematic_3` int,
  `thematic_4` int,
  `state` varchar(255),
  `author` varchar(255)
);

CREATE TABLE `thematics` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255),
  `description` varchar(255)
);

ALTER TABLE `orderLines` ADD FOREIGN KEY (`idBook`) REFERENCES `books` (`id`);

ALTER TABLE `orders` ADD FOREIGN KEY (`idCustomer`) REFERENCES `customers` (`id`);

ALTER TABLE `orderLines` ADD FOREIGN KEY (`idOrder`) REFERENCES `orders` (`id`);

ALTER TABLE `thematics` ADD FOREIGN KEY (`id`) REFERENCES `books` (`thematic_1`);

ALTER TABLE `thematics` ADD FOREIGN KEY (`id`) REFERENCES `books` (`thematic_2`);

ALTER TABLE `thematics` ADD FOREIGN KEY (`id`) REFERENCES `books` (`thematic_3`);

ALTER TABLE `thematics` ADD FOREIGN KEY (`id`) REFERENCES `books` (`thematic_4`);
