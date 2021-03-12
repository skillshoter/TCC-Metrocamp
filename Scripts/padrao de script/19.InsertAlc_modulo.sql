USE [tkgs_cap]
GO

IF NOT EXISTS
(
	SELECT
		alm.*
	FROM
		DBO.alc_modulo alm
	WHERE
		alm.cod_modul = '1514'		
)
BEGIN
INSERT INTO [dbo].[alc_modulo]
           ([cod_sist]
           ,[cod_modul]
           ,[tip_modul]
           ,[dcr_modul]
           ,[dcr_func_modul]
           ,[dcr_tecla]
           ,[dcr_msg]
           ,[sts_modul]
           ,[cod_modul_ant]
           ,[dta_incl]
           ,[dta_alt]
           ,[nom_usr_incl]
           ,[nom_usr_alt])
     VALUES
           ('06',
            '1514',
            null,
            'Relatório de Usuarios',
            '..\..\tkgs_cap\Relatorios\frmRelatoriosDinamicos.aspx',
            null,
            null,
            'A',
            '1511',
            GETDATE(),
            null,
            'admin',
            null)
END

