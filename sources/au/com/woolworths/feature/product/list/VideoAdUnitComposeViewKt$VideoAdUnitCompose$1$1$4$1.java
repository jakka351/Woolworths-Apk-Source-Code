package au.com.woolworths.feature.product.list;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class VideoAdUnitComposeViewKt$VideoAdUnitCompose$1$1$4$1 extends AdaptedFunctionReference implements Function1<AnalyticsData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AnalyticsData p0 = (AnalyticsData) obj;
        Intrinsics.h(p0, "p0");
        ((ProductListViewModel) this.d).h.g(AnalyticsDataKt.a(p0));
        return Unit.f24250a;
    }
}
