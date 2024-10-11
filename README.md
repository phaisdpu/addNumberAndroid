---AndroidStudio-
---เลือก VCS -> Enable version Control integration -> มี ป๊อปอัพ เลือก Git แล้ว Ok
---จะเปลี่ยน VCS เป็น Git  
---จะมี master คลิกดู จะมีคำสั่ง upload , commit , push  **ดูที่กล่องไฟล์โปรแจค จะมี ฟอร์เดอร์ git เพิ่มขึ้นมาด้วย
---คลิกที่  Android (ซ้ายบน) คลิปลูกศรลง เลือกเปลี่ยนเป็น project
---แล้วคลิกขวาที่ชื่อ โปรเจค(งาน) เลือก Git  -> +Add
---แล้วคลิกขวาที่ชื่อ โปรเจค(งาน) เลือก Git  -> Commit Directory.. ->มีหน้าต่าง ให้ใส่ ข้อความสำหรับการปรับปรุงหรืออัพเดท  "" -> Commit  เช่นใส่คำว่า Final Commit
---แล้วคลิกขวาที่ชื่อ โปรเจค(งาน) เลือก Git  -> Push -> จะมีหน้าต่างและคลิกเลือก master --Define remote -> origin ใส่ URL: <<Github>> ตัวอย่าง URL: https://github.com/xxxxxxxxxxx/addNumberAndroid -> Ok ->ท push commit จะเพิ่มส่วน ที่ได้ commit ไว้ในที่นี้คือ Final Commit -> Push
--มีหน้าต่างให้เลือกเข้าlogin Github คือ VIA และ Token
--การเข้าแบบ Token
--ใส่Token: ที่ได้มา  -> Ok 
--เสร็จแล้วตรวจดูที่github ว่ามีข้อมูลที่อัพไหม

*****วิธีหา Token -> Github ที่ หน้าโปรไฟล์  (ขวาบน) เลือก Settings -> <>Developer settings  -> Personal access tokens -> Tokens(classic) ->Generate new token-> Generate new token(classic) -> Note: (ตั้งชื่อโน็ตไว้) , Expiration: 7days , Select scopes เลือก repo ทั้งหมด , admin:org เลือก read:org (write:org) , เลือก gits -> Generate token -> จะได้ KeyToken มา ควรเซฟไว้กันหาย ในที่นี้คือ 
