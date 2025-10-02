package coil3.util;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.util.LifecyclesKt", f = "lifecycles.kt", l = {42}, m = "awaitStarted")
/* loaded from: classes4.dex */
final class LifecyclesKt$awaitStarted$1 extends ContinuationImpl {
    public Lifecycle p;
    public Ref.ObjectRef q;
    public /* synthetic */ Object r;
    public int s;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return LifecyclesKt.a(null, this);
    }
}
