package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Velocity;", "velocity"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", f = "Scrollable.kt", l = {748, 751, 754}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ScrollingLogic$onScrollStopped$performFling$1 extends SuspendLambda implements Function2<Velocity, Continuation<? super Velocity>, Object> {
    public long p;
    public int q;
    public /* synthetic */ long r;
    public final /* synthetic */ ScrollingLogic s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onScrollStopped$performFling$1(ScrollingLogic scrollingLogic, Continuation continuation) {
        super(2, continuation);
        this.s = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this.s, continuation);
        scrollingLogic$onScrollStopped$performFling$1.r = ((Velocity) obj).f2206a;
        return scrollingLogic$onScrollStopped$performFling$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollingLogic$onScrollStopped$performFling$1) create(new Velocity(((Velocity) obj).f2206a), (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r14.q
            r2 = 3
            r3 = 2
            r4 = 1
            androidx.compose.foundation.gestures.ScrollingLogic r5 = r14.s
            if (r1 == 0) goto L2f
            if (r1 == r4) goto L29
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            long r0 = r14.p
            long r2 = r14.r
            kotlin.ResultKt.b(r15)
            goto L71
        L19:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L21:
            long r3 = r14.p
            long r6 = r14.r
            kotlin.ResultKt.b(r15)
            goto L57
        L29:
            long r6 = r14.r
            kotlin.ResultKt.b(r15)
            goto L41
        L2f:
            kotlin.ResultKt.b(r15)
            long r6 = r14.r
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r15 = r5.f
            r14.r = r6
            r14.q = r4
            java.lang.Object r15 = r15.b(r6, r14)
            if (r15 != r0) goto L41
            goto L6e
        L41:
            androidx.compose.ui.unit.Velocity r15 = (androidx.compose.ui.unit.Velocity) r15
            long r8 = r15.f2206a
            long r8 = androidx.compose.ui.unit.Velocity.f(r6, r8)
            r14.r = r6
            r14.p = r8
            r14.q = r3
            java.lang.Object r15 = r5.b(r8, r14)
            if (r15 != r0) goto L56
            goto L6e
        L56:
            r3 = r8
        L57:
            androidx.compose.ui.unit.Velocity r15 = (androidx.compose.ui.unit.Velocity) r15
            long r11 = r15.f2206a
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r8 = r5.f
            long r9 = androidx.compose.ui.unit.Velocity.f(r3, r11)
            r14.r = r6
            r14.p = r11
            r14.q = r2
            r13 = r14
            java.lang.Object r15 = r8.a(r9, r11, r13)
            if (r15 != r0) goto L6f
        L6e:
            return r0
        L6f:
            r2 = r6
            r0 = r11
        L71:
            androidx.compose.ui.unit.Velocity r15 = (androidx.compose.ui.unit.Velocity) r15
            long r4 = r15.f2206a
            long r0 = androidx.compose.ui.unit.Velocity.f(r0, r4)
            long r0 = androidx.compose.ui.unit.Velocity.f(r2, r0)
            androidx.compose.ui.unit.Velocity r15 = new androidx.compose.ui.unit.Velocity
            r15.<init>(r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
