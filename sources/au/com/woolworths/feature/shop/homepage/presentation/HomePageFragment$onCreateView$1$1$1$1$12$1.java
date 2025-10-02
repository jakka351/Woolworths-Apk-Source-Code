package au.com.woolworths.feature.shop.homepage.presentation;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.feature.shop.contentpage.ContentPageViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class HomePageFragment$onCreateView$1$1$1$1$12$1 extends FunctionReferenceImpl implements Function1<AnalyticsData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AnalyticsData p0 = (AnalyticsData) obj;
        Intrinsics.h(p0, "p0");
        ContentPageViewModel contentPageViewModel = (ContentPageViewModel) this.receiver;
        contentPageViewModel.getClass();
        contentPageViewModel.j.g(AnalyticsDataKt.a(AnalyticsDataKt.c(p0, contentPageViewModel.u6(), false)));
        return Unit.f24250a;
    }
}
