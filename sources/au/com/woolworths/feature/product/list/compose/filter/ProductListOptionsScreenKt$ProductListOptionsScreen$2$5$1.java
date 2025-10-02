package au.com.woolworths.feature.product.list.compose.filter;

import au.com.woolworths.feature.product.list.ProductListOptionsViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ProductListOptionsScreenKt$ProductListOptionsScreen$2$5$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p0 = (String) obj;
        Intrinsics.h(p0, "p0");
        ((ProductListOptionsViewModel) this.receiver).p(p0);
        return Unit.f24250a;
    }
}
