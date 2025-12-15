const telaLogin = document.querySelector(".overlay-login");
const telaCadastro = document.querySelector(".overlay-cadastro");

const btnCriarConta = document.querySelector(".cadastro-btn");
const btnCancelar = document.querySelector(".cancelar-btn");
const btnLogin = document.querySelector(".login-btn");

// Abrir tela de cadastro
btnCriarConta.addEventListener("click", () => {
    telaLogin.style.display = "none";
    telaCadastro.style.display = "flex";
});

// Voltar para tela de login
btnCancelar.addEventListener("click", () => {
    telaCadastro.style.display = "none";
    telaLogin.style.display = "flex";
});

// Faz login
btnLogin.addEventListener("click", () => {
    telaCadastro.style.display = "none";
    telaLogin.style.display = "none";
});

