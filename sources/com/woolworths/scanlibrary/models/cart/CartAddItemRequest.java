package com.woolworths.scanlibrary.models.cart;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/woolworths/scanlibrary/models/cart/CartAddItemRequest;", "", "ean", "", "barcodetype", "quantity", "", "isForcedAdd", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "getEan", "()Ljava/lang/String;", "getBarcodetype", "getQuantity", "()I", "()Z", "setForcedAdd", "(Z)V", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CartAddItemRequest {
    public static final int $stable = 8;

    @SerializedName("barcodetype")
    @NotNull
    private final String barcodetype;

    @SerializedName("ean")
    @NotNull
    private final String ean;

    @SerializedName("isForcedAdd")
    private boolean isForcedAdd;

    @SerializedName("quantity")
    private final int quantity;

    public CartAddItemRequest(@NotNull String ean, @NotNull String barcodetype, int i, boolean z) {
        Intrinsics.h(ean, "ean");
        Intrinsics.h(barcodetype, "barcodetype");
        this.ean = ean;
        this.barcodetype = barcodetype;
        this.quantity = i;
        this.isForcedAdd = z;
    }

    @NotNull
    public final String getBarcodetype() {
        return this.barcodetype;
    }

    @NotNull
    public final String getEan() {
        return this.ean;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: isForcedAdd, reason: from getter */
    public final boolean getIsForcedAdd() {
        return this.isForcedAdd;
    }

    public final void setForcedAdd(boolean z) {
        this.isForcedAdd = z;
    }

    public /* synthetic */ CartAddItemRequest(String str, String str2, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? 1 : i, (i2 & 8) != 0 ? false : z);
    }
}
