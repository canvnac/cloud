DROP TABLE user IF EXISTS ;
CREATE TABLE user (
  id bigint generated by DEFAULT  AS IDENTITY ,
  username VARCHAR(40),
  name VARCHAR(20),
  age int(3),
  balance DECIMAL(10,2),
  PRIMARY KEY (id)
);