-- 코드를 입력하세요
SELECT INGREDIENT_TYPE, SUM(TOTAL_ORDER)
FROM ICECREAM_INFO info
JOIN FIRST_HALF half
ON info.flavor = half.flavor
group by info.INGREDIENT_TYPE