package au.com.woolworths.feature.shop.contentpage.data;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileCta;
import au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileData;
import au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileIcon;
import au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileIconSlot;
import au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileIconSlotSize;
import au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileStyle;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import com.woolworths.feature.shop.contentpage.fragment.ActionFields;
import com.woolworths.feature.shop.contentpage.fragment.InfoTileFields;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"content-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContentPageMapperUtilKt {
    public static final ActionData a(ActionFields actionData) {
        Intrinsics.h(actionData, "actionData");
        String str = actionData.b;
        ActionType uiModel = au.com.woolworths.product.models.ActionTypeExtKt.toUiModel(actionData.c);
        String str2 = actionData.f19524a;
        ActionFields.Analytics analytics = actionData.d;
        return new ActionData(str, uiModel, str2, analytics != null ? b(analytics.b) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public static final AnalyticsData b(AnalyticsFields analyticsFields) {
        List arrayList;
        Intrinsics.h(analyticsFields, "<this>");
        String str = analyticsFields.f10032a;
        String str2 = analyticsFields.b;
        String str3 = analyticsFields.c;
        String str4 = analyticsFields.e;
        String str5 = analyticsFields.f;
        String str6 = analyticsFields.g;
        String str7 = analyticsFields.d;
        String str8 = analyticsFields.h;
        String str9 = analyticsFields.i;
        List list = analyticsFields.j;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it.next()));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = EmptyList.d;
        }
        return new AnalyticsData((EventConfig) null, str, str2, str3, str4, str5, str6, str7, str8, str9, arrayList, 1, (DefaultConstructorMarker) null);
    }

    public static final InfoTileData c(InfoTileFields infoTileFields) {
        InfoTileIconSlot infoTileIconSlot;
        InfoTileCta infoTileCta;
        InfoTileIcon infoTileBadge;
        InfoTileFields.InfoTileIconSlot infoTileIconSlot2 = infoTileFields.f19770a;
        if (infoTileIconSlot2 != null) {
            InfoTileFields.Icon icon = infoTileIconSlot2.f19774a;
            InfoTileFields.OnHostedIcon onHostedIcon = icon.b;
            if (onHostedIcon != null) {
                infoTileBadge = new InfoTileIcon.HostedIcon(onHostedIcon.b.f19768a);
            } else {
                InfoTileFields.OnInfoTileBadge onInfoTileBadge = icon.c;
                if (onInfoTileBadge == null) {
                    throw new IllegalStateException("Error mapping `Icon`: missing non-null synthetic field!");
                }
                infoTileBadge = new InfoTileIcon.InfoTileBadge(onInfoTileBadge.f19776a);
            }
            int iOrdinal = infoTileIconSlot2.b.ordinal();
            InfoTileIconSlotSize infoTileIconSlotSize = (iOrdinal == 0 || iOrdinal != 1) ? InfoTileIconSlotSize.d : InfoTileIconSlotSize.e;
            InfoTileIconSlot infoTileIconSlot3 = new InfoTileIconSlot(infoTileBadge, infoTileIconSlotSize);
            infoTileCta = null;
            infoTileIconSlot = infoTileIconSlot3;
        } else {
            infoTileIconSlot = null;
            infoTileCta = null;
        }
        String str = infoTileFields.b;
        String str2 = infoTileFields.c;
        InfoTileFields.InfoTileCta infoTileCta2 = infoTileFields.d;
        if (infoTileCta2 != null) {
            infoTileCta = new InfoTileCta(infoTileCta2.f19772a, a(infoTileCta2.b.b));
        }
        int iOrdinal2 = infoTileFields.e.ordinal();
        InfoTileStyle infoTileStyle = (iOrdinal2 == 0 || iOrdinal2 != 1) ? InfoTileStyle.d : InfoTileStyle.e;
        return new InfoTileData(infoTileIconSlot, str, str2, infoTileCta, infoTileStyle);
    }
}
