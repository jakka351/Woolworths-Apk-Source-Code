package au.com.woolworths.feature.shop.modeselector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.modeselector.ModeSelectorAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionModeKt;
import au.com.woolworths.android.onesite.modules.collectionmode.common.DeliveryModeVariant;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.base.shopapp.modules.button.ButtonActionApiData;
import au.com.woolworths.feature.shop.contentpage.ui.n;
import au.com.woolworths.feature.shop.modeselector.ModeSelectorContract;
import au.com.woolworths.feature.shop.modeselector.model.Item;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeButton;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeButtonType;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeDetails;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeHeader;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelector;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelectorErrorResponse;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelectorOptionStateApiData;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeVariant;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage;
import au.com.woolworths.geolocation.location.LocationInteractor;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import dagger.assisted.AssistedFactory;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/ModeSelectorViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Factory", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ModeSelectorViewModel extends ViewModel implements DefaultLifecycleObserver {
    public final ShoppingModeSelectorRepository e;
    public final CollectionModeInteractor f;
    public final LocationInteractor g;
    public final AnalyticsManager h;
    public final FeatureToggleManager i;
    public final ShopAccountInteractor j;
    public final ShopAppRegionInteractor k;
    public final MutableStateFlow l;
    public final SharedFlowImpl m;
    public final Flow n;
    public final StateFlow o;
    public CollectionMode p;

    @AssistedFactory
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/ModeSelectorViewModel$Factory;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        ModeSelectorViewModel a(Activities.ModeSelectorActivity.ExtraCollectionModeSelector extraCollectionModeSelector);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7520a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[DeliveryModeVariant.values().length];
            try {
                iArr[DeliveryModeVariant.DeliveryStandard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeliveryModeVariant.DeliveryNow.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7520a = iArr;
            int[] iArr2 = new int[ButtonActionApiData.values().length];
            try {
                iArr2[ButtonActionApiData.LINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ButtonActionApiData.SHOW_MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr2;
        }
    }

    public ModeSelectorViewModel(Activities.ModeSelectorActivity.ExtraCollectionModeSelector extraCollectionModeSelector, ShoppingModeSelectorRepository shoppingModeSelectorRepository, CollectionModeInteractor collectionModeInteractor, LocationInteractor locationInteractor, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager, ShopAccountInteractor accountInteractor, ShopAppRegionInteractor shopAppRegionInteractor) {
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(locationInteractor, "locationInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        this.e = shoppingModeSelectorRepository;
        this.f = collectionModeInteractor;
        this.g = locationInteractor;
        this.h = analyticsManager;
        this.i = featureToggleManager;
        this.j = accountInteractor;
        this.k = shopAppRegionInteractor;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new ModeSelectorContract.ViewState(false, null, null, null, null, null, 2047));
        this.l = mutableStateFlowA;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.m = sharedFlowImplB;
        this.n = FlowKt.a(sharedFlowImplB);
        this.o = FlowKt.b(mutableStateFlowA);
        this.p = extraCollectionModeSelector != null ? extraCollectionModeSelector.f : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p6(au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel r9, au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Exception {
        /*
            boolean r0 = r11 instanceof au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel$getCollectionModes$1
            if (r0 == 0) goto L13
            r0 = r11
            au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel$getCollectionModes$1 r0 = (au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel$getCollectionModes$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel$getCollectionModes$1 r0 = new au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel$getCollectionModes$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.u
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r10 = r0.p
            kotlin.ResultKt.b(r11)
            goto L77
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            int r10 = r0.r
            java.lang.String r2 = r0.q
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r6 = r0.p
            kotlin.ResultKt.b(r11)
            goto L61
        L3f:
            kotlin.ResultKt.b(r11)
            boolean r11 = r10 instanceof au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode.InStore
            if (r11 == 0) goto L4d
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor r2 = r9.f
            java.lang.String r2 = r2.y()
            goto L4e
        L4d:
            r2 = r3
        L4e:
            r0.p = r10
            r0.q = r2
            r0.r = r11
            r0.u = r5
            java.lang.Object r6 = r9.s6(r0)
            if (r6 != r1) goto L5d
            goto L75
        L5d:
            r8 = r6
            r6 = r10
            r10 = r11
            r11 = r8
        L61:
            android.location.Location r11 = (android.location.Location) r11
            au.com.woolworths.feature.shop.modeselector.ShoppingModeSelectorRepository r7 = r9.e
            if (r10 == 0) goto L68
            goto L69
        L68:
            r5 = 0
        L69:
            r0.p = r6
            r0.q = r3
            r0.u = r4
            java.lang.Object r11 = r7.a(r2, r11, r5, r0)
            if (r11 != r1) goto L76
        L75:
            return r1
        L76:
            r10 = r6
        L77:
            au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelectorQueryContent r11 = (au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelectorQueryContent) r11
            au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelectorErrorResponse r0 = r11.b
            au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelector r11 = r11.f7541a
            if (r0 == 0) goto L83
            r9.v6(r0, r10)
            goto La0
        L83:
            if (r11 == 0) goto La0
            au.com.woolworths.android.onesite.analytics.AnalyticsManager r0 = r9.h
            au.com.woolworths.analytics.supers.modeselector.ModeSelectorAnalytics$ModeSelector$Action$Companion r1 = au.com.woolworths.analytics.supers.modeselector.ModeSelectorAnalytics.ModeSelector.Action.d
            java.lang.String r10 = au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionModeKt.b(r10)
            r1.getClass()
            java.lang.String r1 = "eventLabel"
            kotlin.jvm.internal.Intrinsics.h(r10, r1)
            au.com.woolworths.analytics.supers.modeselector.ModeSelectorAnalytics$ModeSelector$Action$Companion$impression$1 r1 = new au.com.woolworths.analytics.supers.modeselector.ModeSelectorAnalytics$ModeSelector$Action$Companion$impression$1
            r1.<init>(r10)
            r0.g(r1)
            r9.y6(r11)
        La0:
            kotlin.Unit r9 = kotlin.Unit.f24250a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel.p6(au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel, au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void q6(ModeSelectorViewModel modeSelectorViewModel, Exception exc) {
        Object value;
        Object value2;
        Object value3;
        MutableStateFlow mutableStateFlow = modeSelectorViewModel.l;
        AnalyticsManager analyticsManager = modeSelectorViewModel.h;
        if (!((ModeSelectorContract.ViewState) modeSelectorViewModel.o.getValue()).d.isEmpty()) {
            do {
                value3 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value3, ModeSelectorContract.ViewState.a((ModeSelectorContract.ViewState) value3, false, null, null, null, null, null, null, null, null, null, null, 2046)));
            modeSelectorViewModel.m.f(new ModeSelectorContract.Actions.ShowSnackBarMessage(new ResText(com.woolworths.R.string.mode_selector_snack_bar_error_message)));
            if (exc instanceof NoConnectivityException) {
                analyticsManager.g(ModeSelectorAnalytics.ModeSelector.Action.e);
                return;
            } else {
                ModeSelectorAnalytics.ModeSelector.Action.d.getClass();
                analyticsManager.g(new Event() { // from class: au.com.woolworths.analytics.supers.modeselector.ModeSelectorAnalytics$ModeSelector$Action$Companion$snackbarServerError$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(7);
                        spreadBuilder.b(ModeSelectorAnalytics.ModeSelector.e);
                        spreadBuilder.a(new Pair("event.Category", "error"));
                        spreadBuilder.a(new Pair("event.Action", "impression"));
                        spreadBuilder.a(new Pair("event.Label", "Server Error"));
                        spreadBuilder.a(new Pair("event.Description", "Upfront Fulfilment"));
                        a.z("error.Reason", "Unable to load at this time.", spreadBuilder, "error.Name", "Snackbar");
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getD() {
                        return "error_impression";
                    }

                    public final boolean equals(Object obj) {
                        if (!(obj instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj;
                        return "error_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
                return;
            }
        }
        if (exc instanceof NoConnectivityException) {
            analyticsManager.g(ModeSelectorAnalytics.ModeSelector.Action.f);
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value2, ModeSelectorContract.ViewState.a((ModeSelectorContract.ViewState) value2, false, FullPageMessage.Error.ConnectionError.f8919a, null, null, null, null, null, null, null, null, null, 2044)));
        } else {
            ModeSelectorAnalytics.ModeSelector.Action.d.getClass();
            analyticsManager.g(new Event() { // from class: au.com.woolworths.analytics.supers.modeselector.ModeSelectorAnalytics$ModeSelector$Action$Companion$fullScreenServerError$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(7);
                    spreadBuilder.b(ModeSelectorAnalytics.ModeSelector.e);
                    spreadBuilder.a(new Pair("event.Category", "error"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    spreadBuilder.a(new Pair("event.Label", "Server Error"));
                    spreadBuilder.a(new Pair("event.Description", "Upfront Fulfilment"));
                    a.z("error.Reason", "Unable to load at this time.", spreadBuilder, "error.Name", "Full Screen");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "error_impression";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj;
                    return "error_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, ModeSelectorContract.ViewState.a((ModeSelectorContract.ViewState) value, false, FullPageMessage.Error.ServerError.f8920a, null, null, null, null, null, null, null, null, null, 2044)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        if (r12 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
    
        if (r12 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
    
        if (r12 != r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fa, code lost:
    
        if (r12 == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object r6(au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel r10, au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel.r6(au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel, au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner owner) {
        Intrinsics.h(owner, "owner");
        u6();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s6(kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel$bestEffortLocation$1
            if (r0 == 0) goto L13
            r0 = r9
            au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel$bestEffortLocation$1 r0 = (au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel$bestEffortLocation$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel$bestEffortLocation$1 r0 = new au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel$bestEffortLocation$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 0
            r4 = 1000(0x3e8, double:4.94E-321)
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L39
            if (r2 == r7) goto L35
            if (r2 != r6) goto L2d
            kotlin.ResultKt.b(r9)
            return r9
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            kotlin.ResultKt.b(r9)
            goto L4a
        L39:
            kotlin.ResultKt.b(r9)
            au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel$bestEffortLocation$2 r9 = new au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel$bestEffortLocation$2
            r9.<init>(r8, r3)
            r0.r = r7
            java.lang.Object r9 = kotlinx.coroutines.TimeoutKt.c(r4, r9, r0)
            if (r9 != r1) goto L4a
            goto L5b
        L4a:
            android.location.Location r9 = (android.location.Location) r9
            if (r9 != 0) goto L5c
            au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel$bestEffortLocation$3 r9 = new au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel$bestEffortLocation$3
            r9.<init>(r8, r3)
            r0.r = r6
            java.lang.Object r9 = kotlinx.coroutines.TimeoutKt.c(r4, r9, r0)
            if (r9 != r1) goto L5c
        L5b:
            return r1
        L5c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel.s6(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void t6(ShoppingModeButtonType id) {
        CollectionMode delivery;
        Intrinsics.h(id, "id");
        int iOrdinal = id.ordinal();
        if (iOrdinal == 0) {
            delivery = null;
        } else if (iOrdinal == 1) {
            delivery = new CollectionMode.Delivery(DeliveryModeVariant.DeliveryStandard);
        } else if (iOrdinal == 2) {
            delivery = CollectionMode.PickUp.d;
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            delivery = CollectionMode.InStore.d;
        }
        if (delivery != null) {
            ModeSelectorAnalytics.ModeSelector.Action.Companion companion = ModeSelectorAnalytics.ModeSelector.Action.d;
            final String eventLabel = CollectionModeKt.b(delivery);
            companion.getClass();
            Intrinsics.h(eventLabel, "eventLabel");
            this.h.g(new Event(eventLabel) { // from class: au.com.woolworths.analytics.supers.modeselector.ModeSelectorAnalytics$ModeSelector$Action$Companion$change$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(ModeSelectorAnalytics.ModeSelector.e);
                    spreadBuilder.a(new Pair("event.Category", "mode_selector"));
                    spreadBuilder.a(new Pair("event.Action", "change"));
                    a.z("event.Label", eventLabel, spreadBuilder, "event.Description", "Upfront Fulfilment");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "mode_selector_change";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj;
                    return "mode_selector_change".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
            BuildersKt.c(ViewModelKt.a(this), null, null, new ModeSelectorViewModel$changeShoppingMode$1$1(this, delivery, null), 3);
        }
    }

    public final void u6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new ModeSelectorViewModel$fetchData$1(this, null), 3);
    }

    public final void v6(ShoppingModeSelectorErrorResponse shoppingModeSelectorErrorResponse, CollectionMode collectionMode) {
        Integer numValueOf;
        ModeSelectorViewModel modeSelectorViewModel = this;
        Integer numValueOf2 = null;
        if (collectionMode != null) {
            numValueOf = collectionMode instanceof CollectionMode.Delivery ? Integer.valueOf(com.woolworths.R.string.mode_selector_error_response_delivery_dialog_title) : collectionMode.equals(CollectionMode.PickUp.d) ? Integer.valueOf(com.woolworths.R.string.mode_selector_error_response_pickup_dialog_title) : collectionMode.equals(CollectionMode.InStore.d) ? Integer.valueOf(com.woolworths.R.string.mode_selector_error_response_instore_dialog_title) : null;
        } else {
            numValueOf = null;
        }
        if (collectionMode != null) {
            if (collectionMode instanceof CollectionMode.Delivery) {
                numValueOf2 = Integer.valueOf(com.woolworths.R.string.mode_selector_error_response_delivery_dialog_button_text);
            } else if (collectionMode.equals(CollectionMode.PickUp.d) || collectionMode.equals(CollectionMode.InStore.d)) {
                numValueOf2 = Integer.valueOf(com.woolworths.R.string.mode_selector_error_response_store_dialog_button_text);
            }
        }
        Integer num = numValueOf2;
        ModeSelectorAnalytics.ModeSelector.Action.Companion companion = ModeSelectorAnalytics.ModeSelector.Action.d;
        final String str = shoppingModeSelectorErrorResponse.b;
        companion.getClass();
        modeSelectorViewModel.h.g(new Event(str) { // from class: au.com.woolworths.analytics.supers.modeselector.ModeSelectorAnalytics$ModeSelector$Action$Companion$alertError$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(7);
                spreadBuilder.b(ModeSelectorAnalytics.ModeSelector.e);
                spreadBuilder.a(new Pair("event.Category", "error"));
                spreadBuilder.a(new Pair("event.Action", "impression"));
                spreadBuilder.a(new Pair("event.Label", "Alert Error"));
                spreadBuilder.a(new Pair("event.Description", "Upfront Fulfilment"));
                a.z("error.Reason", str, spreadBuilder, "error.Name", "Full Screen");
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "error_impression";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "error_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        if (num == null || numValueOf == null) {
            return;
        }
        while (true) {
            MutableStateFlow mutableStateFlow = modeSelectorViewModel.l;
            Object value = mutableStateFlow.getValue();
            if (mutableStateFlow.d(value, ModeSelectorContract.ViewState.a((ModeSelectorContract.ViewState) value, false, null, new ModeSelectorContract.DialogModel(new ResText(numValueOf.intValue()), shoppingModeSelectorErrorResponse.b, new ResText(num.intValue()), new ResText(com.woolworths.R.string.mode_selector_error_response_dialog_cancel), new ModeSelectorViewModel$handleErrorResponse$1$1(0, modeSelectorViewModel, ModeSelectorViewModel.class, "fetchData", "fetchData$mode_selector_release()V", 0), new n(20, modeSelectorViewModel, shoppingModeSelectorErrorResponse)), null, null, null, null, null, null, null, null, 2040))) {
                return;
            } else {
                modeSelectorViewModel = this;
            }
        }
    }

    public final void w6(Item clickedItem) {
        MutableStateFlow mutableStateFlow;
        Object value;
        Intrinsics.h(clickedItem, "clickedItem");
        if (clickedItem.b == ShoppingModeSelectorOptionStateApiData.d) {
            do {
                mutableStateFlow = this.l;
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, ModeSelectorContract.ViewState.a((ModeSelectorContract.ViewState) value, true, null, null, null, null, null, null, null, null, null, null, 2042)));
            BuildersKt.c(ViewModelKt.a(this), null, null, new ModeSelectorViewModel$onModeSelectorOptionSelected$2(this, clickedItem, null), 3);
        }
    }

    public final void x6(String str) {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.l;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, ModeSelectorContract.ViewState.a((ModeSelectorContract.ViewState) value, false, null, null, null, null, null, null, null, null, null, null, 2044)));
        this.m.f(new ModeSelectorContract.Actions.ResolveDeepLink(str));
    }

    public final void y6(ShoppingModeSelector shoppingModeSelector) {
        ShoppingModeSection.ShoppingModeSelectorOptionsSection shoppingModeSelectorOptionsSectionA;
        ModeSelectorViewModel modeSelectorViewModel = this;
        ArrayList arrayList = shoppingModeSelector.b;
        ShoppingModeHeader shoppingModeHeader = shoppingModeSelector.f7537a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof ShoppingModeSection.ShoppingModeSelectorAddressInfoSection) {
                arrayList2.add(obj);
            }
        }
        ShoppingModeSection.ShoppingModeSelectorAddressInfoSection shoppingModeSelectorAddressInfoSection = (ShoppingModeSection.ShoppingModeSelectorAddressInfoSection) CollectionsKt.F(arrayList2);
        ShoppingModeDetails shoppingModeDetails = shoppingModeSelectorAddressInfoSection != null ? shoppingModeSelectorAddressInfoSection.f7533a.g : null;
        if (shoppingModeDetails != null) {
            String str = shoppingModeDetails.f7531a;
            CollectionModeInteractor collectionModeInteractor = modeSelectorViewModel.f;
            collectionModeInteractor.r(str);
            collectionModeInteractor.M(shoppingModeDetails.c);
            collectionModeInteractor.i(CollectionModeKt.c(shoppingModeDetails.b, collectionModeInteractor.w().equals(new CollectionMode.Delivery(DeliveryModeVariant.DeliveryNow))));
        }
        while (true) {
            MutableStateFlow mutableStateFlow = modeSelectorViewModel.l;
            Object value = mutableStateFlow.getValue();
            ModeSelectorContract.ViewState viewState = (ModeSelectorContract.ViewState) value;
            ArrayList arrayList3 = shoppingModeHeader.f7532a;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                if (((ShoppingModeButton) obj2).f7530a != ShoppingModeButtonType.d) {
                    arrayList4.add(obj2);
                }
            }
            ArrayList arrayList5 = new ArrayList(CollectionsKt.s(arrayList4, 10));
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                ShoppingModeButton shoppingModeButton = (ShoppingModeButton) it.next();
                boolean z = (modeSelectorViewModel.k.b() == Region.j && shoppingModeButton.f7530a == ShoppingModeButtonType.g) ? false : true;
                ShoppingModeButtonType id = shoppingModeButton.f7530a;
                boolean z2 = shoppingModeButton.b;
                String title = shoppingModeButton.c;
                Intrinsics.h(id, "id");
                Intrinsics.h(title, "title");
                arrayList5.add(new ShoppingModeButton(id, z2, title, z));
            }
            DownloadableAsset downloadableAsset = shoppingModeHeader.b;
            ArrayList arrayList6 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (obj3 instanceof ShoppingModeSection.ShoppingModeSelectorOptionsSection) {
                    arrayList6.add(obj3);
                }
            }
            ShoppingModeSection.ShoppingModeSelectorOptionsSection shoppingModeSelectorOptionsSection = (ShoppingModeSection.ShoppingModeSelectorOptionsSection) CollectionsKt.F(arrayList6);
            if (shoppingModeSelectorOptionsSection != null) {
                List list = shoppingModeSelectorOptionsSection.b;
                ArrayList arrayList7 = new ArrayList();
                for (Object obj4 : list) {
                    if (((Item) obj4).f7528a != ShoppingModeVariant.d) {
                        arrayList7.add(obj4);
                    }
                }
                shoppingModeSelectorOptionsSectionA = ShoppingModeSection.ShoppingModeSelectorOptionsSection.a(shoppingModeSelectorOptionsSection, arrayList7);
            } else {
                shoppingModeSelectorOptionsSectionA = null;
            }
            ArrayList arrayList8 = new ArrayList();
            for (Object obj5 : arrayList) {
                if (obj5 instanceof ShoppingModeSection.ShoppingModeSelectorStoreDetailsSectionData) {
                    arrayList8.add(obj5);
                }
            }
            ShoppingModeSection.ShoppingModeSelectorStoreDetailsSectionData shoppingModeSelectorStoreDetailsSectionData = (ShoppingModeSection.ShoppingModeSelectorStoreDetailsSectionData) CollectionsKt.F(arrayList8);
            ArrayList arrayList9 = new ArrayList();
            for (Object obj6 : arrayList) {
                if (obj6 instanceof ShoppingModeSection.ShoppingModeSelectorStoreFeaturesData) {
                    arrayList9.add(obj6);
                }
            }
            ShoppingModeSection.ShoppingModeSelectorStoreFeaturesData shoppingModeSelectorStoreFeaturesData = (ShoppingModeSection.ShoppingModeSelectorStoreFeaturesData) CollectionsKt.F(arrayList9);
            ArrayList arrayList10 = new ArrayList();
            for (Object obj7 : arrayList) {
                if (obj7 instanceof ShoppingModeSection.ShoppingModeSelectorOptionsSection) {
                    arrayList10.add(obj7);
                }
            }
            ShoppingModeSection.ShoppingModeSelectorOptionsSection shoppingModeSelectorOptionsSection2 = (ShoppingModeSection.ShoppingModeSelectorOptionsSection) CollectionsKt.F(arrayList10);
            String str2 = shoppingModeSelectorOptionsSection2 != null ? shoppingModeSelectorOptionsSection2.c : null;
            ArrayList arrayList11 = new ArrayList();
            for (Object obj8 : arrayList) {
                if (obj8 instanceof ShoppingModeSection.ShoppingModeSelectorOptionsSection) {
                    arrayList11.add(obj8);
                }
            }
            ShoppingModeSection.ShoppingModeSelectorOptionsSection shoppingModeSelectorOptionsSection3 = (ShoppingModeSection.ShoppingModeSelectorOptionsSection) CollectionsKt.F(arrayList11);
            if (mutableStateFlow.d(value, ModeSelectorContract.ViewState.a(viewState, false, null, null, arrayList5, downloadableAsset, shoppingModeSelectorAddressInfoSection, shoppingModeSelectorOptionsSectionA, shoppingModeSelectorStoreDetailsSectionData, shoppingModeSelectorStoreFeaturesData, str2, shoppingModeSelectorOptionsSection3 != null ? shoppingModeSelectorOptionsSection3.d : null, 4))) {
                return;
            } else {
                modeSelectorViewModel = this;
            }
        }
    }
}
