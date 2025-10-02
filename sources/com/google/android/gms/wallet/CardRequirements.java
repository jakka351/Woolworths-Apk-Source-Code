package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;

@SafeParcelable.Class(creator = "CardRequirementsCreator")
/* loaded from: classes2.dex */
public final class CardRequirements extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CardRequirements> CREATOR = new zzg();

    @SafeParcelable.Field(id = 1)
    ArrayList zza;

    @SafeParcelable.Field(defaultValue = "true", id = 2)
    boolean zzb;

    @SafeParcelable.Field(id = 3)
    boolean zzc;

    @SafeParcelable.Field(id = 4)
    int zzd;

    public final class Builder {
        public /* synthetic */ Builder(zzf zzfVar) {
        }

        @NonNull
        public Builder addAllowedCardNetwork(int i) {
            CardRequirements cardRequirements = CardRequirements.this;
            if (cardRequirements.zza == null) {
                cardRequirements.zza = new ArrayList();
            }
            CardRequirements.this.zza.add(Integer.valueOf(i));
            return this;
        }

        @NonNull
        public Builder addAllowedCardNetworks(@NonNull Collection<Integer> collection) {
            boolean z = false;
            if (collection != null && !collection.isEmpty()) {
                z = true;
            }
            Preconditions.checkArgument(z, "allowedCardNetworks can't be null or empty! You must provide a valid value from WalletConstants.CardNetwork.");
            CardRequirements cardRequirements = CardRequirements.this;
            if (cardRequirements.zza == null) {
                cardRequirements.zza = new ArrayList();
            }
            CardRequirements.this.zza.addAll(collection);
            return this;
        }

        @NonNull
        public CardRequirements build() {
            Preconditions.checkNotNull(CardRequirements.this.zza, "Allowed card networks must be non-empty! You can set it through addAllowedCardNetwork() or addAllowedCardNetworks() in the CardRequirements Builder.");
            return CardRequirements.this;
        }

        @NonNull
        public Builder setAllowPrepaidCards(boolean z) {
            CardRequirements.this.zzb = z;
            return this;
        }

        @NonNull
        public Builder setBillingAddressFormat(int i) {
            CardRequirements.this.zzd = i;
            return this;
        }

        @NonNull
        public Builder setBillingAddressRequired(boolean z) {
            CardRequirements.this.zzc = z;
            return this;
        }
    }

    private CardRequirements() {
        this.zzb = true;
    }

    @NonNull
    public static Builder newBuilder() {
        return new CardRequirements().new Builder(null);
    }

    public boolean allowPrepaidCards() {
        return this.zzb;
    }

    @Nullable
    public ArrayList<Integer> getAllowedCardNetworks() {
        return this.zza;
    }

    public int getBillingAddressFormat() {
        return this.zzd;
    }

    public boolean isBillingAddressRequired() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public CardRequirements(@SafeParcelable.Param(id = 1) ArrayList arrayList, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 4) int i) {
        this.zza = arrayList;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = i;
    }
}
