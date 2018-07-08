CREATE TABLE IF NOT EXISTS parent_bi1 (
    id serial NOT NULL,
    _name varchar NOT NULL,
    child_id bigint NULL,

    primary key (id)
);

CREATE TABLE IF NOT EXISTS child_bi1 (
    id serial NOT NULL,
    _name varchar NOT NULL,
    parent_id bigint NULL,

    primary key (id),

    CONSTRAINT PARENT_FK
    FOREIGN KEY (parent_id)
    REFERENCES parent_bi1 (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

ALTER TABLE parent_bi1 add constraint CHILD_FK
FOREIGN KEY (child_id) REFERENCES child_bi1 (id);


CREATE TABLE IF NOT EXISTS parent_bi2 (
    id serial not null,
    _name varchar not null,

    primary key (id)
);

CREATE TABLE IF NOT EXISTS child_bi2 (
    id serial not null,
    _name varchar not null,
    parent_id bigint not null unique,

    primary key (id),

    CONSTRAINT PARENT_FK
    FOREIGN KEY (parent_id)
    REFERENCES parent_bi2 (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS parent_uni (
    id serial not null,
    _name varchar not null,

    primary key (id)
);

CREATE TABLE IF NOT EXISTS child_uni (
    _name varchar not null,
    parent_id bigint not null unique,

    primary key (parent_id),

    CONSTRAINT PARENT_FK
    FOREIGN KEY (parent_id)
    REFERENCES parent_uni (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);