// 1. Дана строка sql-запроса"select * from students where ".Сформируйте часть WHERE этого запроса,
//используя StringBuilder.Данные для фильтрации приведены ниже в виде json строки.Если значение null,
//то параметр не должен попадать в запрос.

// Параметры для фильтрации:{"name":"Ivanov","country":"Russia","city":"Moscow","age":"null"}

package Seminar2.Workhome2;

public class Task1 {
//Задаем запрос и параметры
    public static final String QUERY = "select * from students where ";
    public static final String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";

    public static void main(String[] args) {
//Заменяем такие скобки {}, на такие ' '
        String paramsNew = PARAMS.replace('{', ' ').replace('}', ' ');
//Разделяем данные с помощью запятой 
        String[] params = paramsNew.split(",");
        StringBuilder stringBuilder = new StringBuilder(QUERY);

//Перезаписываем элементы в нормальный вид с помощью цикла        
        for (int i = 0; i < params.length; i++) {
            String[] elements = params[i].replace('"', ' ').split(":");
            if (!"null".equals(elements[1].trim())) {
                stringBuilder.append(elements[0].trim()).append("=").append("'").append(elements[1].trim()).append("'");
                if (i < params.length - 2)
                    stringBuilder.append(" and ");
            }
        }
//Выводим на печат 
        System.out.println(stringBuilder);
    }
}
