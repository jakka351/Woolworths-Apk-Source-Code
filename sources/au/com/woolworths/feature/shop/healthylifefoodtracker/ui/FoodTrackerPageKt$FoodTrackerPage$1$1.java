package au.com.woolworths.feature.shop.healthylifefoodtracker.ui;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.healthylifefoodtracker.ui.FoodTrackerPageKt$FoodTrackerPage$1$1", f = "FoodTrackerPage.kt", l = {91, 93}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FoodTrackerPageKt$FoodTrackerPage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ State q;
    public final /* synthetic */ ModalBottomSheetState r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoodTrackerPageKt$FoodTrackerPage$1$1(State state, ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
        super(2, continuation);
        this.q = state;
        this.r = modalBottomSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FoodTrackerPageKt$FoodTrackerPage$1$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FoodTrackerPageKt$FoodTrackerPage$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r1.e(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r1.c(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return r0;
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
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L15:
            kotlin.ResultKt.b(r5)
            goto L3c
        L19:
            kotlin.ResultKt.b(r5)
            androidx.compose.runtime.State r5 = r4.q
            java.lang.Object r5 = r5.getD()
            au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerContract$ViewState r5 = (au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerContract.ViewState) r5
            boolean r5 = r5.g
            androidx.compose.material.ModalBottomSheetState r1 = r4.r
            if (r5 == 0) goto L33
            r4.p = r3
            java.lang.Object r5 = r1.e(r4)
            if (r5 != r0) goto L3c
            goto L3b
        L33:
            r4.p = r2
            java.lang.Object r5 = r1.c(r4)
            if (r5 != r0) goto L3c
        L3b:
            return r0
        L3c:
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.healthylifefoodtracker.ui.FoodTrackerPageKt$FoodTrackerPage$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
