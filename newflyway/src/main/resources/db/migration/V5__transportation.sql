CREATE TABLE Transportation (
    id SERIAL PRIMARY KEY,
    vehicle_type VARCHAR(50) NOT NULL,
    capacity INT NOT NULL,
    operator VARCHAR(100),
    status VARCHAR(20)
);
INSERT INTO Transportation (vehicle_type, capacity, operator, status) VALUES
('Bus', 50, 'Company A', 'Active'),
('Train', 200, 'Company B', 'Active'),
('Car', 4, 'Company C', 'Inactive'),
('Bike', 2, 'Company D', 'Active'),
('Bus', 60, 'Company E', 'Active'),
('Train', 250, 'Company F', 'Inactive'),
('Car', 5, 'Company G', 'Active'),
('Bike', 1, 'Company H', 'Inactive'),
('Bus', 45, 'Company I', 'Active'),
('Train', 180, 'Company J', 'Active');