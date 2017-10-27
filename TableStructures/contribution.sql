-- contribution table creation
create table contribution(
    ID int auto_increment,
    primary key(ID),
    amt numeric(10,2) not null,
    c_date date not null,
    note varchar(255),
    c_type enum('ach','check','coin','currency') not null, 
    fund_name varchar(50) default "General",
    env_num int default 0,
    foreign key (env_num) references donor(env_num),
    foreign key (fund_name) references fund(name));