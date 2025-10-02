package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.moduleinstall.ModuleInstall;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import com.google.android.gms.internal.mlkit_common.zzah;
import com.google.android.gms.internal.mlkit_common.zzai;
import java.util.List;
import java.util.Map;

@KeepForSdk
/* loaded from: classes6.dex */
public class OptionalModuleUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final Feature[] f15984a = new Feature[0];
    public static final Feature b;
    public static final zzai c;
    public static final zzai d;

    static {
        Feature feature = new Feature("vision.barcode", 1L);
        b = feature;
        Feature feature2 = new Feature("vision.custom.ica", 1L);
        Feature feature3 = new Feature("vision.face", 1L);
        Feature feature4 = new Feature("vision.ica", 1L);
        Feature feature5 = new Feature("vision.ocr", 1L);
        new Feature("mlkit.ocr.chinese", 1L);
        new Feature("mlkit.ocr.common", 1L);
        new Feature("mlkit.ocr.devanagari", 1L);
        new Feature("mlkit.ocr.japanese", 1L);
        new Feature("mlkit.ocr.korean", 1L);
        Feature feature6 = new Feature("mlkit.langid", 1L);
        Feature feature7 = new Feature("mlkit.nlclassifier", 1L);
        Feature feature8 = new Feature("tflite_dynamite", 1L);
        Feature feature9 = new Feature("mlkit.barcode.ui", 1L);
        Feature feature10 = new Feature("mlkit.smartreply", 1L);
        new Feature("mlkit.image.caption", 1L);
        new Feature("mlkit.docscan.detect", 1L);
        new Feature("mlkit.docscan.crop", 1L);
        new Feature("mlkit.docscan.enhance", 1L);
        new Feature("mlkit.docscan.ui", 1L);
        new Feature("mlkit.docscan.stain", 1L);
        new Feature("mlkit.docscan.shadow", 1L);
        new Feature("mlkit.quality.aesthetic", 1L);
        new Feature("mlkit.quality.technical", 1L);
        new Feature("mlkit.segmentation.subject", 1L);
        zzah zzahVar = new zzah();
        zzahVar.zza("barcode", feature);
        zzahVar.zza("custom_ica", feature2);
        zzahVar.zza("face", feature3);
        zzahVar.zza("ica", feature4);
        zzahVar.zza("ocr", feature5);
        zzahVar.zza("langid", feature6);
        zzahVar.zza("nlclassifier", feature7);
        zzahVar.zza("tflite_dynamite", feature8);
        zzahVar.zza("barcode_ui", feature9);
        zzahVar.zza("smart_reply", feature10);
        c = zzahVar.zzb();
        zzah zzahVar2 = new zzah();
        zzahVar2.zza("com.google.android.gms.vision.barcode", feature);
        zzahVar2.zza("com.google.android.gms.vision.custom.ica", feature2);
        zzahVar2.zza("com.google.android.gms.vision.face", feature3);
        zzahVar2.zza("com.google.android.gms.vision.ica", feature4);
        zzahVar2.zza("com.google.android.gms.vision.ocr", feature5);
        zzahVar2.zza("com.google.android.gms.mlkit.langid", feature6);
        zzahVar2.zza("com.google.android.gms.mlkit.nlclassifier", feature7);
        zzahVar2.zza("com.google.android.gms.tflite_dynamite", feature8);
        zzahVar2.zza("com.google.android.gms.mlkit_smartreply", feature10);
        d = zzahVar2.zzb();
    }

    public static void a(Context context, List list) {
        if (GoogleApiAvailabilityLight.getInstance().getApkVersion(context) >= 221500000) {
            final Feature[] featureArrB = b(list, c);
            ModuleInstall.getClient(context).installModules(ModuleInstallRequest.newBuilder().addApi(new OptionalModuleApi() { // from class: com.google.mlkit.common.sdkinternal.zzo
                @Override // com.google.android.gms.common.api.OptionalModuleApi
                public final Feature[] getOptionalFeatures() {
                    Feature[] featureArr = OptionalModuleUtils.f15984a;
                    return featureArrB;
                }
            }).build()).addOnFailureListener(new zzp());
        } else {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
            intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
            context.sendBroadcast(intent);
        }
    }

    public static Feature[] b(List list, Map map) {
        Feature[] featureArr = new Feature[list.size()];
        for (int i = 0; i < list.size(); i++) {
            featureArr[i] = (Feature) Preconditions.checkNotNull((Feature) map.get(list.get(i)));
        }
        return featureArr;
    }
}
