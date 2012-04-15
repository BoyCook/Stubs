DROP SEQUENCE bdf_programme_sequence;
CREATE SEQUENCE bdf_programme_sequence INCREMENT BY 1 START WITH 5;
DELETE FROM bdf_programme;
INSERT INTO bdf_programme (id, active, name, architect, acf_partner)
values (1,1,'TSR Undertakings','802362269','802362269');
INSERT INTO bdf_programme (id, active, name, architect, acf_partner)
values (2,1,'21CN','790078340','802664066');
INSERT INTO bdf_programme (id, active, name, architect, acf_partner)
values (3,1,'NGA','802513500','803242065');
INSERT INTO bdf_programme (id, active, name, architect, acf_partner)
values (4,1,'Milestone','802517027','802873345');
