package sample2;

import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgrammingLanguage lang1=new ProgrammingLanguage("Haskell",DifficultyLevel.HARD);
		ProgrammingLanguage lang2=new ProgrammingLanguage("Pyton",DifficultyLevel.EASY);
		ProgrammingLanguage lang3=new ProgrammingLanguage("Java",DifficultyLevel.MEDIUM);
		ProgrammingLanguage lang4=new ProgrammingLanguage("C++",DifficultyLevel.HARD);
		ProgrammingLanguage lang5=new ProgrammingLanguage("JS",DifficultyLevel.EASY);
		
		List<ProgrammingLanguage> languages=List.of(lang1,lang2,lang3,lang4,lang5);
		DifficultyLevel targetDifficulty = DifficultyLevel.MEDIUM;
        Optional<ProgrammingLanguage> result = findLanguageByDifficulty(languages, targetDifficulty);
	 if (result.isPresent()) {
           System.out.println("Language with a given difficulty: " + result.get());
       } else {
           System.out.println("A language with the specified difficulty was not found.");
       }
   }
	public static Optional<ProgrammingLanguage> findLanguageByDifficulty(List<ProgrammingLanguage> languages,
            DifficultyLevel difficulty) {
return languages.stream()
.filter(lang -> lang.getComplexity() == difficulty) 
.findFirst();
		
	}	
	}
		enum DifficultyLevel{
	EASY,MEDIUM,HARD;
}
class ProgrammingLanguage{
	private String name;
	private DifficultyLevel complexity;
	public ProgrammingLanguage(String name, DifficultyLevel complexity) {
		super();
		this.name = name;
		this.complexity = complexity;
	}
	public String getName() {
		return name;
	}
	public DifficultyLevel getComplexity() {
		return complexity;
	}
	@Override
	public String toString() {
		return "ProgrammingLanguage [name=" + name + ", complexity=" + complexity + "]";
	}
	
}
	


