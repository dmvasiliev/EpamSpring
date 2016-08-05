CREATE TABLE deparment (
  dep_ID   INT,
  dep_name VARCHAR(20)
);
SELECT *
FROM deparment;

INSERT INTO deparment (dep_ID, dep_name) VALUES (1, 'Бухгалтерия');
INSERT INTO deparment (dep_ID, dep_name) VALUES (2, 'Администрация');

UPDATE deparment
SET dep_name = 'Бухгалтерия';
UPDATE deparment
SET dep_name = 'Администрация'
WHERE dep_ID = 2;


SELECT *
FROM deparment
WHERE dep_ID = 2;