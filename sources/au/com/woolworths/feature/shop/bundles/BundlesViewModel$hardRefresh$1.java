package au.com.woolworths.feature.shop.bundles;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.bundles.BundlesViewModel$hardRefresh$1", f = "BundlesViewModel.kt", l = {420, 422, 424}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BundlesViewModel$hardRefresh$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ BundlesViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundlesViewModel$hardRefresh$1(BundlesViewModel bundlesViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = bundlesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BundlesViewModel$hardRefresh$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BundlesViewModel$hardRefresh$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r0.emit(r7, r6) != r1) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            au.com.woolworths.feature.shop.bundles.BundlesViewModel r0 = r6.q
            kotlinx.coroutines.flow.MutableStateFlow r0 = r0.w
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r6.p
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L27
            if (r2 == r5) goto L23
            if (r2 == r4) goto L1f
            if (r2 != r3) goto L17
            kotlin.ResultKt.b(r7)
            goto L4b
        L17:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1f:
            kotlin.ResultKt.b(r7)
            goto L40
        L23:
            kotlin.ResultKt.b(r7)
            goto L35
        L27:
            kotlin.ResultKt.b(r7)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r6.p = r5
            java.lang.Object r7 = r0.emit(r7, r6)
            if (r7 != r1) goto L35
            goto L4a
        L35:
            r6.p = r4
            r4 = 100
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.b(r4, r6)
            if (r7 != r1) goto L40
            goto L4a
        L40:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r6.p = r3
            java.lang.Object r7 = r0.emit(r7, r6)
            if (r7 != r1) goto L4b
        L4a:
            return r1
        L4b:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.bundles.BundlesViewModel$hardRefresh$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
