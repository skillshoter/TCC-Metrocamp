
CREATE TABLE empresas
	(
		id_empresas int auto_increment NOT NULL,
		cnpj varchar(14), 
		desc_negocio varchar(1000),
		uso_masc bit,
		uso_distanciamento_min bit,
		uso_alc_gel     bit,
		uso_ambi_ventilado  bit,
		uso_aglomeracao bit,
		uso_medicao_temp bit,
		uso_agendamento_horario bit,
		PRIMARY KEY(id_empresas)
	)