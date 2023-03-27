
-- Copiando estrutura para tabela rest_with_spring_boot_erudio.person
 CREATE TABLE IF NOT EXISTS `person` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `firts_name` varchar(80) NOT NULL,
  `last_name` varchar(80) NOT NULL,
  `addres` varchar(100) NOT NULL,
  `gender` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) 

