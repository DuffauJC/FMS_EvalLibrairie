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
  `date` datetime,
  `idCustomer` int
);

CREATE TABLE `books` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `title` varchar(255),
  `unitaryPrice` double,
  `descritpion` varchar(255),
  `publishing_house` varchar(255),
  `state` varchar(255),
  `author` varchar(255)
);

CREATE TABLE `thematics` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255),
  `description` varchar(255)
);

CREATE TABLE `assoc_books_thematics` (
  `idBook` int,
  `idThematic` int
);

CREATE TABLE `categories` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255),
  `description` varchar(255)
);

CREATE TABLE `assoc_books_categories` (
  `idBook` int,
  `idCategory` int
);

ALTER TABLE `orderLines` ADD FOREIGN KEY (`idBook`) REFERENCES `books` (`id`);

ALTER TABLE `orders` ADD FOREIGN KEY (`idCustomer`) REFERENCES `customers` (`id`);

ALTER TABLE `orderLines` ADD FOREIGN KEY (`idOrder`) REFERENCES `orders` (`id`);

ALTER TABLE `assoc_books_thematics` ADD FOREIGN KEY (`idBook`) REFERENCES `books` (`id`);

ALTER TABLE `assoc_books_categories` ADD FOREIGN KEY (`idBook`) REFERENCES `books` (`id`);

ALTER TABLE `assoc_books_categories` ADD FOREIGN KEY (`idCategory`) REFERENCES `categories` (`id`);

ALTER TABLE `assoc_books_thematics` ADD FOREIGN KEY (`idThematic`) REFERENCES `thematics` (`id`);
