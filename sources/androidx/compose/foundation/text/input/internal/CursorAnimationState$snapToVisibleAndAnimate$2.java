package androidx.compose.foundation.text.input.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CursorAnimationState$snapToVisibleAndAnimate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ CursorAnimationState q;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", l = {72, 77, 79, 81}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ Job q;
        public final /* synthetic */ CursorAnimationState r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Job job, CursorAnimationState cursorAnimationState, Continuation continuation) {
            super(2, continuation);
            this.q = job;
            this.r = cursorAnimationState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.q, this.r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            return CoroutineSingletons.d;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        
            if (kotlinx.coroutines.JobKt.c(r13, r12) == r2) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
        
            if (kotlinx.coroutines.DelayKt.b(500, r12) != r2) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0063 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:8:0x001b, B:33:0x0072, B:27:0x005a, B:30:0x0063, B:14:0x0029, B:15:0x002d, B:16:0x0035, B:23:0x004a, B:25:0x0054), top: B:37:0x0011 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x006f -> B:33:0x0072). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                androidx.compose.foundation.text.input.internal.CursorAnimationState r0 = r12.r
                androidx.compose.runtime.MutableFloatState r1 = r0.c
                kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r3 = r12.p
                r4 = 0
                r5 = 500(0x1f4, double:2.47E-321)
                r7 = 1065353216(0x3f800000, float:1.0)
                r8 = 4
                r9 = 3
                r10 = 2
                r11 = 1
                if (r3 == 0) goto L3a
                if (r3 == r11) goto L36
                if (r3 == r10) goto L2d
                if (r3 == r9) goto L29
                if (r3 != r8) goto L21
                kotlin.ResultKt.b(r13)     // Catch: java.lang.Throwable -> L1f
                goto L72
            L1f:
                r13 = move-exception
                goto L79
            L21:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L29:
                kotlin.ResultKt.b(r13)     // Catch: java.lang.Throwable -> L1f
                goto L63
            L2d:
                kotlin.ResultKt.b(r13)     // Catch: java.lang.Throwable -> L1f
                kotlin.KotlinNothingValueException r13 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L1f
                r13.<init>()     // Catch: java.lang.Throwable -> L1f
                throw r13     // Catch: java.lang.Throwable -> L1f
            L36:
                kotlin.ResultKt.b(r13)
                goto L4a
            L3a:
                kotlin.ResultKt.b(r13)
                kotlinx.coroutines.Job r13 = r12.q
                if (r13 == 0) goto L4a
                r12.p = r11
                java.lang.Object r13 = kotlinx.coroutines.JobKt.c(r13, r12)
                if (r13 != r2) goto L4a
                goto L71
            L4a:
                r13 = r1
                androidx.compose.runtime.SnapshotMutableFloatStateImpl r13 = (androidx.compose.runtime.SnapshotMutableFloatStateImpl) r13     // Catch: java.lang.Throwable -> L1f
                r13.p(r7)     // Catch: java.lang.Throwable -> L1f
                boolean r13 = r0.f1157a     // Catch: java.lang.Throwable -> L1f
                if (r13 != 0) goto L5a
                r12.p = r10     // Catch: java.lang.Throwable -> L1f
                kotlinx.coroutines.DelayKt.a(r12)     // Catch: java.lang.Throwable -> L1f
                return r2
            L5a:
                r12.p = r9     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r13 = kotlinx.coroutines.DelayKt.b(r5, r12)     // Catch: java.lang.Throwable -> L1f
                if (r13 != r2) goto L63
                goto L71
            L63:
                r13 = r1
                androidx.compose.runtime.SnapshotMutableFloatStateImpl r13 = (androidx.compose.runtime.SnapshotMutableFloatStateImpl) r13     // Catch: java.lang.Throwable -> L1f
                r13.p(r4)     // Catch: java.lang.Throwable -> L1f
                r12.p = r8     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r13 = kotlinx.coroutines.DelayKt.b(r5, r12)     // Catch: java.lang.Throwable -> L1f
                if (r13 != r2) goto L72
            L71:
                return r2
            L72:
                r13 = r1
                androidx.compose.runtime.SnapshotMutableFloatStateImpl r13 = (androidx.compose.runtime.SnapshotMutableFloatStateImpl) r13     // Catch: java.lang.Throwable -> L1f
                r13.p(r7)     // Catch: java.lang.Throwable -> L1f
                goto L5a
            L79:
                androidx.compose.runtime.SnapshotMutableFloatStateImpl r1 = (androidx.compose.runtime.SnapshotMutableFloatStateImpl) r1
                r1.p(r4)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CursorAnimationState$snapToVisibleAndAnimate$2(CursorAnimationState cursorAnimationState, Continuation continuation) {
        super(2, continuation);
        this.q = cursorAnimationState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CursorAnimationState$snapToVisibleAndAnimate$2 cursorAnimationState$snapToVisibleAndAnimate$2 = new CursorAnimationState$snapToVisibleAndAnimate$2(this.q, continuation);
        cursorAnimationState$snapToVisibleAndAnimate$2.p = obj;
        return cursorAnimationState$snapToVisibleAndAnimate$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CursorAnimationState$snapToVisibleAndAnimate$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.p;
        CursorAnimationState cursorAnimationState = this.q;
        AtomicReference atomicReference = cursorAnimationState.b;
        Job jobC = BuildersKt.c(coroutineScope, null, null, new AnonymousClass1((Job) atomicReference.getAndSet(null), cursorAnimationState, null), 3);
        while (true) {
            if (atomicReference.compareAndSet(null, jobC)) {
                z = true;
                break;
            }
            if (atomicReference.get() != null) {
                z = false;
                break;
            }
        }
        return Boolean.valueOf(z);
    }
}
