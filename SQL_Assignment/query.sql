SELECT course_id,
       course_name
FROM course
WHERE start_date < '2021-12-12';


SELECT client_id,
       client_name
FROM client
WHERE address ILIKE '%a%';


SELECT count(*)
FROM teacher;


SELECT count(*)
FROM client;


SELECT count(*)
FROM course;


SELECT MAX(course_length_weeks) AS "maximum course weeks"
FROM course;


SELECT level,
       MIN(course_length_weeks)
FROM course
GROUP BY level;


SELECT client.client_id,
       client_name,
       participant.participant_id,
       participant.first_name,
       participant.last_name,
       participant.phone_no
FROM client
INNER JOIN participant ON client.client_id = participant.client;


SELECT course.course_name,
       teacher.first_name,
       teacher.last_name,
       teacher.phone_number
FROM course
INNER JOIN teacher ON course.teacher = teacher.teacher_id
WHERE course_id = 1;

