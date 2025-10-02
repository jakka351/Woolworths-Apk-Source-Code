package com.airbnb.lottie.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NonCancellable;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2", f = "LottieAnimatable.kt", l = {269}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LottieAnimatableImpl$animate$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public final /* synthetic */ LottieCancellationBehavior A;
    public int p;
    public final /* synthetic */ LottieAnimatableImpl q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ float u;
    public final /* synthetic */ LottieClipSpec v;
    public final /* synthetic */ LottieComposition w;
    public final /* synthetic */ float x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1", f = "LottieAnimatable.kt", l = {277}, m = "invokeSuspend")
    /* renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ LottieCancellationBehavior q;
        public final /* synthetic */ Job r;
        public final /* synthetic */ int s;
        public final /* synthetic */ int t;
        public final /* synthetic */ LottieAnimatableImpl u;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1$WhenMappings */
        public /* synthetic */ class WhenMappings {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f13375a;

            static {
                int[] iArr = new int[LottieCancellationBehavior.values().length];
                try {
                    LottieCancellationBehavior lottieCancellationBehavior = LottieCancellationBehavior.d;
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f13375a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LottieCancellationBehavior lottieCancellationBehavior, Job job, int i, int i2, LottieAnimatableImpl lottieAnimatableImpl, Continuation continuation) {
            super(2, continuation);
            this.q = lottieCancellationBehavior;
            this.r = job;
            this.s = i;
            this.t = i2;
            this.u = lottieAnimatableImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.q, this.r, this.s, this.t, this.u, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r1 = r4.p
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                kotlin.ResultKt.b(r5)
                goto L58
            Ld:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L15:
                kotlin.ResultKt.b(r5)
            L18:
                int[] r5 = com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2.AnonymousClass1.WhenMappings.f13375a
                com.airbnb.lottie.compose.LottieCancellationBehavior r1 = r4.q
                int r1 = r1.ordinal()
                r5 = r5[r1]
                int r1 = r4.s
                if (r5 != r2) goto L31
                kotlinx.coroutines.Job r5 = r4.r
                boolean r5 = r5.isActive()
                if (r5 == 0) goto L2f
                goto L31
            L2f:
                int r1 = r4.t
            L31:
                r4.p = r2
                r5 = 2147483647(0x7fffffff, float:NaN)
                com.airbnb.lottie.compose.LottieAnimatableImpl r3 = r4.u
                if (r1 != r5) goto L44
                com.airbnb.lottie.compose.LottieAnimatableImpl$doFrame$2 r5 = new com.airbnb.lottie.compose.LottieAnimatableImpl$doFrame$2
                r5.<init>()
                java.lang.Object r5 = androidx.compose.animation.core.InfiniteAnimationPolicyKt.a(r5, r4)
                goto L55
            L44:
                com.airbnb.lottie.compose.LottieAnimatableImpl$doFrame$3 r5 = new com.airbnb.lottie.compose.LottieAnimatableImpl$doFrame$3
                r5.<init>()
                kotlin.coroutines.CoroutineContext r1 = r4.getE()
                androidx.compose.runtime.MonotonicFrameClock r1 = androidx.compose.runtime.MonotonicFrameClockKt.a(r1)
                java.lang.Object r5 = r1.e(r5, r4)
            L55:
                if (r5 != r0) goto L58
                return r0
            L58:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 != 0) goto L18
                kotlin.Unit r5 = kotlin.Unit.f24250a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LottieCancellationBehavior.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LottieCancellationBehavior lottieCancellationBehavior = LottieCancellationBehavior.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimatableImpl$animate$2(LottieAnimatableImpl lottieAnimatableImpl, int i, int i2, boolean z, float f, LottieClipSpec lottieClipSpec, LottieComposition lottieComposition, float f2, boolean z2, boolean z3, LottieCancellationBehavior lottieCancellationBehavior, Continuation continuation) {
        super(1, continuation);
        this.q = lottieAnimatableImpl;
        this.r = i;
        this.s = i2;
        this.t = z;
        this.u = f;
        this.v = lottieClipSpec;
        this.w = lottieComposition;
        this.x = f2;
        this.y = z2;
        this.z = z3;
        this.A = lottieCancellationBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LottieAnimatableImpl$animate$2(this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((LottieAnimatableImpl$animate$2) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineContext coroutineContext;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        Unit unit = Unit.f24250a;
        LottieAnimatableImpl lottieAnimatableImpl = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                lottieAnimatableImpl.t(this.r);
                MutableState mutableState = lottieAnimatableImpl.f;
                int i2 = this.s;
                ((SnapshotMutableStateImpl) mutableState).setValue(Integer.valueOf(i2));
                ((SnapshotMutableStateImpl) lottieAnimatableImpl.g).setValue(Boolean.valueOf(this.t));
                MutableState mutableState2 = lottieAnimatableImpl.i;
                float f = this.u;
                ((SnapshotMutableStateImpl) mutableState2).setValue(Float.valueOf(f));
                ((SnapshotMutableStateImpl) lottieAnimatableImpl.h).setValue(this.v);
                SnapshotMutableStateImpl snapshotMutableStateImpl = (SnapshotMutableStateImpl) lottieAnimatableImpl.l;
                LottieComposition lottieComposition = this.w;
                snapshotMutableStateImpl.setValue(lottieComposition);
                lottieAnimatableImpl.v(this.x);
                ((SnapshotMutableStateImpl) lottieAnimatableImpl.j).setValue(Boolean.valueOf(this.y));
                if (!this.z) {
                    ((SnapshotMutableStateImpl) lottieAnimatableImpl.o).setValue(Long.MIN_VALUE);
                }
                if (lottieComposition == null) {
                    LottieAnimatableImpl.o(lottieAnimatableImpl, false);
                    return unit;
                }
                if (Float.isInfinite(f)) {
                    lottieAnimatableImpl.v(((Number) lottieAnimatableImpl.p.getD()).floatValue());
                    LottieAnimatableImpl.o(lottieAnimatableImpl, false);
                    lottieAnimatableImpl.t(i2);
                    return unit;
                }
                LottieAnimatableImpl.o(lottieAnimatableImpl, true);
                int iOrdinal = this.A.ordinal();
                if (iOrdinal == 0) {
                    coroutineContext = EmptyCoroutineContext.d;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    coroutineContext = NonCancellable.e;
                }
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.A, JobKt.f(getE()), this.s, this.r, lottieAnimatableImpl, null);
                this.p = 1;
                if (BuildersKt.f(coroutineContext, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            JobKt.e(getE());
            LottieAnimatableImpl.o(lottieAnimatableImpl, false);
            return unit;
        } catch (Throwable th) {
            LottieAnimatableImpl.o(lottieAnimatableImpl, false);
            throw th;
        }
    }
}
