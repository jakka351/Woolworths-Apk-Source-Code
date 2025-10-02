package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class SequencesKt___SequencesKt$flatMapIndexed$2 extends FunctionReferenceImpl implements Function1<Sequence<Object>, Iterator<Object>> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Sequence p0 = (Sequence) obj;
        Intrinsics.h(p0, "p0");
        return p0.iterator();
    }
}
