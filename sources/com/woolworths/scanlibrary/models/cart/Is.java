package com.woolworths.scanlibrary.models.cart;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/woolworths/scanlibrary/models/cart/Is;", "", "enabledigitalpay", "", "transferToPos", "finishTransaction", "paymentFailLimitExceeded", "<init>", "(ZZZZ)V", "getEnabledigitalpay", "()Z", "getTransferToPos", "getFinishTransaction", "getPaymentFailLimitExceeded", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Is {
    public static final int $stable = 0;

    @SerializedName("enabledigitalpay")
    private final boolean enabledigitalpay;

    @SerializedName("finishTransaction")
    private final boolean finishTransaction;

    @SerializedName("paymentFailLimitExceeded")
    private final boolean paymentFailLimitExceeded;

    @SerializedName("transferToPos")
    private final boolean transferToPos;

    public Is(boolean z, boolean z2, boolean z3, boolean z4) {
        this.enabledigitalpay = z;
        this.transferToPos = z2;
        this.finishTransaction = z3;
        this.paymentFailLimitExceeded = z4;
    }

    public static /* synthetic */ Is copy$default(Is is, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = is.enabledigitalpay;
        }
        if ((i & 2) != 0) {
            z2 = is.transferToPos;
        }
        if ((i & 4) != 0) {
            z3 = is.finishTransaction;
        }
        if ((i & 8) != 0) {
            z4 = is.paymentFailLimitExceeded;
        }
        return is.copy(z, z2, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabledigitalpay() {
        return this.enabledigitalpay;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getTransferToPos() {
        return this.transferToPos;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getFinishTransaction() {
        return this.finishTransaction;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getPaymentFailLimitExceeded() {
        return this.paymentFailLimitExceeded;
    }

    @NotNull
    public final Is copy(boolean enabledigitalpay, boolean transferToPos, boolean finishTransaction, boolean paymentFailLimitExceeded) {
        return new Is(enabledigitalpay, transferToPos, finishTransaction, paymentFailLimitExceeded);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Is)) {
            return false;
        }
        Is is = (Is) other;
        return this.enabledigitalpay == is.enabledigitalpay && this.transferToPos == is.transferToPos && this.finishTransaction == is.finishTransaction && this.paymentFailLimitExceeded == is.paymentFailLimitExceeded;
    }

    public final boolean getEnabledigitalpay() {
        return this.enabledigitalpay;
    }

    public final boolean getFinishTransaction() {
        return this.finishTransaction;
    }

    public final boolean getPaymentFailLimitExceeded() {
        return this.paymentFailLimitExceeded;
    }

    public final boolean getTransferToPos() {
        return this.transferToPos;
    }

    public int hashCode() {
        return Boolean.hashCode(this.paymentFailLimitExceeded) + b.e(b.e(Boolean.hashCode(this.enabledigitalpay) * 31, 31, this.transferToPos), 31, this.finishTransaction);
    }

    @NotNull
    public String toString() {
        boolean z = this.enabledigitalpay;
        boolean z2 = this.transferToPos;
        return a.q(b.v("Is(enabledigitalpay=", ", transferToPos=", ", finishTransaction=", z, z2), this.finishTransaction, ", paymentFailLimitExceeded=", this.paymentFailLimitExceeded, ")");
    }

    public /* synthetic */ Is(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? false : z2, z3, (i & 8) != 0 ? false : z4);
    }
}
