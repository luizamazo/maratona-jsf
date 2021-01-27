package br.com.devdojo.maratonajsf.bean.estudante;

import br.com.devdojo.maratonajsf.model.Estudante;

import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

@Named
/**Beans são controllers; Essa classe agora é managed bean, gerenciado pelo CDI
 * pelo conteto de injeção de dependência; Que é quando o container (wildfly) vai instanciar a classe pra vc
 * não precisa se preocupar em dar new na classe pq como ele ta sendo gerenciado pelo CDI o wildfly eh responsavel por isso
 * wildfly instancia a classe e os atributos dessa classe
 */
public class EstudanteRegistrarBean implements Serializable {
    private Estudante estudante = new Estudante();
    private String[] nomesArray = {"Dev Dojo", "Rapaix", "vox"};
    private List<String> nomesList = asList("aaaa", "bbb", "cccc");
    private Set<String> nomesSet = new HashSet<>(asList("aff", "nao sei", "que isso", "aff"));
    private Map<String,String> nomesMap = new HashMap<>();

    {
        nomesMap.put("goku", "o mais forte");
        nomesMap.put("gohan", "its his son");

        /** onde entry eh a variavel do for, java puro**/
        for(Map.Entry<String,String> entry : nomesMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }
}
