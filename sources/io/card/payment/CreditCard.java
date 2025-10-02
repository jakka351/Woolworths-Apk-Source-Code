package io.card.payment;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.medallia.digital.mobilesdk.q2;
import java.util.Calendar;
import java.util.UUID;

/* loaded from: classes7.dex */
public class CreditCard implements Parcelable {
    public static final Parcelable.Creator<CreditCard> CREATOR = new Parcelable.Creator<CreditCard>() { // from class: io.card.payment.CreditCard.1
        @Override // android.os.Parcelable.Creator
        public final CreditCard createFromParcel(Parcel parcel) {
            return new CreditCard(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CreditCard[] newArray(int i) {
            return new CreditCard[i];
        }
    };
    public static final int EXPIRY_MAX_FUTURE_YEARS = 15;
    private static final String TAG = "CreditCard";
    public String cardNumber;
    public String cardholderName;
    public String cvv;
    public int expiryMonth;
    public int expiryYear;
    boolean flipped;
    public String postalCode;
    String scanId;
    int[] xoff;
    int yoff;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CardType getCardType() {
        return CardType.fromCardNumber(this.cardNumber);
    }

    public String getFormattedCardNumber() {
        return CreditCardNumber.a(this.cardNumber, true, null);
    }

    public String getLastFourDigitsOfCardNumber() {
        String str = this.cardNumber;
        if (str == null) {
            return "";
        }
        int iMin = Math.min(4, str.length());
        String str2 = this.cardNumber;
        return str2.substring(str2.length() - iMin);
    }

    public String getRedactedCardNumber() {
        String str = this.cardNumber;
        String string = "";
        if (str == null) {
            return "";
        }
        if (str.length() > 4) {
            StringBuilder sb = new StringBuilder("");
            sb.append(String.format("%" + (this.cardNumber.length() - 4) + "s", "").replace(' ', (char) 8226));
            string = sb.toString();
        }
        StringBuilder sbS = a.s(string);
        sbS.append(getLastFourDigitsOfCardNumber());
        return CreditCardNumber.a(sbS.toString(), false, CardType.fromCardNumber(this.cardNumber));
    }

    public boolean isExpiryValid() {
        int i = this.expiryMonth;
        int i2 = this.expiryYear;
        if (i < 1 || 12 < i) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        int i3 = calendar.get(1);
        int i4 = calendar.get(2) + 1;
        if (i2 < i3) {
            return false;
        }
        return (i2 != i3 || i >= i4) && i2 <= i3 + 15;
    }

    public String toString() {
        String string = "{" + getCardType() + ": " + getRedactedCardNumber();
        if (this.expiryMonth > 0 || this.expiryYear > 0) {
            StringBuilder sbT = a.t(string, "  expiry:");
            sbT.append(this.expiryMonth);
            sbT.append(q2.c);
            sbT.append(this.expiryYear);
            string = sbT.toString();
        }
        if (this.postalCode != null) {
            StringBuilder sbT2 = a.t(string, "  postalCode:");
            sbT2.append(this.postalCode);
            string = sbT2.toString();
        }
        if (this.cardholderName != null) {
            StringBuilder sbT3 = a.t(string, "  cardholderName:");
            sbT3.append(this.cardholderName);
            string = sbT3.toString();
        }
        if (this.cvv != null) {
            StringBuilder sbT4 = a.t(string, "  cvvLength:");
            String str = this.cvv;
            sbT4.append(str != null ? str.length() : 0);
            string = sbT4.toString();
        }
        return a.g(string, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cardNumber);
        parcel.writeInt(this.expiryMonth);
        parcel.writeInt(this.expiryYear);
        parcel.writeString(this.cvv);
        parcel.writeString(this.postalCode);
        parcel.writeString(this.cardholderName);
        parcel.writeString(this.scanId);
        parcel.writeInt(this.yoff);
        parcel.writeIntArray(this.xoff);
    }

    public CreditCard() {
        this.expiryMonth = 0;
        this.expiryYear = 0;
        this.flipped = false;
        this.xoff = new int[16];
        this.scanId = UUID.randomUUID().toString();
    }

    public CreditCard(String str, int i, int i2, String str2, String str3, String str4) {
        this.flipped = false;
        this.cardNumber = str;
        this.expiryMonth = i;
        this.expiryYear = i2;
        this.cvv = str2;
        this.postalCode = str3;
        this.cardholderName = str4;
    }

    private CreditCard(Parcel parcel) {
        this.expiryMonth = 0;
        this.expiryYear = 0;
        this.flipped = false;
        this.cardNumber = parcel.readString();
        this.expiryMonth = parcel.readInt();
        this.expiryYear = parcel.readInt();
        this.cvv = parcel.readString();
        this.postalCode = parcel.readString();
        this.cardholderName = parcel.readString();
        this.scanId = parcel.readString();
        this.yoff = parcel.readInt();
        this.xoff = parcel.createIntArray();
    }
}
