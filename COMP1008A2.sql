Create Database w21_st200454895_comp1008_assign2;
USE w21_st200454895_comp1008_assign2;

create table painting
(
	artID int(11) primary key auto_increment not null,
    artTitle varchar(100) not null,
    artAuthor varchar(100) not null,
    artCreationDate int(4) not null,
    artCategory varchar(23) not null,
    artPrice double(15,2) not null,
    ArtStatus varchar(50) not null,
    paintingTechnique varchar(100) not null,
    paintingType varchar(50) not null
);

create table sculpture
(
	artID int(11) primary key auto_increment not null,
    artTitle varchar(100) not null,
    artAuthor varchar(100) not null,
    artCreationDate int(4) not null,
    artCategory varchar(23) not null,
    artPrice double(15,2) not null,
    ArtStatus varchar(50) not null,
    sculptureMaterial varchar(100) not null,
    sculptureHeight double(11,2) not null
);

INSERT INTO painting Values 
(1,'Château Noir','Paul Cézanne',1903,'Painting',10050.00,'Display','Oil on Canvas','Landscape'),
(2,'SELF-PORTRAIT','Vincent van Gogh',1889,'Painting',15200.00,'Display','Oil on Canvas','Portrait'),
(3,'The Japanese Footbridge','Claude Monet',1899,'Painting',10015.00,'Display','Oil on Canvas','Landscape'),
(4,'Waterlilies','Claude Monet',1904,'Painting',15400.00,'Restoration','Oil on Canvas','Landscape'),
(5,'The Cliff, Étretat, Sunset','Claude Monet',1882,'Painting',12900.00,'Sold','Oil on Canvas','Landscape'),
(6,'And so was his grandfather','Francisco Goya',1799,'Painting',1204.00,'Sold','Aquatint','Allegory'),
(7,'The Marquesa de Pontejos','Francisco Goya',1786,'Painting',7823.00,'Display','Oil on Canvas','Figure'),
(8,'Las Dos Fridas','Frida Kahlo',1939,'Painting',14500.00,'Sold','Oil on Canvas','Portrait');

Insert into sculpture VALUES 
(1,'Pierre de Wiessant','Auguste Rodin',1880,'Sculpture',12450.00,'Display','Bronze',0.22),
(2,'David','Antonin Mercié',1872,'Sculpture',12340.00,'Sold','Bronze',18.40),
(3,'Joan of Arc at Domrémy','Henri Chapu',1870,'Sculpture',150.00,'Display','Marble',11.70),
(4,'Love Reconciled with Death','William Rinehart',1865,'Sculpture',15102.00,'Display','Plaster',1.75),
(5,'Eve after the Original Sin','Eugène Delaplanche',1870,'Sculpture',123002.00,'Sold','Marble',14.50),
(6,'Young Dionysus with a Nymph','Giovanni Maria',1866,'Sculpture','12010.00','Display','Marble',1.08),
(7,'The Age of Bronze','Auguste Rodin',1880,'Sculpture',12301.00,'Display','Bronze',1.80),
(8,'Little Dancer, Aged Fourteen','Edgar Degas',1880,'Sculpture',1203148.00,'Display','Bronze',0.99);

Select * from painting;
Select * from sculpture;

