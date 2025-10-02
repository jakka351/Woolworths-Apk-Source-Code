package au.com.woolworths.shop.product.details.ui;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.product.details.ui.ProductDetailsScreenKt$ProductDetailsUIContent$1$1$1$1$9$1", f = "ProductDetailsScreen.kt", l = {556, 557}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ProductDetailsScreenKt$ProductDetailsUIContent$1$1$1$1$9$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ LazyListState q;
    public final /* synthetic */ int r;
    public final /* synthetic */ MutableState s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsScreenKt$ProductDetailsUIContent$1$1$1$1$9$1(LazyListState lazyListState, int i, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.q = lazyListState;
        this.r = i;
        this.s = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductDetailsScreenKt$ProductDetailsUIContent$1$1$1$1$9$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductDetailsScreenKt$ProductDetailsUIContent$1$1$1$1$9$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r5.q.l(r5.r, 0, r5) != r0) goto L18;
     */
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
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r6)
            goto L48
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            kotlin.ResultKt.b(r6)
            goto L38
        L1c:
            kotlin.ResultKt.b(r6)
            androidx.compose.runtime.MutableState r6 = r5.s
            java.lang.Object r6 = r6.getD()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L48
            r5.p = r3
            r3 = 300(0x12c, double:1.48E-321)
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.b(r3, r5)
            if (r6 != r0) goto L38
            goto L47
        L38:
            r5.p = r2
            androidx.compose.runtime.saveable.SaverKt$Saver$1 r6 = androidx.compose.foundation.lazy.LazyListState.w
            r6 = 0
            androidx.compose.foundation.lazy.LazyListState r1 = r5.q
            int r2 = r5.r
            java.lang.Object r6 = r1.l(r2, r6, r5)
            if (r6 != r0) goto L48
        L47:
            return r0
        L48:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.product.details.ui.ProductDetailsScreenKt$ProductDetailsUIContent$1$1$1$1$9$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
