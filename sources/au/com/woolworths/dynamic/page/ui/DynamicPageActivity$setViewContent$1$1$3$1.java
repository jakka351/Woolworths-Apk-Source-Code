package au.com.woolworths.dynamic.page.ui;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.dynamic.page.ui.DynamicPageContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class DynamicPageActivity$setViewContent$1$1$3$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DynamicPageViewModel dynamicPageViewModel = (DynamicPageViewModel) this.receiver;
        dynamicPageViewModel.k.f(DynamicPageContract.Actions.ShowCartScreen.f5193a);
        dynamicPageViewModel.h.g((Event) dynamicPageViewModel.q6().g.b.getD());
        return Unit.f24250a;
    }
}
