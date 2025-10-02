package com.google.mlkit.vision.barcode.bundled.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzba;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbm;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.MultiScaleDecodingOptions;
import com.google.android.libraries.barhopper.MultiScaleDetectionOptions;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.barhopper.deeplearning.BarhopperV3Options;
import com.google.barhopper.deeplearning.zzab;
import com.google.barhopper.deeplearning.zzac;
import com.google.barhopper.deeplearning.zzb;
import com.google.barhopper.deeplearning.zzc;
import com.google.barhopper.deeplearning.zze;
import com.google.barhopper.deeplearning.zzf;
import com.google.barhopper.deeplearning.zzh;
import com.google.barhopper.deeplearning.zzi;
import com.google.barhopper.deeplearning.zzk;
import com.google.photos.vision.barhopper.BarhopperProto$BarhopperResponse;
import com.google.photos.vision.barhopper.zzl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
final class zza extends zzbm {
    public static final int[] g = {5, 7, 7, 7, 5, 5};
    public static final double[][] h = {new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, new double[]{0.5d, 1.0d}, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};
    public final Context d;
    public final zzba e;
    public BarhopperV3 f;

    public zza(Context context, zzba zzbaVar) {
        this.d = context;
        this.e = zzbaVar;
    }

    public static zzan h1(zzl zzlVar, String str, String str2) {
        if (zzlVar == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        return new zzan(zzlVar.d(), zzlVar.zzd(), zzlVar.a(), zzlVar.b(), zzlVar.zzc(), zzlVar.c(), zzlVar.f(), matcher.find() ? matcher.group(1) : null);
    }

    public final BarhopperProto$BarhopperResponse i1(ByteBuffer byteBuffer, zzcc zzccVar, RecognitionOptions recognitionOptions) {
        BarhopperV3 barhopperV3 = (BarhopperV3) Preconditions.checkNotNull(this.f);
        if (((ByteBuffer) Preconditions.checkNotNull(byteBuffer)).isDirect()) {
            return barhopperV3.b(zzccVar.zzd(), zzccVar.zza(), byteBuffer, recognitionOptions);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.c(zzccVar.zzd(), zzccVar.zza(), byteBuffer.array(), recognitionOptions);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.c(zzccVar.zzd(), zzccVar.zza(), bArr, recognitionOptions);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        */
    public final java.util.ArrayList j1(com.google.android.gms.dynamic.IObjectWrapper r57, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcc r58, com.google.android.libraries.barhopper.RecognitionOptions r59) {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.barcode.bundled.internal.zza.j1(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcc, com.google.android.libraries.barhopper.RecognitionOptions):java.util.ArrayList");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public final List zzb(IObjectWrapper iObjectWrapper, zzcc zzccVar) {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        zzba zzbaVar = this.e;
        recognitionOptions.a(zzbaVar.zza());
        recognitionOptions.f(zzbaVar.zzb());
        recognitionOptions.b();
        recognitionOptions.c();
        return j1(iObjectWrapper, zzccVar, recognitionOptions);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public final List zzc(IObjectWrapper iObjectWrapper, zzcc zzccVar, zzbc zzbcVar) {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        zzba zzbaVar = this.e;
        recognitionOptions.a(zzbaVar.zza());
        recognitionOptions.f(zzbaVar.zzb());
        recognitionOptions.b();
        recognitionOptions.c();
        MultiScaleDecodingOptions multiScaleDecodingOptions = new MultiScaleDecodingOptions();
        multiScaleDecodingOptions.a(zzbcVar.zza().zzc());
        multiScaleDecodingOptions.b(zzbcVar.zza().zza());
        multiScaleDecodingOptions.c(zzbcVar.zza().zzb());
        recognitionOptions.d(multiScaleDecodingOptions);
        MultiScaleDetectionOptions multiScaleDetectionOptions = new MultiScaleDetectionOptions();
        multiScaleDetectionOptions.a(zzbcVar.zza().zzc());
        recognitionOptions.e(multiScaleDetectionOptions);
        recognitionOptions.g(zzbcVar.zzb());
        return j1(iObjectWrapper, zzccVar, recognitionOptions);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public final void zzd() throws IOException {
        Context context = this.d;
        if (this.f != null) {
            return;
        }
        BarhopperV3 barhopperV3 = new BarhopperV3();
        System.loadLibrary("barhopper_v3");
        this.f = barhopperV3;
        zzh zzhVarA = zzi.a();
        zze zzeVarA = zzf.a();
        int i = 16;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            zzb zzbVarA = zzc.a();
            zzbVarA.c(i);
            zzbVarA.d(i);
            for (int i4 = 0; i4 < g[i3]; i4++) {
                double[] dArr = h[i2];
                double d = dArr[0] * 320.0d;
                float fSqrt = (float) Math.sqrt(dArr[1]);
                float f = (float) d;
                zzbVarA.a(f / fSqrt);
                zzbVarA.b(f * fSqrt);
                i2++;
            }
            i += i;
            zzeVarA.a(zzbVarA);
        }
        zzhVarA.a(zzeVarA);
        try {
            InputStream inputStreamOpen = context.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
            try {
                InputStream inputStreamOpen2 = context.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
                try {
                    InputStream inputStreamOpen3 = context.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                    try {
                        BarhopperV3 barhopperV32 = (BarhopperV3) Preconditions.checkNotNull(this.f);
                        zzk zzkVarA = BarhopperV3Options.a();
                        zzhVarA.b(zzdf.zzs(inputStreamOpen));
                        zzkVarA.a(zzhVarA);
                        zzab zzabVarA = zzac.a();
                        zzabVarA.a(zzdf.zzs(inputStreamOpen2));
                        zzabVarA.b(zzdf.zzs(inputStreamOpen3));
                        zzkVarA.b(zzabVarA);
                        barhopperV32.a(zzkVarA.zzj());
                        if (inputStreamOpen3 != null) {
                            inputStreamOpen3.close();
                        }
                        if (inputStreamOpen2 != null) {
                            inputStreamOpen2.close();
                        }
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            throw new IllegalStateException("Failed to open Barcode models", e);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public final void zzf() {
        BarhopperV3 barhopperV3 = this.f;
        if (barhopperV3 != null) {
            barhopperV3.close();
            this.f = null;
        }
    }
}
