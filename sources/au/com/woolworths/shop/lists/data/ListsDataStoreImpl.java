package au.com.woolworths.shop.lists.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.PreferencesKt;
import au.com.woolworths.base.shopapp.modules.lists.ListsDataStore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/ListsDataStoreImpl;", "Lau/com/woolworths/base/shopapp/modules/lists/ListsDataStore;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ListsDataStoreImpl implements ListsDataStore {

    /* renamed from: a, reason: collision with root package name */
    public final DataStore f12253a;

    public ListsDataStoreImpl(DataStore magicMatchDataStore) {
        Intrinsics.h(magicMatchDataStore, "magicMatchDataStore");
        this.f12253a = magicMatchDataStore;
    }

    public final Object a(Continuation continuation) {
        Object objA = PreferencesKt.a(this.f12253a, new ListsDataStoreImpl$clearDataStore$2(2, null), continuation);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.shop.lists.data.ListsDataStoreImpl$getMagicMatchOnboardingDisplayedStatus$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.shop.lists.data.ListsDataStoreImpl$getMagicMatchOnboardingDisplayedStatus$1 r0 = (au.com.woolworths.shop.lists.data.ListsDataStoreImpl$getMagicMatchOnboardingDisplayedStatus$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.data.ListsDataStoreImpl$getMagicMatchOnboardingDisplayedStatus$1 r0 = new au.com.woolworths.shop.lists.data.ListsDataStoreImpl$getMagicMatchOnboardingDisplayedStatus$1
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
            androidx.datastore.core.DataStore r5 = r4.f12253a
            kotlinx.coroutines.flow.Flow r5 = r5.getData()
            r0.r = r3
            java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt.w(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
            androidx.datastore.preferences.core.Preferences$Key r0 = au.com.woolworths.shop.lists.data.MagicMatchDataStore.Keys.f12255a
            java.lang.Object r5 = r5.b(r0)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L52
            boolean r5 = r5.booleanValue()
            goto L53
        L52:
            r5 = 0
        L53:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.ListsDataStoreImpl.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object c(SuspendLambda suspendLambda) {
        Object objA = PreferencesKt.a(this.f12253a, new ListsDataStoreImpl$setMagicMatchOnboardingDisplayedStatus$2(2, null), suspendLambda);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }
}
