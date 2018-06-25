package cubex.mahesh.spfex

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fManager = fragmentManager
        var tx = fManager.beginTransaction()
        tx.add(R.id.frame1,LoginFrag())
        tx.commit()

    }
}
