package au.com.woolworths.checkout.common.responsemodels;

import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016¨\u0006$"}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/CheckoutSelectedWindowData;", "", "id", "", "startTime", "", "endTime", "displayDate", "displayTime", "displayDeliveryFee", "isExpress", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()I", "getStartTime", "()Ljava/lang/String;", "getEndTime", "getDisplayDate", "getDisplayTime", "getDisplayDeliveryFee", "()Z", "isAllDataSet", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutSelectedWindowData {

    @SerializedName("DisplayDate")
    @NotNull
    private final String displayDate;

    @SerializedName("DisplayDeliveryFee")
    @NotNull
    private final String displayDeliveryFee;

    @SerializedName("DisplayTime")
    @NotNull
    private final String displayTime;

    @SerializedName("EndTime")
    @NotNull
    private final String endTime;

    @SerializedName("Id")
    private final int id;

    @SerializedName("IsExpress")
    private final boolean isExpress;

    @SerializedName("StartTime")
    @NotNull
    private final String startTime;

    public CheckoutSelectedWindowData(int i, @NotNull String startTime, @NotNull String endTime, @NotNull String displayDate, @NotNull String displayTime, @NotNull String displayDeliveryFee, boolean z) {
        Intrinsics.h(startTime, "startTime");
        Intrinsics.h(endTime, "endTime");
        Intrinsics.h(displayDate, "displayDate");
        Intrinsics.h(displayTime, "displayTime");
        Intrinsics.h(displayDeliveryFee, "displayDeliveryFee");
        this.id = i;
        this.startTime = startTime;
        this.endTime = endTime;
        this.displayDate = displayDate;
        this.displayTime = displayTime;
        this.displayDeliveryFee = displayDeliveryFee;
        this.isExpress = z;
    }

    public static /* synthetic */ CheckoutSelectedWindowData copy$default(CheckoutSelectedWindowData checkoutSelectedWindowData, int i, String str, String str2, String str3, String str4, String str5, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = checkoutSelectedWindowData.id;
        }
        if ((i2 & 2) != 0) {
            str = checkoutSelectedWindowData.startTime;
        }
        if ((i2 & 4) != 0) {
            str2 = checkoutSelectedWindowData.endTime;
        }
        if ((i2 & 8) != 0) {
            str3 = checkoutSelectedWindowData.displayDate;
        }
        if ((i2 & 16) != 0) {
            str4 = checkoutSelectedWindowData.displayTime;
        }
        if ((i2 & 32) != 0) {
            str5 = checkoutSelectedWindowData.displayDeliveryFee;
        }
        if ((i2 & 64) != 0) {
            z = checkoutSelectedWindowData.isExpress;
        }
        String str6 = str5;
        boolean z2 = z;
        String str7 = str4;
        String str8 = str2;
        return checkoutSelectedWindowData.copy(i, str, str8, str3, str7, str6, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDisplayDate() {
        return this.displayDate;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getDisplayTime() {
        return this.displayTime;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getDisplayDeliveryFee() {
        return this.displayDeliveryFee;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsExpress() {
        return this.isExpress;
    }

    @NotNull
    public final CheckoutSelectedWindowData copy(int id, @NotNull String startTime, @NotNull String endTime, @NotNull String displayDate, @NotNull String displayTime, @NotNull String displayDeliveryFee, boolean isExpress) {
        Intrinsics.h(startTime, "startTime");
        Intrinsics.h(endTime, "endTime");
        Intrinsics.h(displayDate, "displayDate");
        Intrinsics.h(displayTime, "displayTime");
        Intrinsics.h(displayDeliveryFee, "displayDeliveryFee");
        return new CheckoutSelectedWindowData(id, startTime, endTime, displayDate, displayTime, displayDeliveryFee, isExpress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutSelectedWindowData)) {
            return false;
        }
        CheckoutSelectedWindowData checkoutSelectedWindowData = (CheckoutSelectedWindowData) other;
        return this.id == checkoutSelectedWindowData.id && Intrinsics.c(this.startTime, checkoutSelectedWindowData.startTime) && Intrinsics.c(this.endTime, checkoutSelectedWindowData.endTime) && Intrinsics.c(this.displayDate, checkoutSelectedWindowData.displayDate) && Intrinsics.c(this.displayTime, checkoutSelectedWindowData.displayTime) && Intrinsics.c(this.displayDeliveryFee, checkoutSelectedWindowData.displayDeliveryFee) && this.isExpress == checkoutSelectedWindowData.isExpress;
    }

    @NotNull
    public final String getDisplayDate() {
        return this.displayDate;
    }

    @NotNull
    public final String getDisplayDeliveryFee() {
        return this.displayDeliveryFee;
    }

    @NotNull
    public final String getDisplayTime() {
        return this.displayTime;
    }

    @NotNull
    public final String getEndTime() {
        return this.endTime;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isExpress) + b.c(b.c(b.c(b.c(b.c(Integer.hashCode(this.id) * 31, 31, this.startTime), 31, this.endTime), 31, this.displayDate), 31, this.displayTime), 31, this.displayDeliveryFee);
    }

    public final boolean isAllDataSet() {
        return this.id != 0;
    }

    public final boolean isExpress() {
        return this.isExpress;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.startTime;
        String str2 = this.endTime;
        String str3 = this.displayDate;
        String str4 = this.displayTime;
        String str5 = this.displayDeliveryFee;
        boolean z = this.isExpress;
        StringBuilder sbP = a.p("CheckoutSelectedWindowData(id=", i, ", startTime=", str, ", endTime=");
        a.B(sbP, str2, ", displayDate=", str3, ", displayTime=");
        a.B(sbP, str4, ", displayDeliveryFee=", str5, ", isExpress=");
        return YU.a.k(")", sbP, z);
    }
}
