-- PRODUCENCI (To już masz, zostawiam dla porządku)
INSERT INTO PRODUCER (NAME) VALUES ('Apple');
INSERT INTO PRODUCER (NAME) VALUES ('Asus');
INSERT INTO PRODUCER (NAME) VALUES ('Samsung');
INSERT INTO PRODUCER (NAME) VALUES ('Dell');
INSERT INTO PRODUCER (NAME) VALUES ('Lenovo');

INSERT INTO PRODUCT (NAME, PRICE, CURRENCY, PRODUCER_ID, ATTRIBUTES)
VALUES ('iPhone 15', 4500.00, 'PLN', 1,
'{"color": "Space Black", "storage": "128GB", "screen": "6.1 Super Retina XDR", "chip": "A16 Bionic", "camera": "48MP Main", "connector": "USB-C", "water_resistance": "IP68"}');

INSERT INTO PRODUCT (NAME, PRICE, CURRENCY, PRODUCER_ID, ATTRIBUTES)
VALUES ('ZenBook 14', 3800.00, 'PLN', 2,
'{"ram": "16GB LPDDR5", "cpu": "Intel Core i7-1360P", "gpu": "Intel Iris Xe", "display": "14.0 OLED 2.8K", "storage": "512GB NVMe", "weight": "1.39kg", "os": "Windows 11"}');

INSERT INTO PRODUCT (NAME, PRICE, CURRENCY, PRODUCER_ID, ATTRIBUTES)
VALUES ('Galaxy S24', 4200.00, 'PLN', 3,
'{"color": "Amber Yellow", "storage": "256GB", "ram": "8GB", "display": "6.2 Dynamic AMOLED 2X", "refresh_rate": "120Hz", "ai_features": "Circle to Search", "battery": "4000mAh"}');

INSERT INTO PRODUCT (NAME, PRICE, CURRENCY, PRODUCER_ID, ATTRIBUTES)
VALUES ('XPS 13', 6000.00, 'PLN', 4,
'{"weight": "1.17kg", "touch": "yes", "material": "CNC Aluminum", "keyboard": "Edge-to-edge", "display": "13.4 InfinityEdge", "resolution": "1920x1200", "ports": "2x Thunderbolt 4"}');

INSERT INTO PRODUCT (NAME, PRICE, CURRENCY, PRODUCER_ID, ATTRIBUTES)
VALUES ('ThinkPad X1', 7500.00, 'PLN', 5,
'{"keyboard": "Backlit Spill-resistant", "battery": "57Wh Fast Charge", "security": "Fingerprint Reader", "webcam": "1080p IR", "durability": "MIL-STD 810H", "wwan": "5G Ready", "warranty": "3 years onsite"}');