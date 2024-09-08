package com.example.recyclerview2402

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.recyclerview2402.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    val names = listOf<String>(
        "Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah", "Isaac", "Judy",
        "Karl", "Liam", "Mia", "Nina", "Oscar", "Paul", "Quincy", "Rachel", "Steve", "Tracy",
        "Uma", "Victor", "Wendy", "Xander", "Yara", "Zach", "Amy", "Brian", "Catherine", "Daniel",
        "Emily", "Felix", "Gina", "Henry", "Ivy", "Jack", "Kara", "Leo", "Maya", "Noah",
        "Olivia", "Peter", "Quinn", "Rosa", "Sam", "Tina", "Ulysses", "Vera", "Will", "Xena",
        "Yvonne", "Zane", "Alice", "Bob", "Carmen", "Derek", "Ella", "Finn", "Grace", "Harrison",
        "Isla", "James", "Kelsey", "Liam", "Megan", "Nate", "Olivia", "Parker", "Quinn", "Ryan",
        "Sophia", "Tyler", "Ursula", "Vince", "Willa", "Xander", "Yasmine", "Zachary", "Amelia",
        "Blake", "Chloe", "Derek", "Eva", "Fiona", "Gabe", "Holly", "Ian", "Jasmine", "Kurt",
        "Lila", "Mark", "Nina", "Owen", "Penny", "Quinn", "Riley", "Sean", "Tara","Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah", "Isaac", "Judy",
        "Karl", "Liam", "Mia", "Nina", "Oscar", "Paul", "Quincy", "Rachel", "Steve", "Tracy",
        "Uma", "Victor", "Wendy", "Xander", "Yara", "Zach", "Amy", "Brian", "Catherine", "Daniel",
        "Emily", "Felix", "Gina", "Henry", "Ivy", "Jack", "Kara", "Leo", "Maya", "Noah",
        "Olivia", "Peter", "Quinn", "Rosa", "Sam", "Tina", "Ulysses", "Vera", "Will", "Xena",
        "Yvonne", "Zane", "Alice", "Bob", "Carmen", "Derek", "Ella", "Finn", "Grace", "Harrison",
        "Isla", "James", "Kelsey", "Liam", "Megan", "Nate", "Olivia", "Parker", "Quinn", "Ryan",
        "Sophia", "Tyler", "Ursula", "Vince", "Willa", "Xander", "Yasmine", "Zachary", "Amelia",
        "Blake", "Chloe", "Derek", "Eva", "Fiona", "Gabe", "Holly", "Ian", "Jasmine", "Kurt",
        "Lila", "Mark", "Nina", "Owen", "Penny", "Quinn", "Riley", "Sean", "Tara","Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah", "Isaac", "Judy",
        "Karl", "Liam", "Mia", "Nina", "Oscar", "Paul", "Quincy", "Rachel", "Steve", "Tracy",
        "Uma", "Victor", "Wendy", "Xander", "Yara", "Zach", "Amy", "Brian", "Catherine", "Daniel",
        "Emily", "Felix", "Gina", "Henry", "Ivy", "Jack", "Kara", "Leo", "Maya", "Noah",
        "Olivia", "Peter", "Quinn", "Rosa", "Sam", "Tina", "Ulysses", "Vera", "Will", "Xena",
        "Yvonne", "Zane", "Alice", "Bob", "Carmen", "Derek", "Ella", "Finn", "Grace", "Harrison",
        "Isla", "James", "Kelsey", "Liam", "Megan", "Nate", "Olivia", "Parker", "Quinn", "Ryan",
        "Sophia", "Tyler", "Ursula", "Vince", "Willa", "Xander", "Yasmine", "Zachary", "Amelia",
        "Blake", "Chloe", "Derek", "Eva", "Fiona", "Gabe", "Holly", "Ian", "Jasmine", "Kurt",
        "Lila", "Mark", "Nina", "Owen", "Penny", "Quinn", "Riley", "Sean", "Tara","Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah", "Isaac", "Judy",
        "Karl", "Liam", "Mia", "Nina", "Oscar", "Paul", "Quincy", "Rachel", "Steve", "Tracy",
        "Uma", "Victor", "Wendy", "Xander", "Yara", "Zach", "Amy", "Brian", "Catherine", "Daniel",
        "Emily", "Felix", "Gina", "Henry", "Ivy", "Jack", "Kara", "Leo", "Maya", "Noah",
        "Olivia", "Peter", "Quinn", "Rosa", "Sam", "Tina", "Ulysses", "Vera", "Will", "Xena",
        "Yvonne", "Zane", "Alice", "Bob", "Carmen", "Derek", "Ella", "Finn", "Grace", "Harrison",
        "Isla", "James", "Kelsey", "Liam", "Megan", "Nate", "Olivia", "Parker", "Quinn", "Ryan",
        "Sophia", "Tyler", "Ursula", "Vince", "Willa", "Xander", "Yasmine", "Zachary", "Amelia",
        "Blake", "Chloe", "Derek", "Eva", "Fiona", "Gabe", "Holly", "Ian", "Jasmine", "Kurt",
        "Lila", "Mark", "Nina", "Owen", "Penny", "Quinn", "Riley", "Sean", "Tara", "Ursula"
    )


    lateinit var ad: NameAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ad = NameAdapter()
        ad.submitList(names)

        binding.recyclerView.adapter = ad




    }
}