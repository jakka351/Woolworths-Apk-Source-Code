package com.google.android.gms.internal.vision;

import java.util.List;

/* loaded from: classes5.dex */
final class zzfh extends zzfd {
    private final zzfg zza = new zzfg();

    @Override // com.google.android.gms.internal.vision.zzfd
    public final void zza(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        this.zza.zza(th, true).add(th2);
    }

    @Override // com.google.android.gms.internal.vision.zzfd
    public final void zza(Throwable th) {
        th.printStackTrace();
        List<Throwable> listZza = this.zza.zza(th, false);
        if (listZza == null) {
            return;
        }
        synchronized (listZza) {
            try {
                for (Throwable th2 : listZza) {
                    System.err.print("Suppressed: ");
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
