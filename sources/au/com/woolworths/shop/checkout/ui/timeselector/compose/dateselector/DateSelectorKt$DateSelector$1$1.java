package au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector.DateSelectorKt$DateSelector$1$1", f = "DateSelector.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DateSelectorKt$DateSelector$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ LazyListState q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateSelectorKt$DateSelector$1$1(LazyListState lazyListState, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.q = lazyListState;
        this.r = i;
        this.s = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DateSelectorKt$DateSelector$1$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DateSelectorKt$DateSelector$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.p
            kotlin.Unit r2 = kotlin.Unit.f24250a
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            kotlin.ResultKt.b(r8)
            return r2
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            kotlin.ResultKt.b(r8)
            r7.p = r3
            int r8 = r7.r
            if (r8 < 0) goto L97
            androidx.compose.foundation.lazy.LazyListState r1 = r7.q
            androidx.compose.foundation.lazy.LazyListLayoutInfo r3 = r1.j()
            int r3 = r3.getN()
            if (r8 < r3) goto L2d
            goto L97
        L2d:
            androidx.compose.foundation.lazy.LazyListLayoutInfo r3 = r1.j()
            java.util.List r3 = r3.f()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L3b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4f
            java.lang.Object r4 = r3.next()
            r5 = r4
            androidx.compose.foundation.lazy.LazyListItemInfo r5 = (androidx.compose.foundation.lazy.LazyListItemInfo) r5
            int r5 = r5.getF996a()
            if (r5 != r8) goto L3b
            goto L50
        L4f:
            r4 = 0
        L50:
            androidx.compose.foundation.lazy.LazyListItemInfo r4 = (androidx.compose.foundation.lazy.LazyListItemInfo) r4
            int r3 = r7.s
            if (r4 != 0) goto L60
            int r3 = -r3
            java.lang.Object r8 = r1.l(r8, r3, r7)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            if (r8 != r1) goto L97
            goto L98
        L60:
            int r5 = r4.getP()
            int r6 = r4.getQ()
            int r6 = r6 + r5
            if (r5 >= 0) goto L75
            int r3 = -r3
            java.lang.Object r8 = r1.l(r8, r3, r7)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            if (r8 != r1) goto L97
            goto L98
        L75:
            androidx.compose.foundation.lazy.LazyListLayoutInfo r5 = r1.j()
            int r5 = r5.getM()
            if (r6 <= r5) goto L97
            androidx.compose.foundation.lazy.LazyListLayoutInfo r5 = r1.j()
            int r5 = r5.getM()
            int r4 = r4.getQ()
            int r5 = r5 - r4
            int r5 = r5 - r3
            int r3 = -r5
            java.lang.Object r8 = r1.l(r8, r3, r7)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            if (r8 != r1) goto L97
            goto L98
        L97:
            r8 = r2
        L98:
            if (r8 != r0) goto L9b
            return r0
        L9b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector.DateSelectorKt$DateSelector$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
