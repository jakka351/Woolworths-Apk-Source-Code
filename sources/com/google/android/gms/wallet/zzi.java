package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        LoyaltyWalletObject loyaltyWalletObject = null;
        OfferWalletObject offerWalletObject = null;
        GiftCardWalletObject giftCardWalletObject = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                loyaltyWalletObject = (LoyaltyWalletObject) SafeParcelReader.createParcelable(parcel, header, LoyaltyWalletObject.CREATOR);
            } else if (fieldId == 3) {
                offerWalletObject = (OfferWalletObject) SafeParcelReader.createParcelable(parcel, header, OfferWalletObject.CREATOR);
            } else if (fieldId == 4) {
                giftCardWalletObject = (GiftCardWalletObject) SafeParcelReader.createParcelable(parcel, header, GiftCardWalletObject.CREATOR);
            } else if (fieldId != 5) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                i = SafeParcelReader.readInt(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new CreateWalletObjectsRequest(loyaltyWalletObject, offerWalletObject, giftCardWalletObject, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CreateWalletObjectsRequest[i];
    }
}
