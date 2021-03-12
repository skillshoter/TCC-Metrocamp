USE [tkgs_cap]
GO

IF OBJECT_ID('[DBO].[tipo_pessoa]') IS NULL
BEGIN
	CREATE TABLE DBO.tipo_pessoa
	(
		id_tipo_pessoa int identity(1,1) NOT NULL,
		desc_pessoa varchar(50),--juridica ou privada
		tipo_pessoa char(1) --1 ou 2
		PRIMARY KEY(id_tipo_pessoa)
	)
END
GO
