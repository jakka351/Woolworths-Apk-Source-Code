package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GoogleSilentVerificationExtensionCreator")
/* loaded from: classes5.dex */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new zzae();

    @NonNull
    @SafeParcelable.Field(getter = "getSilentVerification", id = 1)
    private final boolean zza;

    @SafeParcelable.Constructor
    public zzad(@NonNull @SafeParcelable.Param(id = 1) boolean z) {
        this.zza = ((Boolean) Preconditions.checkNotNull(Boolean.valueOf(z))).booleanValue();
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof zzad) && this.zza == ((zzad) obj).zza;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
