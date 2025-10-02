package au.com.woolworths.feature.shop.bundles;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/shop/bundles/PagingParams;", "clearSignal", "", "initialLoad", "optionId", "", "storeId"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.bundles.BundlesViewModel$fetchBundles$3", f = "BundlesViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BundlesViewModel$fetchBundles$3 extends SuspendLambda implements Function5<Boolean, Boolean, String, String, Continuation<? super PagingParams>, Object> {
    public /* synthetic */ boolean p;
    public /* synthetic */ boolean q;
    public /* synthetic */ String r;
    public /* synthetic */ String s;
    public final /* synthetic */ BundlesViewModel t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundlesViewModel$fetchBundles$3(BundlesViewModel bundlesViewModel, Continuation continuation) {
        super(5, continuation);
        this.t = bundlesViewModel;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        BundlesViewModel$fetchBundles$3 bundlesViewModel$fetchBundles$3 = new BundlesViewModel$fetchBundles$3(this.t, (Continuation) obj5);
        bundlesViewModel$fetchBundles$3.p = zBooleanValue;
        bundlesViewModel$fetchBundles$3.q = zBooleanValue2;
        bundlesViewModel$fetchBundles$3.r = (String) obj3;
        bundlesViewModel$fetchBundles$3.s = (String) obj4;
        return bundlesViewModel$fetchBundles$3.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        boolean z = this.p;
        boolean z2 = this.q;
        return new PagingParams(z2 ? this.t.e : null, this.r, this.s, z2, z);
    }
}
