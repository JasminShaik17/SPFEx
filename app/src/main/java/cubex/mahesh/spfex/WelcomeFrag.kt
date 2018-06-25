package cubex.mahesh.spfex

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class WelcomeFrag:Fragment( )
{

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {

        var v = inflater!!.inflate(R.layout.welcome_frag,container,
                false)

        return v
    }

}