package com.woolworths.scanlibrary.models.profile;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000b¨\u0006\""}, d2 = {"Lcom/woolworths/scanlibrary/models/profile/KioskFlags;", "Landroid/os/Parcelable;", "bigKioskRequired", "", "bagCheckRequired", "hasIntervention", "enableInAppPayment", "isBagCheckCompleted", "<init>", "(ZZZZZ)V", "getBigKioskRequired", "()Z", "getBagCheckRequired", "getHasIntervention", "getEnableInAppPayment", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class KioskFlags implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<KioskFlags> CREATOR = new Creator();

    @SerializedName("bagcheckrequired")
    private final boolean bagCheckRequired;

    @SerializedName("isbigkioskrequired")
    private final boolean bigKioskRequired;

    @SerializedName("enableinapppayment")
    private final boolean enableInAppPayment;

    @SerializedName("hasintervention")
    private final boolean hasIntervention;

    @SerializedName("isbagcheckcompleted")
    private final boolean isBagCheckCompleted;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<KioskFlags> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KioskFlags createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            Intrinsics.h(parcel, "parcel");
            boolean z5 = false;
            boolean z6 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z5 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z6 = z;
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
            if (parcel.readInt() == 0) {
                z4 = z;
            }
            return new KioskFlags(z5, z6, z2, z3, z4);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KioskFlags[] newArray(int i) {
            return new KioskFlags[i];
        }
    }

    public KioskFlags() {
        this(false, false, false, false, false, 31, null);
    }

    public static /* synthetic */ KioskFlags copy$default(KioskFlags kioskFlags, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = kioskFlags.bigKioskRequired;
        }
        if ((i & 2) != 0) {
            z2 = kioskFlags.bagCheckRequired;
        }
        if ((i & 4) != 0) {
            z3 = kioskFlags.hasIntervention;
        }
        if ((i & 8) != 0) {
            z4 = kioskFlags.enableInAppPayment;
        }
        if ((i & 16) != 0) {
            z5 = kioskFlags.isBagCheckCompleted;
        }
        boolean z6 = z5;
        boolean z7 = z3;
        return kioskFlags.copy(z, z2, z7, z4, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getBigKioskRequired() {
        return this.bigKioskRequired;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getBagCheckRequired() {
        return this.bagCheckRequired;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasIntervention() {
        return this.hasIntervention;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnableInAppPayment() {
        return this.enableInAppPayment;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsBagCheckCompleted() {
        return this.isBagCheckCompleted;
    }

    @NotNull
    public final KioskFlags copy(boolean bigKioskRequired, boolean bagCheckRequired, boolean hasIntervention, boolean enableInAppPayment, boolean isBagCheckCompleted) {
        return new KioskFlags(bigKioskRequired, bagCheckRequired, hasIntervention, enableInAppPayment, isBagCheckCompleted);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KioskFlags)) {
            return false;
        }
        KioskFlags kioskFlags = (KioskFlags) other;
        return this.bigKioskRequired == kioskFlags.bigKioskRequired && this.bagCheckRequired == kioskFlags.bagCheckRequired && this.hasIntervention == kioskFlags.hasIntervention && this.enableInAppPayment == kioskFlags.enableInAppPayment && this.isBagCheckCompleted == kioskFlags.isBagCheckCompleted;
    }

    public final boolean getBagCheckRequired() {
        return this.bagCheckRequired;
    }

    public final boolean getBigKioskRequired() {
        return this.bigKioskRequired;
    }

    public final boolean getEnableInAppPayment() {
        return this.enableInAppPayment;
    }

    public final boolean getHasIntervention() {
        return this.hasIntervention;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isBagCheckCompleted) + b.e(b.e(b.e(Boolean.hashCode(this.bigKioskRequired) * 31, 31, this.bagCheckRequired), 31, this.hasIntervention), 31, this.enableInAppPayment);
    }

    public final boolean isBagCheckCompleted() {
        return this.isBagCheckCompleted;
    }

    @NotNull
    public String toString() {
        boolean z = this.bigKioskRequired;
        boolean z2 = this.bagCheckRequired;
        boolean z3 = this.hasIntervention;
        boolean z4 = this.enableInAppPayment;
        boolean z5 = this.isBagCheckCompleted;
        StringBuilder sbV = b.v("KioskFlags(bigKioskRequired=", ", bagCheckRequired=", ", hasIntervention=", z, z2);
        a.D(sbV, z3, ", enableInAppPayment=", z4, ", isBagCheckCompleted=");
        return YU.a.k(")", sbV, z5);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeInt(this.bigKioskRequired ? 1 : 0);
        dest.writeInt(this.bagCheckRequired ? 1 : 0);
        dest.writeInt(this.hasIntervention ? 1 : 0);
        dest.writeInt(this.enableInAppPayment ? 1 : 0);
        dest.writeInt(this.isBagCheckCompleted ? 1 : 0);
    }

    public KioskFlags(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.bigKioskRequired = z;
        this.bagCheckRequired = z2;
        this.hasIntervention = z3;
        this.enableInAppPayment = z4;
        this.isBagCheckCompleted = z5;
    }

    public /* synthetic */ KioskFlags(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? true : z5);
    }
}
