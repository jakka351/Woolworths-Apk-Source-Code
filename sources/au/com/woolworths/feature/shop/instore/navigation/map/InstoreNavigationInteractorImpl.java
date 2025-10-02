package au.com.woolworths.feature.shop.instore.navigation.map;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.CredentialsInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor;
import au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.instore.navigation.InstoreNavigationFeature;
import au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.json.Json;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/InstoreNavigationInteractorImpl;", "Lau/com/woolworths/foundation/shop/instore/navigation/map/InstoreNavigationInteractor;", "Companion", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstoreNavigationInteractorImpl implements InstoreNavigationInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final CollectionModeInteractor f7326a;
    public final PositioningInteractor b;
    public final CredentialsInteractor c;
    public final BuildingInteractor d;
    public final LegacyStoreLocatorInteractorImpl e;
    public final SharedPreferences f;
    public final FeatureToggleManager g;
    public final DispatcherProvider h;
    public String i;
    public Store j;
    public final Lazy k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/InstoreNavigationInteractorImpl$Companion;", "", "", "PREFS_MAPPED_STORE_INFO", "Ljava/lang/String;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public InstoreNavigationInteractorImpl(CollectionModeInteractor collectionModeInteractor, PositioningInteractor positioningInteractor, CredentialsInteractor credentialsInteractor, BuildingInteractor buildingInteractor, LegacyStoreLocatorInteractorImpl legacyStoreLocatorInteractorImpl, SharedPreferences sharedPreferences, FeatureToggleManager featureToggleManager, DispatcherProvider dispatcher) {
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(positioningInteractor, "positioningInteractor");
        Intrinsics.h(credentialsInteractor, "credentialsInteractor");
        Intrinsics.h(buildingInteractor, "buildingInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(dispatcher, "dispatcher");
        this.f7326a = collectionModeInteractor;
        this.b = positioningInteractor;
        this.c = credentialsInteractor;
        this.d = buildingInteractor;
        this.e = legacyStoreLocatorInteractorImpl;
        this.f = sharedPreferences;
        this.g = featureToggleManager;
        this.h = dispatcher;
        this.k = LazyKt.b(new Function0() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string = this.d.f.getString("_mappedStoreInfo", null);
                if (string != null) {
                    Json.Default r1 = Json.d;
                    r1.getClass();
                    MappedStoreInfo mappedStoreInfo = (MappedStoreInfo) r1.b(MappedStoreInfo.INSTANCE.serializer(), string);
                    if (mappedStoreInfo != null) {
                        return mappedStoreInfo;
                    }
                }
                return new MappedStoreInfo();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(au.com.woolworths.feature.shop.instore.navigation.map.InstoreNavigationInteractorImpl r6, au.com.woolworths.feature.shop.instore.navigation.map.domain.CredentialsInteractor r7, au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractor r8, java.lang.String r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            boolean r0 = r10 instanceof au.com.woolworths.feature.shop.instore.navigation.map.InstoreNavigationInteractorImpl$fetchMapForStore$1
            if (r0 == 0) goto L13
            r0 = r10
            au.com.woolworths.feature.shop.instore.navigation.map.InstoreNavigationInteractorImpl$fetchMapForStore$1 r0 = (au.com.woolworths.feature.shop.instore.navigation.map.InstoreNavigationInteractorImpl$fetchMapForStore$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.instore.navigation.map.InstoreNavigationInteractorImpl$fetchMapForStore$1 r0 = new au.com.woolworths.feature.shop.instore.navigation.map.InstoreNavigationInteractorImpl$fetchMapForStore$1
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r10)
            return r10
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            boolean r7 = r0.r
            java.lang.String r9 = r0.q
            au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractor r8 = r0.p
            kotlin.ResultKt.b(r10)
            goto L59
        L3c:
            kotlin.ResultKt.b(r10)
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r10 = r6.g
            au.com.woolworths.foundation.shop.instore.navigation.InstoreNavigationFeature r2 = au.com.woolworths.foundation.shop.instore.navigation.InstoreNavigationFeature.d
            boolean r10 = r10.c(r2)
            r0.p = r8
            r0.q = r9
            r0.r = r10
            r0.u = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L56
            goto L7b
        L56:
            r5 = r10
            r10 = r7
            r7 = r5
        L59:
            au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult r10 = (au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult) r10
            boolean r2 = r10 instanceof au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult.Success
            if (r2 == 0) goto L7d
            timber.log.Timber$Forest r10 = timber.log.Timber.f27013a
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "oriient API authentication success, set `automaticCalibrationEnabled = true`"
            r10.b(r4, r2)
            au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor r10 = r6.b
            r10.b(r7)
            r7 = 0
            r0.p = r7
            r0.q = r7
            r0.u = r3
            java.lang.Object r6 = r6.i(r8, r9, r0)
            if (r6 != r1) goto L7c
        L7b:
            return r1
        L7c:
            return r6
        L7d:
            boolean r6 = r10 instanceof au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult.Failure
            if (r6 == 0) goto L98
            au.com.woolworths.foundation.bark.Bark$Companion r6 = au.com.woolworths.foundation.bark.Bark.f8483a
            au.com.woolworths.foundation.bark.common.ReportOwner r6 = new au.com.woolworths.foundation.bark.common.ReportOwner
            au.com.woolworths.foundation.bark.common.ReportOwner$Squad r7 = au.com.woolworths.foundation.bark.common.ReportOwner.Squad.u
            r6.<init>(r7)
            au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult$Failure r10 = (au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult.Failure) r10
            au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientError r7 = r10.f7367a
            java.lang.String r8 = "oriient API authentication failure"
            r9 = 8
            au.com.woolworths.foundation.bark.Bark.Barker.c(r6, r7, r8, r9)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L98:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.navigation.map.InstoreNavigationInteractorImpl.h(au.com.woolworths.feature.shop.instore.navigation.map.InstoreNavigationInteractorImpl, au.com.woolworths.feature.shop.instore.navigation.map.domain.CredentialsInteractor, au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractor, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor
    public final String a() {
        String str = this.i;
        if (str != null) {
            if (StringsKt.D(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return this.f7326a.a();
    }

    @Override // au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor
    public final Store b() {
        String str = this.i;
        if (str == null) {
            return this.f7326a.h();
        }
        if (str != null) {
            if (StringsKt.D(str)) {
                str = null;
            }
            if (str != null) {
                return this.j;
            }
        }
        return null;
    }

    @Override // au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor
    public final void c(boolean z) {
        String strA = a();
        if (strA != null) {
            Boolean boolValueOf = Boolean.valueOf(z);
            Lazy lazy = this.k;
            ((MappedStoreInfo) lazy.getD()).f7327a.put(strA, boolValueOf);
            Json.Default r4 = Json.d;
            MappedStoreInfo mappedStoreInfo = (MappedStoreInfo) lazy.getD();
            r4.getClass();
            String strC = r4.c(MappedStoreInfo.INSTANCE.serializer(), mappedStoreInfo);
            SharedPreferences.Editor editorEdit = this.f.edit();
            editorEdit.putString("_mappedStoreInfo", strC);
            editorEdit.apply();
        }
    }

    @Override // au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor
    public final boolean d() {
        Boolean bool;
        if (this.g.c(InstoreNavigationFeature.e)) {
            return true;
        }
        String strA = a();
        if (strA == null || (bool = (Boolean) ((MappedStoreInfo) this.k.getD()).f7327a.get(strA)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.feature.shop.instore.navigation.map.InstoreNavigationInteractorImpl$forceStore$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.feature.shop.instore.navigation.map.InstoreNavigationInteractorImpl$forceStore$1 r0 = (au.com.woolworths.feature.shop.instore.navigation.map.InstoreNavigationInteractorImpl$forceStore$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.instore.navigation.map.InstoreNavigationInteractorImpl$forceStore$1 r0 = new au.com.woolworths.feature.shop.instore.navigation.map.InstoreNavigationInteractorImpl$forceStore$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            au.com.woolworths.feature.shop.instore.navigation.map.InstoreNavigationInteractorImpl r5 = r0.p
            kotlin.ResultKt.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r6)
            r4.i = r5
            if (r5 == 0) goto L49
            r0.p = r4
            r0.s = r3
            au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl r6 = r4.e
            java.lang.Object r6 = r6.d(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            au.com.woolworths.foundation.shop.storelocator.pickup.models.Store r6 = (au.com.woolworths.foundation.shop.storelocator.pickup.models.Store) r6
            goto L4b
        L49:
            r6 = 0
            r5 = r4
        L4b:
            r5.j = r6
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.navigation.map.InstoreNavigationInteractorImpl.e(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor
    public final String f() {
        Store storeB = b();
        if (storeB != null) {
            return storeB.f;
        }
        return null;
    }

    @Override // au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor
    public final Object g(ContinuationImpl continuationImpl) {
        this.h.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new InstoreNavigationInteractorImpl$fetchCurrentStoreMap$2(this, null), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractor r5, java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof au.com.woolworths.feature.shop.instore.navigation.map.InstoreNavigationInteractorImpl$fetchBuildingForStore$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.feature.shop.instore.navigation.map.InstoreNavigationInteractorImpl$fetchBuildingForStore$1 r0 = (au.com.woolworths.feature.shop.instore.navigation.map.InstoreNavigationInteractorImpl$fetchBuildingForStore$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.instore.navigation.map.InstoreNavigationInteractorImpl$fetchBuildingForStore$1 r0 = new au.com.woolworths.feature.shop.instore.navigation.map.InstoreNavigationInteractorImpl$fetchBuildingForStore$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r6 = r0.p
            kotlin.ResultKt.b(r7)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r7)
            r0.p = r6
            r0.s = r3
            java.lang.Object r7 = r5.a(r6, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult r7 = (au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult) r7
            boolean r5 = r7 instanceof au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult.Success
            if (r5 == 0) goto L58
            timber.log.Timber$Forest r5 = timber.log.Timber.f27013a
            java.lang.String r7 = "oriient buildingInteractor.fetchBuildingForWooliesStore for storeId "
            java.lang.String r0 = " success"
            java.lang.String r6 = YU.a.h(r7, r6, r0)
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r5.b(r6, r7)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L58:
            boolean r5 = r7 instanceof au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult.Failure
            if (r5 == 0) goto L79
            au.com.woolworths.foundation.bark.Bark$Companion r5 = au.com.woolworths.foundation.bark.Bark.f8483a
            au.com.woolworths.foundation.bark.common.ReportOwner$Squad r5 = au.com.woolworths.foundation.bark.common.ReportOwner.Squad.u
            au.com.woolworths.foundation.bark.common.ReportOwner r0 = new au.com.woolworths.foundation.bark.common.ReportOwner
            r0.<init>(r5)
            au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult$Failure r7 = (au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult.Failure) r7
            au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientError r5 = r7.f7367a
            java.lang.String r7 = "oriient buildingInteractor.fetchBuildingForWooliesStore for storeId: "
            java.lang.String r1 = " failure"
            java.lang.String r6 = YU.a.h(r7, r6, r1)
            r7 = 24
            au.com.woolworths.foundation.bark.Bark.Barker.h(r0, r5, r6, r7)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L79:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.navigation.map.InstoreNavigationInteractorImpl.i(au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractor, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
