package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes6.dex */
public final class bp implements com.google.android.play.integrity.internal.ak {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f14741a;
    private final com.google.android.play.integrity.internal.an b;
    private final com.google.android.play.integrity.internal.an c;
    private final com.google.android.play.integrity.internal.an d;

    public bp(com.google.android.play.integrity.internal.an anVar, com.google.android.play.integrity.internal.an anVar2, com.google.android.play.integrity.internal.an anVar3, com.google.android.play.integrity.internal.an anVar4) {
        this.f14741a = anVar;
        this.b = anVar2;
        this.c = anVar3;
        this.d = anVar4;
    }

    @Override // com.google.android.play.integrity.internal.an
    public final /* bridge */ /* synthetic */ Object a() {
        return new bn((Context) this.f14741a.a(), (com.google.android.play.integrity.internal.s) this.b.a(), ((au) this.c).a(), new j());
    }
}
