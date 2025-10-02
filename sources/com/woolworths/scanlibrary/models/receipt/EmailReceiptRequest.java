package com.woolworths.scanlibrary.models.receipt;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/models/receipt/EmailReceiptRequest;", "", "cartid", "", "<init>", "(Ljava/lang/String;)V", "getCartid", "()Ljava/lang/String;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EmailReceiptRequest {
    public static final int $stable = 0;

    @SerializedName("cartid")
    @NotNull
    private final String cartid;

    public EmailReceiptRequest(@NotNull String cartid) {
        Intrinsics.h(cartid, "cartid");
        this.cartid = cartid;
    }

    @NotNull
    public final String getCartid() {
        return this.cartid;
    }
}
