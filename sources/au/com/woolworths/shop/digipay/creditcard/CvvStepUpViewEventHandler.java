package au.com.woolworths.shop.digipay.creditcard;

import au.com.woolworths.pay.sdk.models.errors.BaseError;
import au.com.woolworths.pay.sdk.web.FormFocusState;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/digipay/creditcard/CvvStepUpViewEventHandler;", "", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CvvStepUpViewEventHandler {
    void A1(BaseError baseError);

    void C3(FormFocusState formFocusState);

    void J3(String str, String str2);

    void K1(boolean z, boolean z2);

    void W1();

    void a3(boolean z);
}
