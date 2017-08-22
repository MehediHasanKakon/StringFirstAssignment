public class Part1{
    
    void testSimpleGene(){
        String dna = "AGTATGAACCGCTAAGCTG";
        String gene = findSimpleGene(dna);
        if(gene==""){
            System.out.print("DNA Strand: "+ dna +"\nGene not found.\n");
        }
        else{
            System.out.print("DNA Strand: "+ dna +"\nGene: " + gene + "\n");
        }
    }
    public String findSimpleGene(String dna){
        String result = "";
        int startIndex = dna.indexOf("ATG");
        if(startIndex == -1){
            return result;
        }
        int stopIndex = dna.indexOf("TAA");
        if(stopIndex == -1){
            return result;
        }
        while(stopIndex != -1){
            if((stopIndex - startIndex)%3 == 0){
                return dna.substring(startIndex, stopIndex + 3);
            }
            else{
                stopIndex = dna.indexOf("TAA", stopIndex + 1);
            }
        }
        return "";
    }
}