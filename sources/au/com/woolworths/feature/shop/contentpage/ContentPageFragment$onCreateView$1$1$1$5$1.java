package au.com.woolworths.feature.shop.contentpage;

import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ContentPageFragment$onCreateView$1$1$1$5$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ContentPageFragment contentPageFragment = (ContentPageFragment) this.receiver;
        contentPageFragment.getClass();
        contentPageFragment.startActivity(ActivityNavigatorKt.a(Activities.Cart.f4454a, ApplicationType.e));
        return Unit.f24250a;
    }
}
