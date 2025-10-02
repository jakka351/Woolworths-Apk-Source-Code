package au.com.woolworths.dynamic.page.ui;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.dynamic.page.data.BottomSheetType;
import au.com.woolworths.dynamic.page.data.DynamicPageFeedData;
import au.com.woolworths.dynamic.page.ui.DynamicPageContract;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class DynamicPageActivity$setViewContent$1$1$1$1 extends FunctionReferenceImpl implements Function2<String, AnalyticsData, Unit> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String p0 = (String) obj;
        AnalyticsData analyticsData = (AnalyticsData) obj2;
        Intrinsics.h(p0, "p0");
        DynamicPageViewModel dynamicPageViewModel = (DynamicPageViewModel) this.receiver;
        SharedFlowImpl sharedFlowImpl = dynamicPageViewModel.k;
        if (p0.equals("login")) {
            sharedFlowImpl.f(DynamicPageContract.Actions.LaunchLogin.f5192a);
        } else if (StringsKt.W(p0, "openbottomsheet/", false)) {
            String strL = StringsKt.L("openbottomsheet/", p0);
            DynamicPageFeedData dynamicPageFeedData = ((DynamicPageContract.ViewState) dynamicPageViewModel.m.getValue()).c;
            BottomSheetType bottomSheetType = null;
            if (dynamicPageFeedData != null) {
                Iterator it = dynamicPageFeedData.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (Intrinsics.c(((BottomSheetType) next).getF5184a(), strL)) {
                        bottomSheetType = next;
                        break;
                    }
                }
                bottomSheetType = bottomSheetType;
            }
            DynamicPageViewModel.r6(dynamicPageViewModel, dynamicPageViewModel.j, false, null, null, null, bottomSheetType, 15);
        } else {
            sharedFlowImpl.f(new DynamicPageContract.Actions.LaunchDeepLink(p0));
        }
        if (analyticsData != null) {
            dynamicPageViewModel.h.g(AnalyticsDataKt.b((Event) dynamicPageViewModel.q6().g.d.getD(), analyticsData));
        }
        return Unit.f24250a;
    }
}
