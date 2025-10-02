package au.com.woolworths.feature.shop.recipes.freshmag.content.domain;

import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentException;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentContract;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentErrorState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentViewModel$fetchMagazine$1", f = "FreshMagContentViewModel.kt", l = {84}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class FreshMagContentViewModel$fetchMagazine$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ FreshMagContentViewModel q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreshMagContentViewModel$fetchMagazine$1(FreshMagContentViewModel freshMagContentViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.q = freshMagContentViewModel;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FreshMagContentViewModel$fetchMagazine$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FreshMagContentViewModel$fetchMagazine$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FreshMagContentAction freshMagContentAction;
        FreshMagContentErrorState freshMagContentErrorState;
        FreshMagContentViewModel freshMagContentViewModel = this.q;
        AnalyticsManager analyticsManager = freshMagContentViewModel.f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        String str = this.r;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                MagazineInteractor magazineInteractor = freshMagContentViewModel.e;
                this.p = 1;
                obj = magazineInteractor.a(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            FreshMagContentAction freshMagContentAction2 = FreshMagContentAction.j;
            TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.I0, str);
            trackingMetadataA.b(TrackableValue.C1, 1);
            analyticsManager.j(freshMagContentAction2, trackingMetadataA);
            MutableLiveData mutableLiveData = freshMagContentViewModel.j;
            FreshMagContentContract.PageState pageState = FreshMagContentContract.PageState.e;
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(FreshMagContentViewModel.p6(freshMagContentViewModel, (MagazinePage) it.next()));
            }
            FreshMagContentContract.FreshMagContent freshMagContent = new FreshMagContentContract.FreshMagContent(arrayList, 0);
            FreshMagContentContract.ViewState viewState = (FreshMagContentContract.ViewState) mutableLiveData.e();
            mutableLiveData.m(new FreshMagContentContract.ViewState(pageState, null, freshMagContent, viewState != null ? viewState.d : null));
        } catch (FreshMagContentException e) {
            if (e instanceof FreshMagContentException.NoConnectivityException) {
                freshMagContentAction = FreshMagContentAction.f;
            } else if (e instanceof FreshMagContentException.NotFoundException) {
                freshMagContentAction = FreshMagContentAction.e;
            } else {
                if (!(e instanceof FreshMagContentException.ServerException)) {
                    throw new NoWhenBranchMatchedException();
                }
                freshMagContentAction = FreshMagContentAction.g;
            }
            analyticsManager.c(freshMagContentAction);
            MutableLiveData mutableLiveData2 = freshMagContentViewModel.j;
            FreshMagContentContract.PageState pageState2 = FreshMagContentContract.PageState.f;
            if (e.equals(FreshMagContentException.NoConnectivityException.d)) {
                freshMagContentErrorState = FreshMagContentErrorState.d;
            } else if (e.equals(FreshMagContentException.NotFoundException.d)) {
                freshMagContentErrorState = FreshMagContentErrorState.f;
            } else {
                if (!e.equals(FreshMagContentException.ServerException.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                freshMagContentErrorState = FreshMagContentErrorState.e;
            }
            mutableLiveData2.m(new FreshMagContentContract.ViewState(pageState2, freshMagContentErrorState, null, null));
        }
        return Unit.f24250a;
    }
}
