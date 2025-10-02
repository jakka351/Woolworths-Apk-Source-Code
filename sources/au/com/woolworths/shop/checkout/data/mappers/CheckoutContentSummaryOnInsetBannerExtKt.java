package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import com.woolworths.shop.checkout.fragment.CheckoutContentSummary;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutContentSummaryOnInsetBannerExtKt {
    public static final InsetBannerApiData a(CheckoutContentSummary.OnInsetBanner onInsetBanner) {
        Intrinsics.h(onInsetBanner, "<this>");
        return new InsetBannerApiData(InsetBannerDisplayTypeExtKt.a(onInsetBanner.f22270a), onInsetBanner.b, null, null, null, null, 32, null);
    }
}
