// 3. Дана json строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: 
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:

// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.


package Seminar2.Workhome2;

public class Task3 {

    private static final String JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +            
    "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +            
    "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";    
    private static final String ELEMENT1 = "Студент ";    
    private static final String ELEMENT2 = " получил ";    
    private static final String ELEMENT3 = " по предмету ";    
    public static void main(String[] args) {        
        StringBuilder sb = new StringBuilder();        
        String newJSON = JSON.replaceAll("\\{", "").replaceAll("\\}", "").replaceAll("\"", "").replace('[', ' ').replace(']', ' ');        
        //System.out.println(newJSON);        
        String[] parts = newJSON.split(",");        
        for (String part : parts){            
            String[] params = part.split(":");            
            if("фамилия".equals(params[0].trim())) 
            {                
                sb = new StringBuilder(ELEMENT1).append(params[1]);            
            }            else if("оценка".equals(params[0].trim())) sb.append(ELEMENT2).append(params[1]);            
            else if("предмет".equals(params[0].trim())) {                
                sb.append(ELEMENT3).append(params[1]);                
                System.out.println(sb);            }        }    }}

