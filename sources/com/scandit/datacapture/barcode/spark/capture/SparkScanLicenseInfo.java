package com.scandit.datacapture.barcode.spark.capture;

import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanLicenseInfo;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/capture/SparkScanLicenseInfo;", "", "", "toJson", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getLicensedSymbologies", "()Ljava/util/Set;", "licensedSymbologies", "Lcom/scandit/datacapture/barcode/spark/internal/module/capture/NativeSparkScanLicenseInfo;", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/spark/internal/module/capture/NativeSparkScanLicenseInfo;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SparkScanLicenseInfo {

    /* renamed from: a, reason: collision with root package name */
    private final NativeSparkScanLicenseInfo f18085a;

    public SparkScanLicenseInfo(@NotNull NativeSparkScanLicenseInfo impl) {
        Intrinsics.h(impl, "impl");
        this.f18085a = impl;
    }

    @NotNull
    public final Set<Symbology> getLicensedSymbologies() {
        HashSet<Symbology> licensedSymbologies = this.f18085a.getLicensedSymbologies();
        Intrinsics.g(licensedSymbologies, "impl.licensedSymbologies");
        return licensedSymbologies;
    }

    @NotNull
    public final String toJson() {
        String json = this.f18085a.toJson();
        Intrinsics.g(json, "impl.toJson()");
        return json;
    }
}
