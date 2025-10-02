package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value", "it", "Landroidx/paging/PageEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcher$flow$1$3$downstreamFlow$1", f = "PageFetcher.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class PageFetcher$flow$1$3$downstreamFlow$1 extends SuspendLambda implements Function2<PageEvent<Object>, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PageFetcher$flow$1$3$downstreamFlow$1 pageFetcher$flow$1$3$downstreamFlow$1 = new PageFetcher$flow$1$3$downstreamFlow$1(2, continuation);
        pageFetcher$flow$1$3$downstreamFlow$1.p = obj;
        return pageFetcher$flow$1$3$downstreamFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        PageFetcher$flow$1$3$downstreamFlow$1 pageFetcher$flow$1$3$downstreamFlow$1 = (PageFetcher$flow$1$3$downstreamFlow$1) create((PageEvent) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        pageFetcher$flow$1$3$downstreamFlow$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        PageEvent pageEvent = (PageEvent) this.p;
        if (PagingLogger.a(2)) {
            PagingLogger.b(2, "Sent " + pageEvent);
        }
        return Unit.f24250a;
    }
}
