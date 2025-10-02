package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.BasicTooltipStateImpl$show$2", f = "BasicTooltip.kt", l = {310, 312}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BasicTooltipStateImpl$show$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ BasicTooltipStateImpl q;
    public final /* synthetic */ Function1 r;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.BasicTooltipStateImpl$show$2$1", f = "BasicTooltip.kt", l = {312}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.BasicTooltipStateImpl$show$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ Function1 q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.q = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                this.p = 1;
                if (((BasicTooltipStateImpl$show$cancellableShow$1) this.q).invoke(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipStateImpl$show$2(BasicTooltipStateImpl basicTooltipStateImpl, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.q = basicTooltipStateImpl;
        this.r = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new BasicTooltipStateImpl$show$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((BasicTooltipStateImpl$show$2) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        throw null;
     */
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
            r2 = 2
            r3 = 0
            if (r1 == 0) goto L19
            r0 = 1
            if (r1 == r0) goto L15
            if (r1 == r2) goto L15
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L15:
            kotlin.ResultKt.b(r5)     // Catch: java.lang.Throwable -> L2f
            goto L2e
        L19:
            kotlin.ResultKt.b(r5)
            androidx.compose.foundation.BasicTooltipStateImpl$show$2$1 r5 = new androidx.compose.foundation.BasicTooltipStateImpl$show$2$1     // Catch: java.lang.Throwable -> L2f
            kotlin.jvm.functions.Function1 r1 = r4.r     // Catch: java.lang.Throwable -> L2f
            r5.<init>(r1, r3)     // Catch: java.lang.Throwable -> L2f
            r4.p = r2     // Catch: java.lang.Throwable -> L2f
            r1 = 1500(0x5dc, double:7.41E-321)
            java.lang.Object r5 = kotlinx.coroutines.TimeoutKt.b(r1, r5, r4)     // Catch: java.lang.Throwable -> L2f
            if (r5 != r0) goto L2e
            return r0
        L2e:
            throw r3
        L2f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltipStateImpl$show$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
