/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package economia;

/**
 *
 * @author Pirozzi
 */
public class Computer {
    
    private String nome;
    private float peso;
    private float prezzo;
    private String ram;
    private String cpu;
    private String gpu;
    private String schermo;
    private String autonomia;
    private String rumore;
    private int id;
    private int computer_fuzzy;
    private Double valut;
    
    
    public Double getValut() {
        return valut;
    }

    public void setValut(Double valut) {
        this.valut = valut;
    }
    
    public Computer(String nome, float peso, float prezzo, String ram, String cpu, String gpu, String schermo, String autonomia, String rumore, int id, int computer_fuzzy) {
        this.nome = nome;
        this.peso = peso;
        this.prezzo = prezzo;
        this.ram = ram;
        this.cpu = cpu;
        this.gpu = gpu;
        this.schermo = schermo;
        this.autonomia = autonomia;
        this.rumore = rumore;
        this.id = id;
        this.computer_fuzzy = computer_fuzzy;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getAutomia() {
        return autonomia;
    }

    public void setAutomia(String autonomia) {
        this.autonomia = autonomia;
    }

    public String getSchermo() {
        return schermo;
    }

    public void setSchermo(String schermo) {
        this.schermo = schermo;
    }

    public String getRumore() {
        return rumore;
    }

    public void setRumore(String rumore) {
        this.rumore = rumore;
    }

    public int getComputer_fuzzy() {
        return computer_fuzzy;
    }

    public void setComputer_fuzzy(int computer_fuzzy) {
        this.computer_fuzzy = computer_fuzzy;
    }
    

}
