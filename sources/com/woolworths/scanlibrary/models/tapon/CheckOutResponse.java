package com.woolworths.scanlibrary.models.tapon;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import com.google.gson.annotations.SerializedName;
import com.woolworths.scanlibrary.models.receipt.Receipt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/woolworths/scanlibrary/models/tapon/CheckOutResponse;", "", "statusCode", "", "isBagCheckRequired", "", "posBarCode", "message", "receipt", "Lcom/woolworths/scanlibrary/models/receipt/Receipt;", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/woolworths/scanlibrary/models/receipt/Receipt;)V", "getStatusCode", "()Ljava/lang/String;", "()Z", "getPosBarCode", "getMessage", "getReceipt", "()Lcom/woolworths/scanlibrary/models/receipt/Receipt;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CheckOutResponse {
    public static final int $stable = 8;

    @SerializedName("isBagCheckRequired")
    private final boolean isBagCheckRequired;

    @SerializedName("message")
    @NotNull
    private final String message;

    @SerializedName("posbarcode")
    @NotNull
    private final String posBarCode;

    @SerializedName("receipt")
    @NotNull
    private final Receipt receipt;

    @SerializedName("statusCode")
    @NotNull
    private final String statusCode;

    public CheckOutResponse(@NotNull String statusCode, boolean z, @NotNull String posBarCode, @NotNull String message, @NotNull Receipt receipt) {
        Intrinsics.h(statusCode, "statusCode");
        Intrinsics.h(posBarCode, "posBarCode");
        Intrinsics.h(message, "message");
        Intrinsics.h(receipt, "receipt");
        this.statusCode = statusCode;
        this.isBagCheckRequired = z;
        this.posBarCode = posBarCode;
        this.message = message;
        this.receipt = receipt;
    }

    public static /* synthetic */ CheckOutResponse copy$default(CheckOutResponse checkOutResponse, String str, boolean z, String str2, String str3, Receipt receipt, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkOutResponse.statusCode;
        }
        if ((i & 2) != 0) {
            z = checkOutResponse.isBagCheckRequired;
        }
        if ((i & 4) != 0) {
            str2 = checkOutResponse.posBarCode;
        }
        if ((i & 8) != 0) {
            str3 = checkOutResponse.message;
        }
        if ((i & 16) != 0) {
            receipt = checkOutResponse.receipt;
        }
        Receipt receipt2 = receipt;
        String str4 = str2;
        return checkOutResponse.copy(str, z, str4, str3, receipt2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsBagCheckRequired() {
        return this.isBagCheckRequired;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPosBarCode() {
        return this.posBarCode;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Receipt getReceipt() {
        return this.receipt;
    }

    @NotNull
    public final CheckOutResponse copy(@NotNull String statusCode, boolean isBagCheckRequired, @NotNull String posBarCode, @NotNull String message, @NotNull Receipt receipt) {
        Intrinsics.h(statusCode, "statusCode");
        Intrinsics.h(posBarCode, "posBarCode");
        Intrinsics.h(message, "message");
        Intrinsics.h(receipt, "receipt");
        return new CheckOutResponse(statusCode, isBagCheckRequired, posBarCode, message, receipt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckOutResponse)) {
            return false;
        }
        CheckOutResponse checkOutResponse = (CheckOutResponse) other;
        return Intrinsics.c(this.statusCode, checkOutResponse.statusCode) && this.isBagCheckRequired == checkOutResponse.isBagCheckRequired && Intrinsics.c(this.posBarCode, checkOutResponse.posBarCode) && Intrinsics.c(this.message, checkOutResponse.message) && Intrinsics.c(this.receipt, checkOutResponse.receipt);
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getPosBarCode() {
        return this.posBarCode;
    }

    @NotNull
    public final Receipt getReceipt() {
        return this.receipt;
    }

    @NotNull
    public final String getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        return this.receipt.hashCode() + b.c(b.c(b.e(this.statusCode.hashCode() * 31, 31, this.isBagCheckRequired), 31, this.posBarCode), 31, this.message);
    }

    public final boolean isBagCheckRequired() {
        return this.isBagCheckRequired;
    }

    @NotNull
    public String toString() {
        String str = this.statusCode;
        boolean z = this.isBagCheckRequired;
        String str2 = this.posBarCode;
        String str3 = this.message;
        Receipt receipt = this.receipt;
        StringBuilder sbQ = a.q("CheckOutResponse(statusCode=", str, ", isBagCheckRequired=", ", posBarCode=", z);
        a.B(sbQ, str2, ", message=", str3, ", receipt=");
        sbQ.append(receipt);
        sbQ.append(")");
        return sbQ.toString();
    }
}
