package com.google.android.play.integrity.internal;

/* loaded from: classes6.dex */
final class ab extends t {
    public final /* synthetic */ ad g;

    public ab(ad adVar) {
        this.g = adVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        ae aeVar = this.g.d;
        aeVar.b.b("unlinkToDeath", new Object[0]);
        aeVar.n.asBinder().unlinkToDeath(aeVar.k, 0);
        aeVar.n = null;
        aeVar.g = false;
    }
}
