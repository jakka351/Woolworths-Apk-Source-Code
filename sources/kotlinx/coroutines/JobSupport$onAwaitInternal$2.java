package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class JobSupport$onAwaitInternal$2 extends FunctionReferenceImpl implements Function3<JobSupport, Object, Object, Object> {
    public static final JobSupport$onAwaitInternal$2 d = new JobSupport$onAwaitInternal$2(3, JobSupport.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = JobSupport.d;
        ((JobSupport) obj).getClass();
        if (obj3 instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) obj3).f24689a;
        }
        return obj3;
    }
}
