package au.com.woolworths.foundation.shop.app.region.data;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionRepository$preLoadUserRegion$1", f = "ShopAppRegionRepository.kt", l = {46}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes.dex */
final class ShopAppRegionRepository$preLoadUserRegion$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ShopAppRegionRepository r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopAppRegionRepository$preLoadUserRegion$1(ShopAppRegionRepository shopAppRegionRepository, Continuation continuation) {
        super(2, continuation);
        this.r = shopAppRegionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ShopAppRegionRepository$preLoadUserRegion$1 shopAppRegionRepository$preLoadUserRegion$1 = new ShopAppRegionRepository$preLoadUserRegion$1(this.r, continuation);
        shopAppRegionRepository$preLoadUserRegion$1.q = obj;
        return shopAppRegionRepository$preLoadUserRegion$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShopAppRegionRepository$preLoadUserRegion$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.p
            r2 = 1
            au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionRepository r3 = r6.r
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> Lf
            goto L43
        Lf:
            r7 = move-exception
            goto L46
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            kotlin.ResultKt.b(r7)
            java.lang.Object r7 = r6.q
            kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
            android.content.Context r7 = r3.f8661a     // Catch: java.lang.Throwable -> Lf
            kotlin.reflect.KProperty[] r1 = au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionDataStoreKt.f8659a     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.h(r7, r1)     // Catch: java.lang.Throwable -> Lf
            androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate r1 = au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionDataStoreKt.b     // Catch: java.lang.Throwable -> Lf
            kotlin.reflect.KProperty[] r4 = au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionDataStoreKt.f8659a     // Catch: java.lang.Throwable -> Lf
            r5 = 0
            r4 = r4[r5]     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r7 = r1.getValue(r7, r4)     // Catch: java.lang.Throwable -> Lf
            androidx.datastore.core.DataStore r7 = (androidx.datastore.core.DataStore) r7     // Catch: java.lang.Throwable -> Lf
            kotlinx.coroutines.flow.Flow r7 = r7.getD()     // Catch: java.lang.Throwable -> Lf
            r6.p = r2     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.w(r7, r6)     // Catch: java.lang.Throwable -> Lf
            if (r7 != r0) goto L43
            return r0
        L43:
            androidx.datastore.preferences.core.Preferences r7 = (androidx.datastore.preferences.core.Preferences) r7     // Catch: java.lang.Throwable -> Lf
            goto L4a
        L46:
            kotlin.Result$Failure r7 = kotlin.ResultKt.a(r7)
        L4a:
            boolean r0 = r7 instanceof kotlin.Result.Failure
            if (r0 == 0) goto L4f
            r7 = 0
        L4f:
            androidx.datastore.preferences.core.Preferences r7 = (androidx.datastore.preferences.core.Preferences) r7
            if (r7 == 0) goto L67
            au.com.woolworths.android.onesite.modules.common.Region$Companion r0 = au.com.woolworths.android.onesite.modules.common.Region.h
            androidx.datastore.preferences.core.Preferences$Key r1 = r3.c
            java.lang.Object r7 = r7.b(r1)
            java.lang.String r7 = (java.lang.String) r7
            r0.getClass()
            au.com.woolworths.android.onesite.modules.common.Region r7 = au.com.woolworths.android.onesite.modules.common.Region.Companion.a(r7)
            if (r7 == 0) goto L67
            goto L6e
        L67:
            au.com.woolworths.foundation.shop.app.region.data.ShopAppFlavorInteractor r7 = r3.b
            r7.a()
            au.com.woolworths.android.onesite.modules.common.Region r7 = au.com.woolworths.android.onesite.modules.common.Region.i
        L6e:
            kotlinx.coroutines.flow.MutableStateFlow r0 = r3.d
        L70:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            au.com.woolworths.android.onesite.modules.common.Region r2 = (au.com.woolworths.android.onesite.modules.common.Region) r2
            boolean r1 = r0.d(r1, r7)
            if (r1 == 0) goto L70
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionRepository$preLoadUserRegion$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
