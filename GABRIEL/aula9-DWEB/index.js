const botao = document.getElementById("entrar")
const form = document.getElementById("loginForm")

form.addEventListener("submit", (e) => {
    e.preventDefault()

    const email = document.getElementById("email").value
    const senha = document.getElementById("senha").value

    if(email === "" || senha === ""){
        alert("Erro na validação!")
    }
    else{
        alert("Formulário enviado!")
        console.log({
            email: email,
            senha: senha
    })
    }
})