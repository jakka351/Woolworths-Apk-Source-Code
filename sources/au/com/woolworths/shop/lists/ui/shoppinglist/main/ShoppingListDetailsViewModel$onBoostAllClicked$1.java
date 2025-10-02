package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.offers.ProductBoostFailureCause;
import au.com.woolworths.product.offers.ProductBoostInteractor;
import au.com.woolworths.product.offers.ProductBoostResult;
import au.com.woolworths.product.offers.TrackableBoostMetadata;
import au.com.woolworths.shop.lists.ui.ListDetailsAnalyticsParams;
import au.com.woolworths.shop.lists.ui.ListScreen;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListDetailsUiModel;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$onBoostAllClicked$1", f = "ShoppingListDetailsViewModel.kt", l = {1193}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListDetailsViewModel$onBoostAllClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListDetailsViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListDetailsViewModel$onBoostAllClicked$1(ShoppingListDetailsViewModel shoppingListDetailsViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListDetailsViewModel$onBoostAllClicked$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListDetailsViewModel$onBoostAllClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r15v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ShoppingListDetailsViewModel shoppingListDetailsViewModel;
        MutableStateFlow mutableStateFlow;
        ?? r15;
        Object objB;
        ShoppingListDetailsViewModel shoppingListDetailsViewModel2 = this.q;
        BoostExt boostExt = shoppingListDetailsViewModel2.n;
        MutableStateFlow mutableStateFlow2 = shoppingListDetailsViewModel2.w;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ShoppingListDetailsUiModel shoppingListDetailsUiModel = ((ShoppingListDetailsContract.ViewState) mutableStateFlow2.getValue()).f12428a;
            boostExt.getClass();
            List listB = BoostExt.b(shoppingListDetailsUiModel);
            ShoppingListDetailsViewModel.y6(shoppingListDetailsViewModel2, shoppingListDetailsViewModel2.w, null, null, null, false, false, false, null, null, StatefulButtonState.e, null, null, null, 3839);
            shoppingListDetailsViewModel = shoppingListDetailsViewModel2;
            this.p = 1;
            if (((ShoppingListDetailsContract.ViewState) shoppingListDetailsViewModel.y.getValue()).f12428a == null) {
                throw new IllegalArgumentException("shoppingListWithItems cannot be null!");
            }
            mutableStateFlow = mutableStateFlow2;
            r15 = 0;
            objB = ProductBoostInteractor.b(boostExt.f12375a, listB, new TrackableBoostMetadata(new ListScreen.ListDetails(new ListDetailsAnalyticsParams(boostExt.d.a(), shoppingListDetailsViewModel.H5())), null), "BOOST_ALL", null, this, 18);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            shoppingListDetailsViewModel = shoppingListDetailsViewModel2;
            mutableStateFlow = mutableStateFlow2;
            r15 = 0;
            objB = obj;
        }
        ProductBoostResult productBoostResult = (ProductBoostResult) objB;
        if (productBoostResult instanceof ProductBoostResult.Success) {
            ?? r0 = ((ProductBoostResult.Success) productBoostResult).c;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) r0) {
                RewardsOfferInfo rewardsOfferInfo = ((ProductCard) obj2).getRewardsOfferInfo();
                if ((rewardsOfferInfo != null ? rewardsOfferInfo.getN() : r15) == RewardsOfferStatus.NOT_ACTIVATED) {
                    arrayList.add(obj2);
                }
            }
            ShoppingListDetailsViewModel shoppingListDetailsViewModel3 = shoppingListDetailsViewModel;
            ShoppingListDetailsViewModel.y6(shoppingListDetailsViewModel3, mutableStateFlow, null, null, null, false, false, false, r0, Boolean.TRUE, StatefulButtonState.d, null, null, null, 3647);
            if (arrayList.isEmpty()) {
                BuildersKt.c(ViewModelKt.a(shoppingListDetailsViewModel3), r15, r15, new ShoppingListDetailsViewModel$handleBoostAllSuccess$1(shoppingListDetailsViewModel3, r0, r15), 3);
            }
        } else {
            ShoppingListDetailsViewModel shoppingListDetailsViewModel4 = shoppingListDetailsViewModel;
            MutableStateFlow mutableStateFlow3 = mutableStateFlow;
            if (!(productBoostResult instanceof ProductBoostResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            ShoppingListDetailsViewModel.y6(shoppingListDetailsViewModel4, mutableStateFlow3, null, null, null, false, false, false, null, null, StatefulButtonState.d, null, null, null, 3839);
            if (((ProductBoostResult.Failure) productBoostResult).c instanceof ProductBoostFailureCause.NoConnectivity) {
                shoppingListDetailsViewModel4.x.f(new ShoppingListDetailsContract.Actions.ShowSnackbar(new ResText(R.string.error_no_network)));
            }
        }
        return Unit.f24250a;
    }
}
