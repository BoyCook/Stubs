DROP SEQUENCE platform_sequence;
CREATE SEQUENCE platform_sequence INCREMENT BY 1 START WITH 35;
DELETE FROM platform;
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (0,0,'UNK','Unknown',null,null,null,null,null,null);
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (1,1,'ADLI','Assign, Design & Logical Inventory','802856805','803041354','803041354','team-platform-assign-design-and-logical-inventory-director','team-platform-assign-design-and-logical-inventory-architect','https://collaborate.bt.com/wiki/display/ADL');
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (2,1,'BPP','Billing & Payments','790174189','802043182','702108998','team-platform-billing-and-payments-director','team-platform-billing-and-payments-architect','https://collaborate.bt.com/wiki/display/BPP');
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (3,1,'CLB','Collaboration','600974107','802848244','802848244','team-platform-collaboration-director','team-platform-collaboration-architect','https://collaborate.bt.com/wiki/display/CLB');
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (5,1,'CMP','Customer Management','603403383','803176452','603634602','team-platform-customer-management-director','team-platform-customer-management-architect','https://collaborate.bt.com/wiki/display/CMP');
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (7,1,'DMP','Domain Management','701577269','701359551','701906922','team-platform-domain-management-director','team-platform-domain-management-architect','https://collaborate.bt.com/wiki/display/DMP');
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (9,1,'EIP','Enterprise Information','802363204','802040808','802048606','team-platform-enterprise-information-director','team-platform-enterprise-information-architect','https://collaborate.bt.com/wiki/display/EIP');
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (10,1,'EMP','Enterprise Management','600771782','702920019','802276009','team-platform-enterprise-management-director','team-platform-enterprise-management-architect','https://collaborate.bt.com/wiki/display/EMP');
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (8,1,'EWMP','Engineering Workforce Management','802855006','802371827','802851398','team-platform-engineering-workforce-management-director','team-platform-engineering-workforce-management-architect','https://collaborate.bt.com/wiki/display/EWMP');
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (11,1,'INT','Integration Infrastructure','803247602','600735685','', 'team-platform-integration-infrastructure-director','team-platform-integration-infrastructure-architect','https://collaborate.bt.com/wiki/display/MIP');
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (23,1,'SMIT','IT Service Management - SM(IT)','603870567','803096576','803096576','team-platform-smit-director','team-platform-smit-architect','https://collaborate.bt.com/wiki/pages/createpage.action?spaceKey=IPFM&title=Home');
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (12,1,'MDM','Master Data Management','802513128','802364300','603609549','team-platform-master-data-management-director','team-platform-master-data-management-architect','https://collaborate.bt.com/wiki/display/PortfolioManagement');
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (13,1,'NPR','Network Performance','603344365','802307659','790076155','team-platform-network-performance-director','team-platform-network-performance-architect','https://collaborate.bt.com/wiki/display/SMNP');
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (15,1,'PBP','Plan & Build','600937409','802519946','602227249','team-platform-plan-build-director','team-platform-plan-build-architect','https://collaborate.bt.com/wiki/pages/viewpage.action?pageId=8491');
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (19,1,'SURV','Surveillance','790175698','790120025','790120025','team-platform-surveillance-director','team-platform-surveillance-architect','https://collaborate.bt.com/wiki/display/SMS');
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (17,1,'SFW','Service Fulfilment & Workflow','602324085','802043540','700862861','team-platform-service-fulfilment-workflow-director','team-platform-service-fulfilment-workflow-architect','https://collaborate.bt.com/wiki/pages/viewpage.action?pageId=39562050');
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (20,1,'TDP','Test & Diagnostics','790175414','802849470','802849470','team-platform-test-diagnostics-director','team-platform-test-diagnostics-architect','https://collaborate.bt.com/wiki/display/SMNTP/SMNTP+Platform+Home');
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (21,1,'TMW','Trouble Management & Workflow','601383809','802848466','802848466','team-platform-trouble-management-workflow-director','team-platform-trouble-management-workflow-architect','https://collaborate.bt.com/wiki/display/TMW/Home');
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (4,1,'CIP','Computing Infrastructure','802962414','802591546','802591546','team-platform-computing-infrastructure-director','team-platform-computing-infrastructure-architect','https://collaborate.bt.com/wiki/pages/createpage.action?spaceKey=IPFM&title=Home');
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (30,1,'IPD','IP & Data','802044820','802083744','802885874','team-platform-ip-and-data-director','team-platform-ip-and-data-architect','http://collaborate.bt.com/wiki/display/BTDP/Advanced+Engineering+and+Evolution+-+Raymond+Zhang');
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (31,1,'TRAC','Transport & Access','602750808','701754929','802885874','team-platform-transport-and-access-director','team-platform-transport-and-access-architect','http://collaborate.bt.com/wiki/display/BTDP/Advanced+Engineering+and+Evolution+-+Raymond+Zhang');
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (32,1,'GNET','Global Network','701808134','802663809','802885874','team-platform-global-network-director','team-platform-global-network-architect','http://collaborate.bt.com/wiki/display/BTDP/Advanced+Engineering+and+Evolution+-+Raymond+Zhang');
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (34,1,'VMM','Voice & Multimedia','702998841','603664661','802885874','team-platform-voice-and-multimedia-director','team-platform-voice-and-multimedia-architect','http://collaborate.bt.com/wiki/display/BTDP/Advanced+Engineering+and+Evolution+-+Raymond+Zhang');
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (18,1,'SAAS','SaaS/WLS','602965721','602965721','602965721','team-platform-saas-director','team-platform-saas-architect','https://collaborate.bt.com/wiki/display/SaaSWL/SaaS+Programme+Homepage');
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (16,1,'SEC','Security','702994355','802722902','','team-platform-security-director','team-platform-security-architect','https://collaborate.bt.com/wiki/display/SRACF/Security+Platform+Home+Page');
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (22,1,'TOOLS' ,'Tools','702885561','702885561','702885561','team-platform-tools-director','team-platform-tools-architect','http://design.intra.bt.com/design/index/cha/cha-dso.htm');
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (6,1,'CPE','Customer Premises Equipment','600152727','603609341','603609341','team-platform-customer-premises-equipment-director','team-platform-customer-premises-equipment-architect',null);
INSERT INTO platform (id, active, code, name, director, architect, acf_partner, director_group, architect_group, homepage)
values (900,1,'TPS','Third Party Services',null,'802996457',null,'team-platform-third-party-services-director','team-platform-third-party-services-architect',null);

DROP SEQUENCE portfolio_sequence;
CREATE SEQUENCE portfolio_sequence INCREMENT BY 1 START WITH 7;
DELETE FROM portfolio;
INSERT INTO portfolio (id, active, name, architect, acf_partner)
values (1,1,'Retail','802048422','802334860');
INSERT INTO portfolio (id, active, name, architect, acf_partner)
values (2,1,'Wholesale','802852005','601973680');
INSERT INTO portfolio (id, active, name, architect, acf_partner)
values (3,1,'Global Services','802517027','802873345');
INSERT INTO portfolio (id, active, name, architect, acf_partner)
values (4,1,'Openreach','802513500','802592574');
INSERT INTO portfolio (id, active, name, architect, acf_partner)
values (5,1,'Group','702920019','802276009');
INSERT INTO portfolio (id, active, name, architect, acf_partner)
values (6,1,'Operate','802937900','802044035');


