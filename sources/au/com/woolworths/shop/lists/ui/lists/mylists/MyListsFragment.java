package au.com.woolworths.shop.lists.ui.lists.mylists;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.analytics.supers.lists.ListsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.extensions.DialogFragmentExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivity;
import au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivityKt;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.lists.data.WatchlistInteractor;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import au.com.woolworths.shop.lists.ui.ListScreen;
import au.com.woolworths.shop.lists.ui.lists.DeleteConfirmationDialogFragment;
import au.com.woolworths.shop.lists.ui.lists.DeleteListDialogListener;
import au.com.woolworths.shop.lists.ui.lists.analytics.SharedListsActions;
import au.com.woolworths.shop.lists.ui.lists.compose.MyListScreenKt;
import au.com.woolworths.shop.lists.ui.lists.menu.ListAction;
import au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetFragment;
import au.com.woolworths.shop.lists.ui.lists.mylists.MyListsContract;
import au.com.woolworths.shop.lists.ui.pastshops.PastShopsActivity;
import au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorActivity;
import au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.CameraMenuOption;
import au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.ImageMenuOption;
import au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.SnapAListBottomSheetFragment;
import au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.SnapAListBottomSheetType;
import au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.SnapAListMenuOption;
import au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.WriteMenuOption;
import au.com.woolworths.shop.lists.ui.utils.ListsUtils;
import com.google.android.material.snackbar.Snackbar;
import com.salesforce.marketingcloud.UrlHandler;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.SharedFlowImpl;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsFragment;", "Landroidx/fragment/app/Fragment;", "Lau/com/woolworths/shop/lists/ui/lists/menu/ListsBottomSheetFragment$ListMenuDialogListener;", "Lau/com/woolworths/shop/lists/ui/lists/DeleteListDialogListener;", "Lau/com/woolworths/shop/lists/ui/snapalist/snapbottomsheet/SnapAListBottomSheetFragment$BottomSheetHost;", "<init>", "()V", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MyListsFragment extends Hilt_MyListsFragment implements ListsBottomSheetFragment.ListMenuDialogListener, DeleteListDialogListener, SnapAListBottomSheetFragment.BottomSheetHost {
    public FeatureToggleManager i;
    public AnalyticsManager j;
    public ListsInMemoryRepository k;
    public ListsUtils l;
    public final ViewModelLazy m;
    public final ActivityResultLauncher n;
    public final ActivityResultLauncher o;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ListAction.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ListAction listAction = ListAction.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ListAction listAction2 = ListAction.d;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.lists.mylists.MyListsFragment$onCreate$1", f = "MyListsFragment.kt", l = {99}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.ui.lists.mylists.MyListsFragment$onCreate$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", UrlHandler.ACTION, "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.lists.mylists.MyListsFragment$onCreate$1$1", f = "MyListsFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.shop.lists.ui.lists.mylists.MyListsFragment$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        final class C02531 extends SuspendLambda implements Function2<MyListsContract.Actions, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ MyListsFragment q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02531(MyListsFragment myListsFragment, Continuation continuation) {
                super(2, continuation);
                this.q = myListsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C02531 c02531 = new C02531(this.q, continuation);
                c02531.p = obj;
                return c02531;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C02531 c02531 = (C02531) create((MyListsContract.Actions) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                c02531.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                MyListsContract.Actions actions = (MyListsContract.Actions) this.p;
                boolean z = actions instanceof MyListsContract.Actions.LaunchShoppingListDetails;
                MyListsFragment myListsFragment = this.q;
                if (z) {
                    MyListsContract.Actions.LaunchShoppingListDetails launchShoppingListDetails = (MyListsContract.Actions.LaunchShoppingListDetails) actions;
                    myListsFragment.requireContext().startActivity(Activities.ShoppingListDetails.f4535a.b(launchShoppingListDetails.f12335a, launchShoppingListDetails.c));
                    if (Intrinsics.c(launchShoppingListDetails.d, Boolean.TRUE)) {
                        myListsFragment.requireActivity().finish();
                    }
                } else if (actions instanceof MyListsContract.Actions.LaunchBoostedOffers) {
                    myListsFragment.startActivity(Activities.ProductList.f4505a.b(new Activities.ProductList.Extras(new Activities.ProductList.ExtrasPageData("My Boosted Offers", null), new Activities.ProductList.ExtrasByBoostedOffers(""), (Activities.ProductList.ExtrasConfig) null, 12), false));
                } else if (actions instanceof MyListsContract.Actions.LaunchBuyAgain) {
                    myListsFragment.startActivity(ActivityNavigatorKt.a(Activities.BuyAgainActivity.f4453a, ApplicationType.e));
                } else if (actions instanceof MyListsContract.Actions.LaunchPastShops) {
                    int i = PastShopsActivity.C;
                    Context contextRequireContext = myListsFragment.requireContext();
                    Intrinsics.g(contextRequireContext, "requireContext(...)");
                    contextRequireContext.startActivity(new Intent(contextRequireContext, (Class<?>) PastShopsActivity.class));
                } else if (actions instanceof MyListsContract.Actions.LaunchCreateShoppingListActivity) {
                    int i2 = CreateUpdateShoppingListActivity.A;
                    Context contextRequireContext2 = myListsFragment.requireContext();
                    Intrinsics.g(contextRequireContext2, "requireContext(...)");
                    contextRequireContext2.startActivity(CreateUpdateShoppingListActivity.Companion.a(Activities.CreateUpdateShoppingList.Mode.d, null));
                } else if (actions instanceof MyListsContract.Actions.ShowListMenuDialog) {
                    ListsBottomSheetFragment listsBottomSheetFragmentA = ListsBottomSheetFragment.Companion.a(((MyListsContract.Actions.ShowListMenuDialog) actions).f12339a, false);
                    FragmentManager childFragmentManager = myListsFragment.getChildFragmentManager();
                    Intrinsics.g(childFragmentManager, "getChildFragmentManager(...)");
                    DialogFragmentExtKt.a(listsBottomSheetFragmentA, childFragmentManager, "list_actions");
                } else if (actions instanceof MyListsContract.Actions.ShowSnackbar) {
                    ResText resText = ((MyListsContract.Actions.ShowSnackbar) actions).f12341a;
                    Context contextRequireContext3 = myListsFragment.requireContext();
                    Intrinsics.g(contextRequireContext3, "requireContext(...)");
                    Snackbar.j(null, myListsFragment.requireView(), resText.getText(contextRequireContext3), -1).l();
                } else if (actions instanceof MyListsContract.Actions.LaunchDuplicateShoppingListActivity) {
                    ShoppingList shoppingList = ((MyListsContract.Actions.LaunchDuplicateShoppingListActivity) actions).f12333a;
                    int i3 = CreateUpdateShoppingListActivity.A;
                    String shoppingListId = shoppingList.getId();
                    ActivityResultLauncher resultLauncher = myListsFragment.n;
                    Intrinsics.h(shoppingListId, "shoppingListId");
                    Intrinsics.h(resultLauncher, "resultLauncher");
                    resultLauncher.a(CreateUpdateShoppingListActivity.Companion.a(Activities.CreateUpdateShoppingList.Mode.e, shoppingListId), null);
                } else if (actions instanceof MyListsContract.Actions.ShowMaxListCountReachedErrorDialog) {
                    MyListsContract.Actions.ShowMaxListCountReachedErrorDialog showMaxListCountReachedErrorDialog = (MyListsContract.Actions.ShowMaxListCountReachedErrorDialog) actions;
                    ResText resText2 = showMaxListCountReachedErrorDialog.f12340a;
                    ResWithArgText resWithArgText = showMaxListCountReachedErrorDialog.b;
                    Context contextRequireContext4 = myListsFragment.requireContext();
                    Intrinsics.g(contextRequireContext4, "requireContext(...)");
                    new AlertDialog.Builder(contextRequireContext4).setTitle(resText2.getText(contextRequireContext4).toString()).setMessage(resWithArgText.getText(contextRequireContext4).toString()).setCancelable(false).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).show();
                    myListsFragment.Q1().j.g(ListsAnalytics.Lists.Action.e);
                } else {
                    boolean z2 = actions instanceof MyListsContract.Actions.LaunchWatchlistGuestOnboardingScreen;
                    Activities.ShopListGuestOnboardingActivity shopListGuestOnboardingActivity = Activities.ShopListGuestOnboardingActivity.f4532a;
                    if (z2) {
                        myListsFragment.startActivity(shopListGuestOnboardingActivity.b(Activities.ShopListGuestOnboardingActivity.ListFeature.d));
                    } else if (actions instanceof MyListsContract.Actions.ShowSnapAListBottomSheet) {
                        SnapAListBottomSheetFragment.Companion.a(myListsFragment.getChildFragmentManager(), new SnapAListBottomSheetFragment.Extras(SnapAListBottomSheetType.e));
                    } else if (actions instanceof MyListsContract.Actions.LaunchSnapAListGuestOnboardingScreen) {
                        myListsFragment.startActivity(shopListGuestOnboardingActivity.b(Activities.ShopListGuestOnboardingActivity.ListFeature.e));
                    } else {
                        if (!(actions instanceof MyListsContract.Actions.LaunchSnapAListProcessor)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        BuildersKt.c(LifecycleOwnerKt.a(myListsFragment), null, null, new MyListsFragment$launchSnapAListProcessor$1(myListsFragment, ((MyListsContract.Actions.LaunchSnapAListProcessor) actions).f12337a, null), 3);
                    }
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MyListsFragment.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                MyListsFragment myListsFragment = MyListsFragment.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C02531(myListsFragment, null), myListsFragment.Q1().p);
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

    public MyListsFragment() {
        final MyListsFragment$special$$inlined$viewModels$default$1 myListsFragment$special$$inlined$viewModels$default$1 = new MyListsFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.shop.lists.ui.lists.mylists.MyListsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) myListsFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.m = new ViewModelLazy(Reflection.f24268a.b(MyListsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.lists.ui.lists.mylists.MyListsFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.lists.ui.lists.mylists.MyListsFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.h.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.lists.ui.lists.mylists.MyListsFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.b;
            }
        });
        final int i = 1;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: au.com.woolworths.shop.lists.ui.lists.mylists.a
            public final /* synthetic */ MyListsFragment e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                Intent intent;
                ProcessorActivity.Companion.Result result;
                ActivityResult result2 = (ActivityResult) obj;
                switch (i) {
                    case 0:
                        Intrinsics.h(result2, "result");
                        if (result2.d != -1 || (intent = result2.e) == null || (result = (ProcessorActivity.Companion.Result) intent.getParcelableExtra("EXTRA_RESULT")) == null) {
                            return;
                        }
                        MyListsViewModel myListsViewModelQ1 = this.e.Q1();
                        List items = result.d;
                        Intrinsics.h(items, "items");
                        if (items.isEmpty()) {
                            return;
                        }
                        BuildersKt.c(ViewModelKt.a(myListsViewModelQ1), null, null, new MyListsViewModel$onCreateListWithSnapAListItems$1(myListsViewModelQ1, items, null), 3);
                        return;
                    default:
                        Intrinsics.h(result2, "result");
                        MyListsFragment myListsFragment = this.e;
                        AnalyticsManager analyticsManager = myListsFragment.j;
                        if (analyticsManager == null) {
                            Intrinsics.p("analyticsManager");
                            throw null;
                        }
                        View viewRequireView = myListsFragment.requireView();
                        Intrinsics.g(viewRequireView, "requireView(...)");
                        CreateUpdateShoppingListActivityKt.a(result2, analyticsManager, viewRequireView, myListsFragment.I1(), null);
                        return;
                }
            }
        });
        Intrinsics.g(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.n = activityResultLauncherRegisterForActivityResult;
        final int i2 = 0;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: au.com.woolworths.shop.lists.ui.lists.mylists.a
            public final /* synthetic */ MyListsFragment e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                Intent intent;
                ProcessorActivity.Companion.Result result;
                ActivityResult result2 = (ActivityResult) obj;
                switch (i2) {
                    case 0:
                        Intrinsics.h(result2, "result");
                        if (result2.d != -1 || (intent = result2.e) == null || (result = (ProcessorActivity.Companion.Result) intent.getParcelableExtra("EXTRA_RESULT")) == null) {
                            return;
                        }
                        MyListsViewModel myListsViewModelQ1 = this.e.Q1();
                        List items = result.d;
                        Intrinsics.h(items, "items");
                        if (items.isEmpty()) {
                            return;
                        }
                        BuildersKt.c(ViewModelKt.a(myListsViewModelQ1), null, null, new MyListsViewModel$onCreateListWithSnapAListItems$1(myListsViewModelQ1, items, null), 3);
                        return;
                    default:
                        Intrinsics.h(result2, "result");
                        MyListsFragment myListsFragment = this.e;
                        AnalyticsManager analyticsManager = myListsFragment.j;
                        if (analyticsManager == null) {
                            Intrinsics.p("analyticsManager");
                            throw null;
                        }
                        View viewRequireView = myListsFragment.requireView();
                        Intrinsics.g(viewRequireView, "requireView(...)");
                        CreateUpdateShoppingListActivityKt.a(result2, analyticsManager, viewRequireView, myListsFragment.I1(), null);
                        return;
                }
            }
        });
        Intrinsics.g(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.o = activityResultLauncherRegisterForActivityResult2;
    }

    @Override // au.com.woolworths.shop.lists.ui.lists.DeleteListDialogListener
    public final void D(String listId, boolean z) {
        Intrinsics.h(listId, "listId");
        if (!z) {
            AnalyticsManager analyticsManager = this.j;
            if (analyticsManager != null) {
                analyticsManager.c(new SharedListsActions.DeleteListCancelClick(I1()));
                return;
            } else {
                Intrinsics.p("analyticsManager");
                throw null;
            }
        }
        AnalyticsManager analyticsManager2 = this.j;
        if (analyticsManager2 == null) {
            Intrinsics.p("analyticsManager");
            throw null;
        }
        analyticsManager2.c(new SharedListsActions.DeleteListClick(I1()));
        MyListsViewModel myListsViewModelQ1 = Q1();
        BuildersKt.c(ViewModelKt.a(myListsViewModelQ1), null, null, new MyListsViewModel$deleteList$1(myListsViewModelQ1, listId, null), 3);
    }

    public final ListScreen.Lists I1() {
        ListsInMemoryRepository listsInMemoryRepository = this.k;
        if (listsInMemoryRepository != null) {
            return new ListScreen.Lists(listsInMemoryRepository.a());
        }
        Intrinsics.p("listsInMemoryRepository");
        throw null;
    }

    @Override // au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetFragment.ListMenuDialogListener
    public final void O1(ShoppingList list, ListAction action) {
        Intrinsics.h(list, "list");
        Intrinsics.h(action, "action");
        int iOrdinal = action.ordinal();
        if (iOrdinal == 0) {
            int i = CreateUpdateShoppingListActivity.A;
            Context contextRequireContext = requireContext();
            Intrinsics.g(contextRequireContext, "requireContext(...)");
            String shoppingListId = list.getId();
            Intrinsics.h(shoppingListId, "shoppingListId");
            contextRequireContext.startActivity(CreateUpdateShoppingListActivity.Companion.a(Activities.CreateUpdateShoppingList.Mode.f, shoppingListId));
            return;
        }
        if (iOrdinal == 1) {
            MyListsViewModel myListsViewModelQ1 = Q1();
            BuildersKt.c(ViewModelKt.a(myListsViewModelQ1), null, null, new MyListsViewModel$onDuplicateShoppingListClicked$1(myListsViewModelQ1, list, null), 3);
            return;
        }
        if (iOrdinal != 2) {
            Snackbar.j(null, requireView(), "Not implemented", -1).l();
            return;
        }
        AnalyticsManager analyticsManager = this.j;
        if (analyticsManager == null) {
            Intrinsics.p("analyticsManager");
            throw null;
        }
        analyticsManager.c(new SharedListsActions.DeleteListImpression(I1()));
        DeleteConfirmationDialogFragment deleteConfirmationDialogFragmentA = DeleteConfirmationDialogFragment.Companion.a(list);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.g(childFragmentManager, "getChildFragmentManager(...)");
        DialogFragmentExtKt.a(deleteConfirmationDialogFragmentA, childFragmentManager, "delete_confirm");
    }

    public final MyListsViewModel Q1() {
        return (MyListsViewModel) this.m.getD();
    }

    @Override // au.com.woolworths.shop.lists.ui.lists.DeleteListDialogListener
    public final void i(String listId, boolean z) {
        Intrinsics.h(listId, "listId");
    }

    @Override // au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.SnapAListBottomSheetFragment.BottomSheetHost
    public final void l(SnapAListMenuOption menuOption) {
        Intrinsics.h(menuOption, "menuOption");
        MyListsViewModel myListsViewModelQ1 = Q1();
        ShopAccountInteractor shopAccountInteractor = myListsViewModelQ1.h;
        SharedFlowImpl sharedFlowImpl = myListsViewModelQ1.o;
        if (menuOption.equals(WriteMenuOption.c)) {
            sharedFlowImpl.f(MyListsContract.Actions.LaunchCreateShoppingListActivity.f12332a);
            return;
        }
        boolean zEquals = menuOption.equals(CameraMenuOption.c);
        MyListsContract.Actions.LaunchSnapAListGuestOnboardingScreen launchSnapAListGuestOnboardingScreen = MyListsContract.Actions.LaunchSnapAListGuestOnboardingScreen.f12336a;
        if (zEquals) {
            if (shopAccountInteractor.d()) {
                sharedFlowImpl.f(new MyListsContract.Actions.LaunchSnapAListProcessor(ProcessorActivity.Companion.SourceType.d));
                return;
            } else {
                sharedFlowImpl.f(launchSnapAListGuestOnboardingScreen);
                return;
            }
        }
        if (!menuOption.equals(ImageMenuOption.c)) {
            throw new NoWhenBranchMatchedException();
        }
        if (shopAccountInteractor.d()) {
            sharedFlowImpl.f(new MyListsContract.Actions.LaunchSnapAListProcessor(ProcessorActivity.Companion.SourceType.e));
        } else {
            sharedFlowImpl.f(launchSnapAListGuestOnboardingScreen);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass1(null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        MyListsViewModel myListsViewModelQ1 = Q1();
        FragmentActivity activity = getActivity();
        Intent intent = activity != null ? activity.getIntent() : null;
        SharedFlowImpl sharedFlowImpl = myListsViewModelQ1.o;
        WatchlistInteractor watchlistInteractor = myListsViewModelQ1.m;
        if (intent != null && myListsViewModelQ1.n.c(BaseShopAppFeature.v)) {
            String stringExtra = intent.getStringExtra("deep_link_uri");
            if (Intrinsics.c(stringExtra != null ? Boolean.valueOf(ListsUtils.Companion.a(stringExtra, "watchlist")) : null, Boolean.TRUE)) {
                intent.replaceExtras((Bundle) null);
                if (watchlistInteractor.c()) {
                    sharedFlowImpl.f(MyListsContract.Actions.LaunchWatchlistGuestOnboardingScreen.f12338a);
                } else {
                    String strB = watchlistInteractor.b();
                    if (strB != null) {
                        sharedFlowImpl.f(new MyListsContract.Actions.LaunchShoppingListDetails(12, strB, null));
                    }
                }
            }
        }
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f1986a);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.lists.mylists.MyListsFragment$onCreateView$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final MyListsFragment myListsFragment = this.d;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1062564682, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.lists.mylists.MyListsFragment$onCreateView$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                MyListsFragment myListsFragment2 = myListsFragment;
                                MyListsViewModel myListsViewModelQ12 = myListsFragment2.Q1();
                                ListsUtils listsUtils = myListsFragment2.l;
                                if (listsUtils == null) {
                                    Intrinsics.p("listsUtils");
                                    throw null;
                                }
                                composer2.o(5004770);
                                boolean zI = composer2.I(listsUtils);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new MyListsFragment$onCreateView$1$1$1$1$1(1, listsUtils, ListsUtils.class, "filterOutWatchList", "filterOutWatchList$shop_lists_release(Ljava/util/List;)Ljava/util/List;", 0);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                MyListScreenKt.a(myListsViewModelQ12, (Function1) ((KFunction) objG), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1475501714));
        return composeView;
    }
}
