-- donor table creation
create table donor(
    env_num int not null,
    primary key(env_num),
    f_name varchar(40) not null,
    l_name varchar(40) not null,
    street varchar(75) not null,
    city varchar(40) default "Wichita Falls",
    state varchar(2) default "TX",
    zip int not null,
    email varchar(75),
    mail_pref enum('printed', 'electronic') default 'printed');