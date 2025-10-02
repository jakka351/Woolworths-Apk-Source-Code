package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.JobSupport.SelectOnAwaitCompletionHandler;
import kotlinx.coroutines.selects.SelectInstance;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class JobSupport$onAwaitInternal$1 extends FunctionReferenceImpl implements Function3<JobSupport, SelectInstance<?>, Object, Unit> {
    public static final JobSupport$onAwaitInternal$1 d = new JobSupport$onAwaitInternal$1(3, JobSupport.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        JobSupport jobSupport = (JobSupport) obj;
        SelectInstance selectInstance = (SelectInstance) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = JobSupport.d;
        jobSupport.getClass();
        while (true) {
            Object objA = JobSupport.d.get(jobSupport);
            if (!(objA instanceof Incomplete)) {
                if (!(objA instanceof CompletedExceptionally)) {
                    objA = JobSupportKt.a(objA);
                }
                selectInstance.c(objA);
            } else if (jobSupport.i0(objA) >= 0) {
                selectInstance.d(JobKt.g(jobSupport, jobSupport.new SelectOnAwaitCompletionHandler(selectInstance)));
                break;
            }
        }
        return Unit.f24250a;
    }
}
