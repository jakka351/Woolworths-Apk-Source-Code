package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.shop.checkout.domain.model.idverification.IdVerificationBottomSheet;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import com.woolworths.shop.checkout.fragment.CheckoutContentSummary;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutContentSummaryIdVerificationBottomSheetExtKt {
    public static final IdVerificationBottomSheet a(CheckoutContentSummary.IdVerificationBottomSheet idVerificationBottomSheet) {
        ButtonApiData buttonApiData;
        ButtonApiData buttonApiData2;
        Intrinsics.h(idVerificationBottomSheet, "<this>");
        String str = idVerificationBottomSheet.f22235a;
        String str2 = idVerificationBottomSheet.b;
        ArrayList arrayList = idVerificationBottomSheet.c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) it.next());
        }
        CheckoutContentSummary.PrimaryButton primaryButton = idVerificationBottomSheet.d;
        if (primaryButton != null) {
            String str3 = primaryButton.f22273a;
            ButtonStyle buttonStyle = primaryButton.b;
            buttonApiData = new ButtonApiData(str3, null, buttonStyle != null ? ButtonStyleExtKt.a(buttonStyle) : null, primaryButton.c, null, null, null, null, null, 498, null);
        } else {
            buttonApiData = null;
        }
        CheckoutContentSummary.SecondaryButton secondaryButton = idVerificationBottomSheet.e;
        if (secondaryButton != null) {
            String str4 = secondaryButton.f22290a;
            ButtonStyle buttonStyle2 = secondaryButton.b;
            buttonApiData2 = new ButtonApiData(str4, null, buttonStyle2 != null ? ButtonStyleExtKt.a(buttonStyle2) : null, secondaryButton.c, null, null, null, null, null, 498, null);
        } else {
            buttonApiData2 = null;
        }
        return new IdVerificationBottomSheet(str, str2, arrayList2, buttonApiData, buttonApiData2);
    }
}
