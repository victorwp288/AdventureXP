# AdventureXP
SQL Script



create table activities
(
   id          int auto_increment
       primary key,
   ageLimit    int          not null,
   price       double       not null,
   participant int          not null,
   instructor  varchar(255) not null,
   name        varchar(255) null,
   date        varchar(255) null,
   max         int          not null,
   min         int          not null
);

create table bookings
(
   id           int auto_increment,
   activityId   int          not null,
   date         varchar(255) null,
   participants int          null,
   bookingtype  int          null,
   name         varchar(255) null,
   constraint bookings_id_uindex
       unique (id),
   constraint bookings_activities_id_fk
       foreign key (activityId) references activities (id)
);

alter table bookings
   add primary key (id);

create table users
(
   username varchar(50)  not null
       primary key,
   password varchar(120) not null,
   enabled  tinyint(1)   not null
);

create table authorities
(
   username  varchar(50) not null,
   authority varchar(50) not null,
   constraint authorities_ibfk_1
       foreign key (username) references users (username)
);

create index username
   on authorities (username);
