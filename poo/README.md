
### Explicação:
- **ReprodutorMusical**: Interface com métodos para tocar, pausar e selecionar música.
- **AparelhoTelefonico**: Interface com métodos para ligar, atender e iniciar correio de voz.
- **NavegadorInternet**: Interface com métodos para exibir página, adicionar nova aba e atualizar página.
- **iPhone**: A classe `iPhone` implementa todas essas interfaces, agregando as funcionalidades.


```mermaid
classDiagram
    %% Interfaces que representam as funcionalidades
    class ReprodutorMusical {
        <<interface>>
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        <<interface>>
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        <<interface>>
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    %% Classe iPhone implementa todas as interfaces
    class iPhone {
    }

    %% Relacionamentos
    iPhone ..|> ReprodutorMusical
    iPhone ..|> AparelhoTelefonico
    iPhone ..|> NavegadorInternet
