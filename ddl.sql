create trigger trigger_uportal_hg_pay
  after INSERT
  on t_hg_pay
  for each row
  BEGIN
INSERT INTO uportal.t_hg_pay(id, transportno,paytype,bank,bankno,khname,wxname,
zhifubaoname,status,money,creater,createtime,operator,paytime,discription,fj,backid)
  values(NEW.id, NEW.transportno,NEW.paytype,NEW.bank,NEW.bankno,NEW.khname,NEW.wxname,
  NEW.zhifubaoname,NEW.status,NEW.money,NEW.creater,NEW.createtime,NEW.operator,NEW.paytime,NEW.discription,NEW.fj,NEW.backid);
END;