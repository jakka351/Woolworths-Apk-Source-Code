package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxa;
import com.google.mlkit.common.sdkinternal.LazyInstanceMap;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;

/* loaded from: classes.dex */
public final class zzi extends LazyInstanceMap {

    /* renamed from: a, reason: collision with root package name */
    public final MlKitContext f15994a;

    public zzi(MlKitContext mlKitContext) {
        this.f15994a = mlKitContext;
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        BarcodeScannerOptions barcodeScannerOptions = (BarcodeScannerOptions) obj;
        MlKitContext mlKitContext = this.f15994a;
        Context contextB = mlKitContext.b();
        zzwp zzwpVarZzb = zzxa.zzb(zzb.b());
        return new zzl(mlKitContext, barcodeScannerOptions, (zzo.b(contextB) || GoogleApiAvailabilityLight.getInstance().getApkVersion(contextB) >= 204500000) ? new zzo(contextB, barcodeScannerOptions, zzwpVarZzb) : new zzq(contextB, barcodeScannerOptions, zzwpVarZzb), zzwpVarZzb);
    }
}
