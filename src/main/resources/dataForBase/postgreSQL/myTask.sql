SELECT *
FROM product;
SELECT *
FROM pc;
SELECT *
FROM laptop;
SELECT *
FROM printer;

-- Найдите номер модели, скорость и размер жесткого диска для всех ПК
-- стоимостью менее 500 долларов. Вывести: model, speed и hd
SELECT
  model,
  speed,
  hd
FROM computer.pc
WHERE price < 500;

-- Найдите производителей принтеров. Вывести: maker.
SELECT DISTINCT maker
FROM computer.product
WHERE type = 'Printer';

-- Найдите номер модели, объем памяти и размеры экранов портативных
-- компьютеров, цена которых превышает 1000 долларов.
SELECT
  model,
  ram,
  screen
FROM laptop
WHERE price > 1000;

