create table if not exists global_measure_services(
service_id bigint not null,
service_code varchar(255) null,
broad_network_access varchar(255) null,
on_demand_mode char null,
self_service_mode char null,
resource_pooling varchar(255) null,
content_delivery_network varchar(255) null,
physical_server_count varchar(255) null,
virtual_server_access varchar(255) null,
value_propisition varchar(255) null,
cost_reductions_pattern varchar(255) null,
constraint global_measure_services_pk primary key(service_id));