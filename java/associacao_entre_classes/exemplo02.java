package associacao_entre_classes;


class Funcionario{
    private String nome;
    private String cargo;
    
    public Funcionario(String nome, String cargo){
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }
    public String getCargo() {
        return cargo;
    }
}

class Departamento{
    private String nomeDepartamento;
    private Funcionario[] funcionarios;
    private int numFuncionarios;
    
    public Departamento(String nome){
        this.nomeDepartamento = nome;
        this.funcionarios = new Funcionario[10];
        this.numFuncionarios = 0;
    }
    
    public void addFuncionario(Funcionario funcionario){
        funcionarios[numFuncionarios] = funcionario;
        numFuncionarios++;
    }
    
    public void mostraInformacoes(){
        System.out.println("Departamento: " + this.nomeDepartamento);
        
        for(int i = 0; i < numFuncionarios; i++){
            System.out.println("Nome Funcionario: " + funcionarios[i].getNome() + " - " + funcionarios[i].getCargo());
        }
        
    }
}

class Empresa{
    private String nomeEmpresa;
    private Departamento[] departamentos;
    private int numDepartamentos;

    public Empresa(String nome){
        this.nomeEmpresa = nome;
        this.departamentos = new Departamento[10];
        this.numDepartamentos = 0;
    }

    public void adicionarDepartamento(Departamento departamento){

        departamentos[numDepartamentos] = departamento;
        numDepartamentos++;

    }

    public void mostraInformacoes(){

        System.out.println("Empresa: " + this.nomeEmpresa );

        for(int i = 0; i < numDepartamentos; i++){

            departamentos[i].mostraInformacoes();


        }

    }

}


class exemplo02_associacao_entre_classes {
    public static void main(String[] args){

    }
}