




CREATE TABLE [Brigade] (
  [BrigadeID] int PRIMARY KEY,
  [BrigadeName] nvarchar(255),
  [BrigadeType] nvarchar(255)
);

CREATE TABLE [Member] (
  [MemberID] int PRIMARY KEY,
  [FirstName] nvarchar(255),
  [LastName] nvarchar(255),
  [DOB] nvarchar(255),
  [Street] nvarchar(255),
  [City] nvarchar(255),
  [State] nvarchar(255),
  [PostCode] nvarchar(255),
  [Gender] nvarchar(255),
  [Phone] nvarchar(255),
  [BrigadeID] int,
  [StationID] int,
  [MemberType] nvarchar(255)
);

CREATE TABLE [Stations] (
  [StationID] int PRIMARY KEY,
  [StationType] nvarchar(255),
  [BuildDate] datetime,
  [StationStreet] nvarchar(255),
  [StationCity] nvarchar(255)
);

CREATE TABLE [Member_shift] (
  [ShiftID] int,
  [MemberID] int
);

CREATE TABLE [StaffDetails] (
  [StaffID] int PRIMARY KEY,
  [MemberID] int,
  [PayRate] int
);

CREATE TABLE [Trucks] (
  [TruckID] int PRIMARY KEY,
  [TruckTypeID] int,
  [make] nvarchar(255),
  [model] nvarchar(255),
  [makeYear] nvarchar(255),
  [StationID] int,
  [Capacity] int
);

CREATE TABLE [IncedientMember] (
  [IncedientID] int,
  [MemberID] int
);

CREATE TABLE [Shifts] (
  [ShiftID] int PRIMARY KEY,
  [ShiftStart] datetime,
  [ShiftEnd] datetime
);

CREATE TABLE [IncedientTruck] (
  [IncedientID] int,
  [TruckID] int
);

CREATE TABLE [TruckTypes] (
  [TruckTypeID] int PRIMARY KEY,
  [TruckType] nvarchar(255)
);

CREATE TABLE [Incedient] (
  [IncedientID] int PRIMARY KEY,
  [IncidentType] nvarchar(255),
  [StartDate] date,
  [StartTime] time,
  [FinishDate] date,
  [FinishTime] time
);




