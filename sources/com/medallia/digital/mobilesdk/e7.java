package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.f0;
import com.medallia.digital.mobilesdk.o6;
import java.io.InputStream;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
class e7 extends f0<String> {

    public class a extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16450a;

        public a(String str) {
            this.f16450a = str;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            a4.b("Status: " + e7.this.h());
            if (e7.this.g() != null) {
                try {
                    e7.this.g().a(new k6(e7.this.h(), this.f16450a));
                } catch (Exception e) {
                    a4.c(e.getMessage());
                }
            }
        }
    }

    public e7(f0.d dVar, String str, HashMap<String, String> map, JSONObject jSONObject, int i, o6.a aVar) {
        super(dVar, str, map, jSONObject, i, aVar);
    }

    @Override // com.medallia.digital.mobilesdk.f0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String b(InputStream inputStream) {
        try {
            return x8.a(inputStream).toString("UTF-8");
        } catch (Exception unused) {
            a(-44);
            return null;
        }
    }

    public e7(f0.d dVar, String str, HashMap<String, String> map, JSONObject jSONObject, String str2, int i, o6.a aVar) {
        super(dVar, str, map, jSONObject, str2, i, aVar);
    }

    @Override // com.medallia.digital.mobilesdk.f0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(String str) {
        w7.b().a().execute(new a(str));
    }
}
