



ALTER TABLE [Member] ADD FOREIGN KEY ([MemberID]) REFERENCES [IncedientMember] ([MemberID])
GO

ALTER TABLE [Member] ADD FOREIGN KEY ([BrigadeID]) REFERENCES [Brigade] ([BrigadeID])
GO

ALTER TABLE [Stations] ADD FOREIGN KEY ([StationID]) REFERENCES [Member] ([MemberID])
GO

ALTER TABLE [Member_shift] ADD FOREIGN KEY ([ShiftID]) REFERENCES [Shifts] ([ShiftID])
GO

ALTER TABLE [Member_shift] ADD FOREIGN KEY ([MemberID]) REFERENCES [Member] ([MemberID])
GO

ALTER TABLE [StaffDetails] ADD FOREIGN KEY ([MemberID]) REFERENCES [Member] ([MemberID])
GO

ALTER TABLE [Trucks] ADD FOREIGN KEY ([TruckTypeID]) REFERENCES [TruckTypes] ([TruckTypeID])
GO

ALTER TABLE [Trucks] ADD FOREIGN KEY ([StationID]) REFERENCES [Stations] ([StationID])
GO

ALTER TABLE [IncedientTruck] ADD FOREIGN KEY ([IncedientID]) REFERENCES [IncedientMember] ([IncedientID])
GO

ALTER TABLE [IncedientTruck] ADD FOREIGN KEY ([TruckID]) REFERENCES [Trucks] ([TruckID])
GO

ALTER TABLE [Incedient] ADD FOREIGN KEY ([IncedientID]) REFERENCES [IncedientMember] ([IncedientID])
GO





