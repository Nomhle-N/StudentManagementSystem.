package za.ac.cput;



public class Main {
    public static void main(String[] arg){
                UndergraduateStudent ug = new UndergraduateStudent.Builder("2258412", "Anelisa")
                        .email("2258412@cput.ac.za")
                        .department("Marketing")
                        .creditHours(18)
                        .scholarshipAmount(2000)
                        .build();

                GraduateStudent grad = new GraduateStudent.Builder("2514896", "Azola")
                        .email("2514896@mycput.ac.za")
                        .department("Information Technology")
                        .researchAssistant(true)
                        .stipend(2500)
                        .build();

                ug.displayStudentDetails();
                System.out.println("**************");
                grad.displayStudentDetails();
            }
        }

