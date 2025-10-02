package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.o6;

/* loaded from: classes.dex */
class k8 {

    /* renamed from: a, reason: collision with root package name */
    private final o6 f16570a;
    private final String b;
    private o6.a c;

    public class a implements o6.a {
        public a() {
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(i6 i6Var) {
            if (k8.this.c != null) {
                k8.this.c.a(i6Var);
            }
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(k6 k6Var) {
            if (k8.this.c != null) {
                k8.this.c.a(k6Var);
            }
        }
    }

    public k8(o6 o6Var, String str) {
        this.f16570a = o6Var;
        this.b = str;
    }

    public void a(o6.a aVar) {
        this.c = aVar;
        if (!TextUtils.isEmpty(this.b)) {
            this.f16570a.a(this.b, null, null, s4.f().i().a().a().intValue(), new a());
            return;
        }
        o6.a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.a((i6) null);
        }
    }
}
