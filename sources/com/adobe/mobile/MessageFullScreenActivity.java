package com.adobe.mobile;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* loaded from: classes4.dex */
public class MessageFullScreenActivity extends AdobeMarketingActivity {
    public MessageFullScreen d;

    @Override // android.app.Activity
    public final void onBackPressed() {
        MessageFullScreen messageFullScreen = this.d;
        if (messageFullScreen != null) {
            messageFullScreen.f = false;
            messageFullScreen.o();
        }
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.adobe.mobile.AdobeMarketingActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        MessageFullScreen messageFullScreen;
        super.onCreate(bundle);
        if (bundle != null) {
            MessageFullScreen messageFullScreenA = Messages.a(bundle.getString("MessageFullScreenActivity.messageId"));
            if (messageFullScreenA != null) {
                messageFullScreenA.s = bundle.getString("MessageFullScreenActivity.replacedHtml");
            }
            this.d = messageFullScreenA;
            synchronized (Messages.b) {
                Messages.f13272a = messageFullScreenA;
            }
        } else {
            synchronized (Messages.b) {
                messageFullScreen = Messages.f13272a;
            }
            this.d = messageFullScreen;
        }
        MessageFullScreen messageFullScreen2 = this.d;
        if (messageFullScreen2 != null) {
            messageFullScreen2.u = this;
            requestWindowFeature(1);
            setContentView(new RelativeLayout(this));
        } else {
            StaticMethods.K("Messages - unable to display fullscreen message, message is undefined", new Object[0]);
            Messages.c(null);
            finish();
            overridePendingTransition(0, 0);
        }
    }

    @Override // com.adobe.mobile.AdobeMarketingActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.d == null) {
            StaticMethods.K("Messages - unable to display fullscreen message, message is undefined", new Object[0]);
            Messages.c(null);
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        try {
            final ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
            if (viewGroup != null) {
                viewGroup.post(new Runnable() { // from class: com.adobe.mobile.MessageFullScreenActivity.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        MessageFullScreen messageFullScreen = MessageFullScreenActivity.this.d;
                        messageFullScreen.v = viewGroup;
                        int iR = StaticMethods.r();
                        if (messageFullScreen.f && messageFullScreen.g == iR) {
                            return;
                        }
                        messageFullScreen.g = iR;
                        new Handler(Looper.getMainLooper()).post(messageFullScreen.q(messageFullScreen));
                    }
                });
                return;
            }
            StaticMethods.J("Messages - unable to get root view group from os", new Object[0]);
            finish();
            overridePendingTransition(0, 0);
        } catch (NullPointerException e) {
            StaticMethods.K("Messages - content view is in undefined state (%s)", e.getMessage());
            finish();
            overridePendingTransition(0, 0);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("MessageFullScreenActivity.messageId", this.d.f13268a);
        bundle.putString("MessageFullScreenActivity.replacedHtml", this.d.s);
        super.onSaveInstanceState(bundle);
    }
}
