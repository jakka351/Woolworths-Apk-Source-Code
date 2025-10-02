package androidx.compose.ui;

import androidx.compose.ui.SessionMutex;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

@Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "R", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", l = {61, 63}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SessionMutex$withSessionCancellingPrevious$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ Lambda r;
    public final /* synthetic */ AtomicReference s;
    public final /* synthetic */ Function2 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SessionMutex$withSessionCancellingPrevious$2(Function1 function1, AtomicReference atomicReference, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.r = (Lambda) function1;
        this.s = atomicReference;
        this.t = function2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SessionMutex$withSessionCancellingPrevious$2 sessionMutex$withSessionCancellingPrevious$2 = new SessionMutex$withSessionCancellingPrevious$2(this.r, this.s, this.t, continuation);
        sessionMutex$withSessionCancellingPrevious$2.q = obj;
        return sessionMutex$withSessionCancellingPrevious$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SessionMutex$withSessionCancellingPrevious$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SessionMutex.Session session;
        SessionMutex.Session session2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        AtomicReference atomicReference = this.s;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.q;
                session = new SessionMutex.Session(JobKt.f(coroutineScope.getE()), this.r.invoke(coroutineScope));
                SessionMutex.Session session3 = (SessionMutex.Session) atomicReference.getAndSet(session);
                if (session3 != null) {
                    Job job = session3.f1726a;
                    this.q = session;
                    this.p = 1;
                    if (JobKt.c(job, this) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    session2 = (SessionMutex.Session) this.q;
                    try {
                        ResultKt.b(obj);
                        while (!atomicReference.compareAndSet(session2, null) && atomicReference.get() == session2) {
                        }
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        while (!atomicReference.compareAndSet(session2, null)) {
                        }
                        throw th;
                    }
                }
                session = (SessionMutex.Session) this.q;
                ResultKt.b(obj);
            }
            Function2 function2 = this.t;
            Object obj2 = session.b;
            this.q = session;
            this.p = 2;
            obj = function2.invoke(obj2, this);
            if (obj != coroutineSingletons) {
                session2 = session;
                while (!atomicReference.compareAndSet(session2, null)) {
                }
                return obj;
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            session2 = session;
            while (!atomicReference.compareAndSet(session2, null) && atomicReference.get() == session2) {
            }
            throw th;
        }
    }
}
