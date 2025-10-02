package com.google.mlkit.vision.barcode.internal;

import android.graphics.Point;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxn;
import com.google.android.gms.internal.mlkit_vision_common.zzlx;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.barcode.internal.zzh;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class zzh extends MobileVisionBase implements BarcodeScanner {
    public static final /* synthetic */ int n = 0;
    public final boolean i;
    public final BarcodeScannerOptions j;
    public final zzxk k;
    public int l;
    public boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(BarcodeScannerOptions barcodeScannerOptions, zzl zzlVar, Executor executor, zzwp zzwpVar, MlKitContext mlKitContext) {
        super(zzlVar, executor);
        barcodeScannerOptions.getClass();
        this.j = barcodeScannerOptions;
        boolean zD = zzb.d();
        this.i = zD;
        zzrp zzrpVar = new zzrp();
        zzrpVar.zzi(zzb.a(barcodeScannerOptions));
        zzrr zzrrVarZzj = zzrpVar.zzj();
        zzrd zzrdVar = new zzrd();
        zzrdVar.zze(zD ? zzra.TYPE_THICK : zzra.TYPE_THIN);
        zzrdVar.zzg(zzrrVarZzj);
        zzwpVar.zzd(zzws.zzg(zzrdVar, 1), zzrc.ON_DEVICE_BARCODE_CREATE);
        this.k = null;
    }

    public final Task a(final InputImage inputImage) {
        Task taskForException;
        synchronized (this) {
            Preconditions.checkNotNull(inputImage, "InputImage can not be null");
            taskForException = this.d.get() ? Tasks.forException(new MlKitException("This detector is already closed!", 14)) : (inputImage.c < 32 || inputImage.d < 32) ? Tasks.forException(new MlKitException("InputImage width and height should be at least 32!", 3)) : this.e.a(this.g, new Callable() { // from class: com.google.mlkit.vision.common.internal.zza
                @Override // java.util.concurrent.Callable
                public final Object call() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    zzh zzhVar = this.d;
                    InputImage inputImage2 = inputImage;
                    zzlx zzlxVarZze = zzlx.zze("detectorTaskWithResource#run");
                    zzlxVarZze.zzb();
                    try {
                        List listD = zzhVar.e.d(inputImage2);
                        zzlxVarZze.close();
                        return listD;
                    } catch (Throwable th) {
                        try {
                            zzlxVarZze.close();
                        } catch (Throwable th2) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            } catch (Exception unused) {
                            }
                        }
                        throw th;
                    }
                }
            }, this.f.getToken());
        }
        final int i = inputImage.c;
        final int i2 = inputImage.d;
        return taskForException.onSuccessTask(new SuccessContinuation() { // from class: com.google.mlkit.vision.barcode.internal.zzf
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                List<Barcode> list = (List) obj;
                zzh zzhVar = this.d;
                zzxk zzxkVar = zzhVar.k;
                if (zzxkVar == null) {
                    return Tasks.forResult(list);
                }
                zzhVar.l++;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Barcode barcode : list) {
                    if (barcode.a() == -1) {
                        arrayList2.add(barcode);
                    } else {
                        arrayList.add(barcode);
                    }
                }
                if (arrayList.isEmpty()) {
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        Point[] pointArr = ((Barcode) arrayList2.get(i3)).b;
                        if (pointArr != null) {
                            zzxkVar.zzi(zzhVar.l, zzxn.zzg(Arrays.asList(pointArr), i, i2, BitmapDescriptorFactory.HUE_RED));
                        }
                    }
                } else {
                    zzhVar.m = true;
                }
                zzhVar.j.getClass();
                return Tasks.forResult(arrayList);
            }
        });
    }

    @Override // com.google.mlkit.vision.common.internal.MobileVisionBase, java.io.Closeable, java.lang.AutoCloseable, com.google.mlkit.vision.barcode.BarcodeScanner
    public final synchronized void close() {
        try {
            zzxk zzxkVar = this.k;
            if (zzxkVar != null) {
                zzxkVar.zzn(this.m);
                this.k.zzj();
            }
            super.close();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return this.i ? OptionalModuleUtils.f15984a : new Feature[]{OptionalModuleUtils.b};
    }
}
