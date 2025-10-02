package au.com.woolworths.feature.shop.catalogue.details;

import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsContract;
import au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsException;
import au.com.woolworths.feature.shop.catalogue.details.analytics.CatalogueDetailsActions;
import au.com.woolworths.feature.shop.catalogue.home.model.CatalogueTracking;
import au.com.woolworths.feature.shop.catalogue.models.CatalogueSaleDetailInfo;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsViewModel$fetchIndividualCatalogue$1", f = "CatalogueDetailsViewModel.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CatalogueDetailsViewModel$fetchIndividualCatalogue$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CatalogueDetailsViewModel q;
    public final /* synthetic */ String r;
    public final /* synthetic */ CatalogueTracking s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogueDetailsViewModel$fetchIndividualCatalogue$1(CatalogueDetailsViewModel catalogueDetailsViewModel, String str, CatalogueTracking catalogueTracking, Continuation continuation) {
        super(2, continuation);
        this.q = catalogueDetailsViewModel;
        this.r = str;
        this.s = catalogueTracking;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CatalogueDetailsViewModel$fetchIndividualCatalogue$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CatalogueDetailsViewModel$fetchIndividualCatalogue$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CatalogueDetailsContract.ViewState viewStateQ6;
        CatalogueDetailsContract.ViewState viewStateQ62;
        CatalogueDetailsViewModel catalogueDetailsViewModel = this.q;
        AnalyticsManager analyticsManager = catalogueDetailsViewModel.f;
        MutableLiveData mutableLiveData = catalogueDetailsViewModel.h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                mutableLiveData.m(CatalogueDetailsViewModel.q6(catalogueDetailsViewModel, CatalogueDetailsContract.PageState.d, null, null, 14));
                CatalogueDetailsInteractor catalogueDetailsInteractor = catalogueDetailsViewModel.e;
                String str = catalogueDetailsViewModel.l;
                if (str == null) {
                    Intrinsics.p("catalogueId");
                    throw null;
                }
                String str2 = this.r;
                this.p = 1;
                obj = catalogueDetailsInteractor.a(str, str2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            CatalogueSaleDetailInfo catalogueSaleDetailInfo = (CatalogueSaleDetailInfo) obj;
            CatalogueTracking catalogueTracking = this.s;
            catalogueDetailsViewModel.m = catalogueTracking != null ? CatalogueTracking.a(catalogueTracking, catalogueSaleDetailInfo.getSaleName()) : null;
            if (catalogueSaleDetailInfo.getCataloguePageItems().isEmpty()) {
                analyticsManager.c(CatalogueDetailsActions.d);
                viewStateQ62 = CatalogueDetailsViewModel.q6(catalogueDetailsViewModel, CatalogueDetailsContract.PageState.f, CatalogueDetailsPageErrorState.f, null, 12);
            } else {
                viewStateQ62 = CatalogueDetailsViewModel.q6(catalogueDetailsViewModel, CatalogueDetailsContract.PageState.e, null, catalogueSaleDetailInfo, 10);
            }
            mutableLiveData.m(viewStateQ62);
        } catch (CatalogueDetailsException e) {
            if (e instanceof CatalogueDetailsException.NoConnectivityException) {
                analyticsManager.c(CatalogueDetailsActions.b);
                viewStateQ6 = CatalogueDetailsViewModel.q6(catalogueDetailsViewModel, CatalogueDetailsContract.PageState.f, CatalogueDetailsPageErrorState.d, null, 12);
            } else {
                if (!(e instanceof CatalogueDetailsException.ServerException)) {
                    throw new NoWhenBranchMatchedException();
                }
                analyticsManager.c(CatalogueDetailsActions.c);
                viewStateQ6 = CatalogueDetailsViewModel.q6(catalogueDetailsViewModel, CatalogueDetailsContract.PageState.f, CatalogueDetailsPageErrorState.e, null, 12);
            }
            mutableLiveData.m(viewStateQ6);
        }
        return Unit.f24250a;
    }
}
