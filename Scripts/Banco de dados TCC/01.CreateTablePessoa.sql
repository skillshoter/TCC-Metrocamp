USE [tkgs_cap]
GO

IF OBJECT_ID('[DBO].[pessoa]') IS NULL
BEGIN
	CREATE TABLE DBO.pessoa
	(
		id_pessoa int identity(1,1) NOT NULL,
		nome varchar(50),
		data_nasc datetime,
	    email varchar(150) not null,
		telefone bigint,
		bairro  varchar(100),
		cidade  varchar(50),
		cpf     varchar(11),--se 2 deve ser preenchido se 1 não
		estado  varchar(50),
		cnpj varchar(14), -- se 1 deve ser preenchido se 2 não
		tipo_pessoa  char(1),--1 ou 2 
		PRIMARY KEY(id_pessoa)
	)
END
GO
