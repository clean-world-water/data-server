# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user_input (
  id                        bigint auto_increment not null,
  created_at                timestamp,
  updated_at                timestamp,
  lat                       double,
  lon                       double,
  water_quality_measurement varchar(255),
  water_measurement_tool    varchar(255),
  water_infrastructure      varchar(255),
  water_source_image_url    varchar(255),
  water_infrastructure_image_url varchar(255),
  version                   integer not null,
  constraint pk_user_input primary key (id))
;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists user_input;

SET REFERENTIAL_INTEGRITY TRUE;

