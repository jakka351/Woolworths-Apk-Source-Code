package au.com.woolworths.shop.lists.ui.shoppinglist.sort;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.remoteconfig.ShopRemoteConfig;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.lists.ShoppingListsFeature;
import au.com.woolworths.shop.lists.data.ListsDataStoreImpl;
import au.com.woolworths.shop.lists.data.ShoppingListInteractor;
import au.com.woolworths.shop.lists.data.prefs.ShoppingListsRepository;
import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import au.com.woolworths.shop.lists.ui.ListDetailsAnalyticsParams;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewContract;
import au.com.woolworths.shop.lists.ui.utils.ListsUtils;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewModel;", "Landroidx/lifecycle/ViewModel;", "Companion", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SortByViewModel extends ViewModel {
    public static boolean x;
    public final ShoppingListInteractor e;
    public final ListsInMemoryRepository f;
    public final ShoppingListsRepository g;
    public final ShopAccountInteractor h;
    public final AnalyticsManager i;
    public final ListsUtils j;
    public final FeatureToggleManager k;
    public final ListsDataStoreImpl l;
    public final MutableStateFlow m;
    public final SharedFlowImpl n;
    public boolean o;
    public final Lazy p;
    public final StateFlow q;
    public final Flow r;
    public SortByViewListener s;
    public final Lazy t;
    public final Lazy u;
    public final Lazy v;
    public boolean w;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewModel$Companion;", "", "", "CHANGE_MODE_CLICK_ANALYTICS_EVENT_DESC", "Ljava/lang/String;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public SortByViewModel(ShoppingListInteractor shoppingListInteractor, ListsInMemoryRepository listsInMemoryRepository, ShoppingListsRepository shoppingListsRepository, ShopAccountInteractor accountInteractor, AnalyticsManager analyticsManager, ListsUtils listsUtils, FeatureToggleManager featureToggleManager, ListsDataStoreImpl listsDataStoreImpl) {
        Intrinsics.h(shoppingListInteractor, "shoppingListInteractor");
        Intrinsics.h(listsInMemoryRepository, "listsInMemoryRepository");
        Intrinsics.h(shoppingListsRepository, "shoppingListsRepository");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(listsUtils, "listsUtils");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = shoppingListInteractor;
        this.f = listsInMemoryRepository;
        this.g = shoppingListsRepository;
        this.h = accountInteractor;
        this.i = analyticsManager;
        this.j = listsUtils;
        this.k = featureToggleManager;
        this.l = listsDataStoreImpl;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new SortByViewContract.ViewState(listsUtils.d(), 7));
        this.m = mutableStateFlowA;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.n = sharedFlowImplB;
        this.o = true;
        final int i = 0;
        this.p = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.sort.b
            public final /* synthetic */ SortByViewModel e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        SortByViewModel sortByViewModel = this.e;
                        return new ListDetailsAnalyticsParams(sortByViewModel.f.a(), sortByViewModel.o);
                    case 1:
                        FeatureToggleManager featureToggleManager2 = this.e.k;
                        return Boolean.valueOf(featureToggleManager2.c(ShoppingListsFeature.j) && featureToggleManager2.c(ShoppingListsFeature.k));
                    case 2:
                        return Boolean.valueOf(this.e.k.c(ShoppingListsFeature.e));
                    default:
                        return Integer.valueOf(Integer.parseInt(this.e.k.e(ShopRemoteConfig.t, false)));
                }
            }
        });
        this.q = mutableStateFlowA;
        this.r = FlowKt.a(sharedFlowImplB);
        final int i2 = 1;
        this.t = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.sort.b
            public final /* synthetic */ SortByViewModel e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        SortByViewModel sortByViewModel = this.e;
                        return new ListDetailsAnalyticsParams(sortByViewModel.f.a(), sortByViewModel.o);
                    case 1:
                        FeatureToggleManager featureToggleManager2 = this.e.k;
                        return Boolean.valueOf(featureToggleManager2.c(ShoppingListsFeature.j) && featureToggleManager2.c(ShoppingListsFeature.k));
                    case 2:
                        return Boolean.valueOf(this.e.k.c(ShoppingListsFeature.e));
                    default:
                        return Integer.valueOf(Integer.parseInt(this.e.k.e(ShopRemoteConfig.t, false)));
                }
            }
        });
        final int i3 = 2;
        this.u = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.sort.b
            public final /* synthetic */ SortByViewModel e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        SortByViewModel sortByViewModel = this.e;
                        return new ListDetailsAnalyticsParams(sortByViewModel.f.a(), sortByViewModel.o);
                    case 1:
                        FeatureToggleManager featureToggleManager2 = this.e.k;
                        return Boolean.valueOf(featureToggleManager2.c(ShoppingListsFeature.j) && featureToggleManager2.c(ShoppingListsFeature.k));
                    case 2:
                        return Boolean.valueOf(this.e.k.c(ShoppingListsFeature.e));
                    default:
                        return Integer.valueOf(Integer.parseInt(this.e.k.e(ShopRemoteConfig.t, false)));
                }
            }
        });
        final int i4 = 3;
        this.v = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.sort.b
            public final /* synthetic */ SortByViewModel e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        SortByViewModel sortByViewModel = this.e;
                        return new ListDetailsAnalyticsParams(sortByViewModel.f.a(), sortByViewModel.o);
                    case 1:
                        FeatureToggleManager featureToggleManager2 = this.e.k;
                        return Boolean.valueOf(featureToggleManager2.c(ShoppingListsFeature.j) && featureToggleManager2.c(ShoppingListsFeature.k));
                    case 2:
                        return Boolean.valueOf(this.e.k.c(ShoppingListsFeature.e));
                    default:
                        return Integer.valueOf(Integer.parseInt(this.e.k.e(ShopRemoteConfig.t, false)));
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p6(au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewModel r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewModel$checkAndDisplayMagicMatchOnboarding$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewModel$checkAndDisplayMagicMatchOnboarding$1 r0 = (au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewModel$checkAndDisplayMagicMatchOnboarding$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewModel$checkAndDisplayMagicMatchOnboarding$1 r0 = new au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewModel$checkAndDisplayMagicMatchOnboarding$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.ResultKt.b(r6)
            goto L65
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r6)
            boolean r6 = r5.w
            if (r6 == 0) goto L39
            goto L78
        L39:
            r5.w = r4
            kotlinx.coroutines.flow.StateFlow r6 = r5.q
            java.lang.Object r6 = r6.getValue()
            au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewContract$ViewState r6 = (au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewContract.ViewState) r6
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.h(r6, r2)
            int r6 = r6.c
            if (r6 == 0) goto L78
            kotlin.Lazy r6 = r5.u
            java.lang.Object r6 = r6.getD()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L78
            au.com.woolworths.shop.lists.data.ListsDataStoreImpl r6 = r5.l
            r0.r = r4
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L65
            return r1
        L65:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L78
            boolean r6 = au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewModel.x
            if (r6 != 0) goto L78
            kotlinx.coroutines.flow.SharedFlowImpl r5 = r5.n
            au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewContract$Actions$LaunchMagicMatchOnboardingScreen r6 = au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewContract.Actions.LaunchMagicMatchOnboardingScreen.f12436a
            r5.f(r6)
        L78:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewModel.p6(au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewModel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final SortByViewListener q6() {
        SortByViewListener sortByViewListener = this.s;
        if (sortByViewListener != null) {
            return sortByViewListener;
        }
        Intrinsics.p("hostViewListener");
        throw null;
    }
}
