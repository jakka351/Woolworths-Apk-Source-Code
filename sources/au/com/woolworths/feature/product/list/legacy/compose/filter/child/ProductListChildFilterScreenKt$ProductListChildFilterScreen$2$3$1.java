package au.com.woolworths.feature.product.list.legacy.compose.filter.child;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ProductListChildFilterScreenKt$ProductListChildFilterScreen$2$3$1 extends FunctionReferenceImpl implements Function1<InsetBanner, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InsetBanner p0 = (InsetBanner) obj;
        Intrinsics.h(p0, "p0");
        ((ProductListOptionsViewModel) this.receiver).onActionClicked(p0);
        return Unit.f24250a;
    }
}
