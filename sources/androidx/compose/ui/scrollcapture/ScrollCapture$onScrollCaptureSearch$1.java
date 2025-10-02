package androidx.compose.ui.scrollcapture;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class ScrollCapture$onScrollCaptureSearch$1 extends AdaptedFunctionReference implements Function1<ScrollCaptureCandidate, Unit> {
    public ScrollCapture$onScrollCaptureSearch$1(MutableVector mutableVector) {
        super(1, mutableVector, MutableVector.class, "add", "add(Ljava/lang/Object;)Z", 8);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((MutableVector) this.d).c((ScrollCaptureCandidate) obj);
        return Unit.f24250a;
    }
}
