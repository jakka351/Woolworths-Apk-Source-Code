package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.sdui.model.action.ActionData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class MerchCardEpoxyModel$wrappedModel$1$3$1 extends FunctionReferenceImpl implements Function1<ActionData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ActionData p0 = (ActionData) obj;
        Intrinsics.h(p0, "p0");
        ((ProductListViewModel) this.receiver).L6(p0);
        return Unit.f24250a;
    }
}
