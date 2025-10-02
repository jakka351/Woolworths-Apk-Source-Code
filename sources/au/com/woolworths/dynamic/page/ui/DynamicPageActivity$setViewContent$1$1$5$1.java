package au.com.woolworths.dynamic.page.ui;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.dynamic.page.data.BottomSheetType;
import au.com.woolworths.dynamic.page.ui.DynamicPageContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class DynamicPageActivity$setViewContent$1$1$5$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AnalyticsData c;
        DynamicPageViewModel dynamicPageViewModel = (DynamicPageViewModel) this.receiver;
        BottomSheetType bottomSheetType = ((DynamicPageContract.ViewState) dynamicPageViewModel.j.getValue()).e;
        if (bottomSheetType != null && (c = bottomSheetType.getC()) != null) {
            dynamicPageViewModel.h.g(AnalyticsDataKt.b((Event) dynamicPageViewModel.q6().g.e.getD(), c));
        }
        return Unit.f24250a;
    }
}
