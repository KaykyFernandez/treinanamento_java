public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Hello, World!");
    }
}






/*1) Para promover o uso de energia limpa e sustentável, uma empresa desenvolveu um
sistema de monitoramento de painéis solares em residências. Esse sistema permite
acompanhar a geração de energia de cada painel e o consumo total da residência.
Implemente um sistema em Java utilizando Programação Orientada a Objetos (POO)
que modele a relação de Agregação entre uma Residência e seus Painéis Solares.
Requsitos:
Classe PainelSolar
• Atributos:

o id (identificador único do painel)
o potenciaGeracao (potência em kW gerada pelo painel)
• Método gerarEnergia(): retorna a potência gerada pelo painel.
Classe Residencia
• Atributos:
o endereco
o consumoEnergia (energia consumida pela residência em kW)
o Lista de Painéis Solares (relação de Agregação)
• Métodos:
o adicionarPainel(PainelSolar p): adiciona um painel à residência.
o calcularEnergiaGerada(): soma a energia gerada por todos os painéis.
o verificarConsumo(): informa se a energia gerada cobre o consumo da
residência.*/