
public abstract class OrientacaoTreinamento {
	
	public void obterOrientacoes() {
		aquecimento();
		fundamentos();
		preHidratacao();
		posHidratacao();
		recreacao();
	}
	
	protected abstract void aquecimento();
	
	protected abstract void fundamentos();
	
	protected void preHidratacao() {
		System.out.println("PRE-HIDRATACAO:");
		System.out.println("ingerir aproximadamente 500 a 600mL de �gua ou outra bebida esportiva duas a tr�s horas antes do exerc�cio e 200 a 300mL 10 a 20 minutos antes do exerc�cio");
	}
	
	protected abstract void atividadeAerobica();
	
	protected void posHidratacao() {
		System.out.println("POS-HIDRATACAO:");
		System.out.println("Continue ingerindo liquidos.");
	}
	
	protected void recreacao() {
		System.out.println("RECREACAO:");
		System.out.println("Busque realizar atividades relaxantes");
	}
}
