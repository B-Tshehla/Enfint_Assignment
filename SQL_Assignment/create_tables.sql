CREATE TABLE teacher(
    teacher_id SERIAL PRIMARY KEY,
    first_name VARCHAR(40) NOT NULL,
    last_name  VARCHAR(40) NOT NULL,
    language_1 VARCHAR(3),
    language_2 VARCHAR(3),
    dob DATE,
    tax_id INTEGER UNIQUE,
    phone_number VARCHAR(20)
);

CREATE TABLE client(
    client_id SERIAL PRIMARY KEY,
    client_name VARCHAR(40),
    address VARCHAR(60),
    industry VARCHAR(20)
);

CREATE TABLE course(
    course_id SERIAL PRIMARY KEY,
    course_name VARCHAR(40) NOT NULL,
    language VARCHAR(3),
    level VARCHAR(2),
    course_length_weeks INT,
    start_date  DATE,
    in_school   SMALLINT,
    teacher     INT REFERENCES teacher  (teacher_id),
    client      INT REFERENCES client   (client_id)
);

CREATE TABLE participant(
    participant_id SERIAL PRIMARY KEY,
    first_name VARCHAR(40) NOT NULL,
    last_name  VARCHAR(40) NOT NULL,
    phone_no VARCHAR(20),
    client INT REFERENCES client (client_id)
);

CREATE TABLE takes_course(
    participant_id INT REFERENCES participant (participant_id) ON UPDATE CASCADE ON DELETE CASCADE,
    course_id INT PRIMARY KEY REFERENCES course (course_id) ON UPDATE CASCADE ON DELETE CASCADE
);

