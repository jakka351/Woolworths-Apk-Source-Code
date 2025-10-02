package androidx.lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lifecycle-livedata_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
/* loaded from: classes2.dex */
public final class FlowLiveDataConversions {
    public static final Flow a(LiveData liveData) {
        Intrinsics.h(liveData, "<this>");
        return FlowKt.c(FlowKt.d(new FlowLiveDataConversions$asFlow$1(liveData, null)), -1);
    }

    public static CoroutineLiveData b(Flow flow, CoroutineContext context, int i) {
        if ((i & 1) != 0) {
            context = EmptyCoroutineContext.d;
        }
        Intrinsics.h(context, "context");
        FlowLiveDataConversions$asLiveData$1 flowLiveDataConversions$asLiveData$1 = new FlowLiveDataConversions$asLiveData$1(flow, null);
        CoroutineLiveData coroutineLiveData = new CoroutineLiveData();
        CompletableJob completableJobA = SupervisorKt.a((Job) context.get(Job.Key.d));
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        MainCoroutineDispatcher mainCoroutineDispatcherT = MainDispatcherLoader.f24726a.T();
        mainCoroutineDispatcherT.getClass();
        coroutineLiveData.m = new BlockRunner(coroutineLiveData, flowLiveDataConversions$asLiveData$1, CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c(mainCoroutineDispatcherT, context).plus(completableJobA)), new a(coroutineLiveData, 0));
        if (flow instanceof StateFlow) {
            if (ArchTaskExecutor.d().f199a.b()) {
                coroutineLiveData.m(((StateFlow) flow).getValue());
                return coroutineLiveData;
            }
            coroutineLiveData.j(((StateFlow) flow).getValue());
        }
        return coroutineLiveData;
    }
}
