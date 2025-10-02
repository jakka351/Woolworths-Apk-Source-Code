package au.com.woolworths.foundation.force.upgrade.impl;

import androidx.datastore.core.DataStore;
import au.com.woolworths.foundation.force.upgrade.data.SoftUpgradeAlertBanner;
import java.time.Clock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/impl/AppConfigRepositoryImpl;", "Lau/com/woolworths/foundation/force/upgrade/impl/AppConfigRepository;", "force-upgrade-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppConfigRepositoryImpl implements AppConfigRepository {

    /* renamed from: a, reason: collision with root package name */
    public final DataStore f8507a;
    public final DataStore b;
    public final DataStore c;
    public final Clock d;

    public AppConfigRepositoryImpl(DataStore dataStore, DataStore dataStore2, DataStore dataStore3, Clock clock) {
        this.f8507a = dataStore;
        this.b = dataStore2;
        this.c = dataStore3;
        this.d = clock;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.foundation.force.upgrade.impl.AppConfigRepositoryImpl$getStoredAppConfigNextFetchAt$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.foundation.force.upgrade.impl.AppConfigRepositoryImpl$getStoredAppConfigNextFetchAt$1 r0 = (au.com.woolworths.foundation.force.upgrade.impl.AppConfigRepositoryImpl$getStoredAppConfigNextFetchAt$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.foundation.force.upgrade.impl.AppConfigRepositoryImpl$getStoredAppConfigNextFetchAt$1 r0 = new au.com.woolworths.foundation.force.upgrade.impl.AppConfigRepositoryImpl$getStoredAppConfigNextFetchAt$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.ResultKt.b(r5)
            androidx.datastore.core.DataStore r5 = r4.c
            kotlinx.coroutines.flow.Flow r5 = r5.getData()
            r0.r = r3
            java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt.w(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
            androidx.datastore.preferences.core.Preferences$Key r0 = au.com.woolworths.foundation.force.upgrade.impl.datastore.AppConfigDataStoreKeys.a()
            java.lang.Object r5 = r5.b(r0)
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L54
            long r0 = r5.longValue()
            goto L56
        L54:
            r0 = 0
        L56:
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.force.upgrade.impl.AppConfigRepositoryImpl.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object b(SoftUpgradeAlertBanner softUpgradeAlertBanner, ContinuationImpl continuationImpl) {
        Object objA = this.b.a(new AppConfigRepositoryImpl$storeSoftUpgradeAlertBanner$2(softUpgradeAlertBanner, null), continuationImpl);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }
}
