package io.branch.referral;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class UniversalResourceAnalyser {
    public static JSONObject c;
    public static UniversalResourceAnalyser d;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f23869a;
    public final JSONObject b;

    public static class UrlSkipListUpdateTask extends BranchAsyncTask<Void, Void, JSONObject> {

        /* renamed from: a, reason: collision with root package name */
        public final PrefHelper f23870a;

        public UrlSkipListUpdateTask(Context context) {
            this.f23870a = PrefHelper.d(context);
        }

        /* JADX WARN: Not initialized variable reg: 1, insn: 0x0076: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:16:0x0076 */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object doInBackground(java.lang.Object[] r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Void[] r8 = (java.lang.Void[]) r8
                r8 = 0
                android.net.TrafficStats.setThreadStatsTag(r8)
                org.json.JSONObject r8 = new org.json.JSONObject
                r8.<init>()
                r0 = 0
                java.lang.String r1 = "%sdk/uriskiplist_v#.json"
                java.lang.String r2 = "%"
                boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
                if (r3 != 0) goto L18
                r3 = r0
                goto L1a
            L18:
                java.lang.String r3 = "https://cdn.branch.io/"
            L1a:
                java.lang.String r1 = r1.replace(r2, r3)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
                java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
                java.lang.String r3 = "#"
                org.json.JSONObject r4 = io.branch.referral.UniversalResourceAnalyser.c     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
                java.lang.String r5 = "version"
                int r4 = r4.optInt(r5)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
                int r4 = r4 + 1
                java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
                java.lang.String r1 = r1.replace(r3, r4)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
                r2.<init>(r1)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
                java.net.URLConnection r1 = r2.openConnection()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
                com.dynatrace.android.callback.Callback.v(r1)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
                java.lang.Object r1 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r1)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
                java.net.URLConnection r1 = (java.net.URLConnection) r1     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
                javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
                r0 = 1500(0x5dc, float:2.102E-42)
                r1.setConnectTimeout(r0)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L78
                r1.setReadTimeout(r0)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L78
                int r0 = com.dynatrace.android.callback.Callback.f(r1)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L78
                r2 = 200(0xc8, float:2.8E-43)
                if (r0 != r2) goto L7a
                java.io.InputStream r0 = com.dynatrace.android.callback.Callback.a(r1)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L78
                if (r0 == 0) goto L7a
                java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L78
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L78
                java.io.InputStream r3 = com.dynatrace.android.callback.Callback.a(r1)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L78
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L78
                r0.<init>(r2)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L78
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L78
                java.lang.String r0 = r0.readLine()     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L78
                r2.<init>(r0)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L78
                r8 = r2
                goto L7a
            L75:
                r8 = move-exception
                r0 = r1
                goto L91
            L78:
                r0 = move-exception
                goto L84
            L7a:
                r1.disconnect()
                return r8
            L7e:
                r8 = move-exception
                goto L91
            L80:
                r1 = move-exception
                r6 = r1
                r1 = r0
                r0 = r6
            L84:
                java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L75
                io.branch.referral.BranchLogger.a(r0)     // Catch: java.lang.Throwable -> L75
                if (r1 == 0) goto L90
                r1.disconnect()
            L90:
                return r8
            L91:
                if (r0 == 0) goto L96
                r0.disconnect()
            L96:
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.UniversalResourceAnalyser.UrlSkipListUpdateTask.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            super.onPostExecute(jSONObject);
            if (jSONObject.optInt("version") > UniversalResourceAnalyser.c.optInt("version")) {
                UniversalResourceAnalyser.c = jSONObject;
                this.f23870a.p("skip_url_format_key", jSONObject.toString());
            }
        }
    }

    public UniversalResourceAnalyser(Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        this.b = jSONObject;
        try {
            jSONObject.putOpt("version", 0);
            JSONArray jSONArray = new JSONArray();
            jSONObject.putOpt("uri_skip_list", jSONArray);
            jSONArray.put("^fb\\d+:((?!campaign_ids).)*$");
            jSONArray.put("^li\\d+:");
            jSONArray.put("^pdk\\d+:");
            jSONArray.put("^twitterkit-.*:");
            jSONArray.put("^com\\.googleusercontent\\.apps\\.\\d+-.*:\\/oauth");
            jSONArray.put("^(?i)(?!(http|https):).*(:|:.*\\b)(password|o?auth|o?auth.?token|access|access.?token)\\b");
            jSONArray.put("^(?i)((http|https):\\/\\/).*[\\/|?|#].*\\b(password|o?auth|o?auth.?token|access|access.?token)\\b");
        } catch (JSONException e) {
            BranchLogger.a(e.getMessage());
        }
        PrefHelper prefHelperD = PrefHelper.d(context);
        JSONObject jSONObject2 = new JSONObject();
        String strJ = prefHelperD.j("skip_url_format_key");
        if (TextUtils.isEmpty(strJ) || "bnc_no_value".equals(strJ)) {
            jSONObject2 = this.b;
        } else {
            try {
                jSONObject2 = new JSONObject(strJ);
            } catch (JSONException e2) {
                BranchLogger.a(e2.getMessage());
            }
        }
        c = jSONObject2;
        this.f23869a = new ArrayList();
    }

    public final String a(String str) {
        String string;
        ArrayList arrayList = this.f23869a;
        try {
            JSONArray jSONArrayOptJSONArray = c.optJSONArray("uri_skip_list");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    try {
                        string = jSONArrayOptJSONArray.getString(i);
                    } catch (JSONException e) {
                        BranchLogger.a(e.getMessage());
                    }
                    if (Pattern.compile(string).matcher(str).find()) {
                        break;
                    }
                }
                string = null;
            } else {
                string = null;
            }
            if (string == null) {
                if (arrayList.size() <= 0) {
                    return str;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (str.matches((String) it.next())) {
                        return str;
                    }
                }
            }
            return string;
        } catch (Exception unused) {
            return str;
        }
    }
}
