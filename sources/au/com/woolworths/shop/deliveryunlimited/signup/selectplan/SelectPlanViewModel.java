package au.com.woolworths.shop.deliveryunlimited.signup.selectplan;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.common.InlineErrorAction;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.modules.button.Button;
import au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler;
import au.com.woolworths.shop.deliveryunlimited.signup.analytics.SelectPlanActionData;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpPlanTypeUiModel;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpPlanUiModel;
import au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanContract;
import dagger.assisted.AssistedFactory;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/selectplan/SelectPlanViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lau/com/woolworths/shop/deliveryunlimited/signup/selectplan/SelectPlanClickListener;", "Lau/com/woolworths/base/shopapp/modules/button/ButtonClickHandler;", "Factory", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SelectPlanViewModel extends AndroidViewModel implements SelectPlanClickListener, ButtonClickHandler {
    public final boolean f;
    public final AnalyticsManager g;
    public final FeatureToggleManager h;
    public final MutableLiveData i;
    public final SharedFlowImpl j;

    @AssistedFactory
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/selectplan/SelectPlanViewModel$Factory;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        SelectPlanViewModel a(ArrayList arrayList, boolean z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectPlanViewModel(ArrayList arrayList, boolean z, Application application, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager) {
        super(application);
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f = z;
        this.g = analyticsManager;
        this.h = featureToggleManager;
        this.i = new MutableLiveData(new SelectPlanContract.ViewState(arrayList));
        this.j = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanClickListener
    public final void F1(int i) {
        MutableLiveData mutableLiveData = this.i;
        SelectPlanContract.ViewState viewState = (SelectPlanContract.ViewState) mutableLiveData.e();
        if (viewState != null) {
            ?? r1 = viewState.f10900a;
            if (((DeliveryUnlimitedSignUpPlanTypeUiModel) r1.get(i)).c) {
                return;
            }
            Iterable iterable = (Iterable) r1;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(iterable, 10));
            int i2 = 0;
            for (Object obj : iterable) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                arrayList.add(DeliveryUnlimitedSignUpPlanTypeUiModel.a((DeliveryUnlimitedSignUpPlanTypeUiModel) obj, null, i2 == i, 3));
                i2 = i3;
            }
            mutableLiveData.m(new SelectPlanContract.ViewState(arrayList));
        }
    }

    @Override // au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler
    public final void O2(Button data) {
        String strA;
        Intrinsics.h(data, "data");
        this.g.c(SelectPlanActionData.g);
        SelectPlanContract.ViewState viewState = (SelectPlanContract.ViewState) this.i.e();
        if (viewState == null || (strA = SelectPlanContractKt.a(viewState)) == null) {
            return;
        }
        this.j.f((this.h.c(BaseShopAppFeature.o) && this.f) ? new SelectPlanContract.Actions.LaunchPaymentScreen(strA) : new SelectPlanContract.Actions.LaunchConfirmSubscription(strA));
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerClickListener
    public final void onActionClicked(InsetBanner insetBanner) {
        Intrinsics.h(insetBanner, "insetBanner");
        InlineErrorAction action = insetBanner.getAction();
        InlineErrorAction.Link link = action instanceof InlineErrorAction.Link ? (InlineErrorAction.Link) action : null;
        if (link == null) {
            throw new IllegalStateException("Action for select plan InsetBanner must be LINK");
        }
        this.g.j(SelectPlanActionData.e, TrackingMetadata.Companion.a(TrackableValue.o0, link.d.getText(p6())));
        this.j.f(new SelectPlanContract.Actions.OpenUrl(link.e));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    @Override // au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanClickListener
    public final void y0(DeliveryUnlimitedSignUpPlanUiModel plan) {
        ?? arrayList;
        Object next;
        Intrinsics.h(plan, "plan");
        MutableLiveData mutableLiveData = this.i;
        SelectPlanContract.ViewState viewState = (SelectPlanContract.ViewState) mutableLiveData.e();
        if (viewState != null) {
            Iterator it = ((Iterable) viewState.f10900a).iterator();
            while (true) {
                arrayList = 0;
                if (it.hasNext()) {
                    next = it.next();
                    if (((DeliveryUnlimitedSignUpPlanTypeUiModel) next).c) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            DeliveryUnlimitedSignUpPlanTypeUiModel deliveryUnlimitedSignUpPlanTypeUiModel = (DeliveryUnlimitedSignUpPlanTypeUiModel) next;
            if (deliveryUnlimitedSignUpPlanTypeUiModel == null) {
                return;
            }
            this.g.j(SelectPlanActionData.h, TrackingMetadata.Companion.a(TrackableValue.o0, deliveryUnlimitedSignUpPlanTypeUiModel.f10870a + " - " + plan.b));
            if (plan.f) {
                return;
            }
            SelectPlanContract.ViewState viewState2 = (SelectPlanContract.ViewState) mutableLiveData.e();
            if (viewState2 != null) {
                Iterable<DeliveryUnlimitedSignUpPlanTypeUiModel> iterable = (Iterable) viewState2.f10900a;
                arrayList = new ArrayList(CollectionsKt.s(iterable, 10));
                for (DeliveryUnlimitedSignUpPlanTypeUiModel deliveryUnlimitedSignUpPlanTypeUiModelA : iterable) {
                    if (deliveryUnlimitedSignUpPlanTypeUiModelA.c) {
                        List list = deliveryUnlimitedSignUpPlanTypeUiModelA.b;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list, 10));
                        for (Object objA : list) {
                            if (objA instanceof DeliveryUnlimitedSignUpPlanUiModel) {
                                objA = objA.equals(plan) ? DeliveryUnlimitedSignUpPlanUiModel.a((DeliveryUnlimitedSignUpPlanUiModel) objA, true) : DeliveryUnlimitedSignUpPlanUiModel.a((DeliveryUnlimitedSignUpPlanUiModel) objA, false);
                            }
                            arrayList2.add(objA);
                        }
                        deliveryUnlimitedSignUpPlanTypeUiModelA = DeliveryUnlimitedSignUpPlanTypeUiModel.a(deliveryUnlimitedSignUpPlanTypeUiModelA, arrayList2, false, 5);
                    }
                    arrayList.add(deliveryUnlimitedSignUpPlanTypeUiModelA);
                }
            }
            if (arrayList == 0) {
                arrayList = EmptyList.d;
            }
            mutableLiveData.m(new SelectPlanContract.ViewState(arrayList));
        }
    }
}
