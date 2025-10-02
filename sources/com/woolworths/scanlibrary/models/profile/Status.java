package com.woolworths.scanlibrary.models.profile;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import com.woolworths.scanlibrary.models.cart.CartStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003Jp\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\u00032\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, d2 = {"Lcom/woolworths/scanlibrary/models/profile/Status;", "", "istxnhistory", "", "iswhitelisted", "istncaccepted", "ispaymentadded", "isrewardsavailable", "isskippedrewardsadd", "cartId", "", "posBarCode", "status", "Lcom/woolworths/scanlibrary/models/cart/CartStatus;", "<init>", "(ZZZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/scanlibrary/models/cart/CartStatus;)V", "getIstxnhistory", "()Z", "getIswhitelisted", "getIstncaccepted", "getIspaymentadded", "getIsrewardsavailable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIsskippedrewardsadd", "getCartId", "()Ljava/lang/String;", "getPosBarCode", "getStatus", "()Lcom/woolworths/scanlibrary/models/cart/CartStatus;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZZZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/scanlibrary/models/cart/CartStatus;)Lcom/woolworths/scanlibrary/models/profile/Status;", "equals", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Status {
    public static final int $stable = 0;

    @SerializedName("cartid")
    @Nullable
    private final String cartId;

    @SerializedName("ispaymentadded")
    private final boolean ispaymentadded;

    @SerializedName("isrewardsavailable")
    @Nullable
    private final Boolean isrewardsavailable;

    @SerializedName("isskippedrewardsadd")
    @Nullable
    private final Boolean isskippedrewardsadd;

    @SerializedName("istncaccepted")
    private final boolean istncaccepted;

    @SerializedName("istxnhistory")
    private final boolean istxnhistory;

    @SerializedName("iswhitelisted")
    private final boolean iswhitelisted;

    @SerializedName("posbarcode")
    @Nullable
    private final String posBarCode;

    @SerializedName("status")
    @NotNull
    private final CartStatus status;

    public Status(boolean z, boolean z2, boolean z3, boolean z4, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str, @Nullable String str2, @NotNull CartStatus status) {
        Intrinsics.h(status, "status");
        this.istxnhistory = z;
        this.iswhitelisted = z2;
        this.istncaccepted = z3;
        this.ispaymentadded = z4;
        this.isrewardsavailable = bool;
        this.isskippedrewardsadd = bool2;
        this.cartId = str;
        this.posBarCode = str2;
        this.status = status;
    }

    public static /* synthetic */ Status copy$default(Status status, boolean z, boolean z2, boolean z3, boolean z4, Boolean bool, Boolean bool2, String str, String str2, CartStatus cartStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            z = status.istxnhistory;
        }
        if ((i & 2) != 0) {
            z2 = status.iswhitelisted;
        }
        if ((i & 4) != 0) {
            z3 = status.istncaccepted;
        }
        if ((i & 8) != 0) {
            z4 = status.ispaymentadded;
        }
        if ((i & 16) != 0) {
            bool = status.isrewardsavailable;
        }
        if ((i & 32) != 0) {
            bool2 = status.isskippedrewardsadd;
        }
        if ((i & 64) != 0) {
            str = status.cartId;
        }
        if ((i & 128) != 0) {
            str2 = status.posBarCode;
        }
        if ((i & 256) != 0) {
            cartStatus = status.status;
        }
        String str3 = str2;
        CartStatus cartStatus2 = cartStatus;
        Boolean bool3 = bool2;
        String str4 = str;
        Boolean bool4 = bool;
        boolean z5 = z3;
        return status.copy(z, z2, z5, z4, bool4, bool3, str4, str3, cartStatus2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIstxnhistory() {
        return this.istxnhistory;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIswhitelisted() {
        return this.iswhitelisted;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIstncaccepted() {
        return this.istncaccepted;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIspaymentadded() {
        return this.ispaymentadded;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Boolean getIsrewardsavailable() {
        return this.isrewardsavailable;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Boolean getIsskippedrewardsadd() {
        return this.isskippedrewardsadd;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getPosBarCode() {
        return this.posBarCode;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final CartStatus getStatus() {
        return this.status;
    }

    @NotNull
    public final Status copy(boolean istxnhistory, boolean iswhitelisted, boolean istncaccepted, boolean ispaymentadded, @Nullable Boolean isrewardsavailable, @Nullable Boolean isskippedrewardsadd, @Nullable String cartId, @Nullable String posBarCode, @NotNull CartStatus status) {
        Intrinsics.h(status, "status");
        return new Status(istxnhistory, iswhitelisted, istncaccepted, ispaymentadded, isrewardsavailable, isskippedrewardsadd, cartId, posBarCode, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Status)) {
            return false;
        }
        Status status = (Status) other;
        return this.istxnhistory == status.istxnhistory && this.iswhitelisted == status.iswhitelisted && this.istncaccepted == status.istncaccepted && this.ispaymentadded == status.ispaymentadded && Intrinsics.c(this.isrewardsavailable, status.isrewardsavailable) && Intrinsics.c(this.isskippedrewardsadd, status.isskippedrewardsadd) && Intrinsics.c(this.cartId, status.cartId) && Intrinsics.c(this.posBarCode, status.posBarCode) && this.status == status.status;
    }

    @Nullable
    public final String getCartId() {
        return this.cartId;
    }

    public final boolean getIspaymentadded() {
        return this.ispaymentadded;
    }

    @Nullable
    public final Boolean getIsrewardsavailable() {
        return this.isrewardsavailable;
    }

    @Nullable
    public final Boolean getIsskippedrewardsadd() {
        return this.isskippedrewardsadd;
    }

    public final boolean getIstncaccepted() {
        return this.istncaccepted;
    }

    public final boolean getIstxnhistory() {
        return this.istxnhistory;
    }

    public final boolean getIswhitelisted() {
        return this.iswhitelisted;
    }

    @Nullable
    public final String getPosBarCode() {
        return this.posBarCode;
    }

    @NotNull
    public final CartStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iE = b.e(b.e(b.e(Boolean.hashCode(this.istxnhistory) * 31, 31, this.iswhitelisted), 31, this.istncaccepted), 31, this.ispaymentadded);
        Boolean bool = this.isrewardsavailable;
        int iHashCode = (iE + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isskippedrewardsadd;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.cartId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.posBarCode;
        return this.status.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        boolean z = this.istxnhistory;
        boolean z2 = this.iswhitelisted;
        boolean z3 = this.istncaccepted;
        boolean z4 = this.ispaymentadded;
        Boolean bool = this.isrewardsavailable;
        Boolean bool2 = this.isskippedrewardsadd;
        String str = this.cartId;
        String str2 = this.posBarCode;
        CartStatus cartStatus = this.status;
        StringBuilder sbV = b.v("Status(istxnhistory=", ", iswhitelisted=", ", istncaccepted=", z, z2);
        a.D(sbV, z3, ", ispaymentadded=", z4, ", isrewardsavailable=");
        sbV.append(bool);
        sbV.append(", isskippedrewardsadd=");
        sbV.append(bool2);
        sbV.append(", cartId=");
        androidx.constraintlayout.core.state.a.B(sbV, str, ", posBarCode=", str2, ", status=");
        sbV.append(cartStatus);
        sbV.append(")");
        return sbV.toString();
    }
}
