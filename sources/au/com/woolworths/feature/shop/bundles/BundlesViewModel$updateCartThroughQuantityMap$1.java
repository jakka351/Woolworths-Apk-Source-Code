package au.com.woolworths.feature.shop.bundles;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.bundles.BundlesViewModel$updateCartThroughQuantityMap$1", f = "BundlesViewModel.kt", l = {653, 655, 660}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class BundlesViewModel$updateCartThroughQuantityMap$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object p;
    public String q;
    public int r;
    public final /* synthetic */ BundlesViewModel s;
    public final /* synthetic */ Map t;
    public final /* synthetic */ Map u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundlesViewModel$updateCartThroughQuantityMap$1(BundlesViewModel bundlesViewModel, Map map, Map map2, Continuation continuation) {
        super(2, continuation);
        this.s = bundlesViewModel;
        this.t = map;
        this.u = map2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BundlesViewModel$updateCartThroughQuantityMap$1(this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BundlesViewModel$updateCartThroughQuantityMap$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a8, code lost:
    
        if (r1.h(r11, r25) != r9) goto L66;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.bundles.BundlesViewModel$updateCartThroughQuantityMap$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
