package com.woolworths.scanlibrary.models.receipt;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/woolworths/scanlibrary/models/receipt/ReceiptRequestByCartId;", "", "cartId", "", "<init>", "(Ljava/lang/String;)V", "getCartId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ReceiptRequestByCartId {
    public static final int $stable = 0;

    @SerializedName("cartid")
    @Nullable
    private final String cartId;

    public ReceiptRequestByCartId(@Nullable String str) {
        this.cartId = str;
    }

    public static /* synthetic */ ReceiptRequestByCartId copy$default(ReceiptRequestByCartId receiptRequestByCartId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = receiptRequestByCartId.cartId;
        }
        return receiptRequestByCartId.copy(str);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    @NotNull
    public final ReceiptRequestByCartId copy(@Nullable String cartId) {
        return new ReceiptRequestByCartId(cartId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ReceiptRequestByCartId) && Intrinsics.c(this.cartId, ((ReceiptRequestByCartId) other).cartId);
    }

    @Nullable
    public final String getCartId() {
        return this.cartId;
    }

    public int hashCode() {
        String str = this.cartId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return a.h("ReceiptRequestByCartId(cartId=", this.cartId, ")");
    }
}
