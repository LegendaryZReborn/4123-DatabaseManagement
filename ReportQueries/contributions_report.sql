SELECT env_num as EnvNum, ID,  f_name as FirstName, l_name as LastName,
c_date as Date, c_type as Type, fund_name as Fund, amt as Amt 
FROM contribution natural join donor 
where c_date >= '' and c_date <= '' and amt >= 
order by c_date;