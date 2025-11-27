document.querySelector(".criar-conta-btn").addEventListener("click", () => {
    const nome = document.getElementById("nome").value;
    const sobrenome = document.getElementById("sobrenome").value;
    const email = document.getElementById("email").value;
    const usuario = document.getElementById("usuario-cadastro").value;
    const senha = document.getElementById("senha-cadastro").value;

    const dados = new FormData();
    dados.append("nome", nome);
    dados.append("sobrenome", sobrenome);
    dados.append("email", email);
    dados.append("usuario", usuario);
    dados.append("senha", senha);

    fetch("http://localhost:8080/usuario", {
        method: "POST",
        body: dados
    }).then(resp => resp.text())
      .then(texto => alert(texto));
});
