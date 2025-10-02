package androidx.paging;

import androidx.paging.PageFetcher$flow$1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1", f = "PageFetcherSnapshot.kt", l = {220}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class PageFetcherSnapshot$startConsumingHints$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ PageFetcherSnapshot q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$startConsumingHints$1(PageFetcherSnapshot pageFetcherSnapshot, Continuation continuation) {
        super(2, continuation);
        this.q = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PageFetcherSnapshot$startConsumingHints$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PageFetcherSnapshot$startConsumingHints$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        PageFetcherSnapshot pageFetcherSnapshot = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            ChannelLimitedFlowMerge channelLimitedFlowMergeG = FlowKt.G(pageFetcherSnapshot.h.a(LoadType.f), pageFetcherSnapshot.h.a(LoadType.e));
            PageFetcherSnapshot$startConsumingHints$1$jumpHint$1 pageFetcherSnapshot$startConsumingHints$1$jumpHint$1 = new PageFetcherSnapshot$startConsumingHints$1$jumpHint$1(pageFetcherSnapshot, null);
            this.p = 1;
            obj = FlowKt.z(channelLimitedFlowMergeG, pageFetcherSnapshot$startConsumingHints$1$jumpHint$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ViewportHint viewportHint = (ViewportHint) obj;
        if (viewportHint != null) {
            if (PagingLogger.a(3)) {
                PagingLogger.b(3, "Jump triggered on PagingSource " + pageFetcherSnapshot.b + " by " + viewportHint);
            }
            ((PageFetcher$flow$1.AnonymousClass2.AnonymousClass1) pageFetcherSnapshot.g).invoke();
        }
        return Unit.f24250a;
    }
}
