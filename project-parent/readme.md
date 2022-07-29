# Projeto multi-módulo

## Criar um projeto mãe
```shell
    mvn archetype:generate -DgroupId=com.mqds -DartifactId=projeto-principal -Darchetype=maven-quick-start -DinteractiveMode=false
```
- Abrir arquivo `pom.xml` incluir o `packaging` na propriedade `project`.
```xml
    <project>
        ...
        <packaging>pom</packaging>
        ...
    </project>
```
## Criar projetos dentro do projeto mãe
    Ao criar projeto filho, você pode informar outros `archetype`, aqui no exemplo estou utilizando o archetype padrão.
```shell
    mvn archetype:generate -DgroupId=com.mqds -DartifactId=primeiro-modulo -Darchetype=maven-quick-start -DinteractiveMode=false
    mvn archetype:generate -DgroupId=com.mqds -DartifactId=segundo-modulo -Darchetype=maven-quick-start -DinteractiveMode=false
```
Ao ser criado o módulo interno ao projeto-principal, o pom.xml deste módulo constará as informações do projeto-principal na propriedade `project`, conforme exemplo abaixo.
```xml
    <project>
        ...
        <parent>
            <groupId>com.mqds.aprendizado</groupId>
            <artifactId>projeto-principal</artifactId>
            <version>1.0</version>
        </parent>
        ...
    </project>
```
