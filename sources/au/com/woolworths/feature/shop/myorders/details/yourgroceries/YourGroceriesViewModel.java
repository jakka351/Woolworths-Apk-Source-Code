package au.com.woolworths.feature.shop.myorders.details.yourgroceries;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.ProductTrackingValue;
import au.com.woolworths.android.onesite.analytics.ProductTrackingValueKt;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.shop.myorders.details.analytics.HelpActions;
import au.com.woolworths.feature.shop.myorders.details.analytics.MyOrdersScreens;
import au.com.woolworths.feature.shop.myorders.details.analytics.YourGroceriesActions;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesCategoryItem;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesFullfilmentStatusItem;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesProductItem;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesSkeletonItemTile;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesSubstitutedProduct;
import au.com.woolworths.feature.shop.myorders.details.help.HelpActionView;
import au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpDataList;
import au.com.woolworths.feature.shop.myorders.details.substitutionrating.SubstitutionRatingRepository;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract;
import dagger.assisted.AssistedFactory;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$YourGroceriesClickHandler;", "Lau/com/woolworths/feature/shop/myorders/details/help/HelpActionView$ClickHandler;", "Factory", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class YourGroceriesViewModel extends ViewModel implements FullPageErrorStateClickHandler, YourGroceriesContract.YourGroceriesClickHandler, HelpActionView.ClickHandler {
    public final String e;
    public final AnalyticsManager f;
    public final YourGroceriesInteractor g;
    public final SubstitutionRatingRepository h;
    public final FeatureToggleManager i;
    public final MutableStateFlow j;
    public final StateFlow k;
    public final SharedFlowImpl l;
    public final SharedFlow m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesViewModel$Companion;", "", "", "SKELETON_ITEM_TILE_COUNT", "I", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @AssistedFactory
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesViewModel$Factory;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        YourGroceriesViewModel a(String str);
    }

    public YourGroceriesViewModel(String orderId, AnalyticsManager analyticsManager, YourGroceriesInteractor yourGroceriesInteractor, SubstitutionRatingRepository substitutionRatingRepository, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(orderId, "orderId");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = orderId;
        this.f = analyticsManager;
        this.g = yourGroceriesInteractor;
        this.h = substitutionRatingRepository;
        this.i = featureToggleManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new YourGroceriesContract.ViewState(true, EmptyList.d, null, null, null, null, 56));
        this.j = mutableStateFlowA;
        this.k = mutableStateFlowA;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.l = sharedFlowImplB;
        this.m = FlowKt.a(sharedFlowImplB);
    }

    public static ArrayList p6(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        for (int i = 0; i < 6; i++) {
            arrayList.add(new YourGroceriesSkeletonItemTile(i));
        }
        return arrayList;
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract.YourGroceriesClickHandler
    public final void O4(YourGroceriesSubstitutedProduct item) {
        Intrinsics.h(item, "item");
        String str = item.f7710a;
        this.l.f(new YourGroceriesContract.Action.OpenProductDetails(str));
        u6(YourGroceriesActions.i, str);
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract.YourGroceriesClickHandler
    public final void X0(YourGroceriesProductItem item) {
        Intrinsics.h(item, "item");
        String str = item.f7707a;
        this.l.f(new YourGroceriesContract.Action.OpenProductDetails(str));
        u6(YourGroceriesActions.h, str);
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract.YourGroceriesClickHandler
    public final void c3() {
        YourGroceriesContract.PaymentSummaryInfo paymentSummaryInfo = ((YourGroceriesContract.ViewState) this.k.getValue()).c;
        if (paymentSummaryInfo == null) {
            return;
        }
        this.l.f(new YourGroceriesContract.Action.OpenPaymentSummary(paymentSummaryInfo));
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.help.HelpActionView.ClickHandler
    public final void h5() {
        OrderHelpDataList orderHelpDataList = ((YourGroceriesContract.ViewState) this.k.getValue()).d;
        if (orderHelpDataList != null) {
            this.l.f(new YourGroceriesContract.Action.OpenOrderDetailsHelpActivity(orderHelpDataList));
            this.f.c(new HelpActions.HelpMenuClick(MyOrdersScreens.i));
        }
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        r6();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q6(au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesFilterGroupItem.YourGroceriesFilterItem r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesViewModel$fetchNewStateByFilter$1
            if (r0 == 0) goto L13
            r0 = r12
            au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesViewModel$fetchNewStateByFilter$1 r0 = (au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesViewModel$fetchNewStateByFilter$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesViewModel$fetchNewStateByFilter$1 r0 = new au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesViewModel$fetchNewStateByFilter$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.u
            java.lang.String r3 = r10.e
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L48
            if (r2 == r5) goto L40
            if (r2 != r4) goto L38
            java.util.ArrayList r11 = r0.r
            au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract$PaymentSummaryInfo r1 = r0.q
            java.lang.Object r0 = r0.p
            au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpDataList r0 = (au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpDataList) r0
            kotlin.ResultKt.b(r12)
            r7 = r0
            r6 = r1
        L35:
            r5 = r11
            goto La4
        L38:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L40:
            java.lang.Object r11 = r0.p
            au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesFilterGroupItem$YourGroceriesFilterItem r11 = (au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesFilterGroupItem.YourGroceriesFilterItem) r11
            kotlin.ResultKt.b(r12)
            goto L5e
        L48:
            kotlin.ResultKt.b(r12)
            if (r11 == 0) goto L50
            java.lang.String r12 = r11.f7704a
            goto L51
        L50:
            r12 = 0
        L51:
            r0.p = r11
            r0.u = r5
            au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesInteractor r2 = r10.g
            java.lang.Object r12 = r2.a(r3, r12, r0)
            if (r12 != r1) goto L5e
            goto L9f
        L5e:
            au.com.woolworths.feature.shop.myorders.details.models.YourGroceriesProductList r12 = (au.com.woolworths.feature.shop.myorders.details.models.YourGroceriesProductList) r12
            if (r11 != 0) goto L6f
            au.com.woolworths.analytics.model.TrackableValue r11 = au.com.woolworths.analytics.model.TrackableValue.h1
            au.com.woolworths.analytics.model.TrackingMetadata r11 = au.com.woolworths.analytics.model.TrackingMetadata.Companion.a(r11, r3)
            au.com.woolworths.android.onesite.analytics.AnalyticsManager r2 = r10.f
            au.com.woolworths.feature.shop.myorders.details.analytics.YourGroceriesActions r3 = au.com.woolworths.feature.shop.myorders.details.analytics.YourGroceriesActions.e
            r2.j(r3, r11)
        L6f:
            au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesHeaderGroupItem r11 = new au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesHeaderGroupItem
            au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesFilterGroupItem r2 = r12.f7777a
            java.lang.String r3 = r12.c
            r11.<init>(r2, r3)
            java.util.List r11 = kotlin.collections.CollectionsKt.Q(r11)
            java.util.Collection r11 = (java.util.Collection) r11
            java.util.ArrayList r2 = r12.b
            java.util.ArrayList r11 = kotlin.collections.CollectionsKt.c0(r2, r11)
            au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract$PaymentSummaryInfo r2 = new au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract$PaymentSummaryInfo
            java.lang.String r3 = r12.d
            java.lang.String r5 = r12.e
            au.com.woolworths.feature.shop.myorders.details.models.OrderPaymentDetailsData r6 = r12.f
            r2.<init>(r3, r5, r6)
            au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpDataList r12 = r12.g
            r0.p = r12
            r0.q = r2
            r0.r = r11
            r0.u = r4
            java.lang.Object r0 = r10.t6(r11, r0)
            if (r0 != r1) goto La0
        L9f:
            return r1
        La0:
            r7 = r12
            r12 = r0
            r6 = r2
            goto L35
        La4:
            r9 = r12
            java.util.Map r9 = (java.util.Map) r9
            au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract$ViewState r3 = new au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract$ViewState
            r4 = 0
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesViewModel.q6(au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesFilterGroupItem$YourGroceriesFilterItem, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void r6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new YourGroceriesViewModel$fetchYourGroceries$1(this, null), 3);
    }

    public final YourGroceriesContract.ViewState s6() {
        return (YourGroceriesContract.ViewState) this.k.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c3 -> B:34:0x00c4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t6(java.util.List r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesViewModel$getRatingUpMap$1
            if (r0 == 0) goto L13
            r0 = r9
            au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesViewModel$getRatingUpMap$1 r0 = (au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesViewModel$getRatingUpMap$1) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesViewModel$getRatingUpMap$1 r0 = new au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesViewModel$getRatingUpMap$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.t
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.String r8 = r0.s
            java.util.Map r2 = r0.r
            java.util.Map r2 = (java.util.Map) r2
            java.util.Iterator r4 = r0.q
            java.util.Map r5 = r0.p
            java.util.Map r5 = (java.util.Map) r5
            kotlin.ResultKt.b(r9)
            goto Lc4
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            kotlin.ResultKt.b(r9)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L4a:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r8.next()
            boolean r4 = r2 instanceof au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesProductItem
            if (r4 == 0) goto L4a
            r9.add(r2)
            goto L4a
        L5c:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r9.iterator()
        L65:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L79
            java.lang.Object r2 = r9.next()
            au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesProductItem r2 = (au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesProductItem) r2
            java.util.List r2 = r2.h
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            kotlin.collections.CollectionsKt.h(r2, r8)
            goto L65
        L79:
            r9 = 10
            int r9 = kotlin.collections.CollectionsKt.s(r8, r9)
            int r9 = kotlin.collections.MapsKt.h(r9)
            r2 = 16
            if (r9 >= r2) goto L88
            r9 = r2
        L88:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r9)
            java.util.Iterator r8 = r8.iterator()
            r4 = r8
        L92:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto Lc9
            java.lang.Object r8 = r4.next()
            au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesSubstitutedProduct r8 = (au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesSubstitutedProduct) r8
            java.lang.String r8 = r8.f7710a
            r9 = r2
            java.util.Map r9 = (java.util.Map) r9
            r0.p = r9
            r0.q = r4
            r0.r = r9
            r0.s = r8
            r0.v = r3
            au.com.woolworths.feature.shop.myorders.details.substitutionrating.SubstitutionRatingRepository r9 = r7.h
            androidx.datastore.core.DataStore r9 = r9.f7790a
            kotlinx.coroutines.flow.Flow r9 = r9.getD()
            au.com.woolworths.feature.shop.myorders.details.substitutionrating.SubstitutionRatingRepository$getSubstitutionRatingUp$$inlined$map$1 r5 = new au.com.woolworths.feature.shop.myorders.details.substitutionrating.SubstitutionRatingRepository$getSubstitutionRatingUp$$inlined$map$1
            java.lang.String r6 = r7.e
            r5.<init>()
            java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.w(r5, r0)
            if (r9 != r1) goto Lc3
            return r1
        Lc3:
            r5 = r2
        Lc4:
            r2.put(r8, r9)
            r2 = r5
            goto L92
        Lc9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesViewModel.t6(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void u6(YourGroceriesActions yourGroceriesActions, String str) {
        String str2 = null;
        TrackingMetadata trackingMetadataA = ProductTrackingValueKt.a(CollectionsKt.Q(new ProductTrackingValue(Long.parseLong(str), null, null, null, null, null, null, null, null, null, null, null, 16382)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (YourGroceriesContract.YourGroceriesItem yourGroceriesItem : s6().b) {
            if (yourGroceriesItem instanceof YourGroceriesCategoryItem) {
                str2 = ((YourGroceriesCategoryItem) yourGroceriesItem).f7702a;
            } else if (yourGroceriesItem instanceof YourGroceriesProductItem) {
                YourGroceriesProductItem yourGroceriesProductItem = (YourGroceriesProductItem) yourGroceriesItem;
                linkedHashMap.put(yourGroceriesProductItem.f7707a, str2 == null ? "" : str2);
                Iterator it = yourGroceriesProductItem.h.iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(((YourGroceriesSubstitutedProduct) it.next()).f7710a, str2 == null ? "" : str2);
                }
            }
        }
        String str3 = (String) linkedHashMap.get(str);
        if (str3 != null) {
            trackingMetadataA.b(TrackableValue.g2, str3);
        }
        this.f.j(yourGroceriesActions, trackingMetadataA);
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract.YourGroceriesClickHandler
    public final void y3(YourGroceriesFullfilmentStatusItem status) {
        Intrinsics.h(status, "status");
        String str = status.f7705a;
        String str2 = status.b;
        if (str2 != null) {
            this.l.f(new YourGroceriesContract.Action.ShowMessageDialog(str, str2));
        }
        this.f.j(YourGroceriesActions.g, TrackingMetadata.Companion.a(TrackableValue.o0, str));
    }
}
