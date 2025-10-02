package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ClaimCreator")
/* loaded from: classes5.dex */
public final class Claim extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Claim> CREATOR = new zbi();

    @SafeParcelable.Field(getter = "getName", id = 1)
    private final String zba;

    @SafeParcelable.Field(getter = "isEssential", id = 2)
    private final boolean zbb;

    public static abstract class Builder {
        @NonNull
        public abstract Claim build();

        @NonNull
        public abstract Builder setEssential(boolean z);

        @NonNull
        public abstract Builder setName(@NonNull String str);
    }

    @SafeParcelable.Constructor
    public Claim(@NonNull @SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) boolean z) {
        this.zba = str;
        this.zbb = z;
    }

    @NonNull
    public static Builder builder() {
        return new zbd();
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Claim) {
            Claim claim = (Claim) obj;
            if (this.zba.equals(claim.zba) && this.zbb == claim.zbb) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public String getName() {
        return this.zba;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba, Boolean.valueOf(this.zbb));
    }

    public boolean isEssential() {
        return this.zbb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getName(), false);
        SafeParcelWriter.writeBoolean(parcel, 2, isEssential());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
