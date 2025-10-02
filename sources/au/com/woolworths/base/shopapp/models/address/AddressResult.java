package au.com.woolworths.base.shopapp.models.address;

import YU.a;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import au.com.woolworths.android.onesite.utils.Locales;
import au.com.woolworths.android.onesite.utils.Objects;
import au.com.woolworths.android.onesite.utils.Strings;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;

/* loaded from: classes3.dex */
public class AddressResult {

    @SerializedName("addresses")
    private List<Address> mAddresses = new ArrayList();

    /* loaded from: classes.dex */
    public static class AlternateAddressToSave {

        @SerializedName("alternateAddressId")
        private long alternateAddressId;

        public AlternateAddressToSave(long j) {
            this.alternateAddressId = j;
        }
    }

    /* loaded from: classes.dex */
    public static class AmasAddressToSave {

        @SerializedName("AmasId")
        private String mAmasId;

        @SerializedName("IsAlternateAddressId")
        private boolean mIsAlternateAddressId;

        @SerializedName("IsForBilling")
        private boolean mIsForBilling;

        @SerializedName("Text")
        private String mText;

        public AmasAddressToSave(String str, String str2, boolean z, boolean z2) {
            this.mAmasId = str;
            this.mText = str2;
            this.mIsForBilling = z;
            this.mIsAlternateAddressId = z2;
        }
    }

    /* loaded from: classes.dex */
    public static class ManualAddressToSave {

        @SerializedName("IsAlternateAddressId")
        private boolean mIsAlternateAddressId;

        @SerializedName("IsForBilling")
        private boolean mIsForBilling;

        @SerializedName("Postcode")
        private String mPostcode;

        @SerializedName("Street1")
        private String mStreet1;

        @SerializedName("Street2")
        private String mStreet2;

        @SerializedName("SuburbId")
        private String mSuburbId;

        public ManualAddressToSave(@NonNull String str, @Nullable String str2, @NonNull String str3, @NonNull String str4, boolean z, boolean z2) {
            this.mStreet1 = str;
            this.mStreet2 = str2;
            this.mPostcode = str3;
            this.mSuburbId = str4;
            this.mIsForBilling = z;
            this.mIsAlternateAddressId = z2;
        }

        public final String a() {
            return this.mPostcode;
        }

        public final String b() {
            return this.mStreet1;
        }

        public final String c() {
            return this.mStreet2;
        }

        public final String d() {
            return this.mSuburbId;
        }

        public final boolean e() {
            return this.mIsAlternateAddressId;
        }

        public final boolean f() {
            return this.mIsForBilling;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(!Strings.b(this.mStreet1) ? a.o(new StringBuilder(), this.mStreet1, ", ") : "");
            sb.append(!Strings.b(this.mStreet2) ? a.o(new StringBuilder(), this.mStreet2, ", ") : "");
            sb.append(Strings.b(this.mPostcode) ? "" : this.mPostcode);
            return sb.toString();
        }
    }

    public final List a() {
        return this.mAddresses;
    }

    public final void b(ArrayList arrayList) {
        this.mAddresses = arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddressResult{");
        if (this.mAddresses.size() == 0) {
            sb.append("[]");
        } else {
            sb.append(String.format(Locales.a(), "size: %d, [%s, ...]", Integer.valueOf(this.mAddresses.size()), this.mAddresses.get(0).toString()));
        }
        sb.append("}");
        return sb.toString();
    }

    public static class Address {

        @SerializedName("amasid")
        private String mAmasId;

        @SerializedName(TextBundle.TEXT_ENTRY)
        private String mText;

        public Address(long j, String str) {
            this.mAmasId = String.valueOf(j);
            this.mText = str;
        }

        public final String a() {
            return this.mAmasId;
        }

        public final long b() {
            return Objects.a(this.mAmasId) + hashCode();
        }

        public final String c() {
            return this.mText;
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof Address)) {
                return false;
            }
            return ((Address) obj).toString().equals(toString());
        }

        public final String toString() {
            return a.j("Address{amasid: ", this.mAmasId, ", text: ", this.mText, "}");
        }

        public Address(String str, String str2) {
            this.mAmasId = str;
            this.mText = str2;
        }
    }
}
