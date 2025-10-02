package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
final class zzaaf extends HandlerThread implements Handler.Callback {
    private zzdh zza;
    private Handler zzb;

    @Nullable
    private Error zzc;

    @Nullable
    private RuntimeException zzd;

    @Nullable
    private zzaag zze;

    public zzaaf() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        zzdh zzdhVar;
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    try {
                        int i2 = message.arg1;
                        zzdh zzdhVar2 = this.zza;
                        if (zzdhVar2 == null) {
                            throw null;
                        }
                        zzdhVar2.zza(i2);
                        this.zze = new zzaag(this, this.zza.zzc(), i2 != 0, null);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e) {
                        zzds.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                        this.zzc = e;
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e2) {
                        zzds.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                        this.zzd = e2;
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (zzdi e3) {
                    zzds.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.zzd = new IllegalStateException(e3);
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    zzdhVar = this.zza;
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                if (zzdhVar == null) {
                    throw null;
                }
                zzdhVar.zzb();
                return true;
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    public final zzaag zza(int i) {
        boolean z;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.zzb = handler;
        this.zza = new zzdh(handler, null);
        synchronized (this) {
            z = false;
            this.zzb.obtainMessage(1, i, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.zzc;
        if (error != null) {
            throw error;
        }
        zzaag zzaagVar = this.zze;
        zzaagVar.getClass();
        return zzaagVar;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
