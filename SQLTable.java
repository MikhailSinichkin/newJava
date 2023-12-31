// Дана строка sql-запроса:

// select * from students where "
// Сформируйте часть WHERE этого запроса, используя StringBuilder. Пример данных для фильтрации приведены ниже в виде json-строки. Если значение null, то параметр не должен попадать в запрос.

// Пример:

// {"name": "Ivanov", "country": "Russia", "city": "Moscow", "age": "null"}
// Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:

// String QUERY - начало SQL-запроса
// String PARAMS - JSON с параметрами


class Answer {  
    public StringBuilder answer(String QUERY, String PARAMS){
        String paramsNew = PARAMS.replace('{',' ').replace('}', ' '); 
      String[] params = paramsNew.split(","); 
      StringBuilder stringBuilder = new StringBuilder(QUERY);

    for (int i = 0; i < params.length; i++){
        String[] elements = params[i].replace('"', ' ').split(":");
        if(!"null".equals(elements[1].trim())){       
          stringBuilder.append(elements[0].trim()).append("=").append("'").append(elements[1].trim()).append("'");
            if (i < params.length - 2) stringBuilder.append(" and ");
        }
    }
    return stringBuilder;// Напишите свое решение ниже

    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class SQLTable{ 
	public static void main(String[] args) { 
      String QUERY = "";
      String PARAMS = "";
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        QUERY = "select * from students where ";
	    PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
      }
      else{
        QUERY = args[0];
        PARAMS = args[1];
      }     
      
      Answer ans = new Answer();      
      System.out.println(ans.answer(QUERY, PARAMS));
	}
}