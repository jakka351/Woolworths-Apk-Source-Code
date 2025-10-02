package au.com.woolworths.feature.shop.bundles;

import androidx.paging.PagingData;
import androidx.paging.PagingDataTransforms;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "value", "Landroidx/paging/PagingData;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.bundles.BundlesViewModel$fetchBundles$4$3", f = "BundlesViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BundlesViewModel$fetchBundles$4$3 extends SuspendLambda implements Function2<PagingData<Object>, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ BundlesViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundlesViewModel$fetchBundles$4$3(BundlesViewModel bundlesViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = bundlesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BundlesViewModel$fetchBundles$4$3 bundlesViewModel$fetchBundles$4$3 = new BundlesViewModel$fetchBundles$4$3(this.q, continuation);
        bundlesViewModel$fetchBundles$4$3.p = obj;
        return bundlesViewModel$fetchBundles$4$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        BundlesViewModel$fetchBundles$4$3 bundlesViewModel$fetchBundles$4$3 = (BundlesViewModel$fetchBundles$4$3) create((PagingData) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        bundlesViewModel$fetchBundles$4$3.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        PagingData pagingData = (PagingData) this.p;
        BundlesViewModel bundlesViewModel = this.q;
        bundlesViewModel.q.setValue(PagingDataTransforms.a(pagingData, new BundlesViewModel$applyBoostedOffersToPagingData$1(bundlesViewModel, null)));
        return Unit.f24250a;
    }
}
