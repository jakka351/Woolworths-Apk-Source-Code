package au.com.woolworths.shop.lists.ui.lists.mylists;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.supers.lists.ListsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.buyagain.domain.BuyAgainEntryPointInteractor;
import au.com.woolworths.shop.lists.data.ShoppingListInteractor;
import au.com.woolworths.shop.lists.data.ShoppingListItemInteractor;
import au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor;
import au.com.woolworths.shop.lists.data.WatchlistInteractor;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import au.com.woolworths.shop.lists.data.model.ShoppingListWithItems;
import au.com.woolworths.shop.lists.data.prefs.ShoppingListsRepository;
import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import au.com.woolworths.shop.lists.ui.lists.ListsListener;
import au.com.woolworths.shop.lists.ui.lists.analytics.ListsActions;
import au.com.woolworths.shop.lists.ui.lists.mylists.MyListsContract;
import com.woolworths.R;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/shop/lists/ui/lists/ListsListener;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MyListsViewModel extends ViewModel implements ListsListener {
    public final ShoppingListSyncInteractor e;
    public final ShoppingListInteractor f;
    public final ShoppingListItemInteractor g;
    public final ShopAccountInteractor h;
    public final BuyAgainEntryPointInteractor i;
    public final AnalyticsManager j;
    public final ListsInMemoryRepository k;
    public final ShoppingListsRepository l;
    public final WatchlistInteractor m;
    public final FeatureToggleManager n;
    public final SharedFlowImpl o;
    public final Flow p;
    public final MutableStateFlow q;
    public final StateFlow r;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "list", "", "Lau/com/woolworths/shop/lists/data/model/ShoppingListWithItems;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.lists.mylists.MyListsViewModel$1", f = "MyListsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.ui.lists.mylists.MyListsViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends ShoppingListWithItems>, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = MyListsViewModel.this.new AnonymousClass1(continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((List) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            List list = (List) this.p;
            MyListsViewModel myListsViewModel = MyListsViewModel.this;
            MyListsViewModel.s6(myListsViewModel, myListsViewModel.q, false, list, null, false, 27);
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "watchedShoppingList", "Lau/com/woolworths/shop/lists/data/model/ShoppingListWithItems;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.lists.mylists.MyListsViewModel$2", f = "MyListsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.ui.lists.mylists.MyListsViewModel$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<ShoppingListWithItems, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = MyListsViewModel.this.new AnonymousClass2(continuation);
            anonymousClass2.p = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((ShoppingListWithItems) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass2.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            ShoppingListWithItems shoppingListWithItems = (ShoppingListWithItems) this.p;
            MyListsViewModel myListsViewModel = MyListsViewModel.this;
            MyListsViewModel.s6(myListsViewModel, myListsViewModel.q, false, null, shoppingListWithItems, false, 23);
            return Unit.f24250a;
        }
    }

    public MyListsViewModel(ShoppingListSyncInteractor shoppingListSyncInteractor, ShoppingListInteractor shoppingListInteractor, ShoppingListItemInteractor shoppingListItemInteractor, ShopAccountInteractor accountInteractor, BuyAgainEntryPointInteractor buyAgainEntryPointInteractor, AnalyticsManager analyticsManager, ListsInMemoryRepository listsInMemoryRepository, ShoppingListsRepository shoppingListsRepository, WatchlistInteractor watchlistInteractor, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(shoppingListSyncInteractor, "shoppingListSyncInteractor");
        Intrinsics.h(shoppingListInteractor, "shoppingListInteractor");
        Intrinsics.h(shoppingListItemInteractor, "shoppingListItemInteractor");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(listsInMemoryRepository, "listsInMemoryRepository");
        Intrinsics.h(shoppingListsRepository, "shoppingListsRepository");
        Intrinsics.h(watchlistInteractor, "watchlistInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = shoppingListSyncInteractor;
        this.f = shoppingListInteractor;
        this.g = shoppingListItemInteractor;
        this.h = accountInteractor;
        this.i = buyAgainEntryPointInteractor;
        this.j = analyticsManager;
        this.k = listsInMemoryRepository;
        this.l = shoppingListsRepository;
        this.m = watchlistInteractor;
        this.n = featureToggleManager;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.o = sharedFlowImplB;
        this.p = FlowKt.a(sharedFlowImplB);
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new MyListsContract.ViewState(false, EmptyList.d, null, false, false, false, false, false, false));
        this.q = mutableStateFlowA;
        this.r = FlowKt.b(mutableStateFlowA);
        s6(this, mutableStateFlowA, false, null, null, !((Boolean) shoppingListsRepository.i.getValue(shoppingListsRepository, ShoppingListsRepository.j[7])).booleanValue(), 15);
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(null), shoppingListInteractor.c), ViewModelKt.a(this));
        if (featureToggleManager.c(BaseShopAppFeature.v)) {
            FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(null), watchlistInteractor.f), ViewModelKt.a(this));
        }
    }

    public static final void p6(MyListsViewModel myListsViewModel) {
        myListsViewModel.o.f(new MyListsContract.Actions.ShowMaxListCountReachedErrorDialog(new ResText(R.string.shop_lists_max_list_count_reached_error_title), new ResWithArgText(R.string.shop_lists_max_list_count_reached, 50)));
    }

    public static void s6(MyListsViewModel myListsViewModel, MutableStateFlow mutableStateFlow, boolean z, List list, ShoppingListWithItems shoppingListWithItems, boolean z2, int i) {
        ((MyListsContract.ViewState) mutableStateFlow.getValue()).getClass();
        if ((i & 2) != 0) {
            z = ((MyListsContract.ViewState) mutableStateFlow.getValue()).f12343a;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            list = ((MyListsContract.ViewState) mutableStateFlow.getValue()).b;
        }
        List list2 = list;
        ShoppingListWithItems shoppingListWithItems2 = (i & 8) != 0 ? ((MyListsContract.ViewState) mutableStateFlow.getValue()).c : shoppingListWithItems;
        boolean z4 = (i & 16) != 0 ? ((MyListsContract.ViewState) mutableStateFlow.getValue()).i : z2;
        boolean zE = myListsViewModel.k.e();
        boolean zD = myListsViewModel.h.d();
        boolean zD2 = myListsViewModel.i.f10252a.d();
        boolean z5 = !zE;
        mutableStateFlow.setValue(new MyListsContract.ViewState(z3, list2, shoppingListWithItems2, zD, zD2, z5, !zE && (zD || zD2), z5, z4));
    }

    @Override // au.com.woolworths.shop.addtolist.edit.ListsAddListener
    public final void H2() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new MyListsViewModel$onCreateShoppingListClicked$1(this, null), 3);
    }

    public final void q6(ShoppingList list) {
        Intrinsics.h(list, "list");
        boolean zC = Intrinsics.c(list.isWatchlist(), Boolean.TRUE);
        AnalyticsManager analyticsManager = this.j;
        ListsInMemoryRepository listsInMemoryRepository = this.k;
        if (zC) {
            analyticsManager.g(ListsAnalytics.Lists.Action.i);
        } else {
            analyticsManager.c(new ListsActions.ShoppingListClick(listsInMemoryRepository.a()));
        }
        if (listsInMemoryRepository.e()) {
            listsInMemoryRepository.h(list.getId());
        }
        this.o.f(new MyListsContract.Actions.LaunchShoppingListDetails(6, list.getId(), Boolean.valueOf(listsInMemoryRepository.e())));
    }

    public final void r6() {
        s6(this, this.q, true, null, null, false, 29);
        BuildersKt.c(ViewModelKt.a(this), null, null, new MyListsViewModel$refreshLists$1(this, null), 3);
    }
}
