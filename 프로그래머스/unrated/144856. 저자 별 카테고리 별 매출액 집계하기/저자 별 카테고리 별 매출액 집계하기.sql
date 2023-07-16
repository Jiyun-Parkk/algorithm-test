-- 코드를 입력하세요
select book.author_id, author.author_name, book.category, sum(book.price * book_sales.sales) as TOTAL_SALES
from BOOK_SALES 
join book on BOOK_SALES.BOOK_ID = book.BOOK_ID
join author on book.author_id = author.author_id
where book_sales.sales_date like "2022-01%"
group by book.category, author_name
order by book.author_id ASC, book.category DESC;