package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.ExceptionsKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class Recomposer$broadcastFrameClock$1 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ Recomposer h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$broadcastFrameClock$1(Recomposer recomposer) {
        super(0);
        this.h = recomposer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CancellableContinuation cancellableContinuationZ;
        Recomposer recomposer = this.h;
        synchronized (recomposer.b) {
            cancellableContinuationZ = recomposer.z();
            if (((Recomposer.State) recomposer.u.getValue()).compareTo(Recomposer.State.e) <= 0) {
                throw ExceptionsKt.a("Recomposer shutdown; frame clock awaiter will never resume", recomposer.d);
            }
        }
        if (cancellableContinuationZ != null) {
            ((CancellableContinuationImpl) cancellableContinuationZ).resumeWith(Unit.f24250a);
        }
        return Unit.f24250a;
    }
}
