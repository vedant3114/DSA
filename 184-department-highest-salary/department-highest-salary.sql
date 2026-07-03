# Write your MySQL query statement below
Select d.name as Department,e.name as Employee,e.salary as Salary from Employee e join Department d 
on e.departmentId=d.id
where (departmentId,salary) in(Select departmentId,Max(salary) from employee group by departmentId);