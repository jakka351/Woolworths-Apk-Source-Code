package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/paging/GenerationalViewportHint;", "Key", "", "Value", "previous", "next"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", f = "PageFetcherSnapshot.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PageFetcherSnapshot$collectAsGenerationalViewportHints$3 extends SuspendLambda implements Function3<GenerationalViewportHint, GenerationalViewportHint, Continuation<? super GenerationalViewportHint>, Object> {
    public /* synthetic */ GenerationalViewportHint p;
    public /* synthetic */ GenerationalViewportHint q;
    public final /* synthetic */ LoadType r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$collectAsGenerationalViewportHints$3(LoadType loadType, Continuation continuation) {
        super(3, continuation);
        this.r = loadType;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PageFetcherSnapshot$collectAsGenerationalViewportHints$3 pageFetcherSnapshot$collectAsGenerationalViewportHints$3 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$3(this.r, (Continuation) obj3);
        pageFetcherSnapshot$collectAsGenerationalViewportHints$3.p = (GenerationalViewportHint) obj;
        pageFetcherSnapshot$collectAsGenerationalViewportHints$3.q = (GenerationalViewportHint) obj2;
        return pageFetcherSnapshot$collectAsGenerationalViewportHints$3.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        GenerationalViewportHint previous = this.p;
        GenerationalViewportHint generationalViewportHint = this.q;
        Intrinsics.h(generationalViewportHint, "<this>");
        Intrinsics.h(previous, "previous");
        int i = generationalViewportHint.f3537a;
        int i2 = previous.f3537a;
        return i > i2 ? true : i < i2 ? false : HintHandlerKt.a(generationalViewportHint.b, previous.b, this.r) ? generationalViewportHint : previous;
    }
}
