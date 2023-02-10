\qecho 'выведите всю таблицу'
SELECT *
  FROM Jaegers;

\qecho 'отобразите только не уничтоженных роботов'
SELECT *
  FROM Jaegers
 WHERE status = 'active';

\qecho 'отобразите роботов нескольких серий: Mark-1 и Mark-4'
SELECT *
  FROM Jaegers
 WHERE mark
    IN ('Mark-1', 'Mark-4');

\qecho 'отобразите всех роботов, кроме Mark-1 и Mark-4'
SELECT *
  FROM Jaegers
 WHERE mark
NOT IN ('Mark-1', 'Mark-4');

\qecho 'отсортируйте таблицу по убыванию по столбцу mark'
SELECT *
  FROM Jaegers
 ORDER BY mark DESC;

\qecho 'отобразите информацию о самом старом роботе'
SELECT *
  FROM Jaegers 
 WHERE launch = (SELECT MIN(launch) FROM Jaegers);

\qecho 'отобразите роботов, которые уничтожили больше всех kaiju'
SELECT *
  FROM Jaegers
 WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers);

\qecho 'отобразите средний вес роботов'
SELECT AVG(weight) AS averageWeight
  FROM Jaegers;

\qecho 'увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены'
UPDATE Jaegers
   SET kaijuKill = (kaijuKill + 1)
 WHERE status = 'active';

\qecho 'удалите уничтоженных роботов'
DELETE FROM Jaegers
 WHERE status = 'destroyed';

