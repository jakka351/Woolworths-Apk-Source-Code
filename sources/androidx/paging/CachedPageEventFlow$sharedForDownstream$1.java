package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0006\u0018\u00010\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/collections/IndexedValue;", "Landroidx/paging/PageEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.CachedPageEventFlow$sharedForDownstream$1", f = "CachedPageEventFlow.kt", l = {62, 67}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class CachedPageEventFlow$sharedForDownstream$1 extends SuspendLambda implements Function2<FlowCollector<? super IndexedValue<? extends PageEvent<Object>>>, Continuation<? super Unit>, Object> {
    public Iterator p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ CachedPageEventFlow s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$sharedForDownstream$1(CachedPageEventFlow cachedPageEventFlow, Continuation continuation) {
        super(2, continuation);
        this.s = cachedPageEventFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CachedPageEventFlow$sharedForDownstream$1 cachedPageEventFlow$sharedForDownstream$1 = new CachedPageEventFlow$sharedForDownstream$1(this.s, continuation);
        cachedPageEventFlow$sharedForDownstream$1.r = obj;
        return cachedPageEventFlow$sharedForDownstream$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CachedPageEventFlow$sharedForDownstream$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r6 == r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r5.q
            androidx.paging.CachedPageEventFlow r2 = r5.s
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L28
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            java.util.Iterator r1 = r5.p
            java.lang.Object r2 = r5.r
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            kotlin.ResultKt.b(r6)
            goto L4e
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L20:
            java.lang.Object r1 = r5.r
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.b(r6)
            goto L3d
        L28:
            kotlin.ResultKt.b(r6)
            java.lang.Object r6 = r5.r
            r1 = r6
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            androidx.paging.FlattenedPageController r6 = r2.f3528a
            r5.r = r1
            r5.q = r4
            java.io.Serializable r6 = r6.a(r5)
            if (r6 != r0) goto L3d
            goto L66
        L3d:
            java.util.List r6 = (java.util.List) r6
            kotlinx.coroutines.Job r2 = r2.d
            kotlinx.coroutines.JobSupport r2 = (kotlinx.coroutines.JobSupport) r2
            r2.start()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r2 = r1
            r1 = r6
        L4e:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L67
            java.lang.Object r6 = r1.next()
            kotlin.collections.IndexedValue r6 = (kotlin.collections.IndexedValue) r6
            r5.r = r2
            r5.p = r1
            r5.q = r3
            java.lang.Object r6 = r2.emit(r6, r5)
            if (r6 != r0) goto L4e
        L66:
            return r0
        L67:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.CachedPageEventFlow$sharedForDownstream$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
