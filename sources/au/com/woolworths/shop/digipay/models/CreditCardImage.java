package au.com.woolworths.shop.digipay.models;

import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/digipay/models/CreditCardImage;", "", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class CreditCardImage {
    public static final CreditCardImage d;
    public static final /* synthetic */ CreditCardImage[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        CreditCardImage creditCardImage = new CreditCardImage() { // from class: au.com.woolworths.shop.digipay.models.CreditCardImage.AMEX
            @Override // au.com.woolworths.shop.digipay.models.CreditCardImage
            public final String a() {
                return "American Express";
            }

            @Override // au.com.woolworths.shop.digipay.models.CreditCardImage
            public final int b() {
                return R.drawable.ic_amex_disabled;
            }

            @Override // au.com.woolworths.shop.digipay.models.CreditCardImage
            public final int c() {
                return R.drawable.ic_amex;
            }
        };
        CreditCardImage creditCardImage2 = new CreditCardImage() { // from class: au.com.woolworths.shop.digipay.models.CreditCardImage.DINERS
            @Override // au.com.woolworths.shop.digipay.models.CreditCardImage
            public final String a() {
                return "Dinners Club";
            }

            @Override // au.com.woolworths.shop.digipay.models.CreditCardImage
            public final int b() {
                return R.drawable.ic_diners_disabled;
            }

            @Override // au.com.woolworths.shop.digipay.models.CreditCardImage
            public final int c() {
                return R.drawable.ic_diners;
            }
        };
        CreditCardImage creditCardImage3 = new CreditCardImage() { // from class: au.com.woolworths.shop.digipay.models.CreditCardImage.JCB
            @Override // au.com.woolworths.shop.digipay.models.CreditCardImage
            public final String a() {
                return "JCB";
            }

            @Override // au.com.woolworths.shop.digipay.models.CreditCardImage
            public final int b() {
                return R.drawable.ic_jcb_disabled;
            }

            @Override // au.com.woolworths.shop.digipay.models.CreditCardImage
            public final int c() {
                return R.drawable.ic_jcb;
            }
        };
        CreditCardImage creditCardImage4 = new CreditCardImage() { // from class: au.com.woolworths.shop.digipay.models.CreditCardImage.MASTERCARD
            @Override // au.com.woolworths.shop.digipay.models.CreditCardImage
            public final String a() {
                return "MasterCard";
            }

            @Override // au.com.woolworths.shop.digipay.models.CreditCardImage
            public final int b() {
                return R.drawable.ic_mastercard_disabled;
            }

            @Override // au.com.woolworths.shop.digipay.models.CreditCardImage
            public final int c() {
                return R.drawable.ic_mastercard;
            }
        };
        CreditCardImage creditCardImage5 = new CreditCardImage() { // from class: au.com.woolworths.shop.digipay.models.CreditCardImage.VISA
            @Override // au.com.woolworths.shop.digipay.models.CreditCardImage
            public final String a() {
                return "VISA";
            }

            @Override // au.com.woolworths.shop.digipay.models.CreditCardImage
            public final int b() {
                return R.drawable.ic_visa_disabled;
            }

            @Override // au.com.woolworths.shop.digipay.models.CreditCardImage
            public final int c() {
                return R.drawable.ic_visa;
            }
        };
        CreditCardImage creditCardImage6 = new CreditCardImage() { // from class: au.com.woolworths.shop.digipay.models.CreditCardImage.UNKNOWN
            @Override // au.com.woolworths.shop.digipay.models.CreditCardImage
            public final String a() {
                return "Unknown credit card";
            }

            @Override // au.com.woolworths.shop.digipay.models.CreditCardImage
            public final int b() {
                return R.drawable.ic_digipay_credit_card;
            }

            @Override // au.com.woolworths.shop.digipay.models.CreditCardImage
            public final int c() {
                return R.drawable.ic_digipay_credit_card;
            }
        };
        d = creditCardImage6;
        CreditCardImage[] creditCardImageArr = {creditCardImage, creditCardImage2, creditCardImage3, creditCardImage4, creditCardImage5, creditCardImage6};
        e = creditCardImageArr;
        f = EnumEntriesKt.a(creditCardImageArr);
    }

    public static CreditCardImage valueOf(String str) {
        return (CreditCardImage) Enum.valueOf(CreditCardImage.class, str);
    }

    public static CreditCardImage[] values() {
        return (CreditCardImage[]) e.clone();
    }

    public abstract String a();

    public abstract int b();

    public abstract int c();
}
