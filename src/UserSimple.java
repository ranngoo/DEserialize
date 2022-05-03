public class UserSimple {
    private String imie;
    private int liczba;
    private String cpu;
    private String gpu;
    private boolean isProgrammer;

    public UserSimple(String imie, int liczba, String cpu, String gpu, boolean isProgrammer){
        this.imie = imie;
        this.liczba = liczba;
        this.cpu = cpu;
        this.gpu = gpu;
        this.isProgrammer = isProgrammer;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getLiczba() {
        return liczba;
    }

    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public boolean isProgrammer() {
        return isProgrammer;
    }

    public void setProgrammer(boolean programmer) {
        isProgrammer = programmer;
    }

    @Override
    public String toString() {
        return "UserSimple{" +
                "imie='" + imie + '\'' +
                ", liczba=" + liczba +
                ", cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", isProgrammer=" + isProgrammer +
                '}';
    }
}
