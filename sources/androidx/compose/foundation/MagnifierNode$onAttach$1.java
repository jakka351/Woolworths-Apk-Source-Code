package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.MagnifierNode$onAttach$1", f = "Magnifier.android.kt", l = {382, 386}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MagnifierNode$onAttach$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ MagnifierNode q;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.MagnifierNode$onAttach$1$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<Long, Unit> {
        public static final AnonymousClass1 h = new AnonymousClass1(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).longValue();
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagnifierNode$onAttach$1(MagnifierNode magnifierNode, Continuation continuation) {
        super(2, continuation);
        this.q = magnifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MagnifierNode$onAttach$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((MagnifierNode$onAttach$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (androidx.compose.runtime.MonotonicFrameClockKt.b(androidx.compose.foundation.MagnifierNode$onAttach$1.AnonymousClass1.h, r5) == r0) goto L20;
     */
    /* JADX WARN: Path cross not found for [B:13:0x0025, B:16:0x002e], limit reached: 23 */
    /* JADX WARN: Path cross not found for [B:16:0x002e, B:13:0x0025], limit reached: 23 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0030 -> B:11:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003a -> B:21:0x003d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r5.p
            r2 = 2
            r3 = 1
            androidx.compose.foundation.MagnifierNode r4 = r5.q
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.b(r6)
            goto L3d
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            kotlin.ResultKt.b(r6)
            goto L2e
        L1e:
            kotlin.ResultKt.b(r6)
        L21:
            kotlinx.coroutines.channels.BufferedChannel r6 = r4.H
            if (r6 == 0) goto L2e
            r5.p = r3
            java.lang.Object r6 = r6.c(r5)
            if (r6 != r0) goto L2e
            goto L3c
        L2e:
            androidx.compose.foundation.PlatformMagnifier r6 = r4.C
            if (r6 == 0) goto L21
            r5.p = r2
            androidx.compose.foundation.MagnifierNode$onAttach$1$1 r6 = androidx.compose.foundation.MagnifierNode$onAttach$1.AnonymousClass1.h
            java.lang.Object r6 = androidx.compose.runtime.MonotonicFrameClockKt.b(r6, r5)
            if (r6 != r0) goto L3d
        L3c:
            return r0
        L3d:
            androidx.compose.foundation.PlatformMagnifier r6 = r4.C
            if (r6 == 0) goto L21
            r6.b()
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode$onAttach$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
