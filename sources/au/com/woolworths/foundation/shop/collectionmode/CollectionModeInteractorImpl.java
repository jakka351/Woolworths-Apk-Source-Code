package au.com.woolworths.foundation.shop.collectionmode;

import android.content.SharedPreferences;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.FirebaseAnalyticsLogger;
import au.com.woolworths.android.onesite.appdata.AccountInteractor;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionModeKt;
import au.com.woolworths.android.onesite.modules.collectionmode.common.DeliveryModeVariant;
import au.com.woolworths.android.onesite.modules.storelocator.models.SelectedPickUpLocation;
import au.com.woolworths.android.onesite.utils.preload.PreLoader;
import au.com.woolworths.base.shopapp.modules.collectionmode.CollectionModeRepository;
import au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository;
import au.com.woolworths.base.shopapp.modules.collectionmode.data.CollectionModeLabel;
import au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeVariantStateData;
import au.com.woolworths.foundation.shop.storelocator.PickUpLocatorRepository;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.d;
import dagger.Lazy;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/foundation/shop/collectionmode/CollectionModeInteractorImpl;", "Lau/com/woolworths/android/onesite/utils/preload/PreLoader;", "", "Lau/com/woolworths/foundation/shop/collectionmode/CollectionModeInteractor;", "Companion", "collection-mode_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CollectionModeInteractorImpl extends PreLoader<Unit> implements CollectionModeInteractor {
    public final Lazy e;
    public final Lazy f;
    public final CollectionModeRepository g;
    public final PickUpLocatorRepository h;
    public final AccountInteractor i;
    public final MutableStateFlow j;
    public final ContextScope k;
    public final Flow l;
    public final Flow m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/foundation/shop/collectionmode/CollectionModeInteractorImpl$Companion;", "", "", "INSTORE", "Ljava/lang/String;", "PICKUP", "COURIER", "collection-mode_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public CollectionModeInteractorImpl(Lazy repositoryManagerLazy, Lazy legacyShoppingModeRepositoryLazy, CollectionModeRepository collectionModeRepository, PickUpLocatorRepository pickUpLocatorRepository, AccountInteractor accountInteractor) {
        Intrinsics.h(repositoryManagerLazy, "repositoryManagerLazy");
        Intrinsics.h(legacyShoppingModeRepositoryLazy, "legacyShoppingModeRepositoryLazy");
        Intrinsics.h(collectionModeRepository, "collectionModeRepository");
        Intrinsics.h(pickUpLocatorRepository, "pickUpLocatorRepository");
        Intrinsics.h(accountInteractor, "accountInteractor");
        this.e = repositoryManagerLazy;
        this.f = legacyShoppingModeRepositoryLazy;
        this.g = collectionModeRepository;
        this.h = pickUpLocatorRepository;
        this.i = accountInteractor;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(Boolean.FALSE);
        this.j = mutableStateFlowA;
        Job jobB = SupervisorKt.b();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        this.k = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, DefaultIoScheduler.f));
        this.l = FlowKt.b(mutableStateFlowA);
        this.m = FlowKt.b(collectionModeRepository.g);
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    public final Integer A() {
        SelectedPickUpLocation selectedPickUpLocationA = this.h.a();
        if (selectedPickUpLocationA != null) {
            return selectedPickUpLocationA.getId();
        }
        return null;
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    public final String B() {
        Integer numJ = J();
        if (numJ != null) {
            return numJ.toString();
        }
        return null;
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    public final boolean C() {
        return this.g.c().equals(new CollectionMode.Delivery(DeliveryModeVariant.DeliveryStandard)) && c() == null;
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    public final void F(ShoppingModeVariantStateData state) {
        Intrinsics.h(state, "state");
        if (R()) {
            if (j() && state != ShoppingModeVariantStateData.SELECTED) {
                i(new CollectionMode.Delivery(DeliveryModeVariant.DeliveryStandard));
            } else {
                if (j() || state != ShoppingModeVariantStateData.SELECTED) {
                    return;
                }
                i(new CollectionMode.Delivery(DeliveryModeVariant.DeliveryNow));
            }
        }
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    public final boolean G() {
        return this.g.c() instanceof CollectionMode.PickUp;
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    public final void H() {
        CollectionMode collectionModeC = this.g.c();
        DeliveryModeVariant deliveryModeVariant = DeliveryModeVariant.DeliveryNow;
        i(collectionModeC.equals(new CollectionMode.Delivery(deliveryModeVariant)) ? new CollectionMode.Delivery(deliveryModeVariant) : new CollectionMode.Delivery(DeliveryModeVariant.DeliveryStandard));
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    public final Integer J() {
        int i = this.h.b.getInt("pick_up_store_address_id", -1);
        if (i == -1) {
            return null;
        }
        return Integer.valueOf(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object L(kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractorImpl$fetchShoppingModeVariantData$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractorImpl$fetchShoppingModeVariantData$1 r0 = (au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractorImpl$fetchShoppingModeVariantData$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractorImpl$fetchShoppingModeVariantData$1 r0 = new au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractorImpl$fetchShoppingModeVariantData$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeVariantStateData r0 = r0.p
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L69
            goto L58
        L29:
            r7 = move-exception
            goto L65
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            kotlin.ResultKt.b(r7)
            au.com.woolworths.android.onesite.appdata.AccountInteractor r7 = r6.i
            boolean r7 = r7.d()
            if (r7 == 0) goto L6c
            boolean r7 = r6.R()
            if (r7 == 0) goto L6c
            au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeVariantStateData r7 = au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeVariantStateData.DISABLED
            au.com.woolworths.base.shopapp.modules.collectionmode.CollectionModeRepository r2 = r6.g     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L63
            au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeIdData r4 = au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeIdData.f     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L63
            r0.p = r7     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L63
            r0.s = r3     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L63
            java.lang.Enum r0 = r2.b(r4, r0)     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L63
            if (r0 != r1) goto L55
            return r1
        L55:
            r5 = r0
            r0 = r7
            r7 = r5
        L58:
            au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeVariantStateData r7 = (au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeVariantStateData) r7     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L69 java.lang.Throwable -> L69
            r6.F(r7)
            goto L6c
        L5e:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
            goto L65
        L63:
            r0 = r7
            goto L69
        L65:
            r6.F(r0)
            throw r7
        L69:
            r6.F(r0)
        L6c:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractorImpl.L(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    public final void M(Integer num) {
        PickUpLocatorRepository pickUpLocatorRepository = this.h;
        pickUpLocatorRepository.getClass();
        if (num != null) {
            int iIntValue = num.intValue();
            SharedPreferences.Editor editorEdit = pickUpLocatorRepository.b.edit();
            editorEdit.putInt("pick_up_store_address_id", iIntValue);
            editorEdit.apply();
        }
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    public final void Q() {
        BuildersKt.c(this.k, null, null, new CollectionModeInteractorImpl$clearFulfilmentWindowRxCompat$1(this, null), 3);
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    public final boolean R() {
        return this.g.c() instanceof CollectionMode.Delivery;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // au.com.woolworths.android.onesite.utils.preload.PreLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object T(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractorImpl$getData$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractorImpl$getData$1 r0 = (au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractorImpl$getData$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractorImpl$getData$1 r0 = new au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractorImpl$getData$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.ResultKt.b(r5)
            r0.r = r3
            java.lang.Object r5 = r4.L(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractorImpl.T(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    public final String a() {
        CollectionMode collectionModeC = this.g.c();
        if (collectionModeC.equals(CollectionMode.PickUp.d)) {
            return B();
        }
        if (collectionModeC.equals(CollectionMode.InStore.d)) {
            return ((RepositoryManager) this.e.get()).f();
        }
        return null;
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    public final boolean b() {
        return this.g.c() instanceof CollectionMode.InStore;
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    public final String c() {
        return ((RepositoryManager) this.e.get()).c();
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    public final void f(CollectionMode modeId) {
        Intrinsics.h(modeId, "modeId");
        if (modeId.equals(this.g.c())) {
            return;
        }
        i(modeId);
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    /* renamed from: g, reason: from getter */
    public final Flow getM() {
        return this.m;
    }

    @Override // au.com.woolworths.android.onesite.analytics.PersistentMetadataProvider
    public final TrackingMetadata getMetadata() {
        TrackableValue trackableValue = TrackableValue.S2;
        CollectionModeRepository collectionModeRepository = this.g;
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(trackableValue, collectionModeRepository.c().getModeName());
        trackingMetadataA.b(TrackableValue.V2, CollectionModeKt.b(collectionModeRepository.c()));
        return trackingMetadataA;
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    public final Store h() {
        return ((RepositoryManager) this.e.get()).e();
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    public final void i(CollectionMode collectionMode) {
        Intrinsics.h(collectionMode, "collectionMode");
        l(collectionMode, true);
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    public final boolean j() {
        return this.g.c().equals(new CollectionMode.Delivery(DeliveryModeVariant.DeliveryNow));
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    public final PublishSubject k() {
        return this.g.f;
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    public final void l(CollectionMode collectionMode, boolean z) {
        Intrinsics.h(collectionMode, "collectionMode");
        CollectionModeRepository collectionModeRepository = this.g;
        collectionModeRepository.getClass();
        FirebaseAnalyticsLogger firebaseAnalyticsLogger = collectionModeRepository.d;
        firebaseAnalyticsLogger.getClass();
        FirebaseCrashlytics firebaseCrashlytics = firebaseAnalyticsLogger.b;
        String modeName = collectionMode.getModeName();
        CrashlyticsCore crashlyticsCore = firebaseCrashlytics.f15252a;
        crashlyticsCore.o.f15286a.a(new d(crashlyticsCore, "shopping_mode", modeName));
        firebaseCrashlytics.a("Change of Shopping mode: " + modeName);
        String strJ = collectionModeRepository.c.j(collectionMode);
        SharedPreferences.Editor editorEdit = collectionModeRepository.f4624a.edit();
        editorEdit.putString("CollectionMode", strJ);
        editorEdit.apply();
        collectionModeRepository.g.f(collectionMode);
        if (z) {
            collectionModeRepository.f.onNext(collectionMode);
        }
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    public final Object o(SuspendLambda suspendLambda) throws Exception {
        Object objA = this.g.a(suspendLambda);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    public final SelectedPickUpLocation p() {
        return this.h.a();
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    public final CollectionModeLabel q(CollectionMode mode) {
        Intrinsics.h(mode, "mode");
        SelectedPickUpLocation selectedPickUpLocationA = this.h.a();
        return new CollectionModeLabel(mode, selectedPickUpLocationA != null ? selectedPickUpLocationA.getPickUpOptionLabel() : null);
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    public final void r(String str) {
        ((RepositoryManager) this.e.get()).g(str);
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    public final boolean s() {
        Lazy lazy = this.f;
        return ((LegacyShoppingModeRepository) lazy.get()).e() || ((LegacyShoppingModeRepository) lazy.get()).m() != null;
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    public final CollectionMode w() {
        return this.g.c();
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor
    public final String y() {
        Store storeH = h();
        if (storeH != null) {
            return storeH.getD();
        }
        return null;
    }
}
