package layout

import com.example.colorpredictio.R


object Object {
    private lateinit var mylist:ArrayList<RvModel>

    var team1array= arrayOf("CSK","RR","KKR")
    var team2array= arrayOf("RCB","HYD","PB")
    var timearray= arrayOf("Sat, 21 Jul 1:00 Pm","Sat, 21 Jul 3:00 Pm","Sun, 22 Jul 1:00 Pm")
    var odd1array= arrayOf("2.00","2.00","2.00")
    var odd2array= arrayOf("2.50","2.50","2.50")
    fun getData():ArrayList<RvModel> {
        mylist = ArrayList<RvModel>()
        for (index in team1array.indices) {
            var m =
                RvModel(
                    timearray[index], team1array[index], team2array[index], odd1array[index],
                    odd2array[index])
            mylist.add(m)
        }
        return mylist
    }
}