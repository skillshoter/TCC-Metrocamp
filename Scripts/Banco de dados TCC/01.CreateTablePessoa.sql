
    CREATE TABLE pessoa
    (
        id_pessoa int AUTO_INCREMENT NOT NULL,
        nome varchar(50),
        data_nasc datetime,
        email varchar(150) not null,
        telefone bigint,
        bairro  varchar(100),
        cidade  varchar(50),
        estado  varchar(50),
		cpf     varchar(11),
		cep     varchar(8),
        cnpj varchar(14), -- se 1 deve ser preenchido se 2 não
        tipo_pessoa  char(1),
        PRIMARY KEY(id_pessoa)
    )