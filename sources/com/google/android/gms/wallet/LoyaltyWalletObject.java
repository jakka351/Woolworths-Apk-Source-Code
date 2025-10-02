package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;
import java.util.Collection;

@SafeParcelable.Class(creator = "LoyaltyWalletObjectCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class LoyaltyWalletObject extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LoyaltyWalletObject> CREATOR = new zzs();

    @SafeParcelable.Field(id = 2)
    String zza;

    @SafeParcelable.Field(id = 3)
    String zzb;

    @SafeParcelable.Field(id = 4)
    String zzc;

    @SafeParcelable.Field(id = 5)
    String zzd;

    @SafeParcelable.Field(id = 6)
    String zze;

    @SafeParcelable.Field(id = 7)
    String zzf;

    @SafeParcelable.Field(id = 8)
    String zzg;

    @SafeParcelable.Field(id = 9)
    String zzh;

    @SafeParcelable.Field(id = 10)
    @Deprecated
    String zzi;

    @SafeParcelable.Field(id = 11)
    String zzj;

    @SafeParcelable.Field(id = 12)
    int zzk;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 13)
    final ArrayList zzl;

    @SafeParcelable.Field(id = 14)
    TimeInterval zzm;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 15)
    final ArrayList zzn;

    @SafeParcelable.Field(id = 16)
    @Deprecated
    String zzo;

    @SafeParcelable.Field(id = 17)
    @Deprecated
    String zzp;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 18)
    final ArrayList zzq;

    @SafeParcelable.Field(id = 19)
    boolean zzr;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 20)
    final ArrayList zzs;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 21)
    final ArrayList zzt;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 22)
    final ArrayList zzu;

    @SafeParcelable.Field(id = 23)
    LoyaltyPoints zzv;

    public final class Builder {
        public /* synthetic */ Builder(zzr zzrVar) {
        }

        @NonNull
        public Builder addImageModuleDataMainImageUri(@NonNull UriData uriData) {
            LoyaltyWalletObject.this.zzs.add(uriData);
            return this;
        }

        @NonNull
        public Builder addImageModuleDataMainImageUris(@NonNull Collection<UriData> collection) {
            LoyaltyWalletObject.this.zzs.addAll(collection);
            return this;
        }

        @NonNull
        public Builder addInfoModuleDataLabeValueRow(@NonNull LabelValueRow labelValueRow) {
            LoyaltyWalletObject.this.zzq.add(labelValueRow);
            return this;
        }

        @NonNull
        public Builder addInfoModuleDataLabelValueRows(@NonNull Collection<LabelValueRow> collection) {
            LoyaltyWalletObject.this.zzq.addAll(collection);
            return this;
        }

        @NonNull
        public Builder addLinksModuleDataUri(@NonNull UriData uriData) {
            LoyaltyWalletObject.this.zzu.add(uriData);
            return this;
        }

        @NonNull
        public Builder addLinksModuleDataUris(@NonNull Collection<UriData> collection) {
            LoyaltyWalletObject.this.zzu.addAll(collection);
            return this;
        }

        @NonNull
        public Builder addLocation(@NonNull LatLng latLng) {
            LoyaltyWalletObject.this.zzn.add(latLng);
            return this;
        }

        @NonNull
        public Builder addLocations(@NonNull Collection<LatLng> collection) {
            LoyaltyWalletObject.this.zzn.addAll(collection);
            return this;
        }

        @NonNull
        public Builder addMessage(@NonNull WalletObjectMessage walletObjectMessage) {
            LoyaltyWalletObject.this.zzl.add(walletObjectMessage);
            return this;
        }

        @NonNull
        public Builder addMessages(@NonNull Collection<WalletObjectMessage> collection) {
            LoyaltyWalletObject.this.zzl.addAll(collection);
            return this;
        }

        @NonNull
        public Builder addTextModuleData(@NonNull TextModuleData textModuleData) {
            LoyaltyWalletObject.this.zzt.add(textModuleData);
            return this;
        }

        @NonNull
        public Builder addTextModulesData(@NonNull Collection<TextModuleData> collection) {
            LoyaltyWalletObject.this.zzt.addAll(collection);
            return this;
        }

        @NonNull
        public LoyaltyWalletObject build() {
            return LoyaltyWalletObject.this;
        }

        @NonNull
        public Builder setAccountId(@NonNull String str) {
            LoyaltyWalletObject.this.zzb = str;
            return this;
        }

        @NonNull
        public Builder setAccountName(@NonNull String str) {
            LoyaltyWalletObject.this.zze = str;
            return this;
        }

        @NonNull
        public Builder setBarcodeAlternateText(@NonNull String str) {
            LoyaltyWalletObject.this.zzf = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setBarcodeLabel(@NonNull String str) {
            LoyaltyWalletObject.this.zzi = str;
            return this;
        }

        @NonNull
        public Builder setBarcodeType(@NonNull String str) {
            LoyaltyWalletObject.this.zzg = str;
            return this;
        }

        @NonNull
        public Builder setBarcodeValue(@NonNull String str) {
            LoyaltyWalletObject.this.zzh = str;
            return this;
        }

        @NonNull
        public Builder setClassId(@NonNull String str) {
            LoyaltyWalletObject.this.zzj = str;
            return this;
        }

        @NonNull
        public Builder setId(@NonNull String str) {
            LoyaltyWalletObject.this.zza = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setInfoModuleDataHexBackgroundColor(@NonNull String str) {
            LoyaltyWalletObject.this.zzp = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setInfoModuleDataHexFontColor(@NonNull String str) {
            LoyaltyWalletObject.this.zzo = str;
            return this;
        }

        @NonNull
        public Builder setInfoModuleDataShowLastUpdateTime(boolean z) {
            LoyaltyWalletObject.this.zzr = z;
            return this;
        }

        @NonNull
        public Builder setIssuerName(@NonNull String str) {
            LoyaltyWalletObject.this.zzc = str;
            return this;
        }

        @NonNull
        public Builder setLoyaltyPoints(@NonNull LoyaltyPoints loyaltyPoints) {
            LoyaltyWalletObject.this.zzv = loyaltyPoints;
            return this;
        }

        @NonNull
        public Builder setProgramName(@NonNull String str) {
            LoyaltyWalletObject.this.zzd = str;
            return this;
        }

        @NonNull
        public Builder setState(int i) {
            LoyaltyWalletObject.this.zzk = i;
            return this;
        }

        @NonNull
        public Builder setValidTimeInterval(@NonNull TimeInterval timeInterval) {
            LoyaltyWalletObject.this.zzm = timeInterval;
            return this;
        }
    }

    public LoyaltyWalletObject() {
        this.zzl = ArrayUtils.newArrayList();
        this.zzn = ArrayUtils.newArrayList();
        this.zzq = ArrayUtils.newArrayList();
        this.zzs = ArrayUtils.newArrayList();
        this.zzt = ArrayUtils.newArrayList();
        this.zzu = ArrayUtils.newArrayList();
    }

    @NonNull
    public static Builder newBuilder() {
        return new LoyaltyWalletObject().new Builder(null);
    }

    @NonNull
    public String getAccountId() {
        return this.zzb;
    }

    @NonNull
    public String getAccountName() {
        return this.zze;
    }

    @NonNull
    public String getBarcodeAlternateText() {
        return this.zzf;
    }

    @NonNull
    @Deprecated
    public String getBarcodeLabel() {
        return this.zzi;
    }

    @NonNull
    public String getBarcodeType() {
        return this.zzg;
    }

    @NonNull
    public String getBarcodeValue() {
        return this.zzh;
    }

    @NonNull
    public String getClassId() {
        return this.zzj;
    }

    @NonNull
    public String getId() {
        return this.zza;
    }

    @NonNull
    public ArrayList<UriData> getImageModuleDataMainImageUris() {
        return this.zzs;
    }

    @NonNull
    @Deprecated
    public String getInfoModuleDataHexBackgroundColor() {
        return this.zzp;
    }

    @NonNull
    @Deprecated
    public String getInfoModuleDataHexFontColor() {
        return this.zzo;
    }

    @NonNull
    public ArrayList<LabelValueRow> getInfoModuleDataLabelValueRows() {
        return this.zzq;
    }

    public boolean getInfoModuleDataShowLastUpdateTime() {
        return this.zzr;
    }

    @NonNull
    public String getIssuerName() {
        return this.zzc;
    }

    @NonNull
    public ArrayList<UriData> getLinksModuleDataUris() {
        return this.zzu;
    }

    @NonNull
    public ArrayList<LatLng> getLocations() {
        return this.zzn;
    }

    @NonNull
    public LoyaltyPoints getLoyaltyPoints() {
        return this.zzv;
    }

    @NonNull
    public ArrayList<WalletObjectMessage> getMessages() {
        return this.zzl;
    }

    @NonNull
    public String getProgramName() {
        return this.zzd;
    }

    public int getState() {
        return this.zzk;
    }

    @NonNull
    public ArrayList<TextModuleData> getTextModulesData() {
        return this.zzt;
    }

    @NonNull
    public TimeInterval getValidTimeInterval() {
        return this.zzm;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeString(parcel, 10, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 11, this.zzj, false);
        SafeParcelWriter.writeInt(parcel, 12, this.zzk);
        SafeParcelWriter.writeTypedList(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i, false);
        SafeParcelWriter.writeTypedList(parcel, 15, this.zzn, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzo, false);
        SafeParcelWriter.writeString(parcel, 17, this.zzp, false);
        SafeParcelWriter.writeTypedList(parcel, 18, this.zzq, false);
        SafeParcelWriter.writeBoolean(parcel, 19, this.zzr);
        SafeParcelWriter.writeTypedList(parcel, 20, this.zzs, false);
        SafeParcelWriter.writeTypedList(parcel, 21, this.zzt, false);
        SafeParcelWriter.writeTypedList(parcel, 22, this.zzu, false);
        SafeParcelWriter.writeParcelable(parcel, 23, this.zzv, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public LoyaltyWalletObject(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) String str5, @SafeParcelable.Param(id = 7) String str6, @SafeParcelable.Param(id = 8) String str7, @SafeParcelable.Param(id = 9) String str8, @SafeParcelable.Param(id = 10) String str9, @SafeParcelable.Param(id = 11) String str10, @SafeParcelable.Param(id = 12) int i, @SafeParcelable.Param(id = 13) ArrayList arrayList, @SafeParcelable.Param(id = 14) TimeInterval timeInterval, @SafeParcelable.Param(id = 15) ArrayList arrayList2, @SafeParcelable.Param(id = 16) String str11, @SafeParcelable.Param(id = 17) String str12, @SafeParcelable.Param(id = 18) ArrayList arrayList3, @SafeParcelable.Param(id = 19) boolean z, @SafeParcelable.Param(id = 20) ArrayList arrayList4, @SafeParcelable.Param(id = 21) ArrayList arrayList5, @SafeParcelable.Param(id = 22) ArrayList arrayList6, @SafeParcelable.Param(id = 23) LoyaltyPoints loyaltyPoints) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = str9;
        this.zzj = str10;
        this.zzk = i;
        this.zzl = arrayList;
        this.zzm = timeInterval;
        this.zzn = arrayList2;
        this.zzo = str11;
        this.zzp = str12;
        this.zzq = arrayList3;
        this.zzr = z;
        this.zzs = arrayList4;
        this.zzt = arrayList5;
        this.zzu = arrayList6;
        this.zzv = loyaltyPoints;
    }
}
