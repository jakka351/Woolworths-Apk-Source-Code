package au.com.woolworths.dynamic.page.ui;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.dynamic.page.data.DynamicPageFeedData;
import au.com.woolworths.dynamic.page.ui.DynamicPageContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class DynamicPageActivity$setViewContent$1$1$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        DynamicPageViewModel dynamicPageViewModel = (DynamicPageViewModel) this.receiver;
        DynamicPageFeedData dynamicPageFeedData = ((DynamicPageContract.ViewState) dynamicPageViewModel.j.getValue()).c;
        if (dynamicPageFeedData != null && (str = dynamicPageFeedData.f5185a.d) != null) {
            dynamicPageViewModel.k.f(new DynamicPageContract.Actions.ShowShareSheet(str));
            dynamicPageViewModel.h.g((Event) dynamicPageViewModel.q6().g.c.getD());
        }
        return Unit.f24250a;
    }
}
