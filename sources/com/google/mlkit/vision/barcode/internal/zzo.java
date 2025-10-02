package com.google.mlkit.vision.barcode.internal;

import YU.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstall;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyu;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.common.sdkinternal.zzr;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.common.internal.ImageUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* loaded from: classes6.dex */
final class zzo implements zzm {
    public static final zzcs h = zzcs.zzh("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* renamed from: a, reason: collision with root package name */
    public boolean f15998a;
    public boolean b;
    public boolean c;
    public final Context d;
    public final BarcodeScannerOptions e;
    public final zzwp f;
    public zzyl g;

    public zzo(Context context, BarcodeScannerOptions barcodeScannerOptions, zzwp zzwpVar) {
        this.d = context;
        this.e = barcodeScannerOptions;
        this.f = zzwpVar;
    }

    public static boolean b(Context context) {
        return DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) > 0;
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public final ArrayList a(InputImage inputImage) throws Throwable {
        IObjectWrapper iObjectWrapperWrap;
        if (this.g == null) {
            zzc();
        }
        zzyl zzylVar = (zzyl) Preconditions.checkNotNull(this.g);
        if (!this.f15998a) {
            try {
                zzylVar.zze();
                this.f15998a = true;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to init barcode scanner.", e);
            }
        }
        int rowStride = inputImage.c;
        if (inputImage.f == 35) {
            rowStride = ((Image.Plane[]) Preconditions.checkNotNull(inputImage.c()))[0].getRowStride();
        }
        zzyu zzyuVar = new zzyu(inputImage.f, rowStride, inputImage.d, CommonConvertUtils.a(inputImage.e), SystemClock.elapsedRealtime());
        ImageUtils.f16003a.getClass();
        int i = inputImage.f;
        if (i == -1) {
            iObjectWrapperWrap = ObjectWrapper.wrap((Bitmap) Preconditions.checkNotNull(inputImage.f16001a));
        } else if (i == 17) {
            iObjectWrapperWrap = ObjectWrapper.wrap((ByteBuffer) Preconditions.checkNotNull(null));
        } else if (i != 35) {
            if (i != 842094169) {
                throw new MlKitException(a.d(inputImage.f, "Unsupported image format: "), 3);
            }
            iObjectWrapperWrap = ObjectWrapper.wrap((ByteBuffer) Preconditions.checkNotNull(null));
        } else {
            iObjectWrapperWrap = ObjectWrapper.wrap(inputImage.b());
        }
        try {
            List listZzd = zzylVar.zzd(iObjectWrapperWrap, zzyuVar);
            ArrayList arrayList = new ArrayList();
            Iterator it = listZzd.iterator();
            while (it.hasNext()) {
                arrayList.add(new Barcode(new zzn((zzyb) it.next())));
            }
            return arrayList;
        } catch (RemoteException e2) {
            throw new MlKitException("Failed to run barcode scanner.", e2);
        }
    }

    public final zzyl c(DynamiteModule.VersionPolicy versionPolicy, String str, String str2) {
        Context context = this.d;
        return zzyn.zza(DynamiteModule.load(context, versionPolicy, str).instantiate(str2)).zzd(ObjectWrapper.wrap(context), new zzyd(this.e.f15988a, false));
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public final void zzb() {
        zzyl zzylVar = this.g;
        if (zzylVar != null) {
            try {
                zzylVar.zzf();
            } catch (RemoteException e) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e);
            }
            this.g = null;
            this.f15998a = false;
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public final boolean zzc() throws Throwable {
        if (this.g != null) {
            return this.b;
        }
        Context context = this.d;
        boolean zB = b(context);
        zzwp zzwpVar = this.f;
        if (zB) {
            this.b = true;
            try {
                this.g = c(DynamiteModule.PREFER_LOCAL, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e) {
                throw new MlKitException("Failed to create thick barcode scanner.", e);
            } catch (DynamiteModule.LoadingException e2) {
                throw new MlKitException("Failed to load the bundled barcode module.", e2);
            }
        } else {
            boolean zAreModulesAvailable = false;
            this.b = false;
            Feature[] featureArr = OptionalModuleUtils.f15984a;
            int apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(context);
            zzcs zzcsVar = h;
            if (apkVersion >= 221500000) {
                final Feature[] featureArrB = OptionalModuleUtils.b(zzcsVar, OptionalModuleUtils.d);
                try {
                    zAreModulesAvailable = ((ModuleAvailabilityResponse) Tasks.await(ModuleInstall.getClient(context).areModulesAvailable(new OptionalModuleApi() { // from class: com.google.mlkit.common.sdkinternal.zzq
                        @Override // com.google.android.gms.common.api.OptionalModuleApi
                        public final Feature[] getOptionalFeatures() {
                            Feature[] featureArr2 = OptionalModuleUtils.f15984a;
                            return featureArrB;
                        }
                    }).addOnFailureListener(new zzr()))).areModulesAvailable();
                } catch (InterruptedException | ExecutionException e3) {
                    Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e3);
                }
            } else {
                try {
                    Iterator it = zzcsVar.iterator();
                    while (it.hasNext()) {
                        DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, (String) it.next());
                    }
                    zAreModulesAvailable = true;
                } catch (DynamiteModule.LoadingException unused) {
                }
            }
            if (!zAreModulesAvailable) {
                if (!this.c) {
                    OptionalModuleUtils.a(context, zzcs.zzh("barcode", "tflite_dynamite"));
                    this.c = true;
                }
                zzb.c(zzwpVar, zzrb.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.g = c(DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.LoadingException e4) {
                zzb.c(zzwpVar, zzrb.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException("Failed to create thin barcode scanner.", e4);
            }
        }
        zzb.c(zzwpVar, zzrb.NO_ERROR);
        return this.b;
    }
}
