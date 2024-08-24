-- Create suppliers table
CREATE TABLE suppliers (
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    location VARCHAR(255) NOT NULL,
    nature_of_business VARCHAR(255) NOT NULL,
    manufacturing_processes VARCHAR(255) NOT NULL
);

-- Create the supplier_manufacturing_processes table
CREATE TABLE supplier_manufacturing_processes (
    supplier_supplier_id BIGINT,
    manufacturing_processes VARCHAR(255) CHECK (manufacturing_processes IN ('CASTING', 'COATING', 'MOULDING', '3D_PRINTING')),
    FOREIGN KEY (supplier_supplier_id) REFERENCES supplier(supplier_id)
);
