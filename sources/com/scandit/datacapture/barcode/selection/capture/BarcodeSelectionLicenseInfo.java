package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionLicenseInfo;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionLicenseInfo;", "", "", "toJson", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getLicensedSymbologies", "()Ljava/util/Set;", "licensedSymbologies", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelectionLicenseInfo;", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelectionLicenseInfo;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeSelectionLicenseInfo {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeSelectionLicenseInfo f18024a;

    public BarcodeSelectionLicenseInfo(@NotNull NativeBarcodeSelectionLicenseInfo impl) {
        Intrinsics.h(impl, "impl");
        this.f18024a = impl;
    }

    @NotNull
    public final Set<Symbology> getLicensedSymbologies() {
        HashSet<Symbology> licensedSymbologies = this.f18024a.getLicensedSymbologies();
        Intrinsics.g(licensedSymbologies, "impl.licensedSymbologies");
        return licensedSymbologies;
    }

    @NotNull
    public final String toJson() {
        String json = this.f18024a.toJson();
        Intrinsics.g(json, "impl.toJson()");
        return json;
    }
}
