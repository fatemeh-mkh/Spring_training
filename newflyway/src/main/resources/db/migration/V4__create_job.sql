CREATE TABLE job (
    id SERIAL PRIMARY KEY,
    job_title VARCHAR(255) NOT NULL,
    salary DECIMAL(10, 2) NOT NULL,
    department VARCHAR(100),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


INSERT INTO job (job_title, salary, department) VALUES ('Software Engineer', 60000, 'IT');
INSERT INTO job (job_title, salary, department) VALUES ('Data Analyst', 55000, 'Business Intelligence');
INSERT INTO job (job_title, salary, department) VALUES ('Project Manager', 75000, 'Management');
INSERT INTO job (job_title, salary, department) VALUES ('HR Specialist', 50000, 'Human Resources');
INSERT INTO job (job_title, salary, department) VALUES ('Sales Executive', 45000, 'Sales');
INSERT INTO job (job_title, salary, department) VALUES ('Marketing Manager', 70000, 'Marketing');
INSERT INTO job (job_title, salary, department) VALUES ('Accountant', 55000, 'Finance');
INSERT INTO job (job_title, salary, department) VALUES ('DevOps Engineer', 65000, 'IT');
INSERT INTO job (job_title, salary, department) VALUES ('UX Designer', 62000, 'Design');
INSERT INTO job (job_title, salary, department) VALUES ('Security Analyst', 68000, 'IT');
INSERT INTO job (job_title, salary, department) VALUES ('Operations Manager', 80000, 'Operations');
INSERT INTO job (job_title, salary, department) VALUES ('Chief Financial Officer', 120000, 'Finance');
INSERT INTO job (job_title, salary, department) VALUES ('Business Analyst', 58000, 'Business');
INSERT INTO job (job_title, salary, department) VALUES ('Legal Advisor', 70000, 'Legal');
INSERT INTO job (job_title, salary, department) VALUES ('Customer Support', 40000, 'Support');
INSERT INTO job (job_title, salary, department) VALUES ('Network Engineer', 64000, 'IT');
