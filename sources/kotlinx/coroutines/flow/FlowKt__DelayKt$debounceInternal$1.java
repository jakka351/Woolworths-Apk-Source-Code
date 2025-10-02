package kotlinx.coroutines.flow;

import au.com.woolworths.feature.product.list.compose.filter.e;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;", "downstream", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {215, WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes7.dex */
final class FlowKt__DelayKt$debounceInternal$1 extends SuspendLambda implements Function3<CoroutineScope, FlowCollector<Object>, Continuation<? super Unit>, Object> {
    public Ref.ObjectRef p;
    public Ref.LongRef q;
    public int r;
    public /* synthetic */ Object s;
    public /* synthetic */ Object t;
    public final /* synthetic */ e u;
    public final /* synthetic */ Flow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1(e eVar, Flow flow, Continuation continuation) {
        super(3, continuation);
        this.u = eVar;
        this.v = flow;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.u, this.v, (Continuation) obj3);
        flowKt__DelayKt$debounceInternal$1.s = (CoroutineScope) obj;
        flowKt__DelayKt$debounceInternal$1.t = (FlowCollector) obj2;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        if (r7.emit(r13, r12) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d0, code lost:
    
        if (r7.g(r12) != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092 A[PHI: r1 r5 r6 r7
  0x0092: PHI (r1v3 kotlin.jvm.internal.Ref$LongRef) = (r1v5 kotlin.jvm.internal.Ref$LongRef), (r1v7 kotlin.jvm.internal.Ref$LongRef), (r1v7 kotlin.jvm.internal.Ref$LongRef) binds: [B:25:0x0090, B:15:0x0060, B:18:0x0076] A[DONT_GENERATE, DONT_INLINE]
  0x0092: PHI (r5v2 kotlin.jvm.internal.Ref$ObjectRef) = 
  (r5v4 kotlin.jvm.internal.Ref$ObjectRef)
  (r5v5 kotlin.jvm.internal.Ref$ObjectRef)
  (r5v5 kotlin.jvm.internal.Ref$ObjectRef)
 binds: [B:25:0x0090, B:15:0x0060, B:18:0x0076] A[DONT_GENERATE, DONT_INLINE]
  0x0092: PHI (r6v3 kotlinx.coroutines.channels.ReceiveChannel) = 
  (r6v5 kotlinx.coroutines.channels.ReceiveChannel)
  (r6v6 kotlinx.coroutines.channels.ReceiveChannel)
  (r6v6 kotlinx.coroutines.channels.ReceiveChannel)
 binds: [B:25:0x0090, B:15:0x0060, B:18:0x0076] A[DONT_GENERATE, DONT_INLINE]
  0x0092: PHI (r7v2 kotlinx.coroutines.flow.FlowCollector) = 
  (r7v4 kotlinx.coroutines.flow.FlowCollector)
  (r7v5 kotlinx.coroutines.flow.FlowCollector)
  (r7v5 kotlinx.coroutines.flow.FlowCollector)
 binds: [B:25:0x0090, B:15:0x0060, B:18:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00d0 -> B:7:0x001a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
