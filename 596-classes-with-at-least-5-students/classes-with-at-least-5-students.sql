# Write your MySQL query statement below
Select class
from Courses
Group By class
having count(class)>=5;