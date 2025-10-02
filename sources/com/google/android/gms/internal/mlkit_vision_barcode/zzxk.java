package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzxk {
    private static final GmsLogger zzf = new GmsLogger("AutoZoom");

    @VisibleForTesting
    final zzxm zza;

    @VisibleForTesting
    final zzbw zzb;

    @Nullable
    @VisibleForTesting
    ScheduledFuture zzc;

    @Nullable
    @VisibleForTesting
    String zzd;

    @VisibleForTesting
    int zze;
    private final AtomicBoolean zzg;
    private final Object zzh;
    private final ScheduledExecutorService zzi;
    private final zzbb zzj;
    private final zzwp zzk;
    private final String zzl;
    private Executor zzm;
    private float zzn;
    private float zzo;
    private long zzp;
    private long zzq;
    private boolean zzr;
    private com.google.mlkit.vision.barcode.internal.zze zzs;

    private zzxk(Context context, zzxm zzxmVar, String str) {
        zzg.zza();
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(2));
        zzbb zzbbVarZza = zzar.zza();
        zzwp zzwpVar = new zzwp(context, new SharedPrefManager(context), new zzwi(context, zzwh.zzd("scanner-auto-zoom").zzd()), "scanner-auto-zoom");
        this.zzh = new Object();
        this.zza = zzxmVar;
        this.zzg = new AtomicBoolean(false);
        this.zzb = zzbw.zzz();
        this.zzi = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
        this.zzj = zzbbVarZza;
        this.zzk = zzwpVar;
        this.zzl = str;
        this.zze = 1;
        this.zzn = 1.0f;
        this.zzo = -1.0f;
        this.zzp = zzbbVarZza.zza();
    }

    public static zzxk zzd(Context context, String str) {
        return new zzxk(context, zzxm.zza, str);
    }

    public static /* synthetic */ void zzf(zzxk zzxkVar) {
        ScheduledFuture scheduledFuture;
        synchronized (zzxkVar.zzh) {
            try {
                if (zzxkVar.zze == 2 && !zzxkVar.zzg.get() && (scheduledFuture = zzxkVar.zzc) != null && !scheduledFuture.isCancelled()) {
                    if (zzxkVar.zzn > 1.0f && zzxkVar.zza() >= zzxkVar.zza.zzi()) {
                        zzf.i("AutoZoom", "Reset zoom = 1");
                        zzxkVar.zzl(1.0f, zzrc.SCANNER_AUTO_ZOOM_AUTO_RESET, null);
                    }
                }
            } finally {
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzg(zzxk zzxkVar, float f) {
        synchronized (zzxkVar.zzh) {
            zzxkVar.zzn = f;
            zzxkVar.zzr(false);
        }
    }

    private final float zzp(float f) {
        float f2 = this.zzo;
        if (f < 1.0f) {
            f = 1.0f;
        }
        return (f2 <= BitmapDescriptorFactory.HUE_RED || f <= f2) ? f : f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzq(zzrc zzrcVar, float f, float f2, @Nullable zzxn zzxnVar) {
        long jConvert;
        if (this.zzd != null) {
            zzuo zzuoVar = new zzuo();
            zzuoVar.zza(this.zzl);
            String str = this.zzd;
            str.getClass();
            zzuoVar.zze(str);
            zzuoVar.zzf(Float.valueOf(f));
            zzuoVar.zzc(Float.valueOf(f2));
            synchronized (this.zzh) {
                jConvert = TimeUnit.MILLISECONDS.convert(this.zzj.zza() - this.zzq, TimeUnit.NANOSECONDS);
            }
            zzuoVar.zzb(Long.valueOf(jConvert));
            if (zzxnVar != null) {
                zzup zzupVar = new zzup();
                zzupVar.zzc(Float.valueOf(zzxnVar.zzc()));
                zzupVar.zze(Float.valueOf(zzxnVar.zze()));
                zzupVar.zzb(Float.valueOf(zzxnVar.zzb()));
                zzupVar.zzd(Float.valueOf(zzxnVar.zzd()));
                zzupVar.zza(Float.valueOf(BitmapDescriptorFactory.HUE_RED));
                zzuoVar.zzd(zzupVar.zzf());
            }
            zzwp zzwpVar = this.zzk;
            zzrd zzrdVar = new zzrd();
            zzrdVar.zzi(zzuoVar.zzh());
            zzwpVar.zzd(zzws.zzf(zzrdVar), zzrcVar);
        }
    }

    private final void zzr(boolean z) {
        ScheduledFuture scheduledFuture;
        synchronized (this.zzh) {
            try {
                this.zzb.zzs();
                this.zzp = this.zzj.zza();
                if (z && (scheduledFuture = this.zzc) != null) {
                    scheduledFuture.cancel(false);
                    this.zzc = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    public final long zza() {
        long jConvert;
        synchronized (this.zzh) {
            jConvert = TimeUnit.MILLISECONDS.convert(this.zzj.zza() - this.zzp, TimeUnit.NANOSECONDS);
        }
        return jConvert;
    }

    public final /* synthetic */ zzet zzc(float f) throws Exception {
        com.google.mlkit.vision.barcode.internal.zze zzeVar = this.zzs;
        zzp(f);
        zzeVar.getClass();
        int i = com.google.mlkit.vision.barcode.internal.zzh.n;
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x026c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0247 A[Catch: all -> 0x0199, Merged into TryCatch #1 {all -> 0x000e, all -> 0x0199, blocks: (B:4:0x0007, B:6:0x000c, B:10:0x0011, B:12:0x0017, B:14:0x0020, B:17:0x002c, B:19:0x0030, B:20:0x003a, B:22:0x0090, B:23:0x0096, B:25:0x009c, B:28:0x00aa, B:29:0x00cb, B:30:0x00da, B:32:0x00e0, B:34:0x00f4, B:36:0x0100, B:39:0x0108, B:40:0x0152, B:42:0x015c, B:43:0x0167, B:45:0x0173, B:47:0x017b, B:74:0x0265, B:49:0x0185, B:50:0x0187, B:77:0x0268, B:78:0x0269, B:51:0x0188, B:53:0x0196, B:57:0x019c, B:58:0x01c8, B:60:0x01ce, B:63:0x01f7, B:65:0x0206, B:67:0x0215, B:69:0x0220, B:70:0x0245, B:72:0x0247, B:73:0x0264), top: B:83:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(int r18, com.google.android.gms.internal.mlkit_vision_barcode.zzxn r19) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode.zzxk.zzi(int, com.google.android.gms.internal.mlkit_vision_barcode.zzxn):void");
    }

    public final void zzj() {
        synchronized (this.zzh) {
            try {
                if (this.zze == 4) {
                    return;
                }
                zzn(false);
                this.zzi.shutdown();
                this.zze = 4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzk(float f) {
        synchronized (this.zzh) {
            zzaz.zzd(f >= 1.0f);
            this.zzo = f;
        }
    }

    @VisibleForTesting
    public final void zzl(float f, zzrc zzrcVar, @Nullable zzxn zzxnVar) {
        synchronized (this.zzh) {
            try {
                if (this.zzm != null && this.zzs != null && this.zze == 2) {
                    if (this.zzg.compareAndSet(false, true)) {
                        zzej.zzb(zzej.zzc(new zzxh(this, f), this.zzm), new zzxj(this, zzrcVar, this.zzn, zzxnVar, f), zzeu.zza());
                    }
                }
            } finally {
            }
        }
    }

    public final void zzm() {
        synchronized (this.zzh) {
            try {
                int i = this.zze;
                if (i != 2 && i != 4) {
                    zzr(true);
                    this.zzc = this.zzi.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzxi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzxk.zzf(this.zza);
                        }
                    }, 500L, 500L, TimeUnit.MILLISECONDS);
                    if (this.zze == 1) {
                        this.zzd = UUID.randomUUID().toString();
                        this.zzq = this.zzj.zza();
                        this.zzr = false;
                        zzrc zzrcVar = zzrc.SCANNER_AUTO_ZOOM_START;
                        float f = this.zzn;
                        zzq(zzrcVar, f, f, null);
                    } else {
                        zzrc zzrcVar2 = zzrc.SCANNER_AUTO_ZOOM_RESUME;
                        float f2 = this.zzn;
                        zzq(zzrcVar2, f2, f2, null);
                    }
                    this.zze = 2;
                }
            } finally {
            }
        }
    }

    public final void zzn(boolean z) {
        synchronized (this.zzh) {
            try {
                int i = this.zze;
                if (i != 1 && i != 4) {
                    zzr(true);
                    if (z) {
                        if (!this.zzr) {
                            zzrc zzrcVar = zzrc.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                            float f = this.zzn;
                            zzq(zzrcVar, f, f, null);
                        }
                        zzrc zzrcVar2 = zzrc.SCANNER_AUTO_ZOOM_SCAN_SUCCESS;
                        float f2 = this.zzn;
                        zzq(zzrcVar2, f2, f2, null);
                    } else {
                        zzrc zzrcVar3 = zzrc.SCANNER_AUTO_ZOOM_SCAN_FAILED;
                        float f3 = this.zzn;
                        zzq(zzrcVar3, f3, f3, null);
                    }
                    this.zzr = false;
                    this.zze = 1;
                    this.zzd = null;
                }
            } finally {
            }
        }
    }

    public final void zzo(com.google.mlkit.vision.barcode.internal.zze zzeVar, Executor executor) {
        this.zzs = zzeVar;
        this.zzm = executor;
    }
}
