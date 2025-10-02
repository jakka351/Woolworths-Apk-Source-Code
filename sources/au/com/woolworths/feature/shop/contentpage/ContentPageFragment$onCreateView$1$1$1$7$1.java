package au.com.woolworths.feature.shop.contentpage;

import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ContentPageFragment$onCreateView$1$1$1$7$1 extends FunctionReferenceImpl implements Function1<Set<? extends Integer>, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Set p0 = (Set) obj;
        Intrinsics.h(p0, "p0");
        ((ContentPageViewModel) this.receiver).D6(p0);
        return Unit.f24250a;
    }
}
