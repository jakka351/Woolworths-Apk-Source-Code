package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.ViewCompat;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.remoteconfig.ShopRemoteConfig;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.product.list.legacy.k;
import au.com.woolworths.product.composeui.ProductMemberPriceLabelStyling;
import au.com.woolworths.product.extensions.ProductExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardKt;
import au.com.woolworths.product.models.ProductCategory;
import au.com.woolworths.sdui.shop.dynamicsizecard.DefaultCardHeight;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardHeight;
import au.com.woolworths.shared.ui.compose.dynamicsizecard.DynamicSizeCardKt;
import au.com.woolworths.shop.lists.ItemShoppingListCheckedBindingModel_;
import au.com.woolworths.shop.lists.ItemShoppingListCheckedMenuBindingModel_;
import au.com.woolworths.shop.lists.ItemShoppingListHeaderBindingModel_;
import au.com.woolworths.shop.lists.ItemShoppingListProductBindingModel_;
import au.com.woolworths.shop.lists.ItemShoppingListTextBindingModel_;
import au.com.woolworths.shop.lists.ShoppingListsFeature;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import au.com.woolworths.shop.lists.data.prefs.SortBy;
import au.com.woolworths.shop.lists.databinding.EpoxyItemShoppingListProductBinding;
import au.com.woolworths.shop.lists.databinding.EpoxyItemShoppingListTextBinding;
import au.com.woolworths.shop.lists.ui.shoppinglist.compose.AddNewListItemModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.compose.ListDetailsEmptyModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.compose.ProductItemModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.compose.SpecialsBannerKt;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductMenuItem;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListDetailsUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListItemUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.TextItemUiModel;
import au.com.woolworths.shop.lists.ui.utils.ListsUtils;
import com.airbnb.epoxy.ComposeEpoxyModel;
import com.airbnb.epoxy.ComposeInteropKt;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.TypedEpoxyController;
import com.airbnb.lottie.LottieAnimationView;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 >2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001>B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J \u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 H\u0002J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020'H\u0002J*\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010'2\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020$0 H\u0002J\u0018\u0010,\u001a\u00020\u00102\u0006\u0010)\u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\u001f\u0010-\u001a\u00020\u00102\u0006\u0010)\u001a\u00020!2\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0002\u0010.J\u0018\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u0002012\u0006\u0010)\u001a\u00020!H\u0002J\u0010\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u001cH\u0002J\u0010\u00104\u001a\u00020\u00102\u0006\u00105\u001a\u000206H\u0002J\u001e\u00107\u001a\u00020\u00102\f\u00108\u001a\b\u0012\u0004\u0012\u0002090 2\u0006\u0010:\u001a\u00020\fH\u0002J\b\u0010;\u001a\u00020\u0010H\u0002J\u001e\u0010<\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\f\u00108\u001a\b\u0012\u0004\u0012\u0002090 H\u0002J\b\u0010=\u001a\u00020\u0010H\u0002J\f\u0010\u0014\u001a\u00020\f*\u00020\u0002H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsListController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$ViewState;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListItemListener;", "itemState", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListProductItemState;", "listsUtils", "Lau/com/woolworths/shop/lists/ui/utils/ListsUtils;", "featureToggleManager", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "inMappedStore", "", "<init>", "(Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListItemListener;Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListProductItemState;Lau/com/woolworths/shop/lists/ui/utils/ListsUtils;Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;Z)V", "buildModels", "", "viewState", "buildAddNewListItem", "buildListDetailsEmptyScreen", "isWatchlist", "isSnapAListEnabled", "buildTobaccoWarningBanner", "isStickyHeader", "position", "", "setupStickyHeaderView", "stickyHeader", "Landroid/view/View;", "teardownStickyHeaderView", "buildProductItemModels", "productItems", "", "Lau/com/woolworths/shop/lists/ui/shoppinglist/models/ProductItemUiModel;", "buildHeader", "header", "", "buildNewTextListItemModel", "item", "Lau/com/woolworths/shop/lists/ui/shoppinglist/models/TextItemUiModel;", "buildTextListItemModel", "uiModel", "editedItem", "updatedItemIds", "buildProductItemModel", "buildXmlProductItemWithOptionsMenu", "(Lau/com/woolworths/shop/lists/ui/shoppinglist/models/ProductItemUiModel;Ljava/lang/Boolean;)V", "bindProductMenu", "binding", "Lau/com/woolworths/shop/lists/databinding/EpoxyItemShoppingListProductBinding;", "setUpQuantityButtonAccessibility", "button", "setUpProductCheckboxAccessibility", "checkbox", "Landroid/widget/CheckBox;", "buildCheckedItemsHeader", "items", "Lau/com/woolworths/shop/lists/ui/shoppinglist/models/ShoppingListItemUiModel;", "showCheckedItems", "buildCheckedItemsMenu", "buildCheckedItemModels", "buildSpecialsBanner", "Companion", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShoppingListDetailsListController extends TypedEpoxyController<ShoppingListDetailsContract.ViewState> {
    public static final int $stable = 8;

    @NotNull
    public static final String ADD_TEXT_ITEM_ID = "ADD_TEXT_ITEM_ID";

    @NotNull
    public static final String CHECKED_ITEMS_HEADER_ID = "CHECKED_ITEMS_HEADER_ID";

    @NotNull
    public static final String CHECKED_ITEMS_MENU_ID = "CHECKED_ITEMS_MENU_ID";

    @NotNull
    public static final String EMPTY_STATE_ITEM_ID = "EMPTY_STATE_ITEM_ID";

    @NotNull
    public static final String NEW_TEXT_ITEM_ID = "NEW_TEXT_ITEM_ID";

    @NotNull
    private final FeatureToggleManager featureToggleManager;
    private final boolean inMappedStore;

    @NotNull
    private final ShoppingListProductItemState itemState;

    @NotNull
    private final ShoppingListItemListener listener;

    @NotNull
    private final ListsUtils listsUtils;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsListController$buildProductItemModel$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<ProductItemUiModel, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ProductItemUiModel p0 = (ProductItemUiModel) obj;
            Intrinsics.h(p0, "p0");
            ((ShoppingListItemListener) this.receiver).c(p0);
            return Unit.f24250a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsListController$buildProductItemModel$2, reason: invalid class name */
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function2<ShoppingListItemUiModel, Boolean, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ShoppingListItemUiModel p0 = (ShoppingListItemUiModel) obj;
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            Intrinsics.h(p0, "p0");
            ((ShoppingListItemListener) this.receiver).d(p0, zBooleanValue);
            return Unit.f24250a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsListController$buildProductItemModel$3, reason: invalid class name */
    public /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1<ProductItemUiModel, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ProductItemUiModel p0 = (ProductItemUiModel) obj;
            Intrinsics.h(p0, "p0");
            ((ShoppingListItemListener) this.receiver).a(p0);
            return Unit.f24250a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsListController$buildProductItemModel$4, reason: invalid class name */
    public /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function1<ProductItemUiModel, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ProductItemUiModel p0 = (ProductItemUiModel) obj;
            Intrinsics.h(p0, "p0");
            ((ShoppingListItemListener) this.receiver).v(p0);
            return Unit.f24250a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsListController$buildProductItemModel$5, reason: invalid class name */
    public /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function1<ProductItemUiModel, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ProductItemUiModel p0 = (ProductItemUiModel) obj;
            Intrinsics.h(p0, "p0");
            ((ShoppingListItemListener) this.receiver).F(p0);
            return Unit.f24250a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsListController$buildProductItemModel$6, reason: invalid class name */
    public /* synthetic */ class AnonymousClass6 extends FunctionReferenceImpl implements Function1<ProductCard, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ProductCard p0 = (ProductCard) obj;
            Intrinsics.h(p0, "p0");
            ((ShoppingListItemListener) this.receiver).M(p0);
            return Unit.f24250a;
        }
    }

    public ShoppingListDetailsListController(@NotNull ShoppingListItemListener listener, @NotNull ShoppingListProductItemState itemState, @NotNull ListsUtils listsUtils, @NotNull FeatureToggleManager featureToggleManager, boolean z) {
        Intrinsics.h(listener, "listener");
        Intrinsics.h(itemState, "itemState");
        Intrinsics.h(listsUtils, "listsUtils");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.listener = listener;
        this.itemState = itemState;
        this.listsUtils = listsUtils;
        this.featureToggleManager = featureToggleManager;
        this.inMappedStore = z;
    }

    private final void bindProductMenu(EpoxyItemShoppingListProductBinding binding, ProductItemUiModel uiModel) {
        binding.D.setOnClickListener(new e(2, this, uiModel));
        List list = uiModel.p;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProductMenuItem) it.next()).f12433a);
        }
        boolean zContains = arrayList.contains("valueSwaps");
        ImageButton imageButton = binding.D;
        imageButton.setContentDescription(zContains ? imageButton.getContext().getString(R.string.shop_lists_item_menu_more_with_value_swaps) : imageButton.getContext().getString(R.string.shop_lists_item_menu_more));
        LottieAnimationView moreMenuBadge = binding.E;
        Intrinsics.g(moreMenuBadge, "moreMenuBadge");
        moreMenuBadge.setVisibility(zContains ? 0 : 8);
    }

    private static final void bindProductMenu$lambda$13(ShoppingListDetailsListController shoppingListDetailsListController, ProductItemUiModel productItemUiModel, View view) {
        ShoppingListItemListener shoppingListItemListener = shoppingListDetailsListController.listener;
        Intrinsics.e(view);
        shoppingListItemListener.C(view, productItemUiModel);
    }

    private final void buildAddNewListItem() {
        AddNewListItemModel addNewListItemModel = new AddNewListItemModel(this.listener);
        addNewListItemModel.p(ADD_TEXT_ITEM_ID);
        add(addNewListItemModel);
    }

    private final void buildCheckedItemModels(ShoppingListDetailsContract.ViewState viewState, List<? extends ShoppingListItemUiModel> items) {
        List<? extends ShoppingListItemUiModel> list = items;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof TextItemUiModel) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            buildTextListItemModel$default(this, (TextItemUiModel) it.next(), null, null, 4, null);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof ProductItemUiModel) {
                arrayList2.add(obj2);
            }
        }
        buildProductItemModels(viewState, arrayList2);
    }

    private final void buildCheckedItemsHeader(List<? extends ShoppingListItemUiModel> items, boolean showCheckedItems) {
        ItemShoppingListCheckedBindingModel_ itemShoppingListCheckedBindingModel_ = new ItemShoppingListCheckedBindingModel_();
        itemShoppingListCheckedBindingModel_.M();
        int size = items.size();
        itemShoppingListCheckedBindingModel_.t();
        itemShoppingListCheckedBindingModel_.n = size;
        itemShoppingListCheckedBindingModel_.t();
        itemShoppingListCheckedBindingModel_.o = showCheckedItems;
        ShoppingListItemListener shoppingListItemListener = this.listener;
        itemShoppingListCheckedBindingModel_.t();
        itemShoppingListCheckedBindingModel_.p = shoppingListItemListener;
        add(itemShoppingListCheckedBindingModel_);
    }

    private final void buildCheckedItemsMenu() {
        ItemShoppingListCheckedMenuBindingModel_ itemShoppingListCheckedMenuBindingModel_ = new ItemShoppingListCheckedMenuBindingModel_();
        itemShoppingListCheckedMenuBindingModel_.M();
        ShoppingListItemListener shoppingListItemListener = this.listener;
        itemShoppingListCheckedMenuBindingModel_.t();
        itemShoppingListCheckedMenuBindingModel_.n = shoppingListItemListener;
        add(itemShoppingListCheckedMenuBindingModel_);
    }

    private final void buildHeader(String header) {
        if (header.length() > 0) {
            ItemShoppingListHeaderBindingModel_ itemShoppingListHeaderBindingModel_ = new ItemShoppingListHeaderBindingModel_();
            itemShoppingListHeaderBindingModel_.M(header);
            itemShoppingListHeaderBindingModel_.t();
            itemShoppingListHeaderBindingModel_.n = header;
            add(itemShoppingListHeaderBindingModel_);
        }
    }

    private final void buildListDetailsEmptyScreen(boolean isWatchlist, boolean isSnapAListEnabled) {
        ListDetailsEmptyModel listDetailsEmptyModel = new ListDetailsEmptyModel(isWatchlist, isSnapAListEnabled, new i(this, 0), new au.com.woolworths.shop.cart.ui.c(this, 23));
        listDetailsEmptyModel.p(EMPTY_STATE_ITEM_ID);
        add(listDetailsEmptyModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildListDetailsEmptyScreen$lambda$2(ShoppingListDetailsListController shoppingListDetailsListController, String it) {
        Intrinsics.h(it, "it");
        shoppingListDetailsListController.listener.l(it);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildListDetailsEmptyScreen$lambda$3(ShoppingListDetailsListController shoppingListDetailsListController) {
        shoppingListDetailsListController.listener.H();
        return Unit.f24250a;
    }

    private final void buildNewTextListItemModel(TextItemUiModel item) {
        boolean z = item.g.length() > 0;
        ItemShoppingListTextBindingModel_ itemShoppingListTextBindingModel_ = new ItemShoppingListTextBindingModel_();
        itemShoppingListTextBindingModel_.M(NEW_TEXT_ITEM_ID);
        itemShoppingListTextBindingModel_.t();
        itemShoppingListTextBindingModel_.o = item;
        ShoppingListItemListener shoppingListItemListener = this.listener;
        itemShoppingListTextBindingModel_.t();
        itemShoppingListTextBindingModel_.s = shoppingListItemListener;
        Boolean bool = Boolean.TRUE;
        itemShoppingListTextBindingModel_.t();
        itemShoppingListTextBindingModel_.p = bool;
        Boolean boolValueOf = Boolean.valueOf(z);
        itemShoppingListTextBindingModel_.t();
        itemShoppingListTextBindingModel_.r = boolValueOf;
        k kVar = new k(26);
        itemShoppingListTextBindingModel_.t();
        itemShoppingListTextBindingModel_.n = kVar;
        add(itemShoppingListTextBindingModel_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildNewTextListItemModel$lambda$8$lambda$7(ItemShoppingListTextBindingModel_ itemShoppingListTextBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        ViewDataBinding viewDataBinding = dataBindingHolder.f13309a;
        Intrinsics.f(viewDataBinding, "null cannot be cast to non-null type au.com.woolworths.shop.lists.databinding.EpoxyItemShoppingListTextBinding");
        EpoxyItemShoppingListTextBinding epoxyItemShoppingListTextBinding = (EpoxyItemShoppingListTextBinding) viewDataBinding;
        epoxyItemShoppingListTextBinding.B.post(new androidx.camera.camera2.interop.d(epoxyItemShoppingListTextBinding, 20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildNewTextListItemModel$lambda$8$lambda$7$lambda$6(EpoxyItemShoppingListTextBinding epoxyItemShoppingListTextBinding) {
        EditText textEditText = epoxyItemShoppingListTextBinding.B;
        Intrinsics.g(textEditText, "textEditText");
        if (textEditText.requestFocus()) {
            Object systemService = textEditText.getContext().getSystemService("input_method");
            Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(textEditText, 1);
        }
    }

    private final void buildProductItemModel(ProductItemUiModel uiModel, ShoppingListDetailsContract.ViewState viewState) {
        ProductItemModel productItemModel = new ProductItemModel(viewState, isWatchlist(viewState), uiModel.g, this.inMappedStore, new AnonymousClass1(1, this.listener, ShoppingListItemListener.class, "onProductItemClick", "onProductItemClick(Lau/com/woolworths/shop/lists/ui/shoppinglist/models/ProductItemUiModel;)V", 0), new AnonymousClass2(2, this.listener, ShoppingListItemListener.class, "onCheckedChange", "onCheckedChange(Lau/com/woolworths/shop/lists/ui/shoppinglist/models/ShoppingListItemUiModel;Z)V", 0), new AnonymousClass3(1, this.listener, ShoppingListItemListener.class, "onAddToCartButtonClick", "onAddToCartButtonClick(Lau/com/woolworths/shop/lists/ui/shoppinglist/models/ProductItemUiModel;)V", 0), new AnonymousClass4(1, this.listener, ShoppingListItemListener.class, "onCopyToListClick", "onCopyToListClick(Lau/com/woolworths/shop/lists/ui/shoppinglist/models/ProductItemUiModel;)V", 0), new AnonymousClass5(1, this.listener, ShoppingListItemListener.class, "onProductQuantityClick", "onProductQuantityClick(Lau/com/woolworths/shop/lists/ui/shoppinglist/models/ProductItemUiModel;)V", 0), new AnonymousClass6(1, this.listener, ShoppingListItemListener.class, "onFindProductClicked", "onFindProductClicked(Lau/com/woolworths/product/models/ProductCard;)V", 0));
        productItemModel.p(uiModel.f12432a + "-" + uiModel.e);
        add(productItemModel);
    }

    private final void buildProductItemModels(ShoppingListDetailsContract.ViewState viewState, List<ProductItemUiModel> productItems) {
        String name;
        List<ProductCategory> categories;
        ProductCategory productCategory;
        SortBy sortByD = this.listsUtils.d();
        boolean z = sortByD == SortBy.h;
        boolean z2 = z || (sortByD == SortBy.f);
        if (productItems != null) {
            Object obj = null;
            for (ProductItemUiModel productItemUiModel : productItems) {
                ProductCard productCard = productItemUiModel.i;
                if (productCard != null) {
                    if (z2) {
                        if (z) {
                            name = ProductCardKt.getInstoreLocationText(productCard);
                            if (name == null) {
                                name = "";
                            }
                        } else {
                            if (productCard.getCategories() == null || !(!r6.isEmpty()) || (categories = productItemUiModel.i.getCategories()) == null || (productCategory = categories.get(0)) == null || (name = productCategory.getName()) == null) {
                                name = "Other";
                            }
                        }
                        if (obj == null || !obj.equals(name)) {
                            buildHeader(name);
                            obj = name;
                        }
                    }
                    if (this.featureToggleManager.c(ShoppingListsFeature.f)) {
                        buildProductItemModel(productItemUiModel, viewState);
                    } else {
                        buildXmlProductItemWithOptionsMenu(productItemUiModel, Boolean.valueOf(isWatchlist(viewState)));
                    }
                }
            }
        }
    }

    private final void buildSpecialsBanner() {
        ComposeEpoxyModel composeEpoxyModel = new ComposeEpoxyModel(Arrays.copyOf(new Object[0], 0), new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsListController.buildSpecialsBanner.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ShoppingListDetailsListController shoppingListDetailsListController = ShoppingListDetailsListController.this;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-833877888, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsListController.buildSpecialsBanner.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                ShoppingListItemListener shoppingListItemListener = shoppingListDetailsListController.listener;
                                composer2.o(5004770);
                                boolean zI = composer2.I(shoppingListItemListener);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new ShoppingListDetailsListController$buildSpecialsBanner$1$1$1$1(0, shoppingListItemListener, ShoppingListItemListener.class, "onSpecialsBannerClick", "onSpecialsBannerClick()V", 0);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                SpecialsBannerKt.a(0, composer2, null, (Function0) ((KFunction) objG));
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1164355108));
        composeEpoxyModel.p("specials_banner");
        add(composeEpoxyModel);
    }

    private final void buildTextListItemModel(final TextItemUiModel uiModel, TextItemUiModel editedItem, List<String> updatedItemIds) {
        String str;
        String str2 = uiModel.f12435a;
        final boolean zC = Intrinsics.c(str2, editedItem != null ? editedItem.f12435a : null);
        boolean z = zC && editedItem != null && (str = editedItem.g) != null && str.length() > 0;
        final boolean zContains = updatedItemIds.contains(str2);
        ItemShoppingListTextBindingModel_ itemShoppingListTextBindingModel_ = new ItemShoppingListTextBindingModel_();
        itemShoppingListTextBindingModel_.M(str2 + "-" + uiModel.e + "-" + zContains);
        itemShoppingListTextBindingModel_.t();
        itemShoppingListTextBindingModel_.o = uiModel;
        ShoppingListItemListener shoppingListItemListener = this.listener;
        itemShoppingListTextBindingModel_.t();
        itemShoppingListTextBindingModel_.s = shoppingListItemListener;
        Boolean boolValueOf = Boolean.valueOf(zC);
        itemShoppingListTextBindingModel_.t();
        itemShoppingListTextBindingModel_.p = boolValueOf;
        Boolean boolValueOf2 = Boolean.valueOf(!z);
        itemShoppingListTextBindingModel_.t();
        itemShoppingListTextBindingModel_.q = boolValueOf2;
        Boolean boolValueOf3 = Boolean.valueOf(z);
        itemShoppingListTextBindingModel_.t();
        itemShoppingListTextBindingModel_.r = boolValueOf3;
        OnModelBoundListener onModelBoundListener = new OnModelBoundListener() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.h
            @Override // com.airbnb.epoxy.OnModelBoundListener
            public final void g(int i, EpoxyModel epoxyModel, Object obj) {
                ShoppingListDetailsListController.buildTextListItemModel$lambda$10$lambda$9(zC, uiModel, zContains, (ItemShoppingListTextBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
            }
        };
        itemShoppingListTextBindingModel_.t();
        itemShoppingListTextBindingModel_.n = onModelBoundListener;
        add(itemShoppingListTextBindingModel_);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void buildTextListItemModel$default(ShoppingListDetailsListController shoppingListDetailsListController, TextItemUiModel textItemUiModel, TextItemUiModel textItemUiModel2, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            list = EmptyList.d;
        }
        shoppingListDetailsListController.buildTextListItemModel(textItemUiModel, textItemUiModel2, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildTextListItemModel$lambda$10$lambda$9(boolean z, TextItemUiModel textItemUiModel, boolean z2, ItemShoppingListTextBindingModel_ itemShoppingListTextBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        ViewDataBinding viewDataBinding = dataBindingHolder.f13309a;
        Intrinsics.f(viewDataBinding, "null cannot be cast to non-null type au.com.woolworths.shop.lists.databinding.EpoxyItemShoppingListTextBinding");
        EditText textEditText = ((EpoxyItemShoppingListTextBinding) viewDataBinding).B;
        if (!z) {
            String string = textEditText.getText().toString();
            if (string.length() > 0 && !string.equals(textItemUiModel.g)) {
                textEditText.setText(textItemUiModel.g);
            }
        }
        if (z2) {
            Intrinsics.g(textEditText, "textEditText");
            textEditText.post(new androidx.camera.camera2.interop.d(textEditText, 21));
        }
    }

    private final void buildTobaccoWarningBanner() {
        add(ComposeInteropKt.b("tobacco_banner", new Object[0], new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsListController.buildTobaccoWarningBanner.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ShoppingListDetailsListController shoppingListDetailsListController = ShoppingListDetailsListController.this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1172831840, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsListController.buildTobaccoWarningBanner.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                DynamicSizeCardData dynamicSizeCardData = new DynamicSizeCardData(shoppingListDetailsListController) { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsListController.buildTobaccoWarningBanner.1.1.1
                                    public final String d;
                                    public final String e;
                                    public final DefaultCardHeight f = DefaultCardHeight.SMALL;

                                    {
                                        this.d = shoppingListDetailsListController.featureToggleManager.e(ShopRemoteConfig.p, false);
                                        this.e = shoppingListDetailsListController.featureToggleManager.e(ShopRemoteConfig.q, false);
                                    }

                                    @Override // au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData
                                    /* renamed from: a, reason: from getter */
                                    public final String getAltText() {
                                        return this.e;
                                    }

                                    @Override // au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData
                                    public final DynamicSizeCardHeight getHeight() {
                                        return this.f;
                                    }

                                    @Override // au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData
                                    public final String getImageUrl() {
                                        return this.d;
                                    }
                                };
                                Modifier modifierX = SizeKt.x(SizeKt.e(PaddingKt.f(Modifier.Companion.d, 8), 1.0f), Alignment.Companion.k, false);
                                composer2.o(1849434622);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (objG == composer$Companion$Empty$1) {
                                    objG = new au.com.woolworths.shop.lists.ui.shoppinglist.compose.a(7);
                                    composer2.A(objG);
                                }
                                Function1 function1 = (Function1) objG;
                                Object objE = au.com.woolworths.android.onesite.a.e(composer2, 1849434622);
                                if (objE == composer$Companion$Empty$1) {
                                    objE = new au.com.woolworths.shop.lists.ui.shoppinglist.compose.a(8);
                                    composer2.A(objE);
                                }
                                composer2.l();
                                DynamicSizeCardKt.b(dynamicSizeCardData, modifierX, function1, (Function1) objE, null, BitmapDescriptorFactory.HUE_RED, composer2, 3504, 48);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1916646424)));
    }

    private final void buildXmlProductItemWithOptionsMenu(ProductItemUiModel uiModel, Boolean isWatchlist) {
        ItemShoppingListProductBindingModel_ itemShoppingListProductBindingModel_ = new ItemShoppingListProductBindingModel_();
        itemShoppingListProductBindingModel_.M(uiModel.f12432a + "-" + uiModel.e);
        itemShoppingListProductBindingModel_.t();
        itemShoppingListProductBindingModel_.o = uiModel;
        ShoppingListItemListener shoppingListItemListener = this.listener;
        itemShoppingListProductBindingModel_.t();
        itemShoppingListProductBindingModel_.p = shoppingListItemListener;
        ShoppingListProductItemState shoppingListProductItemState = this.itemState;
        itemShoppingListProductBindingModel_.t();
        itemShoppingListProductBindingModel_.q = shoppingListProductItemState;
        itemShoppingListProductBindingModel_.t();
        itemShoppingListProductBindingModel_.r = isWatchlist;
        boolean z = this.inMappedStore;
        itemShoppingListProductBindingModel_.t();
        itemShoppingListProductBindingModel_.s = z;
        boolean zC = this.featureToggleManager.c(BaseShopAppFeature.w);
        itemShoppingListProductBindingModel_.t();
        itemShoppingListProductBindingModel_.t = zC;
        d dVar = new d(this, uiModel);
        itemShoppingListProductBindingModel_.t();
        itemShoppingListProductBindingModel_.n = dVar;
        add(itemShoppingListProductBindingModel_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildXmlProductItemWithOptionsMenu$lambda$12$lambda$11(ShoppingListDetailsListController shoppingListDetailsListController, ProductItemUiModel productItemUiModel, ItemShoppingListProductBindingModel_ itemShoppingListProductBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        ViewDataBinding viewDataBinding = dataBindingHolder.f13309a;
        Intrinsics.f(viewDataBinding, "null cannot be cast to non-null type au.com.woolworths.shop.lists.databinding.EpoxyItemShoppingListProductBinding");
        EpoxyItemShoppingListProductBinding epoxyItemShoppingListProductBinding = (EpoxyItemShoppingListProductBinding) viewDataBinding;
        CheckBox checkbox = epoxyItemShoppingListProductBinding.A;
        Intrinsics.g(checkbox, "checkbox");
        shoppingListDetailsListController.setUpProductCheckboxAccessibility(checkbox);
        Button quantityButton = epoxyItemShoppingListProductBinding.C.C;
        Intrinsics.g(quantityButton, "quantityButton");
        shoppingListDetailsListController.setUpQuantityButtonAccessibility(quantityButton);
        shoppingListDetailsListController.bindProductMenu(epoxyItemShoppingListProductBinding, productItemUiModel);
        ComposeView productMemberPricingLabel = epoxyItemShoppingListProductBinding.J;
        Intrinsics.g(productMemberPricingLabel, "productMemberPricingLabel");
        ProductCard productCard = productItemUiModel.i;
        ProductExtKt.a(productMemberPricingLabel, productCard != null ? productCard.getMemberPriceInfo() : null, ProductMemberPriceLabelStyling.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$bindProductMenu$-Lau-com-woolworths-shop-lists-databinding-EpoxyItemShoppingListProductBinding-Lau-com-woolworths-shop-lists-ui-shoppinglist-models-ProductItemUiModel--V, reason: not valid java name */
    public static /* synthetic */ void m48xb7db664b(ShoppingListDetailsListController shoppingListDetailsListController, ProductItemUiModel productItemUiModel, View view) {
        Callback.g(view);
        try {
            bindProductMenu$lambda$13(shoppingListDetailsListController, productItemUiModel, view);
        } finally {
            Callback.h();
        }
    }

    private final boolean isWatchlist(ShoppingListDetailsContract.ViewState viewState) {
        ShoppingList shoppingList;
        ShoppingListDetailsUiModel shoppingListDetailsUiModel = viewState.f12428a;
        if (shoppingListDetailsUiModel == null || (shoppingList = shoppingListDetailsUiModel.f12434a) == null) {
            return true;
        }
        return this.listsUtils.b(shoppingList);
    }

    private final void setUpProductCheckboxAccessibility(CheckBox checkbox) {
        ViewCompat.A(checkbox, new ShoppingListDetailsListController$setUpProductCheckboxAccessibility$a11yDelegate$1());
    }

    private final void setUpQuantityButtonAccessibility(View button) {
        ViewCompat.A(button, new ShoppingListDetailsListController$setUpQuantityButtonAccessibility$a11yDelegate$1());
    }

    @Override // com.airbnb.epoxy.EpoxyController
    public boolean isStickyHeader(int position) {
        return getAdapter().o > position && (getAdapter().S(position) instanceof ItemShoppingListHeaderBindingModel_);
    }

    @Override // com.airbnb.epoxy.EpoxyController
    public void setupStickyHeaderView(@NotNull View stickyHeader) {
        Intrinsics.h(stickyHeader, "stickyHeader");
        stickyHeader.setElevation(stickyHeader.getResources().getDimension(R.dimen.half_default_margin));
    }

    @Override // com.airbnb.epoxy.EpoxyController
    public void teardownStickyHeaderView(@NotNull View stickyHeader) {
        Intrinsics.h(stickyHeader, "stickyHeader");
        stickyHeader.setElevation(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@Nullable ShoppingListDetailsContract.ViewState viewState) {
        if (viewState == null) {
            return;
        }
        boolean z = viewState.d;
        TextItemUiModel textItemUiModel = viewState.b;
        ShoppingListDetailsContract.ListState listState = viewState.c;
        if (viewState.j) {
            buildTobaccoWarningBanner();
        }
        if (!isWatchlist(viewState)) {
            if (textItemUiModel == null || textItemUiModel.f12435a.length() != 0) {
                buildAddNewListItem();
            } else {
                buildNewTextListItemModel(textItemUiModel);
            }
        }
        if (viewState.a()) {
            buildListDetailsEmptyScreen(isWatchlist(viewState), this.featureToggleManager.c(ShoppingListsFeature.j) && this.featureToggleManager.c(ShoppingListsFeature.k));
            return;
        }
        if (listState == null) {
            return;
        }
        if (!isWatchlist(viewState)) {
            Iterator it = listState.f12427a.iterator();
            while (it.hasNext()) {
                buildTextListItemModel((TextItemUiModel) it.next(), textItemUiModel, viewState.k);
            }
        }
        buildProductItemModels(viewState, listState.b);
        if (isWatchlist(viewState)) {
            if (this.featureToggleManager.c(ShoppingListsFeature.i)) {
                buildSpecialsBanner();
                return;
            }
            return;
        }
        ArrayList arrayListC0 = CollectionsKt.c0(listState.d, listState.c);
        if (arrayListC0.isEmpty()) {
            return;
        }
        buildCheckedItemsHeader(arrayListC0, z);
        if (z) {
            buildCheckedItemsMenu();
            buildCheckedItemModels(viewState, arrayListC0);
        }
    }
}
