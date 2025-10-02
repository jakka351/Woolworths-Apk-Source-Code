package androidx.paging;

import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00060\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Landroidx/paging/SimpleProducerScope;", "Landroidx/paging/PageEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcher$injectRemoteEvents$1", f = "PageFetcher.kt", l = {DatastoreTestTrace.FirestoreV1Action.MATCHING_DOCUMENTS_FIELD_NUMBER}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class PageFetcher$injectRemoteEvents$1 extends SuspendLambda implements Function2<SimpleProducerScope<PageEvent<Object>>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ RemoteMediatorAccessor r;
    public final /* synthetic */ PageFetcherSnapshot s;
    public final /* synthetic */ MutableLoadStateCollection t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$injectRemoteEvents$1(RemoteMediatorAccessor remoteMediatorAccessor, PageFetcherSnapshot pageFetcherSnapshot, MutableLoadStateCollection mutableLoadStateCollection, Continuation continuation) {
        super(2, continuation);
        this.r = remoteMediatorAccessor;
        this.s = pageFetcherSnapshot;
        this.t = mutableLoadStateCollection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PageFetcher$injectRemoteEvents$1 pageFetcher$injectRemoteEvents$1 = new PageFetcher$injectRemoteEvents$1(this.r, this.s, this.t, continuation);
        pageFetcher$injectRemoteEvents$1.q = obj;
        return pageFetcher$injectRemoteEvents$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PageFetcher$injectRemoteEvents$1) create((SimpleProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.q;
            Flow flowA = SimpleChannelFlowKt.a(new PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1(this.r.getState(), this.s.m, null, this.t));
            FlowCollector flowCollector = new FlowCollector() { // from class: androidx.paging.PageFetcher$injectRemoteEvents$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    Object objZ = simpleProducerScope.z((PageEvent) obj2, continuation);
                    return objZ == CoroutineSingletons.d ? objZ : Unit.f24250a;
                }
            };
            this.p = 1;
            if (flowA.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
