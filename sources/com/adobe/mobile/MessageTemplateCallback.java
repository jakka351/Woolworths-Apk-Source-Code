package com.adobe.mobile;

import android.database.SQLException;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class MessageTemplateCallback extends Message {
    public String r;
    public String s;
    public String t;
    public int u;

    @Override // com.adobe.mobile.Message
    public boolean f(JSONObject jSONObject) throws JSONException {
        byte[] bArrDecode;
        if (jSONObject != null && jSONObject.length() > 0 && super.f(jSONObject)) {
            String strR = r();
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("payload");
                if (jSONObject2.length() <= 0) {
                    StaticMethods.I("%s - Unable to create data callback %s, \"payload\" is empty", strR, this.f13268a);
                    return false;
                }
                try {
                    String string = jSONObject2.getString("templateurl");
                    this.r = string;
                    if (string.length() <= 0) {
                        StaticMethods.I("%s - Unable to create data callback %s, \"templateurl\" is empty", strR, this.f13268a);
                        return false;
                    }
                    try {
                        this.u = jSONObject2.getInt("timeout");
                    } catch (JSONException unused) {
                        StaticMethods.I("%s - Tried to read \"timeout\" for data callback, but found none.  Using default value of two (2) seconds", strR);
                        this.u = 2;
                    }
                    try {
                        String string2 = jSONObject2.getString("templatebody");
                        if (string2 != null && string2.length() > 0 && (bArrDecode = Base64.decode(string2, 0)) != null) {
                            String str = new String(bArrDecode, "UTF-8");
                            if (str.length() > 0) {
                                this.s = str;
                            }
                        }
                    } catch (UnsupportedEncodingException e) {
                        StaticMethods.I("%s - Failed to decode \"templatebody\" for data callback (%s).  This is not a required field", strR, e.getLocalizedMessage());
                    } catch (IllegalArgumentException e2) {
                        StaticMethods.I("%s - Failed to decode \"templatebody\" for data callback (%s).  This is not a required field", strR, e2.getLocalizedMessage());
                    } catch (JSONException unused2) {
                        StaticMethods.I("%s - Tried to read \"templatebody\" for data callback, but found none.  This is not a required field", strR);
                    }
                    if (this.s.length() <= 0) {
                        return true;
                    }
                    try {
                        this.t = jSONObject2.getString("contenttype");
                        return true;
                    } catch (JSONException unused3) {
                        StaticMethods.I("%s - Tried to read \"contenttype\" for data callback, but found none.  This is not a required field", strR);
                        return true;
                    }
                } catch (JSONException unused4) {
                    StaticMethods.I("%s - Unable to create data callback %s, \"templateurl\" is required", strR, this.f13268a);
                    return false;
                }
            } catch (JSONException unused5) {
                StaticMethods.I("%s - Unable to create create data callback %s, \"payload\" is required", strR, this.f13268a);
            }
        }
        return false;
    }

    @Override // com.adobe.mobile.Message
    public void n() throws UnsupportedEncodingException {
        String strF;
        String strP = p();
        if (this.s.length() > 0) {
            HashMap mapB = b(Message.e(this.s), !(this.t == null ? false : r1.toLowerCase().contains("application/json")));
            ArrayList arrayList = new ArrayList();
            arrayList.add("{%all_url%}");
            arrayList.add("{%all_json%}");
            mapB.putAll(b(arrayList, false));
            strF = StaticMethods.f(this.s, mapB);
        } else {
            strF = null;
        }
        StaticMethods.I("%s - Request Queued (url:%s body:%s contentType:%s)", r(), strP, strF, this.t);
        ThirdPartyQueue thirdPartyQueueQ = q();
        String str = this.t;
        long jE = StaticMethods.E();
        long j = this.u;
        thirdPartyQueueQ.getClass();
        MobileConfig mobileConfigB = MobileConfig.b();
        if (mobileConfigB == null) {
            StaticMethods.J("%s - Cannot send hit, MobileConfig is null (this really shouldn't happen)", thirdPartyQueueQ.f);
            return;
        }
        if (mobileConfigB.l == MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_OUT) {
            StaticMethods.I("%s - Ignoring hit due to privacy status being opted out", thirdPartyQueueQ.f);
            return;
        }
        synchronized (thirdPartyQueueQ.d) {
            try {
                try {
                    try {
                        thirdPartyQueueQ.o.bindString(1, strP);
                        if (strF == null || strF.length() <= 0) {
                            thirdPartyQueueQ.o.bindNull(2);
                        } else {
                            thirdPartyQueueQ.o.bindString(2, strF);
                        }
                        if (str == null || str.length() <= 0) {
                            thirdPartyQueueQ.o.bindNull(3);
                        } else {
                            thirdPartyQueueQ.o.bindString(3, str);
                        }
                        thirdPartyQueueQ.o.bindLong(4, jE);
                        thirdPartyQueueQ.o.bindLong(5, j);
                        thirdPartyQueueQ.o.execute();
                        thirdPartyQueueQ.g++;
                        thirdPartyQueueQ.o.clearBindings();
                    } catch (Exception e) {
                        StaticMethods.J("%s - Unknown error while inserting url (%s)", thirdPartyQueueQ.f, strP);
                        thirdPartyQueueQ.g(e);
                    }
                } catch (SQLException e2) {
                    StaticMethods.J("%s - Unable to insert url (%s)", thirdPartyQueueQ.f, strP);
                    thirdPartyQueueQ.g(e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        thirdPartyQueueQ.k(false);
    }

    public final String p() {
        String str = this.r;
        if (str == null || str.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("{%all_url%}");
        HashMap mapB = b(Message.e(this.r), true);
        mapB.putAll(b(arrayList, false));
        return StaticMethods.f(this.r, mapB);
    }

    public ThirdPartyQueue q() {
        return ThirdPartyQueue.p();
    }

    public String r() {
        return "Postbacks";
    }
}
