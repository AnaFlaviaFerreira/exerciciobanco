CREATE TABLE `cliente` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `dataNascimento` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1

CREATE TABLE `conta` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `saldo` varchar(100) NOT NULL,
  `numero` varchar(100) NOT NULL,
  `cliente` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY ( `idcliente` ) REFERENCES `cliente` ( `cliente` )
) ENGINE=InnoDB DEFAULT CHARSET=latin1