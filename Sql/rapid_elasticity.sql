create table if not exists rapid_elasticity(
region_code bigint not null,
data_centre Integer null,
capabilities varchar(255) null,
elastically_provisioned varchar(255) null,
elastically_released varchar(255) null,
auto_scal_with_demand varchar(255) null,
networking_provisions varchar(255) null,
rapid_elastic_mode varchar(255) null,
latency_avoidance varchar(255) null,
constraint rapid_elasticity_pk primary key(region_code));