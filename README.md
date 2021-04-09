# Java SDK para Integração Juno 

Projeto baseado na solução Juno Java SDK (https://github.com/tamojuno/integration-api-java-sdk)

# Requisitos
Java 11 ou superior

# Guia de uso
1. Baixar a versão atualizada do projeto em https://github.com/tamojuno/integration-api-java-sdk
2. Atualizar os arquivos da pasta src
3. Compilar o projeto 
```
mvn compile install
```
4. Dentro da pasta root do projeto clonar o projeto na pasta my-repository 
```
git clone https://github.com/zapclinic/zapjunoapi.git my-repository
```
5. Acessar a pasta my-repository
```
cd my-repository
```
5. Criar o branch repository (caso ele não exista) e acessa-lo
```
git branch repository
```
```
git checkout repository
```
6. Remover todos os arquivos da pasta my-repository
```
rm -rf file1 file2 file3 .. etc
```
7. Instalar o jar nesse diretório (my-repository)
```
mvn install:install-file -DgroupId=br.com.zapjuno -DartifactId=zapjunoapi -Dversion=1.0 -Dfile=/home/dev/Source/zapjunoapi/target/integration-api-java-sdk-1.0-SNAPSHOT.jar -Dpackaging=jar -DgeneratePom=true -DlocalRepositoryPath=.  -DcreateChecksum=true
```
8. Adicionar os arquivos, fazer o commit e push

```
git add -A . && git commit -m "released version X.Y.Z"
```
```
git push origin repository
```

Para maiores informações acessar o link: https://gist.github.com/fernandezpablo85/03cf8b0cd2e7d8527063
