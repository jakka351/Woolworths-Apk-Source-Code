package com.woolworths.scanlibrary.models.profile;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/woolworths/scanlibrary/models/profile/Storeinfo;", "", "no", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "checkoutTitle", "checkoutMessage", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNo", "()I", "getName", "()Ljava/lang/String;", "getCheckoutTitle", "getCheckoutMessage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Storeinfo {
    public static final int $stable = 0;

    @SerializedName("checkoutmessage")
    @Nullable
    private final String checkoutMessage;

    @SerializedName("checkouttitle")
    @Nullable
    private final String checkoutTitle;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("no")
    private final int no;

    public Storeinfo(int i, @NotNull String name, @Nullable String str, @Nullable String str2) {
        Intrinsics.h(name, "name");
        this.no = i;
        this.name = name;
        this.checkoutTitle = str;
        this.checkoutMessage = str2;
    }

    public static /* synthetic */ Storeinfo copy$default(Storeinfo storeinfo, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = storeinfo.no;
        }
        if ((i2 & 2) != 0) {
            str = storeinfo.name;
        }
        if ((i2 & 4) != 0) {
            str2 = storeinfo.checkoutTitle;
        }
        if ((i2 & 8) != 0) {
            str3 = storeinfo.checkoutMessage;
        }
        return storeinfo.copy(i, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getNo() {
        return this.no;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getCheckoutTitle() {
        return this.checkoutTitle;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getCheckoutMessage() {
        return this.checkoutMessage;
    }

    @NotNull
    public final Storeinfo copy(int no, @NotNull String name, @Nullable String checkoutTitle, @Nullable String checkoutMessage) {
        Intrinsics.h(name, "name");
        return new Storeinfo(no, name, checkoutTitle, checkoutMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Storeinfo)) {
            return false;
        }
        Storeinfo storeinfo = (Storeinfo) other;
        return this.no == storeinfo.no && Intrinsics.c(this.name, storeinfo.name) && Intrinsics.c(this.checkoutTitle, storeinfo.checkoutTitle) && Intrinsics.c(this.checkoutMessage, storeinfo.checkoutMessage);
    }

    @Nullable
    public final String getCheckoutMessage() {
        return this.checkoutMessage;
    }

    @Nullable
    public final String getCheckoutTitle() {
        return this.checkoutTitle;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getNo() {
        return this.no;
    }

    public int hashCode() {
        int iC = b.c(Integer.hashCode(this.no) * 31, 31, this.name);
        String str = this.checkoutTitle;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.checkoutMessage;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.no;
        String str = this.name;
        return a.l(a.p("Storeinfo(no=", i, ", name=", str, ", checkoutTitle="), this.checkoutTitle, ", checkoutMessage=", this.checkoutMessage, ")");
    }
}
