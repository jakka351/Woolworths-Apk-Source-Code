package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.RewardsOfferAction;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.lists.ui.lists.analytics.SharedListsActions;
import au.com.woolworths.shop.lists.ui.shoppinglist.analytics.ShoppingListDetailsActions;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListDetailsUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.utils.ShoppingListsExtKt;
import au.com.woolworths.shop.lists.ui.shoppinglist.utils.TrolleyResultWithMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsAnalyticsDecorator$actions$1", f = "ShoppingListDetailsAnalyticsDecorator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListDetailsAnalyticsDecorator$actions$1 extends SuspendLambda implements Function2<ShoppingListDetailsContract.Actions, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ ShoppingListDetailsAnalyticsDecorator q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListDetailsAnalyticsDecorator$actions$1(ShoppingListDetailsAnalyticsDecorator shoppingListDetailsAnalyticsDecorator, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListDetailsAnalyticsDecorator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ShoppingListDetailsAnalyticsDecorator$actions$1 shoppingListDetailsAnalyticsDecorator$actions$1 = new ShoppingListDetailsAnalyticsDecorator$actions$1(this.q, continuation);
        shoppingListDetailsAnalyticsDecorator$actions$1.p = obj;
        return shoppingListDetailsAnalyticsDecorator$actions$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ShoppingListDetailsAnalyticsDecorator$actions$1 shoppingListDetailsAnalyticsDecorator$actions$1 = (ShoppingListDetailsAnalyticsDecorator$actions$1) create((ShoppingListDetailsContract.Actions) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        shoppingListDetailsAnalyticsDecorator$actions$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ShoppingListDetailsContract.Actions actions = (ShoppingListDetailsContract.Actions) this.p;
        ShoppingListDetailsAnalyticsDecorator shoppingListDetailsAnalyticsDecorator = this.q;
        AnalyticsManager analyticsManager = shoppingListDetailsAnalyticsDecorator.e;
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = shoppingListDetailsAnalyticsDecorator.d;
        if (actions instanceof ShoppingListDetailsContract.Actions.LaunchListOptionsMenu) {
            shoppingListDetailsAnalyticsDecorator.c(new ShoppingListDetailsActions.OverflowMenuClick(iShoppingListDetailsViewModel.u0()), null);
            shoppingListDetailsAnalyticsDecorator.c(new ShoppingListDetailsActions.ListOptionsBottomsheet(iShoppingListDetailsViewModel.u0()), null);
        } else if (actions instanceof ShoppingListDetailsContract.Actions.LaunchDeleteListConfirmation) {
            shoppingListDetailsAnalyticsDecorator.c(new SharedListsActions.DeleteListImpression(iShoppingListDetailsViewModel.S0()), null);
        } else if (actions instanceof ShoppingListDetailsContract.Actions.LaunchRemoveAllConfirmation) {
            shoppingListDetailsAnalyticsDecorator.c(new ShoppingListDetailsActions.RemoveAllItemsClickDialog(iShoppingListDetailsViewModel.u0()), null);
        } else if (actions instanceof ShoppingListDetailsContract.Actions.ShowSngCheckOffDialog) {
            shoppingListDetailsAnalyticsDecorator.c(new ShoppingListDetailsActions.AutoCheckOffDialog(iShoppingListDetailsViewModel.u0()), null);
        } else if (actions instanceof ShoppingListDetailsContract.Actions.ShowCheckProductItemsSnackbar) {
            int i = ((ShoppingListDetailsContract.Actions.ShowCheckProductItemsSnackbar) actions).d;
            shoppingListDetailsAnalyticsDecorator.c(new ShoppingListDetailsActions.CheckProductItemSnackbar(iShoppingListDetailsViewModel.u0()), i + " product(s) moved to checked items");
        } else if (actions instanceof ShoppingListDetailsContract.Actions.ShowAddToCartResultSnackbar) {
            ShoppingListDetailsContract.Actions.ShowAddToCartResultSnackbar showAddToCartResultSnackbar = (ShoppingListDetailsContract.Actions.ShowAddToCartResultSnackbar) actions;
            TrolleyResultWithMessage trolleyResultWithMessage = showAddToCartResultSnackbar.b;
            List list = showAddToCartResultSnackbar.c;
            ArrayList arrayList = showAddToCartResultSnackbar.d;
            ShoppingListDetailsUiModel shoppingListDetailsUiModel = ((ShoppingListDetailsContract.ViewState) iShoppingListDetailsViewModel.getY().getValue()).f12428a;
            if (shoppingListDetailsUiModel != null) {
                Result result = trolleyResultWithMessage.f12453a;
                Action productAddToCartFailureSnackbarImpression = (result == null || !result.b()) ? new ShoppingListDetailsActions.ProductAddToCartFailureSnackbarImpression(iShoppingListDetailsViewModel.u0()) : new ShoppingListDetailsActions.ProductAddToCartSuccessSnackbarImpression(iShoppingListDetailsViewModel.u0());
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ProductItemUiModel) it.next()).g);
                }
                ArrayList arrayListD = ShoppingListsExtKt.d(shoppingListDetailsUiModel, arrayList2);
                ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayListD, 10));
                Iterator it2 = arrayListD.iterator();
                while (it2.hasNext()) {
                    ProductCard productCard = (ProductCard) it2.next();
                    arrayList3.add(arrayList.contains(productCard.getProductId()) ? ProductAnalyticsExtKt.k(productCard, RewardsOfferAction.f) : ProductAnalyticsExtKt.k(productCard, RewardsOfferAction.g));
                }
                TrackingMetadata trackingMetadataA = ShoppingListDetailsAnalyticsDecorator.a(shoppingListDetailsAnalyticsDecorator, arrayList3, trolleyResultWithMessage.c, 2);
                if (trackingMetadataA != null) {
                    analyticsManager.j(productAddToCartFailureSnackbarImpression, trackingMetadataA);
                }
            }
        } else if (actions instanceof ShoppingListDetailsContract.Actions.ShowBoostAllSuccessSnackbar) {
            Iterable iterable = (Iterable) ((ShoppingListDetailsContract.Actions.ShowBoostAllSuccessSnackbar) actions).b;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.s(iterable, 10));
            Iterator it3 = iterable.iterator();
            while (it3.hasNext()) {
                arrayList4.add(ProductAnalyticsExtKt.k((ProductCard) it3.next(), RewardsOfferAction.f));
            }
            TrackingMetadata trackingMetadataA2 = ShoppingListDetailsAnalyticsDecorator.a(shoppingListDetailsAnalyticsDecorator, arrayList4, null, 6);
            if (trackingMetadataA2 != null) {
                analyticsManager.j(new ShoppingListDetailsActions.BoostAllSuccessSnackbar(iShoppingListDetailsViewModel.u0()), trackingMetadataA2);
            }
        }
        return Unit.f24250a;
    }
}
