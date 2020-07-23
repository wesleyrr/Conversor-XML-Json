package br.gov.cvm.conversor.jsontemplates;

public class JsonTemplate {
		
	public static final String TEMPLATE_PASTA = "{\r\n" + 
			"    \"_IDisableSmartFacets\": false, \r\n" + 
			"    \"_IDontInheritConfiguration\": false, \r\n" + 
			"    \"_IFacetedNavigable\": false, \r\n" + 
			"    \"_IFacetedSearchMode\": false, \r\n" + 
			"    \"_IHidePloneLeftColumn\": false, \r\n" + 
			"    \"_IHidePloneRightColumn\": false, \r\n" + 
			"    \"_IInheritConfiguration\": false, \r\n" + 
			"    \"_ac_local_roles\": {\r\n" + 
			"        \"admin\": [\r\n" + 
			"            \"Owner\"\r\n" + 
			"        ], \r\n" + 
			"        \"@nomepasta\": [\r\n" + 
			"            \"Contributor\", \r\n" + 
			"            \"Reviewer\", \r\n" + 
			"            \"Editor\", \r\n" + 
			"            \"Reader\"\r\n" + 
			"        ]\r\n" + 
			"    }, \r\n" + 
			"    \"_annotations\": {}, \r\n" + 
			"    \"_content_type\": \"text/plain\", \r\n" + 
			"    \"_export_content_version\": \"1.11.9\", \r\n" + 
			"    \"_govbr_transmogrifier_import_specification_version\": \"0.1.0\", \r\n" + 
			"    \"_owner\": [\r\n" + 
			"        1, \r\n" + 
			"        \"admin\"\r\n" + 
			"    ], \r\n" + 
			"    \"_path\": \"/Plone/pt-br/@localpasta\", \r\n" + 
			"    \"_properties\": [\r\n" + 
			"        [\r\n" + 
			"            \"title\", \r\n" + 
			"            \"@nomepasta\", \r\n" + 
			"            \"string\"\r\n" + 
			"        ]\r\n" + 
			"    ], \r\n" + 
			"    \"_type\": \"Folder\", \r\n" + 
			"    \"_uid\": \"@uid\", \r\n" + 
			"    \"_workflow_history\": {\r\n" + 
			"        \"simple_publication_workflow\": [\r\n" + 
			"            {\r\n" + 
			"                \"action\": null, \r\n" + 
			"                \"actor\": \"admin\", \r\n" + 
			"                \"comments\": \"\", \r\n" + 
			"                \"review_state\": \"private\", \r\n" + 
			"                \"time\": \"@data_atual\"\r\n" + 
			"            }, \r\n" + 
			"            {\r\n" + 
			"                \"action\": \"publish\", \r\n" + 
			"                \"actor\": \"admin\", \r\n" + 
			"                \"comments\": \"\", \r\n" + 
			"                \"review_state\": \"published\", \r\n" + 
			"                \"time\": \"@data_atual\"\r\n" + 
			"            }\r\n" + 
			"        ]\r\n" + 
			"    }, \r\n" + 
			"    \"allow_discussion\": false, \r\n" + 
			"    \"contributors\": [\r\n" + 
			"        \"\"\r\n" + 
			"    ], \r\n" + 
			"    \"creation_date\": \"@data_atual\", \r\n" + 
			"    \"creators\": [\r\n" + 
			"        \"admin\"        \r\n" + 
			"    ], \r\n" + 
			"    \"description\": \"@descricao\", \r\n" + 
			"    \"effective\": \"@data_atual\", \r\n" + 
			"    \"exclude_from_nav\": false, \r\n" + 
			"    \"expires\": null, \r\n" + 
			"    \"id\": \"@nomepasta\", \r\n" + 
			"    \"language\": \"pt-br\", \r\n" + 
			"    \"modification_date\": \"@data_atual\", \r\n" + 
			"    \"rights\": \"\", \r\n" + 
			"    \"subjects\": [\r\n" + 
			"        \"\"\r\n" + 
			"    ], \r\n" + 
			"    \"title\": \"@descricao\"\r\n" + 
			"}";
	
	public static final String TEMPLATE_NOTICIA = "{\r\n" + 
			"    \"_ac_local_roles\": {\r\n" + 
			"        \"admin\": [\r\n" + 
			"            \"Owner\"\r\n" + 
			"        ]\r\n" + 
			"    }, \r\n" + 
			"    \"_content_type\": \"text/plain\", \r\n" + 
			"    \"_export_content_version\": \"1.11.9\", \r\n" + 
			"    \"_govbr_transmogrifier_import_specification_version\": \"0.1.0\", \r\n" + 
			"    \"_owner\": [\r\n" + 
			"        1, \r\n" + 
			"        \"admin\"\r\n" + 
			"    ], \r\n" + 
			"    \"_path\": \"/Plone/pt-br/assuntos/noticias/@link_amigavel\", \r\n" + 
			"    \"_properties\": [\r\n" + 
			"        [\r\n" + 
			"            \"title\", \r\n" + 
			"            \"@titulo_noticia\", \r\n" + 
			"            \"string\"\r\n" + 
			"        ]\r\n" + 
			"    ], \r\n" + 
			"    \"_type\": \"collective.nitf.content\", \r\n" + 
			"    \"_uid\": \"@uid\", \r\n" + 
			"    \"_workflow_history\": {\r\n" + 
			"        \"simple_publication_workflow\": [\r\n" + 
			"            {\r\n" + 
			"                \"action\": null, \r\n" + 
			"                \"actor\": \"admin\", \r\n" + 
			"                \"comments\": \"\", \r\n" + 
			"                \"review_state\": \"private\", \r\n" + 
			"                \"time\": \"@data_atual\"\r\n" + 
			"            }, \r\n" + 
			"            {\r\n" + 
			"                \"action\": \"publish\", \r\n" + 
			"                \"actor\": \"admin\", \r\n" + 
			"                \"comments\": \"\", \r\n" + 
			"                \"review_state\": \"published\", \r\n" + 
			"                \"time\": \"@data_publicacao\"\r\n" + 
			"            }\r\n" + 
			"        ]\r\n" + 
			"    }, \r\n" + 
			"    \"allow_discussion\": false, \r\n" + 
			"    \"byline\": \"\", \r\n" + 
			"    \"contributors\": [], \r\n" + 
			"    \"creation_date\": \"@data_atual\", \r\n" + 
			"    \"creators\": [\r\n" + 
			"        \"admin\"\r\n" + 
			"    ], \r\n" + 
			"    \"description\": \"\", \r\n" + 
			"    \"effective\": \"@data_atual\", \r\n" + 
			"    \"exclude_from_nav\": false, \r\n" + 
			"    \"expires\": null, \r\n" + 
			"    \"id\": \"@link_amigavel\", \r\n" + 
			"    \"language\": \"pt-br\", \r\n" + 
			"    \"location\": \"\", \r\n" + 
			"    \"modification_date\": \"@data_atual\", \r\n" + 
			"    \"rights\": \"\", \r\n" + 
			"    \"section\": \"Notícias\", \r\n" + 
			"    \"subjects\": [], \r\n" + 
			"    \"subtitle\": \"@subtitulo\", \r\n" + 
			"    \"text\": \"@texto_noticia\", \r\n" +   
			"    \"title\": \"@titulo_noticia\",\r\n" + 
			"    \"idConteudo\": \"@idConteudo\",\r\n" +
			" \"relatedItems\": [\r\n" + 
			"        \"@relateditems\"\r\n" + 
			"    ] " +
			"}";
}
