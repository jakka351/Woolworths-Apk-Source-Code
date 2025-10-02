package kotlinx.coroutines.debug.internal;

import _COROUTINE.CoroutineDebuggingKt;
import com.google.android.gms.ads.RequestConfiguration;
import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0006R\u000b\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004R\u000b\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl;", "", "Lkotlinx/atomicfu/AtomicInt;", "installations", "Lkotlinx/atomicfu/AtomicLong;", "sequenceNumber", "CoroutineOwner", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DebugProbesImpl {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentWeakMap f24704a;
    public static final Function1 b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CoroutineOwner<T> implements Continuation<T>, CoroutineStackFrame {
        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public final CoroutineStackFrame getCallerFrame() {
            throw null;
        }

        @Override // kotlin.coroutines.Continuation
        /* renamed from: getContext */
        public final CoroutineContext getE() {
            throw null;
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(Object obj) {
            ConcurrentWeakMap concurrentWeakMap = DebugProbesImpl.f24704a;
            DebugProbesImpl.f24704a.remove(this);
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    static {
        Object objA;
        CoroutineDebuggingKt.a(new Exception(), "_CREATION");
        new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        f24704a = new ConcurrentWeakMap(false);
        new AtomicInteger(0);
        new AtomicLong(0L);
        try {
            Object objNewInstance = Class.forName("kotlinx.coroutines.debug.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(null);
            Intrinsics.f(objNewInstance, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            TypeIntrinsics.d(1, objNewInstance);
            objA = (Function1) objNewInstance;
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        b = (Function1) (objA instanceof Result.Failure ? null : objA);
        new ConcurrentWeakMap(true);
    }
}
