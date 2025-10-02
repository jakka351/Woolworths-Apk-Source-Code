package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt", f = "LazyLayoutScrollScope.kt", l = {177, 264}, m = "animateScrollToItem")
/* loaded from: classes2.dex */
final class LazyLayoutScrollScopeKt$animateScrollToItem$1 extends ContinuationImpl {
    public int A;
    public LazyLayoutScrollScope p;
    public Ref.BooleanRef q;
    public Ref.ObjectRef r;
    public Ref.IntRef s;
    public int t;
    public int u;
    public int v;
    public float w;
    public float x;
    public float y;
    public /* synthetic */ Object z;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.A |= Integer.MIN_VALUE;
        return LazyLayoutScrollScopeKt.b(null, 0, 0, null, this);
    }
}
