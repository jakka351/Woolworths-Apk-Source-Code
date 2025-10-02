package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes5.dex */
public final class zzfuc {
    private final zzfvx zza;
    private final zzfwv zzb;
    private final zzgcx zzc;
    private final zzgea zzd;
    private final long zze;
    private final zzhpr zzf;
    private final long zzg;
    private final long zzh = System.currentTimeMillis();
    private final boolean zzi;
    private final long zzj;

    public zzfuc(zzfvx zzfvxVar, zzfwv zzfwvVar, zzgcx zzgcxVar, zzgea zzgeaVar, zzhpr zzhprVar, zzfui zzfuiVar) {
        this.zza = zzfvxVar;
        this.zzb = zzfwvVar;
        this.zzc = zzgcxVar;
        this.zzd = zzgeaVar;
        this.zze = zzfuiVar.zzh();
        this.zzf = zzhprVar;
        this.zzg = zzfuiVar.zzg();
        this.zzi = zzfuiVar.zzq();
        this.zzj = zzfuiVar.zzp();
    }

    public final ListenableFuture zza() {
        return this.zza.zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String zzb(Context context) {
        String string;
        boolean z = false;
        if (this.zzi) {
            if (System.currentTimeMillis() - this.zzh <= this.zzj) {
                z = true;
            }
        }
        zzgdy zzgdyVarZza = this.zzd.zza(3);
        try {
            try {
                try {
                    try {
                        zzgdyVarZza.zza();
                        string = (String) zzgot.zzj(this.zza.zzb(), new zzftz(this, context), zzgpk.zza()).get(z ? this.zzg : this.zze, TimeUnit.MILLISECONDS);
                    } catch (ExecutionException e) {
                        e = e;
                        Throwable cause = e.getCause();
                        if (cause != null) {
                            e = cause;
                        }
                        zzgdyVarZza.zzb(e);
                        string = Integer.toString(3);
                    } catch (Throwable th) {
                        zzgdyVarZza.zzb(th);
                        throw th;
                    }
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    zzgdyVarZza.zzb(e2);
                    string = "";
                }
            } catch (TimeoutException e3) {
                zzgdyVarZza.zzb(e3);
                string = z ? ((zzfzx) this.zzf.zzb()).zza(true, this.zzh) : Integer.toString(17);
            }
            zzgdyVarZza.zzc();
            return string;
        } catch (Throwable th2) {
            zzgdyVarZza.zzc();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String zzc(Context context, String str, View view, Activity activity) {
        String string;
        zzgdy zzgdyVarZza = this.zzd.zza(4);
        try {
            try {
                zzgdyVarZza.zza();
            } catch (InterruptedException e) {
                e = e;
            } catch (ExecutionException e2) {
                e = e2;
            } catch (TimeoutException e3) {
                e = e3;
            } catch (Throwable th) {
                th = th;
            }
            try {
                string = (String) zzgot.zzj(this.zza.zzb(), new zzfua(this, context, null, view, activity), zzgpk.zza()).get(this.zze, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e4) {
                e = e4;
                InterruptedException interruptedException = e;
                Thread.currentThread().interrupt();
                zzgdyVarZza.zzb(interruptedException);
                string = "";
                zzgdyVarZza.zzc();
                return string;
            } catch (ExecutionException e5) {
                e = e5;
                Throwable th2 = e;
                Throwable cause = th2.getCause();
                if (cause != null) {
                    th2 = cause;
                }
                zzgdyVarZza.zzb(th2);
                string = Integer.toString(3);
                zzgdyVarZza.zzc();
                return string;
            } catch (TimeoutException e6) {
                e = e6;
                zzgdyVarZza.zzb(e);
                string = Integer.toString(17);
                zzgdyVarZza.zzc();
                return string;
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                zzgdyVarZza.zzb(th4);
                throw th4;
            }
            zzgdyVarZza.zzc();
            return string;
        } catch (Throwable th5) {
            zzgdyVarZza.zzc();
            throw th5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String zzd(Context context, String str, View view, Activity activity) {
        String string;
        zzgdy zzgdyVarZza = this.zzd.zza(5);
        try {
            try {
                zzgdyVarZza.zza();
            } catch (InterruptedException e) {
                e = e;
            } catch (ExecutionException e2) {
                e = e2;
            } catch (TimeoutException e3) {
                e = e3;
            } catch (Throwable th) {
                th = th;
            }
            try {
                string = (String) zzgot.zzj(this.zza.zzb(), new zzfub(this, context, str, view, null), zzgpk.zza()).get(this.zze, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e4) {
                e = e4;
                InterruptedException interruptedException = e;
                Thread.currentThread().interrupt();
                zzgdyVarZza.zzb(interruptedException);
                string = "";
                zzgdyVarZza.zzc();
                return string;
            } catch (ExecutionException e5) {
                e = e5;
                Throwable th2 = e;
                Throwable cause = th2.getCause();
                if (cause != null) {
                    th2 = cause;
                }
                zzgdyVarZza.zzb(th2);
                string = Integer.toString(3);
                zzgdyVarZza.zzc();
                return string;
            } catch (TimeoutException e6) {
                e = e6;
                zzgdyVarZza.zzb(e);
                string = Integer.toString(17);
                zzgdyVarZza.zzc();
                return string;
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                zzgdyVarZza.zzb(th4);
                throw th4;
            }
            zzgdyVarZza.zzc();
            return string;
        } catch (Throwable th5) {
            zzgdyVarZza.zzc();
            throw th5;
        }
    }

    public final void zze(List list) {
        this.zzc.zza(list);
    }

    public final void zzf(InputEvent inputEvent) {
        this.zzb.zze(inputEvent);
    }

    public final /* synthetic */ zzfwv zzg() {
        return this.zzb;
    }

    public final int zzh() {
        return this.zzb.zzh();
    }
}
