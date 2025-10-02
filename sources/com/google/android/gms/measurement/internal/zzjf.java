package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
abstract class zzjf extends zzje {
    private boolean zza;

    public zzjf(zzic zzicVar) {
        super(zzicVar);
        this.zzu.zzF();
    }

    public abstract boolean zza();

    public void zzba() {
    }

    public final boolean zzv() {
        return this.zza;
    }

    public final void zzw() {
        if (!zzv()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzx() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (zza()) {
            return;
        }
        this.zzu.zzG();
        this.zza = true;
    }

    public final void zzy() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzba();
        this.zzu.zzG();
        this.zza = true;
    }
}
