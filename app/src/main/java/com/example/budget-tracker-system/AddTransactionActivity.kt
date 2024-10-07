package com.example.budgettracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.core.widget.addTextChangedListener
import androidx.room.Room
import com.example.budgettracker.databinding.AddTransactionActivityBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class AddTransactionActivity : ComponentActivity() {
    private lateinit var binding: AddTransactionActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AddTransactionActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.labelInput.addTextChangedListener {
            if (it!!.count() > 0)
                binding.labelLayout.error = null
        }
        binding.amountInput.addTextChangedListener {
            if (it!!.count() > 0)
                binding.amountLayout.error = null
        }

        binding.addTransactionBtn.setOnClickListener {
            val label: String = binding.labelInput.text.toString()
            val amount: Double? = binding.amountInput.text.toString().toDoubleOrNull()
            val description: String = binding.descriptionInput.text.toString()

            if (label.isEmpty())
                binding.labelLayout.error = "Please enter a valid label"

            else if (amount == null)
                binding.amountLayout.error = "Please enter a valid amount"
            else {
                val transaction =  Transaction(0, label, amount, description)
                insert(transaction)
            }
        }
        binding.closeBtn.setOnClickListener {
            finish()
        }
    }
    private fun insert(transaction: Transaction){
        val db = Room.databaseBuilder(this,
            AppDatabase::class.java,
            "transactions").build()

        GlobalScope.launch {
            db.transactionDao().insertAll(transaction)
            finish()
        }
    }
}
