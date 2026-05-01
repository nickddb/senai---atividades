//System.out.println("Hello World!")
console.log("Hello World!")

/*
Javascript != Java 
Javascript não tem relação com o Java.
Javascript usada primariamente para Navegadores WEB
(Chrome/Internet Explorer/ Edge/ Mozila ...)

TIPAGEM
Fortemente tipada => Java, C# => Passe os tipos de todas as variáveis (POO)
Fracamente tipada => Js, Python => Não exige tipo na declaração e manutenção das variáveis

//Java
int teste = 0;
teste = 10; ok
teste = "hello world!"  //string
Erro de tipagem: Você declarou inteiro, e passou um TIPO diferente

//JS
var teste = 0;
teste = "Hello World!"; ok
teste = true; ok
teste = null; ok

var/let => Para declarar valores variáveis
const => Para declarar valores constantes

Qual é a diferença entre atribuição e comparação?
atribuição é ATRIBUIR VALOR
comparação é COMPARAR VALOR
*/
const botao = document.getElementById("entrar")
const formulario = document.getElementById("loginForm")

formulario.addEventListener("submit" , (e)=>{
    //Lógica do que deve acontecer, vem aqui.
    e.preventDefault() //Impede da página recarregar

    //coletar os dados da tela
    const email = document.getElementById("email").value
    const senha = document.getElementById("senha").value
    
    //Validar email e senha
    if(email === "" || senha ===""){
        alert("Credenciais inválidas")
    }
    else{
        alert("Formulário Enviado!")
        console.log({
            email: email,
            senha: senha
        })
    }
})