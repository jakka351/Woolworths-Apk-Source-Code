package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ThreadContextElement;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/internal/ThreadState;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ThreadState {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f24734a;
    public final Object[] b;
    public final ThreadContextElement[] c;
    public int d;

    public ThreadState(int i, CoroutineContext coroutineContext) {
        this.f24734a = coroutineContext;
        this.b = new Object[i];
        this.c = new ThreadContextElement[i];
    }

    public final void a(ThreadContextElement threadContextElement, Object obj) {
        int i = this.d;
        this.b[i] = obj;
        this.d = i + 1;
        Intrinsics.f(threadContextElement, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        this.c[i] = threadContextElement;
    }

    public final void b(CoroutineContext coroutineContext) {
        ThreadContextElement[] threadContextElementArr = this.c;
        int length = threadContextElementArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            ThreadContextElement threadContextElement = threadContextElementArr[length];
            Intrinsics.e(threadContextElement);
            threadContextElement.i(this.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
