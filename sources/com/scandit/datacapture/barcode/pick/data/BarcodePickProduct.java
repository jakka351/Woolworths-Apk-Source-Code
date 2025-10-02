package com.scandit.datacapture.barcode.pick.data;

import com.scandit.datacapture.barcode.internal.module.pick.data.NativeBarcodePickProduct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015B\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0016J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001a\u0010\f\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProduct;", "", "other", "", "equals", "", "hashCode", "Lcom/scandit/datacapture/barcode/internal/module/pick/data/NativeBarcodePickProduct;", "a", "Lcom/scandit/datacapture/barcode/internal/module/pick/data/NativeBarcodePickProduct;", "get_impl$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/pick/data/NativeBarcodePickProduct;", "_impl", "getQuantityToPick", "()I", "quantityToPick", "", "getIdentifier", "()Ljava/lang/String;", "identifier", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/data/NativeBarcodePickProduct;)V", "(Ljava/lang/String;I)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodePickProduct {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final NativeBarcodePickProduct _impl;

    public BarcodePickProduct(@NotNull NativeBarcodePickProduct _impl) {
        Intrinsics.h(_impl, "_impl");
        this._impl = _impl;
    }

    public boolean equals(@Nullable Object other) {
        if (other == null || !(other instanceof BarcodePickProduct)) {
            return false;
        }
        if (other == this) {
            return true;
        }
        BarcodePickProduct barcodePickProduct = (BarcodePickProduct) other;
        return Intrinsics.c(getIdentifier(), barcodePickProduct.getIdentifier()) && getQuantityToPick() == barcodePickProduct.getQuantityToPick();
    }

    @NotNull
    public final String getIdentifier() {
        String identifier = this._impl.getIdentifier();
        Intrinsics.g(identifier, "_impl.identifier");
        return identifier;
    }

    public final int getQuantityToPick() {
        return this._impl.getQuantity();
    }

    @NotNull
    /* renamed from: get_impl$scandit_barcode_capture, reason: from getter */
    public final NativeBarcodePickProduct get_impl() {
        return this._impl;
    }

    public int hashCode() {
        return Integer.hashCode(getQuantityToPick()) + ((getIdentifier().hashCode() + 527) * 31);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BarcodePickProduct(@NotNull String identifier, int i) {
        this(new NativeBarcodePickProduct(identifier, i));
        Intrinsics.h(identifier, "identifier");
    }
}
