select fund.name as Fund, sum(amt) as Total
from fund join contribution
where fund.name = contribution.fund_name
group by fund.name order by fund.name asc;