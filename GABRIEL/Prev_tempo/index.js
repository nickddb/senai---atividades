//Selecionamos os elementos que iremos usar
const botao = document.getElementById('searchBtn')
const local = document.getElementById('placeInput')
const resultado = document.getElementById('results')

//Função
async function buscarClima() {
    const cidade = local.value
    const apiKey = "78a0ebbf843d1b3baeff34cc8374b721"

    //Endpoint
    const url = 
    `https://api.openweathermap.org/data/2.5/weather?q=${cidade}&appid=${apiKey}&units=metric&lang=pt_br` 

    //Requisição e Resposta
    const resposta = await fetch(url)
    const resposta_json = await resposta.json()
    console.log(resposta_json)
}

//Evento
botao.addEventListener("click", buscarClima)

