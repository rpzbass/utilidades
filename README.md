## Comandos do GIT  :suspect:

Criando repositorio local

```git
git init
```
Configurando usuario para utilização

```git
git config --global user.name  'seunome'
git config --global user.email 'seuemail@seuemail.com'
```
Após ter criado seu repositorio remotamente, crie um  alias para não digitar o endereço completo:

```git
git remote add origin <repositorio.git>
```
Conferindo o repositorio remoto adicionado:

```git
git remote -v 
```
Errei o diretório !!! ,  Ok é possível setar outro repositório:
```git
git remote set-url origin <repositorio_diferente.git>
```

Então após você se livrar da maldição, criando seu primeiro Programa  Ola mundo!, torne o arquivo rastreavel ao Git.
```git
git add .    
```
Verificando o status dos arquivos adicionados:
```git
git status     
```
Bom, agora podemos enviar esse arquivo para staged, criando um commit:
```git
git commit -m "Primeiro commit criado"     
```
Mudando a branch do mantenedor, de master para main:
```git
git branch -M main      
```
Enviando  para o repositorio do GitHub, apenas no primeiro envio é necessario o comando completo:
```git
git push -u origin main   1º 
git push   2º
```
Sincronizando como repositoro remoto adiantado:
```git
git pull origin main      
```
Forçando o envio , quando todas as esperanças estão perdidas:
```git
git -f push origin main
```
Clonando um repositório:
```git
git clone <repositorio.git>
```

**The end**


