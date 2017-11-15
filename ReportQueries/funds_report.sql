select fund.name as Fund, sum(amt) as Total
from fund join contribution
where fund.name = contribution.fund_name 
and c_date >= '2017-01-14' and c_date <= '2017-03-14'
group by fund.name order by fund.name asc;