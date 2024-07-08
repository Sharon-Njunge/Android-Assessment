package layout
//
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akirachix.enwallet.R

class EnWalletAdapter(var enwalletList: View):
        RecyclerView.Adapter<EnWalletAdapter>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EnWalletAdapter {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.enwallet_list_item, parent,false)
        return EnWalletAdapter(itemView)

    }
    override fun onBindViewHolder(holder: EnWalletAdapter, position: Int) {
        val wallet = enwalletList[position]
        holder.tvText.text = enwalletList.get(position)
        holder.tvAmount.text = wallet.Amount

        override fun getItemCount(): Int {
        return enwalletList.size

    }
}



