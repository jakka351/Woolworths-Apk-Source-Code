package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class InstoreMapScreenKt$MapProductCardInteractionHolder$2$1 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((InstoreMapCallbacks) this.receiver).i(((Number) obj).intValue());
        return Unit.f24250a;
    }
}
