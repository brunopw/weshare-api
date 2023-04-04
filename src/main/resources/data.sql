INSERT INTO users (id, username, password, name, photo_id, passport, phone_number, birthday, user_type)
    VALUES (1, 'testUserTenant1', 'testPass1', 'test Tenant name one', null, 'AB123456', '+353 083 123 4567', '01/01/1990', 1);
INSERT INTO users (id, username, password, name, photo_id, passport, phone_number, birthday, user_type)
    VALUES (2, 'testUserLandlord2', 'testPass2', 'test Landlord name two', null, 'BB222222', '+353 081 222 8888', '10/04/1992', 0);

INSERT INTO accommodations (id, type, bathrooms, additional_rules, availability, description, facilities_id, landlord_id, tenant_id, location_id, rules_id, status)
    VALUES (1, 1, 2, null, '2023-03-24 16:34:26.222', 'House test', null, 2, 1, null, null, 0);
INSERT INTO accommodations (id, type, bathrooms, additional_rules, availability, description, facilities_id, landlord_id, tenant_id, location_id, rules_id, status)
    VALUES (2, 0, 1, null, '2023-02-01 10:00:00', 'Apartment test', null, 2, null, null, null, 0);

INSERT INTO photos (id, title, file)
    VALUES (1, 'bed1', 'https://img2.thejournal.ie/article/3492122/river?version=3492288&width=1340');
INSERT INTO photos (id, title, file)
    VALUES (2, 'bed2', 'https://img2.thejournal.ie/inline/3492224/original/?width=630&version=3492224');
INSERT INTO photos (id, title, file)
    VALUES (3, 'bed3', 'https://img2.thejournal.ie/inline/3492223/original/?width=630&version=3492223');
INSERT INTO photos (id, title, file)
    VALUES (4, 'bed1', 'https://img2.thejournal.ie/inline/3492286/original/?width=630&version=3492286');
INSERT INTO photos (id, title, file)
    VALUES (5, 'bed1', 'https://img2.thejournal.ie/inline/3492358/original/?width=630&version=3492358');

INSERT into accommodations_photos (accommodation_id, photo_id)
    VALUES (1, 1);
INSERT into accommodations_photos (accommodation_id, photo_id)
    VALUES (1, 2);
INSERT into accommodations_photos (accommodation_id, photo_id)
    VALUES (1, 3);
INSERT into accommodations_photos (accommodation_id, photo_id)
    VALUES (2, 1);

export const data = [
    { id: 1, status: 'Active', address: '22, O\'Connell Street, Dublin 1', postcode: 'D01 XX99', price: 1000, deposit: 1000, nextPaymentDate: '01/02/2023', paymentRecurrence: 'Monthly', landlord: 'Charles Xavier', tenant: 'Robert D\'onnal', owner: 'Robert D\'onnal',  images: [ { title: 'bed1', image: 'https://img2.thejournal.ie/article/3492122/river?version=3492288&width=1340' }, { title: 'bed2', image: 'https://img2.thejournal.ie/inline/3492224/original/?width=630&version=3492224'}, { title: 'bed3', image: 'https://img2.thejournal.ie/inline/3492223/original/?width=630&version=3492223'}],  type: 'House', numOfBeds: '2', numOfBaths: '2', description: 'Nice description about the house', rules: '\u2022\ No smoking \n\u2022\ No pets \n\u2022\ Cleaning twice per month', facilities: '\u2022\ Garden / Balcony \n\u2022\ Parking', bedType: 'Single', privacy: 'Entire Bedroom', coordinate: {latitude: 53.3457646, longitude: -6.2913966}, privacy: '\u2022\ Entire Bedroom \n\u2022\ Private Bathroom', offered: false, availability: 'Free' },
    { id: 2, status: 'Active', address: 'Castleway 2, Golden La, Dublin 2', postcode: 'D02 DH03', price: 1200, deposit: 1200, nextPaymentDate: '28/01/2023', paymentRecurrence: 'Monthly', landlord: 'Charles Xavier', tenant: 'Pedro Sampayo', owner: 'Chris Danney', images: [ { title: 'bed1', image: 'https://img2.thejournal.ie/inline/3492224/original/?width=630&version=3492224'} ],  type: 'Apartment', numOfBeds: '1', numOfBaths: '1', description: 'Nice description about the apartment', rules: '\u2022\ No smoking \n\u2022\ No pets \n\u2022\ Cleaning twice per month', facilities: '\u2022\ Garden / Balcony \n\u2022\ Parking', bedType: 'Double', coordinate: {latitude: 53.3499646, longitude: -6.2413006}, privacy: '\u2022\ Shared Bathroom', offered: true, offer: {id: 1, status: 'Active', type: 'Temporary', accommodation: 2, created: '01/12/2022', availableFrom: '01/01/2023', availableTo: '01/02/2023', price: 1100, deposit: 1100, paymentRecurrence: 'Montly'}, availability: 'Occupied' },
    { id: 3, status: 'Active', address: 'Castleway 3, Golden La, Dublin 3', postcode: 'D03 FH29', price: 800, deposit: 800, nextPaymentDate: '09/02/2023', paymentRecurrence: 'Monthly', landlord: 'Charles Xavier', tenant: 'Flavio Moura', owner: 'Flavio Moura', images: [ { title: 'bed1', image: 'https://img2.thejournal.ie/inline/3492223/original/?width=630&version=3492223'} ],  type: 'Apartment', numOfBeds: '2', numOfBaths: '1', description: 'Cool and quite palce', rules: '\u2022\ No smoking \n\u2022\ Cleaning twice per month', facilities: '\u2022\ Garden / Balcony \n\u2022\ Parking', bedType: 'Double', coordinate: {latitude: 53.3677646, longitude: -6.2513966}, privacy: '\u2022\ Entire Bedroom \n\u2022\ Private Bathroom \n\u2022\ En Suite', offered: true, offer: {id: 2, status: 'Active', type: 'Permanent', accommodation: 3, created: '02/12/2022', availableFrom: '02/12/2022', availableTo: '10/02/2023', price: 200, deposit: 300, paymentRecurrence: 'Weekly'}, availability: 'Occupied' },
    { id: 4, status: 'Active', address: 'Castleway 4, Harold\'s Cross, Dublin 6W', postcode: 'D6W NT29', price: 1500, deposit: 1000, nextPaymentDate: '10/02/2023', paymentRecurrence: 'Monthly', landlord: 'Charles Xavier', images: [ { title: 'bed1', image: 'https://img2.thejournal.ie/inline/3492286/original/?width=630&version=3492286'} ],  type: 'House', numOfBeds: '3', numOfBaths: '2', facilities: '\u2022\ Garden / Balcony \n\u2022\ Parking', bedType: 'Double', coordinate: {latitude: 53.3077646, longitude: -6.2213966}, privacy: '\u2022\ Shared Bathroom', offered: false, availability: 'Free' },
    { id: 5, status: 'Active', address: 'Castleway 5, Golden La, Dublin 8', postcode: 'D08 KK22', price: 1000, deposit: 1000, nextPaymentDate: '01/03/2023', paymentRecurrence: 'Monthly', landlord: 'John Master', images: [ { title: 'bed1', image: 'https://img2.thejournal.ie/inline/3492358/original/?width=630&version=3492358'} ],  type: 'Studio', numOfBeds: '2', numOfBaths: '2', facilities: '\u2022\ Garden / Balcony \n\u2022\ Parking \n\u2022\ Pets Allowed', bedType: 'Bunk', coordinate: {latitude: 53.3477646, longitude: -6.2413966}, privacy: '\u2022\ Shared Bathroom', offered: false, availability: 'Free' },
  ];
