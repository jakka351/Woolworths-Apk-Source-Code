package au.com.woolworths.shop.product.details.data;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.product.models.ActionTypeExtKt;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shared.ui.compose.shop.chatentrycard.ChatEntryCardV3;
import com.woolworths.shop.product.details.ProductDetailsPageQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductDetailsPageQueryOnChatEntryCardV3ExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final ChatEntryCardV3 a(ProductDetailsPageQuery.OnChatEntryCardV3 onChatEntryCardV3) {
        AnalyticsData analyticsData;
        String str;
        String str2;
        EmptyList emptyList;
        Intrinsics.h(onChatEntryCardV3, "<this>");
        String str3 = onChatEntryCardV3.f23448a;
        Boolean bool = onChatEntryCardV3.b;
        ArrayList arrayList = onChatEntryCardV3.c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) it.next());
        }
        ProductDetailsPageQuery.ChatEntryCardAction chatEntryCardAction = onChatEntryCardV3.d;
        String str4 = chatEntryCardAction.b;
        ActionType uiModel = ActionTypeExtKt.toUiModel(chatEntryCardAction.c);
        String str5 = chatEntryCardAction.f23418a;
        ProductDetailsPageQuery.Analytics3 analytics3 = chatEntryCardAction.d;
        if (analytics3 != null) {
            AnalyticsFields analyticsFields = analytics3.b;
            String str6 = analyticsFields.f10032a;
            String str7 = analyticsFields.b;
            String str8 = analyticsFields.c;
            String str9 = analyticsFields.e;
            String str10 = analyticsFields.f;
            String str11 = analyticsFields.g;
            String str12 = analyticsFields.d;
            String str13 = analyticsFields.h;
            String str14 = analyticsFields.i;
            List list = analyticsFields.j;
            if (list != null) {
                List list2 = list;
                str = str14;
                str2 = str12;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.s(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it2.next()));
                }
                emptyList = arrayList3;
            } else {
                str = str14;
                str2 = str12;
                emptyList = null;
            }
            if (emptyList == null) {
                emptyList = EmptyList.d;
            }
            analyticsData = new AnalyticsData((EventConfig) null, str6, str7, str8, str9, str10, str11, str2, str13, str, emptyList, 1, (DefaultConstructorMarker) null);
        } else {
            analyticsData = null;
        }
        return new ChatEntryCardV3(str3, bool, arrayList2, new ActionData(str4, uiModel, str5, analyticsData));
    }
}
