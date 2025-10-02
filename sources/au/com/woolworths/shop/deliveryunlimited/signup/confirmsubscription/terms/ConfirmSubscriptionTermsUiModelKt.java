package au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms;

import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribeTermItem;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribeTerms;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-delivery-unlimited-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ConfirmSubscriptionTermsUiModelKt {
    public static final ConfirmSubscriptionTermsUiModel a(DeliveryUnlimitedSubscribeTerms deliveryUnlimitedSubscribeTerms) {
        Intrinsics.h(deliveryUnlimitedSubscribeTerms, "<this>");
        List<DeliveryUnlimitedSubscribeTermItem> terms = deliveryUnlimitedSubscribeTerms.getTerms();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(terms, 10));
        for (DeliveryUnlimitedSubscribeTermItem deliveryUnlimitedSubscribeTermItem : terms) {
            Intrinsics.h(deliveryUnlimitedSubscribeTermItem, "<this>");
            arrayList.add(new TermItemUiModel(deliveryUnlimitedSubscribeTermItem.getTitle(), false, deliveryUnlimitedSubscribeTermItem.getLink()));
        }
        return new ConfirmSubscriptionTermsUiModel(deliveryUnlimitedSubscribeTerms.getTitle(), arrayList, deliveryUnlimitedSubscribeTerms.getButton(), deliveryUnlimitedSubscribeTerms.getImpressionAnalytics());
    }
}
