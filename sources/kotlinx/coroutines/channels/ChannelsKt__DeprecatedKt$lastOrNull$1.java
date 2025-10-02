package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {153, 156}, m = "lastOrNull")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$lastOrNull$1<E> extends ContinuationImpl {
    public ReceiveChannel p;
    public ChannelIterator q;
    public Object r;
    public /* synthetic */ Object s;
    public int t;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:28:0x0064, B:30:0x006c, B:25:0x0055), top: B:43:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0061 -> B:28:0x0064). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            r7.s = r8
            int r8 = r7.t
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r8 | r0
            r7.t = r8
            r1 = r8 & r0
            if (r1 == 0) goto L12
            int r8 = r8 - r0
            r7.t = r8
            r8 = r7
            goto L17
        L12:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r8 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1
            r8.<init>(r7)
        L17:
            java.lang.Object r0 = r8.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r8.t
            r3 = 0
            if (r2 == 0) goto L78
            r4 = 2
            r5 = 1
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r2 = r8.r
            kotlinx.coroutines.channels.ChannelIterator r5 = r8.q
            kotlinx.coroutines.channels.ReceiveChannel r6 = r8.p
            kotlin.ResultKt.b(r0)     // Catch: java.lang.Throwable -> L30
            goto L64
        L30:
            r8 = move-exception
            r3 = r6
            goto L7d
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            kotlinx.coroutines.channels.ChannelIterator r2 = r8.q
            kotlinx.coroutines.channels.ReceiveChannel r5 = r8.p
            kotlin.ResultKt.b(r0)     // Catch: java.lang.Throwable -> L75
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L75
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L75
            if (r0 != 0) goto L4e
            r5.cancel(r3)
            return r3
        L4e:
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L75
            r6 = r5
            r5 = r2
            r2 = r0
        L55:
            r8.p = r6     // Catch: java.lang.Throwable -> L30
            r8.q = r5     // Catch: java.lang.Throwable -> L30
            r8.r = r2     // Catch: java.lang.Throwable -> L30
            r8.t = r4     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r5.b(r8)     // Catch: java.lang.Throwable -> L30
            if (r0 != r1) goto L64
            return r1
        L64:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L30
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L71
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L30
            goto L55
        L71:
            r6.cancel(r3)
            return r2
        L75:
            r8 = move-exception
            r3 = r5
            goto L7d
        L78:
            kotlin.ResultKt.b(r0)
            throw r3     // Catch: java.lang.Throwable -> L7c
        L7c:
            r8 = move-exception
        L7d:
            throw r8     // Catch: java.lang.Throwable -> L7e
        L7e:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.a(r3, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
