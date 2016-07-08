package musiclist;

public class Musica {
    private String nome; 
    private int Id;
    
	Musica m = new Musica();
           m.setNome(nome);
		   
    public Musica(int Id,String nome){
     this.Id = Id;
     this.nome = nome;    
    }
    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
