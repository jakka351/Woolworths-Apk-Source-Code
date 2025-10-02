package com.medallia.digital.mobilesdk;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
class x7<T> {
    private static final long d = 10;
    private static final long e = 10000;

    /* renamed from: a, reason: collision with root package name */
    private final long f16772a;
    private final b<T> b;
    private long c = -1;

    public class a extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f16773a;

        /* renamed from: com.medallia.digital.mobilesdk.x7$a$a, reason: collision with other inner class name */
        public class C0344a extends v4 {
            public C0344a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.medallia.digital.mobilesdk.v4
            public void a() {
                if (x7.this.b != null) {
                    x7.this.b.a(a.this.f16773a);
                }
                x7.this.c = -1L;
            }
        }

        public a(Object obj) {
            this.f16773a = obj;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            w7.b().a().execute(new C0344a());
        }
    }

    public interface b<T> {
        void a(T t);
    }

    public x7(long j, b<T> bVar) {
        this.f16772a = (j < 0 || j > 10000) ? 10000L : j;
        this.b = bVar;
    }

    public boolean a(T t) {
        if (this.c != -1) {
            return false;
        }
        this.c = System.currentTimeMillis() + this.f16772a;
        new Handler(Looper.getMainLooper()).postDelayed(new a(t), this.f16772a);
        return true;
    }
}
