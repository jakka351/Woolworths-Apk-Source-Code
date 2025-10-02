package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.h4;

/* loaded from: classes.dex */
class w2 implements m8 {
    private static w2 c;

    /* renamed from: a, reason: collision with root package name */
    private n f16758a;
    private b b;

    public static w2 c() {
        if (c == null) {
            c = new w2();
        }
        return c;
    }

    public b a() {
        return this.b;
    }

    public n b() {
        return this.f16758a;
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        this.f16758a = null;
        this.b = null;
        c = null;
    }

    public h4.a a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.b = null;
            return h4.a.t;
        }
        b bVarCreateAccessToken = ModelFactory.getInstance().createAccessToken(str);
        this.b = bVarCreateAccessToken;
        if (bVarCreateAccessToken == null) {
            return h4.a.n;
        }
        return null;
    }

    public void a(b bVar) {
        this.b = bVar;
    }

    public void a(n nVar) {
        this.f16758a = nVar;
    }
}
