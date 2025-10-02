package com.google.mlkit.vision.barcode;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxa;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.barcode.internal.zzg;
import com.google.mlkit.vision.barcode.internal.zzh;
import com.google.mlkit.vision.barcode.internal.zzl;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public class BarcodeScanning {
    public static zzh a(BarcodeScannerOptions barcodeScannerOptions) {
        Preconditions.checkNotNull(barcodeScannerOptions, "You must provide a valid BarcodeScannerOptions.");
        zzg zzgVar = (zzg) MlKitContext.c().a(zzg.class);
        zzl zzlVar = (zzl) zzgVar.f15993a.get(barcodeScannerOptions);
        ExecutorSelector executorSelector = zzgVar.b;
        barcodeScannerOptions.getClass();
        return new zzh(barcodeScannerOptions, zzlVar, (Executor) executorSelector.f15980a.get(), zzxa.zzb(com.google.mlkit.vision.barcode.internal.zzb.b()), zzgVar.c);
    }
}
