package coil3.intercept;

import coil3.EventListener;
import coil3.intercept.EngineInterceptor;
import coil3.request.ImageRequest;
import coil3.request.Options;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.intercept.EngineInterceptorKt", f = "EngineInterceptor.kt", l = {52}, m = "transform")
/* loaded from: classes.dex */
final class EngineInterceptorKt$transform$1 extends ContinuationImpl {
    public EngineInterceptor.ExecuteResult p;
    public ImageRequest q;
    public Options r;
    public EventListener s;
    public List t;
    public int u;
    public int v;
    public /* synthetic */ Object w;
    public int x;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.x |= Integer.MIN_VALUE;
        return EngineInterceptorKt.a(null, null, null, null, this);
    }
}
