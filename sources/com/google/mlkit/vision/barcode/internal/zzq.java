package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzal;
import com.google.android.gms.internal.mlkit_vision_barcode.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.common.internal.ImageConvertUtils;
import java.util.ArrayList;

/* loaded from: classes6.dex */
final class zzq implements zzm {

    /* renamed from: a, reason: collision with root package name */
    public boolean f16000a;
    public final Context b;
    public final zzah c;
    public final zzwp d;
    public zzaj e;

    public zzq(Context context, BarcodeScannerOptions barcodeScannerOptions, zzwp zzwpVar) {
        zzah zzahVar = new zzah();
        this.c = zzahVar;
        this.b = context;
        zzahVar.zza = barcodeScannerOptions.f15988a;
        this.d = zzwpVar;
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public final ArrayList a(InputImage inputImage) throws Throwable {
        zzu[] zzuVarArrZzf;
        if (this.e == null) {
            zzc();
        }
        zzaj zzajVar = this.e;
        if (zzajVar == null) {
            throw new MlKitException("Error initializing the legacy barcode scanner.", 14);
        }
        zzaj zzajVar2 = (zzaj) Preconditions.checkNotNull(zzajVar);
        zzan zzanVar = new zzan(inputImage.c, inputImage.d, 0, 0L, CommonConvertUtils.a(inputImage.e));
        try {
            int i = inputImage.f;
            if (i == -1) {
                zzuVarArrZzf = zzajVar2.zzf(ObjectWrapper.wrap(inputImage.f16001a), zzanVar);
            } else if (i == 17) {
                zzuVarArrZzf = zzajVar2.zze(ObjectWrapper.wrap(null), zzanVar);
            } else if (i == 35) {
                Image.Plane[] planeArr = (Image.Plane[]) Preconditions.checkNotNull(inputImage.c());
                zzanVar.zza = planeArr[0].getRowStride();
                zzuVarArrZzf = zzajVar2.zze(ObjectWrapper.wrap(planeArr[0].getBuffer()), zzanVar);
            } else {
                if (i != 842094169) {
                    throw new MlKitException("Unsupported image format: " + inputImage.f, 3);
                }
                zzuVarArrZzf = zzajVar2.zze(ObjectWrapper.wrap(ImageConvertUtils.a(inputImage)), zzanVar);
            }
            ArrayList arrayList = new ArrayList();
            for (zzu zzuVar : zzuVarArrZzf) {
                arrayList.add(new Barcode(new zzp(zzuVar)));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new MlKitException("Failed to detect with legacy barcode detector", e);
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public final void zzb() {
        zzaj zzajVar = this.e;
        if (zzajVar != null) {
            try {
                zzajVar.zzd();
            } catch (RemoteException e) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e);
            }
            this.e = null;
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public final boolean zzc() throws Throwable {
        Context context = this.b;
        if (this.e != null) {
            return false;
        }
        try {
            zzaj zzajVarZzd = zzal.zza(DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.dynamite").instantiate("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).zzd(ObjectWrapper.wrap(context), this.c);
            this.e = zzajVarZzd;
            zzwp zzwpVar = this.d;
            if (zzajVarZzd == null && !this.f16000a) {
                Log.d("LegacyBarcodeScanner", "Request optional module download.");
                Feature[] featureArr = OptionalModuleUtils.f15984a;
                OptionalModuleUtils.a(context, zzaf.zzh("barcode"));
                this.f16000a = true;
                zzb.c(zzwpVar, zzrb.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            zzb.c(zzwpVar, zzrb.NO_ERROR);
            return false;
        } catch (RemoteException e) {
            throw new MlKitException("Failed to create legacy barcode detector.", e);
        } catch (DynamiteModule.LoadingException e2) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", e2);
        }
    }
}
