package layout

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.colorpredictio.databinding.RecyclerviewBinding

class RvAdapter(
    private val myList: ArrayList<RvModel>,
    private val onOddsAClicked: (RvModel) -> Unit,
    private val onOddsBClicked: (RvModel) -> Unit
) : RecyclerView.Adapter<RvAdapter.ViewHolder>() {

    inner class ViewHolder(var binding: RecyclerviewBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.odd1.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    onOddsAClicked(myList[position])
                }
            }
            binding.odd2.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    onOddsBClicked(myList[position])
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = RecyclerviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return myList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.time.text = myList[position].time
        holder.binding.team1.text = myList[position].team1
        holder.binding.team2.text = myList[position].team2

    }
}
