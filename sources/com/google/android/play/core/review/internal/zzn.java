package com.google.android.play.core.review.internal;

/* loaded from: classes6.dex */
final class zzn extends zzj {
    public final /* synthetic */ zzt e;

    public zzn(zzt zztVar) {
        this.e = zztVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void a() {
        synchronized (this.e.f) {
            try {
                if (this.e.k.get() > 0 && this.e.k.decrementAndGet() > 0) {
                    this.e.b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                zzt zztVar = this.e;
                if (zztVar.m != null) {
                    zztVar.b.a("Unbind from service.", new Object[0]);
                    zzt zztVar2 = this.e;
                    zztVar2.f14763a.unbindService(zztVar2.l);
                    zzt zztVar3 = this.e;
                    zztVar3.g = false;
                    zztVar3.m = null;
                    zztVar3.l = null;
                }
                this.e.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
