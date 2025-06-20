CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  DECLARE OFFSET INT;
  DECLARE RESULT INT;

  SET OFFSET = N - 1;

  SELECT DISTINCT salary
  INTO RESULT
  FROM Employee
  ORDER BY salary DESC
  LIMIT OFFSET, 1;

  RETURN RESULT;
END;