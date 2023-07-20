-- 코드를 입력하세요
SELECT USER_ID, NICKNAME, sum(price) as TOTAL_SALES
FROM USED_GOODS_BOARD as board
JOIN USED_GOODS_USER as user
on board.WRITER_ID = user.USER_ID
where board.STATUS = 'DONE'
group by board.WRITER_ID
having TOTAL_SALES >= 700000
order by TOTAL_SALES ASC