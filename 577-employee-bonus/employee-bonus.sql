SELECT e.name,b.bonus
FROM Employee e
full outer JOIN Bonus b
    ON e.empId = b.empId
WHERE b.bonus < 1000
   OR b.bonus IS NULL;
