package com.woolworths.scanlibrary.models.tapon;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u000fHÆ\u0003J\t\u0010/\u001a\u00020\u0011HÆ\u0003J\u008d\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\fHÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00066"}, d2 = {"Lcom/woolworths/scanlibrary/models/tapon/TapOnResponse;", "", "cartId", "", "lastupdated", "status", "reason", "storeId", "rewardCardNumber", AppMeasurementSdk.ConditionalUserProperty.NAME, "division", "no", "", "fraudResponse", "storeInfo", "Lcom/woolworths/scanlibrary/models/tapon/StoreInfo;", "transaction", "Lcom/woolworths/scanlibrary/models/tapon/Transaction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/woolworths/scanlibrary/models/tapon/StoreInfo;Lcom/woolworths/scanlibrary/models/tapon/Transaction;)V", "getCartId", "()Ljava/lang/String;", "getLastupdated", "getStatus", "getReason", "getStoreId", "getRewardCardNumber", "getName", "getDivision", "getNo", "()I", "getFraudResponse", "getStoreInfo", "()Lcom/woolworths/scanlibrary/models/tapon/StoreInfo;", "getTransaction", "()Lcom/woolworths/scanlibrary/models/tapon/Transaction;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TapOnResponse {
    public static final int $stable = 0;

    @SerializedName("cartid")
    @NotNull
    private final String cartId;

    @SerializedName("division")
    @Nullable
    private final String division;

    @SerializedName("fraudresponse")
    @Nullable
    private final String fraudResponse;

    @SerializedName("lastupdated")
    @Nullable
    private final String lastupdated;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("no")
    private final int no;

    @SerializedName("reason")
    @Nullable
    private final String reason;

    @SerializedName("rewardcardnumber")
    @Nullable
    private final String rewardCardNumber;

    @SerializedName("status")
    @Nullable
    private final String status;

    @SerializedName("storeid")
    @NotNull
    private final String storeId;

    @SerializedName("storeInfo")
    @NotNull
    private final StoreInfo storeInfo;

    @SerializedName("transaction")
    @NotNull
    private final Transaction transaction;

    public TapOnResponse(@NotNull String cartId, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String storeId, @Nullable String str4, @NotNull String name, @Nullable String str5, int i, @Nullable String str6, @NotNull StoreInfo storeInfo, @NotNull Transaction transaction) {
        Intrinsics.h(cartId, "cartId");
        Intrinsics.h(storeId, "storeId");
        Intrinsics.h(name, "name");
        Intrinsics.h(storeInfo, "storeInfo");
        Intrinsics.h(transaction, "transaction");
        this.cartId = cartId;
        this.lastupdated = str;
        this.status = str2;
        this.reason = str3;
        this.storeId = storeId;
        this.rewardCardNumber = str4;
        this.name = name;
        this.division = str5;
        this.no = i;
        this.fraudResponse = str6;
        this.storeInfo = storeInfo;
        this.transaction = transaction;
    }

    public static /* synthetic */ TapOnResponse copy$default(TapOnResponse tapOnResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, StoreInfo storeInfo, Transaction transaction, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tapOnResponse.cartId;
        }
        if ((i2 & 2) != 0) {
            str2 = tapOnResponse.lastupdated;
        }
        if ((i2 & 4) != 0) {
            str3 = tapOnResponse.status;
        }
        if ((i2 & 8) != 0) {
            str4 = tapOnResponse.reason;
        }
        if ((i2 & 16) != 0) {
            str5 = tapOnResponse.storeId;
        }
        if ((i2 & 32) != 0) {
            str6 = tapOnResponse.rewardCardNumber;
        }
        if ((i2 & 64) != 0) {
            str7 = tapOnResponse.name;
        }
        if ((i2 & 128) != 0) {
            str8 = tapOnResponse.division;
        }
        if ((i2 & 256) != 0) {
            i = tapOnResponse.no;
        }
        if ((i2 & 512) != 0) {
            str9 = tapOnResponse.fraudResponse;
        }
        if ((i2 & 1024) != 0) {
            storeInfo = tapOnResponse.storeInfo;
        }
        if ((i2 & 2048) != 0) {
            transaction = tapOnResponse.transaction;
        }
        StoreInfo storeInfo2 = storeInfo;
        Transaction transaction2 = transaction;
        int i3 = i;
        String str10 = str9;
        String str11 = str7;
        String str12 = str8;
        String str13 = str5;
        String str14 = str6;
        return tapOnResponse.copy(str, str2, str3, str4, str13, str14, str11, str12, i3, str10, storeInfo2, transaction2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getFraudResponse() {
        return this.fraudResponse;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final StoreInfo getStoreInfo() {
        return this.storeInfo;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final Transaction getTransaction() {
        return this.transaction;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getLastupdated() {
        return this.lastupdated;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getStoreId() {
        return this.storeId;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getRewardCardNumber() {
        return this.rewardCardNumber;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getDivision() {
        return this.division;
    }

    /* renamed from: component9, reason: from getter */
    public final int getNo() {
        return this.no;
    }

    @NotNull
    public final TapOnResponse copy(@NotNull String cartId, @Nullable String lastupdated, @Nullable String status, @Nullable String reason, @NotNull String storeId, @Nullable String rewardCardNumber, @NotNull String name, @Nullable String division, int no, @Nullable String fraudResponse, @NotNull StoreInfo storeInfo, @NotNull Transaction transaction) {
        Intrinsics.h(cartId, "cartId");
        Intrinsics.h(storeId, "storeId");
        Intrinsics.h(name, "name");
        Intrinsics.h(storeInfo, "storeInfo");
        Intrinsics.h(transaction, "transaction");
        return new TapOnResponse(cartId, lastupdated, status, reason, storeId, rewardCardNumber, name, division, no, fraudResponse, storeInfo, transaction);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TapOnResponse)) {
            return false;
        }
        TapOnResponse tapOnResponse = (TapOnResponse) other;
        return Intrinsics.c(this.cartId, tapOnResponse.cartId) && Intrinsics.c(this.lastupdated, tapOnResponse.lastupdated) && Intrinsics.c(this.status, tapOnResponse.status) && Intrinsics.c(this.reason, tapOnResponse.reason) && Intrinsics.c(this.storeId, tapOnResponse.storeId) && Intrinsics.c(this.rewardCardNumber, tapOnResponse.rewardCardNumber) && Intrinsics.c(this.name, tapOnResponse.name) && Intrinsics.c(this.division, tapOnResponse.division) && this.no == tapOnResponse.no && Intrinsics.c(this.fraudResponse, tapOnResponse.fraudResponse) && Intrinsics.c(this.storeInfo, tapOnResponse.storeInfo) && Intrinsics.c(this.transaction, tapOnResponse.transaction);
    }

    @NotNull
    public final String getCartId() {
        return this.cartId;
    }

    @Nullable
    public final String getDivision() {
        return this.division;
    }

    @Nullable
    public final String getFraudResponse() {
        return this.fraudResponse;
    }

    @Nullable
    public final String getLastupdated() {
        return this.lastupdated;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getNo() {
        return this.no;
    }

    @Nullable
    public final String getReason() {
        return this.reason;
    }

    @Nullable
    public final String getRewardCardNumber() {
        return this.rewardCardNumber;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getStoreId() {
        return this.storeId;
    }

    @NotNull
    public final StoreInfo getStoreInfo() {
        return this.storeInfo;
    }

    @NotNull
    public final Transaction getTransaction() {
        return this.transaction;
    }

    public int hashCode() {
        int iHashCode = this.cartId.hashCode() * 31;
        String str = this.lastupdated;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.status;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.reason;
        int iC = b.c((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.storeId);
        String str4 = this.rewardCardNumber;
        int iC2 = b.c((iC + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.name);
        String str5 = this.division;
        int iA = b.a(this.no, (iC2 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        String str6 = this.fraudResponse;
        return this.transaction.hashCode() + ((this.storeInfo.hashCode() + ((iA + (str6 != null ? str6.hashCode() : 0)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.cartId;
        String str2 = this.lastupdated;
        String str3 = this.status;
        String str4 = this.reason;
        String str5 = this.storeId;
        String str6 = this.rewardCardNumber;
        String str7 = this.name;
        String str8 = this.division;
        int i = this.no;
        String str9 = this.fraudResponse;
        StoreInfo storeInfo = this.storeInfo;
        Transaction transaction = this.transaction;
        StringBuilder sbV = a.v("TapOnResponse(cartId=", str, ", lastupdated=", str2, ", status=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", reason=", str4, ", storeId=");
        androidx.constraintlayout.core.state.a.B(sbV, str5, ", rewardCardNumber=", str6, ", name=");
        androidx.constraintlayout.core.state.a.B(sbV, str7, ", division=", str8, ", no=");
        androidx.compose.ui.input.pointer.a.u(i, ", fraudResponse=", str9, ", storeInfo=", sbV);
        sbV.append(storeInfo);
        sbV.append(", transaction=");
        sbV.append(transaction);
        sbV.append(")");
        return sbV.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TapOnResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, StoreInfo storeInfo, Transaction transaction, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        Transaction transaction2;
        StoreInfo storeInfo2;
        String str10;
        str2 = (i2 & 2) != 0 ? null : str2;
        str3 = (i2 & 4) != 0 ? null : str3;
        str4 = (i2 & 8) != 0 ? null : str4;
        str6 = (i2 & 32) != 0 ? null : str6;
        str8 = (i2 & 128) != 0 ? null : str8;
        i = (i2 & 256) != 0 ? 0 : i;
        if ((i2 & 512) != 0) {
            transaction2 = transaction;
            storeInfo2 = storeInfo;
            str10 = null;
        } else {
            transaction2 = transaction;
            storeInfo2 = storeInfo;
            str10 = str9;
        }
        this(str, str2, str3, str4, str5, str6, str7, str8, i, str10, storeInfo2, transaction2);
    }
}
