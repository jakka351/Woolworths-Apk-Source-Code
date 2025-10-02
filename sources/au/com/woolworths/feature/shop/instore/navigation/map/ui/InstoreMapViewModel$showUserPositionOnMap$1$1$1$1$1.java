package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientAppEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class InstoreMapViewModel$showUserPositionOnMap$1$1$1$1$1 extends FunctionReferenceImpl implements Function1<OriientAppEvent, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        OriientAppEvent p0 = (OriientAppEvent) obj;
        Intrinsics.h(p0, "p0");
        InstoreMapViewModel instoreMapViewModel = (InstoreMapViewModel) this.receiver;
        instoreMapViewModel.getClass();
        instoreMapViewModel.n.a(p0);
        return Unit.f24250a;
    }
}
