//Selecionar os elementos HTML.
const input = document.getElementById("taskInput")
const botao = document.getElementById("addTaskBtn")
const lista = document.getElementById("taskList")
const mensagem = document.getElementById("emptyMessage")

//Funções
function atualizaMensagemVazio (){
    if(lista.children.length === 0){
        mensagem.style.display = "block"
    }
    else{
        mensagem.style.display = "none"
    }
}

function adicionarTarefa (){
    const tarefa = input.value

    if(tarefa == ""){
        alert("Tarefa inválida. Insira novamente.")
        return
    }  

    const li = document.createElement("li")
    const span = document.createElement("span")
    span.textContent = tarefa

    const botoes = document.createElement("div")
    botoes.classList.add("actions")

    const botaoCompletar = document.createElement("button")
    let defaultValue = "Ok"
    botaoCompletar.textContent = defaultValue
    botaoCompletar.classList.add("complete-btn")

    const botaoDeletar = document.createElement("button")
    botaoDeletar.textContent = "x"
    botaoDeletar.classList.add("delete-btn")

    botaoCompletar.addEventListener("click", () => {
        li.classList.toggle("completed")
        if(li.classList.value === "completed"){
            botaoCompletar.textContent = "Desmarcar"
        }else{
            botaoCompletar.textContent = defaultValue
        }
    })
    botaoDeletar.addEventListener("click", () =>{
        li.remove()
        atualizaMensagemVazio()
    })

    botoes.appendChild(botaoCompletar)
    botoes.appendChild(botaoDeletar)

    li.appendChild(span)
    li.appendChild(botoes)

    lista.append(li)

    input.value = ""
    atualizaMensagemVazio()
}


//Eventos
botao.addEventListener("click", adicionarTarefa )

//Ação em loop
atualizaMensagemVazio()