const lista = [
    { nome: "João", idade: 25, ehAdmin: true, email: "joao@gmail.com" },
    { nome: "Maria", idade: 30, ehAdmin: false, email: "maria@gmail.com" },
    { nome: "Pedro", idade: 20, ehAdmin: false, email: "pedro@gmail.com" },
    { nome: "Ana", idade: 35, ehAdmin: true, email: "ana@gmail.com" },
    { nome: "Lucas", idade: 28, ehAdmin: false, email: "lucas@gmail.com" }
];

for (let i = 0; i < lista.length; i++) {
    const pessoa = lista[i];
    if (pessoa.ehAdmin) {
        console.log(`Olá ${pessoa.nome}! Bem vindo(a) você é admin do sistema, enviamos um email para ${pessoa.email} para você criar uma senha.`);
    } else {
        console.log(`Olá ${pessoa.nome}! Bem vindo(a) você não é admin do sistema, enviamos um email para ${pessoa.email} para você criar uma senha.`);
    }
}
