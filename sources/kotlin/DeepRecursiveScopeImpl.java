package kotlin;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/DeepRecursiveScopeImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "Lkotlin/DeepRecursiveScope;", "Lkotlin/coroutines/Continuation;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DeepRecursiveScopeImpl<T, R> extends DeepRecursiveScope<T, R> implements Continuation<R> {
    public Function3 d;
    public Unit e;
    public Continuation f;
    public Object g;

    @Override // kotlin.DeepRecursiveScope
    public final void a(Continuation continuation) {
        this.f = continuation;
        this.e = Unit.f24250a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final CoroutineContext getD() {
        return EmptyCoroutineContext.d;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.f = null;
        this.g = obj;
    }
}
