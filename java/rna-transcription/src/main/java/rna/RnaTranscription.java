package rna;

public class RnaTranscription {
    public String transcribe(String dnaStrand) {
//        return imperativeStyle(dnaStrand);
        return functionalStyle(dnaStrand);
    }

    private String functionalStyle(String dnaStrand) {
        return dnaStrand.chars()
                .mapToObj(i -> (char) i)
                .map(RnaTranscription::replaceWithComplement)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    private String imperativeStyle(String dnaStrand) {
        if (dnaStrand == null || dnaStrand.isEmpty()) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder(dnaStrand.length());
            for (char nucleotide : dnaStrand.toCharArray()) {
                sb.append(replaceWithComplement(nucleotide));
            }
            return sb.toString();
        }
    }

    private static char replaceWithComplement(char nucleotide) {
        switch (nucleotide) {
            case 'G':
                return 'C';
            case 'C':
                return 'G';
            case 'T':
                return 'A';
            case 'A':
                return 'U';
        }
        return ' ';
    }
}