package au.com.woolworths.feature.shop.brandedshop;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.brandedshop.BrandedShopAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.brandedshop.data.BrandedShopData;
import au.com.woolworths.feature.shop.brandedshop.data.BrandedShopErrorData;
import au.com.woolworths.feature.shop.brandedshop.mappers.BrandedShopDataHelperKt;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.brandedshop.BrandedShopViewModel$fetchBrandedShopDetails$1", f = "BrandedShopViewModel.kt", l = {122}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BrandedShopViewModel$fetchBrandedShopDetails$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ BrandedShopViewModel q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandedShopViewModel$fetchBrandedShopDetails$1(BrandedShopViewModel brandedShopViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.q = brandedShopViewModel;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BrandedShopViewModel$fetchBrandedShopDetails$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BrandedShopViewModel$fetchBrandedShopDetails$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        BrandedShopViewModel brandedShopViewModel = this.q;
        AnalyticsManager analyticsManager = brandedShopViewModel.i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        String str = this.r;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                BrandedShopInteractor brandedShopInteractor = brandedShopViewModel.e;
                this.p = 1;
                objA = brandedShopInteractor.a(str, this);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                objA = obj;
            }
            BrandedShopData brandedShopData = (BrandedShopData) objA;
            brandedShopViewModel.k.f(ViewState.a((ViewState) brandedShopViewModel.l.getValue(), null, false, null, null, brandedShopData.f6677a, null, null, null, null, 495));
            brandedShopViewModel.u6(BrandedShopDataHelperKt.b(brandedShopData), brandedShopData);
            brandedShopViewModel.o = brandedShopData;
            BrandedShopViewModel.p6(brandedShopViewModel, brandedShopData);
        } catch (NoConnectivityException unused) {
            BrandedShopViewModel.v6(brandedShopViewModel, false, null, null, null, new BrandedShopErrorData(str, FullPageMessage.Error.ConnectionError.f8919a), 15);
            analyticsManager.g((Event) new BrandedShopAnalytics.BrandedShop(brandedShopViewModel.r6()).h.d.getD());
        } catch (ServerErrorException unused2) {
            BrandedShopViewModel.v6(brandedShopViewModel, false, null, null, null, new BrandedShopErrorData(str, FullPageMessage.Error.ServerError.f8920a), 15);
            analyticsManager.g((Event) new BrandedShopAnalytics.BrandedShop(brandedShopViewModel.r6()).h.e.getD());
        }
        return Unit.f24250a;
    }
}
