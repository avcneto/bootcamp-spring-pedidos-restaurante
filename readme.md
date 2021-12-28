#Adicionar uma mesa
curl --location --request POST 'http://localhost:8080/salvamesa' \

{
"id": 1,\
"pedidos": [\
{\
"id": 1,\
"idMesa": 1,\
"pratos": [\
\{ "id": 1, "preco": 30.0, "descricao": "Frango", "quantidade": 1 },\
{ "id": 2, "preco": 50.0, "descricao": "Carne", "quantidade": 1 }
]\
},\
{\
"id": 2,\
"idMesa": 1,\
"pratos": [\
{ "id": 3, "preco": 5.0, "descricao": "refrigerante", "quantidade": 1 }
]\
}\
]\
}

#Fechando mesa
curl --location --request PUT 'http://localhost:8080/fecharpedido'

{
"id": 1
}

#Consultar pedido
curl --location --request GET 'localhost:8080/consultapedido/1'

#Consulta valor em caixa
curl --location --request GET 'localhost:8080/consultacaixa'

