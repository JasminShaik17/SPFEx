package cubex.mahesh.spfex

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginFrag:Fragment( )
{
    var et1: EditText? = null
    var et2: EditText? = null
    var b1: Button? = null
    var b2: Button? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {

        var v = inflater!!.inflate(R.layout.login_frag,container,
                false)

        et1 = v.findViewById(R.id.let1)
        et2 = v.findViewById(R.id.let2)
        b1 = v.findViewById(R.id.login_btn)
        b2 = v.findViewById(R.id.register_btn)

        b1!!.setOnClickListener({

            var spf = activity.getSharedPreferences("myspf",
                    Context.MODE_PRIVATE)
            var email = spf.getString("email","no_value")
            var pass = spf.getString("pass","no_value")

            if(email.equals(et1!!.text.toString(),true) &&
                    pass.equals(et2!!.text.toString(),true)){
                var fManager = fragmentManager
                var tx = fManager.beginTransaction()
                tx.replace(R.id.frame1,WelcomeFrag())
                tx.addToBackStack("true")
                tx.commit()
            }else{
     Toast.makeText(activity,"Invalid User...",
             Toast.LENGTH_LONG).show()
            }

        })

        b2!!.setOnClickListener({
            var fManager = fragmentManager
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frame1,RegisterFrag())
            tx.commit()
        })

        return v
    }

}