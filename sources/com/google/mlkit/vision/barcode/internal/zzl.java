package com.google.mlkit.vision.barcode.internal;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzft;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzro;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwe;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.MLTaskInput;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.BitmapInStreamingChecker;
import com.google.mlkit.vision.common.internal.ImageUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class zzl extends MLTask {
    public static final ImageUtils j = ImageUtils.f16003a;
    public static boolean k = true;
    public final BarcodeScannerOptions d;
    public final zzm e;
    public final zzwp f;
    public final zzwr g;
    public final BitmapInStreamingChecker h = new BitmapInStreamingChecker();
    public boolean i;

    public zzl(MlKitContext mlKitContext, BarcodeScannerOptions barcodeScannerOptions, zzm zzmVar, zzwp zzwpVar) {
        Preconditions.checkNotNull(mlKitContext, "MlKitContext can not be null");
        Preconditions.checkNotNull(barcodeScannerOptions, "BarcodeScannerOptions can not be null");
        this.d = barcodeScannerOptions;
        this.e = zzmVar;
        this.f = zzwpVar;
        this.g = zzwr.zza(mlKitContext.b());
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    public final synchronized void b() {
        this.i = this.e.zzc();
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    public final synchronized void c() {
        try {
            this.e.zzb();
            k = true;
            zzrd zzrdVar = new zzrd();
            zzra zzraVar = this.i ? zzra.TYPE_THICK : zzra.TYPE_THIN;
            zzwp zzwpVar = this.f;
            zzrdVar.zze(zzraVar);
            zzrp zzrpVar = new zzrp();
            zzrpVar.zzi(zzb.a(this.d));
            zzrdVar.zzg(zzrpVar.zzj());
            zzwpVar.zzd(zzws.zzf(zzrdVar), zzrc.ON_DEVICE_BARCODE_CLOSE);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.mlkit.common.sdkinternal.MLTask
    public final List d(MLTaskInput mLTaskInput) throws Throwable {
        zzl zzlVar;
        ArrayList arrayListA;
        InputImage inputImage = (InputImage) mLTaskInput;
        synchronized (this) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                BitmapInStreamingChecker bitmapInStreamingChecker = this.h;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                bitmapInStreamingChecker.a(inputImage);
                try {
                    arrayListA = this.e.a(inputImage);
                    zzlVar = this;
                } catch (MlKitException e) {
                    e = e;
                    zzlVar = this;
                }
                try {
                    zzlVar.e(zzrb.NO_ERROR, jElapsedRealtime, inputImage, arrayListA);
                    k = false;
                    return arrayListA;
                } catch (MlKitException e2) {
                    e = e2;
                    MlKitException mlKitException = e;
                    zzlVar.e(mlKitException.d == 14 ? zzrb.MODEL_NOT_DOWNLOADED : zzrb.UNKNOWN_ERROR, jElapsedRealtime, inputImage, null);
                    throw mlKitException;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public final void e(final zzrb zzrbVar, long j2, final InputImage inputImage, List list) throws Throwable {
        final zzcp zzcpVar = new zzcp();
        final zzcp zzcpVar2 = new zzcp();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Barcode barcode = (Barcode) it.next();
                zzrn zzrnVar = (zzrn) zzb.f15992a.get(barcode.a());
                if (zzrnVar == null) {
                    zzrnVar = zzrn.FORMAT_UNKNOWN;
                }
                zzcpVar.zzd(zzrnVar);
                zzro zzroVar = (zzro) zzb.b.get(barcode.f15990a.b());
                if (zzroVar == null) {
                    zzroVar = zzro.TYPE_UNKNOWN;
                }
                zzcpVar2.zzd(zzroVar);
            }
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j2;
        this.f.zzf(new zzwo() { // from class: com.google.mlkit.vision.barcode.internal.zzj
            @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwo
            public final zzwe zza() {
                zzl zzlVar = this.f15995a;
                long j3 = jElapsedRealtime;
                zzrb zzrbVar2 = zzrbVar;
                zzcp zzcpVar3 = zzcpVar;
                zzcp zzcpVar4 = zzcpVar2;
                InputImage inputImage2 = inputImage;
                zzrp zzrpVar = new zzrp();
                zzqo zzqoVar = new zzqo();
                zzqoVar.zzc(Long.valueOf(j3));
                zzqoVar.zzd(zzrbVar2);
                zzqoVar.zze(Boolean.valueOf(zzl.k));
                Boolean bool = Boolean.TRUE;
                zzqoVar.zza(bool);
                zzqoVar.zzb(bool);
                zzrpVar.zzh(zzqoVar.zzf());
                zzrpVar.zzi(zzb.a(zzlVar.d));
                zzrpVar.zze(zzcpVar3.zzf());
                zzrpVar.zzf(zzcpVar4.zzf());
                int i = inputImage2.f;
                zzl.j.getClass();
                int i2 = inputImage2.f;
                int allocationByteCount = i2 == -1 ? ((Bitmap) Preconditions.checkNotNull(inputImage2.f16001a)).getAllocationByteCount() : (i2 == 17 || i2 == 842094169) ? ((ByteBuffer) Preconditions.checkNotNull(null)).limit() : i2 != 35 ? 0 : (((Image.Plane[]) Preconditions.checkNotNull(inputImage2.c()))[0].getBuffer().limit() * 3) / 2;
                zzqh zzqhVar = new zzqh();
                zzqhVar.zza(i != -1 ? i != 35 ? i != 842094169 ? i != 16 ? i != 17 ? zzqi.UNKNOWN_FORMAT : zzqi.NV21 : zzqi.NV16 : zzqi.YV12 : zzqi.YUV_420_888 : zzqi.BITMAP);
                zzqhVar.zzb(Integer.valueOf(allocationByteCount));
                zzrpVar.zzg(zzqhVar.zzd());
                zzrd zzrdVar = new zzrd();
                zzrdVar.zze(zzlVar.i ? zzra.TYPE_THICK : zzra.TYPE_THIN);
                zzrdVar.zzg(zzrpVar.zzj());
                return zzws.zzf(zzrdVar);
            }
        }, zzrc.ON_DEVICE_BARCODE_DETECT);
        zzfr zzfrVar = new zzfr();
        zzfrVar.zze(zzrbVar);
        zzfrVar.zzf(Boolean.valueOf(k));
        zzfrVar.zzg(zzb.a(this.d));
        zzfrVar.zzc(zzcpVar.zzf());
        zzfrVar.zzd(zzcpVar2.zzf());
        final zzft zzftVarZzh = zzfrVar.zzh();
        final zzk zzkVar = new zzk(this);
        final zzrc zzrcVar = zzrc.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
        Executor executorC = MLTaskExecutor.c();
        final zzwp zzwpVar = this.f;
        executorC.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwn
            @Override // java.lang.Runnable
            public final void run() {
                zzwpVar.zzh(zzrcVar, zzftVarZzh, jElapsedRealtime, zzkVar);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j3 = jCurrentTimeMillis - jElapsedRealtime;
        this.g.zzc(true != this.i ? 24301 : 24302, zzrbVar.zza(), j3, jCurrentTimeMillis);
    }
}
