package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class InstoreMapScreenKt$InstoreMapScreen$2$2$2$1$1 extends FunctionReferenceImpl implements Function1<InstoreMapErrorState, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InstoreMapErrorState p0 = (InstoreMapErrorState) obj;
        Intrinsics.h(p0, "p0");
        ((InstoreMapCallbacks) this.receiver).k(p0);
        return Unit.f24250a;
    }
}
