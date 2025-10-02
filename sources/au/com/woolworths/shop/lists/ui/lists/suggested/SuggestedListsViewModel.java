package au.com.woolworths.shop.lists.ui.lists.suggested;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.PagedList;
import androidx.paging.PagingData;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.pagingutils.NetworkState;
import au.com.woolworths.pagingutils.NumericPageListing;
import au.com.woolworths.pagingutils.PageListingKt;
import au.com.woolworths.pagingutils.Status;
import au.com.woolworths.shop.lists.data.SuggestedListsInteractor;
import au.com.woolworths.shop.lists.data.model.SuggestedListItem;
import au.com.woolworths.shop.lists.ui.lists.analytics.SuggestedListsActions;
import au.com.woolworths.shop.lists.ui.lists.errors.SuggestedListsFullPageError;
import au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsContract;
import au.com.woolworths.shop.lists.ui.utils.ListsUtils;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.AbstractList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/suggested/SuggestedListsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/shop/lists/ui/lists/suggested/SuggestedListsClickListener;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Companion", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SuggestedListsViewModel extends ViewModel implements SuggestedListsClickListener, FullPageErrorStateClickHandler {
    public final SuggestedListsInteractor e;
    public final AnalyticsManager f;
    public final ListsUtils g;
    public final FeatureToggleManager h;
    public final SharedFlowImpl i;
    public final Flow j;
    public final MutableStateFlow k;
    public final MediatorLiveData l;
    public final MediatorLiveData m;
    public final MutableLiveData n;
    public final MediatorLiveData o;
    public final MediatorLiveData p;
    public int q;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsViewModel$3", f = "SuggestedListsViewModel.kt", l = {85}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsViewModel$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return SuggestedListsViewModel.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                final SuggestedListsViewModel suggestedListsViewModel = SuggestedListsViewModel.this;
                Flow flowA = FlowLiveDataConversions.a(suggestedListsViewModel.o);
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsViewModel.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        PagedList pagedList = (PagedList) obj2;
                        if (!pagedList.isEmpty()) {
                            suggestedListsViewModel.p6(pagedList);
                        }
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (flowA.collect(flowCollector, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/suggested/SuggestedListsViewModel$Companion;", "", "", "INVALID_LIST_ID", "I", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12351a;

        static {
            int[] iArr = new int[SuggestedListsFullPageError.values().length];
            try {
                SuggestedListsFullPageError suggestedListsFullPageError = SuggestedListsFullPageError.d;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SuggestedListsFullPageError suggestedListsFullPageError2 = SuggestedListsFullPageError.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12351a = iArr;
        }
    }

    public SuggestedListsViewModel(SuggestedListsInteractor suggestedListsInteractor, AnalyticsManager analyticsManager, ListsUtils listsUtils, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(listsUtils, "listsUtils");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = suggestedListsInteractor;
        this.f = analyticsManager;
        this.g = listsUtils;
        this.h = featureToggleManager;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.i = sharedFlowImplB;
        this.j = FlowKt.a(sharedFlowImplB);
        this.k = StateFlowKt.a(PagingData.Companion.a());
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        this.l = mediatorLiveData;
        this.m = mediatorLiveData;
        MutableLiveData mutableLiveData = suggestedListsInteractor.d;
        this.n = mutableLiveData;
        MediatorLiveData mediatorLiveDataC = Transformations.c(mutableLiveData, new au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector.a(21));
        this.o = mediatorLiveDataC;
        MediatorLiveData mediatorLiveDataC2 = Transformations.c(mutableLiveData, new au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector.a(22));
        this.p = Transformations.c(mutableLiveData, new au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector.a(23));
        this.q = -1;
        final int i = 0;
        mediatorLiveData.n(mediatorLiveDataC2, new SuggestedListsViewModel$sam$androidx_lifecycle_Observer$0(new Function1(this) { // from class: au.com.woolworths.shop.lists.ui.lists.suggested.c
            public final /* synthetic */ SuggestedListsViewModel e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                switch (i) {
                    case 0:
                        SuggestedListsViewModel suggestedListsViewModel = this.e;
                        suggestedListsViewModel.s6();
                        MediatorLiveData mediatorLiveData2 = suggestedListsViewModel.l;
                        NetworkState networkState = (NetworkState) suggestedListsViewModel.p.e();
                        SuggestedListsViewModel.r6(suggestedListsViewModel, mediatorLiveData2, (networkState != null ? networkState.f9174a : null) == Status.d, null, 2);
                        break;
                    default:
                        this.e.s6();
                        break;
                }
                return Unit.f24250a;
            }
        }));
        final int i2 = 1;
        mediatorLiveData.n(mediatorLiveDataC, new SuggestedListsViewModel$sam$androidx_lifecycle_Observer$0(new Function1(this) { // from class: au.com.woolworths.shop.lists.ui.lists.suggested.c
            public final /* synthetic */ SuggestedListsViewModel e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                switch (i2) {
                    case 0:
                        SuggestedListsViewModel suggestedListsViewModel = this.e;
                        suggestedListsViewModel.s6();
                        MediatorLiveData mediatorLiveData2 = suggestedListsViewModel.l;
                        NetworkState networkState = (NetworkState) suggestedListsViewModel.p.e();
                        SuggestedListsViewModel.r6(suggestedListsViewModel, mediatorLiveData2, (networkState != null ? networkState.f9174a : null) == Status.d, null, 2);
                        break;
                    default:
                        this.e.s6();
                        break;
                }
                return Unit.f24250a;
            }
        }));
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass3(null), 3);
    }

    public static void r6(SuggestedListsViewModel suggestedListsViewModel, MediatorLiveData mediatorLiveData, boolean z, SuggestedListsFullPageError suggestedListsFullPageError, int i) {
        if ((i & 1) != 0) {
            SuggestedListsContract.ViewState viewState = (SuggestedListsContract.ViewState) mediatorLiveData.e();
            z = viewState != null ? viewState.f12350a : false;
        }
        if ((i & 2) != 0) {
            SuggestedListsContract.ViewState viewState2 = (SuggestedListsContract.ViewState) mediatorLiveData.e();
            suggestedListsFullPageError = viewState2 != null ? viewState2.b : null;
        }
        suggestedListsViewModel.getClass();
        mediatorLiveData.m(new SuggestedListsContract.ViewState(z, suggestedListsFullPageError));
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        SuggestedListsContract.ViewState viewState = (SuggestedListsContract.ViewState) this.l.e();
        SuggestedListsFullPageError suggestedListsFullPageError = viewState != null ? viewState.b : null;
        int i = suggestedListsFullPageError == null ? -1 : WhenMappings.f12351a[suggestedListsFullPageError.ordinal()];
        MutableLiveData mutableLiveData = this.n;
        AnalyticsManager analyticsManager = this.f;
        if (i == 1) {
            analyticsManager.c(SuggestedListsActions.g);
            NumericPageListing numericPageListing = (NumericPageListing) mutableLiveData.e();
            if (numericPageListing != null) {
                PageListingKt.a(numericPageListing);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        analyticsManager.c(SuggestedListsActions.i);
        NumericPageListing numericPageListing2 = (NumericPageListing) mutableLiveData.e();
        if (numericPageListing2 != null) {
            PageListingKt.a(numericPageListing2);
        }
    }

    public final void p6(AbstractList items) {
        Object next;
        Intrinsics.h(items, "items");
        if (this.q == -1 || items.isEmpty()) {
            return;
        }
        Iterator it = items.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((SuggestedListItem) next).getId() == this.q) {
                    break;
                }
            }
        }
        SuggestedListItem suggestedListItem = (SuggestedListItem) next;
        if (suggestedListItem != null) {
            this.i.f(new SuggestedListsContract.Actions.LaunchSuggestedList(suggestedListItem));
        }
        this.q = -1;
    }

    public final void q6(SuggestedListItem suggestedListItem) {
        Intrinsics.h(suggestedListItem, "suggestedListItem");
        this.i.f(new SuggestedListsContract.Actions.LaunchSuggestedList(suggestedListItem));
        this.f.j(SuggestedListsActions.h, TrackingMetadata.Companion.a(TrackableValue.q0, suggestedListItem.getName()));
    }

    public final void s6() throws Throwable {
        MediatorLiveData mediatorLiveData = this.p;
        boolean zC = Intrinsics.c(mediatorLiveData.e(), NetworkState.d);
        MediatorLiveData mediatorLiveData2 = this.l;
        if (zC) {
            r6(this, mediatorLiveData2, false, null, 1);
            return;
        }
        NetworkState networkState = (NetworkState) mediatorLiveData.e();
        Throwable th = networkState != null ? networkState.c : null;
        boolean z = th instanceof NoConnectivityException;
        AnalyticsManager analyticsManager = this.f;
        if (z) {
            analyticsManager.c(SuggestedListsActions.e);
            r6(this, mediatorLiveData2, false, SuggestedListsFullPageError.e, 1);
        } else if (th instanceof ServerErrorException) {
            analyticsManager.c(SuggestedListsActions.f);
            r6(this, mediatorLiveData2, false, SuggestedListsFullPageError.d, 1);
        } else {
            if (th != null) {
                throw th;
            }
            r6(this, mediatorLiveData2, false, null, 1);
        }
    }
}
