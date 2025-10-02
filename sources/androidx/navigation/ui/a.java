package androidx.navigation.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.View;
import android.widget.NumberPicker;
import androidx.appcompat.app.AlertDialog;
import androidx.camera.core.impl.e;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.ui.AppBarConfiguration;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.RecyclerViewListener;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders.AddedGiftCardViewHolder;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders.ExpiredCreditCardViewHolder;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders.ExpiredGiftCardViewHolder;
import au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutActivity;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonClickHandler;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler;
import au.com.woolworths.feature.shop.catalogue.details.CataloguePageItemClickListener;
import au.com.woolworths.feature.shop.catalogue.details.CataloguePageView;
import au.com.woolworths.feature.shop.catalogue.models.CataloguePageItem;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageContract;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel;
import au.com.woolworths.feature.shop.homepage.presentation.g;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.clickablerect.ClickableRect;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.clickablerect.ClickableRectGroup;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.clickablerect.OnItemClickListener;
import au.com.woolworths.feature.shop.storelocator.ItemStoreLocatorLocationBindingModel_;
import au.com.woolworths.feature.shop.storelocator.ItemStoreLocatorSuburbBindingModel_;
import au.com.woolworths.feature.shop.storelocator.StoreLocatorEpoxyController;
import au.com.woolworths.feature.shop.storelocator.legacy.ItemStoreLocatorSuburbMatchBindingModel_;
import au.com.woolworths.feature.shop.storelocator.legacy.LegacyItemStoreLocatorLocationBindingModel_;
import au.com.woolworths.foundation.barcode.reader.view.BarcodeReaderActivity;
import au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerContract;
import au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerView;
import au.com.woolworths.pay.sdk.web.UpdateCreditCardView;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.product.addtocart.AddToCartContract;
import au.com.woolworths.product.addtocart.AddToCartViewModel;
import au.com.woolworths.product.productbottomsheet.ProductBottomSheetActionType;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProductSubstitution;
import au.com.woolworths.shop.checkout.ui.components.ItemCheckoutProductsSubstitution;
import au.com.woolworths.shop.checkout.ui.components.ItemCheckoutPromotionCode;
import au.com.woolworths.shop.checkout.ui.product.CheckoutProductListener;
import au.com.woolworths.shop.checkout.ui.product.CheckoutPromoCodeListener;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.snackbar.Snackbar;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.OnBalloonOverlayClickListener;
import com.woolworths.scanlibrary.databinding.DialogItemQuantityPickerBinding;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.models.receipt.Voucher;
import com.woolworths.scanlibrary.ui.home.itemview.views.ItemQuantityPickerDialog;
import com.woolworths.scanlibrary.ui.receipt.adapter.ReceiptAdapter;
import com.woolworths.scanlibrary.ui.receipt.adapter.viewholders.ParkingVoucherViewHolder;
import com.woolworths.scanlibrary.ui.stores.dto.StateDTO;
import com.woolworths.scanlibrary.ui.stores.viewholders.AvailableStateItemViewHolder;
import com.woolworths.scanlibrary.ui.transaction.TransactionListActivity;
import com.woolworths.scanlibrary.ui.transaction.TransactionListCategory;
import com.woolworths.scanlibrary.ui.transaction.TransactionListContract;
import com.woolworths.scanlibrary.ui.weighted.WeightedArticleSelectionActivity;
import com.woolworths.scanlibrary.util.widget.ImageItem;
import com.woolworths.scanlibrary.util.widget.MoreDetailAlertDialogHelper;
import com.woolworths.scanlibrary.util.widget.WeightedListListener;
import com.woolworths.scanlibrary.util.widget.WeightedListView;
import java.util.LinkedList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: Type inference failed for: r8v49, types: [com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, com.woolworths.scanlibrary.ui.home.itemview.views.ItemQuantityPickerDialog$OnFragmentInteractionListener] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AppBarConfiguration.OnNavigateUpListener onNavigateUpListener;
        HomePageContract.Actions.ShowCoachMarkContent showCoachMarkContent;
        ?? r8;
        int i = this.d;
        int i2 = 1;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                NavController navController = (NavController) obj2;
                AppBarConfiguration appBarConfiguration = (AppBarConfiguration) obj;
                Callback.g(view);
                try {
                    navController.b.f();
                    if (!navController.f() && (onNavigateUpListener = appBarConfiguration.b) != null) {
                        onNavigateUpListener.a();
                    }
                    return;
                } finally {
                }
            case 1:
                AddedGiftCardViewHolder addedGiftCardViewHolder = (AddedGiftCardViewHolder) obj2;
                RecyclerViewListener.View view2 = (RecyclerViewListener.View) obj;
                int i3 = AddedGiftCardViewHolder.e;
                Callback.g(view);
                try {
                    if (view2 != null) {
                        view2.a(addedGiftCardViewHolder.getAdapterPosition());
                    } else {
                        addedGiftCardViewHolder.getClass();
                    }
                    return;
                } finally {
                }
            case 2:
                ExpiredCreditCardViewHolder expiredCreditCardViewHolder = (ExpiredCreditCardViewHolder) obj2;
                e eVar = (e) obj;
                int i4 = ExpiredCreditCardViewHolder.g;
                Callback.g(view);
                try {
                    if (expiredCreditCardViewHolder.b != null) {
                        eVar.a(expiredCreditCardViewHolder.getAdapterPosition());
                        UpdateCreditCardView updateCreditCardView = (UpdateCreditCardView) expiredCreditCardViewHolder.b.get();
                        updateCreditCardView.getClass();
                        updateCreditCardView.d(new JSONObject());
                    }
                    return;
                } finally {
                }
            case 3:
                ExpiredGiftCardViewHolder expiredGiftCardViewHolder = (ExpiredGiftCardViewHolder) obj2;
                RecyclerViewListener.View view3 = (RecyclerViewListener.View) obj;
                int i5 = ExpiredGiftCardViewHolder.b;
                Callback.g(view);
                try {
                    if (view3 != null) {
                        view3.a(expiredGiftCardViewHolder.getAdapterPosition());
                    } else {
                        expiredGiftCardViewHolder.getClass();
                    }
                    return;
                } finally {
                }
            case 4:
                NavDestination navDestination = (NavDestination) obj2;
                CheckoutActivity checkoutActivity = (CheckoutActivity) obj;
                int i6 = CheckoutActivity.I;
                Callback.g(view);
                try {
                    CheckoutActivity.T4(navDestination, checkoutActivity);
                    return;
                } finally {
                }
            case 5:
                StatefulButtonClickHandler statefulButtonClickHandler = (StatefulButtonClickHandler) obj2;
                StatefulButton statefulButton = (StatefulButton) obj;
                int i7 = StatefulButton.i;
                Callback.g(view);
                try {
                    statefulButtonClickHandler.T2(statefulButton, statefulButton.g);
                    return;
                } finally {
                }
            case 6:
                ButtonClickHandler buttonClickHandler = (ButtonClickHandler) obj2;
                ButtonApiData buttonApiData = (ButtonApiData) obj;
                Callback.g(view);
                if (buttonClickHandler != null) {
                    try {
                        buttonClickHandler.O2(buttonApiData);
                    } finally {
                    }
                }
                return;
            case 7:
                CataloguePageView cataloguePageView = (CataloguePageView) obj2;
                CataloguePageItem cataloguePageItem = (CataloguePageItem) obj;
                int i8 = CataloguePageView.i;
                Callback.g(view);
                try {
                    CataloguePageItemClickListener cataloguePageItemClickListener = cataloguePageView.cataloguePageItemClickListener;
                    if (cataloguePageItemClickListener != null) {
                        cataloguePageItemClickListener.a(cataloguePageItem);
                    }
                    return;
                } finally {
                }
            case 8:
                Balloon balloon = (Balloon) obj2;
                HomePageFragment homePageFragment = (HomePageFragment) obj;
                Callback.g(view);
                try {
                    balloon.m(new g(homePageFragment, i2));
                    balloon.c();
                    HomePageViewModel homePageViewModelH2 = homePageFragment.h2();
                    LinkedList linkedList = homePageViewModelH2.E;
                    linkedList.poll();
                    if (homePageViewModelH2.D && homePageViewModelH2.z && (showCoachMarkContent = (HomePageContract.Actions.ShowCoachMarkContent) linkedList.peek()) != null) {
                        homePageViewModelH2.w6(showCoachMarkContent);
                    }
                    if (linkedList.isEmpty()) {
                        homePageViewModelH2.l.N();
                    }
                    return;
                } finally {
                }
            case 9:
                ClickableRectGroup clickableRectGroup = (ClickableRectGroup) obj2;
                ClickableRect clickableRect = (ClickableRect) obj;
                int i9 = ClickableRectGroup.l;
                Callback.g(view);
                try {
                    OnItemClickListener onItemClickListener = clickableRectGroup.onItemClickListener;
                    if (onItemClickListener != null) {
                        onItemClickListener.a(clickableRect.b);
                    }
                    return;
                } finally {
                }
            case 10:
                StoreLocatorEpoxyController.m44xe440b42c((StoreLocatorEpoxyController) obj2, (ItemStoreLocatorLocationBindingModel_) obj, view);
                return;
            case 11:
                StoreLocatorEpoxyController.m45xfee3faf8((StoreLocatorEpoxyController) obj2, (ItemStoreLocatorSuburbBindingModel_) obj, view);
                return;
            case 12:
                au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorEpoxyController.m46x46acdfdd((au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorEpoxyController) obj2, (LegacyItemStoreLocatorLocationBindingModel_) obj, view);
                return;
            case 13:
                au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorEpoxyController.m47xf5329d11((au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorEpoxyController) obj2, (ItemStoreLocatorSuburbMatchBindingModel_) obj, view);
                return;
            case 14:
                BarcodeReaderActivity barcodeReaderActivity = (BarcodeReaderActivity) obj2;
                Integer num = (Integer) obj;
                String[] strArr = BarcodeReaderActivity.z;
                Callback.g(view);
                try {
                    ResultReceiver resultReceiver = barcodeReaderActivity.v;
                    if (resultReceiver == null) {
                        Intrinsics.p("resultReceiver");
                        throw null;
                    }
                    Bundle bundle = new Bundle();
                    Intrinsics.e(num);
                    bundle.putInt("extra_user_cancelled_triggering_resource", num.intValue());
                    resultReceiver.send(0, bundle);
                    barcodeReaderActivity.finish();
                    return;
                } finally {
                }
            case 15:
                EditOrderBannerView editOrderBannerView = (EditOrderBannerView) obj2;
                EditOrderBannerContract.ViewState viewState = (EditOrderBannerContract.ViewState) obj;
                int i10 = EditOrderBannerView.i;
                Callback.g(view);
                try {
                    EditOrderBannerView.d(editOrderBannerView, viewState);
                    return;
                } finally {
                }
            case 16:
                AddToCartBottomSheetFragment addToCartBottomSheetFragment = (AddToCartBottomSheetFragment) obj2;
                AddToCartContract.Actions.ShowBoostFailureSnackbar showBoostFailureSnackbar = (AddToCartContract.Actions.ShowBoostFailureSnackbar) obj;
                Callback.g(view);
                try {
                    AddToCartViewModel addToCartViewModel = (AddToCartViewModel) addToCartBottomSheetFragment.i.getD();
                    ProductBottomSheetActionType actionType = showBoostFailureSnackbar.f9246a;
                    Intrinsics.h(actionType, "actionType");
                    int iOrdinal = actionType.ordinal();
                    if (iOrdinal == 0) {
                        addToCartViewModel.r6();
                    } else if (iOrdinal == 1) {
                        addToCartViewModel.x6();
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        addToCartViewModel.u6();
                    }
                    return;
                } finally {
                }
            case 17:
                String str = (String) obj2;
                Context context = (Context) obj;
                Callback.g(view);
                try {
                    context.startActivity(Activities.ShoppingListDetails.f4535a.b(str, false));
                    return;
                } finally {
                }
            case 18:
                ItemCheckoutProductsSubstitution itemCheckoutProductsSubstitution = (ItemCheckoutProductsSubstitution) obj2;
                CheckoutProductSubstitution checkoutProductSubstitution = (CheckoutProductSubstitution) obj;
                Callback.g(view);
                try {
                    CheckoutProductListener checkoutProductListener = itemCheckoutProductsSubstitution.o;
                    if (checkoutProductListener != null) {
                        checkoutProductListener.B5(checkoutProductSubstitution.d);
                        return;
                    } else {
                        Intrinsics.p(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                        throw null;
                    }
                } finally {
                }
            case 19:
                ItemCheckoutPromotionCode itemCheckoutPromotionCode = (ItemCheckoutPromotionCode) obj2;
                ItemCheckoutPromotionCode.ViewHolder viewHolder = (ItemCheckoutPromotionCode.ViewHolder) obj;
                Callback.g(view);
                try {
                    CheckoutPromoCodeListener checkoutPromoCodeListener = itemCheckoutPromotionCode.o;
                    if (checkoutPromoCodeListener != null) {
                        checkoutPromoCodeListener.Z2(String.valueOf(viewHolder.b().getText()));
                        return;
                    } else {
                        Intrinsics.p(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                        throw null;
                    }
                } finally {
                }
            case 20:
                Snackbar snackbar = (Snackbar) obj2;
                View.OnClickListener onClickListener = (View.OnClickListener) obj;
                int[] iArr = Snackbar.F;
                Callback.g(view);
                try {
                    snackbar.getClass();
                    onClickListener.onClick(view);
                    snackbar.b(1);
                    return;
                } finally {
                }
            case 21:
                OnBalloonOverlayClickListener onBalloonOverlayClickListener = (OnBalloonOverlayClickListener) obj2;
                Balloon balloon2 = (Balloon) obj;
                Callback.g(view);
                if (onBalloonOverlayClickListener != null) {
                    try {
                        onBalloonOverlayClickListener.a();
                    } finally {
                    }
                }
                if (balloon2.e.N) {
                    balloon2.c();
                }
                return;
            case 22:
                NumberPicker numberPicker = ((DialogItemQuantityPickerBinding) obj2).A;
                ItemQuantityPickerDialog itemQuantityPickerDialog = (ItemQuantityPickerDialog) obj;
                Callback.g(view);
                try {
                    if (numberPicker.getValue() != itemQuantityPickerDialog.e && (r8 = itemQuantityPickerDialog.f) != 0) {
                        r8.M(numberPicker.getValue());
                    }
                    itemQuantityPickerDialog.dismiss();
                    return;
                } finally {
                }
            case 23:
                ParkingVoucherViewHolder parkingVoucherViewHolder = (ParkingVoucherViewHolder) obj2;
                Voucher voucher = (Voucher) obj;
                int i11 = ParkingVoucherViewHolder.c;
                Callback.g(view);
                try {
                    ReceiptAdapter.ReceiptAdapterListener receiptAdapterListener = parkingVoucherViewHolder.b;
                    if (receiptAdapterListener != null) {
                        receiptAdapterListener.z0(voucher);
                    }
                    return;
                } finally {
                }
            case 24:
                AvailableStateItemViewHolder availableStateItemViewHolder = (AvailableStateItemViewHolder) obj2;
                StateDTO stateDTO = (StateDTO) obj;
                int i12 = AvailableStateItemViewHolder.c;
                Callback.g(view);
                try {
                    availableStateItemViewHolder.b.a(stateDTO, availableStateItemViewHolder.getAdapterPosition());
                    return;
                } finally {
                }
            case 25:
                TransactionListActivity transactionListActivity = (TransactionListActivity) obj2;
                TransactionListCategory transactionListCategory = (TransactionListCategory) obj;
                Callback.g(view);
                try {
                    ((TransactionListContract.Presenter) transactionListActivity.S4()).L0(((TransactionListCategory.TransactionLineItem) transactionListCategory).b.getCartId());
                    return;
                } finally {
                }
            case 26:
                WeightedArticleSelectionActivity weightedArticleSelectionActivity = (WeightedArticleSelectionActivity) obj2;
                Item item = (Item) obj;
                Callback.g(view);
                try {
                    weightedArticleSelectionActivity.m(item);
                    return;
                } finally {
                }
            case 27:
                MoreDetailAlertDialogHelper moreDetailAlertDialogHelper = (MoreDetailAlertDialogHelper) obj2;
                Function0 function0 = (Function0) obj;
                Callback.g(view);
                try {
                    moreDetailAlertDialogHelper.k = true;
                    AlertDialog alertDialog = moreDetailAlertDialogHelper.b;
                    if (alertDialog != null) {
                        alertDialog.dismiss();
                    }
                    function0.invoke();
                    return;
                } finally {
                }
            default:
                WeightedListView weightedListView = (WeightedListView) obj2;
                ImageItem imageItem = (ImageItem) obj;
                Callback.g(view);
                try {
                    WeightedListListener weightedListListener = weightedListView.g;
                    if (weightedListListener != null) {
                        weightedListListener.I(imageItem.getEan());
                    }
                    return;
                } finally {
                }
        }
    }
}
