use faks;

alter table Student
add unique(brojIndexa);

alter table Ispit
add unique(ime);

alter table IspitniRok
add unique(godina,rok);