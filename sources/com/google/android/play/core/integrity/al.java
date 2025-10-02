package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes6.dex */
public final class al implements com.google.android.play.integrity.internal.ak {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f14718a;
    private final com.google.android.play.integrity.internal.an b;
    private final com.google.android.play.integrity.internal.an c;
    private final com.google.android.play.integrity.internal.an d;

    public al(com.google.android.play.integrity.internal.an anVar, com.google.android.play.integrity.internal.an anVar2, com.google.android.play.integrity.internal.an anVar3, com.google.android.play.integrity.internal.an anVar4) {
        this.f14718a = anVar;
        this.b = anVar2;
        this.c = anVar3;
        this.d = anVar4;
    }

    @Override // com.google.android.play.integrity.internal.an
    public final /* bridge */ /* synthetic */ Object a() {
        return new aj((Context) this.f14718a.a(), (com.google.android.play.integrity.internal.s) this.b.a(), ((au) this.c).a(), new i());
    }
}
