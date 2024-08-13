public class Curso extends Conteudo {

    private int cargaHoararia;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoararia;
    }

    public Curso() {
    }

    public int getCargaHoararia() {
        return cargaHoararia;
    }

    public void setCargaHoararia(int cargaHoararia) {
        this.cargaHoararia = cargaHoararia;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoararia=" + cargaHoararia +
                '}';
    }


}
