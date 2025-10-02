package com.medallia.digital.mobilesdk;

import androidx.annotation.VisibleForTesting;
import com.medallia.digital.mobilesdk.d7;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class l {
    private static final String g = "events";
    private static final String h = "md_android_";
    private static final String i = "md_android_name";
    private static final String j = "eventName";
    private static final String k = "value";

    /* renamed from: a, reason: collision with root package name */
    private n6<m> f16572a;
    private final n6<m> b;
    private final long c;
    private int d = 0;
    private int e = 3;
    private int f = 512;

    public class a implements n6<m> {
        public a() {
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            l.this.b.a(h4Var);
            a4.c("Failed to submit analytics");
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(m mVar) throws JSONException {
            l.c(l.this);
            mVar.b(l.this.d);
            a4.b("Submitting analytics records - part #" + l.this.d + ". max submissions:" + l.this.e);
            if (l.this.d >= l.this.e || mVar.b() != l.this.f) {
                mVar.a(true);
                l.this.b.a((n6) mVar);
                a4.b("Analytics submission is done successfully");
            } else {
                l.this.b.a((n6) mVar);
                l lVar = l.this;
                lVar.a(lVar.c, Long.valueOf(mVar.a()), (n6<m>) l.this.f16572a);
            }
        }
    }

    public l(long j2, n6<m> n6Var) {
        this.b = n6Var;
        this.c = j2;
        a();
    }

    public static /* synthetic */ int c(l lVar) {
        int i2 = lVar.d;
        lVar.d = i2 + 1;
        return i2;
    }

    public class b implements n6<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n6 f16574a;
        final /* synthetic */ m b;

        public b(n6 n6Var, m mVar) {
            this.f16574a = n6Var;
            this.b = mVar;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            this.f16574a.a(h4Var);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(Void r2) {
            a4.e("Digital Analytics was submitted successfully");
            this.f16574a.a((n6) this.b);
        }
    }

    private String a(Object obj) {
        try {
            return ((JSONObject) obj).toString();
        } catch (Exception unused) {
            return null;
        }
    }

    private void b() {
        this.f16572a = new a();
    }

    public void c() throws JSONException {
        a(this.c, (Long) null, this.f16572a);
    }

    @VisibleForTesting
    public JSONObject a(JSONObject jSONObject) throws JSONException {
        String strSubstring;
        Object objA;
        a4.b("Converting analytics payload to digital analytics format");
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(g);
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                JSONObject jSONObject4 = new JSONObject();
                Iterator<String> itKeys = jSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next.equals(i)) {
                        strSubstring = "eventName";
                    } else if (next.startsWith(h)) {
                        strSubstring = next.substring(11);
                        if (strSubstring.equals("value")) {
                            objA = a(jSONObject3.get(next));
                            jSONObject4.put(strSubstring, objA);
                        }
                    } else {
                        jSONObject4.put(next, jSONObject3.get(next));
                    }
                    objA = jSONObject3.get(next);
                    jSONObject4.put(strSubstring, objA);
                }
                jSONArray2.put(jSONObject4);
            }
            jSONObject2.put(g, jSONArray2);
            a4.e("Analytics payload converted to digital analytics format");
            return jSONObject2;
        } catch (JSONException e) {
            a4.c(e.getMessage());
            return null;
        }
    }

    public void b(long j2, Long l, n6<m> n6Var) throws JSONException {
        a4.b("Starting analytics submission");
        if (!s4.f().n()) {
            a4.e("Analytics disabled. Skipping submission");
        } else {
            a4.e("Submitting Analytics");
            a(n6Var, j2, l, this.f);
        }
    }

    private void a() {
        r1 r1VarE = s4.f().e();
        if (r1VarE != null) {
            if (r1VarE.b() != null) {
                this.e = r1VarE.b().intValue();
            }
            if (r1VarE.a() != null) {
                this.f = r1VarE.a().intValue();
            }
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j2, Long l, n6<m> n6Var) throws JSONException {
        b(j2, l, n6Var);
    }

    @VisibleForTesting
    public void a(n6<m> n6Var, long j2, Long l, int i2) throws JSONException {
        a4.b("Exporting analytics records from DB");
        ArrayList<k> arrayListA = t8.g().a(j2, l, i2);
        if (arrayListA != null && !arrayListA.isEmpty()) {
            a4.b("Exported successfully " + arrayListA.size() + " analytics records from DB");
        }
        JSONObject jSONObjectB = t8.g().b(arrayListA);
        String strA = d7.b().a(d7.a.MISSING_EVENTS_V2, (String) null);
        if (strA != null) {
            try {
                JSONArray jSONArray = jSONObjectB.getJSONArray(g);
                JSONArray jSONArray2 = new JSONArray(strA);
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    jSONArray2.put(jSONArray.get(i3));
                }
                jSONObjectB.put(g, jSONArray2);
            } catch (JSONException e) {
                a4.c(e.getMessage());
            }
        }
        if (jSONObjectB != null) {
            try {
                if (!jSONObjectB.has(g) || !(jSONObjectB.get(g) instanceof JSONArray) || jSONObjectB.getJSONArray(g).length() != 0) {
                    m mVar = new m();
                    if (arrayListA != null) {
                        mVar.a(((k) YU.a.c(1, arrayListA)).f());
                        mVar.b(arrayListA.get(0).f());
                        mVar.a(arrayListA.size());
                    }
                    a(jSONObjectB, mVar, n6Var);
                    return;
                }
            } catch (JSONException e2) {
                a4.c(e2.getMessage());
                return;
            }
        }
        a4.e("Can't submit analytics - Json is null or empty");
    }

    public void a(JSONObject jSONObject, m mVar, n6<m> n6Var) throws JSONException {
        JSONObject jSONObjectA = a(jSONObject);
        if (jSONObjectA != null) {
            s4.f().a(new b(n6Var, mVar), jSONObjectA);
        }
    }
}
