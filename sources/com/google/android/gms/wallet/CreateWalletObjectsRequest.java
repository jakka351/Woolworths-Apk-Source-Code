package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class(creator = "CreateWalletObjectsRequestCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class CreateWalletObjectsRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CreateWalletObjectsRequest> CREATOR = new zzi();
    public static final int REQUEST_IMMEDIATE_SAVE = 1;
    public static final int SHOW_SAVE_PROMPT = 0;

    @SafeParcelable.Field(id = 2)
    LoyaltyWalletObject zza;

    @SafeParcelable.Field(id = 3)
    OfferWalletObject zzb;

    @SafeParcelable.Field(id = 4)
    GiftCardWalletObject zzc;

    @SafeParcelable.Field(id = 5)
    int zzd;

    public final class Builder {
        public /* synthetic */ Builder(zzh zzhVar) {
        }

        @NonNull
        public CreateWalletObjectsRequest build() {
            CreateWalletObjectsRequest createWalletObjectsRequest = CreateWalletObjectsRequest.this;
            Preconditions.checkState(((createWalletObjectsRequest.zzc == null ? 0 : 1) + (createWalletObjectsRequest.zza == null ? 0 : 1)) + (createWalletObjectsRequest.zzb == null ? 0 : 1) == 1, "CreateWalletObjectsRequest must have exactly one Wallet Object");
            return CreateWalletObjectsRequest.this;
        }

        @NonNull
        public Builder setCreateMode(int i) {
            CreateWalletObjectsRequest.this.zzd = i;
            return this;
        }

        @NonNull
        public Builder setGiftCardWalletObject(@NonNull GiftCardWalletObject giftCardWalletObject) {
            CreateWalletObjectsRequest.this.zzc = giftCardWalletObject;
            return this;
        }

        @NonNull
        public Builder setLoyaltyWalletObject(@NonNull LoyaltyWalletObject loyaltyWalletObject) {
            CreateWalletObjectsRequest.this.zza = loyaltyWalletObject;
            return this;
        }

        @NonNull
        public Builder setOfferWalletObject(@NonNull OfferWalletObject offerWalletObject) {
            CreateWalletObjectsRequest.this.zzb = offerWalletObject;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface CreateMode {
    }

    public CreateWalletObjectsRequest() {
    }

    @NonNull
    public static Builder newBuilder() {
        return new CreateWalletObjectsRequest().new Builder(null);
    }

    public int getCreateMode() {
        return this.zzd;
    }

    @NonNull
    public GiftCardWalletObject getGiftCardWalletObject() {
        return this.zzc;
    }

    @NonNull
    public LoyaltyWalletObject getLoyaltyWalletObject() {
        return this.zza;
    }

    @NonNull
    public OfferWalletObject getOfferWalletObject() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Deprecated
    public CreateWalletObjectsRequest(@NonNull GiftCardWalletObject giftCardWalletObject) {
        this.zzc = giftCardWalletObject;
    }

    @Deprecated
    public CreateWalletObjectsRequest(@NonNull LoyaltyWalletObject loyaltyWalletObject) {
        this.zza = loyaltyWalletObject;
    }

    @SafeParcelable.Constructor
    public CreateWalletObjectsRequest(@SafeParcelable.Param(id = 2) LoyaltyWalletObject loyaltyWalletObject, @SafeParcelable.Param(id = 3) OfferWalletObject offerWalletObject, @SafeParcelable.Param(id = 4) GiftCardWalletObject giftCardWalletObject, @SafeParcelable.Param(id = 5) int i) {
        this.zza = loyaltyWalletObject;
        this.zzb = offerWalletObject;
        this.zzc = giftCardWalletObject;
        this.zzd = i;
    }

    @Deprecated
    public CreateWalletObjectsRequest(@NonNull OfferWalletObject offerWalletObject) {
        this.zzb = offerWalletObject;
    }
}
