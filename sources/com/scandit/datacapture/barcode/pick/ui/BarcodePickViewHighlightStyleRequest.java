package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleRequest;", "", "", "toJson", "component1", "component2", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "component3", "itemData", "productIdentifier", "state", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getItemData", "()Ljava/lang/String;", "b", "getProductIdentifier", "c", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "getState", "()Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class BarcodePickViewHighlightStyleRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String itemData;

    /* renamed from: b, reason: from kotlin metadata */
    private final String productIdentifier;

    /* renamed from: c, reason: from kotlin metadata */
    private final BarcodePickState state;

    public BarcodePickViewHighlightStyleRequest(@NotNull String itemData, @Nullable String str, @NotNull BarcodePickState state) {
        Intrinsics.h(itemData, "itemData");
        Intrinsics.h(state, "state");
        this.itemData = itemData;
        this.productIdentifier = str;
        this.state = state;
    }

    public static /* synthetic */ BarcodePickViewHighlightStyleRequest copy$default(BarcodePickViewHighlightStyleRequest barcodePickViewHighlightStyleRequest, String str, String str2, BarcodePickState barcodePickState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = barcodePickViewHighlightStyleRequest.itemData;
        }
        if ((i & 2) != 0) {
            str2 = barcodePickViewHighlightStyleRequest.productIdentifier;
        }
        if ((i & 4) != 0) {
            barcodePickState = barcodePickViewHighlightStyleRequest.state;
        }
        return barcodePickViewHighlightStyleRequest.copy(str, str2, barcodePickState);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getItemData() {
        return this.itemData;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BarcodePickState getState() {
        return this.state;
    }

    @NotNull
    public final BarcodePickViewHighlightStyleRequest copy(@NotNull String itemData, @Nullable String productIdentifier, @NotNull BarcodePickState state) {
        Intrinsics.h(itemData, "itemData");
        Intrinsics.h(state, "state");
        return new BarcodePickViewHighlightStyleRequest(itemData, productIdentifier, state);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarcodePickViewHighlightStyleRequest)) {
            return false;
        }
        BarcodePickViewHighlightStyleRequest barcodePickViewHighlightStyleRequest = (BarcodePickViewHighlightStyleRequest) other;
        return Intrinsics.c(this.itemData, barcodePickViewHighlightStyleRequest.itemData) && Intrinsics.c(this.productIdentifier, barcodePickViewHighlightStyleRequest.productIdentifier) && this.state == barcodePickViewHighlightStyleRequest.state;
    }

    @NotNull
    public final String getItemData() {
        return this.itemData;
    }

    @Nullable
    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    @NotNull
    public final BarcodePickState getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = this.itemData.hashCode() * 31;
        String str = this.productIdentifier;
        return this.state.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public final String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("itemData", this.itemData);
        String str = this.productIdentifier;
        if (str != null) {
            jSONObject.put("productIdentifier", str);
        }
        jSONObject.put("state", this.state.toJsonString());
        String string = jSONObject.toString();
        Intrinsics.g(string, "JSONObject().apply {\n   …tring())\n    }.toString()");
        return string;
    }

    @NotNull
    public String toString() {
        return "BarcodePickViewHighlightStyleRequest(itemData=" + this.itemData + ", productIdentifier=" + this.productIdentifier + ", state=" + this.state + ')';
    }
}
