package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.identity.intents.model.UserAddress;

@SafeParcelable.Class(creator = "PaymentDataCreator")
/* loaded from: classes2.dex */
public final class PaymentData extends AbstractSafeParcelable implements AutoResolvableResult {

    @NonNull
    public static final Parcelable.Creator<PaymentData> CREATOR = new zzaa();

    @SafeParcelable.Field(id = 1)
    String zza;

    @SafeParcelable.Field(id = 2)
    CardInfo zzb;

    @SafeParcelable.Field(id = 3)
    UserAddress zzc;

    @SafeParcelable.Field(id = 4)
    PaymentMethodToken zzd;

    @SafeParcelable.Field(id = 5)
    String zze;

    @SafeParcelable.Field(id = 6)
    Bundle zzf;

    @SafeParcelable.Field(id = 7)
    String zzg;

    @Nullable
    @SafeParcelable.Field(id = 8)
    Bundle zzh;

    private PaymentData() {
    }

    @NonNull
    public static PaymentData fromJson(@NonNull String str) {
        PaymentData paymentData = new PaymentData();
        paymentData.zzg = (String) Preconditions.checkNotNull(str, "paymentDataJson cannot be null!");
        return paymentData;
    }

    @Nullable
    public static PaymentData getFromIntent(@NonNull Intent intent) {
        return (PaymentData) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.wallet.PaymentData", CREATOR);
    }

    @NonNull
    @Deprecated
    public CardInfo getCardInfo() {
        return this.zzb;
    }

    @Nullable
    @Deprecated
    public String getEmail() {
        return this.zza;
    }

    @Nullable
    @Deprecated
    public Bundle getExtraData() {
        return this.zzf;
    }

    @NonNull
    @Deprecated
    public String getGoogleTransactionId() {
        return this.zze;
    }

    @Nullable
    public Bundle getLastSavedState() {
        return this.zzh;
    }

    @Nullable
    @Deprecated
    public PaymentMethodToken getPaymentMethodToken() {
        return this.zzd;
    }

    @Nullable
    @Deprecated
    public UserAddress getShippingAddress() {
        return this.zzc;
    }

    @Override // com.google.android.gms.wallet.AutoResolvableResult
    public void putIntoIntent(@NonNull Intent intent) {
        SafeParcelableSerializer.serializeToIntentExtra(this, intent, "com.google.android.gms.wallet.PaymentData");
    }

    @NonNull
    public String toJson() {
        return this.zzg;
    }

    @NonNull
    public PaymentData withLastSavedState(@Nullable Bundle bundle) {
        this.zzh = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeBundle(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeBundle(parcel, 8, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public PaymentData(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) CardInfo cardInfo, @SafeParcelable.Param(id = 3) UserAddress userAddress, @SafeParcelable.Param(id = 4) PaymentMethodToken paymentMethodToken, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) Bundle bundle, @SafeParcelable.Param(id = 7) String str3, @Nullable @SafeParcelable.Param(id = 8) Bundle bundle2) {
        this.zza = str;
        this.zzb = cardInfo;
        this.zzc = userAddress;
        this.zzd = paymentMethodToken;
        this.zze = str2;
        this.zzf = bundle;
        this.zzg = str3;
        this.zzh = bundle2;
    }
}
