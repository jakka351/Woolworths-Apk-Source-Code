package au.com.woolworths.feature.shop.recipes.freshmag.home.ui;

import au.com.woolworths.android.onesite.data.HorizontalListDataInterface;
import au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class FreshMagHomeScreenKt$FreshMagHomeScreen$2$1$3$1 extends FunctionReferenceImpl implements Function1<HorizontalListDataInterface, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HorizontalListDataInterface p0 = (HorizontalListDataInterface) obj;
        Intrinsics.h(p0, "p0");
        ((FreshMagHomeViewModel) this.receiver).G0(p0);
        return Unit.f24250a;
    }
}
