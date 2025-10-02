package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerTypeApiData;
import com.woolworths.shop.checkout.fragment.CheckoutFulfilmentWindows;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutFulfilmentWindowsSubheaderExtKt {
    public static final InsetBannerApiData a(CheckoutFulfilmentWindows.Subheader subheader) {
        Intrinsics.h(subheader, "<this>");
        InsetBannerTypeApiData insetBannerTypeApiDataA = InsetBannerDisplayTypeExtKt.a(subheader.f22417a);
        String str = subheader.b;
        String str2 = subheader.c;
        CheckoutFulfilmentWindows.Action action = subheader.e;
        return new InsetBannerApiData(insetBannerTypeApiDataA, str, str2, action != null ? new InsetBannerActionApiData(action.c, action.d, InsetBannerActionTypeExtKt.a(action.b), InsetBannerActionPlacementExtKt.a(action.f22373a), null) : null, subheader.d, null, 32, null);
    }
}
