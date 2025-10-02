package au.com.woolworths.shop.lists.ui.details.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.collectionmode.RepositoryManager;
import au.com.woolworths.shop.cart.ui.c;
import au.com.woolworths.shop.lists.data.ShoppingListInteractor;
import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import au.com.woolworths.shop.lists.ui.details.analytics.ListDetailsActions;
import au.com.woolworths.shop.lists.ui.details.interactor.ListDetailsInteractor;
import au.com.woolworths.shop.lists.ui.details.models.ListDetails;
import au.com.woolworths.shop.lists.ui.details.ui.ListDetailsContract;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ProductItemState;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListDetailsUiModel;
import au.com.woolworths.shop.lists.ui.utils.ListsUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/ui/details/ui/ListDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Companion", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ListDetailsViewModel extends ViewModel {
    public final ListDetailsInteractor e;
    public final ShoppingListInteractor f;
    public final AnalyticsManager g;
    public final ListsInMemoryRepository h;
    public final ListsUtils i;
    public final CollectionModeInteractor j;
    public final RepositoryManager k;
    public final ProductItemState l;
    public final MutableLiveData m;
    public final MutableLiveData n;
    public final MutableStateFlow o;
    public final Flow p;
    public final SharedFlowImpl q;
    public final Flow r;
    public boolean s;
    public Job t;
    public final Lazy u;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/lists/ui/details/ui/ListDetailsViewModel$Companion;", "", "", "TOTALS_ERROR_MESSAGE", "Ljava/lang/String;", "", "UPDATE_LIST_DETAILS_JOB_DELAY_MS", "J", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ListDetailsContract.BottomSheetViewState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ListDetailsContract.BottomSheetViewState bottomSheetViewState = ListDetailsContract.BottomSheetViewState.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ListDetailsViewModel(ListDetailsInteractor listDetailsInteractor, ShoppingListInteractor shoppingListInteractor, AnalyticsManager analyticsManager, ListsInMemoryRepository listsInMemoryRepository, ListsUtils listsUtils, CollectionModeInteractor collectionModeInteractor, RepositoryManager repositoryManager, ProductItemState productItemState) {
        Intrinsics.h(listDetailsInteractor, "listDetailsInteractor");
        Intrinsics.h(shoppingListInteractor, "shoppingListInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(listsInMemoryRepository, "listsInMemoryRepository");
        Intrinsics.h(listsUtils, "listsUtils");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(repositoryManager, "repositoryManager");
        Intrinsics.h(productItemState, "productItemState");
        this.e = listDetailsInteractor;
        this.f = shoppingListInteractor;
        this.g = analyticsManager;
        this.h = listsInMemoryRepository;
        this.i = listsUtils;
        this.j = collectionModeInteractor;
        this.k = repositoryManager;
        this.l = productItemState;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.m = mutableLiveData;
        this.n = mutableLiveData;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(ListDetailsContract.BottomSheetViewState.f);
        this.o = mutableStateFlowA;
        this.p = mutableStateFlowA;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.q = sharedFlowImplB;
        this.r = FlowKt.a(sharedFlowImplB);
        this.u = LazyKt.b(new c(this, 15));
        s6(this, mutableLiveData, null, false, false, BitmapDescriptorFactory.HUE_RED, 14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p6(au.com.woolworths.shop.lists.ui.details.ui.ListDetailsViewModel r20, au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListDetailsUiModel r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.details.ui.ListDetailsViewModel.p6(au.com.woolworths.shop.lists.ui.details.ui.ListDetailsViewModel, au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListDetailsUiModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static void s6(ListDetailsViewModel listDetailsViewModel, MutableLiveData mutableLiveData, ListDetails listDetails, boolean z, boolean z2, float f, int i) {
        if ((i & 1) != 0) {
            ListDetailsContract.ViewState viewState = (ListDetailsContract.ViewState) mutableLiveData.e();
            listDetails = viewState != null ? viewState.f12317a : null;
        }
        ListDetails listDetails2 = listDetails;
        boolean z3 = false;
        if ((i & 2) != 0) {
            ListDetailsContract.ViewState viewState2 = (ListDetailsContract.ViewState) mutableLiveData.e();
            z = viewState2 != null ? viewState2.d : false;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            ListDetailsContract.ViewState viewState3 = (ListDetailsContract.ViewState) mutableLiveData.e();
            z2 = viewState3 != null ? viewState3.c : false;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            ListDetailsContract.ViewState viewState4 = (ListDetailsContract.ViewState) mutableLiveData.e();
            f = viewState4 != null ? viewState4.e : BitmapDescriptorFactory.HUE_RED;
        }
        float f2 = f;
        if (!z5) {
            if (listDetailsViewModel.i.a()) {
                if ((listDetails2 != null ? listDetails2.f12306a : null) != null) {
                }
            }
            mutableLiveData.m(new ListDetailsContract.ViewState(listDetails2, z3, z5, z4, f2));
        }
        listDetailsViewModel.getClass();
        z3 = true;
        mutableLiveData.m(new ListDetailsContract.ViewState(listDetails2, z3, z5, z4, f2));
    }

    public final String q6() {
        if (this.i.a() && this.j.b()) {
            return this.k.f();
        }
        return null;
    }

    public final void r6(ListDetailsActions listDetailsActions) {
        this.q.f(new ListDetailsContract.Actions.ShowSnackbar(new ResText(R.string.shop_lists_total_error_message)));
        this.g.j(listDetailsActions, TrackingMetadata.Companion.a(TrackableValue.o0, "Unable to show estimated totals of your list."));
    }

    public final void t6(ShoppingListDetailsUiModel listDetailsUiModel) {
        Intrinsics.h(listDetailsUiModel, "listDetailsUiModel");
        Job job = this.t;
        if (job != null) {
            ((JobSupport) job).cancel((CancellationException) null);
        }
        this.t = BuildersKt.c(ViewModelKt.a(this), null, null, new ListDetailsViewModel$updateListDetails$1(this, listDetailsUiModel, null), 3);
    }
}
