create database newsManagement
use newsManagement

create table tblUser(
	UserID int primary key identity(1,1),
	UserName varchar(255),
	Password varchar(255),
	Role bit
)

create table tblCategory(
	CategoryID int primary key identity(1,1),
	CategoryName varchar(255),
	Description varchar(255),
	Status bit,
)

create table tblNews(
	NewsID int primary key identity(1,1),
	NewsName varchar(255),
	Description varchar(255),
	Detail text,
	Image varchar(255),
	Date date,
	CategoryID int,
	UserID int,
	Status bit,
)

create table tblComment(
	CommentID int primary key identity(1,1),
	UserName varchar(255),
	NewsID int,
	Content text,
	Status bit,
)

alter table tblNews add foreign key(UserID) references tblUser(UserID)


alter table tblNews add foreign key(CategoryID) references tblCategory(CategoryID)


alter table tblComment add foreign key(NewsID) references tblNews(NewsID)