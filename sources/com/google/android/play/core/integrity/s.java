package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes6.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final s f14755a = this;
    private final com.google.android.play.integrity.internal.an b;
    private final com.google.android.play.integrity.internal.an c;
    private final com.google.android.play.integrity.internal.an d;
    private final com.google.android.play.integrity.internal.an e;
    private final com.google.android.play.integrity.internal.an f;

    public s(Context context, r rVar) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        com.google.android.play.integrity.internal.al alVar = new com.google.android.play.integrity.internal.al(context);
        this.b = alVar;
        com.google.android.play.integrity.internal.aj ajVarB = com.google.android.play.integrity.internal.aj.b(ac.f14710a);
        this.c = ajVarB;
        au auVar = new au(alVar, l.f14750a);
        this.d = auVar;
        com.google.android.play.integrity.internal.aj ajVarB2 = com.google.android.play.integrity.internal.aj.b(new al(alVar, ajVarB, auVar, l.f14750a));
        this.e = ajVarB2;
        this.f = com.google.android.play.integrity.internal.aj.b(new ab(ajVarB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f.a();
    }
}
