package au.com.woolworths.shop.cart.ui.cart;

import au.com.woolworths.analytics.supers.couponbanner.EmCouponBannerAnalytics;
import au.com.woolworths.analytics.supers.local.CartAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.shop.cart.data.model.Cart;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductCard;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantitiesUpdatedResponse;
import au.com.woolworths.product.productbottomsheet.ProductBottomSheetActionType;
import au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import au.com.woolworths.shop.cart.ui.cart.CartContract;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.ui.cart.CartViewModel$updateProductsWithCustomResponse$1", f = "CartViewModel.kt", l = {591}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CartViewModel$updateProductsWithCustomResponse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ Map q;
    public final /* synthetic */ CartViewModel r;
    public final /* synthetic */ Function0 s;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartViewModel$updateProductsWithCustomResponse$1(Map map, CartViewModel cartViewModel, Function0 function0, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.q = map;
        this.r = cartViewModel;
        this.s = function0;
        this.t = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CartViewModel$updateProductsWithCustomResponse$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CartViewModel$updateProductsWithCustomResponse$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objE;
        CartViewModel cartViewModel = this.r;
        BufferedChannel bufferedChannel = cartViewModel.l;
        AnalyticsManager analyticsManager = cartViewModel.g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
        } catch (NoConnectivityException e) {
            Bark.Companion companion = Bark.f8483a;
            Bark.Barker.h(new ReportOwner(ReportOwner.Squad.h), e, "Error updating quantities", 24);
            analyticsManager.g(CartAnalytics.Cart.Action.u);
            bufferedChannel.k(new CartContract.Actions.ShowFailMessage(R.string.error_no_network));
            MutableStateFlow mutableStateFlow = cartViewModel.n;
            LinkedHashMap linkedHashMapR6 = cartViewModel.r6();
            linkedHashMapR6.clear();
            CartViewModel.x6(cartViewModel, mutableStateFlow, false, null, null, linkedHashMapR6, 6);
        } catch (ServerErrorException e2) {
            Bark.Companion companion2 = Bark.f8483a;
            Bark.Barker.h(new ReportOwner(ReportOwner.Squad.h), e2, "Error updating quantities", 24);
            analyticsManager.g(CartAnalytics.Cart.Action.t);
            bufferedChannel.k(new CartContract.Actions.ShowFailMessage(R.string.network_issue_error_message));
            MutableStateFlow mutableStateFlow2 = cartViewModel.n;
            LinkedHashMap linkedHashMapR62 = cartViewModel.r6();
            linkedHashMapR62.clear();
            CartViewModel.x6(cartViewModel, mutableStateFlow2, false, null, null, linkedHashMapR62, 6);
        }
        if (i == 0) {
            ResultKt.b(obj);
            Map map = this.q;
            if (!map.isEmpty()) {
                CartViewModel.x6(cartViewModel, cartViewModel.n, true, null, null, null, 14);
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(new UpdateProductInCartExtras(((CartProductCard) entry.getKey()).f8679a, (float) ((Number) entry.getValue()).doubleValue(), ProductBottomSheetActionType.e, null, null, null, 248));
                }
                CartUpdateInteractor cartUpdateInteractor = cartViewModel.i;
                UpdateProductInCartExtras[] updateProductInCartExtrasArr = (UpdateProductInCartExtras[]) arrayList.toArray(new UpdateProductInCartExtras[0]);
                UpdateProductInCartExtras[] updateProductInCartExtrasArr2 = (UpdateProductInCartExtras[]) Arrays.copyOf(updateProductInCartExtrasArr, updateProductInCartExtrasArr.length);
                this.p = 1;
                objE = cartUpdateInteractor.e(updateProductInCartExtrasArr2, this);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Unit.f24250a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        objE = obj;
        CartProductQuantitiesUpdatedResponse cartProductQuantitiesUpdatedResponse = (CartProductQuantitiesUpdatedResponse) ((Pair) objE).d;
        Function0 function0 = this.s;
        if (function0 != null) {
            function0.invoke();
        }
        Cart cart = cartProductQuantitiesUpdatedResponse.d;
        if (cart == null || cart.f8671a <= 0) {
            analyticsManager.g(CartAnalytics.Cart.Action.n);
            CartViewModel.x6(cartViewModel, cartViewModel.n, false, null, CartEmptyState.d, null, 8);
        } else {
            ?? r0 = cartProductQuantitiesUpdatedResponse.c;
            EmCouponBannerAnalytics.Banner banner = CartViewModel.u;
            cartViewModel.u6(cart, r0);
            CartViewModel.x6(cartViewModel, cartViewModel.n, false, cart, null, null, 8);
        }
        Function0 function02 = this.t;
        if (function02 != null) {
            function02.invoke();
        }
        return Unit.f24250a;
    }
}
