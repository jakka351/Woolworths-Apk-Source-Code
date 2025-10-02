package com.adobe.mobile;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.adobe.mobile.StaticMethods;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
final class MessageAlert extends Message {
    public static final /* synthetic */ int x = 0;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public AlertDialog w;

    public static final class MessageShower implements Runnable {
        public final MessageAlert d;

        public static final class CancelClickHandler implements DialogInterface.OnCancelListener {
            public final MessageAlert d;

            public CancelClickHandler(MessageAlert messageAlert) {
                this.d = messageAlert;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                MessageAlert messageAlert = this.d;
                messageAlert.o();
                messageAlert.f = false;
            }
        }

        public static final class NegativeClickHandler implements DialogInterface.OnClickListener {
            public final MessageAlert d;

            public NegativeClickHandler(MessageAlert messageAlert) {
                this.d = messageAlert;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MessageAlert messageAlert = this.d;
                messageAlert.o();
                messageAlert.f = false;
            }
        }

        public static final class PositiveClickHandler implements DialogInterface.OnClickListener {
            public final MessageAlert d;

            public PositiveClickHandler(MessageAlert messageAlert) {
                this.d = messageAlert;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) throws UnsupportedEncodingException {
                MessageAlert messageAlert = this.d;
                messageAlert.c();
                messageAlert.f = false;
                String str = messageAlert.t;
                if (str == null || str.length() <= 0) {
                    return;
                }
                new HashMap();
                HashMap mapB = messageAlert.b(Message.e(messageAlert.t), true);
                mapB.put("{userId}", "0");
                mapB.put("{trackingId}", "0");
                mapB.put("{messageId}", messageAlert.f13268a);
                mapB.put("{lifetimeValue}", AnalyticsTrackLifetimeValueIncrease.a().toString());
                if (MobileConfig.b().l == MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_IN) {
                    mapB.put("{userId}", StaticMethods.F() == null ? "" : StaticMethods.F());
                    mapB.put("{trackingId}", StaticMethods.g() != null ? StaticMethods.g() : "");
                }
                String strF = StaticMethods.f(messageAlert.t, mapB);
                try {
                    Activity activityQ = StaticMethods.q();
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse(strF));
                        activityQ.startActivity(intent);
                    } catch (Exception e) {
                        StaticMethods.I("Messages - Could not load click-through intent for message (%s)", e.toString());
                    }
                } catch (StaticMethods.NullActivityException e2) {
                    StaticMethods.J(e2.getMessage(), new Object[0]);
                }
            }
        }

        public MessageShower(MessageAlert messageAlert) {
            this.d = messageAlert;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MessageAlert messageAlert = this.d;
            try {
                try {
                    AlertDialog.Builder builder = new AlertDialog.Builder(StaticMethods.q());
                    builder.setTitle(messageAlert.r);
                    builder.setMessage(messageAlert.s);
                    String str = messageAlert.u;
                    if (str != null && !str.isEmpty()) {
                        builder.setPositiveButton(messageAlert.u, new PositiveClickHandler(messageAlert));
                    }
                    builder.setNegativeButton(messageAlert.v, new NegativeClickHandler(messageAlert));
                    builder.setOnCancelListener(new CancelClickHandler(messageAlert));
                    AlertDialog alertDialogCreate = builder.create();
                    messageAlert.w = alertDialogCreate;
                    alertDialogCreate.setCanceledOnTouchOutside(false);
                    messageAlert.w.show();
                    messageAlert.f = true;
                } catch (Exception e) {
                    StaticMethods.I("Messages - Could not show alert message (%s)", e.toString());
                }
            } catch (StaticMethods.NullActivityException e2) {
                StaticMethods.J(e2.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.adobe.mobile.Message
    public final boolean f(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || jSONObject.length() <= 0 || !super.f(jSONObject)) {
            return false;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("payload");
            if (jSONObject2.length() <= 0) {
                StaticMethods.K("Messages - Unable to create alert message \"%s\", payload is empty", this.f13268a);
                return false;
            }
            try {
                String string = jSONObject2.getString("title");
                this.r = string;
                if (string.length() <= 0) {
                    StaticMethods.K("Messages - Unable to create alert message \"%s\", title is empty", this.f13268a);
                    return false;
                }
                try {
                    String string2 = jSONObject2.getString("content");
                    this.s = string2;
                    if (string2.length() <= 0) {
                        StaticMethods.K("Messages - Unable to create alert message \"%s\", content is empty", this.f13268a);
                        return false;
                    }
                    try {
                        String string3 = jSONObject2.getString("cancel");
                        this.v = string3;
                        if (string3.length() <= 0) {
                            StaticMethods.K("Messages - Unable to create alert message \"%s\", cancel is empty", this.f13268a);
                            return false;
                        }
                        try {
                            this.u = jSONObject2.getString("confirm");
                        } catch (JSONException unused) {
                            StaticMethods.I("Messages - Tried to read \"confirm\" for alert message but found none. This is not a required field", new Object[0]);
                        }
                        try {
                            this.t = jSONObject2.getString("url");
                            return true;
                        } catch (JSONException unused2) {
                            StaticMethods.I("Messages - Tried to read url for alert message but found none. This is not a required field", new Object[0]);
                            return true;
                        }
                    } catch (JSONException unused3) {
                        StaticMethods.K("Messages - Unable to create alert message \"%s\", cancel is required", this.f13268a);
                        return false;
                    }
                } catch (JSONException unused4) {
                    StaticMethods.K("Messages - Unable to create alert message \"%s\", content is required", this.f13268a);
                    return false;
                }
            } catch (JSONException unused5) {
                StaticMethods.K("Messages - Unable to create alert message \"%s\", title is required", this.f13268a);
                return false;
            }
        } catch (JSONException unused6) {
            StaticMethods.K("Messages - Unable to create alert message \"%s\", payload is required", this.f13268a);
            return false;
        }
    }

    @Override // com.adobe.mobile.Message
    public final void n() {
        String str;
        String str2 = this.v;
        if ((str2 == null || str2.length() < 1) && ((str = this.u) == null || str.length() < 1)) {
            return;
        }
        super.n();
        j();
        new Handler(Looper.getMainLooper()).post(new MessageShower(this));
    }
}
