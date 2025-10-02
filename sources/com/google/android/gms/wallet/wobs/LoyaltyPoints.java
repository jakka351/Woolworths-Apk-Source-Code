package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LoyaltyPointsCreator")
@SafeParcelable.Reserved({1, 4})
/* loaded from: classes2.dex */
public final class LoyaltyPoints extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LoyaltyPoints> CREATOR = new zzj();

    @SafeParcelable.Field(id = 2)
    String zza;

    @SafeParcelable.Field(id = 3)
    LoyaltyPointsBalance zzb;

    @SafeParcelable.Field(id = 5)
    @Deprecated
    TimeInterval zzc;

    public final class Builder {
        public /* synthetic */ Builder(zzg zzgVar) {
        }

        @NonNull
        public LoyaltyPoints build() {
            return LoyaltyPoints.this;
        }

        @NonNull
        public Builder setBalance(@NonNull LoyaltyPointsBalance loyaltyPointsBalance) {
            LoyaltyPoints.this.zzb = loyaltyPointsBalance;
            return this;
        }

        @NonNull
        public Builder setLabel(@NonNull String str) {
            LoyaltyPoints.this.zza = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setType(@NonNull String str) {
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setValidTimeInterval(@NonNull TimeInterval timeInterval) {
            LoyaltyPoints.this.zzc = timeInterval;
            return this;
        }
    }

    public LoyaltyPoints() {
    }

    @NonNull
    public static Builder newBuilder() {
        return new LoyaltyPoints().new Builder(null);
    }

    @NonNull
    public LoyaltyPointsBalance getBalance() {
        return this.zzb;
    }

    @NonNull
    public String getLabel() {
        return this.zza;
    }

    @NonNull
    @Deprecated
    public String getType() {
        return "";
    }

    @NonNull
    @Deprecated
    public TimeInterval getValidTimeInterval() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzc, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public LoyaltyPoints(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) LoyaltyPointsBalance loyaltyPointsBalance, @SafeParcelable.Param(id = 5) TimeInterval timeInterval) {
        this.zza = str;
        this.zzb = loyaltyPointsBalance;
        this.zzc = timeInterval;
    }
}
