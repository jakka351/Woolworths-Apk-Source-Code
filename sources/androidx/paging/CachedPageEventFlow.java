package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/paging/CachedPageEventFlow;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CachedPageEventFlow<T> {

    /* renamed from: a, reason: collision with root package name */
    public final FlattenedPageController f3528a;
    public final SharedFlowImpl b;
    public final SharedFlow c;
    public final Job d;
    public final Flow e;

    public CachedPageEventFlow(Flow src, CoroutineScope scope) {
        Intrinsics.h(src, "src");
        Intrinsics.h(scope, "scope");
        this.f3528a = new FlattenedPageController();
        SharedFlowImpl sharedFlowImplA = SharedFlowKt.a(1, Integer.MAX_VALUE, BufferOverflow.d);
        this.b = sharedFlowImplA;
        this.c = FlowKt.H(sharedFlowImplA, new CachedPageEventFlow$sharedForDownstream$1(this, null));
        Job jobC = BuildersKt.c(scope, null, CoroutineStart.e, new CachedPageEventFlow$job$1(src, this, null), 1);
        ((JobSupport) jobC).invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.paging.CachedPageEventFlow$job$2$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                this.h.b.f(null);
                return Unit.f24250a;
            }
        });
        this.d = jobC;
        this.e = FlowKt.B(new CachedPageEventFlow$downstreamFlow$1(this, null));
    }
}
