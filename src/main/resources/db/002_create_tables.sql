CREATE TABLE IF NOT EXISTS parent_bi3 (
    id serial not null,
    _name varchar not null,

    primary key (id)
);

CREATE TABLE IF NOT EXISTS child_bi3 (
    id serial not null,
    _name varchar not null,
    parent_id bigint not null unique,

    primary key (id),

    CONSTRAINT PARENT_FK
    FOREIGN KEY (parent_id)
    REFERENCES parent_bi3 (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);