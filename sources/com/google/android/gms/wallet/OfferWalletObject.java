package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;
import java.util.Collection;

@SafeParcelable.Class(creator = "OfferWalletObjectCreator")
/* loaded from: classes2.dex */
public final class OfferWalletObject extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<OfferWalletObject> CREATOR = new zzv();

    @SafeParcelable.Field(id = 2)
    String zza;

    @SafeParcelable.Field(id = 3)
    String zzb;

    @SafeParcelable.Field(id = 4)
    CommonWalletObject zzc;

    @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    private final int zzd;

    public final class Builder {
        private final com.google.android.gms.wallet.wobs.zzb zzb = CommonWalletObject.zzb();

        public /* synthetic */ Builder(zzu zzuVar) {
        }

        @NonNull
        public Builder addImageModuleDataMainImageUri(@NonNull UriData uriData) {
            this.zzb.zza(uriData);
            return this;
        }

        @NonNull
        public Builder addImageModuleDataMainImageUris(@NonNull Collection<UriData> collection) {
            this.zzb.zzb(collection);
            return this;
        }

        @NonNull
        public Builder addInfoModuleDataLabelValueRow(@NonNull LabelValueRow labelValueRow) {
            this.zzb.zzc(labelValueRow);
            return this;
        }

        @NonNull
        public Builder addInfoModuleDataLabelValueRows(@NonNull Collection<LabelValueRow> collection) {
            this.zzb.zzd(collection);
            return this;
        }

        @NonNull
        public Builder addLinksModuleDataUri(@NonNull UriData uriData) {
            this.zzb.zze(uriData);
            return this;
        }

        @NonNull
        public Builder addLinksModuleDataUris(@NonNull Collection<UriData> collection) {
            this.zzb.zzf(collection);
            return this;
        }

        @NonNull
        public Builder addLocation(@NonNull LatLng latLng) {
            this.zzb.zzg(latLng);
            return this;
        }

        @NonNull
        public Builder addLocations(@NonNull Collection<LatLng> collection) {
            this.zzb.zzh(collection);
            return this;
        }

        @NonNull
        public Builder addMessage(@NonNull WalletObjectMessage walletObjectMessage) {
            this.zzb.zzi(walletObjectMessage);
            return this;
        }

        @NonNull
        public Builder addMessages(@NonNull Collection<WalletObjectMessage> collection) {
            this.zzb.zzj(collection);
            return this;
        }

        @NonNull
        public Builder addTextModuleData(@NonNull TextModuleData textModuleData) {
            this.zzb.zzk(textModuleData);
            return this;
        }

        @NonNull
        public Builder addTextModulesData(@NonNull Collection<TextModuleData> collection) {
            this.zzb.zzl(collection);
            return this;
        }

        @NonNull
        public OfferWalletObject build() {
            com.google.android.gms.wallet.wobs.zzb zzbVar = this.zzb;
            OfferWalletObject offerWalletObject = OfferWalletObject.this;
            offerWalletObject.zzc = zzbVar.zzz();
            return offerWalletObject;
        }

        @NonNull
        public Builder setBarcodeAlternateText(@NonNull String str) {
            this.zzb.zzm(str);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setBarcodeLabel(@NonNull String str) {
            this.zzb.zzn(str);
            return this;
        }

        @NonNull
        public Builder setBarcodeType(@NonNull String str) {
            this.zzb.zzo(str);
            return this;
        }

        @NonNull
        public Builder setBarcodeValue(@NonNull String str) {
            this.zzb.zzp(str);
            return this;
        }

        @NonNull
        public Builder setClassId(@NonNull String str) {
            this.zzb.zzq(str);
            return this;
        }

        @NonNull
        public Builder setId(@NonNull String str) {
            this.zzb.zzr(str);
            OfferWalletObject.this.zza = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setInfoModuleDataHexBackgroundColor(@NonNull String str) {
            this.zzb.zzs(str);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setInfoModuleDataHexFontColor(@NonNull String str) {
            this.zzb.zzt(str);
            return this;
        }

        @NonNull
        public Builder setInfoModuleDataShowLastUpdateTime(boolean z) {
            this.zzb.zzu(z);
            return this;
        }

        @NonNull
        public Builder setIssuerName(@NonNull String str) {
            this.zzb.zzv(str);
            return this;
        }

        @NonNull
        public Builder setRedemptionCode(@NonNull String str) {
            OfferWalletObject.this.zzb = str;
            return this;
        }

        @NonNull
        public Builder setState(int i) {
            this.zzb.zzx(i);
            return this;
        }

        @NonNull
        public Builder setTitle(@NonNull String str) {
            this.zzb.zzw(str);
            return this;
        }

        @NonNull
        public Builder setValidTimeInterval(@NonNull TimeInterval timeInterval) {
            this.zzb.zzy(timeInterval);
            return this;
        }
    }

    public OfferWalletObject() {
        this.zzd = 3;
    }

    @NonNull
    public static Builder newBuilder() {
        return new OfferWalletObject().new Builder(null);
    }

    @NonNull
    public String getBarcodeAlternateText() {
        return this.zzc.zzd();
    }

    @NonNull
    @Deprecated
    public String getBarcodeLabel() {
        return this.zzc.zze();
    }

    @NonNull
    public String getBarcodeType() {
        return this.zzc.zzf();
    }

    @NonNull
    public String getBarcodeValue() {
        return this.zzc.zzg();
    }

    @NonNull
    public String getClassId() {
        return this.zzc.zzh();
    }

    @NonNull
    public String getId() {
        return this.zzc.zzi();
    }

    @NonNull
    public ArrayList<UriData> getImageModuleDataMainImageUris() {
        return this.zzc.zzn();
    }

    @NonNull
    @Deprecated
    public String getInfoModuleDataHexBackgroundColor() {
        return this.zzc.zzj();
    }

    @NonNull
    @Deprecated
    public String getInfoModuleDataHexFontColor() {
        return this.zzc.zzk();
    }

    @NonNull
    public ArrayList<LabelValueRow> getInfoModuleDataLabelValueRows() {
        return this.zzc.zzo();
    }

    public boolean getInfoModuleDataShowLastUpdateTime() {
        return this.zzc.zzt();
    }

    @NonNull
    public String getIssuerName() {
        return this.zzc.zzl();
    }

    @NonNull
    public ArrayList<UriData> getLinksModuleDataUris() {
        return this.zzc.zzp();
    }

    @NonNull
    public ArrayList<LatLng> getLocations() {
        return this.zzc.zzq();
    }

    @NonNull
    public ArrayList<WalletObjectMessage> getMessages() {
        return this.zzc.zzr();
    }

    @NonNull
    public String getRedemptionCode() {
        return this.zzb;
    }

    public int getState() {
        return this.zzc.zza();
    }

    @NonNull
    public ArrayList<TextModuleData> getTextModulesData() {
        return this.zzc.zzs();
    }

    @NonNull
    public String getTitle() {
        return this.zzc.zzm();
    }

    @NonNull
    public TimeInterval getValidTimeInterval() {
        return this.zzc.zzc();
    }

    public int getVersionCode() {
        return this.zzd;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getVersionCode());
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public OfferWalletObject(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) CommonWalletObject commonWalletObject) {
        this.zzd = i;
        this.zzb = str2;
        if (i >= 3) {
            this.zzc = commonWalletObject;
            return;
        }
        com.google.android.gms.wallet.wobs.zzb zzbVarZzb = CommonWalletObject.zzb();
        zzbVarZzb.zzr(str);
        this.zzc = zzbVarZzb.zzz();
    }
}
