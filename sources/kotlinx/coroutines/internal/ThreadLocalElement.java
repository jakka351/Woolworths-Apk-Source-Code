package kotlinx.coroutines.internal;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.ThreadContextElement;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/internal/ThreadLocalElement;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/ThreadContextElement;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThreadLocalElement<T> implements ThreadContextElement<T> {
    public final Integer d;
    public final ThreadLocal e;
    public final ThreadLocalKey f;

    public ThreadLocalElement(Integer num, ThreadLocal threadLocal) {
        this.d = num;
        this.e = threadLocal;
        this.f = new ThreadLocalKey(threadLocal);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public final Object R(CoroutineContext coroutineContext) {
        ThreadLocal threadLocal = this.e;
        Object obj = threadLocal.get();
        threadLocal.set(this.d);
        return obj;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        if (this.f.equals(key)) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    /* renamed from: getKey */
    public final CoroutineContext.Key getD() {
        return this.f;
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public final void i(Object obj) {
        this.e.set(obj);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return this.f.equals(key) ? EmptyCoroutineContext.d : this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.c(this, coroutineContext);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.d + ", threadLocal = " + this.e + ')';
    }
}
