package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*
        Collections:
        List-ы
        Set-ы
        Map-ы (Структура данных: ключ=>значение)
               Ассоциативный массив, словарь
        * */

       /* Map<String,String> map = new Map<String,String>();*/
        /*
        Hashtable - хэш таблица
        Пары - ключ-значение
        все методы в hashtable - synchronized - могуть проблемы со скоростью
        выполнение любой операции - начинается с вычисления хэша от ключа (фактически это индекс)
        Неупорядочен (зависит от хэш функции)
        null - нельзя
         */

        Hashtable phonebook = new Hashtable();
        phonebook.put("Ivan","484848");
        phonebook.put("Max","5673567");
        phonebook.put("Andrey","4562456");

        Enumeration keys = phonebook.keys();
        while(keys.hasMoreElements()) {
            String user = (String)keys.nextElement();
            String value = (String) phonebook.get(user);
            System.out.println("key: "+ user+"; user:"+value);
        }

        // https://habr.com/ru/post/188010/

      /*
      HashMap - аналогичная структура, за исключением: null; методы не synchronized
      Потоконебезопасный
       */
      Map<String,String> map = new HashMap<String,String>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");

        Map<String,String> map2 = new HashMap<String,String>();
        map2.put("key4","value4");
        map2.put("key5","value5");
        map2.put("key6","value6");

        // добавление набора данных
        map.putAll(map2);
        // удаление объекта
        map.remove("key5");
        // размер
        // map.size();
        // поиск по ключу
        String exists = (map.containsKey("key2")) ? "found" :  "not found";
        // поиск по значению
        // map.containsValue();

        // Перебор значений
        Set<Map.Entry<String,String>> set = map.entrySet();
        for(Map.Entry<String,String> s: set) {
            System.out.println("key:"+s.getKey() + "; value: " + s.getValue());
        }
        // очистка map.clear();

        /*
        LinkedHashMap
        Упорядоченная реализация HashMap, в которой есть связи (след и пред)
         */
        Map<String,Double> linked = new LinkedHashMap<String,Double>();
        linked.put("USD",82.4);
        linked.put("EUR",86.3);
        linked.put("CZK",2.43);

        System.out.println(linked);

        for(String key: linked.keySet()) {
            System.out.println("value:"+linked.get(key));
        }

        //размер
        // linked.size();
        // проверка наличия записей
        // linked.isEmpty();
        // проверка записей по ключу и значению
        // linked.containsKey();
        // linked.containsValue();
        // удаление
        // linked.remove("USD");

        /*
        TreeMap
        сортируется по ключам - natural ordering
        Comparator
         */
        TreeMap<Integer,String> days = new TreeMap<>();
        days.put(3,"Monday");
        days.put(2,"Tuesday");
        days.put(1,"Wednesday");

        // получить все ключи
        System.out.println(days.keySet());

        // получить все значения
        System.out.println(days.values());

        // получить значение по ключу
        // days.get(3);

        // получить первый ключ и его значение
        System.out.println("first key:"+days.firstKey()+"; value:"+days.get(days.firstKey()));

        // аналогично можно получить последний ключ и значение
        







    }
}
