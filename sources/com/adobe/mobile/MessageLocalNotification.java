package com.adobe.mobile;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import com.adobe.mobile.StaticMethods;
import java.io.Serializable;
import java.security.SecureRandom;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
final class MessageLocalNotification extends Message {
    public String r;
    public String s;
    public String t;
    public Integer u;

    @Override // com.adobe.mobile.Message
    public final boolean f(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || jSONObject.length() <= 0 || !super.f(jSONObject)) {
            return false;
        }
        StaticMethods.I("Messages -  Building Local Notification message.", new Object[0]);
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("payload");
            if (jSONObject2.length() <= 0) {
                StaticMethods.I("Messages - Unable to create local notification message \"%s\", payload is empty", this.f13268a);
                return false;
            }
            try {
                String string = jSONObject2.getString("content");
                this.r = string;
                if (string.length() <= 0) {
                    StaticMethods.I("Messages - Unable to create local notification message \"%s\", content is empty", this.f13268a);
                    return false;
                }
                try {
                    this.u = Integer.valueOf(jSONObject2.getInt("wait"));
                    try {
                        this.s = jSONObject2.getString("adb_deeplink");
                    } catch (JSONException unused) {
                        StaticMethods.I("Messages - Tried to read deeplink for local notification message but found none.  This is not a required field", new Object[0]);
                    }
                    try {
                        this.t = jSONObject2.getJSONObject("userData").toString();
                    } catch (NullPointerException unused2) {
                        StaticMethods.I("Messages - Tried to read userData for local notification message but found none.  This is not a required field", new Object[0]);
                    } catch (JSONException unused3) {
                        StaticMethods.I("Messages - Tried to read userData for local notification message but found none.  This is not a required field", new Object[0]);
                    }
                    StaticMethods.I("Message created with: \n MessageID: \"%s\" \n Content: \"%s\" \n Delay: \"%d\" \n Deeplink: \"%s\" \n User Data: \"%s\"", this.f13268a, this.r, this.u, this.s, this.t);
                    return true;
                } catch (JSONException unused4) {
                    StaticMethods.I("Messages - Unable to create local notification message \"%s\", localNotificationDelay is required", this.f13268a);
                    return false;
                }
            } catch (JSONException unused5) {
                StaticMethods.I("Messages - Unable to create local notification message \"%s\", content is required", this.f13268a);
                return false;
            }
        } catch (JSONException unused6) {
            StaticMethods.I("Messages - Unable to create local notification message \"%s\", payload is required", this.f13268a);
            return false;
        }
    }

    @Override // com.adobe.mobile.Message
    public final void n() {
        super.n();
        j();
        try {
            Activity activityQ = StaticMethods.q();
            int iNextInt = new SecureRandom().nextInt();
            Calendar calendar = Calendar.getInstance();
            calendar.add(13, this.u.intValue());
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setClass(activityQ, MessageNotificationHandler.class);
            intent.putExtra("adbMessageCode", (Serializable) 750183);
            intent.putExtra("adb_m_l_id", this.f13268a);
            intent.putExtra("requestCode", iNextInt);
            intent.putExtra("userData", this.t);
            intent.putExtra("adb_deeplink", this.s);
            intent.putExtra("alarm_message", this.r);
            try {
                ((AlarmManager) StaticMethods.A().getSystemService("alarm")).set(0, calendar.getTimeInMillis(), PendingIntent.getBroadcast(StaticMethods.A(), iNextInt, intent, 134217728));
            } catch (StaticMethods.NullContextException e) {
                StaticMethods.J("Messaging - Error scheduling local notification (%s)", e.getMessage());
            }
        } catch (StaticMethods.NullActivityException e2) {
            StaticMethods.J(e2.getMessage(), new Object[0]);
        }
    }
}
