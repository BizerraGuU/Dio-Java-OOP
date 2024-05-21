# Dio-Java-OOPclassDiagram
iPhone<|.. Funcionalidades

Funcionalidades <|-- ReprodutorMusical

ReprodutorMusical : tocarMusica() void
ReprodutorMusical : pausarMusica() void 
ReprodutorMusical : selecionarMusica(String musica) void

Funcionalidades <|-- AparelhoTelefonico

AparelhoTelefonico : ligar(String numero) void
AparelhoTelefonico : atender() void
AparelhoTelefonico :  iniciarCorreioVoz() void

Funcionalidades <|-- NavegadorInternet

NavegadorInternet : exibirPagina(String url) void
NavegadorInternet : adicionaNovaAba() void
NavegadorInternet : atualizarPagina() void







