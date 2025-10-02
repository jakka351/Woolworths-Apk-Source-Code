package com.google.android.play.integrity.internal;

/* loaded from: classes6.dex */
final class x extends t {
    public final /* synthetic */ ae g;

    public x(ae aeVar) {
        this.g = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        synchronized (this.g.f) {
            try {
                if (this.g.l.get() > 0 && this.g.l.decrementAndGet() > 0) {
                    this.g.b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                ae aeVar = this.g;
                if (aeVar.n != null) {
                    aeVar.b.b("Unbind from service.", new Object[0]);
                    ae aeVar2 = this.g;
                    aeVar2.f14769a.unbindService(aeVar2.m);
                    ae aeVar3 = this.g;
                    aeVar3.g = false;
                    aeVar3.n = null;
                    aeVar3.m = null;
                }
                this.g.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
