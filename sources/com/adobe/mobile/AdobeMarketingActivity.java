package com.adobe.mobile;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import com.adobe.mobile.Config;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;

/* loaded from: classes4.dex */
public abstract class AdobeMarketingActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Config.b(getApplicationContext());
    }

    @Override // android.app.Activity
    public final void onPause() {
        Message message;
        super.onPause();
        if (StaticMethods.e) {
            StaticMethods.K("Analytics - Method pauseCollectingLifecycleData is not available for Wearable", new Object[0]);
            return;
        }
        int i = MessageAlert.x;
        synchronized (Messages.f) {
            message = Messages.e;
        }
        if (message != null && (message instanceof MessageAlert) && message.g != StaticMethods.r()) {
            MessageAlert messageAlert = (MessageAlert) message;
            AlertDialog alertDialog = messageAlert.w;
            if (alertDialog != null && alertDialog.isShowing()) {
                messageAlert.w.dismiss();
            }
            messageAlert.w = null;
        }
        StaticMethods.i().execute(new Config.AnonymousClass12());
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (StaticMethods.e) {
            StaticMethods.K("Analytics - Method collectLifecycleData is not available for Wearable", new Object[0]);
        } else {
            StaticMethods.i().execute(new Runnable() { // from class: com.adobe.mobile.Config.10
                @Override // java.lang.Runnable
                public final void run() throws JSONException, UnsupportedEncodingException {
                    Lifecycle.o(this.d);
                }
            });
        }
    }
}
