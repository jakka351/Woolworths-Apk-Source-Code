package com.scandit.datacapture.barcode.pick.ui;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleCustomViewResponse;", "", "Landroid/view/View;", "component1$scandit_barcode_capture", "()Landroid/view/View;", "component1", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;", "component2$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;", "component2", "view", "statusIconStyle", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Landroid/view/View;", "getView$scandit_barcode_capture", "b", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;", "getStatusIconStyle$scandit_barcode_capture", "<init>", "(Landroid/view/View;Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class BarcodePickViewHighlightStyleCustomViewResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* renamed from: b, reason: from kotlin metadata */
    private final BarcodePickStatusIconStyle statusIconStyle;

    public BarcodePickViewHighlightStyleCustomViewResponse(@Nullable View view, @Nullable BarcodePickStatusIconStyle barcodePickStatusIconStyle) {
        this.view = view;
        this.statusIconStyle = barcodePickStatusIconStyle;
    }

    public static /* synthetic */ BarcodePickViewHighlightStyleCustomViewResponse copy$default(BarcodePickViewHighlightStyleCustomViewResponse barcodePickViewHighlightStyleCustomViewResponse, View view, BarcodePickStatusIconStyle barcodePickStatusIconStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            view = barcodePickViewHighlightStyleCustomViewResponse.view;
        }
        if ((i & 2) != 0) {
            barcodePickStatusIconStyle = barcodePickViewHighlightStyleCustomViewResponse.statusIconStyle;
        }
        return barcodePickViewHighlightStyleCustomViewResponse.copy(view, barcodePickStatusIconStyle);
    }

    @Nullable
    /* renamed from: component1$scandit_barcode_capture, reason: from getter */
    public final View getView() {
        return this.view;
    }

    @Nullable
    /* renamed from: component2$scandit_barcode_capture, reason: from getter */
    public final BarcodePickStatusIconStyle getStatusIconStyle() {
        return this.statusIconStyle;
    }

    @NotNull
    public final BarcodePickViewHighlightStyleCustomViewResponse copy(@Nullable View view, @Nullable BarcodePickStatusIconStyle statusIconStyle) {
        return new BarcodePickViewHighlightStyleCustomViewResponse(view, statusIconStyle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarcodePickViewHighlightStyleCustomViewResponse)) {
            return false;
        }
        BarcodePickViewHighlightStyleCustomViewResponse barcodePickViewHighlightStyleCustomViewResponse = (BarcodePickViewHighlightStyleCustomViewResponse) other;
        return Intrinsics.c(this.view, barcodePickViewHighlightStyleCustomViewResponse.view) && Intrinsics.c(this.statusIconStyle, barcodePickViewHighlightStyleCustomViewResponse.statusIconStyle);
    }

    @Nullable
    public final BarcodePickStatusIconStyle getStatusIconStyle$scandit_barcode_capture() {
        return this.statusIconStyle;
    }

    @Nullable
    public final View getView$scandit_barcode_capture() {
        return this.view;
    }

    public int hashCode() {
        View view = this.view;
        int iHashCode = (view == null ? 0 : view.hashCode()) * 31;
        BarcodePickStatusIconStyle barcodePickStatusIconStyle = this.statusIconStyle;
        return iHashCode + (barcodePickStatusIconStyle != null ? barcodePickStatusIconStyle.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BarcodePickViewHighlightStyleCustomViewResponse(view=" + this.view + ", statusIconStyle=" + this.statusIconStyle + ')';
    }
}
