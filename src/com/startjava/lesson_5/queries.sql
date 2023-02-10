\qecho '�������� ��� �������'
SELECT *
  FROM Jaegers;

\qecho '���������� ������ �� ������������ �������'
SELECT *
  FROM Jaegers
 WHERE status = 'active';

\qecho '���������� ������� ���������� �����: Mark-1 � Mark-4'
SELECT *
  FROM Jaegers
 WHERE mark
    IN ('Mark-1', 'Mark-4');

\qecho '���������� ���� �������, ����� Mark-1 � Mark-4'
SELECT *
  FROM Jaegers
 WHERE mark
NOT IN ('Mark-1', 'Mark-4');

\qecho '������������ ������� �� �������� �� ������� mark'
SELECT *
  FROM Jaegers
 ORDER BY mark DESC;

\qecho '���������� ���������� � ����� ������ ������'
SELECT *
  FROM Jaegers 
 WHERE launch = (SELECT MIN(launch) FROM Jaegers);

\qecho '���������� �������, ������� ���������� ������ ���� kaiju'
SELECT *
  FROM Jaegers
 WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers);

\qecho '���������� ������� ��� �������'
SELECT AVG(weight) AS averageWeight
  FROM Jaegers;

\qecho '��������� �� ������� ���������� ������������ kaiju � �������, ������� �� ��� ��� �� ���������'
UPDATE Jaegers
   SET kaijuKill = (kaijuKill + 1)
 WHERE status = 'active';

\qecho '������� ������������ �������'
DELETE FROM Jaegers
 WHERE status = 'destroyed';

