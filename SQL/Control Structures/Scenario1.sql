BEGIN
    FOR rec IN (
        SELECT c.CustomerID, c.Age
        FROM Customers c
        WHERE c.Age > 60
    )
    LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE CustomerID = rec.CustomerID;

        DBMS_OUTPUT.PUT_LINE('Discount applied to Customer ID: ' || rec.CustomerID);
    END LOOP;

    COMMIT;
END;