package au.com.woolworths.base.shopapp.models.address;

import YU.a;
import au.com.woolworths.android.onesite.utils.Strings;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;

/* loaded from: classes3.dex */
public class SaveAddressResult {

    @SerializedName("addresses")
    private List<Address> addresses = new ArrayList();

    public final List a() {
        return this.addresses;
    }

    public final void b(List list) {
        this.addresses = list;
    }

    public static class Address {

        @SerializedName("id")
        long mId;

        @SerializedName("ispartner")
        boolean mPartner;

        @SerializedName("postalcode")
        String mPostCode;

        @SerializedName("isprimary")
        boolean mPrimary;

        @SerializedName("street1")
        String mStreet1;

        @SerializedName("street2")
        String mStreet2;

        @SerializedName("suburbid")
        String mSuburbId;

        @SerializedName("suburbname")
        String mSuburbName;

        @SerializedName(TextBundle.TEXT_ENTRY)
        String mText;

        public Address(long j, String str) {
            this.mId = j;
            this.mText = str;
        }

        public final long a() {
            return this.mId;
        }

        public final String b() {
            return this.mPostCode;
        }

        public final String c() {
            return this.mStreet1;
        }

        public final String d() {
            return this.mStreet2;
        }

        public final String e() {
            return this.mSuburbId;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof Address)) {
                Address address = (Address) obj;
                if (address.toString().equals(toString()) && address.mId == this.mId) {
                    return true;
                }
            }
            return false;
        }

        public final String f() {
            return this.mText;
        }

        public final boolean g() {
            return this.mPrimary;
        }

        public final void h(String str) {
            this.mPostCode = str;
        }

        public final void i(boolean z) {
            this.mPrimary = z;
        }

        public final void j(String str) {
            this.mStreet1 = str;
        }

        public final void k(String str) {
            this.mStreet2 = str;
        }

        public final void l(String str) {
            this.mSuburbId = str;
        }

        public final void m(String str) {
            this.mSuburbName = str;
        }

        public final String toString() {
            String strO;
            if (Strings.b(this.mStreet1) || Strings.b(this.mSuburbName) || Strings.b(this.mPostCode)) {
                return this.mText;
            }
            String str = this.mSuburbName;
            if (Strings.b(this.mStreet2) || this.mStreet2.startsWith(this.mSuburbName)) {
                if (!Strings.b(this.mStreet2)) {
                    str = this.mStreet2;
                }
                strO = "";
            } else {
                strO = a.o(new StringBuilder(), this.mStreet2, ",");
            }
            return (strO + " " + this.mStreet1 + ", " + str + " " + this.mPostCode).trim();
        }

        public Address(long j, String str, boolean z) {
            this.mId = j;
            this.mText = str;
            this.mPrimary = z;
        }
    }
}
