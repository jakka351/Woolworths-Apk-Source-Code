package com.auth0.android.provider;

import android.content.Intent;

/* loaded from: classes.dex */
class AuthorizeResult {

    /* renamed from: a, reason: collision with root package name */
    public final int f13661a;
    public final Intent b;

    public AuthorizeResult(Intent intent) {
        this.b = intent;
        this.f13661a = (intent == null ? null : intent.getData()) != null ? -1 : 0;
    }

    public final boolean a() {
        Intent intent;
        if (this.f13661a != 0 || (intent = this.b) == null) {
            return false;
        }
        return (intent == null ? null : intent.getData()) == null;
    }
}
