package lib.android.paypal.com.magnessdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f24894a;
    public static String b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public static Object b(Object obj) {
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() != 12345) {
                return obj;
            }
        } else if (obj instanceof Double) {
            if (((Double) obj).doubleValue() != 12345.0d) {
                return obj;
            }
        } else if (obj instanceof Long) {
            if (((Long) obj).longValue() != 12345) {
                return obj;
            }
        } else if (obj instanceof Float) {
            if (((Float) obj).floatValue() != 12345.0f) {
                return obj;
            }
        } else if (obj instanceof String) {
            return obj.equals("default") ? "-400" : obj;
        }
        return -400;
    }

    public static JSONObject c(String str, String str2, JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", str2);
        jSONObject.put("payload", jSONArray);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("pairing_id", str);
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONObject);
        jSONObject2.put("audit", jSONArray2);
        return jSONObject2;
    }

    public static boolean e(String str, String str2) {
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        int i = 0;
        while (true) {
            if (i >= strArrSplit.length && i >= strArrSplit2.length) {
                break;
            }
            if (i >= strArrSplit.length || i >= strArrSplit2.length) {
                if (i >= strArrSplit.length) {
                    if (i < strArrSplit2.length && Integer.parseInt(strArrSplit2[i]) != 0) {
                        break;
                    }
                } else if (Integer.parseInt(strArrSplit[i]) != 0) {
                    return true;
                }
                i++;
            } else {
                if (Integer.parseInt(strArrSplit[i]) < Integer.parseInt(strArrSplit2[i])) {
                    break;
                }
                if (Integer.parseInt(strArrSplit[i]) > Integer.parseInt(strArrSplit2[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public static JSONObject h(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("RiskManagerMG", 0);
        b = sharedPreferences.getString("RiskManagerMG", "");
        long jCurrentTimeMillis = sharedPreferences.getLong("RiskManagerMGTIMESTAMP", 0L);
        if (b.equals("") && jCurrentTimeMillis == 0) {
            b = f.b(true);
            jCurrentTimeMillis = System.currentTimeMillis();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("RiskManagerMG", b);
            editorEdit.putLong("RiskManagerMGTIMESTAMP", jCurrentTimeMillis);
            editorEdit.apply();
        }
        HashMap map = new HashMap();
        map.put("id", b);
        map.put("created_at", jCurrentTimeMillis + "");
        try {
            return new JSONObject("{\"id\":" + ((String) map.get("id")) + ",\"created_at\":" + ((String) map.get("created_at")) + "}");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(int r6) {
        /*
            r5 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/storage"
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L6f
            java.io.File[] r0 = r0.listFiles()
            if (r0 == 0) goto L35
            int r1 = r0.length
            r2 = 0
        L15:
            if (r2 >= r1) goto L35
            r3 = r0[r2]
            boolean r4 = r3.exists()
            if (r4 == 0) goto L32
            boolean r4 = android.os.Environment.isExternalStorageRemovable(r3)     // Catch: java.lang.Exception -> L2a
            if (r4 == 0) goto L32
            java.lang.String r0 = r3.getAbsolutePath()     // Catch: java.lang.Exception -> L2a
            goto L37
        L2a:
            r3 = move-exception
            java.lang.Class r4 = r5.getClass()
            lib.android.paypal.com.magnessdk.log.a.b(r3, r4)
        L32:
            int r2 = r2 + 1
            goto L15
        L35:
            java.lang.String r0 = ""
        L37:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L6f
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L6f
            android.os.StatFs r0 = new android.os.StatFs
            java.lang.String r1 = r1.getPath()
            r0.<init>(r1)
            r1 = 600(0x258, float:8.41E-43)
            if (r6 != r1) goto L61
            int r6 = r0.getBlockSize()
            long r1 = (long) r6
            int r6 = r0.getAvailableBlocks()
        L5e:
            long r3 = (long) r6
            long r1 = r1 * r3
            goto L71
        L61:
            r1 = 601(0x259, float:8.42E-43)
            if (r6 != r1) goto L6f
            int r6 = r0.getBlockSize()
            long r1 = (long) r6
            int r6 = r0.getBlockCount()
            goto L5e
        L6f:
            r1 = 12345(0x3039, double:6.099E-320)
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.android.paypal.com.magnessdk.g.a(int):long");
    }

    public final boolean d(Context context, String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.b(e2, getClass());
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b2 A[Catch: Exception -> 0x0042, TRY_LEAVE, TryCatch #0 {Exception -> 0x0042, blocks: (B:3:0x0003, B:5:0x000b, B:8:0x0013, B:10:0x002d, B:13:0x0035, B:15:0x003d, B:23:0x004d, B:25:0x0059, B:48:0x00a4, B:49:0x00a7, B:50:0x00ac, B:51:0x00ae, B:53:0x00b2), top: B:59:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(lib.android.paypal.com.magnessdk.d r6, int r7, java.lang.String r8, java.lang.String r9, android.content.Context r10) throws org.json.JSONException {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r1 = 0
            org.json.JSONObject r6 = r6.f24892a     // Catch: java.lang.Exception -> L42
            org.json.JSONObject r6 = r6.optJSONObject(r9)     // Catch: java.lang.Exception -> L42
            if (r6 == 0) goto Lb7
            boolean r2 = r8.equalsIgnoreCase(r0)     // Catch: java.lang.Exception -> L42
            if (r2 == 0) goto L13
            goto Lb7
        L13:
            java.lang.String r2 = "m"
            java.lang.String r2 = r6.getString(r2)     // Catch: java.lang.Exception -> L42
            java.lang.String r3 = "5.5.1.release"
            java.lang.String r4 = ".debug"
            java.lang.String r3 = r3.replaceAll(r4, r0)     // Catch: java.lang.Exception -> L42
            java.lang.String r4 = ".release"
            java.lang.String r3 = r3.replaceAll(r4, r0)     // Catch: java.lang.Exception -> L42
            boolean r4 = r2.equalsIgnoreCase(r0)     // Catch: java.lang.Exception -> L42
            if (r4 != 0) goto Lb7
            boolean r2 = e(r3, r2)     // Catch: java.lang.Exception -> L42
            if (r2 != 0) goto L35
            goto Lb7
        L35:
            java.lang.String r2 = "o"
            boolean r2 = r6.getBoolean(r2)     // Catch: java.lang.Exception -> L42
            if (r2 == 0) goto L45
            boolean r6 = r5.g(r6, r7, r10)     // Catch: java.lang.Exception -> L42
            return r6
        L42:
            r6 = move-exception
            goto Lb8
        L45:
            r10 = 10
            if (r7 == r10) goto L4d
            r10 = 18
            if (r7 != r10) goto Lb7
        L4d:
            java.lang.String r7 = "r"
            int r6 = r6.optInt(r7, r1)     // Catch: java.lang.Exception -> L42
            boolean r7 = r8.equalsIgnoreCase(r0)     // Catch: java.lang.Exception -> L42
            if (r7 != 0) goto Lb7
            java.lang.String r7 = r8.toLowerCase()     // Catch: java.lang.Exception -> L42
            int r6 = java.lang.Math.abs(r6)     // Catch: java.lang.Exception -> L42
            int r7 = r7.hashCode()     // Catch: java.lang.Exception -> L42
            int r7 = java.lang.Math.abs(r7)     // Catch: java.lang.Exception -> L42
            if (r7 <= 0) goto Lb7
            int r8 = r9.hashCode()
            r10 = 1
            r0 = -1
            switch(r8) {
                case 115: goto L96;
                case 3343: goto L8b;
                case 3696: goto L80;
                case 3711: goto L75;
                default: goto L74;
            }
        L74:
            goto La0
        L75:
            java.lang.String r8 = "ts"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L7e
            goto La0
        L7e:
            r0 = 3
            goto La0
        L80:
            java.lang.String r8 = "td"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L89
            goto La0
        L89:
            r0 = 2
            goto La0
        L8b:
            java.lang.String r8 = "hw"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L94
            goto La0
        L94:
            r0 = r10
            goto La0
        L96:
            java.lang.String r8 = "s"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L9f
            goto La0
        L9f:
            r0 = r1
        La0:
            switch(r0) {
                case 0: goto Lae;
                case 1: goto Lac;
                case 2: goto La7;
                case 3: goto La4;
                default: goto La3;
            }
        La3:
            goto Lb7
        La4:
            int r7 = r7 / 10000
            goto Lae
        La7:
            r8 = 1000000(0xf4240, float:1.401298E-39)
            int r7 = r7 / r8
            goto Lae
        Lac:
            int r7 = r7 / 100
        Lae:
            int r7 = r7 % 100
            if (r7 >= r6) goto Lb4
            lib.android.paypal.com.magnessdk.g.f24894a = r10     // Catch: java.lang.Exception -> L42
        Lb4:
            if (r7 >= r6) goto Lb7
            return r10
        Lb7:
            return r1
        Lb8:
            java.lang.Class r7 = r5.getClass()
            lib.android.paypal.com.magnessdk.log.a.b(r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.android.paypal.com.magnessdk.g.f(lib.android.paypal.com.magnessdk.d, int, java.lang.String, java.lang.String, android.content.Context):boolean");
    }

    public final boolean g(JSONObject jSONObject, int i, Context context) throws JSONException {
        boolean z;
        boolean z2;
        try {
            String packageName = context.getPackageName();
            String strReplaceAll = "5.5.1.release".replaceAll(".debug", "").replaceAll(".release", "");
            Iterator it = f.g(jSONObject.getJSONArray("e")).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (((String) it.next()).equalsIgnoreCase(strReplaceAll)) {
                    z = true;
                    break;
                }
            }
            if (z) {
                ArrayList arrayListG = f.g(jSONObject.getJSONArray("ai"));
                JSONArray jSONArray = jSONObject.getJSONArray("as");
                ArrayList arrayList = new ArrayList();
                if (jSONArray != null && jSONArray.length() > 0) {
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        arrayList.add((Integer) jSONArray.get(i2));
                    }
                }
                if (!arrayList.contains(Integer.valueOf(i))) {
                    Iterator it2 = arrayListG.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z2 = false;
                            break;
                        }
                        if (((String) it2.next()).equalsIgnoreCase(packageName)) {
                            z2 = true;
                            break;
                        }
                    }
                    if (z2) {
                    }
                }
                return false;
            }
            return true;
        } catch (Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.b(e2, getClass());
            return false;
        }
    }
}
