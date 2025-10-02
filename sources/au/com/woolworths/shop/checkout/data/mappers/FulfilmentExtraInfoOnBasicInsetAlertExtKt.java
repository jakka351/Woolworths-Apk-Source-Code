package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.sdui.common.alert.model.CoreAlertStyle;
import au.com.woolworths.sdui.common.alert.model.CoreInsetAlertModel;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.sdui.shop.alert.model.BasicInsetAlertModel;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import com.woolworths.shop.checkout.fragment.FulfilmentExtraInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FulfilmentExtraInfoOnBasicInsetAlertExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    public static final BasicInsetAlertModel a(FulfilmentExtraInfo.OnBasicInsetAlert onBasicInsetAlert) {
        ActionData actionData;
        AnalyticsData analyticsData;
        String str;
        String str2;
        List arrayList;
        Intrinsics.h(onBasicInsetAlert, "<this>");
        FulfilmentExtraInfo.InsetAlertUI insetAlertUI = onBasicInsetAlert.f22493a;
        String str3 = insetAlertUI.f22489a;
        String str4 = insetAlertUI.b;
        int iOrdinal = insetAlertUI.c.ordinal();
        CoreInsetAlertModel coreInsetAlertModel = new CoreInsetAlertModel(str3, str4, iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? CoreAlertStyle.INFO : CoreAlertStyle.SUCCESS : CoreAlertStyle.ERROR : CoreAlertStyle.WARNING : CoreAlertStyle.INFO);
        FulfilmentExtraInfo.InsetAlertAction insetAlertAction = onBasicInsetAlert.b;
        if (insetAlertAction != null) {
            String str5 = insetAlertAction.c;
            int iOrdinal2 = insetAlertAction.b.ordinal();
            ActionType actionType = (iOrdinal2 == 0 || iOrdinal2 != 1) ? ActionType.e : ActionType.d;
            String str6 = insetAlertAction.f22488a;
            FulfilmentExtraInfo.Analytics analytics = insetAlertAction.d;
            if (analytics != null) {
                AnalyticsFields analyticsFields = analytics.b;
                String str7 = analyticsFields.f10032a;
                String str8 = analyticsFields.b;
                String str9 = analyticsFields.c;
                String str10 = analyticsFields.e;
                String str11 = analyticsFields.f;
                String str12 = analyticsFields.g;
                String str13 = analyticsFields.d;
                String str14 = analyticsFields.h;
                String str15 = analyticsFields.i;
                List list = analyticsFields.j;
                if (list != null) {
                    List list2 = list;
                    str = str15;
                    str2 = str12;
                    arrayList = new ArrayList(CollectionsKt.s(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(AnalyticsFieldsExtraContentExtKt.a((AnalyticsFields.ExtraContent) it.next()));
                    }
                } else {
                    str = str15;
                    str2 = str12;
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = EmptyList.d;
                }
                analyticsData = new AnalyticsData((EventConfig) null, str7, str8, str9, str10, str11, str2, str13, str14, str, arrayList, 1, (DefaultConstructorMarker) null);
            } else {
                analyticsData = null;
            }
            actionData = new ActionData(str5, actionType, str6, analyticsData);
        } else {
            actionData = null;
        }
        return new BasicInsetAlertModel(coreInsetAlertModel, actionData, onBasicInsetAlert.c, null);
    }
}
