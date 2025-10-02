package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "TransactionInfoCreator")
/* loaded from: classes2.dex */
public final class TransactionInfo extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TransactionInfo> CREATOR = new zzao();

    @SafeParcelable.Field(id = 1)
    int zza;

    @SafeParcelable.Field(id = 2)
    String zzb;

    @SafeParcelable.Field(id = 3)
    String zzc;

    public final class Builder {
        public /* synthetic */ Builder(zzan zzanVar) {
        }

        @NonNull
        public TransactionInfo build() {
            Preconditions.checkNotEmpty(TransactionInfo.this.zzc, "currencyCode must be set!");
            TransactionInfo transactionInfo = TransactionInfo.this;
            int i = transactionInfo.zza;
            if (i != 1) {
                if (i == 2) {
                    Preconditions.checkNotEmpty(transactionInfo.zzb, "An estimated total price must be set if totalPriceStatus is set to WalletConstants.TOTAL_PRICE_STATUS_ESTIMATED!");
                } else if (i != 3) {
                    throw new IllegalArgumentException("totalPriceStatus must be set to one of WalletConstants.TotalPriceStatus!");
                }
            }
            TransactionInfo transactionInfo2 = TransactionInfo.this;
            if (transactionInfo2.zza == 3) {
                Preconditions.checkNotEmpty(transactionInfo2.zzb, "An final total price must be set if totalPriceStatus is set to WalletConstants.TOTAL_PRICE_STATUS_FINAL!");
            }
            return TransactionInfo.this;
        }

        @NonNull
        public Builder setCurrencyCode(@NonNull String str) {
            TransactionInfo.this.zzc = str;
            return this;
        }

        @NonNull
        public Builder setTotalPrice(@NonNull String str) {
            TransactionInfo.this.zzb = str;
            return this;
        }

        @NonNull
        public Builder setTotalPriceStatus(int i) {
            TransactionInfo.this.zza = i;
            return this;
        }
    }

    private TransactionInfo() {
    }

    @NonNull
    public static Builder newBuilder() {
        return new TransactionInfo().new Builder(null);
    }

    @NonNull
    public String getCurrencyCode() {
        return this.zzc;
    }

    @Nullable
    public String getTotalPrice() {
        return this.zzb;
    }

    public int getTotalPriceStatus() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public TransactionInfo(@SafeParcelable.Param(id = 1) int i, @NonNull @SafeParcelable.Param(id = 2) String str, @NonNull @SafeParcelable.Param(id = 3) String str2) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
    }
}
