package au.com.woolworths.shop.digipay.creditcard;

import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/digipay/creditcard/CreditCardCaptureInlineErrorState;", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBanner;", "", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class CreditCardCaptureInlineErrorState implements InsetBanner {
    public static final CreditCardCaptureInlineErrorState e;
    public static final CreditCardCaptureInlineErrorState f;
    public static final CreditCardCaptureInlineErrorState g;
    public static final CreditCardCaptureInlineErrorState h;
    public static final CreditCardCaptureInlineErrorState i;
    public static final CreditCardCaptureInlineErrorState j;
    public static final CreditCardCaptureInlineErrorState k;
    public static final /* synthetic */ CreditCardCaptureInlineErrorState[] l;
    public static final /* synthetic */ EnumEntries m;
    public final InlineErrorType d = InlineErrorType.h;

    static {
        CreditCardCaptureInlineErrorState creditCardCaptureInlineErrorState = new CreditCardCaptureInlineErrorState() { // from class: au.com.woolworths.shop.digipay.creditcard.CreditCardCaptureInlineErrorState.CARD_NOT_ACCEPTED
            public final ResText n = new ResText(R.string.digipay_credit_card_not_accepted);

            @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
            public final Text getMessageText() {
                return this.n;
            }
        };
        e = creditCardCaptureInlineErrorState;
        CreditCardCaptureInlineErrorState creditCardCaptureInlineErrorState2 = new CreditCardCaptureInlineErrorState() { // from class: au.com.woolworths.shop.digipay.creditcard.CreditCardCaptureInlineErrorState.INVALID_CARD_DETAILS
            public final ResText n = new ResText(R.string.digipay_invalid_credit_card_details);

            @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
            public final Text getMessageText() {
                return this.n;
            }
        };
        f = creditCardCaptureInlineErrorState2;
        CreditCardCaptureInlineErrorState creditCardCaptureInlineErrorState3 = new CreditCardCaptureInlineErrorState() { // from class: au.com.woolworths.shop.digipay.creditcard.CreditCardCaptureInlineErrorState.INVALID_CARD_EXPIRY_YEAR
            public final ResText n = new ResText(R.string.digipay_invalid_credit_card_expiry_year);

            @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
            public final Text getMessageText() {
                return this.n;
            }
        };
        g = creditCardCaptureInlineErrorState3;
        CreditCardCaptureInlineErrorState creditCardCaptureInlineErrorState4 = new CreditCardCaptureInlineErrorState() { // from class: au.com.woolworths.shop.digipay.creditcard.CreditCardCaptureInlineErrorState.INVALID_CARD_EXPIRY_MONTH
            public final ResText n = new ResText(R.string.digipay_invalid_credit_card_expiry_month);

            @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
            public final Text getMessageText() {
                return this.n;
            }
        };
        h = creditCardCaptureInlineErrorState4;
        CreditCardCaptureInlineErrorState creditCardCaptureInlineErrorState5 = new CreditCardCaptureInlineErrorState() { // from class: au.com.woolworths.shop.digipay.creditcard.CreditCardCaptureInlineErrorState.INVALID_CARD_EXPIRY_DATE
            public final ResText n = new ResText(R.string.digipay_invalid_credit_card_expiry_date);

            @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
            public final Text getMessageText() {
                return this.n;
            }
        };
        i = creditCardCaptureInlineErrorState5;
        CreditCardCaptureInlineErrorState creditCardCaptureInlineErrorState6 = new CreditCardCaptureInlineErrorState() { // from class: au.com.woolworths.shop.digipay.creditcard.CreditCardCaptureInlineErrorState.INVALID_CARD_CVV
            public final ResText n = new ResText(R.string.digipay_invalid_credit_card_cvv);

            @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
            public final Text getMessageText() {
                return this.n;
            }
        };
        j = creditCardCaptureInlineErrorState6;
        CreditCardCaptureInlineErrorState creditCardCaptureInlineErrorState7 = new CreditCardCaptureInlineErrorState() { // from class: au.com.woolworths.shop.digipay.creditcard.CreditCardCaptureInlineErrorState.INVALID_CARD_NUMBER
            public final ResText n = new ResText(R.string.digipay_invalid_credit_card_number);

            @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
            public final Text getMessageText() {
                return this.n;
            }
        };
        k = creditCardCaptureInlineErrorState7;
        CreditCardCaptureInlineErrorState[] creditCardCaptureInlineErrorStateArr = {creditCardCaptureInlineErrorState, creditCardCaptureInlineErrorState2, creditCardCaptureInlineErrorState3, creditCardCaptureInlineErrorState4, creditCardCaptureInlineErrorState5, creditCardCaptureInlineErrorState6, creditCardCaptureInlineErrorState7};
        l = creditCardCaptureInlineErrorStateArr;
        m = EnumEntriesKt.a(creditCardCaptureInlineErrorStateArr);
    }

    public CreditCardCaptureInlineErrorState(String str, int i2) {
    }

    public static CreditCardCaptureInlineErrorState valueOf(String str) {
        return (CreditCardCaptureInlineErrorState) Enum.valueOf(CreditCardCaptureInlineErrorState.class, str);
    }

    public static CreditCardCaptureInlineErrorState[] values() {
        return (CreditCardCaptureInlineErrorState[]) l.clone();
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    /* renamed from: getErrorType, reason: from getter */
    public final InlineErrorType getD() {
        return this.d;
    }
}
