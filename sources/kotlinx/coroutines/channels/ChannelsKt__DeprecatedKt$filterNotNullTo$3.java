package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.SendChannel;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514, 272}, m = "filterNotNullTo")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$filterNotNullTo$3<E, C extends SendChannel<? super E>> extends ContinuationImpl {
    public SendChannel p;
    public ReceiveChannel q;
    public ChannelIterator r;
    public /* synthetic */ Object s;
    public int t;

    /* JADX WARN: Path cross not found for [B:24:0x0052, B:27:0x0061], limit reached: 44 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[Catch: all -> 0x0030, PHI: r0 r2 r6 r7
  0x0044: PHI (r0v3 java.lang.Object) = (r0v1 java.lang.Object), (r0v8 java.lang.Object) binds: [B:19:0x0041, B:28:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x0044: PHI (r2v2 kotlinx.coroutines.channels.ChannelIterator) = (r2v1 kotlinx.coroutines.channels.ChannelIterator), (r2v3 kotlinx.coroutines.channels.ChannelIterator) binds: [B:19:0x0041, B:28:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x0044: PHI (r6v2 kotlinx.coroutines.channels.ReceiveChannel) = (r6v1 kotlinx.coroutines.channels.ReceiveChannel), (r6v3 kotlinx.coroutines.channels.ReceiveChannel) binds: [B:19:0x0041, B:28:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x0044: PHI (r7v1 kotlinx.coroutines.channels.SendChannel) = (r7v0 kotlinx.coroutines.channels.SendChannel), (r7v2 kotlinx.coroutines.channels.SendChannel) binds: [B:19:0x0041, B:28:0x006d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:27:0x0061, B:20:0x0044, B:22:0x004c, B:24:0x0052, B:19:0x0041), top: B:39:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:27:0x0061, B:20:0x0044, B:22:0x004c, B:24:0x0052, B:19:0x0041), top: B:39:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0050 -> B:27:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005e -> B:27:0x0061). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            r8.s = r9
            int r9 = r8.t
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r9 | r0
            r8.t = r9
            r1 = r9 & r0
            if (r1 == 0) goto L12
            int r9 = r9 - r0
            r8.t = r9
            r9 = r8
            goto L17
        L12:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 r9 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3
            r9.<init>(r8)
        L17:
            java.lang.Object r0 = r9.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r9.t
            r3 = 0
            if (r2 == 0) goto L74
            r4 = 2
            r5 = 1
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            kotlinx.coroutines.channels.ChannelIterator r2 = r9.r
            kotlinx.coroutines.channels.ReceiveChannel r6 = r9.q
            kotlinx.coroutines.channels.SendChannel r7 = r9.p
            kotlin.ResultKt.b(r0)     // Catch: java.lang.Throwable -> L30
            goto L61
        L30:
            r9 = move-exception
            r3 = r6
            goto L79
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            kotlinx.coroutines.channels.ChannelIterator r2 = r9.r
            kotlinx.coroutines.channels.ReceiveChannel r6 = r9.q
            kotlinx.coroutines.channels.SendChannel r7 = r9.p
            kotlin.ResultKt.b(r0)     // Catch: java.lang.Throwable -> L30
        L44:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L30
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L70
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L61
            r9.p = r7     // Catch: java.lang.Throwable -> L30
            r9.q = r6     // Catch: java.lang.Throwable -> L30
            r9.r = r2     // Catch: java.lang.Throwable -> L30
            r9.t = r4     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r7.z(r0, r9)     // Catch: java.lang.Throwable -> L30
            if (r0 != r1) goto L61
            goto L6f
        L61:
            r9.p = r7     // Catch: java.lang.Throwable -> L30
            r9.q = r6     // Catch: java.lang.Throwable -> L30
            r9.r = r2     // Catch: java.lang.Throwable -> L30
            r9.t = r5     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r2.b(r9)     // Catch: java.lang.Throwable -> L30
            if (r0 != r1) goto L44
        L6f:
            return r1
        L70:
            r6.cancel(r3)
            return r7
        L74:
            kotlin.ResultKt.b(r0)
            throw r3     // Catch: java.lang.Throwable -> L78
        L78:
            r9 = move-exception
        L79:
            throw r9     // Catch: java.lang.Throwable -> L7a
        L7a:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.a(r3, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
