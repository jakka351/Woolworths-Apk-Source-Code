package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "V", "Landroidx/compose/animation/core/AnimationVector;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {418}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AnimateAsStateKt$animateValueAsState$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public ChannelIterator p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ Channel s;
    public final /* synthetic */ Animatable t;
    public final /* synthetic */ MutableState u;
    public final /* synthetic */ MutableState v;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "V", "Landroidx/compose/animation/core/AnimationVector;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", f = "AnimateAsState.kt", l = {427}, m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ Object q;
        public final /* synthetic */ Animatable r;
        public final /* synthetic */ MutableState s;
        public final /* synthetic */ MutableState t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, Animatable animatable, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
            super(2, continuation);
            this.q = obj;
            this.r = animatable;
            this.s = mutableState;
            this.t = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.q, this.r, this.s, this.t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AnonymousClass1 anonymousClass1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            Animatable animatable = this.r;
            if (i == 0) {
                ResultKt.b(obj);
                if (Intrinsics.c(this.q, ((SnapshotMutableStateImpl) animatable.e).getD())) {
                    return Unit.f24250a;
                }
                SpringSpec springSpec = AnimateAsStateKt.f742a;
                AnimationSpec animationSpec = (AnimationSpec) this.s.getD();
                this.p = 1;
                anonymousClass1 = this;
                if (Animatable.d(this.r, this.q, animationSpec, null, null, anonymousClass1, 12) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                anonymousClass1 = this;
            }
            SpringSpec springSpec2 = AnimateAsStateKt.f742a;
            Function1 function1 = (Function1) anonymousClass1.t.getD();
            if (function1 != null) {
                function1.invoke(animatable.f());
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateAsStateKt$animateValueAsState$3$1(Channel channel, Animatable animatable, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.s = channel;
        this.t = animatable;
        this.u = mutableState;
        this.v = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AnimateAsStateKt$animateValueAsState$3$1 animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(this.s, this.t, this.u, this.v, continuation);
        animateAsStateKt$animateValueAsState$3$1.r = obj;
        return animateAsStateKt$animateValueAsState$3$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AnimateAsStateKt$animateValueAsState$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:12:0x0036). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r12.q
            kotlinx.coroutines.channels.Channel r2 = r12.s
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 != r3) goto L15
            kotlinx.coroutines.channels.ChannelIterator r1 = r12.p
            java.lang.Object r4 = r12.r
            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
            kotlin.ResultKt.b(r13)
            goto L36
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1d:
            kotlin.ResultKt.b(r13)
            java.lang.Object r13 = r12.r
            kotlinx.coroutines.CoroutineScope r13 = (kotlinx.coroutines.CoroutineScope) r13
            kotlinx.coroutines.channels.ChannelIterator r1 = r2.iterator()
            r4 = r13
        L29:
            r12.r = r4
            r12.p = r1
            r12.q = r3
            java.lang.Object r13 = r1.b(r12)
            if (r13 != r0) goto L36
            return r0
        L36:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L61
            java.lang.Object r13 = r1.next()
            java.lang.Object r5 = r2.o()
            java.lang.Object r5 = kotlinx.coroutines.channels.ChannelResult.b(r5)
            if (r5 != 0) goto L4e
            r7 = r13
            goto L4f
        L4e:
            r7 = r5
        L4f:
            androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1 r6 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1
            androidx.compose.runtime.MutableState r10 = r12.v
            r11 = 0
            androidx.compose.animation.core.Animatable r8 = r12.t
            androidx.compose.runtime.MutableState r9 = r12.u
            r6.<init>(r7, r8, r9, r10, r11)
            r13 = 3
            r5 = 0
            kotlinx.coroutines.BuildersKt.c(r4, r5, r5, r6, r13)
            goto L29
        L61:
            kotlin.Unit r13 = kotlin.Unit.f24250a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
