insert into Television (id, type, brand, name, price, available_Size, refresh_Rate, screen_Type,  screen_Quality,smart_Tv, wifi, voice_Control, hdr, bluetooth, ambi_Light, original_Stock, sold) values(1,'Ocean','Sharp','Sharp-AA',950,120,null,'shine','high' ,true,true,true,true,true,true,16663,1199 );
insert into television (id, type, brand, name, price, available_size, refresh_rate, screen_type, screen_quality, smart_tv, wifi, voice_control, hdr, bluetooth, ambi_light, original_stock, sold) values(2, 'SMART', 'Nike', 'HD smart TV', 1159, 32, 100, 'LED', 'HD ready',  true, true, false, false, false, false, 35885, 4589);
insert into television (id, type, brand, name, price, available_size, refresh_rate, screen_type, screen_quality, smart_tv, wifi, voice_control, hdr, bluetooth, ambi_light, original_stock, sold) values (3, '2/L', 'Samsung', 'LED Smart Tv', 839, 43, 60, 'LED', ' HD',  true, true, false, true, false, false, 9452, 5489);
insert into television (id, type, brand, name, price, available_size, refresh_rate, screen_type, screen_quality, smart_tv, wifi, voice_control, hdr, bluetooth, ambi_light, original_stock, sold) values (4, '2/M', 'Samsung', 'LED Smart Tv', 739, 50, 60, 'LED', ' HD',  true, true, false, true, false, false, 5549, 486);
insert into television (id, type, brand, name, price, available_size, refresh_rate, screen_type, screen_quality, smart_tv, wifi, voice_control, hdr, bluetooth, ambi_light, original_stock, sold) values (5, '2/S', 'Samsung', 'LED Smart Tv', 639, 58, 60, 'LED', 'HD',  true, true, false, true, false, false,945, 5741);
insert into television (id, type, brand, name, price, available_size, refresh_rate, screen_type, screen_quality, smart_tv, wifi, voice_control, hdr, bluetooth, ambi_light, original_stock, sold) values (6, 'AAA', 'LG', 'AAA', 989, 55, 100, 'AAA', ' HD',  true, true, true, true, true, false, 5600, 5500);

INSERT INTO users (username, password, enabled, apikey, email)
VALUES ('henk', 'password', true, '7847493' , 'test@testy.tst');

INSERT INTO authorities (username, authority)
VALUES ('henk', 'ROLE_ADMIN');
