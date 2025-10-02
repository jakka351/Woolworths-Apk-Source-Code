package kotlinx.coroutines.channels;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {450, 452}, m = "maxWith")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$maxWith$1<E> extends ContinuationImpl {
    public Comparator p;
    public ReceiveChannel q;
    public ChannelIterator r;
    public Object s;
    public /* synthetic */ Object t;
    public int u;

    /* JADX WARN: Removed duplicated region for block: B:28:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #1 {all -> 0x0032, blocks: (B:12:0x002e, B:29:0x006b, B:31:0x0073, B:26:0x005a), top: B:47:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0068 -> B:29:0x006b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            r9.t = r10
            int r10 = r9.u
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r10 | r0
            r9.u = r10
            r1 = r10 & r0
            if (r1 == 0) goto L12
            int r10 = r10 - r0
            r9.u = r10
            r10 = r9
            goto L17
        L12:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1 r10 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1
            r10.<init>(r9)
        L17:
            java.lang.Object r0 = r10.t
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r10.u
            r3 = 0
            if (r2 == 0) goto L85
            r4 = 2
            r5 = 1
            if (r2 == r5) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r2 = r10.s
            kotlinx.coroutines.channels.ChannelIterator r5 = r10.r
            kotlinx.coroutines.channels.ReceiveChannel r6 = r10.q
            java.util.Comparator r7 = r10.p
            kotlin.ResultKt.b(r0)     // Catch: java.lang.Throwable -> L32
            goto L6b
        L32:
            r10 = move-exception
            r3 = r6
            goto L8a
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3d:
            kotlinx.coroutines.channels.ChannelIterator r2 = r10.r
            kotlinx.coroutines.channels.ReceiveChannel r5 = r10.q
            java.util.Comparator r6 = r10.p
            kotlin.ResultKt.b(r0)     // Catch: java.lang.Throwable -> L82
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L82
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L82
            if (r0 != 0) goto L52
            r5.cancel(r3)
            return r3
        L52:
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L82
            r7 = r6
            r6 = r5
            r5 = r2
        L59:
            r2 = r0
        L5a:
            r10.p = r7     // Catch: java.lang.Throwable -> L32
            r10.q = r6     // Catch: java.lang.Throwable -> L32
            r10.r = r5     // Catch: java.lang.Throwable -> L32
            r10.s = r2     // Catch: java.lang.Throwable -> L32
            r10.u = r4     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = r5.b(r10)     // Catch: java.lang.Throwable -> L32
            if (r0 != r1) goto L6b
            return r1
        L6b:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L32
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L7e
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> L32
            int r8 = r7.compare(r2, r0)     // Catch: java.lang.Throwable -> L32
            if (r8 >= 0) goto L5a
            goto L59
        L7e:
            r6.cancel(r3)
            return r2
        L82:
            r10 = move-exception
            r3 = r5
            goto L8a
        L85:
            kotlin.ResultKt.b(r0)
            throw r3     // Catch: java.lang.Throwable -> L89
        L89:
            r10 = move-exception
        L8a:
            throw r10     // Catch: java.lang.Throwable -> L8b
        L8b:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.a(r3, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
