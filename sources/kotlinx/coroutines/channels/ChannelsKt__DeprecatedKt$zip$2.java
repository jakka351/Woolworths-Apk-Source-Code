package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "V", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", f = "Deprecated.kt", l = {514, 499, 501}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$zip$2 extends SuspendLambda implements Function2<ProducerScope<Object>, Continuation<? super Unit>, Object> {
    public ChannelIterator p;
    public Function2 q;
    public ReceiveChannel r;
    public ChannelIterator s;
    public Object t;
    public int u;
    public /* synthetic */ Object v;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelsKt__DeprecatedKt$zip$2) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b1, code lost:
    
        r6 = r7;
        r7 = r8;
        r8 = r9;
        r9 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[Catch: all -> 0x0023, PHI: r1 r6 r7 r8 r9 r13
  0x005a: PHI (r1v3 kotlinx.coroutines.channels.ChannelIterator) = (r1v1 kotlinx.coroutines.channels.ChannelIterator), (r1v4 kotlinx.coroutines.channels.ChannelIterator) binds: [B:21:0x0057, B:35:0x00c6] A[DONT_GENERATE, DONT_INLINE]
  0x005a: PHI (r6v9 kotlinx.coroutines.channels.ReceiveChannel) = (r6v2 kotlinx.coroutines.channels.ReceiveChannel), (r6v11 kotlinx.coroutines.channels.ReceiveChannel) binds: [B:21:0x0057, B:35:0x00c6] A[DONT_GENERATE, DONT_INLINE]
  0x005a: PHI (r7v6 kotlin.jvm.functions.Function2) = (r7v1 kotlin.jvm.functions.Function2), (r7v8 kotlin.jvm.functions.Function2) binds: [B:21:0x0057, B:35:0x00c6] A[DONT_GENERATE, DONT_INLINE]
  0x005a: PHI (r8v4 kotlinx.coroutines.channels.ChannelIterator) = (r8v0 kotlinx.coroutines.channels.ChannelIterator), (r8v6 kotlinx.coroutines.channels.ChannelIterator) binds: [B:21:0x0057, B:35:0x00c6] A[DONT_GENERATE, DONT_INLINE]
  0x005a: PHI (r9v5 kotlinx.coroutines.channels.ProducerScope) = (r9v1 kotlinx.coroutines.channels.ProducerScope), (r9v7 kotlinx.coroutines.channels.ProducerScope) binds: [B:21:0x0057, B:35:0x00c6] A[DONT_GENERATE, DONT_INLINE]
  0x005a: PHI (r13v12 java.lang.Object) = (r13v0 java.lang.Object), (r13v20 java.lang.Object) binds: [B:21:0x0057, B:35:0x00c6] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0023, blocks: (B:9:0x001e, B:34:0x00b1, B:22:0x005a, B:24:0x0062, B:21:0x0057), top: B:47:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #1 {all -> 0x0023, blocks: (B:9:0x001e, B:34:0x00b1, B:22:0x005a, B:24:0x0062, B:21:0x0057), top: B:47:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d A[Catch: all -> 0x0045, TRY_LEAVE, TryCatch #2 {all -> 0x0045, blocks: (B:28:0x0085, B:30:0x008d, B:16:0x003e), top: B:49:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
