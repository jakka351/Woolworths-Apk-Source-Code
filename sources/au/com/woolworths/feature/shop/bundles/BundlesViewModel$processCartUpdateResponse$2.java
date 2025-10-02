package au.com.woolworths.feature.shop.bundles;

import au.com.woolworths.feature.shop.bundles.data.UpdateCartBundleQuantity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "item"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.bundles.BundlesViewModel$processCartUpdateResponse$2", f = "BundlesViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BundlesViewModel$processCartUpdateResponse$2 extends SuspendLambda implements Function2<Object, Continuation<? super Object>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ UpdateCartBundleQuantity q;
    public final /* synthetic */ BundlesViewModel r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundlesViewModel$processCartUpdateResponse$2(UpdateCartBundleQuantity updateCartBundleQuantity, BundlesViewModel bundlesViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = updateCartBundleQuantity;
        this.r = bundlesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BundlesViewModel$processCartUpdateResponse$2 bundlesViewModel$processCartUpdateResponse$2 = new BundlesViewModel$processCartUpdateResponse$2(this.q, this.r, continuation);
        bundlesViewModel$processCartUpdateResponse$2.p = obj;
        return bundlesViewModel$processCartUpdateResponse$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BundlesViewModel$processCartUpdateResponse$2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ec  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r55) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.bundles.BundlesViewModel$processCartUpdateResponse$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
