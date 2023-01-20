/*=========================================<< select >>=======================================*/

select * from student_mst;


/* 전체 칼럼 조회*/
select 
	* 
from 
	student_mst;
    
 /* 지정 칼럼 조회*/
 select 
	student_id,
    student_name
from 
	student_mst;

/* 임시 컬럼 추가 */
select 
	1 as num,
    '김준일' as name;
    
select
	student_id,
    student_name,
	'김준일' as instructor_name
from 
	student_mst;
    
/* 그룹으로 조회한 결과에 주는 조건주는 방법 */

select 
	count(mentor_id) as mentor_count,
    min(student_id),
    max(student_id),
    avg(student_id),
    sum(student_id),
	mentor_id
from 
	student_mst
group by
	mentor_id
having 
	mentor_count = 5;
  
 
 
 /* 정렬 */
 select 
	* 
from 
	student_mst
order by
	mentor_id,
    student_id desc;
    
/* 전체 조합 실습 */
select 
	count(*) as student_count,
    mentor_id
from
	student_mst
where 
	student_id > 2
group by
	mentor_id
having 
	student_count = 1
order by 
	mentor_id desc;
 
/* 중복 제거 */
select distinct
	mentor_id
from 
	student_mst;
    

/* 컬럼명을 임시로 바꾸는 방법 as(alias) 알리아스*/
select
	sm.student_id as studentId
from
	student_mst sm;
    
/* 조회조건 */
select 
	* 
from 
	student_mst
where 
	mentor_id = (select 
					mentor_id
				from
					mentor_mst
				where 
					mentor_name = '문자영');
                    
                    
select 
	student_id,
    student_name,
    mentor_id,
    (select 
		mentor_name 
	from 
		mentor_mst 
    where 
		mentor_id = student_mst.mentor_id) as mentor_name
from
	student_mst;
    
