package au.com.woolworths.foundation.shop.app.region.data;

import android.content.Context;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/app/region/data/ShopAppRegionRepository;", "", "app-region_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ShopAppRegionRepository {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8661a;
    public final ShopAppFlavorInteractor b;
    public final Preferences.Key c;
    public final MutableStateFlow d;
    public final StateFlow e;

    public ShopAppRegionRepository(Context context, ShopAppFlavorInteractor shopAppFlavorInteractor) throws Throwable {
        Intrinsics.h(context, "context");
        Intrinsics.h(shopAppFlavorInteractor, "shopAppFlavorInteractor");
        this.f8661a = context;
        this.b = shopAppFlavorInteractor;
        this.c = PreferencesKeys.c("region_mode_data");
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(null);
        this.d = mutableStateFlowA;
        this.e = FlowKt.b(mutableStateFlowA);
        BuildersKt.d(EmptyCoroutineContext.d, new ShopAppRegionRepository$preLoadUserRegion$1(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(au.com.woolworths.android.onesite.modules.common.Region r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionRepository$setUserRegion$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionRepository$setUserRegion$1 r0 = (au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionRepository$setUserRegion$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionRepository$setUserRegion$1 r0 = new au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionRepository$setUserRegion$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            au.com.woolworths.android.onesite.modules.common.Region r7 = r0.p
            kotlin.ResultKt.b(r8)
            goto L5b
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.ResultKt.b(r8)
            kotlin.reflect.KProperty[] r8 = au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionDataStoreKt.f8659a
            java.lang.String r8 = "<this>"
            android.content.Context r2 = r6.f8661a
            kotlin.jvm.internal.Intrinsics.h(r2, r8)
            androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate r8 = au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionDataStoreKt.b
            kotlin.reflect.KProperty[] r4 = au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionDataStoreKt.f8659a
            r5 = 0
            r4 = r4[r5]
            java.lang.Object r8 = r8.getValue(r2, r4)
            androidx.datastore.core.DataStore r8 = (androidx.datastore.core.DataStore) r8
            au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionRepository$setUserRegion$2 r2 = new au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionRepository$setUserRegion$2
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.p = r7
            r0.s = r3
            java.lang.Object r8 = androidx.datastore.preferences.core.PreferencesKt.a(r8, r2, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            androidx.datastore.preferences.core.Preferences r8 = (androidx.datastore.preferences.core.Preferences) r8
        L5d:
            kotlinx.coroutines.flow.MutableStateFlow r8 = r6.d
            java.lang.Object r0 = r8.getValue()
            r1 = r0
            au.com.woolworths.android.onesite.modules.common.Region r1 = (au.com.woolworths.android.onesite.modules.common.Region) r1
            boolean r8 = r8.d(r0, r7)
            if (r8 == 0) goto L5d
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionRepository.a(au.com.woolworths.android.onesite.modules.common.Region, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
