package au.com.woolworths.feature.shop.homepage.presentation;

import androidx.activity.result.ActivityResult;
import au.com.woolworths.feature.shop.contentpage.ContentPageViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class HomePageFragment$onCreateView$1$1$1$1$5$1 extends FunctionReferenceImpl implements Function1<ActivityResult, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ActivityResult p0 = (ActivityResult) obj;
        Intrinsics.h(p0, "p0");
        ((ContentPageViewModel) this.receiver).G6(p0);
        return Unit.f24250a;
    }
}
