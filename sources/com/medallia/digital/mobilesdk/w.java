package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.d7;
import com.medallia.digital.mobilesdk.h4;
import com.medallia.digital.mobilesdk.i6;
import com.medallia.digital.mobilesdk.o6;
import com.medallia.digital.mobilesdk.s4;
import java.net.URLEncoder;
import java.util.HashMap;

/* loaded from: classes.dex */
class w {
    private static final String b = "sdkVersion";
    private static final String c = "osType";

    /* renamed from: a, reason: collision with root package name */
    private final o6 f16755a;

    /* loaded from: classes6.dex */
    public class a implements o6.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n6 f16756a;

        public a(n6 n6Var) {
            this.f16756a = n6Var;
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(i6 i6Var) {
            h4 h4VarA = w.this.a(i6Var);
            a4.c("Get access token error = " + i6Var.a());
            n6 n6Var = this.f16756a;
            if (n6Var != null) {
                n6Var.a(h4VarA);
            }
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(k6 k6Var) {
            h4.a aVarA = w2.c().a(k6Var != null ? k6Var.b() : null);
            if (aVarA == null) {
                a4.e("Access Token updated successfully");
                t4.e().a(d7.a.ACCESS_TOKEN, w2.c().a() != null ? w2.c().a().a() : null);
                this.f16756a.a((n6) null);
            } else {
                a4.c("Could not parse access token");
                n6 n6Var = this.f16756a;
                if (n6Var != null) {
                    n6Var.a((h4) new s1(aVarA));
                }
            }
        }
    }

    public w(o6 o6Var) {
        this.f16755a = o6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h4 a(i6 i6Var) {
        s1 s1Var = i6.a.NO_CONNECTION.equals(i6Var.a()) ? new s1(h4.a.j) : i6.a.TIMEOUT.equals(i6Var.a()) ? new s1(h4.a.k) : new s1(h4.a.g);
        a4.c(s1Var.getMessage());
        return s1Var;
    }

    private boolean b() {
        return System.currentTimeMillis() - w2.c().a().b() > w2.c().a().e() - s4.f().b();
    }

    private HashMap<String, String> a() {
        HashMap<String, String> map = new HashMap<>();
        try {
            map.put("sdkVersion", URLEncoder.encode("4.8.1", "UTF-8"));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
        try {
            map.put(c, URLEncoder.encode("android", "UTF-8"));
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
        return map;
    }

    public HashMap<String, String> a(s4.c cVar) {
        String strA;
        StringBuilder sb;
        HashMap<String, String> map = new HashMap<>();
        if (cVar == s4.c.ACCESS_TOKEN && w2.c().a() != null && !TextUtils.isEmpty(w2.c().a().a())) {
            strA = w2.c().a().a();
            sb = new StringBuilder("Bearer_");
        } else {
            if (cVar != s4.c.API_TOKEN || w2.c().b() == null || TextUtils.isEmpty(w2.c().b().a())) {
                return map;
            }
            strA = w2.c().b().a();
            sb = new StringBuilder("Bearer_");
        }
        sb.append(strA);
        map.put("Authorization", sb.toString());
        return map;
    }

    public HashMap<String, String> a(String str) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Authorization", "Bearer_" + str);
        return map;
    }

    public void a(n6<Void> n6Var) {
        if (w2.c().b() == null) {
            if (n6Var != null) {
                n6Var.a(new s1(h4.a.l));
                return;
            }
            return;
        }
        if (w2.c().a() == null) {
            String strA = t4.e().a(d7.a.ACCESS_TOKEN);
            if (!TextUtils.isEmpty(strA)) {
                w2.c().a(ModelFactory.getInstance().createAccessToken(strA));
                if (w2.c().a() == null) {
                    if (n6Var != null) {
                        n6Var.a(new s1(h4.a.m));
                        return;
                    }
                    return;
                }
            }
        }
        if (w2.c().a() != null && !b()) {
            n6Var.a((n6<Void>) null);
            return;
        }
        if (!TextUtils.isEmpty(w2.c().b().b())) {
            a4.b("Get and store access token started");
            this.f16755a.b(w2.c().b().b(), a(), a(s4.c.API_TOKEN), null, s4.f().i().a().a().intValue(), new a(n6Var));
        } else if (n6Var != null) {
            n6Var.a(new s1(h4.a.h));
        }
    }
}
