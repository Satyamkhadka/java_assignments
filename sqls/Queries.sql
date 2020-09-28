

-- one 
select * from Incedient , IncedientMember where Incedient.IncedientID = IncedientMember.IncedientID;


-- two 
select * from Incedient , IncedientTruck,Trucks where Incedient.IncedientID = IncedientTruck.IncedientID and IncedientTruck.TruckID = Trucks.TruckID;  

---three 

select m.*, s.*,sf.* from Member m , StaffDetails s, Member_shift ms, Shifts sf where m.MemberID = s.MemberID and m.MemberID = ms.MemberID and ms.ShiftID = sf.ShiftID;


--- four 

select b.*, s.*, t.* from Brigade b, Stations s , Trucks t, Member m where b.BrigadeID = m.BrigadeID and m.StationID = s.StationID and s.StationID = t.StationID;         

--five 

select Brigade.BrigadeID,count( Member.MemberID ) Members from Brigade, Member where Member.BrigadeID = Brigade.BrigadeID group by Brigade.BrigadeID;


--six 

select Stations.StationID,count( Member.MemberID ) Members from Stations, Member where Member.StationID = Stations.StationID group by Stations.StationID;


