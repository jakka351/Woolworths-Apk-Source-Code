package au.com.woolworths.android.onesite.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/deeplink/DeepLinkConfig;", "Landroid/os/Parcelable;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DeepLinkConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DeepLinkConfig> CREATOR = new Creator();
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final String o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeepLinkConfig> {
        @Override // android.os.Parcelable.Creator
        public final DeepLinkConfig createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            String str;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            boolean z18 = false;
            boolean z19 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z18 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z19 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z2;
            } else {
                z3 = z2;
                z2 = z;
            }
            if (parcel.readInt() != 0) {
                z4 = z3;
            } else {
                z4 = z3;
                z3 = z;
            }
            if (parcel.readInt() != 0) {
                z5 = z4;
            } else {
                z5 = z4;
                z4 = z;
            }
            if (parcel.readInt() != 0) {
                z6 = z5;
            } else {
                z6 = z5;
                z5 = z;
            }
            if (parcel.readInt() != 0) {
                z7 = z6;
            } else {
                z7 = z6;
                z6 = z;
            }
            if (parcel.readInt() != 0) {
                z8 = z7;
            } else {
                z8 = z7;
                z7 = z;
            }
            if (parcel.readInt() != 0) {
                z9 = z8;
            } else {
                z9 = z8;
                z8 = z;
            }
            if (parcel.readInt() != 0) {
                z10 = z9;
            } else {
                z10 = z9;
                z9 = z;
            }
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z11 = z10;
                str = string2;
                z12 = z11;
            } else {
                z11 = z10;
                str = string2;
                z12 = z;
            }
            if (parcel.readInt() != 0) {
                z13 = z11;
            } else {
                z13 = z11;
                z11 = z;
            }
            if (parcel.readInt() != 0) {
                z14 = z13;
            } else {
                z14 = z13;
                z13 = z;
            }
            if (parcel.readInt() != 0) {
                z15 = z14;
            } else {
                z15 = z14;
                z14 = z;
            }
            if (parcel.readInt() != 0) {
                z16 = z15;
            } else {
                z16 = z15;
                z15 = z;
            }
            if (parcel.readInt() != 0) {
                z17 = z16;
            } else {
                z17 = z16;
                z16 = z;
            }
            if (parcel.readInt() == 0) {
                z17 = z;
            }
            return new DeepLinkConfig(string, z18, z19, z2, z3, z4, z5, z6, z7, z8, z9, str, z12, z11, z13, z14, z15, z16, z17);
        }

        @Override // android.os.Parcelable.Creator
        public final DeepLinkConfig[] newArray(int i) {
            return new DeepLinkConfig[i];
        }
    }

    public DeepLinkConfig(String deepLink, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String marketplaceProductMinimumId, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        Intrinsics.h(deepLink, "deepLink");
        Intrinsics.h(marketplaceProductMinimumId, "marketplaceProductMinimumId");
        this.d = deepLink;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = z9;
        this.n = z10;
        this.o = marketplaceProductMinimumId;
        this.p = z11;
        this.q = z12;
        this.r = z13;
        this.s = z14;
        this.t = z15;
        this.u = z16;
        this.v = z17;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeepLinkConfig)) {
            return false;
        }
        DeepLinkConfig deepLinkConfig = (DeepLinkConfig) obj;
        return Intrinsics.c(this.d, deepLinkConfig.d) && this.e == deepLinkConfig.e && this.f == deepLinkConfig.f && this.g == deepLinkConfig.g && this.h == deepLinkConfig.h && this.i == deepLinkConfig.i && this.j == deepLinkConfig.j && this.k == deepLinkConfig.k && this.l == deepLinkConfig.l && this.m == deepLinkConfig.m && this.n == deepLinkConfig.n && Intrinsics.c(this.o, deepLinkConfig.o) && this.p == deepLinkConfig.p && this.q == deepLinkConfig.q && this.r == deepLinkConfig.r && this.s == deepLinkConfig.s && this.t == deepLinkConfig.t && this.u == deepLinkConfig.u && this.v == deepLinkConfig.v;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.v) + androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(this.d.hashCode() * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u);
    }

    public final String toString() {
        StringBuilder sbQ = androidx.constraintlayout.core.state.a.q("DeepLinkConfig(deepLink=", this.d, ", isAppRunning=", ", isFullUserLoggedIn=", this.e);
        au.com.woolworths.android.onesite.a.D(sbQ, this.f, ", isRewardsCardAdded=", this.g, ", isOnboardingShown=");
        au.com.woolworths.android.onesite.a.D(sbQ, this.h, ", isDeferrableBoostedOfferDeeplink=", this.i, ", isRewardsPrimingUpliftEnabled=");
        au.com.woolworths.android.onesite.a.D(sbQ, this.j, ", isFreshIdeasMagazineDeeplink=", this.k, ", isRewardsActivityUpliftEnabled=");
        au.com.woolworths.android.onesite.a.D(sbQ, this.l, ", isRewardsOfferDetailsRefactor=", this.m, ", isProductDetailsUpliftEnabled=");
        au.com.woolworths.android.onesite.a.y(", marketplaceProductMinimumId=", this.o, ", isEverydayMarketPdpUpliftEnabled=", sbQ, this.n);
        au.com.woolworths.android.onesite.a.D(sbQ, this.p, ", isEverydayMarketShippingCalculatorEnabled=", this.q, ", isSavedRecipesContentPageMigrationEnabled=");
        au.com.woolworths.android.onesite.a.D(sbQ, this.r, ", isBrandedShopContentPageEnabled=", this.s, ", isCheckoutTimeSelectionUpliftEnabled=");
        au.com.woolworths.android.onesite.a.D(sbQ, this.t, ", isStoreLocatorUpliftEnabled=", this.u, ", isOliveAutoStartEnabled=");
        return YU.a.k(")", sbQ, this.v);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.g ? 1 : 0);
        dest.writeInt(this.h ? 1 : 0);
        dest.writeInt(this.i ? 1 : 0);
        dest.writeInt(this.j ? 1 : 0);
        dest.writeInt(this.k ? 1 : 0);
        dest.writeInt(this.l ? 1 : 0);
        dest.writeInt(this.m ? 1 : 0);
        dest.writeInt(this.n ? 1 : 0);
        dest.writeString(this.o);
        dest.writeInt(this.p ? 1 : 0);
        dest.writeInt(this.q ? 1 : 0);
        dest.writeInt(this.r ? 1 : 0);
        dest.writeInt(this.s ? 1 : 0);
        dest.writeInt(this.t ? 1 : 0);
        dest.writeInt(this.u ? 1 : 0);
        dest.writeInt(this.v ? 1 : 0);
    }
}
