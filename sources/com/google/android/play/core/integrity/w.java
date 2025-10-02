package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes6.dex */
final class w implements aw {

    /* renamed from: a, reason: collision with root package name */
    private final w f14757a = this;
    private final com.google.android.play.integrity.internal.an b;
    private final com.google.android.play.integrity.internal.an c;
    private final com.google.android.play.integrity.internal.an d;
    private final com.google.android.play.integrity.internal.an e;
    private final com.google.android.play.integrity.internal.an f;
    private final com.google.android.play.integrity.internal.an g;

    public w(Context context, v vVar) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        com.google.android.play.integrity.internal.al alVar = new com.google.android.play.integrity.internal.al(context);
        this.b = alVar;
        com.google.android.play.integrity.internal.aj ajVarB = com.google.android.play.integrity.internal.aj.b(bb.f14731a);
        this.c = ajVarB;
        au auVar = new au(alVar, n.f14753a);
        this.d = auVar;
        com.google.android.play.integrity.internal.aj ajVarB2 = com.google.android.play.integrity.internal.aj.b(new bp(alVar, ajVarB, auVar, n.f14753a));
        this.e = ajVarB2;
        com.google.android.play.integrity.internal.aj ajVarB3 = com.google.android.play.integrity.internal.aj.b(new bu(ajVarB2));
        this.f = ajVarB3;
        this.g = com.google.android.play.integrity.internal.aj.b(new ba(ajVarB2, ajVarB3));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.g.a();
    }
}
