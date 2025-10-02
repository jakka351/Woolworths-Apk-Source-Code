package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", l = {421, 423, 425, 432, 434, 437}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DragGestureNode$startListeningForEvents$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Ref.ObjectRef p;
    public Ref.ObjectRef q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ DragGestureNode t;

    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "processDelta", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "dragDelta"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", l = {428}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<Function1<? super DragEvent.DragDelta, ? extends Unit>, Continuation<? super Unit>, Object> {
        public Ref.ObjectRef p;
        public int q;
        public /* synthetic */ Object r;
        public final /* synthetic */ Ref.ObjectRef s;
        public final /* synthetic */ DragGestureNode t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef objectRef, DragGestureNode dragGestureNode, Continuation continuation) {
            super(2, continuation);
            this.s = objectRef;
            this.t = dragGestureNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.s, this.t, continuation);
            anonymousClass1.r = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((Function1) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0041 -> B:25:0x0053). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004d -> B:24:0x0050). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r1 = r6.q
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                kotlin.jvm.internal.Ref$ObjectRef r1 = r6.p
                java.lang.Object r3 = r6.r
                kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
                kotlin.ResultKt.b(r7)
                goto L50
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                kotlin.ResultKt.b(r7)
                java.lang.Object r7 = r6.r
                kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
                r3 = r7
            L23:
                kotlin.jvm.internal.Ref$ObjectRef r1 = r6.s
                java.lang.Object r7 = r1.d
                boolean r4 = r7 instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped
                if (r4 != 0) goto L56
                boolean r4 = r7 instanceof androidx.compose.foundation.gestures.DragEvent.DragCancelled
                if (r4 != 0) goto L56
                boolean r4 = r7 instanceof androidx.compose.foundation.gestures.DragEvent.DragDelta
                r5 = 0
                if (r4 == 0) goto L37
                androidx.compose.foundation.gestures.DragEvent$DragDelta r7 = (androidx.compose.foundation.gestures.DragEvent.DragDelta) r7
                goto L38
            L37:
                r7 = r5
            L38:
                if (r7 == 0) goto L3d
                r3.invoke(r7)
            L3d:
                androidx.compose.foundation.gestures.DragGestureNode r7 = r6.t
                kotlinx.coroutines.channels.BufferedChannel r7 = r7.x
                if (r7 == 0) goto L53
                r6.r = r3
                r6.p = r1
                r6.q = r2
                java.lang.Object r7 = r7.c(r6)
                if (r7 != r0) goto L50
                return r0
            L50:
                r5 = r7
                androidx.compose.foundation.gestures.DragEvent r5 = (androidx.compose.foundation.gestures.DragEvent) r5
            L53:
                r1.d = r5
                goto L23
            L56:
                kotlin.Unit r7 = kotlin.Unit.f24250a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$startListeningForEvents$1(DragGestureNode dragGestureNode, Continuation continuation) {
        super(2, continuation);
        this.t = dragGestureNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1 = new DragGestureNode$startListeningForEvents$1(this.t, continuation);
        dragGestureNode$startListeningForEvents$1.s = obj;
        return dragGestureNode$startListeningForEvents$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DragGestureNode$startListeningForEvents$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e0, code lost:
    
        if (androidx.compose.foundation.gestures.DragGestureNode.v2(r3, r6) != r0) goto L11;
     */
    /* JADX WARN: Path cross not found for [B:44:0x00c3, B:40:0x00b1], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:46:0x00c7, B:19:0x0056], limit reached: 56 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[PHI: r1 r4
  0x0032: PHI (r1v11 kotlin.jvm.internal.Ref$ObjectRef) = (r1v3 kotlin.jvm.internal.Ref$ObjectRef), (r1v15 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:13:0x002f, B:36:0x00a8] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r4v6 kotlinx.coroutines.CoroutineScope) = (r4v4 kotlinx.coroutines.CoroutineScope), (r4v7 kotlinx.coroutines.CoroutineScope) binds: [B:13:0x002f, B:36:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[PHI: r5
  0x0056: PHI (r5v7 kotlinx.coroutines.CoroutineScope) = 
  (r5v0 kotlinx.coroutines.CoroutineScope)
  (r5v3 kotlinx.coroutines.CoroutineScope)
  (r5v3 kotlinx.coroutines.CoroutineScope)
  (r5v3 kotlinx.coroutines.CoroutineScope)
  (r5v5 kotlinx.coroutines.CoroutineScope)
  (r5v8 kotlinx.coroutines.CoroutineScope)
 binds: [B:18:0x004e, B:45:0x00c5, B:47:0x00d2, B:41:0x00be, B:30:0x0082, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1 A[Catch: CancellationException -> 0x00c1, TryCatch #0 {CancellationException -> 0x00c1, blocks: (B:38:0x00ab, B:40:0x00b1, B:44:0x00c3, B:46:0x00c7), top: B:55:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3 A[Catch: CancellationException -> 0x00c1, TryCatch #0 {CancellationException -> 0x00c1, blocks: (B:38:0x00ab, B:40:0x00b1, B:44:0x00c3, B:46:0x00c7), top: B:55:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0082 -> B:19:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00be -> B:19:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00c5 -> B:19:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00d2 -> B:19:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00e0 -> B:11:0x0027). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
