public class ProjetoYouTube {
    public static void main(String[] args) {
        Video v[] = new Video[5];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula de conceitos de POO");
        v[2] = new Video("Aula de EHP, a base de POO");
        v[3] = new Video("Aula de Encapsulamento");
        v[4] = new Video("Aula de Herança e Polimorfismo");
        
        System.out.println(v[0].toString());
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Juliane", 33, "Feminino", "Ju");
        g[1] = new Gafanhoto("Fernando", 37, "Masculino, pingando testosterona", "Fer");
    }
    
}
