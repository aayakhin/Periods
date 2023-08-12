# Periods
### Формат ввода  
В первой строке дан типа интервала typetype — строка, принимающая одно из следующих значений: WEEK, MONTH, QUARTER, YEAR, REVIEW. 
Во второй строке через пробел даны начальная и конечная даты start и end (start≤endstart≤end) в формате yyyy-MM-dd.  
### Формат вывода  
В первой строке ответа выведите одно целое число N — количество промежутков. В последующих N строках на i-й строке выведите через пробел дату начала и конца i-го промежутка в формате yyyy-MM-dd. 
Промежутки должны выводиться в порядке возрастания начальной даты.  
### Пример 1  
Ввод  
MONTH  
2020-01-10 2020-03-25     	
Вывод  
3  
2020-01-10 2020-01-31  
2020-02-01 2020-02-29  
2020-03-01 2020-03-25  

### Пример 2  
Ввод  
WEEK  
2020-01-26 2020-03-23  
Вывод  
10  
2020-01-26 2020-01-26  
2020-01-27 2020-02-02  
2020-02-03 2020-02-09  
2020-02-10 2020-02-16  
2020-02-17 2020-02-23  
2020-02-24 2020-03-01  
2020-03-02 2020-03-08  
2020-03-09 2020-03-15  
2020-03-16 2020-03-22  
2020-03-23 2020-03-23  

### Пример 3  
Ввод  
REVIEW  
2016-09-20 2022-11-30  
Вывод  
14  
2016-09-20 2016-09-30  
2016-10-01 2017-03-31  
2017-04-01 2017-09-30  
2017-10-01 2018-03-31  
2018-04-01 2018-09-30  
2018-10-01 2019-03-31  
2019-04-01 2019-09-30  
2019-10-01 2020-03-31  
2020-04-01 2020-09-30  
2020-10-01 2021-03-31  
2021-04-01 2021-09-30  
2021-10-01 2022-03-31  
2022-04-01 2022-09-30  
2022-10-01 2022-11-30  

