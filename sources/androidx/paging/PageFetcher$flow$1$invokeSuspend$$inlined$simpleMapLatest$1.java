package androidx.paging;

import androidx.paging.PageFetcher;
import androidx.paging.PagingData;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¨\u0006\u0006"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "androidx/paging/FlowExtKt$simpleMapLatest$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1", f = "PageFetcher.kt", l = {105}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super PagingData<Object>>, PageFetcher.GenerationInfo<Object, Object>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ FlowCollector q;
    public /* synthetic */ Object r;
    public final /* synthetic */ PageFetcher s;
    public final /* synthetic */ RemoteMediatorAccessor t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(PageFetcher pageFetcher, RemoteMediatorAccessor remoteMediatorAccessor, Continuation continuation) {
        super(3, continuation);
        this.s = pageFetcher;
        this.t = remoteMediatorAccessor;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 = new PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(this.s, this.t, (Continuation) obj3);
        pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.q = (FlowCollector) obj;
        pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.r = obj2;
        return pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = this.q;
            PageFetcher.GenerationInfo generationInfo = (PageFetcher.GenerationInfo) this.r;
            PageFetcherSnapshot pageFetcherSnapshot = generationInfo.f3556a;
            JobImpl jobImpl = generationInfo.c;
            RemoteMediatorAccessor remoteMediatorAccessor = this.t;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new PageFetcher$flow$1$3$downstreamFlow$1(2, null), remoteMediatorAccessor == null ? pageFetcherSnapshot.m : SimpleChannelFlowKt.a(new CancelableChannelFlowKt$cancelableChannelFlow$1(jobImpl, new PageFetcher$injectRemoteEvents$1(remoteMediatorAccessor, pageFetcherSnapshot, new MutableLoadStateCollection(), null), null)));
            PageFetcher pageFetcher = this.s;
            PagingData pagingData = new PagingData(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, new PageFetcher.PagerUiReceiver(pageFetcher, pageFetcher.d), new PageFetcher.PagerHintReceiver(generationInfo.f3556a), PagingData.AnonymousClass1.h);
            this.p = 1;
            if (flowCollector.emit(pagingData, this) == coroutineSingletons) {
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
