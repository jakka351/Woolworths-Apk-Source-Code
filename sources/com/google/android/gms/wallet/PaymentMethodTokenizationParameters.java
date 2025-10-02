package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PaymentMethodTokenizationParametersCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class PaymentMethodTokenizationParameters extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PaymentMethodTokenizationParameters> CREATOR = new zzaf();

    @SafeParcelable.Field(id = 2)
    int zza;

    @SafeParcelable.Field(id = 3)
    final Bundle zzb;

    public final class Builder {
        public /* synthetic */ Builder(zzae zzaeVar) {
        }

        @NonNull
        public Builder addParameter(@NonNull String str, @NonNull String str2) {
            Preconditions.checkNotEmpty(str, "Tokenization parameter name must not be empty");
            Preconditions.checkNotEmpty(str2, "Tokenization parameter value must not be empty");
            PaymentMethodTokenizationParameters.this.zzb.putString(str, str2);
            return this;
        }

        @NonNull
        public PaymentMethodTokenizationParameters build() {
            return PaymentMethodTokenizationParameters.this;
        }

        @NonNull
        public Builder setPaymentMethodTokenizationType(int i) {
            PaymentMethodTokenizationParameters.this.zza = i;
            return this;
        }
    }

    private PaymentMethodTokenizationParameters() {
        this.zzb = new Bundle();
    }

    @NonNull
    public static Builder newBuilder() {
        return new PaymentMethodTokenizationParameters().new Builder(null);
    }

    @NonNull
    public Bundle getParameters() {
        return new Bundle(this.zzb);
    }

    public int getPaymentMethodTokenizationType() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeBundle(parcel, 3, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public PaymentMethodTokenizationParameters(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) Bundle bundle) {
        new Bundle();
        this.zza = i;
        this.zzb = bundle;
    }
}
