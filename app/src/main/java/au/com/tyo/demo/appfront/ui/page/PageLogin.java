package au.com.tyo.demo.appfront.ui.page;

import android.app.Activity;

import au.com.tyo.app.Controller;
import au.com.tyo.demo.appfront.R;

/**
 * Created by Eric Tang (eric.tang@tyo.com.au) on 27/11/17.
 */

public class PageLogin extends PageEmailPassword {

    /**
     * @param controller
     * @param activity
     */
    public PageLogin(Controller controller, Activity activity) {
        super(controller, activity);

        setContentViewResId(R.layout.login);
    }
}
