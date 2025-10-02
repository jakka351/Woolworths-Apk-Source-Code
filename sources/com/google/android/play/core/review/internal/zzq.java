package com.google.android.play.core.review.internal;

/* loaded from: classes6.dex */
final class zzq extends zzj {
    public final /* synthetic */ zzr e;

    public zzq(zzr zzrVar) {
        this.e = zzrVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void a() {
        zzt zztVar = this.e.d;
        zztVar.b.a("unlinkToDeath", new Object[0]);
        zztVar.m.asBinder().unlinkToDeath(zztVar.j, 0);
        zztVar.m = null;
        zztVar.g = false;
    }
}
