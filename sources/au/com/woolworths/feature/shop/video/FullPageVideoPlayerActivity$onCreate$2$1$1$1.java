package au.com.woolworths.feature.shop.video;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class FullPageVideoPlayerActivity$onCreate$2$1$1$1 extends FunctionReferenceImpl implements Function3<Boolean, Long, Long, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((FullPageVideoPlayerViewModel) this.receiver).p6(((Number) obj2).longValue(), ((Number) obj3).longValue(), zBooleanValue);
        return Unit.f24250a;
    }
}
