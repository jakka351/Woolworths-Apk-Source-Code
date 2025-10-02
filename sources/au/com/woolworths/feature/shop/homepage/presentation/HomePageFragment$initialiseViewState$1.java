package au.com.woolworths.feature.shop.homepage.presentation;

import android.content.Context;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.contentpage.ContentPageViewModel;
import au.com.woolworths.feature.shop.contentpage.data.ContentPageData;
import au.com.woolworths.feature.shop.contentpage.data.ContentPageHeaderData;
import au.com.woolworths.feature.shop.homepage.HomeFeature;
import au.com.woolworths.feature.shop.homepage.data.HomeListData;
import au.com.woolworths.feature.shop.homepage.databinding.FragmentHomePageBinding;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageContract;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment$initialiseViewState$1", f = "HomePageFragment.kt", l = {285}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class HomePageFragment$initialiseViewState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ HomePageFragment q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomePageFragment$initialiseViewState$1(HomePageFragment homePageFragment, Continuation continuation) {
        super(2, continuation);
        this.q = homePageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomePageFragment$initialiseViewState$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((HomePageFragment$initialiseViewState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw android.support.v4.media.session.a.v(obj);
        }
        ResultKt.b(obj);
        final HomePageFragment homePageFragment = this.q;
        StateFlow stateFlow = homePageFragment.h2().I;
        FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment$initialiseViewState$1.1
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj2, Continuation continuation) {
                HomePageContract.ViewState viewState = (HomePageContract.ViewState) obj2;
                HomePageFragment homePageFragment2 = homePageFragment;
                ContentPageViewModel contentPageViewModelR1 = homePageFragment2.R1();
                boolean z = viewState.k;
                HomeListData homeListData = viewState.b;
                ContentPageViewModel.K6(contentPageViewModelR1, contentPageViewModelR1.p, null, null, z, false, null, null, null, null, null, null, false, false, 16367);
                if (!viewState.m) {
                    HomePageRefreshErrorState homePageRefreshErrorState = viewState.d;
                    if (homePageRefreshErrorState != null) {
                        ResText message = homePageRefreshErrorState.getMessage();
                        Context contextRequireContext = homePageFragment2.requireContext();
                        Intrinsics.g(contextRequireContext, "requireContext(...)");
                        String it = message.getText(contextRequireContext).toString();
                        FragmentHomePageBinding fragmentHomePageBinding = homePageFragment2.k;
                        if (fragmentHomePageBinding == null) {
                            Intrinsics.p("fragmentBinding");
                            throw null;
                        }
                        Snackbar snackbarJ = Snackbar.j(null, fragmentHomePageBinding.E, it, 0);
                        Intrinsics.h(it, "it");
                        snackbarJ.l();
                    }
                } else if (!homePageFragment2.b2().c(HomeFeature.e)) {
                    HomeController homeController = homePageFragment2.l;
                    if (homeController == null) {
                        Intrinsics.p("homeController");
                        throw null;
                    }
                    homeController.setData(homeListData);
                } else if (homeListData != null) {
                    List list = homeListData.c;
                    ContentPageViewModel contentPageViewModelR12 = homePageFragment2.R1();
                    List list2 = homeListData.f7192a;
                    ArrayList arrayList = new ArrayList();
                    for (T t : list2) {
                        if (t instanceof AnalyticsData) {
                            arrayList.add(t);
                        }
                    }
                    ContentPageData contentPageData = new ContentPageData((ContentPageHeaderData) null, (AnalyticsData) CollectionsKt.J(0, arrayList), homeListData.f, CollectionsKt.B(list), (Integer) null, 48);
                    CollectionModeInteractor collectionModeInteractor = homePageFragment2.o;
                    if (collectionModeInteractor == null) {
                        Intrinsics.p("collectionModeInteractor");
                        throw null;
                    }
                    CollectionMode collectionModeW = collectionModeInteractor.w();
                    Activities.ContentPage.ContentPageExtras contentPageExtras = new Activities.ContentPage.ContentPageExtras(Activities.ContentPage.ContentPageType.k, "", null);
                    contentPageViewModelR12.t = contentPageExtras;
                    contentPageViewModelR12.L6(contentPageData, collectionModeW, contentPageExtras);
                }
                HomePageContract.Snackbar snackbar = viewState.i;
                if (snackbar != null) {
                    ResText resText = snackbar.f7238a;
                    Text text = snackbar.b;
                    Function0 function0 = snackbar.c;
                    Function1 function1 = snackbar.d;
                    Context contextRequireContext2 = homePageFragment2.requireContext();
                    Intrinsics.g(contextRequireContext2, "requireContext(...)");
                    String string = resText.getText(contextRequireContext2).toString();
                    FragmentHomePageBinding fragmentHomePageBinding2 = homePageFragment2.k;
                    if (fragmentHomePageBinding2 == null) {
                        Intrinsics.p("fragmentBinding");
                        throw null;
                    }
                    Snackbar snackbarJ2 = Snackbar.j(null, fragmentHomePageBinding2.E, string, 0);
                    if (text != null) {
                        Context contextRequireContext3 = homePageFragment2.requireContext();
                        Intrinsics.g(contextRequireContext3, "requireContext(...)");
                        snackbarJ2.k(text.getText(contextRequireContext3), new f(0, function0));
                    }
                    function1.invoke(string);
                    snackbarJ2.l();
                    HomeController homeController2 = homePageFragment2.l;
                    if (homeController2 == null) {
                        Intrinsics.p("homeController");
                        throw null;
                    }
                    homeController2.setData(homeListData);
                }
                return Unit.f24250a;
            }
        };
        this.p = 1;
        stateFlow.collect(flowCollector, this);
        return coroutineSingletons;
    }
}
