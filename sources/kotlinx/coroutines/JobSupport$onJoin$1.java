package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.JobSupport.SelectOnJoinCompletionHandler;
import kotlinx.coroutines.selects.SelectInstance;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class JobSupport$onJoin$1 extends FunctionReferenceImpl implements Function3<JobSupport, SelectInstance<?>, Object, Unit> {
    public static final JobSupport$onJoin$1 d = new JobSupport$onJoin$1(3, JobSupport.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        Unit unit;
        JobSupport jobSupport = (JobSupport) obj;
        SelectInstance selectInstance = (SelectInstance) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = JobSupport.d;
        jobSupport.getClass();
        do {
            obj4 = JobSupport.d.get(jobSupport);
            boolean z = obj4 instanceof Incomplete;
            unit = Unit.f24250a;
            if (!z) {
                selectInstance.c(unit);
                return unit;
            }
        } while (jobSupport.i0(obj4) < 0);
        selectInstance.d(JobKt.g(jobSupport, jobSupport.new SelectOnJoinCompletionHandler(selectInstance)));
        return unit;
    }
}
