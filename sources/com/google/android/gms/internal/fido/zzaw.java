package com.google.android.gms.internal.fido;

/* loaded from: classes5.dex */
final class zzaw extends zzar {
    private final zzaz zza;

    public zzaw(zzaz zzazVar, int i) {
        super(zzazVar.size(), i);
        this.zza = zzazVar;
    }

    @Override // com.google.android.gms.internal.fido.zzar
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
