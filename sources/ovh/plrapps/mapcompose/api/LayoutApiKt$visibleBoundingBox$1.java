package ovh.plrapps.mapcompose.api;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.MutexImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.api.LayoutApiKt", f = "LayoutApi.kt", l = {457}, m = "visibleBoundingBox")
/* loaded from: classes8.dex */
final class LayoutApiKt$visibleBoundingBox$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public int q;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        int i = this.q | Integer.MIN_VALUE;
        this.q = i;
        MutexImpl mutexImpl = LayoutApiKt.f26931a;
        int i2 = i - Integer.MIN_VALUE;
        this.q = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        if (i2 == 0) {
            ResultKt.b(obj);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        throw null;
    }
}
