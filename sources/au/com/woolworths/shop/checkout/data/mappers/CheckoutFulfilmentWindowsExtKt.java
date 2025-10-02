package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentExtraInfo;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionsInfo;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindows;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsFooter;
import com.woolworths.shop.checkout.fragment.CheckoutFulfilmentWindows;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutFulfilmentWindowsExtKt {
    public static final FulfilmentWindows a(CheckoutFulfilmentWindows checkoutFulfilmentWindows) {
        String str = checkoutFulfilmentWindows.f22372a;
        String str2 = checkoutFulfilmentWindows.b;
        CheckoutFulfilmentWindows.Subheader subheader = checkoutFulfilmentWindows.c;
        InsetBannerApiData insetBannerApiDataA = subheader != null ? CheckoutFulfilmentWindowsSubheaderExtKt.a(subheader) : null;
        String str3 = checkoutFulfilmentWindows.d;
        ArrayList arrayList = checkoutFulfilmentWindows.h;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(CheckoutFulfilmentWindowsOptionExtKt.a((CheckoutFulfilmentWindows.Option) it.next()));
        }
        CheckoutFulfilmentWindows.Footer footer = checkoutFulfilmentWindows.e;
        FulfilmentWindowsFooter fulfilmentWindowsFooter = footer != null ? new FulfilmentWindowsFooter(footer.f22391a) : null;
        String str4 = checkoutFulfilmentWindows.f;
        CheckoutFulfilmentWindows.FeesInfo feesInfo = checkoutFulfilmentWindows.i;
        FulfilmentExtraInfo fulfilmentExtraInfoA = feesInfo != null ? CheckoutFulfilmentWindowsFeesInfoExtKt.a(feesInfo) : null;
        CheckoutFulfilmentWindows.SelectionOptionsInfo selectionOptionsInfo = checkoutFulfilmentWindows.j;
        FulfilmentSlotSelectionOptionsInfo fulfilmentSlotSelectionOptionsInfoA = selectionOptionsInfo != null ? CheckoutFulfilmentWindowsSelectionOptionsInfoExtKt.a(selectionOptionsInfo) : null;
        CheckoutFulfilmentWindows.SuggestedGroup suggestedGroup = checkoutFulfilmentWindows.g;
        return new FulfilmentWindows(str, str2, insetBannerApiDataA, str3, arrayList2, fulfilmentWindowsFooter, str4, fulfilmentExtraInfoA, fulfilmentSlotSelectionOptionsInfoA, suggestedGroup != null ? CheckoutFulfilmentWindowsSuggestedGroupExtKt.a(suggestedGroup) : null);
    }
}
