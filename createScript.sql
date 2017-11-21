create table Profesor(id int not null auto_increment, ime varchar(255), prezime varchar(255), primary key (id));

create table Student (id int not null auto_increment, ime varchar(255), prezime varchar(255), brojIndexa varchar(255));

create table Ispit (id int not null auto_increment, ime varchar(255));

create table IspitniRok (id int not null auto_increment, ispit_id int, godina varchar(255), rok enum('JANUAR','FEBRUAR','JUN','JUL','SEPTEMBER','OKTOBAR'), primary key (id));

create table Ispit_Profesor(id int not null auto_increment, profesor_id int, ispit_id int, primary key(id), foreign key (profesor_id) 
references Profesor (id), foreign key (ispit_id) references Ispit (id), unique key (profesor_id, ispit_id));

create table Student_Ispit(id int not null auto_increment, student_id int, ispit_id int, primary key(id), foreign key (student_id) references
Student(id), foreign key (ispit_id) references Ispit(id), unique key (student_id, ispit_id));

create table PrijavaIspita(id int not null auto_increment, ispit_id int, student_id int, ispitniRok_id int , primary key(id), foreign key (ispit_id)
references Ispit(id), foreign key(student_id) references Student(id), foreign key (ispitniRok_id) references IspitniRok(id), unique key (ispit_id,student_id,ispitniRok_id));

create table PolaganjeIspita(id int not null auto_increment, prijavaIspita_id int, ocena int, profesor_id int, primary key(id), foreign key (prijavaIspita_id) 
references PrijavaIspita(id), foreign key (profesor_id) references Profesor(id), unique key(id, prijavaIspita_id));