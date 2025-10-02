package au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.paging.PagedList;
import androidx.paging.SnapshotPagedList;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorCode;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.l;
import au.com.woolworths.feature.shop.recipes.recipes.RecipesInteractor;
import au.com.woolworths.feature.shop.recipes.recipes.analytics.RecipesScreens;
import au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListClickHandler;
import au.com.woolworths.pagingutils.NetworkState;
import au.com.woolworths.pagingutils.NumericPageListing;
import au.com.woolworths.pagingutils.PageListingKt;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/homepage/savedrecipes/SavedRecipesViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/feature/shop/recipes/recipes/list/RecipeListClickHandler;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SavedRecipesViewModel extends ViewModel implements RecipeListClickHandler {
    public final RecipesInteractor e;
    public final AnalyticsManager f;
    public final ShopAccountInteractor g;
    public final MediatorLiveData h;
    public final MediatorLiveData i;
    public final SharedFlowImpl j;
    public final Flow k;
    public final MutableLiveData l;
    public final MediatorLiveData m;
    public final MediatorLiveData n;
    public final MediatorLiveData o;

    public SavedRecipesViewModel(RecipesInteractor recipesInteractor, AnalyticsManager analyticsManager, ShopAccountInteractor accountInteractor) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(accountInteractor, "accountInteractor");
        this.e = recipesInteractor;
        this.f = analyticsManager;
        this.g = accountInteractor;
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        this.h = mediatorLiveData;
        this.i = mediatorLiveData;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.j = sharedFlowImplB;
        this.k = FlowKt.a(sharedFlowImplB);
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.l = mutableLiveData;
        MediatorLiveData mediatorLiveDataB = Transformations.b(mutableLiveData, new a(this, 2));
        this.m = mediatorLiveDataB;
        MediatorLiveData mediatorLiveDataC = Transformations.c(mediatorLiveDataB, new l(24));
        this.n = mediatorLiveDataC;
        Transformations.c(mediatorLiveDataB, new l(25));
        this.o = Transformations.c(mediatorLiveDataB, new l(26));
        final int i = 0;
        mediatorLiveData.n(Transformations.c(mediatorLiveDataB, new a(this, 3)), new SavedRecipesViewModel$sam$androidx_lifecycle_Observer$0(new Function1(this) { // from class: au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.b
            public final /* synthetic */ SavedRecipesViewModel e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        PagedList snapshotPagedList = (PagedList) obj;
                        SavedRecipesViewModel savedRecipesViewModel = this.e;
                        NetworkState networkState = (NetworkState) savedRecipesViewModel.n.e();
                        if (networkState != null) {
                            if (!snapshotPagedList.getO()) {
                                snapshotPagedList = new SnapshotPagedList(snapshotPagedList);
                            }
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : snapshotPagedList) {
                                if (obj2 instanceof RecipeCardSummaryData) {
                                    arrayList.add(obj2);
                                }
                            }
                            SavedRecipesViewModel.r6(savedRecipesViewModel, mediatorLiveData, savedRecipesViewModel.q6(networkState), false, arrayList, 2);
                        }
                        break;
                    default:
                        NetworkState networkState2 = (NetworkState) obj;
                        boolean zC = Intrinsics.c(networkState2, NetworkState.e);
                        Intrinsics.e(networkState2);
                        SavedRecipesViewModel savedRecipesViewModel2 = this.e;
                        SavedRecipesViewModel.r6(savedRecipesViewModel2, mediatorLiveData, savedRecipesViewModel2.q6(networkState2), zC, null, 4);
                        break;
                }
                return Unit.f24250a;
            }
        }));
        final int i2 = 1;
        mediatorLiveData.n(mediatorLiveDataC, new SavedRecipesViewModel$sam$androidx_lifecycle_Observer$0(new Function1(this) { // from class: au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.b
            public final /* synthetic */ SavedRecipesViewModel e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        PagedList snapshotPagedList = (PagedList) obj;
                        SavedRecipesViewModel savedRecipesViewModel = this.e;
                        NetworkState networkState = (NetworkState) savedRecipesViewModel.n.e();
                        if (networkState != null) {
                            if (!snapshotPagedList.getO()) {
                                snapshotPagedList = new SnapshotPagedList(snapshotPagedList);
                            }
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : snapshotPagedList) {
                                if (obj2 instanceof RecipeCardSummaryData) {
                                    arrayList.add(obj2);
                                }
                            }
                            SavedRecipesViewModel.r6(savedRecipesViewModel, mediatorLiveData, savedRecipesViewModel.q6(networkState), false, arrayList, 2);
                        }
                        break;
                    default:
                        NetworkState networkState2 = (NetworkState) obj;
                        boolean zC = Intrinsics.c(networkState2, NetworkState.e);
                        Intrinsics.e(networkState2);
                        SavedRecipesViewModel savedRecipesViewModel2 = this.e;
                        SavedRecipesViewModel.r6(savedRecipesViewModel2, mediatorLiveData, savedRecipesViewModel2.q6(networkState2), zC, null, 4);
                        break;
                }
                return Unit.f24250a;
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void r6(au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesViewModel r1, androidx.lifecycle.MediatorLiveData r2, au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesFullPageErrorState r3, boolean r4, java.util.ArrayList r5, int r6) {
        /*
            r0 = r6 & 2
            if (r0 == 0) goto L5
            r4 = 0
        L5:
            r6 = r6 & 4
            if (r6 == 0) goto L1d
            androidx.lifecycle.MediatorLiveData r1 = r1.h
            java.lang.Object r1 = r1.e()
            au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesContract$ViewState r1 = (au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesContract.ViewState) r1
            if (r1 == 0) goto L1a
            java.util.List r1 = r1.c
            if (r1 != 0) goto L18
            goto L1a
        L18:
            r5 = r1
            goto L1d
        L1a:
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.d
            goto L18
        L1d:
            au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesContract$ViewState r1 = new au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesContract$ViewState
            r1.<init>(r4, r3, r5)
            r2.m(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesViewModel.r6(au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesViewModel, androidx.lifecycle.MediatorLiveData, au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesFullPageErrorState, boolean, java.util.ArrayList, int):void");
    }

    @Override // au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListClickHandler
    public final void N() {
        r6(this, this.h, null, false, null, 6);
        NumericPageListing numericPageListing = (NumericPageListing) this.m.e();
        if (numericPageListing != null) {
            PageListingKt.a(numericPageListing);
        }
    }

    public final void p6() {
        if (this.g.d()) {
            this.l.m(Unit.f24250a);
            return;
        }
        r6(this, this.h, SavedRecipesFullPageErrorState.h, false, null, 6);
        this.f.e(RecipesScreens.g, TrackingMetadata.Companion.a(TrackableValue.l2, "Saved recipes"));
    }

    public final SavedRecipesFullPageErrorState q6(NetworkState networkState) {
        NumericPageListing numericPageListing;
        Integer num;
        boolean zC = Intrinsics.c(networkState, NetworkState.d);
        AnalyticsManager analyticsManager = this.f;
        if (zC && (numericPageListing = (NumericPageListing) this.m.e()) != null && (num = (Integer) numericPageListing.e.e()) != null && num.intValue() == 0) {
            analyticsManager.c(SavedRecipesActions.g);
            return SavedRecipesFullPageErrorState.g;
        }
        Throwable th = networkState.c;
        if (th instanceof NoConnectivityException) {
            analyticsManager.c(SavedRecipesActions.i);
            return SavedRecipesFullPageErrorState.d;
        }
        if (th instanceof ServerErrorException) {
            if (ExceptionExtKt.d(((ServerErrorException) th).d, ServerErrorCode.g) != null) {
                analyticsManager.c(SavedRecipesActions.g);
                return SavedRecipesFullPageErrorState.g;
            }
            analyticsManager.c(SavedRecipesActions.h);
            return SavedRecipesFullPageErrorState.e;
        }
        if (th == null) {
            return null;
        }
        throw new IllegalStateException("Unexpected exception caught: " + th, th);
    }
}
