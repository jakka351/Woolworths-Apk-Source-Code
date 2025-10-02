package com.google.android.gms.internal.identity;

/* loaded from: classes5.dex */
final class zzev extends zzet {
    private final zzex zza;

    public zzev(zzex zzexVar, int i) {
        super(zzexVar.size(), i);
        this.zza = zzexVar;
    }

    @Override // com.google.android.gms.internal.identity.zzet
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
