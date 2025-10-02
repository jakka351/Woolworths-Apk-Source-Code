package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.widget.PopupMenu;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.android.onesite.extensions.ActivityExtKt;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.extensions.DialogFragmentExtKt;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.android.onesite.utils.Extensions;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.cartbadge.CartBadgeClickListener;
import au.com.woolworths.base.shopapp.customviews.SimpleCoachMarkSettings;
import au.com.woolworths.base.shopapp.customviews.SimpleCoachMarkSettingsKt;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.product.list.q;
import au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor;
import au.com.woolworths.product.infoview.ProductInfoViewFactory;
import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.InfoSheet;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.offers.ProductBoostContract;
import au.com.woolworths.product.offers.ProductBoostResultViewModel;
import au.com.woolworths.product.productmessagebottomsheet.ProductMessageBottomSheetFragment;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.add.AddToListMode;
import au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivity;
import au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivityKt;
import au.com.woolworths.shop.addtolist.models.AddToListProductParameters;
import au.com.woolworths.shop.addtolist.models.CopyFromListParameters;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import au.com.woolworths.shop.cart.ui.CartBadgeActionView;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import au.com.woolworths.shop.lists.data.prefs.SortBy;
import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import au.com.woolworths.shop.lists.databinding.ActivityShoppingListBinding;
import au.com.woolworths.shop.lists.ui.ListScreen;
import au.com.woolworths.shop.lists.ui.ListTitleRowKt;
import au.com.woolworths.shop.lists.ui.details.ui.ListDetailsView;
import au.com.woolworths.shop.lists.ui.details.ui.ListDetailsViewListener;
import au.com.woolworths.shop.lists.ui.lists.DeleteConfirmationDialogFragment;
import au.com.woolworths.shop.lists.ui.lists.DeleteListDialogListener;
import au.com.woolworths.shop.lists.ui.lists.menu.ListAction;
import au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetFragment;
import au.com.woolworths.shop.lists.ui.shoppinglist.analytics.ShoppingListDetailsActions;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductMenuItem;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListDetailsUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListItemUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet.SortByBottomSheetFragment;
import au.com.woolworths.shop.lists.ui.shoppinglist.ui.DeleteCheckedItemsDialogFragment;
import au.com.woolworths.shop.lists.ui.shoppinglist.ui.DeleteCheckedItemsDialogListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.ui.ShoppingListItemDecoration;
import au.com.woolworths.shop.lists.ui.shoppinglist.ui.ShoppingListItemDeleteSwipeCallback;
import au.com.woolworths.shop.lists.ui.shoppinglist.ui.ShoppingListItemSectionDecoration;
import au.com.woolworths.shop.lists.ui.shoppinglist.ui.ShoppingListItemSwipeListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.ui.SngCartBadgeActionView;
import au.com.woolworths.shop.lists.ui.shoppinglist.ui.UncheckCheckedItemsDialogFragment;
import au.com.woolworths.shop.lists.ui.shoppinglist.ui.UncheckCheckedItemsDialogListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.utils.ListItemListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.utils.QueueSimpleCoachMarkKt;
import au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorActivity;
import au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.SnapAListBottomSheetFragment;
import au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.SnapAListBottomSheetType;
import au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.SnapAListMenuOption;
import au.com.woolworths.shop.lists.ui.utils.InsetsWithKeyboardCallback;
import au.com.woolworths.shop.lists.ui.utils.ListsUtils;
import au.com.woolworths.shop.lists.ui.utils.SoftInputKt;
import au.com.woolworths.shop.lists.ui.watchlist.bottomsheet.WatchlistBottomSheetFragment;
import com.airbnb.epoxy.DiffResult;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.epoxy.OnModelBuildFinishedListener;
import com.airbnb.lottie.LottieAnimationView;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.salesforce.marketingcloud.UrlHandler;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import net.yslibrary.android.keyboardvisibilityevent.AutoActivityLifecycleCallback;
import net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEvent;
import net.yslibrary.android.keyboardvisibilityevent.SimpleUnregistrar;

@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b:\u0002\u000e\u000fB\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u0012²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/ui/UncheckCheckedItemsDialogListener;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/ui/DeleteCheckedItemsDialogListener;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/sortbottomsheet/SortByBottomSheetFragment$BottomSheetHost;", "Lau/com/woolworths/shop/lists/ui/snapalist/snapbottomsheet/SnapAListBottomSheetFragment$BottomSheetHost;", "Lau/com/woolworths/shop/lists/ui/lists/menu/ListsBottomSheetFragment$ListMenuDialogListener;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetFragment$BottomSheetHost;", "Lau/com/woolworths/shop/lists/ui/watchlist/bottomsheet/WatchlistBottomSheetFragment$BottomSheetHost;", "Lau/com/woolworths/shop/lists/ui/lists/DeleteListDialogListener;", "Lau/com/woolworths/base/shopapp/cartbadge/CartBadgeClickListener;", "Lau/com/woolworths/shop/lists/ui/details/ui/ListDetailsViewListener;", "<init>", "()V", "SearchButtonAccessibilityDelegate", "Companion", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$ViewState;", "viewState", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShoppingListDetailsActivity extends Hilt_ShoppingListDetailsActivity implements UncheckCheckedItemsDialogListener, DeleteCheckedItemsDialogListener, SortByBottomSheetFragment.BottomSheetHost, SnapAListBottomSheetFragment.BottomSheetHost, ListsBottomSheetFragment.ListMenuDialogListener, AddToListBottomSheetFragment.BottomSheetHost, WatchlistBottomSheetFragment.BottomSheetHost, DeleteListDialogListener, CartBadgeClickListener, ListDetailsViewListener {
    public static final /* synthetic */ int R = 0;
    public ListsInMemoryRepository A;
    public FeatureToggleManager B;
    public ListsUtils C;
    public InstoreNavigationInteractor D;
    public final ViewModelLazy E;
    public final Lazy F;
    public final ViewModelLazy G;
    public ShoppingListDetailsListController H;
    public ActivityShoppingListBinding I;
    public AnonymousClass1 J;
    public InsetsWithKeyboardCallback K;
    public final ActivityResultLauncher L;
    public final ActivityResultLauncher M;
    public final ActivityResultLauncher N;
    public final ActivityResultLauncher O;
    public final Lazy P;
    public final Lazy Q;
    public ShopAppNavigator x;
    public CartUpdateInteractor y;
    public AnalyticsManager z;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsActivity$Companion;", "", "", "COACHMARK_DELAY_MS", "J", "", "WHOLE_WIDTH_RATIO", "F", "ADDED_TO_CART_SNACKBAR_DELAY_MS", "MENU_ICON_PADDING_DP", "MAX_ALLOWED_TOGGLE_STATUS_FETCH_TIME_IN_MS", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsActivity$SearchButtonAccessibilityDelegate;", "Landroid/view/View$AccessibilityDelegate;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class SearchButtonAccessibilityDelegate extends View.AccessibilityDelegate {
        public SearchButtonAccessibilityDelegate() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup host, View child, AccessibilityEvent event) {
            Intrinsics.h(host, "host");
            Intrinsics.h(child, "child");
            Intrinsics.h(event, "event");
            boolean z = event.getEventType() == 128;
            ShoppingListDetailsActivity shoppingListDetailsActivity = ShoppingListDetailsActivity.this;
            if (ContextExtKt.d(shoppingListDetailsActivity)) {
                ActivityShoppingListBinding activityShoppingListBinding = shoppingListDetailsActivity.I;
                if (activityShoppingListBinding == null) {
                    Intrinsics.p("activityBinding");
                    throw null;
                }
                if (child.equals(activityShoppingListBinding.I) && z) {
                    shoppingListDetailsActivity.R4().t0();
                }
            }
            return super.onRequestSendAccessibilityEvent(host, child, event);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ListAction.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ListAction listAction = ListAction.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ListAction listAction2 = ListAction.d;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ListAction listAction3 = ListAction.d;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ListAction listAction4 = ListAction.d;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[Activities.ViewSimilarProductsActivity.Status.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Activities.ViewSimilarProductsActivity.Status status = Activities.ViewSimilarProductsActivity.Status.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Activities.ViewSimilarProductsActivity.Status status2 = Activities.ViewSimilarProductsActivity.Status.d;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Activities.ViewSimilarProductsActivity.Status status3 = Activities.ViewSimilarProductsActivity.Status.d;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$4", f = "ShoppingListDetailsActivity.kt", l = {325}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", UrlHandler.ACTION, "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$4$2", f = "ShoppingListDetailsActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$4$2, reason: invalid class name */
        final class AnonymousClass2 extends SuspendLambda implements Function2<ShoppingListDetailsContract.Actions, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ ShoppingListDetailsActivity q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ShoppingListDetailsActivity shoppingListDetailsActivity, Continuation continuation) {
                super(2, continuation);
                this.q = shoppingListDetailsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.q, continuation);
                anonymousClass2.p = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws NumberFormatException {
                AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((ShoppingListDetailsContract.Actions) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass2.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws NumberFormatException {
                Intent intentA;
                InfoSheet infoSheet;
                String title;
                InStoreAvailabilityInfo inStoreAvailabilityInfo;
                InfoSheet infoSheet2;
                String message;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                ShoppingListDetailsContract.Actions actions = (ShoppingListDetailsContract.Actions) this.p;
                int i = ShoppingListDetailsActivity.R;
                int i2 = CreateUpdateShoppingListActivity.A;
                boolean z = actions instanceof ShoppingListDetailsContract.Actions.LaunchProductDetailActivity;
                final ShoppingListDetailsActivity shoppingListDetailsActivity = this.q;
                Object obj2 = null;
                if (z) {
                    ProductCard productCard = ((ShoppingListDetailsContract.Actions.LaunchProductDetailActivity) actions).f12399a;
                    ShopAppNavigator shopAppNavigator = shoppingListDetailsActivity.x;
                    if (shopAppNavigator == null) {
                        Intrinsics.p("navigator");
                        throw null;
                    }
                    shopAppNavigator.d(productCard.getProductId());
                } else if (actions instanceof ShoppingListDetailsContract.Actions.ShowQuantityDialog) {
                    shoppingListDetailsActivity.V4(((ShoppingListDetailsContract.Actions.ShowQuantityDialog) actions).f12420a, null);
                } else {
                    final int i3 = 1;
                    final int i4 = 0;
                    if (actions instanceof ShoppingListDetailsContract.Actions.ShowProductItemOptionsMenu) {
                        ShoppingListDetailsContract.Actions.ShowProductItemOptionsMenu showProductItemOptionsMenu = (ShoppingListDetailsContract.Actions.ShowProductItemOptionsMenu) actions;
                        ProductItemUiModel productItemUiModel = showProductItemOptionsMenu.f12419a;
                        View view = showProductItemOptionsMenu.b;
                        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(shoppingListDetailsActivity, R.style.ThemeOverlay_Wow_Light_ListDetails);
                        PopupMenu popupMenu = new PopupMenu(contextThemeWrapper, view);
                        SupportMenuInflater supportMenuInflater = new SupportMenuInflater(contextThemeWrapper);
                        MenuBuilder menuBuilder = popupMenu.f179a;
                        supportMenuInflater.inflate(R.menu.menu_shopping_list_product_item, menuBuilder);
                        Intrinsics.g(menuBuilder, "getMenu(...)");
                        Iterator it = productItemUiModel.p.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (((ProductMenuItem) next).f12433a.equals("valueSwaps")) {
                                obj2 = next;
                                break;
                            }
                        }
                        ProductMenuItem productMenuItem = (ProductMenuItem) obj2;
                        MenuItem menuItemFindItem = menuBuilder.findItem(R.id.open_value_swaps);
                        if (productMenuItem != null) {
                            menuItemFindItem.setVisible(true);
                            menuItemFindItem.setTitle(productMenuItem.b);
                        } else {
                            menuItemFindItem.setVisible(false);
                        }
                        MenuItem menuItemFindItem2 = menuBuilder.findItem(R.id.copy_to_watchlist);
                        ShoppingListDetailsViewModel shoppingListDetailsViewModel = (ShoppingListDetailsViewModel) shoppingListDetailsActivity.E.getD();
                        menuItemFindItem2.setVisible(!shoppingListDetailsViewModel.H5() && shoppingListDetailsViewModel.s.c(BaseShopAppFeature.v));
                        menuBuilder.s = true;
                        Iterator it2 = menuBuilder.m().iterator();
                        Intrinsics.g(it2, "iterator(...)");
                        while (it2.hasNext()) {
                            MenuItemImpl menuItemImpl = (MenuItemImpl) it2.next();
                            int iApplyDimension = (int) TypedValue.applyDimension(1, 4.0f, shoppingListDetailsActivity.getResources().getDisplayMetrics());
                            if (menuItemImpl.getIcon() != null) {
                                menuItemImpl.setIcon(new InsetDrawable(menuItemImpl.getIcon(), iApplyDimension, 0, iApplyDimension, 0));
                            }
                        }
                        popupMenu.d = new d(shoppingListDetailsActivity, productItemUiModel);
                        MenuPopupHelper menuPopupHelper = popupMenu.c;
                        if (!menuPopupHelper.b()) {
                            if (menuPopupHelper.f == null) {
                                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                            }
                            menuPopupHelper.e(0, 0, false, false);
                        }
                    } else if (actions instanceof ShoppingListDetailsContract.Actions.CopyToList) {
                        ShoppingListDetailsContract.Actions.CopyToList copyToList = (ShoppingListDetailsContract.Actions.CopyToList) actions;
                        shoppingListDetailsActivity.V4(copyToList.b, copyToList.f12387a);
                    } else if (actions instanceof ShoppingListDetailsContract.Actions.ViewSimilarItems) {
                        ShoppingListDetailsContract.Actions.ViewSimilarItems viewSimilarItems = (ShoppingListDetailsContract.Actions.ViewSimilarItems) actions;
                        shoppingListDetailsActivity.M.a(Activities.ViewSimilarProductsActivity.f4551a.b(viewSimilarItems.f12426a, viewSimilarItems.b.getValue(), viewSimilarItems.c.toString()), null);
                    } else if (actions instanceof ShoppingListDetailsContract.Actions.ShowSnackbar) {
                        ShoppingListDetailsContract.Actions.ShowSnackbar showSnackbar = (ShoppingListDetailsContract.Actions.ShowSnackbar) actions;
                        shoppingListDetailsActivity.W4(showSnackbar.f12421a.getText(shoppingListDetailsActivity), showSnackbar.b, showSnackbar.c);
                    } else if (actions instanceof ShoppingListDetailsContract.Actions.ShowCheckProductItemsSnackbar) {
                        ShoppingListDetailsContract.Actions.ShowCheckProductItemsSnackbar showCheckProductItemsSnackbar = (ShoppingListDetailsContract.Actions.ShowCheckProductItemsSnackbar) actions;
                        shoppingListDetailsActivity.W4(showCheckProductItemsSnackbar.f12415a.getText(shoppingListDetailsActivity), showCheckProductItemsSnackbar.b, showCheckProductItemsSnackbar.c);
                    } else if (actions instanceof ShoppingListDetailsContract.Actions.ShowBoostAllSuccessSnackbar) {
                        ShoppingListDetailsActivity.X4(shoppingListDetailsActivity, ((ShoppingListDetailsContract.Actions.ShowBoostAllSuccessSnackbar) actions).f12414a.getText(shoppingListDetailsActivity));
                    } else if (actions instanceof ShoppingListDetailsContract.Actions.ShowAddToCartResultSnackbar) {
                        ShoppingListDetailsActivity.X4(shoppingListDetailsActivity, ((ShoppingListDetailsContract.Actions.ShowAddToCartResultSnackbar) actions).f12412a.getText(shoppingListDetailsActivity));
                    } else if (actions instanceof ShoppingListDetailsContract.Actions.TextItemFocusChanged) {
                        if (((ShoppingListDetailsContract.Actions.TextItemFocusChanged) actions).b && !((ShoppingListDetailsContract.ViewState) shoppingListDetailsActivity.R4().getY().getValue()).a()) {
                            ActivityShoppingListBinding activityShoppingListBinding = shoppingListDetailsActivity.I;
                            if (activityShoppingListBinding == null) {
                                Intrinsics.p("activityBinding");
                                throw null;
                            }
                            activityShoppingListBinding.y.e(false, true, true);
                            activityShoppingListBinding.J.o0(0);
                        }
                    } else if (actions instanceof ShoppingListDetailsContract.Actions.DisplayProductCoachMark) {
                        BuildersKt.c(LifecycleOwnerKt.a(shoppingListDetailsActivity), null, null, new ShoppingListDetailsActivity$displayProductCoachMark$1(shoppingListDetailsActivity, (ShoppingListDetailsContract.Actions.DisplayProductCoachMark) actions, null), 3);
                    } else if (actions instanceof ShoppingListDetailsContract.Actions.DisplaySortByCoachMark) {
                        BuildersKt.c(LifecycleOwnerKt.a(shoppingListDetailsActivity), null, null, new ShoppingListDetailsActivity$displaySortByCoachMarkIfPossible$1(shoppingListDetailsActivity, (ShoppingListDetailsContract.Actions.DisplaySortByCoachMark) actions, null), 3);
                    } else if (actions instanceof ShoppingListDetailsContract.Actions.ScrollToTop) {
                        shoppingListDetailsActivity.T4();
                    } else {
                        boolean z2 = actions instanceof ShoppingListDetailsContract.Actions.ListChangeRequest;
                        Activities.SngListsActivity sngListsActivity = Activities.SngListsActivity.f4538a;
                        if (z2) {
                            shoppingListDetailsActivity.overridePendingTransition(0, 0);
                            shoppingListDetailsActivity.startActivity(ActivityNavigatorKt.a(sngListsActivity, ApplicationType.e));
                            shoppingListDetailsActivity.finish();
                        } else if (actions instanceof ShoppingListDetailsContract.Actions.DisplayScanner) {
                            FeatureToggleManager featureToggleManager = shoppingListDetailsActivity.B;
                            if (featureToggleManager == null) {
                                Intrinsics.p("featureToggleManager");
                                throw null;
                            }
                            if (featureToggleManager.c(BaseShopAppFeature.U)) {
                                shoppingListDetailsActivity.startActivity(ActivityNavigatorKt.a(Activities.SngScannerActivity.f4541a, ApplicationType.e));
                            } else {
                                shoppingListDetailsActivity.startActivity(ActivityNavigatorKt.a(Activities.SngScannerActivityOld.f4542a, ApplicationType.e));
                            }
                            shoppingListDetailsActivity.finish();
                        } else if (actions instanceof ShoppingListDetailsContract.Actions.ShowUncheckCheckedItemsDialog) {
                            UncheckCheckedItemsDialogFragment uncheckCheckedItemsDialogFragment = new UncheckCheckedItemsDialogFragment();
                            uncheckCheckedItemsDialogFragment.setCancelable(false);
                            uncheckCheckedItemsDialogFragment.setArguments(new Bundle(0));
                            FragmentManager supportFragmentManager = shoppingListDetailsActivity.getSupportFragmentManager();
                            Intrinsics.g(supportFragmentManager, "getSupportFragmentManager(...)");
                            DialogFragmentExtKt.a(uncheckCheckedItemsDialogFragment, supportFragmentManager, "uncheck_checked_items");
                        } else if (actions instanceof ShoppingListDetailsContract.Actions.ShowDeleteCheckedItemsDialog) {
                            DeleteCheckedItemsDialogFragment deleteCheckedItemsDialogFragment = new DeleteCheckedItemsDialogFragment();
                            deleteCheckedItemsDialogFragment.setCancelable(false);
                            deleteCheckedItemsDialogFragment.setArguments(new Bundle(0));
                            FragmentManager supportFragmentManager2 = shoppingListDetailsActivity.getSupportFragmentManager();
                            Intrinsics.g(supportFragmentManager2, "getSupportFragmentManager(...)");
                            DialogFragmentExtKt.a(deleteCheckedItemsDialogFragment, supportFragmentManager2, "delete_checked_items");
                        } else if (actions instanceof ShoppingListDetailsContract.Actions.LaunchDuplicateShoppingListActivity) {
                            String shoppingListId = ((ShoppingListDetailsContract.Actions.LaunchDuplicateShoppingListActivity) actions).f12394a.getId();
                            ActivityResultLauncher resultLauncher = shoppingListDetailsActivity.L;
                            Intrinsics.h(shoppingListId, "shoppingListId");
                            Intrinsics.h(resultLauncher, "resultLauncher");
                            resultLauncher.a(CreateUpdateShoppingListActivity.Companion.a(Activities.CreateUpdateShoppingList.Mode.e, shoppingListId), null);
                        } else if (actions instanceof ShoppingListDetailsContract.Actions.ShowAddToCartWarning) {
                            new AlertDialog.Builder(shoppingListDetailsActivity).setTitle(R.string.shop_lists_change_mode_warning_title).setMessage(R.string.shop_lists_add_to_cart_warning_message).setCancelable(true).setPositiveButton(R.string.shop_lists_aisle_warning_done, new q(8)).show();
                        } else if (actions instanceof ShoppingListDetailsContract.Actions.ShowSngCheckOffDialog) {
                            ShoppingListDetailsContract.Actions.ShowSngCheckOffDialog showSngCheckOffDialog = (ShoppingListDetailsContract.Actions.ShowSngCheckOffDialog) actions;
                            new AlertDialog.Builder(shoppingListDetailsActivity).setTitle(showSngCheckOffDialog.f12423a.getText(shoppingListDetailsActivity).toString()).setMessage(showSngCheckOffDialog.b.getText(shoppingListDetailsActivity).toString()).setCancelable(false).setNegativeButton(R.string.shop_lists_check_off_dialog_settings, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.g
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i5) {
                                    int i6 = i4;
                                    ShoppingListDetailsActivity shoppingListDetailsActivity2 = shoppingListDetailsActivity;
                                    switch (i6) {
                                        case 0:
                                            int i7 = ShoppingListDetailsActivity.R;
                                            shoppingListDetailsActivity2.R4().P5();
                                            dialogInterface.dismiss();
                                            break;
                                        default:
                                            int i8 = ShoppingListDetailsActivity.R;
                                            shoppingListDetailsActivity2.R4().q2();
                                            dialogInterface.dismiss();
                                            break;
                                    }
                                }
                            }).setPositiveButton(R.string.shop_lists_check_off_dialog_continue, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.g
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i5) {
                                    int i6 = i3;
                                    ShoppingListDetailsActivity shoppingListDetailsActivity2 = shoppingListDetailsActivity;
                                    switch (i6) {
                                        case 0:
                                            int i7 = ShoppingListDetailsActivity.R;
                                            shoppingListDetailsActivity2.R4().P5();
                                            dialogInterface.dismiss();
                                            break;
                                        default:
                                            int i8 = ShoppingListDetailsActivity.R;
                                            shoppingListDetailsActivity2.R4().q2();
                                            dialogInterface.dismiss();
                                            break;
                                    }
                                }
                            }).show();
                        } else if (actions instanceof ShoppingListDetailsContract.Actions.ShowMaxListCountReachedErrorDialog) {
                            ShoppingListDetailsContract.Actions.ShowMaxListCountReachedErrorDialog showMaxListCountReachedErrorDialog = (ShoppingListDetailsContract.Actions.ShowMaxListCountReachedErrorDialog) actions;
                            new AlertDialog.Builder(shoppingListDetailsActivity).setTitle(showMaxListCountReachedErrorDialog.f12418a.getText(shoppingListDetailsActivity)).setMessage(showMaxListCountReachedErrorDialog.b.getText(shoppingListDetailsActivity)).setCancelable(false).setPositiveButton(android.R.string.ok, (DialogInterface.OnClickListener) null).show();
                        } else if (actions instanceof ShoppingListDetailsContract.Actions.CloseScreen) {
                            ShoppingListDetailsContract.Actions.CloseScreen closeScreen = (ShoppingListDetailsContract.Actions.CloseScreen) actions;
                            Text text = closeScreen.f12386a;
                            if (text != null) {
                                Toast.makeText(shoppingListDetailsActivity, text.getText(shoppingListDetailsActivity), 0).show();
                            }
                            if (closeScreen.b) {
                                shoppingListDetailsActivity.overridePendingTransition(0, 0);
                                shoppingListDetailsActivity.startActivity(ActivityNavigatorKt.a(sngListsActivity, ApplicationType.e));
                                shoppingListDetailsActivity.finish();
                            } else {
                                shoppingListDetailsActivity.finish();
                            }
                        } else if (actions instanceof ShoppingListDetailsContract.Actions.LaunchSearchActivity) {
                            shoppingListDetailsActivity.startActivity(Activities.Search.f4526a.b(new Activities.Search.Extras.Generic(null)));
                        } else if (actions instanceof ShoppingListDetailsContract.Actions.LaunchSngSearchActivity) {
                            shoppingListDetailsActivity.startActivity(ActivityNavigatorKt.a(Activities.SngSearchActivity.f4543a, ApplicationType.e));
                        } else if (actions instanceof ShoppingListDetailsContract.Actions.LaunchListOptionsMenu) {
                            ListsBottomSheetFragment listsBottomSheetFragmentA = ListsBottomSheetFragment.Companion.a(((ShoppingListDetailsContract.Actions.LaunchListOptionsMenu) actions).f12397a, true);
                            FragmentManager supportFragmentManager3 = shoppingListDetailsActivity.getSupportFragmentManager();
                            Intrinsics.g(supportFragmentManager3, "getSupportFragmentManager(...)");
                            DialogFragmentExtKt.a(listsBottomSheetFragmentA, supportFragmentManager3, "list_actions");
                        } else if (actions instanceof ShoppingListDetailsContract.Actions.LaunchEditList) {
                            String shoppingListId2 = ((ShoppingListDetailsContract.Actions.LaunchEditList) actions).f12395a;
                            Intrinsics.h(shoppingListId2, "shoppingListId");
                            shoppingListDetailsActivity.startActivity(CreateUpdateShoppingListActivity.Companion.a(Activities.CreateUpdateShoppingList.Mode.f, shoppingListId2));
                        } else if (actions instanceof ShoppingListDetailsContract.Actions.LaunchDeleteListConfirmation) {
                            DeleteConfirmationDialogFragment deleteConfirmationDialogFragmentA = DeleteConfirmationDialogFragment.Companion.a(((ShoppingListDetailsContract.Actions.LaunchDeleteListConfirmation) actions).f12393a);
                            FragmentManager supportFragmentManager4 = shoppingListDetailsActivity.getSupportFragmentManager();
                            Intrinsics.g(supportFragmentManager4, "getSupportFragmentManager(...)");
                            DialogFragmentExtKt.a(deleteConfirmationDialogFragmentA, supportFragmentManager4, "delete_confirm");
                        } else if (actions instanceof ShoppingListDetailsContract.Actions.LaunchRemoveAllConfirmation) {
                            DeleteConfirmationDialogFragment deleteConfirmationDialogFragmentB = DeleteConfirmationDialogFragment.Companion.b(((ShoppingListDetailsContract.Actions.LaunchRemoveAllConfirmation) actions).f12401a);
                            FragmentManager supportFragmentManager5 = shoppingListDetailsActivity.getSupportFragmentManager();
                            Intrinsics.g(supportFragmentManager5, "getSupportFragmentManager(...)");
                            DialogFragmentExtKt.a(deleteConfirmationDialogFragmentB, supportFragmentManager5, "delete_confirm");
                        } else if (actions instanceof ShoppingListDetailsContract.Actions.LaunchSngCart) {
                            shoppingListDetailsActivity.startActivity(ActivityNavigatorKt.a(Activities.SngCartActivity.f4537a, ApplicationType.e).addFlags(67108864));
                            shoppingListDetailsActivity.finish();
                        } else if (actions instanceof ShoppingListDetailsContract.Actions.LaunchSngSettings) {
                            shoppingListDetailsActivity.startActivity(ActivityNavigatorKt.a(Activities.SngSettingsScreen.f4544a, ApplicationType.e));
                        } else if (actions instanceof ShoppingListDetailsContract.Actions.ListRefreshDone) {
                            ActivityShoppingListBinding activityShoppingListBinding2 = shoppingListDetailsActivity.I;
                            if (activityShoppingListBinding2 == null) {
                                Intrinsics.p("activityBinding");
                                throw null;
                            }
                            activityShoppingListBinding2.P.d(((ShoppingListDetailsContract.Actions.ListRefreshDone) actions).f12409a);
                        } else if (actions instanceof ShoppingListDetailsContract.Actions.DismissSoftKeyboard) {
                            ActivityExtKt.a(shoppingListDetailsActivity);
                        } else if (actions instanceof ShoppingListDetailsContract.Actions.OnListItemSoftDeleted) {
                            shoppingListDetailsActivity.R4().y4(((ShoppingListDetailsContract.Actions.OnListItemSoftDeleted) actions).f12410a);
                        } else if (actions instanceof ShoppingListDetailsContract.Actions.LaunchAvailabilityMessageBottomSheet) {
                            ProductCard productCard2 = ((ShoppingListDetailsContract.Actions.LaunchAvailabilityMessageBottomSheet) actions).f12392a;
                            InStoreAvailabilityInfo inStoreAvailabilityInfo2 = productCard2.getInStoreAvailabilityInfo();
                            if (inStoreAvailabilityInfo2 != null && (infoSheet = inStoreAvailabilityInfo2.getInfoSheet()) != null && (title = infoSheet.getTitle()) != null && (inStoreAvailabilityInfo = productCard2.getInStoreAvailabilityInfo()) != null && (infoSheet2 = inStoreAvailabilityInfo.getInfoSheet()) != null && (message = infoSheet2.getMessage()) != null) {
                                ProductMessageBottomSheetFragment.Companion.a(shoppingListDetailsActivity.getSupportFragmentManager(), productCard2, title, message, shoppingListDetailsActivity.R4().S0(), null);
                            }
                        } else if (actions instanceof ShoppingListDetailsContract.Actions.LaunchProductSearch) {
                            ShoppingListDetailsContract.Actions.LaunchProductSearch launchProductSearch = (ShoppingListDetailsContract.Actions.LaunchProductSearch) actions;
                            String str = launchProductSearch.f12400a;
                            String str2 = launchProductSearch.b;
                            if (str.length() == 0) {
                                intentA = Activities.Search.f4526a.b(new Activities.Search.Extras.Generic(null));
                            } else {
                                intentA = ActivityNavigatorKt.a(Activities.ProductList.f4505a, ApplicationType.e);
                                intentA.putExtra("EXTRA_PRODUCT_LIST_INFO", new Activities.ProductList.Extras(new Activities.ProductList.ExtrasPageData(str, null), new Activities.ProductList.ExtrasBySearch(str, (List) null, str2, (Activities.ProductList.ProductListType) null, 22), (Activities.ProductList.ExtrasConfig) null, 12));
                            }
                            shoppingListDetailsActivity.startActivity(intentA);
                        } else if (actions instanceof ShoppingListDetailsContract.Actions.ShowItemDeletedSnackbar) {
                            final ShoppingListItemUiModel shoppingListItemUiModel = ((ShoppingListDetailsContract.Actions.ShowItemDeletedSnackbar) actions).f12417a;
                            ActivityShoppingListBinding activityShoppingListBinding3 = shoppingListDetailsActivity.I;
                            if (activityShoppingListBinding3 == null) {
                                Intrinsics.p("activityBinding");
                                throw null;
                            }
                            String string = shoppingListDetailsActivity.getString(R.string.shop_lists_delete_item_message);
                            Intrinsics.g(string, "getString(...)");
                            Snackbar snackbarS4 = shoppingListDetailsActivity.S4(activityShoppingListBinding3, string);
                            snackbarS4.k(shoppingListDetailsActivity.getString(R.string.shop_lists_undo_delete_item_action), new e(i3, shoppingListDetailsActivity, shoppingListItemUiModel));
                            BaseTransientBottomBar.BaseCallback<Snackbar> baseCallback = new BaseTransientBottomBar.BaseCallback<Snackbar>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$showItemDeletedSnackbar$1$2
                                @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
                                public final void a(BaseTransientBottomBar baseTransientBottomBar, int i5) {
                                    if (i5 != 1) {
                                        int i6 = ShoppingListDetailsActivity.R;
                                        shoppingListDetailsActivity.R4().I2(shoppingListItemUiModel);
                                    }
                                }
                            };
                            if (snackbarS4.u == null) {
                                snackbarS4.u = new ArrayList();
                            }
                            snackbarS4.u.add(baseCallback);
                            snackbarS4.l();
                        } else if (actions instanceof ShoppingListDetailsContract.Actions.AddToListSuccess) {
                            shoppingListDetailsActivity.E2(((ShoppingListDetailsContract.Actions.AddToListSuccess) actions).f12385a);
                        } else if (actions instanceof ShoppingListDetailsContract.Actions.LaunchInStoreMapActivity) {
                            ShopAppNavigator shopAppNavigator2 = shoppingListDetailsActivity.x;
                            if (shopAppNavigator2 == null) {
                                Intrinsics.p("navigator");
                                throw null;
                            }
                            shopAppNavigator2.c(((ShoppingListDetailsContract.Actions.LaunchInStoreMapActivity) actions).f12396a);
                        } else if (actions instanceof ShoppingListDetailsContract.Actions.LaunchDeepLink) {
                            shoppingListDetailsActivity.startActivity(ShopAppDeepLink.a(shoppingListDetailsActivity.R4().S0(), "com.woolworths.shop://specials"));
                        } else if (Intrinsics.c(actions, ShoppingListDetailsContract.Actions.ShowSnapAListBottomSheet.f12422a)) {
                            SnapAListBottomSheetFragment.Companion.a(shoppingListDetailsActivity.getSupportFragmentManager(), new SnapAListBottomSheetFragment.Extras(SnapAListBottomSheetType.d));
                        } else {
                            boolean zC = Intrinsics.c(actions, ShoppingListDetailsContract.Actions.LaunchSnapAListGuestOnboardingScreen.f12403a);
                            Activities.ShopListGuestOnboardingActivity shopListGuestOnboardingActivity = Activities.ShopListGuestOnboardingActivity.f4532a;
                            if (zC) {
                                shoppingListDetailsActivity.startActivity(shopListGuestOnboardingActivity.b(Activities.ShopListGuestOnboardingActivity.ListFeature.e));
                            } else if (Intrinsics.c(actions, ShoppingListDetailsContract.Actions.LaunchWatchlistGuestOnboardingScreen.f12407a)) {
                                shoppingListDetailsActivity.startActivity(shopListGuestOnboardingActivity.b(Activities.ShopListGuestOnboardingActivity.ListFeature.d));
                            } else {
                                if (!(actions instanceof ShoppingListDetailsContract.Actions.LaunchMagicMatchScreen)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                BuildersKt.c(LifecycleOwnerKt.a(shoppingListDetailsActivity), null, null, new ShoppingListDetailsActivity$launchMagicMatchScreen$1(shoppingListDetailsActivity, ((ShoppingListDetailsContract.Actions.LaunchMagicMatchScreen) actions).f12398a, null), 3);
                            }
                        }
                    }
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass4(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ShoppingListDetailsActivity.this.new AnonymousClass4(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = ShoppingListDetailsActivity.R;
                final ShoppingListDetailsActivity shoppingListDetailsActivity = ShoppingListDetailsActivity.this;
                final Flow flowD0 = shoppingListDetailsActivity.R4().getZ();
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(shoppingListDetailsActivity, null), new Flow<ShoppingListDetailsContract.Actions>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$4$invokeSuspend$$inlined$filter$1

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$4$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public final class AnonymousClass2<T> implements FlowCollector {
                        public final /* synthetic */ FlowCollector d;
                        public final /* synthetic */ ShoppingListDetailsActivity e;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$4$invokeSuspend$$inlined$filter$1$2", f = "ShoppingListDetailsActivity.kt", l = {50}, m = "emit")
                        /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$4$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public final class AnonymousClass1 extends ContinuationImpl {
                            public /* synthetic */ Object p;
                            public int q;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.p = obj;
                                this.q |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, ShoppingListDetailsActivity shoppingListDetailsActivity) {
                            this.d = flowCollector;
                            this.e = shoppingListDetailsActivity;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$4$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$4$invokeSuspend$$inlined$filter$1$2$1 r0 = (au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$4$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.q
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.q = r1
                                goto L18
                            L13:
                                au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$4$invokeSuspend$$inlined$filter$1$2$1 r0 = new au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$4$invokeSuspend$$inlined$filter$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.p
                                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                                int r2 = r0.q
                                r3 = 1
                                if (r2 == 0) goto L2f
                                if (r2 != r3) goto L27
                                kotlin.ResultKt.b(r6)
                                goto L52
                            L27:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L2f:
                                kotlin.ResultKt.b(r6)
                                r6 = r5
                                au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract$Actions r6 = (au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.Actions) r6
                                au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity r6 = r4.e
                                androidx.lifecycle.Lifecycle r6 = r6.getD()
                                androidx.lifecycle.Lifecycle$State r6 = r6.getD()
                                androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.h
                                int r6 = r6.compareTo(r2)
                                if (r6 < 0) goto L52
                                r0.q = r3
                                kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L52
                                return r1
                            L52:
                                kotlin.Unit r5 = kotlin.Unit.f24250a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$4$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = flowD0.collect(new AnonymousClass2(flowCollector, shoppingListDetailsActivity), continuation);
                        return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                    }
                });
                this.p = 1;
                if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$5", f = "ShoppingListDetailsActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$5, reason: invalid class name */
    final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "viewState", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$ViewState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$5$1", f = "ShoppingListDetailsActivity.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$5$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function2<ShoppingListDetailsContract.ViewState, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ ShoppingListDetailsActivity q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ShoppingListDetailsActivity shoppingListDetailsActivity, Continuation continuation) {
                super(2, continuation);
                this.q = shoppingListDetailsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
                anonymousClass1.p = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((ShoppingListDetailsContract.ViewState) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass1.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                ShoppingList shoppingList;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                ShoppingListDetailsContract.ViewState viewState = (ShoppingListDetailsContract.ViewState) this.p;
                ShoppingListDetailsActivity shoppingListDetailsActivity = this.q;
                ShoppingListDetailsListController shoppingListDetailsListController = shoppingListDetailsActivity.H;
                if (shoppingListDetailsListController == null) {
                    Intrinsics.p("listController");
                    throw null;
                }
                shoppingListDetailsListController.setData(viewState);
                ShoppingListDetailsUiModel shoppingListDetailsUiModel = viewState.f12428a;
                if (shoppingListDetailsUiModel != null && (shoppingList = shoppingListDetailsUiModel.f12434a) != null && !Intrinsics.c(shoppingList.isWatchlist(), Boolean.TRUE)) {
                    ItemTouchHelper itemTouchHelper = (ItemTouchHelper) shoppingListDetailsActivity.P.getD();
                    ActivityShoppingListBinding activityShoppingListBinding = shoppingListDetailsActivity.I;
                    if (activityShoppingListBinding == null) {
                        Intrinsics.p("activityBinding");
                        throw null;
                    }
                    itemTouchHelper.i(activityShoppingListBinding.J);
                }
                ShoppingListDetailsUiModel shoppingListDetailsUiModel2 = viewState.f12428a;
                int i = 0;
                if (shoppingListDetailsUiModel2 != null && shoppingListDetailsUiModel2.f12434a.getRemoteId() == null && shoppingListDetailsUiModel2.b.isEmpty() && !shoppingListDetailsUiModel2.c.isEmpty()) {
                    ActivityShoppingListBinding activityShoppingListBinding2 = shoppingListDetailsActivity.I;
                    if (activityShoppingListBinding2 == null) {
                        Intrinsics.p("activityBinding");
                        throw null;
                    }
                    activityShoppingListBinding2.P.setCanShowSnackbar$shop_lists_release(false);
                }
                ActivityShoppingListBinding activityShoppingListBinding3 = shoppingListDetailsActivity.I;
                if (activityShoppingListBinding3 == null) {
                    Intrinsics.p("activityBinding");
                    throw null;
                }
                LinearLayout boostAllBanner = activityShoppingListBinding3.z.z;
                Intrinsics.g(boostAllBanner, "boostAllBanner");
                BoostAllBannerState boostAllBannerState = viewState.h;
                if (!boostAllBannerState.f12374a && !boostAllBannerState.d) {
                    i = 8;
                }
                boostAllBanner.setVisibility(i);
                return Unit.f24250a;
            }
        }

        public AnonymousClass5(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass5 anonymousClass5 = ShoppingListDetailsActivity.this.new AnonymousClass5(continuation);
            anonymousClass5.p = obj;
            return anonymousClass5;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass5 anonymousClass5 = (AnonymousClass5) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass5.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.p;
            int i = ShoppingListDetailsActivity.R;
            ShoppingListDetailsActivity shoppingListDetailsActivity = ShoppingListDetailsActivity.this;
            FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(shoppingListDetailsActivity, null), FlowExtKt.a(shoppingListDetailsActivity.R4().getY(), shoppingListDetailsActivity.getD(), Lifecycle.State.h)), coroutineScope);
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$6", f = "ShoppingListDetailsActivity.kt", l = {362}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$6, reason: invalid class name */
    final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/product/offers/ProductBoostContract$Action;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$6$1", f = "ShoppingListDetailsActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$6$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function2<ProductBoostContract.Action, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ ShoppingListDetailsActivity q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ShoppingListDetailsActivity shoppingListDetailsActivity, Continuation continuation) {
                super(2, continuation);
                this.q = shoppingListDetailsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
                anonymousClass1.p = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((ProductBoostContract.Action) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass1.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                final ProductBoostContract.Action action = (ProductBoostContract.Action) this.p;
                int i = ShoppingListDetailsActivity.R;
                long j = Intrinsics.c(action.getF9322a(), "BOOST_ALL") ? 0L : 4000L;
                final ShoppingListDetailsActivity shoppingListDetailsActivity = this.q;
                ActivityShoppingListBinding activityShoppingListBinding = shoppingListDetailsActivity.I;
                if (activityShoppingListBinding == null) {
                    Intrinsics.p("activityBinding");
                    throw null;
                }
                View view = activityShoppingListBinding.h;
                Intrinsics.g(view, "getRoot(...)");
                view.postDelayed(new Runnable() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$handleAction$$inlined$postDelayed$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        final ProductBoostContract.Action action2 = action;
                        boolean z = action2 instanceof ProductBoostContract.Action.ShowSnackbar;
                        final ShoppingListDetailsActivity shoppingListDetailsActivity2 = shoppingListDetailsActivity;
                        if (z) {
                            ActivityShoppingListBinding activityShoppingListBinding2 = shoppingListDetailsActivity2.I;
                            if (activityShoppingListBinding2 != null) {
                                shoppingListDetailsActivity2.S4(activityShoppingListBinding2, ((ProductBoostContract.Action.ShowSnackbar) action2).b).l();
                                return;
                            } else {
                                Intrinsics.p("activityBinding");
                                throw null;
                            }
                        }
                        if (!(action2 instanceof ProductBoostContract.Action.ShowRetrySnackbar)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ActivityShoppingListBinding activityShoppingListBinding3 = shoppingListDetailsActivity2.I;
                        if (activityShoppingListBinding3 == null) {
                            Intrinsics.p("activityBinding");
                            throw null;
                        }
                        Snackbar snackbarS4 = shoppingListDetailsActivity2.S4(activityShoppingListBinding3, ((ProductBoostContract.Action.ShowRetrySnackbar) action2).b);
                        snackbarS4.k("Retry", new View.OnClickListener() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$handleAction$1$1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Callback.g(view2);
                                try {
                                    ProductBoostResultViewModel productBoostResultViewModel = (ProductBoostResultViewModel) shoppingListDetailsActivity2.G.getD();
                                    ProductBoostContract.Action action3 = action2;
                                    ArrayList arrayList = ((ProductBoostContract.Action.ShowRetrySnackbar) action3).c;
                                    productBoostResultViewModel.p6(((ProductBoostContract.Action.ShowRetrySnackbar) action3).d, ((ProductBoostContract.Action.ShowRetrySnackbar) action3).e, ((ProductBoostContract.Action.ShowRetrySnackbar) action3).b, arrayList);
                                } finally {
                                    Callback.h();
                                }
                            }
                        });
                        snackbarS4.l();
                    }
                }, j);
                return Unit.f24250a;
            }
        }

        public AnonymousClass6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ShoppingListDetailsActivity.this.new AnonymousClass6(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass6) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                ShoppingListDetailsActivity shoppingListDetailsActivity = ShoppingListDetailsActivity.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(shoppingListDetailsActivity, null), FlowExtKt.a(((ProductBoostResultViewModel) shoppingListDetailsActivity.G.getD()).g, shoppingListDetailsActivity.getD(), Lifecycle.State.h));
                this.p = 1;
                if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$7", f = "ShoppingListDetailsActivity.kt", l = {373}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$7, reason: invalid class name */
    final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "message", "Lau/com/woolworths/android/onesite/models/text/ResText;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$7$1", f = "ShoppingListDetailsActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$7$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function2<ResText, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ ShoppingListDetailsActivity q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ShoppingListDetailsActivity shoppingListDetailsActivity, Continuation continuation) {
                super(2, continuation);
                this.q = shoppingListDetailsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
                anonymousClass1.p = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((ResText) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass1.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                ResText resText = (ResText) this.p;
                ShoppingListDetailsActivity shoppingListDetailsActivity = this.q;
                ShoppingListDetailsActivity.X4(shoppingListDetailsActivity, resText.getText(shoppingListDetailsActivity));
                return Unit.f24250a;
            }
        }

        public AnonymousClass7(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ShoppingListDetailsActivity.this.new AnonymousClass7(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass7) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                ShoppingListDetailsActivity shoppingListDetailsActivity = ShoppingListDetailsActivity.this;
                ActivityShoppingListBinding activityShoppingListBinding = shoppingListDetailsActivity.I;
                if (activityShoppingListBinding == null) {
                    Intrinsics.p("activityBinding");
                    throw null;
                }
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(shoppingListDetailsActivity, null), FlowExtKt.a(activityShoppingListBinding.Q.getSnackbarFlow(), shoppingListDetailsActivity.getD(), Lifecycle.State.h));
                this.p = 1;
                if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onResume$1", f = "ShoppingListDetailsActivity.kt", l = {490}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onResume$1, reason: invalid class name and case insensitive filesystem */
    final class C05001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public ShoppingListDetailsContract.IShoppingListDetailsViewModel p;
        public int q;

        public C05001(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ShoppingListDetailsActivity.this.new C05001(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((C05001) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.q;
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = ShoppingListDetailsActivity.R;
                ShoppingListDetailsActivity shoppingListDetailsActivity = ShoppingListDetailsActivity.this;
                ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModelR4 = shoppingListDetailsActivity.R4();
                this.p = iShoppingListDetailsViewModelR4;
                this.q = 1;
                obj = ShoppingListDetailsActivity.O4(shoppingListDetailsActivity, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                iShoppingListDetailsViewModel = iShoppingListDetailsViewModelR4;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iShoppingListDetailsViewModel = this.p;
                ResultKt.b(obj);
            }
            iShoppingListDetailsViewModel.T5(((Boolean) obj).booleanValue());
            return Unit.f24250a;
        }
    }

    public ShoppingListDetailsActivity() {
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        };
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.E = new ViewModelLazy(reflectionFactory.b(ShoppingListDetailsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getViewModelStore();
            }
        }, function0, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
        this.F = LazyKt.b(new b(this, 2));
        this.G = new ViewModelLazy(reflectionFactory.b(ProductBoostResultViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
        final int i = 0;
        this.L = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.a
            public final /* synthetic */ ShoppingListDetailsActivity e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                Intent intent;
                Activities.ViewSimilarProductsActivity.Result result;
                String string;
                Intent intent2;
                ProcessorActivity.Companion.Result result2;
                int i2 = i;
                ShoppingListDetailsActivity shoppingListDetailsActivity = this.e;
                ActivityResult result3 = (ActivityResult) obj;
                switch (i2) {
                    case 0:
                        int i3 = ShoppingListDetailsActivity.R;
                        Intrinsics.h(result3, "result");
                        AnalyticsManager analyticsManager = shoppingListDetailsActivity.z;
                        if (analyticsManager == null) {
                            Intrinsics.p("analyticsManager");
                            throw null;
                        }
                        ActivityShoppingListBinding activityShoppingListBinding = shoppingListDetailsActivity.I;
                        if (activityShoppingListBinding == null) {
                            Intrinsics.p("activityBinding");
                            throw null;
                        }
                        View view = activityShoppingListBinding.h;
                        Intrinsics.g(view, "getRoot(...)");
                        CreateUpdateShoppingListActivityKt.a(result3, analyticsManager, view, shoppingListDetailsActivity.R4().S0(), shoppingListDetailsActivity.Q4());
                        return;
                    case 1:
                        int i4 = ShoppingListDetailsActivity.R;
                        Intrinsics.h(result3, "result");
                        if (result3.d != -1 || (intent = result3.e) == null || (result = (Activities.ViewSimilarProductsActivity.Result) intent.getParcelableExtra("EXTRA_RESULT")) == null) {
                            return;
                        }
                        int iOrdinal = result.d.ordinal();
                        if (iOrdinal == 0) {
                            string = shoppingListDetailsActivity.getString(R.string.shop_lists_substitution_saved, result.e);
                        } else if (iOrdinal == 1) {
                            string = shoppingListDetailsActivity.getString(R.string.shop_lists_substitution_item_added_to_cart);
                        } else if (iOrdinal == 2) {
                            string = shoppingListDetailsActivity.getString(R.string.shop_lists_substitution_item_updated_in_cart);
                        } else {
                            if (iOrdinal != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            string = shoppingListDetailsActivity.getString(R.string.shop_lists_substitution_item_removed_from_cart);
                        }
                        Intrinsics.e(string);
                        ShoppingListDetailsActivity.X4(shoppingListDetailsActivity, string);
                        shoppingListDetailsActivity.R4().p5();
                        return;
                    default:
                        int i5 = ShoppingListDetailsActivity.R;
                        Intrinsics.h(result3, "result");
                        if (result3.d != -1 || (intent2 = result3.e) == null || (result2 = (ProcessorActivity.Companion.Result) intent2.getParcelableExtra("EXTRA_RESULT")) == null) {
                            return;
                        }
                        shoppingListDetailsActivity.R4().o4(result2.d);
                        return;
                }
            }
        });
        final int i2 = 1;
        this.M = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.a
            public final /* synthetic */ ShoppingListDetailsActivity e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                Intent intent;
                Activities.ViewSimilarProductsActivity.Result result;
                String string;
                Intent intent2;
                ProcessorActivity.Companion.Result result2;
                int i22 = i2;
                ShoppingListDetailsActivity shoppingListDetailsActivity = this.e;
                ActivityResult result3 = (ActivityResult) obj;
                switch (i22) {
                    case 0:
                        int i3 = ShoppingListDetailsActivity.R;
                        Intrinsics.h(result3, "result");
                        AnalyticsManager analyticsManager = shoppingListDetailsActivity.z;
                        if (analyticsManager == null) {
                            Intrinsics.p("analyticsManager");
                            throw null;
                        }
                        ActivityShoppingListBinding activityShoppingListBinding = shoppingListDetailsActivity.I;
                        if (activityShoppingListBinding == null) {
                            Intrinsics.p("activityBinding");
                            throw null;
                        }
                        View view = activityShoppingListBinding.h;
                        Intrinsics.g(view, "getRoot(...)");
                        CreateUpdateShoppingListActivityKt.a(result3, analyticsManager, view, shoppingListDetailsActivity.R4().S0(), shoppingListDetailsActivity.Q4());
                        return;
                    case 1:
                        int i4 = ShoppingListDetailsActivity.R;
                        Intrinsics.h(result3, "result");
                        if (result3.d != -1 || (intent = result3.e) == null || (result = (Activities.ViewSimilarProductsActivity.Result) intent.getParcelableExtra("EXTRA_RESULT")) == null) {
                            return;
                        }
                        int iOrdinal = result.d.ordinal();
                        if (iOrdinal == 0) {
                            string = shoppingListDetailsActivity.getString(R.string.shop_lists_substitution_saved, result.e);
                        } else if (iOrdinal == 1) {
                            string = shoppingListDetailsActivity.getString(R.string.shop_lists_substitution_item_added_to_cart);
                        } else if (iOrdinal == 2) {
                            string = shoppingListDetailsActivity.getString(R.string.shop_lists_substitution_item_updated_in_cart);
                        } else {
                            if (iOrdinal != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            string = shoppingListDetailsActivity.getString(R.string.shop_lists_substitution_item_removed_from_cart);
                        }
                        Intrinsics.e(string);
                        ShoppingListDetailsActivity.X4(shoppingListDetailsActivity, string);
                        shoppingListDetailsActivity.R4().p5();
                        return;
                    default:
                        int i5 = ShoppingListDetailsActivity.R;
                        Intrinsics.h(result3, "result");
                        if (result3.d != -1 || (intent2 = result3.e) == null || (result2 = (ProcessorActivity.Companion.Result) intent2.getParcelableExtra("EXTRA_RESULT")) == null) {
                            return;
                        }
                        shoppingListDetailsActivity.R4().o4(result2.d);
                        return;
                }
            }
        });
        final int i3 = 2;
        this.N = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.a
            public final /* synthetic */ ShoppingListDetailsActivity e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                Intent intent;
                Activities.ViewSimilarProductsActivity.Result result;
                String string;
                Intent intent2;
                ProcessorActivity.Companion.Result result2;
                int i22 = i3;
                ShoppingListDetailsActivity shoppingListDetailsActivity = this.e;
                ActivityResult result3 = (ActivityResult) obj;
                switch (i22) {
                    case 0:
                        int i32 = ShoppingListDetailsActivity.R;
                        Intrinsics.h(result3, "result");
                        AnalyticsManager analyticsManager = shoppingListDetailsActivity.z;
                        if (analyticsManager == null) {
                            Intrinsics.p("analyticsManager");
                            throw null;
                        }
                        ActivityShoppingListBinding activityShoppingListBinding = shoppingListDetailsActivity.I;
                        if (activityShoppingListBinding == null) {
                            Intrinsics.p("activityBinding");
                            throw null;
                        }
                        View view = activityShoppingListBinding.h;
                        Intrinsics.g(view, "getRoot(...)");
                        CreateUpdateShoppingListActivityKt.a(result3, analyticsManager, view, shoppingListDetailsActivity.R4().S0(), shoppingListDetailsActivity.Q4());
                        return;
                    case 1:
                        int i4 = ShoppingListDetailsActivity.R;
                        Intrinsics.h(result3, "result");
                        if (result3.d != -1 || (intent = result3.e) == null || (result = (Activities.ViewSimilarProductsActivity.Result) intent.getParcelableExtra("EXTRA_RESULT")) == null) {
                            return;
                        }
                        int iOrdinal = result.d.ordinal();
                        if (iOrdinal == 0) {
                            string = shoppingListDetailsActivity.getString(R.string.shop_lists_substitution_saved, result.e);
                        } else if (iOrdinal == 1) {
                            string = shoppingListDetailsActivity.getString(R.string.shop_lists_substitution_item_added_to_cart);
                        } else if (iOrdinal == 2) {
                            string = shoppingListDetailsActivity.getString(R.string.shop_lists_substitution_item_updated_in_cart);
                        } else {
                            if (iOrdinal != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            string = shoppingListDetailsActivity.getString(R.string.shop_lists_substitution_item_removed_from_cart);
                        }
                        Intrinsics.e(string);
                        ShoppingListDetailsActivity.X4(shoppingListDetailsActivity, string);
                        shoppingListDetailsActivity.R4().p5();
                        return;
                    default:
                        int i5 = ShoppingListDetailsActivity.R;
                        Intrinsics.h(result3, "result");
                        if (result3.d != -1 || (intent2 = result3.e) == null || (result2 = (ProcessorActivity.Companion.Result) intent2.getParcelableExtra("EXTRA_RESULT")) == null) {
                            return;
                        }
                        shoppingListDetailsActivity.R4().o4(result2.d);
                        return;
                }
            }
        });
        this.O = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new au.com.woolworths.feature.product.list.b(5));
        this.P = LazyKt.b(new b(this, 0));
        this.Q = LazyKt.b(new b(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object O4(au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$getWatchlistToggleStatus$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$getWatchlistToggleStatus$1 r0 = (au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$getWatchlistToggleStatus$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$getWatchlistToggleStatus$1 r0 = new au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$getWatchlistToggleStatus$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L4e
            return r5
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.ResultKt.b(r5)
            au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract$IShoppingListDetailsViewModel r5 = r4.R4()
            boolean r5 = r5.H5()
            if (r5 == 0) goto L58
            au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$getWatchlistToggleStatus$2 r5 = new au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$getWatchlistToggleStatus$2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L4e
            r2 = 0
            r5.<init>(r4, r2)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L4e
            r0.r = r3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L4e
            r2 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r4 = kotlinx.coroutines.TimeoutKt.b(r2, r5, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L4e
            if (r4 != r1) goto L4d
            return r1
        L4d:
            return r4
        L4e:
            timber.log.Timber$Forest r4 = timber.log.Timber.f27013a
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r0 = "Unable to fetch Watchlist toggle status : It took more than 3000ms to fetch"
            r4.o(r0, r5)
        L58:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity.O4(au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static /* synthetic */ void X4(ShoppingListDetailsActivity shoppingListDetailsActivity, CharSequence charSequence) {
        shoppingListDetailsActivity.W4(charSequence, null, new au.com.woolworths.rewards.base.d(16));
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final CoroutineScope A2() {
        return R4().D1();
    }

    @Override // au.com.woolworths.shop.lists.ui.lists.DeleteListDialogListener
    public final void D(String listId, boolean z) {
        Intrinsics.h(listId, "listId");
        R4().D(listId, z);
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final void E2(ListChangeEvent listChangeEvent) {
        if (!(listChangeEvent instanceof ListChangeEvent.AddToListSuccessEvent)) {
            if (!(listChangeEvent instanceof ListChangeEvent.RemoveFromListSuccessEvent)) {
                throw new NoWhenBranchMatchedException();
            }
            R4().V5();
            return;
        }
        ListChangeEvent.AddToListSuccessEvent addToListSuccessEvent = (ListChangeEvent.AddToListSuccessEvent) listChangeEvent;
        ActivityShoppingListBinding activityShoppingListBinding = this.I;
        if (activityShoppingListBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        View view = activityShoppingListBinding.h;
        Intrinsics.g(view, "getRoot(...)");
        boolean zF = P4().f();
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.f
            public final /* synthetic */ ShoppingListDetailsActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                Unit unit = Unit.f24250a;
                ShoppingListDetailsActivity shoppingListDetailsActivity = this.e;
                switch (i2) {
                    case 0:
                        int i3 = ShoppingListDetailsActivity.R;
                        Intrinsics.h((ListChangeEvent.AddToListSuccessEvent) obj, "<unused var>");
                        AnalyticsManager analyticsManager = shoppingListDetailsActivity.z;
                        if (analyticsManager != null) {
                            analyticsManager.j(ShoppingListDetailsActions.SaveToWatchlistSnackbarViewAction.d, TrackingMetadata.Companion.a(TrackableValue.F2, "lists"));
                            return unit;
                        }
                        Intrinsics.p("analyticsManager");
                        throw null;
                    default:
                        Snackbar it = (Snackbar) obj;
                        int i4 = ShoppingListDetailsActivity.R;
                        Intrinsics.h(it, "it");
                        it.f(shoppingListDetailsActivity.Q4());
                        ViewCompat.F(it.i, shoppingListDetailsActivity.getResources().getDimension(R.dimen.shop_list_details_totals_view_elevation) + ContextExtKt.a(1.0f, shoppingListDetailsActivity));
                        return unit;
                }
            }
        };
        final int i2 = 1;
        Function1 function12 = new Function1(this) { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.f
            public final /* synthetic */ ShoppingListDetailsActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i2;
                Unit unit = Unit.f24250a;
                ShoppingListDetailsActivity shoppingListDetailsActivity = this.e;
                switch (i22) {
                    case 0:
                        int i3 = ShoppingListDetailsActivity.R;
                        Intrinsics.h((ListChangeEvent.AddToListSuccessEvent) obj, "<unused var>");
                        AnalyticsManager analyticsManager = shoppingListDetailsActivity.z;
                        if (analyticsManager != null) {
                            analyticsManager.j(ShoppingListDetailsActions.SaveToWatchlistSnackbarViewAction.d, TrackingMetadata.Companion.a(TrackableValue.F2, "lists"));
                            return unit;
                        }
                        Intrinsics.p("analyticsManager");
                        throw null;
                    default:
                        Snackbar it = (Snackbar) obj;
                        int i4 = ShoppingListDetailsActivity.R;
                        Intrinsics.h(it, "it");
                        it.f(shoppingListDetailsActivity.Q4());
                        ViewCompat.F(it.i, shoppingListDetailsActivity.getResources().getDimension(R.dimen.shop_list_details_totals_view_elevation) + ContextExtKt.a(1.0f, shoppingListDetailsActivity));
                        return unit;
                }
            }
        };
        if (addToListSuccessEvent.g) {
            String string = getString(R.string.product_copy_to_list_already_exists);
            Intrinsics.g(string, "getString(...)");
            Snackbar snackbarJ = Snackbar.j(null, view, string, 0);
            function12.invoke(snackbarJ);
            snackbarJ.l();
            return;
        }
        String string2 = getString(R.string.product_copy_to_list_successfully, addToListSuccessEvent.f, addToListSuccessEvent.e);
        Intrinsics.g(string2, "getString(...)");
        Snackbar snackbarJ2 = Snackbar.j(null, view, string2, 0);
        function12.invoke(snackbarJ2);
        if (!zF) {
            snackbarJ2.k(getString(R.string.view_list), new au.com.woolworths.feature.shared.web.file.uploader.a(3, function1, addToListSuccessEvent, this));
        }
        snackbarJ2.l();
    }

    @Override // au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetFragment.ListMenuDialogListener
    public final void O1(ShoppingList list, ListAction action) {
        Intrinsics.h(list, "list");
        Intrinsics.h(action, "action");
        int iOrdinal = action.ordinal();
        if (iOrdinal == 0) {
            R4().w2();
            return;
        }
        if (iOrdinal == 1) {
            R4().w0(list);
            return;
        }
        if (iOrdinal == 2) {
            R4().c0();
            return;
        }
        if (iOrdinal == 3) {
            R4().W();
        } else if (iOrdinal != 4) {
            X4(this, action.name());
        } else {
            R4().s1();
        }
    }

    public final ListsInMemoryRepository P4() {
        ListsInMemoryRepository listsInMemoryRepository = this.A;
        if (listsInMemoryRepository != null) {
            return listsInMemoryRepository;
        }
        Intrinsics.p("listsInMemoryRepository");
        throw null;
    }

    @Override // au.com.woolworths.base.shopapp.cartbadge.CartBadgeClickListener
    public final void Q() {
        R4().V2();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet.SortByBottomSheetFragment.BottomSheetHost
    public final void Q1(SortBy sortBy) {
        Intrinsics.h(sortBy, "sortBy");
        ActivityShoppingListBinding activityShoppingListBinding = this.I;
        if (activityShoppingListBinding != null) {
            activityShoppingListBinding.M.h(sortBy);
        } else {
            Intrinsics.p("activityBinding");
            throw null;
        }
    }

    public final ViewGroup Q4() {
        ActivityShoppingListBinding activityShoppingListBinding = this.I;
        if (activityShoppingListBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        ListDetailsView totalsView = activityShoppingListBinding.P;
        ConstraintLayout scanItemLayout = activityShoppingListBinding.L;
        Intrinsics.g(scanItemLayout, "scanItemLayout");
        if (scanItemLayout.getVisibility() == 0) {
            return scanItemLayout;
        }
        Intrinsics.g(totalsView, "totalsView");
        if (totalsView.getVisibility() == 0) {
            return totalsView;
        }
        return null;
    }

    public final ShoppingListDetailsContract.IShoppingListDetailsViewModel R4() {
        return (ShoppingListDetailsContract.IShoppingListDetailsViewModel) this.F.getD();
    }

    public final Snackbar S4(ActivityShoppingListBinding activityShoppingListBinding, CharSequence charSequence) {
        Snackbar snackbarJ = Snackbar.j(null, activityShoppingListBinding.h, charSequence, 0);
        snackbarJ.f(Q4());
        ViewCompat.F(snackbarJ.i, getResources().getDimension(R.dimen.shop_list_details_totals_view_elevation) + ContextExtKt.a(1.0f, this));
        return snackbarJ;
    }

    public final void T4() {
        ActivityShoppingListBinding activityShoppingListBinding = this.I;
        if (activityShoppingListBinding != null) {
            activityShoppingListBinding.J.o0(0);
        } else {
            Intrinsics.p("activityBinding");
            throw null;
        }
    }

    public final void U4(View anchorView, SimpleCoachMarkSettings simpleCoachMarkSettings, Function0 function0) {
        ActivityShoppingListBinding activityShoppingListBinding = this.I;
        if (activityShoppingListBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        View view = activityShoppingListBinding.h;
        Intrinsics.f(view, "null cannot be cast to non-null type android.view.ViewGroup");
        au.com.woolworths.design.core.ui.component.experimental.quantitystepper.j jVar = new au.com.woolworths.design.core.ui.component.experimental.quantitystepper.j(17, function0);
        LinkedList linkedList = QueueSimpleCoachMarkKt.f12451a;
        Intrinsics.h(anchorView, "anchorView");
        au.com.woolworths.android.onesite.modules.main.f fVar = new au.com.woolworths.android.onesite.modules.main.f(this, (ViewGroup) view, anchorView, simpleCoachMarkSettings, SimpleCoachMarkSettingsKt.f4616a, jVar, 1);
        LinkedList linkedList2 = QueueSimpleCoachMarkKt.f12451a;
        linkedList2.add(fVar);
        if (linkedList2.size() == 1) {
            fVar.invoke();
        }
    }

    public final void V4(ProductItemUiModel productItemUiModel, String str) {
        CopyFromListParameters copyFromListParameters = str != null ? new CopyFromListParameters(str, productItemUiModel.h) : null;
        ProductCard productCard = productItemUiModel.i;
        if (productCard != null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            ListScreen listScreenS0 = R4().S0();
            List listQ = CollectionsKt.Q(new AddToListProductParameters(productCard, productItemUiModel.f12432a, (Float) null, false, 28));
            ProductInfoViewFactory productInfoViewFactory = new ProductInfoViewFactory(productCard);
            boolean z = str == null;
            AddToListMode addToListMode = AddToListMode.d;
            AddToListBottomSheetFragment.Companion.a(supportFragmentManager, null, listScreenS0, listQ, copyFromListParameters, productInfoViewFactory, z, null, null, 642);
        }
    }

    public final void W4(CharSequence charSequence, Text text, Function0 function0) {
        CharSequence text2;
        ActivityShoppingListBinding activityShoppingListBinding = this.I;
        if (activityShoppingListBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        Snackbar snackbarS4 = S4(activityShoppingListBinding, charSequence);
        if (text != null && (text2 = text.getText(snackbarS4.h)) != null) {
            snackbarS4.k(text2, new e(0, this, function0));
        }
        snackbarS4.l();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent event) {
        View currentFocus;
        Intrinsics.h(event, "event");
        if (event.getAction() == 1 && (currentFocus = getCurrentFocus()) != null && (currentFocus instanceof EditText)) {
            Rect rect = new Rect();
            currentFocus.getGlobalVisibleRect(rect);
            if (!rect.contains((int) event.getRawX(), (int) event.getRawY())) {
                ActivityShoppingListBinding activityShoppingListBinding = this.I;
                if (activityShoppingListBinding == null) {
                    Intrinsics.p("activityBinding");
                    throw null;
                }
                View view = activityShoppingListBinding.h;
                Intrinsics.g(view, "getRoot(...)");
                if (!(ViewExtKt.c(view, (int) event.getX(), (int) event.getY()) instanceof EditText)) {
                    SoftInputKt.a(currentFocus);
                }
            }
        }
        return super.dispatchTouchEvent(event);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.ui.DeleteCheckedItemsDialogListener
    public final void h(boolean z) {
        if (z) {
            R4().v5();
        }
    }

    @Override // au.com.woolworths.shop.lists.ui.lists.DeleteListDialogListener
    public final void i(String listId, boolean z) {
        Intrinsics.h(listId, "listId");
        R4().i(listId, z);
    }

    @Override // au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.SnapAListBottomSheetFragment.BottomSheetHost
    public final void l(SnapAListMenuOption menuOption) {
        Intrinsics.h(menuOption, "menuOption");
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new ShoppingListDetailsActivity$onOptionClick$1(menuOption, this, null), 3);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.ui.UncheckCheckedItemsDialogListener
    public final void l0(boolean z) {
        if (z) {
            R4().X();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$1] */
    /* JADX WARN: Type inference failed for: r3v6, types: [au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$setupRecyclerView$2$1] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEvent$registerEventListener$layoutListener$1] */
    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.Hilt_ShoppingListDetailsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Lazy lazy = this.Q;
        String str = ((Activities.ShoppingListDetails.Extras) lazy.getD()).d;
        R4().b0(str, ((Activities.ShoppingListDetails.Extras) lazy.getD()).e);
        this.J = new Animator.AnimatorListener() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity.onCreate.1
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                Intrinsics.h(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Intrinsics.h(animator, "animator");
                final ShoppingListDetailsActivity shoppingListDetailsActivity = ShoppingListDetailsActivity.this;
                ActivityShoppingListBinding activityShoppingListBinding = shoppingListDetailsActivity.I;
                if (activityShoppingListBinding == null) {
                    Intrinsics.p("activityBinding");
                    throw null;
                }
                View view = activityShoppingListBinding.h;
                Intrinsics.g(view, "getRoot(...)");
                view.postDelayed(new Runnable() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onCreate$1$onAnimationEnd$$inlined$postDelayed$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = ShoppingListDetailsActivity.R;
                        shoppingListDetailsActivity.R4().t3();
                    }
                }, 100L);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
                Intrinsics.h(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                Intrinsics.h(animator, "animator");
            }
        };
        ActivityShoppingListBinding activityShoppingListBinding = (ActivityShoppingListBinding) DataBindingUtil.d(this, R.layout.activity_shopping_list);
        activityShoppingListBinding.D(this);
        activityShoppingListBinding.P(R4());
        activityShoppingListBinding.M(Boolean.valueOf(P4().f()));
        activityShoppingListBinding.N(str);
        activityShoppingListBinding.L(this);
        activityShoppingListBinding.O((ShoppingListDetailsViewModel) this.E.getD());
        setSupportActionBar(activityShoppingListBinding.O);
        activityShoppingListBinding.N.setColorSchemeColors(Extensions.a(R.attr.colorPrimary, this));
        LottieAnimationView lottieAnimationView = activityShoppingListBinding.z.y;
        AnonymousClass1 anonymousClass1 = this.J;
        if (anonymousClass1 == null) {
            Intrinsics.p("boostAllAnimationListener");
            throw null;
        }
        lottieAnimationView.k.e.addListener(anonymousClass1);
        CollapsingToolbarLayout collapsibleToolbar = activityShoppingListBinding.B;
        Intrinsics.g(collapsibleToolbar, "collapsibleToolbar");
        ViewExtKt.b(collapsibleToolbar, new au.com.woolworths.foundation.shop.olive.voice.ui.permission.a(23));
        ConstraintLayout scanItemLayout = activityShoppingListBinding.L;
        Intrinsics.g(scanItemLayout, "scanItemLayout");
        ViewExtKt.a(scanItemLayout);
        this.I = activityShoppingListBinding;
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.s(true);
            supportActionBar.A(null);
        }
        ActivityShoppingListBinding activityShoppingListBinding2 = this.I;
        if (activityShoppingListBinding2 == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        ComposeView composeView = activityShoppingListBinding2.G;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f1986a);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$setToolbarIconContent$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    int i = ShoppingListDetailsActivity.R;
                    ShoppingListDetailsUiModel shoppingListDetailsUiModel = ((ShoppingListDetailsContract.ViewState) SnapshotStateKt.a(this.d.R4().getY(), composer).getD()).f12428a;
                    final ShoppingList shoppingList = shoppingListDetailsUiModel != null ? shoppingListDetailsUiModel.f12434a : null;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1876539964, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$setToolbarIconContent$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                ShoppingList shoppingList2 = shoppingList;
                                if (shoppingList2 != null ? Intrinsics.c(shoppingList2.isWatchlist(), Boolean.TRUE) : false) {
                                    composer2.o(707805472);
                                    ListTitleRowKt.c(composer2, 0);
                                    composer2.l();
                                } else {
                                    composer2.o(707881887);
                                    ListTitleRowKt.b(ColorKt.b(shoppingList2 != null ? shoppingList2.getColor() : 0), composer2, 0);
                                    composer2.l();
                                }
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -593817724));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass4(null), 3);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass5(null), 3);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass6(null), 3);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass7(null), 3);
        ListItemListener listItemListener = new ListItemListener(R4());
        ShoppingListProductItemState shoppingListProductItemStateI0 = R4().I0();
        ListsUtils listsUtils = this.C;
        if (listsUtils == null) {
            Intrinsics.p("listsUtils");
            throw null;
        }
        FeatureToggleManager featureToggleManager = this.B;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        InstoreNavigationInteractor instoreNavigationInteractor = this.D;
        if (instoreNavigationInteractor == null) {
            Intrinsics.p("instoreNavigationInteractor");
            throw null;
        }
        ShoppingListDetailsListController shoppingListDetailsListController = new ShoppingListDetailsListController(listItemListener, shoppingListProductItemStateI0, listsUtils, featureToggleManager, instoreNavigationInteractor.d());
        shoppingListDetailsListController.addModelBuildListener(new OnModelBuildFinishedListener() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.c
            @Override // com.airbnb.epoxy.OnModelBuildFinishedListener
            public final void a(DiffResult it) {
                int i = ShoppingListDetailsActivity.R;
                Intrinsics.h(it, "it");
                ShoppingListDetailsActivity shoppingListDetailsActivity = this.f12431a;
                if (((ShoppingListDetailsContract.ViewState) shoppingListDetailsActivity.R4().getY().getValue()).a()) {
                    ActivityShoppingListBinding activityShoppingListBinding3 = shoppingListDetailsActivity.I;
                    if (activityShoppingListBinding3 != null) {
                        activityShoppingListBinding3.y.e(true, true, true);
                    } else {
                        Intrinsics.p("activityBinding");
                        throw null;
                    }
                }
            }
        });
        shoppingListDetailsListController.getAdapter().D(new RecyclerView.AdapterDataObserver() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$setupRecyclerView$1$2
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public final void d(int i, int i2) {
                if (i == 0) {
                    int i3 = ShoppingListDetailsActivity.R;
                    this.f12381a.T4();
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public final void e(int i, int i2) {
                if (i == 0) {
                    int i3 = ShoppingListDetailsActivity.R;
                    this.f12381a.T4();
                }
            }
        });
        this.H = shoppingListDetailsListController;
        ActivityShoppingListBinding activityShoppingListBinding3 = this.I;
        if (activityShoppingListBinding3 == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        EpoxyRecyclerView epoxyRecyclerView = activityShoppingListBinding3.J;
        epoxyRecyclerView.setLayoutManager(new LinearLayoutManager(epoxyRecyclerView.getContext()));
        ShoppingListDetailsListController shoppingListDetailsListController2 = this.H;
        if (shoppingListDetailsListController2 == null) {
            Intrinsics.p("listController");
            throw null;
        }
        epoxyRecyclerView.setController(shoppingListDetailsListController2);
        epoxyRecyclerView.i(new ShoppingListItemSectionDecoration(this));
        epoxyRecyclerView.i(new ShoppingListItemDecoration(this));
        Context context = epoxyRecyclerView.getContext();
        Intrinsics.g(context, "getContext(...)");
        ShoppingListDetailsListController shoppingListDetailsListController3 = this.H;
        if (shoppingListDetailsListController3 == null) {
            Intrinsics.p("listController");
            throw null;
        }
        new ItemTouchHelper(new ShoppingListItemDeleteSwipeCallback(context, shoppingListDetailsListController3, new ShoppingListItemSwipeListener() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$setupRecyclerView$2$1
            @Override // au.com.woolworths.shop.lists.ui.shoppinglist.ui.ShoppingListItemSwipeListener
            public final void a(ShoppingListItemUiModel shoppingListItemUiModel) {
                int i = ShoppingListDetailsActivity.R;
                this.f12382a.R4().W0(shoppingListItemUiModel);
            }
        })).i(epoxyRecyclerView);
        ViewExtKt.a(epoxyRecyclerView);
        if (P4().f()) {
            return;
        }
        final au.com.woolworths.product.details.epoxy.a aVar = new au.com.woolworths.product.details.epoxy.a(this, 9);
        Window window = getWindow();
        Intrinsics.g(window, "activity.window");
        if ((window.getAttributes().softInputMode & 48) == 48) {
            throw new IllegalArgumentException("Parameter:activity window SoftInputMethod is SOFT_INPUT_ADJUST_NOTHING. In this case window will not be resized");
        }
        View viewA = KeyboardVisibilityEvent.a(this);
        ?? r3 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEvent$registerEventListener$layoutListener$1
            public boolean d;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Rect rect = new Rect();
                ShoppingListDetailsActivity shoppingListDetailsActivity = this.e;
                View viewA2 = KeyboardVisibilityEvent.a(shoppingListDetailsActivity);
                viewA2.getWindowVisibleDisplayFrame(rect);
                int[] iArr = new int[2];
                View viewFindViewById = shoppingListDetailsActivity.findViewById(android.R.id.content);
                Intrinsics.g(viewFindViewById, "activity.findViewById(android.R.id.content)");
                ((ViewGroup) viewFindViewById).getLocationOnScreen(iArr);
                View rootView = viewA2.getRootView();
                Intrinsics.g(rootView, "activityRoot.rootView");
                int height = rootView.getHeight();
                boolean z = ((double) ((height - rect.height()) - iArr[1])) > ((double) height) * 0.15d;
                if (z == this.d) {
                    return;
                }
                this.d = z;
                ShoppingListDetailsActivity shoppingListDetailsActivity2 = (ShoppingListDetailsActivity) aVar.e;
                if (z) {
                    int i = ShoppingListDetailsActivity.R;
                    Window window2 = shoppingListDetailsActivity2.getWindow();
                    Intrinsics.g(window2, "getWindow(...)");
                    ActivityShoppingListBinding activityShoppingListBinding4 = shoppingListDetailsActivity2.I;
                    if (activityShoppingListBinding4 == null) {
                        Intrinsics.p("activityBinding");
                        throw null;
                    }
                    CoordinatorLayout coordinatorLayout = activityShoppingListBinding4.D;
                    Intrinsics.g(coordinatorLayout, "coordinatorLayout");
                    shoppingListDetailsActivity2.K = new InsetsWithKeyboardCallback(window2, coordinatorLayout);
                } else {
                    InsetsWithKeyboardCallback insetsWithKeyboardCallback = shoppingListDetailsActivity2.K;
                    if (insetsWithKeyboardCallback != null && Build.VERSION.SDK_INT <= 29) {
                        insetsWithKeyboardCallback.f.setSoftInputMode(32);
                    }
                }
                ActivityShoppingListBinding activityShoppingListBinding5 = shoppingListDetailsActivity2.I;
                if (activityShoppingListBinding5 == null) {
                    Intrinsics.p("activityBinding");
                    throw null;
                }
                activityShoppingListBinding5.P.c(z);
                ActivityShoppingListBinding activityShoppingListBinding6 = shoppingListDetailsActivity2.I;
                if (activityShoppingListBinding6 == null) {
                    Intrinsics.p("activityBinding");
                    throw null;
                }
                MaterialButton productSearchButton = activityShoppingListBinding6.I;
                Intrinsics.g(productSearchButton, "productSearchButton");
                productSearchButton.setVisibility(z ? 0 : 8);
            }
        };
        viewA.getViewTreeObserver().addOnGlobalLayoutListener(r3);
        final SimpleUnregistrar simpleUnregistrar = new SimpleUnregistrar(this, r3);
        getApplication().registerActivityLifecycleCallbacks(new AutoActivityLifecycleCallback(this) { // from class: net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEvent$setEventListener$2
            @Override // net.yslibrary.android.keyboardvisibilityevent.AutoActivityLifecycleCallback
            public final void a() {
                SimpleUnregistrar simpleUnregistrar2 = simpleUnregistrar;
                WeakReference weakReference = simpleUnregistrar2.f26630a;
                Activity activity = (Activity) weakReference.get();
                WeakReference weakReference2 = simpleUnregistrar2.b;
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) weakReference2.get();
                if (activity != null && onGlobalLayoutListener != null) {
                    KeyboardVisibilityEvent.a(activity).getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
                }
                weakReference.clear();
                weakReference2.clear();
            }
        });
        ActivityShoppingListBinding activityShoppingListBinding4 = this.I;
        if (activityShoppingListBinding4 != null) {
            activityShoppingListBinding4.C.setAccessibilityDelegate(new SearchButtonAccessibilityDelegate());
        } else {
            Intrinsics.p("activityBinding");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.h(menu, "menu");
        getMenuInflater().inflate(R.menu.menu_shopping_list, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.cart_item);
        if (P4().e()) {
            Intrinsics.e(menuItemFindItem);
            menuItemFindItem.setVisible(P4().c());
            if (!P4().c()) {
                return true;
            }
            SngCartBadgeActionView sngCartBadgeActionView = new SngCartBadgeActionView(this, null);
            sngCartBadgeActionView.setCartBadgeCount$shop_lists_release(P4().e.g);
            sngCartBadgeActionView.setCartBadgeClickListener(this);
            menuItemFindItem.setActionView(sngCartBadgeActionView);
            return true;
        }
        CartUpdateInteractor cartUpdateInteractor = this.y;
        if (cartUpdateInteractor == null) {
            Intrinsics.p("cartUpdateInteractor");
            throw null;
        }
        menuItemFindItem.setVisible(cartUpdateInteractor.b.z());
        View actionView = menuItemFindItem.getActionView();
        CartBadgeActionView cartBadgeActionView = actionView instanceof CartBadgeActionView ? (CartBadgeActionView) actionView : null;
        if (cartBadgeActionView == null) {
            return true;
        }
        cartBadgeActionView.setAnalyticsScreen(R4().S0());
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Callback.p(menuItem);
        try {
            Intrinsics.h(menuItem, "menuItem");
            int itemId = menuItem.getItemId();
            boolean zOnOptionsItemSelected = true;
            if (itemId == 16908332) {
                finish();
            } else if (itemId == R.id.search) {
                R4().b();
            } else if (itemId == R.id.more) {
                R4().P0();
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            }
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        ActivityShoppingListBinding activityShoppingListBinding = this.I;
        if (activityShoppingListBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        View view = activityShoppingListBinding.h;
        Intrinsics.g(view, "getRoot(...)");
        SoftInputKt.a(view);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new C05001(null), 3);
    }

    @Override // au.com.woolworths.shop.lists.ui.details.ui.ListDetailsViewListener
    public final void q(int i) {
        ActivityShoppingListBinding activityShoppingListBinding = this.I;
        if (activityShoppingListBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        EpoxyRecyclerView recyclerView = activityShoppingListBinding.J;
        Intrinsics.g(recyclerView, "recyclerView");
        recyclerView.setPadding(0, 0, 0, i);
    }

    @Override // au.com.woolworths.shop.lists.ui.watchlist.bottomsheet.WatchlistBottomSheetFragment.BottomSheetHost
    public final void u2() {
        ActivityShoppingListBinding activityShoppingListBinding = this.I;
        if (activityShoppingListBinding != null) {
            activityShoppingListBinding.Q.d();
        } else {
            Intrinsics.p("activityBinding");
            throw null;
        }
    }
}
