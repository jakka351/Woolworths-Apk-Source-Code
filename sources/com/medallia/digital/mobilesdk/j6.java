package com.medallia.digital.mobilesdk;

import android.os.Handler;
import android.os.Looper;
import com.medallia.digital.mobilesdk.LifeCycle;
import com.medallia.digital.mobilesdk.f0;
import com.medallia.digital.mobilesdk.o6;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes.dex */
class j6 implements LifeCycle.h {
    private static final int q = 401;
    private static final int r = 403;
    private static final double s = 2.0d;

    /* renamed from: a, reason: collision with root package name */
    private o6.a f16552a;
    private f0.d b;
    private String c;
    private int d;
    private int e;
    private ExecutorService f;
    private HashMap<String, String> g;
    private JSONObject h;
    private o6.b i;
    private f0 j;
    private int k;
    private long l;
    private long m;
    private Handler n;
    private String o;
    private final v4 p;

    public class a extends v4 {
        public a() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            j6.this.a();
        }
    }

    /* loaded from: classes6.dex */
    public class b implements o6.a {
        public b() {
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(i6 i6Var) {
            j6.this.a(i6Var);
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(k6 k6Var) {
            j6.this.a(k6Var);
        }
    }

    public class c implements o6.a {
        public c() {
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(i6 i6Var) {
            j6.this.a(i6Var);
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(k6 k6Var) {
            j6.this.a(k6Var);
        }
    }

    public class d implements o6.a {
        public d() {
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(i6 i6Var) {
            j6.this.a(i6Var);
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(k6 k6Var) {
            j6.this.a(k6Var);
        }
    }

    public j6() {
        this.k = 0;
        this.n = new Handler(Looper.getMainLooper());
        this.p = new a();
        LifeCycle.b().a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        StringBuilder sb = new StringBuilder("Retrying: ");
        sb.append(this.k);
        sb.append(q2.c);
        sb.append(this.d);
        sb.append(" (");
        a4.b(YU.a.o(sb, this.j.i(), ")"));
        try {
            this.f.submit(this.j);
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    private boolean c() {
        return System.currentTimeMillis() - this.l < this.m;
    }

    private boolean d() {
        return c() && this.k > 0;
    }

    public void b() {
        f0 i0Var;
        a4.b("Rest call started = " + this.c);
        this.l = System.currentTimeMillis();
        o6.b bVar = this.i;
        if (bVar == o6.b.String) {
            String str = this.o;
            if (str != null) {
                i0Var = new e7(this.b, this.c, this.g, this.h, str, this.e, new b());
                this.j = i0Var;
            } else {
                this.j = new e7(this.b, this.c, this.g, this.h, this.e, new c());
            }
        } else if (bVar == o6.b.BYTES) {
            i0Var = new i0(this.b, this.c, this.g, this.e, new d());
            this.j = i0Var;
        }
        this.f.submit(this.j);
    }

    public void e() {
        if (LifeCycle.b().f()) {
            return;
        }
        long jPow = ((long) Math.pow(s, this.k)) * 1000;
        f();
        if (this.n == null) {
            this.n = new Handler(Looper.getMainLooper());
        }
        this.n.postDelayed(this.p, jPow);
    }

    public void f() {
        this.n.removeCallbacks(this.p);
        this.n.removeCallbacksAndMessages(null);
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onBackground() {
        f();
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onForeground() {
        if (d()) {
            e();
        } else {
            if (c()) {
                return;
            }
            a4.b(YU.a.o(new StringBuilder("Request = "), this.j.i(), " was paused because of refresh session"));
        }
    }

    public j6(ExecutorService executorService, o6.b bVar, f0.d dVar, String str, HashMap<String, String> map, JSONObject jSONObject, int i, int i2, o6.a aVar, long j) {
        this();
        a(executorService, bVar, dVar, str, map, jSONObject, i, i2, aVar, j);
        b();
    }

    public j6(ExecutorService executorService, o6.b bVar, f0.d dVar, String str, HashMap<String, String> map, JSONObject jSONObject, String str2, int i, int i2, o6.a aVar, long j) {
        this();
        a(executorService, bVar, dVar, str, map, jSONObject, str2, i, i2, aVar, j);
        b();
    }

    public void a(i6 i6Var) {
        if (i6Var.b() == q || i6Var.b() == 403) {
            LifeCycle.b().b(this);
            a4.b("Rest call error = " + this.c);
            o6.a aVar = this.f16552a;
            if (aVar != null) {
                aVar.a(i6Var);
                return;
            }
            return;
        }
        int i = this.k;
        if (i != this.d) {
            this.k = i + 1;
            e();
            return;
        }
        LifeCycle.b().b(this);
        o6.a aVar2 = this.f16552a;
        if (aVar2 != null) {
            aVar2.a(i6Var);
        }
        AnalyticsBridge.getInstance().reportRestClientEvent(this.l, System.currentTimeMillis(), this.c, i6Var.b(), this.k, this.b == f0.d.GET ? Double.valueOf(0.0d) : null);
    }

    public void a(k6 k6Var) {
        Double dValueOf;
        int length;
        if (this.b == f0.d.GET) {
            dValueOf = Double.valueOf(0.0d);
            if (k6Var != null) {
                if (k6Var.b() != null && k6Var.b().getBytes() != null) {
                    length = k6Var.b().getBytes().length;
                } else if (k6Var.a() != null) {
                    length = k6Var.a().length;
                }
                dValueOf = Double.valueOf(length / 1024.0d);
            }
        } else {
            dValueOf = null;
        }
        AnalyticsBridge.getInstance().reportRestClientEvent(this.l, System.currentTimeMillis(), this.c, k6Var != null ? k6Var.c() : -1, this.k, dValueOf);
        LifeCycle.b().b(this);
        a4.b("Rest call success = " + this.c);
        o6.a aVar = this.f16552a;
        if (aVar != null) {
            aVar.a(k6Var);
        }
    }

    public void a(ExecutorService executorService, o6.b bVar, f0.d dVar, String str, HashMap<String, String> map, JSONObject jSONObject, int i, int i2, o6.a aVar, long j) {
        a(executorService, bVar, dVar, str, map, jSONObject, null, i, i2, aVar, j);
    }

    public void a(ExecutorService executorService, o6.b bVar, f0.d dVar, String str, HashMap<String, String> map, JSONObject jSONObject, String str2, int i, int i2, o6.a aVar, long j) {
        this.i = bVar;
        this.b = dVar;
        this.c = str;
        this.g = map;
        this.h = jSONObject;
        this.d = i;
        this.e = i2;
        this.f16552a = aVar;
        this.f = executorService;
        this.m = j;
        this.o = str2;
    }
}
