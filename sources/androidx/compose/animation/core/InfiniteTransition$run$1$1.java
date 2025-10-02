package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", f = "InfiniteTransition.kt", l = {172, 193}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class InfiniteTransition$run$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Ref.FloatRef p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ MutableState s;
    public final /* synthetic */ InfiniteTransition t;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$1$3, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass3 extends SuspendLambda implements Function2<Float, Continuation<? super Boolean>, Object> {
        public /* synthetic */ float p;

        public AnonymousClass3() {
            super(2, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(2, continuation);
            anonymousClass3.p = ((Number) obj).floatValue();
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            return Boolean.valueOf(this.p > BitmapDescriptorFactory.HUE_RED);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteTransition$run$1$1(MutableState mutableState, InfiniteTransition infiniteTransition, Continuation continuation) {
        super(2, continuation);
        this.s = mutableState;
        this.t = infiniteTransition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InfiniteTransition$run$1$1 infiniteTransition$run$1$1 = new InfiniteTransition$run$1$1(this.s, this.t, continuation);
        infiniteTransition$run$1$1.r = obj;
        return infiniteTransition$run$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((InfiniteTransition$run$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    /* JADX WARN: Path cross not found for [B:11:0x003a, B:16:0x0057], limit reached: 18 */
    /* JADX WARN: Path cross not found for [B:16:0x0057, B:11:0x003a], limit reached: 18 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[PHI: r1 r8
  0x0050: PHI (r1v2 kotlin.jvm.internal.Ref$FloatRef) = (r1v3 kotlin.jvm.internal.Ref$FloatRef), (r1v4 kotlin.jvm.internal.Ref$FloatRef) binds: [B:12:0x004d, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0050: PHI (r8v3 kotlinx.coroutines.CoroutineScope) = (r8v4 kotlinx.coroutines.CoroutineScope), (r8v5 kotlinx.coroutines.CoroutineScope) binds: [B:12:0x004d, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0055 -> B:11:0x003a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006f -> B:11:0x003a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.q
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            kotlin.jvm.internal.Ref$FloatRef r1 = r7.p
            java.lang.Object r4 = r7.r
            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
            kotlin.ResultKt.b(r8)
            r8 = r4
            goto L3a
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            kotlin.jvm.internal.Ref$FloatRef r1 = r7.p
            java.lang.Object r4 = r7.r
            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
            kotlin.ResultKt.b(r8)
            r8 = r4
            goto L50
        L2a:
            kotlin.ResultKt.b(r8)
            java.lang.Object r8 = r7.r
            kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.d = r4
        L3a:
            androidx.compose.animation.core.InfiniteTransition$run$1$1$1 r4 = new androidx.compose.animation.core.InfiniteTransition$run$1$1$1
            androidx.compose.runtime.MutableState r5 = r7.s
            androidx.compose.animation.core.InfiniteTransition r6 = r7.t
            r4.<init>()
            r7.r = r8
            r7.p = r1
            r7.q = r3
            java.lang.Object r4 = androidx.compose.animation.core.InfiniteAnimationPolicyKt.a(r4, r7)
            if (r4 != r0) goto L50
            goto L71
        L50:
            float r4 = r1.d
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L3a
            androidx.compose.animation.core.InfiniteTransition$run$1$1$2 r4 = new androidx.compose.animation.core.InfiniteTransition$run$1$1$2
            r4.<init>()
            kotlinx.coroutines.flow.Flow r4 = androidx.compose.runtime.SnapshotStateKt.m(r4)
            androidx.compose.animation.core.InfiniteTransition$run$1$1$3 r5 = new androidx.compose.animation.core.InfiniteTransition$run$1$1$3
            r5.<init>()
            r7.r = r8
            r7.p = r1
            r7.q = r2
            java.lang.Object r4 = kotlinx.coroutines.flow.FlowKt.x(r4, r5, r7)
            if (r4 != r0) goto L3a
        L71:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.InfiniteTransition$run$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
