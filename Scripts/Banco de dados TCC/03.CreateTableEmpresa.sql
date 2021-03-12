USE [tkgs_cap]
GO

IF OBJECT_ID('[DBO].[empresas]') IS NULL
BEGIN
	CREATE TABLE DBO.empresas
	(
		id_empresas int identity(1,1) NOT NULL,
		cnpj varchar(14), 
		desc_negocio varchar(1000),
		uso_masc bit,
		uso_distanciamento_min bit,
		uso_alc_gel     bit,
		uso_ambi_ventilado  bit,
		uso_aglomeracao bit,--pontos negativos
		uso_medicao_temp bit,
		uso_agendamento_horario bit
		PRIMARY KEY(id_empresas)
	)
END
GO
