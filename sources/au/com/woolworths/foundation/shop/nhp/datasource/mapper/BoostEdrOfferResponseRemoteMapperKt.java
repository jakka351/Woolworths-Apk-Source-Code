package au.com.woolworths.foundation.shop.nhp.datasource.mapper;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsExtraContent;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.graphql.type.RtlBoostState;
import au.com.woolworths.shop.graphql.type.RtlOfferStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"nhp-datasource_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BoostEdrOfferResponseRemoteMapperKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[RtlBoostState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RtlBoostState.Companion companion = RtlBoostState.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[RtlOfferStatus.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                RtlOfferStatus.Companion companion2 = RtlOfferStatus.e;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                RtlOfferStatus.Companion companion3 = RtlOfferStatus.e;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final AnalyticsData a(AnalyticsFields analyticsFields) {
        ArrayList arrayList;
        String str = analyticsFields.f10032a;
        String str2 = analyticsFields.b;
        String str3 = analyticsFields.c;
        String str4 = analyticsFields.d;
        String str5 = analyticsFields.e;
        String str6 = analyticsFields.f;
        String str7 = analyticsFields.g;
        String str8 = analyticsFields.h;
        String str9 = analyticsFields.i;
        List list = analyticsFields.j;
        if (list != null) {
            List<AnalyticsFields.ExtraContent> list2 = list;
            arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            for (AnalyticsFields.ExtraContent extraContent : list2) {
                arrayList.add(new AnalyticsExtraContent(extraContent.f10033a, extraContent.b, extraContent.c));
            }
        } else {
            arrayList = null;
        }
        return new AnalyticsData((EventConfig) null, str, str2, str3, str5, str6, str7, str4, str8, str9, arrayList, 1, (DefaultConstructorMarker) null);
    }
}
