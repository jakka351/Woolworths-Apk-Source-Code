package com.scandit.datacapture.barcode.find.capture;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItemSearchOptions;", "", "", "component1", "barcodeData", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getBarcodeData", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class BarcodeFindItemSearchOptions {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String barcodeData;

    public BarcodeFindItemSearchOptions(@NotNull String barcodeData) {
        Intrinsics.h(barcodeData, "barcodeData");
        this.barcodeData = barcodeData;
    }

    public static /* synthetic */ BarcodeFindItemSearchOptions copy$default(BarcodeFindItemSearchOptions barcodeFindItemSearchOptions, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = barcodeFindItemSearchOptions.barcodeData;
        }
        return barcodeFindItemSearchOptions.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBarcodeData() {
        return this.barcodeData;
    }

    @NotNull
    public final BarcodeFindItemSearchOptions copy(@NotNull String barcodeData) {
        Intrinsics.h(barcodeData, "barcodeData");
        return new BarcodeFindItemSearchOptions(barcodeData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BarcodeFindItemSearchOptions) && Intrinsics.c(this.barcodeData, ((BarcodeFindItemSearchOptions) other).barcodeData);
    }

    @NotNull
    public final String getBarcodeData() {
        return this.barcodeData;
    }

    public int hashCode() {
        return this.barcodeData.hashCode();
    }

    @NotNull
    public String toString() {
        return androidx.camera.core.impl.b.r(new StringBuilder("BarcodeFindItemSearchOptions(barcodeData="), this.barcodeData, ')');
    }
}
