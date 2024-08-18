create table if not exists measure_service_region(
data_centre varchar(255) not null,
service_code varchar(255) null,
managed_option varchar(255) null,
presence_duration varchar(255) null,
module_scan_indicator Integer null,
local_compliance Integer null,
proximity varchar(255) null,
data_centre_region varchar(255) null,
pricing varchar(255) null,
hardware_requirements varchar(255) null,
constraint measure_service_region_pk primary key(data_centre));