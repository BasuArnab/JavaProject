CREATE TABLE ATTR (
ATTRID INTEGER not null AUTO_INCREMENT PRIMARY KEY,
IDENTIFIER Varchar(255) not null,
ATTRTYPEID INTEGER not null,
FIELD1 Varchar(255) null,
FIELD2 Varchar(255) null,
CREATED_DATE  Date null,
UPDATED_DATE  Date null
);

CREATE TABLE ITEM (
ITEMID INTEGER not null AUTO_INCREMENT PRIMARY KEY,
IDENTIFIER Varchar(255) not null,
DESCRIPTION Varchar(4000) not null,
ITEMTYPE  INTEGER not null,
FIELD1 Varchar(255) null,
FIELD2 Varchar(255) null,
CREATED_DATE  Date null,
UPDATED_DATE  Date null
);


CREATE TABLE ITEMATTRMAPPING (
ITEMATTRMAPPINGID INTEGER not null AUTO_INCREMENT PRIMARY KEY,
ITEMID INTEGER not null,
ATTRID INTEGER  not null,
ATTRVALUE Varchar(255) not null,
FIELD1 Varchar(255) null,
FIELD2 Varchar(255) null,
CREATED_DATE  Date null,
UPDATED_DATE  Date null,
FOREIGN KEY (ITEMID)  REFERENCES ITEM (ITEMID),
FOREIGN KEY (ATTRID)  REFERENCES ATTR (ATTRID)
);


CREATE TABLE ITEMREL (
ITEMRELID INTEGER not null AUTO_INCREMENT PRIMARY KEY,
ITEMID_PARENT INTEGER not null,
ITEMID_CHILD INTEGER  not null,
FIELD1 Varchar(255) null,
FIELD2 Varchar(255) null,
FOREIGN KEY (ITEMID_PARENT)  REFERENCES ITEM (ITEMID),
FOREIGN KEY (ITEMID_CHILD)  REFERENCES ITEM (ITEMID)
);