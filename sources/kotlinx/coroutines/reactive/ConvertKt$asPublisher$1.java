package kotlinx.coroutines.reactive;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ProducerScope;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.reactive.ConvertKt$asPublisher$1", f = "Convert.kt", l = {12, 13}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ConvertKt$asPublisher$1 extends SuspendLambda implements Function2 {
    public ChannelIterator p;
    public int q;
    public /* synthetic */ Object r;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ConvertKt$asPublisher$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[PHI: r1 r4 r6
  0x0027: PHI (r1v2 kotlinx.coroutines.channels.ChannelIterator) = (r1v1 kotlinx.coroutines.channels.ChannelIterator), (r1v3 kotlinx.coroutines.channels.ChannelIterator) binds: [B:10:0x001e, B:17:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x0027: PHI (r4v2 kotlinx.coroutines.channels.ProducerScope) = (r4v1 kotlinx.coroutines.channels.ProducerScope), (r4v3 kotlinx.coroutines.channels.ProducerScope) binds: [B:10:0x001e, B:17:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x0027: PHI (r6v4 java.lang.Object) = (r6v0 java.lang.Object), (r6v10 java.lang.Object) binds: [B:10:0x001e, B:17:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003d -> B:16:0x0040). Please report as a decompilation issue!!! */
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
            if (r1 == 0) goto L50
            r2 = 2
            r3 = 1
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlinx.coroutines.channels.ChannelIterator r1 = r5.p
            java.lang.Object r4 = r5.r
            kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
            kotlin.ResultKt.b(r6)
            goto L40
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1e:
            kotlinx.coroutines.channels.ChannelIterator r1 = r5.p
            java.lang.Object r4 = r5.r
            kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
            kotlin.ResultKt.b(r6)
        L27:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L4d
            java.lang.Object r6 = r1.next()
            r5.r = r4
            r5.p = r1
            r5.q = r2
            java.lang.Object r6 = r4.z(r6, r5)
            if (r6 != r0) goto L40
            goto L4c
        L40:
            r5.r = r4
            r5.p = r1
            r5.q = r3
            java.lang.Object r6 = r1.b(r5)
            if (r6 != r0) goto L27
        L4c:
            return r0
        L4d:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        L50:
            kotlin.ResultKt.b(r6)
            java.lang.Object r6 = r5.r
            kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.ConvertKt$asPublisher$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
