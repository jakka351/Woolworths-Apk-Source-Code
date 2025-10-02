package com.adobe.mobile;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.adobe.mobile.Messages;
import com.adobe.mobile.StaticMethods;

/* loaded from: classes4.dex */
final class MessageOpenURL extends MessageTemplateCallback {
    @Override // com.adobe.mobile.MessageTemplateCallback, com.adobe.mobile.Message
    public final void n() {
        try {
            Activity activityQ = StaticMethods.q();
            if (this.b == Messages.MessageShowRule.MESSAGE_SHOW_RULE_ONCE) {
                a();
            }
            String strP = p();
            StaticMethods.I("%s - Creating intent with uri: %s", "OpenURL", strP);
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(strP));
                activityQ.startActivity(intent);
            } catch (Exception e) {
                StaticMethods.I("%s - Could not load intent for message (%s)", "OpenURL", e.toString());
            }
        } catch (StaticMethods.NullActivityException e2) {
            StaticMethods.J(e2.getMessage(), new Object[0]);
        }
    }

    @Override // com.adobe.mobile.MessageTemplateCallback
    public final String r() {
        return "OpenURL";
    }
}
