
CREATE TABLE login_acesso
	(
		id_login int auto_increment NOT NULL,
		ult_acesso  datetime,
		dat_criacao  datetime,
		id_pessoa    int,
		nome_usuario varchar(50),
		senha varchar(15),
	    PRIMARY KEY(id_login)
	)