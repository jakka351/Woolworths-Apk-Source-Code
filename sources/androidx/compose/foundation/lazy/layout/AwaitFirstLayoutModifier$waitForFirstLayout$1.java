package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier", f = "AwaitFirstLayoutModifier.kt", l = {49}, m = "waitForFirstLayout")
/* loaded from: classes2.dex */
final class AwaitFirstLayoutModifier$waitForFirstLayout$1 extends ContinuationImpl {
    public CancellableContinuationImpl p;
    public /* synthetic */ Object q;
    public final /* synthetic */ AwaitFirstLayoutModifier r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwaitFirstLayoutModifier$waitForFirstLayout$1(AwaitFirstLayoutModifier awaitFirstLayoutModifier, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = awaitFirstLayoutModifier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(this);
    }
}
