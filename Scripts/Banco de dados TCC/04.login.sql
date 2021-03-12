USE [tkgs_cap]
GO

IF OBJECT_ID('[DBO].[login_acesso]') IS NULL
BEGIN
	CREATE TABLE DBO.login_acesso
	(
		id_login int identity(1,1) NOT NULL,
		ult_acesso  datetime,
		dat_criacao  datetime,
		id_pessoa    int,
		nome_usuario varchar(50),
		senha varchar(15),
	    PRIMARY KEY(id_login)
	)
END
GO
