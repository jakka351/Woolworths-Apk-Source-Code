package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.medallia.digital.mobilesdk.h4;
import com.medallia.digital.mobilesdk.o6;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class a6 extends k0<String> {
    private final e5 g;
    private final b5 h;
    private final d5 i;
    private String j;

    public class a implements o6.a {
        public a() {
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(i6 i6Var) {
            a6.this.b(i6Var);
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(k6 k6Var) {
            a4.b("LivingLens ProcessMediaClient - success");
            a6.this.d.a((n6<T>) k6Var.b());
        }
    }

    public a6(o6 o6Var, l0 l0Var, e5 e5Var, b5 b5Var, d5 d5Var, n6<String> n6Var) {
        super(o6Var, l0Var, n6Var);
        this.g = e5Var;
        this.h = b5Var;
        this.i = d5Var;
        a(false);
    }

    private JSONObject e() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", new JSONObject().put("id", "").put("type", "media-capture-upload").put(k.a.h, f()));
            a4.e("LivingLens Media Object: " + jSONObject);
            return jSONObject;
        } catch (JSONException e) {
            a4.c("LivingLens Can not create Media Object To Process " + e.getMessage());
            return null;
        }
    }

    private JSONObject f() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("clientId", this.h.b()).put("apiKey", this.h.a()).put("title", this.g.c() + "-" + this.g.getFormId() + " sent at: " + this.g.h()).put("mediaType", j5.d(this.g.f())).put("thirdPartySource", "Medallia").put("thirdPartyMediaId", this.i.a()).put("languageCode", x3.e().f()).put("countryCode", x3.e().a()).put(lqlqqlq.mmm006Dm006Dm, "Android Digital SDK Media Capture").put("namedFilters", h());
            jSONObject.put("metadata", g());
            return jSONObject;
        } catch (Exception e) {
            a4.c(YU.a.f(e, new StringBuilder("LivingLens ")));
            return jSONObject;
        }
    }

    private JSONObject g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("respondentId", this.g.b()).put("questionId", "");
            return jSONObject;
        } catch (Exception e) {
            a4.c(YU.a.f(e, new StringBuilder("LivingLens Can not getMetaDataObject")));
            return jSONObject;
        }
    }

    private JSONArray h() {
        JSONArray jSONArray = new JSONArray();
        ArrayList<String> arrayListE = this.h.e();
        if (arrayListE != null) {
            try {
                if (arrayListE.contains(o3.f16619a)) {
                    jSONArray.put(new JSONObject().put("group", o3.f16619a).put("filters", new JSONArray().put(!this.g.getFormId().isEmpty() ? this.g.getFormId() : "empty")));
                }
                if (arrayListE.contains(o3.b)) {
                    jSONArray.put(new JSONObject().put("group", o3.b).put("filters", new JSONArray().put(!this.g.getFormId().isEmpty() ? this.g.c() : "empty")));
                }
                if (arrayListE.contains(o3.c)) {
                    jSONArray.put(new JSONObject().put("group", o3.c).put("filters", new JSONArray().put(!this.g.a().isEmpty() ? this.g.a() : "empty")));
                }
                if (arrayListE.contains(o3.d)) {
                    jSONArray.put(new JSONObject().put("group", o3.d).put("filters", new JSONArray().put(!this.g.d().isEmpty() ? this.g.d() : "empty")));
                }
                if (arrayListE.contains(o3.e)) {
                    jSONArray.put(new JSONObject().put("group", o3.e).put("filters", new JSONArray().put(this.g.b().isEmpty() ? "empty" : this.g.b())));
                    return jSONArray;
                }
            } catch (Exception e) {
                a4.c(YU.a.f(e, new StringBuilder("LivingLens ")));
            }
        }
        return jSONArray;
    }

    @Override // com.medallia.digital.mobilesdk.k0
    public h4 a(i6 i6Var) {
        return new s1(h4.a.W);
    }

    @Override // com.medallia.digital.mobilesdk.k0
    public void b() {
        b5 b5Var = this.h;
        if (b5Var != null && b5Var.b() != null && this.h.d() != null && this.h.a() != null && this.h.c() != null && this.h.h() != null) {
            this.j = this.h.d() + this.h.c() + this.h.b() + this.h.h();
        }
        h4 h4VarD = d();
        if (h4VarD != null) {
            n6<T> n6Var = this.d;
            if (n6Var != 0) {
                n6Var.a(h4VarD);
                return;
            }
            return;
        }
        try {
            this.f16560a.b(this.j, null, null, e(), s4.f().i().f().a().intValue(), new a());
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    @Override // com.medallia.digital.mobilesdk.k0
    public h4 d() {
        if (TextUtils.isEmpty(this.j)) {
            h4.a aVar = h4.a.X;
            a4.c(aVar.toString());
            return new s1(aVar);
        }
        if (this.g != null && this.h != null && this.i != null) {
            return null;
        }
        h4.a aVar2 = h4.a.Y;
        a4.c(aVar2.toString());
        return new s1(aVar2);
    }
}
