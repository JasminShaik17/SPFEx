package cubex.mahesh.spfex

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class RegisterFrag:Fragment( )
{
    var et1:EditText? = null
    var et2:EditText? = null
    var et3:EditText? = null
    var et4:EditText? = null
    var b1:Button? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {

        var v = inflater!!.inflate(R.layout.register_frag,container,
                false)

        et1 = v.findViewById(R.id.ret1)
        et2 = v.findViewById(R.id.ret2)
        et3 = v.findViewById(R.id.ret3)
        et4 = v.findViewById(R.id.ret4)

        b1 = v.findViewById(R.id.reg_btn)
        b1!!.setOnClickListener({

            var spf = activity.getSharedPreferences("myspf",
                    Context.MODE_PRIVATE)
            var editor = spf.edit()
             editor.putString("email",et1!!.text.toString())
            editor.putString("pass",et2!!.text.toString())
            editor.putLong("mno",et3!!.text.toString().toLong())
            editor.putString("gender",et4!!.text.toString())
            editor.commit()

            var fManager = fragmentManager
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frame1,LoginFrag())
            tx.commit()

        })

        return v
    }

}