package au.com.woolworths.feature.shop.contentpage;

import au.com.woolworths.android.onesite.navigation.Activities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ContentPageFragment$onCreateView$1$1$1$6$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ContentPageFragment contentPageFragment = (ContentPageFragment) this.receiver;
        contentPageFragment.getClass();
        contentPageFragment.startActivity(Activities.Search.f4526a.b(new Activities.Search.Extras.Generic(null)));
        return Unit.f24250a;
    }
}
