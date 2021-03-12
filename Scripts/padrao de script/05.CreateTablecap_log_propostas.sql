USE [tkgs_cap]
GO

IF OBJECT_ID('[DBO].[cap_log_propostas]') IS NULL
BEGIN
	CREATE TABLE DBO.cap_log_propostas
	(
		id_log int identity(1,1) NOT NULL,
		cod_login_usr varchar(20),
		data_acao datetime,
		nm_acao_realizada varchar(50),
		cod_ctr_proposta int,
		PRIMARY KEY(id_log)
	)
END
GO
