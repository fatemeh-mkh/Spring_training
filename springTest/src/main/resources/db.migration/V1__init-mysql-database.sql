CREATE TABLE newCustomers (
    customerId INT not null,
    name VARCHAR(50) not null,
    email VARCHAR(450) not null,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    PRIMARY KEY (customerId)
);