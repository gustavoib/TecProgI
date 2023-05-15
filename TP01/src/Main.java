import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String teste1 = "C:\\Users\\joaog\\IdeaProjects\\TP01\\src\\teste.txt";// caminho do primeiro arquivo
        String teste2 = "C:\\Users\\joaog\\IdeaProjects\\TP01\\src\\teste2.txt";// caminho do segundo arquivo
        String output = "C:\\Users\\joaog\\IdeaProjects\\TP01\\src\\saida.txt";// caminho do arquivo de saída

        HashMap<String, String> colecao = new HashMap<>();
        Set<String> set = new HashSet<>();

        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(teste1));//criando leitor para o arquivo 1
            BufferedReader reader2 = new BufferedReader(new FileReader(teste2));//criando leitor para o arquivo 2
            BufferedWriter writer = new BufferedWriter(new FileWriter(output));//criando um "escritor" para o arquivo de saída

            String line;
            String[] aux1;
            while ((line = reader1.readLine()) != null) {
                aux1 = line.split(";");
                if (!set.contains(aux1[0])) {
                    set.add(aux1[0]);
                    writer.write(line + "\n");
                    colecao.put(aux1[0], aux1[1]);
                }
            }

            String line2;
            String[] aux2;
            while ((line2 = reader2.readLine()) != null) {
                aux2 = line2.split(";");
                if (!colecao.containsKey(aux2[0])) {
                    writer.write(line2 + "\n");
                    colecao.put(aux2[0],aux2[1]);
                }
            }

            reader1.close();
            reader2.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
