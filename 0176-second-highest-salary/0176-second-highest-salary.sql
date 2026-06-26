/* Write your PL/SQL query statement below */
select(
    select DISTINCT salary
    FROM (
        SELECT  salary,
                DENSE_RANK() OVER (ORDER BY salary DESC) r
        FROM Employee
)
WHERE r = 2
) AS SecondHighestSalary
from dual;
