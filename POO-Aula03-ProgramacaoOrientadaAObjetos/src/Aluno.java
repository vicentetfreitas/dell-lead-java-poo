
public class Aluno {
	private String nome;
	private Float media;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		if (media >= 0 && media <= 10) {
			this.media = media;
		}
	}
}
