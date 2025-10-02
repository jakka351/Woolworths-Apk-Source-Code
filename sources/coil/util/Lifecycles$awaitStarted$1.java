package coil.util;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "coil.util.-Lifecycles", f = "Lifecycles.kt", l = {44}, m = "awaitStarted")
/* renamed from: coil.util.-Lifecycles$awaitStarted$1, reason: invalid class name */
/* loaded from: classes4.dex */
final class Lifecycles$awaitStarted$1 extends ContinuationImpl {
    public Lifecycle p;
    public Ref.ObjectRef q;
    public /* synthetic */ Object r;
    public int s;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return Lifecycles.a(null, this);
    }
}
