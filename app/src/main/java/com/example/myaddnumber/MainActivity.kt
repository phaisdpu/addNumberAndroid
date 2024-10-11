package com.example.myaddnumber

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myaddnumber.databinding.ActivityMainBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var name: String
    private lateinit var phone: String
    private lateinit var email: String
    private lateinit var maxNumber: String

    private var maxId: Int = 1

    private lateinit var database: FirebaseDatabase


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        database = FirebaseDatabase.getInstance()
        val ref = database.getReference().child("Members")


        ref.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()) {
                    maxId = snapshot.children.count()
                    maxId += 1
                } else {
                    ///
                }
            }

            override fun onCancelled(error: DatabaseError) {

            }
        })

        binding.sentButton.setOnClickListener {
            name = binding.editName.text.toString().trim()
            phone = binding.editPhone.text.toString().trim()
            email = binding.editEmail.text.toString().trim()
//            maxNumber = maxId.toString()
            maxNumber = "C00${maxId}"

//เลขไอดีแบบสุ่ม แต่ตั้งเลขสมาชิกเป็นตัวเลขที่กำหนดเอง
            val itemPushKey = database.getReference().child("Members").push().key

            val users = Member(name, phone, email, maxNumber)

            val memberRef = ref.child(itemPushKey!!)

            memberRef.setValue(users).addOnSuccessListener {
                Toast.makeText(this, "เลขอัตโตสุ่ม", Toast.LENGTH_SHORT).show()
            }
            //กำหนดเลขไอดี แบบเรียงลำดับเอง
//            val userId = ref.child(maxId.toString())
//            userId.setValue(users)

            Toast.makeText(this, "Sented Data", Toast.LENGTH_SHORT).show()
        }


    }


}