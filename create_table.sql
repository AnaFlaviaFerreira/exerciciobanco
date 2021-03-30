/*
  Usuário:lagi
  Senha:lagi
*/

CREATE TABLE `cliente` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `dataNascimento` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1

CREATE TABLE `conta` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `saldo` double NOT NULL,
  `numero` varchar(100) NOT NULL,
  `idcliente` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY ( `idcliente` ) REFERENCES `cliente` ( `id` )
) ENGINE=InnoDB DEFAULT CHARSET=latin1

CREATE TABLE `contacorrente` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `idconta` bigint(20) NOT NULL,
  `limite` double NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY ( `idconta` ) REFERENCES `conta` ( `id` )
) ENGINE=InnoDB DEFAULT CHARSET=latin1

CREATE TABLE `contapoupança` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `idconta` bigint(20) NOT NULL,
  `dataAniversario` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY ( `idconta` ) REFERENCES `conta` ( `id` )
) ENGINE=InnoDB DEFAULT CHARSET=latin1