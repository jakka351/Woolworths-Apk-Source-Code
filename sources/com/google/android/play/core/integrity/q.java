package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes6.dex */
final class q implements x {

    /* renamed from: a, reason: collision with root package name */
    private Context f14754a;

    private q() {
    }

    public final q a(Context context) {
        context.getClass();
        this.f14754a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.x
    public final s b() {
        Context context = this.f14754a;
        if (context != null) {
            return new s(context, null);
        }
        throw new IllegalStateException(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
    }

    public /* synthetic */ q(p pVar) {
    }
}
