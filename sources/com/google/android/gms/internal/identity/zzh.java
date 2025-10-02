package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "DeviceOrientationRequestInternalCreator")
/* loaded from: classes5.dex */
public final class zzh extends AbstractSafeParcelable {

    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequestInternal.DEFAULT_DEVICE_ORIENTATION_REQUEST", id = 1)
    final DeviceOrientationRequest zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequestInternal.DEFAULT_CLIENTS", id = 2)
    final List zzd;

    @Nullable
    @SafeParcelable.Field(defaultValueUnchecked = "null", id = 3)
    final String zze;
    static final List zza = Collections.EMPTY_LIST;
    static final DeviceOrientationRequest zzb = new DeviceOrientationRequest.Builder(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT).build();
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();

    @SafeParcelable.Constructor
    public zzh(@SafeParcelable.Param(id = 1) DeviceOrientationRequest deviceOrientationRequest, @SafeParcelable.Param(id = 2) List list, @SafeParcelable.Param(id = 3) String str) {
        this.zzc = deviceOrientationRequest;
        this.zzd = list;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return Objects.equal(this.zzc, zzhVar.zzc) && Objects.equal(this.zzd, zzhVar.zzd) && Objects.equal(this.zze, zzhVar.zze);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(this.zzd);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        String str = this.zze;
        StringBuilder sb = new StringBuilder(a.a(length, 68, length2, 7, String.valueOf(str).length()) + 2);
        androidx.constraintlayout.core.state.a.B(sb, "DeviceOrientationRequestInternal[deviceOrientationRequest=", strValueOf, ", clients=", strValueOf2);
        return YU.a.p(sb, ", tag='", str, "']");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zzc, i, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 3, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
