package com.behaviosec.rl.android;

import androidx.annotation.NonNull;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class SyncedJSONArray {
    public static int r0072007200720072r00720072 = 2;
    public static int r0072r00720072r00720072 = 73;
    public static int r0072rrr007200720072 = 0;
    public static int rr007200720072r00720072 = 1;
    private JSONArray iii0069iii = new JSONArray();

    private static JSONArray k006Bk006Bk006Bk(@NonNull JSONArray jSONArray) throws JSONException {
        try {
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                Object objKk006B006Bk006Bk = jSONArray.get(i);
                if (objKk006B006Bk006Bk instanceof JSONArray) {
                    objKk006B006Bk006Bk = k006Bk006Bk006Bk((JSONArray) objKk006B006Bk006Bk);
                    while (true) {
                        try {
                            int[] iArr = new int[-1];
                        } catch (Exception unused) {
                            r0072r00720072r00720072 = 2;
                        }
                    }
                } else if (objKk006B006Bk006Bk instanceof JSONObject) {
                    objKk006B006Bk006Bk = kk006B006Bk006Bk((JSONObject) objKk006B006Bk006Bk);
                }
                jSONArray2.put(objKk006B006Bk006Bk);
            }
            return jSONArray2;
        } catch (JSONException unused2) {
            return new JSONArray();
        }
    }

    private static JSONObject kk006B006Bk006Bk(@NonNull JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objK006Bk006Bk006Bk = jSONObject.get(next);
                if (objK006Bk006Bk006Bk instanceof JSONArray) {
                    objK006Bk006Bk006Bk = k006Bk006Bk006Bk((JSONArray) objK006Bk006Bk006Bk);
                    try {
                        throw null;
                    } catch (Exception unused) {
                        r0072r00720072r00720072 = rrrrr007200720072();
                    }
                } else if (objK006Bk006Bk006Bk instanceof JSONObject) {
                    objK006Bk006Bk006Bk = kk006B006Bk006Bk((JSONObject) objK006Bk006Bk006Bk);
                }
                jSONObject2.put(next, objK006Bk006Bk006Bk);
            }
            return jSONObject2;
        } catch (JSONException unused2) {
            return new JSONObject();
        }
    }

    public static int r00720072rr007200720072() {
        return 2;
    }

    public static int rr0072rr007200720072() {
        return 1;
    }

    public static int rrrrr007200720072() {
        return 78;
    }

    public synchronized void clear() {
        try {
            JSONArray jSONArray = new JSONArray();
            int iRrrrr007200720072 = rrrrr007200720072();
            if (((rr007200720072r00720072 + iRrrrr007200720072) * iRrrrr007200720072) % r0072007200720072r00720072 != 0) {
                r0072r00720072r00720072 = 70;
                rr007200720072r00720072 = 64;
            }
            this.iii0069iii = jSONArray;
        } catch (Throwable th) {
            throw th;
        }
    }

    @NonNull
    public synchronized JSONArray getJSONArray() {
        JSONArray jSONArray;
        try {
            jSONArray = this.iii0069iii;
            if (((r0072r00720072r00720072 + rr0072rr007200720072()) * r0072r00720072r00720072) % r00720072rr007200720072() != r0072rrr007200720072) {
                r0072r00720072r00720072 = 6;
                r0072rrr007200720072 = rrrrr007200720072();
            }
        } catch (Exception e) {
            throw e;
        }
        return k006Bk006Bk006Bk(jSONArray);
    }

    public synchronized int length() {
        JSONArray jSONArray;
        try {
            jSONArray = this.iii0069iii;
            int iRrrrr007200720072 = rrrrr007200720072();
            if (((rr007200720072r00720072 + iRrrrr007200720072) * iRrrrr007200720072) % r0072007200720072r00720072 != 0) {
                r0072r00720072r00720072 = 41;
                r0072rrr007200720072 = rrrrr007200720072();
            }
        } catch (Exception e) {
            throw e;
        }
        return jSONArray.length();
    }

    public synchronized void put(@NonNull Object obj) {
        int i = r0072r00720072r00720072;
        if (((rr007200720072r00720072 + i) * i) % r0072007200720072r00720072 != r0072rrr007200720072) {
            r0072r00720072r00720072 = rrrrr007200720072();
            r0072rrr007200720072 = rrrrr007200720072();
        }
        try {
            this.iii0069iii.put(obj);
        } catch (Exception e) {
            throw e;
        }
    }

    public synchronized void set(@NonNull JSONArray jSONArray) {
        try {
            int i = r0072r00720072r00720072;
            if (((rr007200720072r00720072 + i) * i) % r0072007200720072r00720072 != 0) {
                r0072r00720072r00720072 = rrrrr007200720072();
                rr007200720072r00720072 = 48;
            }
            this.iii0069iii = jSONArray;
        } catch (Throwable th) {
            throw th;
        }
    }
}
