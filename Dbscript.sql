CREATE TABLE Login(
        Role_id VARCHAR(20) NOT NULL, --Primary key
		Username VARCHAR(20),
		Passcode VARCHAR(12),
		PRIMARY KEY(Role_id));
		
CREATE TABLE Investor(
		Investor_Id INT NOT NULL AUTO_INCREMENT,
		First_Name VARCHAR(30),
		Last_Name VARCHAR(30),
		Investor_PAN VARCHAR(15) NOT NULL,
		Investor_Address VARCHAR(60),
		Investor DOB DATE,
		Trans_Type CHAR(10),
		Commission DOUBLE,
		Amount_Invested DOUBLE,
		Balance_Amount DOUBLE,
		PRIMARY KEY(Investor_Id));

CREATE TABLE BackOffice(
		Emp_id INT NOT NULL AUTO_INCREMENT,
		Emp_FName VARCHAR(30),
		Emp_LName VARCHAR(30),
		PRIMARY KEY(Emp_id));
		
CREATE TABLE SuperUser(
		Suser_id INT NOT NULL AUTO_INCREMENT,
		Suser_FName VARCHAR(30),
		Suser_LName VARCHAR(30),
		PRIMARY KEY(Suser_id));
		
CREATE TABLE Company(
		Company_Code VARCHAR(10) NOT NULL AUTO_INCREMENT,
		Company_Title VARCHAR(30),
		Operations VARCHAR(20),
		Share_Count INT,
		SharePrice_USD double, 
		Sector CHAR(10),
		Currency DOUBLE,
		Turnover DOUBLE,		
        PRIMARY KEY(Company_Code));
		
CREATE TABLE Stocks(
		Company_Code INT NOT NULL,                
		Stock_Exchange VARCHAR(20),	   			 
		Current_Price DOUBLE, --Stock Price USD	
		Added_date  DATE, 
		Added_time TIME,		
		FOREIGN KEY(Company_Code) REFERENCES Company(Company_Code));	

/*			
CREATE TABLE Commodities (
        Item_No INT not null,						--primary key
		Items_Name CHAR(10),                --gold , silver 
		Item_Price INT,
		Sys_Date DATE,
        PRIMARY KEY(Item_No));
		
INSERT INTO Login values('ABC12','ABC12','XYZ123');
*/
