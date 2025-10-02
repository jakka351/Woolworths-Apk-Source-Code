package au.com.woolworths.shop.addtolist.edit;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.addtolist.analytics.CreateUpdateShoppingListActions;
import au.com.woolworths.shop.addtolist.domain.CreateShoppingListInteractor;
import au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListContract;
import au.com.woolworths.shop.lists.data.ShoppingListInteractor;
import au.com.woolworths.shop.lists.data.ShoppingListItemInteractor;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/edit/CreateUpdateShoppingListViewModel;", "Landroidx/lifecycle/ViewModel;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CreateUpdateShoppingListViewModel extends ViewModel {
    public final ShoppingListInteractor e;
    public final ShoppingListItemInteractor f;
    public final CreateShoppingListInteractor g;
    public final AnalyticsManager h;
    public final SharedFlowImpl i;
    public final MutableLiveData j;
    public final MutableLiveData k;
    public final Flow l;
    public final CreateUpdateShoppingListActions m;
    public Map n;

    public CreateUpdateShoppingListViewModel(ShoppingListInteractor listInteractor, ShoppingListItemInteractor listItemInteractor, CreateShoppingListInteractor createShoppingListInteractor, AnalyticsManager analyticsManager, ListsInMemoryRepository listsInMemoryRepository) {
        Intrinsics.h(listInteractor, "listInteractor");
        Intrinsics.h(listItemInteractor, "listItemInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(listsInMemoryRepository, "listsInMemoryRepository");
        this.e = listInteractor;
        this.f = listItemInteractor;
        this.g = createShoppingListInteractor;
        this.h = analyticsManager;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.i = sharedFlowImplB;
        MutableLiveData mutableLiveData = new MutableLiveData(new CreateUpdateShoppingListContract.ViewState(CreateUpdateShoppingListContract.ActivityMode.d, new ShoppingList(null, "", 0, 0L, null, null, 53, null), false, false));
        this.j = mutableLiveData;
        this.k = mutableLiveData;
        this.l = FlowKt.a(sharedFlowImplB);
        this.m = new CreateUpdateShoppingListActions(listsInMemoryRepository);
    }

    public static void s6(MutableLiveData mutableLiveData, CreateUpdateShoppingListContract.ActivityMode activityMode, ShoppingList shoppingList, boolean z) {
        mutableLiveData.m(new CreateUpdateShoppingListContract.ViewState(activityMode, shoppingList, z, !StringsKt.D(shoppingList.getTitle()) && shoppingList.getTitle().length() <= 40));
    }

    public static void t6(CreateUpdateShoppingListViewModel createUpdateShoppingListViewModel, MutableLiveData mutableLiveData, CreateUpdateShoppingListContract.ActivityMode activityMode, ShoppingList shoppingList, boolean z, int i) {
        if ((i & 1) != 0) {
            activityMode = createUpdateShoppingListViewModel.p6();
        }
        if ((i & 2) != 0) {
            shoppingList = createUpdateShoppingListViewModel.q6();
        }
        if ((i & 4) != 0) {
            CreateUpdateShoppingListContract.ViewState viewState = (CreateUpdateShoppingListContract.ViewState) mutableLiveData.e();
            z = viewState != null ? viewState.c : false;
        }
        createUpdateShoppingListViewModel.getClass();
        s6(mutableLiveData, activityMode, shoppingList, z);
    }

    public final CreateUpdateShoppingListContract.ActivityMode p6() {
        Object objE = this.j.e();
        Intrinsics.e(objE);
        return ((CreateUpdateShoppingListContract.ViewState) objE).f10124a;
    }

    public final ShoppingList q6() {
        Object objE = this.j.e();
        Intrinsics.e(objE);
        return ((CreateUpdateShoppingListContract.ViewState) objE).b;
    }

    public final void r6() {
        CreateUpdateShoppingListContract.ViewState viewState = (CreateUpdateShoppingListContract.ViewState) this.k.e();
        if (viewState == null || !viewState.d) {
            return;
        }
        BuildersKt.c(ViewModelKt.a(this), null, null, new CreateUpdateShoppingListViewModel$onSaveButtonClicked$1(this, null), 3);
    }
}
