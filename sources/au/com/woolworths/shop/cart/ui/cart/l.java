package au.com.woolworths.shop.cart.ui.cart;

import android.net.Uri;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.PageKeyedDataSource;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetState;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.shop.cart.data.model.CartBanner;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductCard;
import au.com.woolworths.pagingutils.NetworkState;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialBannerData;
import au.com.woolworths.shop.aem.components.model.offercard.OfferCardDataKt;
import au.com.woolworths.shop.cart.ui.ProductSectionItemListener;
import au.com.woolworths.shop.cart.ui.cart.CartContract;
import au.com.woolworths.shop.checkout.domain.model.ApplyCheckoutPromoCodeResult;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProduct;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProducts;
import au.com.woolworths.shop.checkout.domain.model.FooterData;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindows;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsOption;
import au.com.woolworths.shop.checkout.domain.model.PreferenceText;
import au.com.woolworths.shop.checkout.domain.model.PreferenceToggle;
import au.com.woolworths.shop.checkout.domain.model.substitution.ProductSubstitute;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentBottomSheet;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutAnalyticsExtKt;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutDetailsActions;
import au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsListener;
import au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsViewModel;
import au.com.woolworths.shop.checkout.ui.epoxy.controller.CheckoutProductEpoxyController;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFooterUiKt$FulfilmentWindowsFooterUi$lambda$5$lambda$4$$inlined$onDispose$1;
import au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsListener;
import au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorContract;
import au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorViewModel;
import au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector.DateSelectorKt;
import au.com.woolworths.shop.checkout.ui.timeselector.compose.suggestedtimeslot.SuggestedTimeSlotsKt;
import au.com.woolworths.shop.checkout.ui.timeselector.compose.timeofdayselector.TimeOfDaySelectorKt;
import au.com.woolworths.shop.checkout.ui.timeselector.uimodel.DateItem;
import au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeOfDay;
import au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeSelectorUiItem;
import au.com.woolworths.shop.lists.data.entity.ShoppingListEntity;
import au.com.woolworths.shop.lists.data.entity.TextListItemEntity;
import au.com.woolworths.shop.lists.data.model.SuggestedListItem;
import au.com.woolworths.shop.lists.data.remote.SyncListItemsMutation;
import au.com.woolworths.shop.lists.data.utils.ListsDataUtilsKt;
import au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsEpoxyController;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import au.com.woolworths.shop.lists.ui.snapalist.main.CameraCaptureManager;
import au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorActivity;
import au.com.woolworths.shop.specials.SpecialsHomeContract;
import au.com.woolworths.shop.specials.SpecialsHomeViewModel;
import com.google.accompanist.permissions.MultiplePermissionsState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.scanlibrary.data.cart.Cart;
import com.woolworths.scanlibrary.domain.cart.RemoveItemUseCase;
import com.woolworths.scanlibrary.domain.cart.UpdateProductUseCase;
import com.woolworths.scanlibrary.domain.device.DeviceRegistrationUC;
import com.woolworths.scanlibrary.domain.productsearch.ProductSearchUC;
import com.woolworths.scanlibrary.models.cart.CartResponse;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.models.product.search.SearchResponse;
import com.woolworths.scanlibrary.ui.productsearch.datasource.PagedKeyProductSearchDataSource;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.MutableStateFlow;
import okhttp3.ResponseBody;

/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [androidx.compose.runtime.MutableState] */
    /* JADX WARN: Type inference failed for: r13v13, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r13v20, types: [kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TextListItemEntity textListItemEntityCopy$default;
        long j;
        String strB;
        SearchResponse searchResponse;
        SearchResponse searchResponse2;
        List products;
        SearchResponse searchResponse3;
        SearchResponse searchResponse4;
        List products2;
        int i = this.d;
        List list = EmptyList.d;
        boolean z = false;
        nextPageUrl = null;
        String nextPageUrl = null;
        nextPageUrl = null;
        String nextPageUrl2 = null;
        Unit unit = Unit.f24250a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                ProductSectionItemListener productSectionItemListener = (ProductSectionItemListener) obj3;
                CartProductCard cartProductCard = (CartProductCard) obj2;
                double dDoubleValue = ((Double) obj).doubleValue();
                if (productSectionItemListener != null) {
                    productSectionItemListener.S1(cartProductCard, dDoubleValue);
                }
                return unit;
            case 1:
                CartBanner cartBanner = (CartBanner) obj3;
                CartViewModel cartViewModel = (CartViewModel) obj2;
                Intrinsics.h((InsetBanner) obj, "it");
                int iOrdinal = cartBanner.b.ordinal();
                if (iOrdinal == 0) {
                    CartScreenKt.d.e("Unexpected banner action: " + cartBanner, new Object[0]);
                } else if (iOrdinal == 1) {
                    cartViewModel.getClass();
                    cartViewModel.v6(cartBanner);
                    cartViewModel.l.k(CartContract.Actions.ShowProductReview.f10481a);
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CartScreenKt.d.e("Unexpected banner action: " + cartBanner, new Object[0]);
                } else {
                    cartViewModel.getClass();
                    cartViewModel.v6(cartBanner);
                    cartViewModel.l.k(CartContract.Actions.ShowFulfilmentWindowNoResult.f10479a);
                }
                return unit;
            case 2:
                final LifecycleOwner lifecycleOwner = (LifecycleOwner) obj3;
                final MutableState mutableState = (MutableState) obj2;
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                final au.com.woolworths.compose.utils.modifier.o oVar = new au.com.woolworths.compose.utils.modifier.o(mutableState, 1);
                lifecycleOwner.getD().a(oVar);
                return new DisposableEffectResult() { // from class: au.com.woolworths.shop.cart.ui.shared.CartFooterKt$CartFooter$lambda$6$lambda$5$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        lifecycleOwner.getD().c(oVar);
                        mutableState.setValue(Boolean.FALSE);
                    }
                };
            case 3:
                Function0 function0 = (Function0) obj2;
                if (!((SheetState) obj3).f4725a.d()) {
                    function0.invoke();
                }
                return unit;
            case 4:
                FulfilmentWindows fulfilmentWindows = (FulfilmentWindows) obj2;
                FulfilmentWindowsOption it = (FulfilmentWindowsOption) obj;
                Intrinsics.h(it, "it");
                ((FulfilmentWindowsListener) obj3).J(fulfilmentWindows.f10610a, fulfilmentWindows, it);
                return unit;
            case 5:
                String it2 = (String) obj;
                Intrinsics.h(it2, "it");
                ((CheckoutDetailsListener) obj3).M4(((PreferenceText) obj2).f10630a, it2);
                return unit;
            case 6:
                ((CheckoutDetailsListener) obj3).G5(((PreferenceToggle) obj2).f10631a, ((Boolean) obj).booleanValue());
                return unit;
            case 7:
                ((CheckoutDetailsViewModel) obj3).E6(CheckoutDetailsActions.DataLoaded.e, CheckoutAnalyticsExtKt.a((Checkout) obj));
                ((Function0) obj2).invoke();
                return unit;
            case 8:
                ((CheckoutProductEpoxyController) obj3).checkoutProductListener.D3(((Boolean) obj).booleanValue(), (CheckoutProduct) obj2);
                return unit;
            case 9:
                CheckoutProducts checkoutProducts = (CheckoutProducts) obj2;
                ((CheckoutProductEpoxyController) obj3).checkoutProductListener.F0(((Boolean) obj).booleanValue(), checkoutProducts.d, checkoutProducts.e);
                return unit;
            case 10:
                FooterData footerData = (FooterData) obj3;
                MutableState mutableState2 = (MutableState) obj2;
                DisposableEffectScope DisposableEffect2 = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect2, "$this$DisposableEffect");
                if (footerData != null) {
                    mutableState2.setValue(footerData);
                }
                return new FulfilmentWindowsFooterUiKt$FulfilmentWindowsFooterUi$lambda$5$lambda$4$$inlined$onDispose$1();
            case 11:
                Integer num = (Integer) obj3;
                ?? r12 = (MutableState) obj2;
                String inputText = (String) obj;
                Intrinsics.h(inputText, "inputText");
                if (inputText.length() <= (num != null ? num.intValue() : 200)) {
                    r12.setValue(inputText);
                }
                return unit;
            case 12:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((Function2) obj3).invoke(((ProductSubstitute) obj2).c, bool);
                return unit;
            case 13:
                Intrinsics.h((InsetBanner) obj, "it");
                ((Function1) obj3).invoke((ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeAdditionalInfo) obj2);
                return unit;
            case 14:
                final TimeSelectorViewModel timeSelectorViewModel = (TimeSelectorViewModel) obj2;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.h(LazyColumn, "$this$LazyColumn");
                final List list2 = ((TimeSelectorContract.ViewState) ((State) obj3).getD()).f10838a;
                LazyColumn.b(list2.size(), null, new Function1<Integer, Object>() { // from class: au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorScreenKt$TimeSelectorScreen$5$invoke$lambda$16$lambda$13$lambda$12$$inlined$itemsIndexed$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        list2.get(((Number) obj4).intValue());
                        return null;
                    }
                }, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorScreenKt$TimeSelectorScreen$5$invoke$lambda$16$lambda$13$lambda$12$$inlined$itemsIndexed$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i2;
                        Object next;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj4;
                        int iIntValue = ((Number) obj5).intValue();
                        Composer composer = (Composer) obj6;
                        int iIntValue2 = ((Number) obj7).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i2 = (composer.n(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i2 = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i2 |= composer.r(iIntValue) ? 32 : 16;
                        }
                        if (composer.z(i2 & 1, (i2 & 147) != 146)) {
                            TimeSelectorUiItem timeSelectorUiItem = (TimeSelectorUiItem) list2.get(iIntValue);
                            composer.o(1037460230);
                            boolean z2 = timeSelectorUiItem instanceof TimeSelectorUiItem.DateSelectorUiItem;
                            Modifier.Companion companion = Modifier.Companion.d;
                            Object obj8 = Composer.Companion.f1624a;
                            final TimeSelectorViewModel timeSelectorViewModel2 = timeSelectorViewModel;
                            if (z2) {
                                composer.o(1037472443);
                                Modifier modifierJ = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
                                ArrayList arrayList = ((TimeSelectorUiItem.DateSelectorUiItem) timeSelectorUiItem).f10844a;
                                composer.o(5004770);
                                boolean zI = composer.I(timeSelectorViewModel2);
                                Object objG = composer.G();
                                if (zI || objG == obj8) {
                                    TimeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$1$1 timeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$1$1 = new TimeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$1$1(1, timeSelectorViewModel, TimeSelectorViewModel.class, "onDateClick", "onDateClick(Lau/com/woolworths/shop/checkout/ui/timeselector/uimodel/DateItem;)V", 0);
                                    composer.A(timeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$1$1);
                                    objG = timeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$1$1;
                                }
                                composer.l();
                                DateSelectorKt.a(arrayList, modifierJ, (Function1) ((KFunction) objG), composer, 48);
                                composer.l();
                            } else if (timeSelectorUiItem instanceof TimeSelectorUiItem.TimeOfDaySelectorUiItem) {
                                composer.o(1037976038);
                                TimeSelectorUiItem.TimeOfDaySelectorUiItem timeOfDaySelectorUiItem = (TimeSelectorUiItem.TimeOfDaySelectorUiItem) timeSelectorUiItem;
                                List list3 = timeOfDaySelectorUiItem.b;
                                Iterator it3 = list3.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it3.next();
                                    if (((TimeOfDay) next).b) {
                                        break;
                                    }
                                }
                                TimeOfDay timeOfDay = (TimeOfDay) next;
                                List list4 = timeOfDay != null ? timeOfDay.e : null;
                                if (list4 == null) {
                                    list4 = EmptyList.d;
                                }
                                float f = 16;
                                Modifier modifierI = PaddingKt.i(companion, f, timeOfDaySelectorUiItem.f10846a != null ? 16 : 10, f, f);
                                String str = timeOfDaySelectorUiItem.f10846a;
                                composer.o(5004770);
                                boolean zI2 = composer.I(timeSelectorViewModel2);
                                Object objG2 = composer.G();
                                if (zI2 || objG2 == obj8) {
                                    TimeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$2$1 timeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$2$1 = new TimeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$2$1(1, timeSelectorViewModel, TimeSelectorViewModel.class, "onTimeOfDayClick", "onTimeOfDayClick(Lau/com/woolworths/shop/checkout/ui/timeselector/uimodel/TimeOfDay;)V", 0);
                                    composer.A(timeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$2$1);
                                    objG2 = timeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$2$1;
                                }
                                KFunction kFunction = (KFunction) objG2;
                                composer.l();
                                composer.o(5004770);
                                boolean zI3 = composer.I(timeSelectorViewModel2);
                                Object objG3 = composer.G();
                                if (zI3 || objG3 == obj8) {
                                    TimeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$3$1 timeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$3$1 = new TimeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$3$1(1, timeSelectorViewModel, TimeSelectorViewModel.class, "onTimeSlotClick", "onTimeSlotClick(Lau/com/woolworths/shop/checkout/domain/model/timeselector/FulfilmentSlot;)V", 0);
                                    composer.A(timeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$3$1);
                                    objG3 = timeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$3$1;
                                }
                                KFunction kFunction2 = (KFunction) objG3;
                                composer.l();
                                composer.o(5004770);
                                boolean zI4 = composer.I(timeSelectorViewModel2);
                                Object objG4 = composer.G();
                                if (zI4 || objG4 == obj8) {
                                    TimeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$4$1 timeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$4$1 = new TimeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$4$1(1, timeSelectorViewModel, TimeSelectorViewModel.class, "onEmptyTimeslotsForTimeOfDay", "onEmptyTimeslotsForTimeOfDay(Lau/com/woolworths/shop/checkout/ui/timeselector/uimodel/TimeOfDay;)V", 0);
                                    composer.A(timeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$4$1);
                                    objG4 = timeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$4$1;
                                }
                                composer.l();
                                TimeOfDaySelectorKt.a(str, list3, list4, (Function1) kFunction, (Function1) kFunction2, (Function1) ((KFunction) objG4), modifierI, composer, 0);
                                composer = composer;
                                composer.l();
                            } else {
                                if (!(timeSelectorUiItem instanceof TimeSelectorUiItem.SuggestedTimeSlotUiItem)) {
                                    throw au.com.woolworths.android.onesite.a.x(composer, -2044743523);
                                }
                                composer.o(1039343944);
                                TimeSelectorUiItem.SuggestedTimeSlotUiItem suggestedTimeSlotUiItem = (TimeSelectorUiItem.SuggestedTimeSlotUiItem) timeSelectorUiItem;
                                List list5 = suggestedTimeSlotUiItem.f10845a;
                                if (!list5.isEmpty()) {
                                    Modifier modifierJ2 = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, iIntValue != 0 ? 16 : 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
                                    String str2 = suggestedTimeSlotUiItem.b;
                                    FulfilmentBottomSheet fulfilmentBottomSheet = suggestedTimeSlotUiItem.c;
                                    composer.o(5004770);
                                    boolean zI5 = composer.I(timeSelectorViewModel2);
                                    Object objG5 = composer.G();
                                    if (zI5 || objG5 == obj8) {
                                        TimeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$5$1 timeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$5$1 = new TimeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$5$1(1, timeSelectorViewModel, TimeSelectorViewModel.class, "onTimeSlotClick", "onTimeSlotClick(Lau/com/woolworths/shop/checkout/domain/model/timeselector/FulfilmentSlot;)V", 0);
                                        composer.A(timeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$5$1);
                                        objG5 = timeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$5$1;
                                    }
                                    composer.l();
                                    Function1 function1 = (Function1) ((KFunction) objG5);
                                    composer.o(5004770);
                                    boolean zI6 = composer.I(timeSelectorViewModel2);
                                    Object objG6 = composer.G();
                                    if (zI6 || objG6 == obj8) {
                                        objG6 = new Function1<FulfilmentBottomSheet, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$6$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj9) {
                                                FulfilmentBottomSheet it4 = (FulfilmentBottomSheet) obj9;
                                                Intrinsics.h(it4, "it");
                                                TimeSelectorViewModel timeSelectorViewModel3 = timeSelectorViewModel2;
                                                timeSelectorViewModel3.getClass();
                                                MutableStateFlow mutableStateFlow = timeSelectorViewModel3.i;
                                                mutableStateFlow.setValue(TimeSelectorContract.ViewState.a((TimeSelectorContract.ViewState) mutableStateFlow.getValue(), null, null, null, null, it4, 63));
                                                return Unit.f24250a;
                                            }
                                        };
                                        composer.A(objG6);
                                    }
                                    composer.l();
                                    SuggestedTimeSlotsKt.a(str2, fulfilmentBottomSheet, list5, function1, (Function1) objG6, modifierJ2, composer, 0);
                                }
                                composer.l();
                            }
                            composer.l();
                        } else {
                            composer.j();
                        }
                        return Unit.f24250a;
                    }
                }, true, -1091073711));
                return unit;
            case 15:
                final ArrayList arrayList = (ArrayList) obj3;
                final Function1 function1 = (Function1) obj2;
                LazyListScope LazyRow = (LazyListScope) obj;
                Intrinsics.h(LazyRow, "$this$LazyRow");
                LazyRow.b(arrayList.size(), null, new Function1<Integer, Object>() { // from class: au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector.DateSelectorKt$DateSelector$lambda$6$lambda$5$$inlined$itemsIndexed$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        arrayList.get(((Number) obj4).intValue());
                        return null;
                    }
                }, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector.DateSelectorKt$DateSelector$lambda$6$lambda$5$$inlined$itemsIndexed$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i2;
                        Object obj8 = (LazyItemScope) obj4;
                        int iIntValue = ((Number) obj5).intValue();
                        Composer composer = (Composer) obj6;
                        int iIntValue2 = ((Number) obj7).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i2 = (composer.n(obj8) ? 4 : 2) | iIntValue2;
                        } else {
                            i2 = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i2 |= composer.r(iIntValue) ? 32 : 16;
                        }
                        if (composer.z(i2 & 1, (i2 & 147) != 146)) {
                            final DateItem dateItem = (DateItem) arrayList.get(iIntValue);
                            composer.o(864864085);
                            Modifier modifierJ = PaddingKt.j(Modifier.Companion.d, iIntValue == 0 ? 16 : 0, BitmapDescriptorFactory.HUE_RED, iIntValue == arrayList.size() - 1 ? 16 : 0, BitmapDescriptorFactory.HUE_RED, 10);
                            String str = dateItem.f10842a;
                            String str2 = dateItem.b;
                            String str3 = dateItem.c;
                            String str4 = dateItem.d;
                            boolean z2 = dateItem.e;
                            boolean z3 = dateItem.g;
                            boolean z4 = dateItem.f;
                            composer.o(-1633490746);
                            final Function1 function12 = function1;
                            boolean zN = composer.n(function12) | composer.I(dateItem);
                            Object objG = composer.G();
                            if (zN || objG == Composer.Companion.f1624a) {
                                objG = new Function0<Unit>() { // from class: au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector.DateSelectorKt$DateSelector$2$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function12.invoke(dateItem);
                                        return Unit.f24250a;
                                    }
                                };
                                composer.A(objG);
                            }
                            composer.l();
                            DateSelectorItemKt.a(str, str2, str3, str4, z2, z4, z3, (Function0) objG, modifierJ, composer, 0);
                            composer.l();
                        } else {
                            composer.j();
                        }
                        return Unit.f24250a;
                    }
                }, true, -1091073711));
                return unit;
            case 16:
                TextListItemEntity textListItemEntity = (TextListItemEntity) obj2;
                TextListItemEntity textListItemEntity2 = (TextListItemEntity) obj;
                return (textListItemEntity2 == null || (textListItemEntityCopy$default = TextListItemEntity.copy$default(textListItemEntity2, null, null, 0L, ListsDataUtilsKt.b(), null, 0L, true, false, false, (String) obj3, 439, null)) == null) ? textListItemEntity : textListItemEntityCopy$default;
            case 17:
                ShoppingListEntity shoppingListEntity = (ShoppingListEntity) obj2;
                ShoppingListEntity shoppingListEntity2 = (ShoppingListEntity) obj;
                long timestamp = (long) ((SyncListItemsMutation.SyncListItems) obj3).getTimestamp();
                if (shoppingListEntity2 != null) {
                    long localCreatedAt = shoppingListEntity2.getLocalCreatedAt();
                    if (localCreatedAt == 0) {
                        localCreatedAt = timestamp;
                    }
                    j = localCreatedAt;
                } else {
                    j = timestamp;
                }
                return shoppingListEntity.copy((4094 & 1) != 0 ? shoppingListEntity.id : null, (4094 & 2) != 0 ? shoppingListEntity.localCreatedAt : j, (4094 & 4) != 0 ? shoppingListEntity.localUpdatedAt : timestamp, (4094 & 8) != 0 ? shoppingListEntity.remoteId : null, (4094 & 16) != 0 ? shoppingListEntity.remoteTimestamp : timestamp, (4094 & 32) != 0 ? shoppingListEntity.isLocalEdited : false, (4094 & 64) != 0 ? shoppingListEntity.isLocalDeleted : false, (4094 & 128) != 0 ? shoppingListEntity.isRemoteEdited : false, (4094 & 256) != 0 ? shoppingListEntity.lastSyncedTime : ListsDataUtilsKt.b(), (4094 & 512) != 0 ? shoppingListEntity.title : null, (4094 & 1024) != 0 ? shoppingListEntity.color : 0, (4094 & 2048) != 0 ? shoppingListEntity.isWatchlist : null);
            case 18:
                Intrinsics.h((SuggestedListItem) obj, "it");
                ((SuggestedListsEpoxyController) obj3).onSuggestedListItemClicked.invoke((SuggestedListItem) obj2);
                return unit;
            case 19:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((Function2) obj3).invoke((ProductItemUiModel) obj2, bool2);
                return unit;
            case 20:
                Uri uri = (Uri) obj2;
                ProcessorActivity.Companion companion = ProcessorActivity.C;
                Intrinsics.h((Uri) obj, "it");
                CameraCaptureManager cameraCaptureManager = ((ProcessorActivity) obj3).x;
                if (cameraCaptureManager == null) {
                    Intrinsics.p("cameraCaptureManager");
                    throw null;
                }
                try {
                    if (cameraCaptureManager.f12455a.getContentResolver().delete(uri, null, null) > 0) {
                        z = true;
                    }
                } catch (Exception e) {
                    Bark.Companion companion2 = Bark.f8483a;
                    Bark.Barker.i(new ReportOwner(ReportOwner.Squad.j), "Delete file after snap upload failed", "error -> " + e.getMessage(), 8);
                }
                return Boolean.valueOf(z);
            case 21:
                SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) obj3;
                FocusManager focusManager = (FocusManager) obj2;
                KeyboardActionScope KeyboardActions = (KeyboardActionScope) obj;
                Intrinsics.h(KeyboardActions, "$this$KeyboardActions");
                if (softwareKeyboardController != null) {
                    softwareKeyboardController.b();
                }
                focusManager.u(false);
                return unit;
            case 22:
                Function2 function2 = (Function2) obj3;
                HorizontalListData horizontalListData = (HorizontalListData) obj2;
                List items = (List) obj;
                Intrinsics.h(items, "items");
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = items.iterator();
                while (it3.hasNext()) {
                    Object contentType = ((LazyListItemInfo) it3.next()).getM();
                    if (contentType != null) {
                        arrayList2.add(contentType);
                    }
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    function2.invoke(horizontalListData, it4.next());
                }
                return unit;
            case 23:
                SpecialsHomeViewModel specialsHomeViewModel = (SpecialsHomeViewModel) obj3;
                EditorialBannerData editorialBannerData = (EditorialBannerData) obj2;
                Intrinsics.h((EditorialBannerData) obj, "it");
                specialsHomeViewModel.getClass();
                ActionData actionData = editorialBannerData.i;
                AnalyticsData[] analyticsDataArr = {actionData != null ? actionData.getAnalytics() : null, editorialBannerData.j};
                AnalyticsData analyticsData = new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null);
                for (int i2 = 0; i2 < 2; i2++) {
                    analyticsData = AnalyticsDataKt.c(analyticsData, analyticsDataArr[i2], false);
                }
                if (analyticsData.getTealiumEvent() != null) {
                    specialsHomeViewModel.i.g(AnalyticsDataKt.a(analyticsData));
                }
                if (actionData != null && (strB = OfferCardDataKt.b(actionData)) != null) {
                    specialsHomeViewModel.q.k(new SpecialsHomeContract.Action.LaunchDeepLink(strB));
                }
                return unit;
            case 24:
                CartResponse response = (CartResponse) obj;
                Intrinsics.h(response, "response");
                Cart cart = ((RemoveItemUseCase) obj3).d;
                cart.F(response);
                cart.x((String) obj2);
                Iterator it5 = response.getItems().iterator();
                while (it5.hasNext()) {
                    cart.I((Item) it5.next(), false);
                }
                return Single.e(new RemoveItemUseCase.ResponseValue());
            case 25:
                Cart cart2 = ((UpdateProductUseCase) obj3).d;
                String str = (String) obj2;
                CartResponse response2 = (CartResponse) obj;
                Intrinsics.h(response2, "response");
                response2.getItems();
                if (response2.getItems().isEmpty()) {
                    cart2.F(response2);
                    return Single.e(new UpdateProductUseCase.ResponseValue(null));
                }
                Item item = response2.getItems().get(0);
                cart2.F(response2);
                if (Intrinsics.c(str, item.getLinenumber())) {
                    cart2.I(item, true);
                } else {
                    cart2.x(str);
                    cart2.I(item, false);
                }
                return Single.e(new UpdateProductUseCase.ResponseValue(item));
            case 26:
                Intrinsics.h((ResponseBody) obj, "response");
                ((DeviceRegistrationUC) obj3).d.b(((DeviceRegistrationUC.RequestValues) obj2).f21179a);
                return Single.e(new DeviceRegistrationUC.ResponseValue());
            case 27:
                PagedKeyProductSearchDataSource pagedKeyProductSearchDataSource = (PagedKeyProductSearchDataSource) obj3;
                PageKeyedDataSource.LoadCallback loadCallback = (PageKeyedDataSource.LoadCallback) obj2;
                ProductSearchUC.ResponseValue responseValue = (ProductSearchUC.ResponseValue) obj;
                if (responseValue != null && (searchResponse2 = responseValue.f21198a) != null && (products = searchResponse2.getProducts()) != null) {
                    list = products;
                }
                if (responseValue != null && (searchResponse = responseValue.f21198a) != null) {
                    nextPageUrl2 = searchResponse.getNextPageUrl();
                }
                loadCallback.a(nextPageUrl2, list);
                pagedKeyProductSearchDataSource.g.j(NetworkState.d);
                return unit;
            case 28:
                PagedKeyProductSearchDataSource pagedKeyProductSearchDataSource2 = (PagedKeyProductSearchDataSource) obj3;
                PageKeyedDataSource.LoadInitialCallback loadInitialCallback = (PageKeyedDataSource.LoadInitialCallback) obj2;
                ProductSearchUC.ResponseValue responseValue2 = (ProductSearchUC.ResponseValue) obj;
                if (responseValue2 != null && (searchResponse4 = responseValue2.f21198a) != null && (products2 = searchResponse4.getProducts()) != null) {
                    list = products2;
                }
                if (responseValue2 != null && (searchResponse3 = responseValue2.f21198a) != null) {
                    nextPageUrl = searchResponse3.getNextPageUrl();
                }
                loadInitialCallback.a(nextPageUrl, list);
                MutableLiveData mutableLiveData = pagedKeyProductSearchDataSource2.g;
                NetworkState networkState = NetworkState.d;
                mutableLiveData.j(networkState);
                pagedKeyProductSearchDataSource2.h.j(networkState);
                return unit;
            default:
                final LifecycleOwner lifecycleOwner2 = (LifecycleOwner) obj3;
                DisposableEffectScope DisposableEffect3 = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect3, "$this$DisposableEffect");
                final androidx.compose.material3.internal.a aVar = new androidx.compose.material3.internal.a((MultiplePermissionsState) obj2, 5);
                lifecycleOwner2.getD().a(aVar);
                return new DisposableEffectResult() { // from class: com.woolworths.scanlibrary.ui.scanner.ScannerScreenKt$ScannerUi$lambda$8$lambda$7$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        lifecycleOwner2.getD().c(aVar);
                    }
                };
        }
    }
}
