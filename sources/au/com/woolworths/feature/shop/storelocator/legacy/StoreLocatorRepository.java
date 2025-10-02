package au.com.woolworths.feature.shop.storelocator.legacy;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.appdata.AppBuildConfig;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.foundation.shop.storelocator.network.StoreLocatorApiInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/StoreLocatorRepository;", "", "Companion", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class StoreLocatorRepository {

    /* renamed from: a, reason: collision with root package name */
    public final StoreLocatorApiInterface f8165a;
    public final AppBuildConfig b;
    public final DispatcherProvider c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/StoreLocatorRepository$Companion;", "", "", "MAX_RESULTS_QUERY_PARAM", "Ljava/lang/String;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public StoreLocatorRepository(StoreLocatorApiInterface storeLocatorApiInterface, AppBuildConfig appBuildConfig, DispatcherProvider dispatcherProvider) {
        Intrinsics.h(appBuildConfig, "appBuildConfig");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        this.f8165a = storeLocatorApiInterface;
        this.b = appBuildConfig;
        this.c = dispatcherProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable a(double r9, double r11, kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r13 instanceof au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository$fetchNearbyStores$1
            if (r0 == 0) goto L14
            r0 = r13
            au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository$fetchNearbyStores$1 r0 = (au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository$fetchNearbyStores$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.r = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository$fetchNearbyStores$1 r0 = new au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository$fetchNearbyStores$1
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.r
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.ResultKt.b(r13)
            goto L41
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            kotlin.ResultKt.b(r13)
            r7.r = r2
            r6 = 0
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r13 = r1.b(r2, r4, r6, r7)
            if (r13 != r0) goto L41
            return r0
        L41:
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 10
            int r10 = kotlin.collections.CollectionsKt.s(r13, r10)
            r9.<init>(r10)
            java.util.Iterator r10 = r13.iterator()
        L52:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L66
            java.lang.Object r11 = r10.next()
            au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult$Store r11 = (au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult.Store) r11
            au.com.woolworths.foundation.shop.storelocator.pickup.models.Store r11 = au.com.woolworths.foundation.shop.storelocator.pickup.models.StoreLocatorExtKt.a(r11)
            r9.add(r11)
            goto L52
        L66:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository.a(double, double, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(double r13, double r15, java.lang.Integer r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = r18
            boolean r2 = r0 instanceof au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository$fetchNearbyStoresLegacy$1
            if (r2 == 0) goto L16
            r2 = r0
            au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository$fetchNearbyStoresLegacy$1 r2 = (au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository$fetchNearbyStoresLegacy$1) r2
            int r3 = r2.r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.r = r3
        L14:
            r8 = r2
            goto L1c
        L16:
            au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository$fetchNearbyStoresLegacy$1 r2 = new au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository$fetchNearbyStoresLegacy$1
            r2.<init>(r12, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r8.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r8.r
            r10 = 1
            if (r2 == 0) goto L33
            if (r2 != r10) goto L2b
            kotlin.ResultKt.b(r0)
            goto L53
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L33:
            kotlin.ResultKt.b(r0)
            au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider r0 = r12.c
            r0.getClass()
            kotlinx.coroutines.scheduling.DefaultScheduler r0 = kotlinx.coroutines.Dispatchers.f24691a
            kotlinx.coroutines.scheduling.DefaultIoScheduler r11 = kotlinx.coroutines.scheduling.DefaultIoScheduler.f
            au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository$fetchNearbyStoresLegacy$2 r0 = new au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository$fetchNearbyStoresLegacy$2
            r7 = 0
            r1 = r12
            r2 = r13
            r4 = r15
            r6 = r17
            r0.<init>(r1, r2, r4, r6, r7)
            r8.r = r10
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.f(r11, r0, r8)
            if (r0 != r9) goto L53
            return r9
        L53:
            java.lang.String r1 = "withContext(...)"
            kotlin.jvm.internal.Intrinsics.g(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository.b(double, double, java.lang.Integer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r6, android.location.Location r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository$getStoreDetail$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository$getStoreDetail$1 r0 = (au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository$getStoreDetail$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository$getStoreDetail$1 r0 = new au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository$getStoreDetail$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r8)
            goto L4a
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            kotlin.ResultKt.b(r8)
            au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider r8 = r5.c
            r8.getClass()
            kotlinx.coroutines.scheduling.DefaultScheduler r8 = kotlinx.coroutines.Dispatchers.f24691a
            kotlinx.coroutines.scheduling.DefaultIoScheduler r8 = kotlinx.coroutines.scheduling.DefaultIoScheduler.f
            au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository$getStoreDetail$2 r2 = new au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository$getStoreDetail$2
            r4 = 0
            r2.<init>(r5, r6, r7, r4)
            r0.r = r3
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.f(r8, r2, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r6 = "withContext(...)"
            kotlin.jvm.internal.Intrinsics.g(r8, r6)
            au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult$Store r8 = (au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult.Store) r8
            au.com.woolworths.foundation.shop.storelocator.pickup.models.Store r6 = au.com.woolworths.foundation.shop.storelocator.pickup.models.StoreLocatorExtKt.a(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository.c(java.lang.String, android.location.Location, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
