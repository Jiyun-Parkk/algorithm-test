-- 코드를 입력하세요
SELECT MEMBER_ID,MEMBER_NAME,GENDER, Date_format(DATE_OF_BIRTH,'19%y-%m-%d') DATE_OF_BIRT
from MEMBER_PROFILE
where DATE_OF_BIRTH like '%03%' 
and GENDER = 'W'
and TLNO is not null
