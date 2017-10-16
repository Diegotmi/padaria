# padaria

Pra desenvolviemento do projeto foi utilizado os seguintes patters:
OBSERVER:foi implemento para cadastro de pedidos, onde uma notificação aparece em uma tela sempre que um novo pedido é cadastrado, assim sempre a cozinha será avisada de novos pedidos, o uso evita o pooling, economizando recursos computacionais.
COMPOSITE: é responsável pelo tratamento de igual entre todos os produtos, onde é permitido colocar mais de um em cada venda.
STRATEGE: define o tipo do pagamento, entre dinheiro e cartão.Pode  se ter como vantagem a trocar em tempo de execução, então a manutenção é mais fácil, quanto manutenção evolutiva e corretiva.
TEMPLATE: gera e define o tipo de relatorio que será criado,segue uma  sequência definida de passos, onde um pode variar, no entanto é seguida uma ordem, e tem facil manutenabilidade.

