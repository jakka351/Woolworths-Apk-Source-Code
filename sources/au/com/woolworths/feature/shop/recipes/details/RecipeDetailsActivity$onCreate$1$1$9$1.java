package au.com.woolworths.feature.shop.recipes.details;

import au.com.woolworths.android.onesite.data.HorizontalListDataInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class RecipeDetailsActivity$onCreate$1$1$9$1 extends FunctionReferenceImpl implements Function1<HorizontalListDataInterface, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HorizontalListDataInterface p0 = (HorizontalListDataInterface) obj;
        Intrinsics.h(p0, "p0");
        ((RecipeDetailsViewModel) this.receiver).G0(p0);
        return Unit.f24250a;
    }
}
