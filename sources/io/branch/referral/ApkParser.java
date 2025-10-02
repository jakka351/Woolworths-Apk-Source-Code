package io.branch.referral;

import android.content.Context;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class ApkParser {
    public static int a(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 3] << 24) & (-16777216)) | ((bArr[i + 2] << 16) & 16711680) | ((bArr[i + 1] << 8) & 65280);
    }

    public static String b(int i, int i2, byte[] bArr) {
        if (i2 < 0) {
            return null;
        }
        int iA = i + a((i2 * 4) + 36, bArr);
        int i3 = ((bArr[iA + 1] << 8) & 65280) | (bArr[iA] & 255);
        byte[] bArr2 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr2[i4] = bArr[(i4 * 2) + iA + 2];
        }
        return new String(bArr2);
    }

    public static JSONObject c(Context context, byte[] bArr) throws JSONException {
        int i;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        int iA = (a(16, bArr) * 4) + 36;
        int iA2 = a(12, bArr);
        int i2 = iA2;
        while (true) {
            i = 1048834;
            if (i2 >= bArr.length - 4) {
                break;
            }
            if (a(i2, bArr) == 1048834) {
                iA2 = i2;
                break;
            }
            i2 += 4;
        }
        String str = "";
        while (iA2 < bArr.length) {
            try {
                int iA3 = a(iA2, bArr);
                if (iA3 != i) {
                    if (iA3 != 1048835) {
                        break;
                    }
                    iA2 += 24;
                } else {
                    int iA4 = a(iA2 + 28, bArr);
                    iA2 += 36;
                    int i3 = 0;
                    while (i3 < iA4) {
                        int iA5 = a(iA2 + 4, bArr);
                        int iA6 = a(iA2 + 8, bArr);
                        int iA7 = a(iA2 + 16, bArr);
                        int i4 = iA2 + 20;
                        String strB = b(iA, iA5, bArr);
                        int i5 = iA4;
                        if ("scheme".equals(strB)) {
                            String strB2 = iA6 != -1 ? b(iA, iA6, bArr) : BranchUtil.b(iA7, context);
                            if (d(strB2)) {
                                if (!jSONObject.has(strB2)) {
                                    jSONObject.put(strB2, new JSONArray());
                                } else if (jSONObject.has("0")) {
                                    jSONObject.put(strB2, (JSONArray) jSONObject.get("0"));
                                    jSONObject.remove("0");
                                }
                                str = strB2;
                            }
                            if ("http".equals(strB2) || "https".equals(strB2)) {
                                str = strB2;
                            }
                        } else if ("host".equals(strB)) {
                            String strB3 = iA6 != -1 ? b(iA, iA6, bArr) : BranchUtil.b(iA7, context);
                            if (jSONObject.has(str) && str != null && !"https".equals(str) && !"http".equals(str)) {
                                JSONArray jSONArray2 = jSONObject.getJSONArray(str);
                                jSONArray2.put(strB3);
                                jSONObject.put(str, jSONArray2);
                            } else if ("https".equals(str) || "http".equals(str)) {
                                jSONArray.put(strB3);
                            } else {
                                JSONArray jSONArray3 = new JSONArray();
                                jSONArray3.put(strB3);
                                jSONObject.put("0", jSONArray3);
                            }
                        } else if (AppMeasurementSdk.ConditionalUserProperty.NAME.equals(strB)) {
                            if ("android.intent.action.VIEW".equals(iA6 != -1 ? b(iA, iA6, bArr) : BranchUtil.b(iA7, context))) {
                                str = null;
                            }
                        }
                        i3++;
                        iA2 = i4;
                        iA4 = i5;
                    }
                }
                i = 1048834;
            } catch (JSONException e) {
                c.z(e, new StringBuilder("Caught JSONException "));
                return jSONObject2;
            }
        }
        jSONObject.remove("0");
        jSONObject2.put("uri_scheme", jSONObject);
        jSONObject2.put("app_links", jSONArray);
        return jSONObject2;
    }

    public static boolean d(String str) {
        return (str == null || "http".equals(str) || str.equals("https") || str.equals("geo") || str.equals("*") || str.equals("package") || str.equals("sms") || str.equals("smsto") || str.equals("mms") || str.equals("mmsto") || str.equals("tel") || str.equals("voicemail") || str.equals("file") || str.equals("content") || str.equals("mailto")) ? false : true;
    }
}
