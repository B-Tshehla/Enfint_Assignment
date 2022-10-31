insert into teacher (first_name, last_name, language_1, language_2, dob, tax_id, phone_number) values ('Kirstyn', 'Harvey', 'ENG', 'AFR', '1979-09-24', 4412, '(265) 8270846');
insert into teacher (first_name, last_name, language_1, language_2, dob, tax_id, phone_number) values ('Gretta', 'Hunte','ENG' , 'BNT', '1992-05-11', 2076, '(103) 1974437');
insert into teacher (first_name, last_name, language_1, language_2, dob, tax_id, phone_number) values ('Boyce', 'Dreamer', 'ENG', 'COR', '1990-04-16', 3457, '(919) 2952050');
insert into teacher (first_name, last_name, language_1, language_2, dob, tax_id, phone_number) values ('Malorie', 'Chidwick', 'ENG', 'CZE', '1979-07-14', 1506, '(580) 6277196');
insert into teacher (first_name, last_name, language_1, language_2, dob, tax_id, phone_number) values ('Francine', 'Harlock', 'ENG', 'DUT', '1978-12-20', 2788, '(614) 7383836');
insert into teacher (first_name, last_name, language_1, language_2, dob, tax_id, phone_number) values ('Clarence', 'Gosart', 'ENG', 'EPO', '1985-10-28', 1395, '(342) 4286742');
insert into teacher (first_name, last_name, language_1, language_2, dob, tax_id, phone_number) values ('Shell', 'Purdon', 'ENG','FRE' , '1997-01-20', 4993, '(891) 2030514');
insert into teacher (first_name, last_name, language_1, language_2, dob, tax_id, phone_number) values ('Sheila-kathryn', 'Piaggia', 'ENG', 'UMB', '1994-05-02', 2687, '(648) 8746631');
insert into teacher (first_name, last_name, language_1, language_2, dob, tax_id, phone_number) values ('Etan', 'Gerrish', 'ENG', '', '1972-09-14', 2192, '(502) 7254863');
insert into teacher (first_name, last_name, language_1, language_2, dob, tax_id, phone_number) values ('Virge', 'Mulkerrins', 'ENG', 'UMB', '1998-03-23', 3355, '(356) 7098695');


insert into client (client_name, address, industry) values ('Oriana', '9064 Luster Parkway', 'Telecommunications');
insert into client (client_name, address, industry) values ('Heath', '66217 Derek Point','' );
insert into client (client_name, address, industry) values ('Clarance', '2 Saint Paul Trail', 'Nursing Management');
insert into client (client_name, address, industry) values ('Allie', '9781 Rockefeller Junction', 'Fluid Controls');
insert into client (client_name, address, industry) values ('Ina', '5164 Mcbride Hill', 'Resorts');
insert into client (client_name, address, industry) values ('Filbert', '7 Badeau Trail', 'Pharmaceuticals');
insert into client (client_name, address, industry) values ('Esmaria', '57 Burning Wood Park', 'Building Materials');
insert into client (client_name, address, industry) values ('Tuckie', '37 3rd Crossing', 'Oil Refining/Marketing');
insert into client (client_name, address, industry) values ('Christabel', '50 Welch Circle', 'Pharmaceuticals');
insert into client (client_name, address, industry) values ('Lauraine', '25641 Killdeer Plaza', 'Entertainment');

insert into participant (first_name, last_name, phone_no,client) values ('Artemis', 'Spohrmann', '(787) 4287596', 4);
insert into participant (first_name, last_name, phone_no,client) values ('Rooney', 'Perryn', '(966) 7114961', 5);
insert into participant (first_name, last_name, phone_no,client) values ('Carey', 'Jalland', '(519) 5529341', 1);
insert into participant (first_name, last_name, phone_no,client) values ('Erastus', 'Levesley', '(794) 3814963', 3);
insert into participant (first_name, last_name, phone_no,client) values ('Consalve', 'Snufflebottom', '(899) 9209347', 2);
insert into participant (first_name, last_name, phone_no,client) values ('Borg', 'O''Hegertie', '(254) 6994397', 5);
insert into participant (first_name, last_name, phone_no,client) values ('Yvor', 'Cheales', '(518) 2918058', 1);
insert into participant (first_name, last_name, phone_no,client) values ('Poul', 'Lethby', '(767) 1631671', 4);
insert into participant (first_name, last_name, phone_no,client) values ('Tildi', 'Plimmer', '(875) 6316424', 2);
insert into participant (first_name, last_name, phone_no,client) values ('Charley', 'McAsgill', '(919) 2603311', 3);


insert into course (course_name, language, level, course_length_weeks, start_date, in_school, teacher, client) values ('JAVA', 'ENG', '1', 20, '2020-01-20', 1, 2, 3);
insert into course (course_name, language, level, course_length_weeks, start_date, in_school, teacher, client) values ('BIG DATA', 'ENG', '3', 20, '2022-04-06', 0, 3, 4);
insert into course (course_name, language, level, course_length_weeks, start_date, in_school, teacher, client) values ('MACHINE LEARNING', 'ENG', '4', 9, '2022-05-17', 1, 1, 2);
insert into course (course_name, language, level, course_length_weeks, start_date, in_school, teacher, client) values ('CLOUD ANALYST', 'ENG', '2', 18, '2021-02-25', 0, 5, 1);
insert into course (course_name, language, level, course_length_weeks, start_date, in_school, teacher, client) values ('BUSINESS ANALYST', 'ENG', '7', 9, '2022-02-06', 1, 1, 4);
insert into course (course_name, language, level, course_length_weeks, start_date, in_school, teacher, client) values ('FULL STACK DEVELOPER', 'ENG', '1', 12, '2020-04-22', 0, 4, 2);
insert into course (course_name, language, level, course_length_weeks, start_date, in_school, teacher, client) values ('BACK END DEVELOPER', 'ENG', '2', 19, '2020-05-10', 0, 3, 4);
insert into course (course_name, language, level, course_length_weeks, start_date, in_school, teacher, client) values ('FRONT END DEVELOPER', 'ENG', '7', 16, '2022-07-02', 0, 2, 3);
insert into course (course_name, language, level, course_length_weeks, start_date, in_school, teacher, client) values ('TEST ANALYST', 'ENG', '9', 19, '2020-07-10', 1, 5, 1);
insert into course (course_name, language, level, course_length_weeks, start_date, in_school, teacher, client) values ('WEB DEVELOPER', 'ENG', '4', 16, '2021-02-16', 0, 4, 4);
