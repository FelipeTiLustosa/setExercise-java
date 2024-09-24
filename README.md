# Exercícios usando Set em java

### Exercício 1 - Log de acessos de usuários distintos

Um site de internet registra um log de acessos dos usuários. Um registro de log consiste no nome de usuário (apenas uma palavra) e o instante em que o usuário acessou o site no padrão ISO 8601, separados por espaço, conforme exemplo. Fazer um programa que leia o log de acessos a partir de um arquivo, e daí informe quantos usuários distintos acessaram o site. 

**Exemplo:** <br>
amanda 2018-08-26T20:45:08Z <br>
alex86 2018-08-26T21:49:37Z <br>
bobbrown 2018-08-27T03:19:13Z <br>
amanda 2018-08-27T08:11:00Z <br>
jeniffer3 2018-08-27T09:19:24Z <br>
alex86 2018-08-27T22:39:52Z <br>
amanda 2018-08-28T07:42:19Z <br>

**Arquivo de entrada:** <br>
Enter file full path: c:\temp\in.txt <br>

**Saída esperada:** <br>
Total users: 4 <br>

---

### Exercício 2 - Total de alunos sem repetição

Em um portal de cursos online, cada usuário possui um código único, representado por um número inteiro. Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se matricular em quantos cursos quiser. Assim, o número total de alunos de um instrutor não é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver alunos repetidos em mais de um curso.

O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos. Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a quantidade total de alunos dele, conforme exemplo. 

**Exemplo:** <br>
How many students for course A? 3 <br>
21 <br>
35 <br>
22 <br>

How many students for course B? 2 <br>
21 <br>
50 <br>

How many students for course C? 3 <br>
42 <br>
35 <br>
13 <br>

**Saída esperada:** <br>
Total students: 6 <br>

