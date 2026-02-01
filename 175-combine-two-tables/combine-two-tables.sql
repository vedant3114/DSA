/* Write your PL/SQL query statement below */
Select Person.firstName,Person.lastName,Address.city,Address.state from Person left outer join Address 
on Person.PersonId=Address.PersonId;