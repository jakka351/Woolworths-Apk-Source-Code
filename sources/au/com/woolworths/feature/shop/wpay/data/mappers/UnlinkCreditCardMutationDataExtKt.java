package au.com.woolworths.feature.shop.wpay.data.mappers;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.UnlinkCreditCardData;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.UnlinkCreditCardResponse;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import com.woolworths.feature.shop.wpay.UnlinkCreditCardMutation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"wpay_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnlinkCreditCardMutationDataExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    public static final UnlinkCreditCardData a(UnlinkCreditCardMutation.Data data) {
        ?? arrayList;
        UnlinkCreditCardResponse failure;
        EmptyList emptyList;
        ?? arrayList2;
        UnlinkCreditCardMutation.UnlinkCreditCard unlinkCreditCard = data.f20405a;
        if (unlinkCreditCard.b != null) {
            failure = UnlinkCreditCardResponse.Success.f8316a;
        } else {
            UnlinkCreditCardMutation.OnUnlinkCreditCardValidationFailure onUnlinkCreditCardValidationFailure = unlinkCreditCard.c;
            EmptyList emptyList2 = EmptyList.d;
            if (onUnlinkCreditCardValidationFailure != null) {
                String str = onUnlinkCreditCardValidationFailure.f20408a;
                String str2 = onUnlinkCreditCardValidationFailure.b;
                String str3 = onUnlinkCreditCardValidationFailure.c;
                AnalyticsFields analyticsFields = onUnlinkCreditCardValidationFailure.d.b;
                String str4 = analyticsFields.f10032a;
                String str5 = analyticsFields.b;
                String str6 = analyticsFields.c;
                String str7 = analyticsFields.e;
                String str8 = analyticsFields.f;
                String str9 = analyticsFields.g;
                String str10 = analyticsFields.d;
                String str11 = analyticsFields.h;
                String str12 = analyticsFields.i;
                List list = analyticsFields.j;
                if (list != null) {
                    List list2 = list;
                    emptyList = emptyList2;
                    arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(AnalyticsFieldsExtraContentExtKt.a((AnalyticsFields.ExtraContent) it.next()));
                    }
                } else {
                    emptyList = emptyList2;
                    arrayList2 = 0;
                }
                failure = new UnlinkCreditCardResponse.ValidationFailure(str, str2, str3, new AnalyticsData((EventConfig) null, str4, str5, str6, str7, str8, str9, str10, str11, str12, arrayList2 == 0 ? emptyList : arrayList2, 1, (DefaultConstructorMarker) null));
            } else {
                UnlinkCreditCardMutation.OnUnlinkCreditCardFailure onUnlinkCreditCardFailure = unlinkCreditCard.d;
                if (onUnlinkCreditCardFailure == null) {
                    throw new IllegalStateException("Error mapping `UnlinkCreditCard`: missing non-null synthetic field!");
                }
                String str13 = onUnlinkCreditCardFailure.f20406a;
                AnalyticsFields analyticsFields2 = onUnlinkCreditCardFailure.b.b;
                String str14 = analyticsFields2.f10032a;
                String str15 = analyticsFields2.b;
                String str16 = analyticsFields2.c;
                String str17 = analyticsFields2.e;
                String str18 = analyticsFields2.f;
                String str19 = analyticsFields2.g;
                String str20 = analyticsFields2.d;
                String str21 = analyticsFields2.h;
                String str22 = analyticsFields2.i;
                List list3 = analyticsFields2.j;
                if (list3 != null) {
                    List list4 = list3;
                    arrayList = new ArrayList(CollectionsKt.s(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(AnalyticsFieldsExtraContentExtKt.a((AnalyticsFields.ExtraContent) it2.next()));
                    }
                } else {
                    arrayList = 0;
                }
                failure = new UnlinkCreditCardResponse.Failure(str13, new AnalyticsData((EventConfig) null, str14, str15, str16, str17, str18, str19, str20, str21, str22, arrayList == 0 ? emptyList2 : arrayList, 1, (DefaultConstructorMarker) null));
            }
        }
        return new UnlinkCreditCardData(failure);
    }
}
