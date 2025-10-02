package au.com.woolworths.feature.shop.modeselector;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.utils.preload.PreLoader;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.geolocation.location.LocationInteractor;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/ShoppingModeInteractor;", "Lau/com/woolworths/android/onesite/utils/preload/PreLoader;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Singleton
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ShoppingModeInteractor extends PreLoader<Unit> {
    public final CollectionModeInteractor e;
    public final ShoppingModeSelectorRepository f;
    public final LocationInteractor g;
    public final ShopAccountInteractor h;

    public ShoppingModeInteractor(CollectionModeInteractor collectionModeInteractor, ShoppingModeSelectorRepository shoppingModeSelectorRepository, LocationInteractor locationInteractor, ShopAccountInteractor accountInteractor) {
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(locationInteractor, "locationInteractor");
        Intrinsics.h(accountInteractor, "accountInteractor");
        this.e = collectionModeInteractor;
        this.f = shoppingModeSelectorRepository;
        this.g = locationInteractor;
        this.h = accountInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r11 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // au.com.woolworths.android.onesite.utils.preload.PreLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object T(kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Exception {
        /*
            r10 = this;
            boolean r0 = r11 instanceof au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor$getData$1
            if (r0 == 0) goto L13
            r0 = r11
            au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor$getData$1 r0 = (au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor$getData$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor$getData$1 r0 = new au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor$getData$1
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 2
            r5 = 1
            r6 = 0
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor r7 = r10.e
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            kotlin.ResultKt.b(r11)
            goto L71
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L37:
            kotlin.ResultKt.b(r11)
            goto L60
        L3b:
            kotlin.ResultKt.b(r11)
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r11 = r7.w()
            au.com.woolworths.shop.auth.ShopAccountInteractor r2 = r10.h
            boolean r2 = r2.d()
            if (r2 == 0) goto Ld6
            boolean r11 = r11 instanceof au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode.InStore
            if (r11 == 0) goto L50
            goto Ld6
        L50:
            au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor$getData$currentLocation$1 r11 = new au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor$getData$currentLocation$1
            r11.<init>(r10, r6)
            r0.r = r5
            r8 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r11 = kotlinx.coroutines.TimeoutKt.c(r8, r11, r0)
            if (r11 != r1) goto L60
            goto L70
        L60:
            android.location.Location r11 = (android.location.Location) r11
            boolean r2 = r7.b()
            r0.r = r4
            au.com.woolworths.feature.shop.modeselector.ShoppingModeSelectorRepository r4 = r10.f
            java.lang.Object r11 = r4.a(r6, r11, r2, r0)
            if (r11 != r1) goto L71
        L70:
            return r1
        L71:
            au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelectorQueryContent r11 = (au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelectorQueryContent) r11
            au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelector r11 = r11.getF7541a()
            if (r11 == 0) goto L9f
            java.util.List r11 = r11.a()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L86:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L98
            java.lang.Object r1 = r11.next()
            boolean r2 = r1 instanceof au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection.ShoppingModeSelectorAddressInfoSection
            if (r2 == 0) goto L86
            r0.add(r1)
            goto L86
        L98:
            java.lang.Object r11 = kotlin.collections.CollectionsKt.F(r0)
            au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection$ShoppingModeSelectorAddressInfoSection r11 = (au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection.ShoppingModeSelectorAddressInfoSection) r11
            goto La0
        L9f:
            r11 = r6
        La0:
            if (r11 == 0) goto Lac
            au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelectorAddressDetails r11 = r11.getF7533a()
            if (r11 == 0) goto Lac
            au.com.woolworths.feature.shop.modeselector.model.ShoppingModeDetails r6 = r11.getG()
        Lac:
            if (r6 == 0) goto Ld6
            java.lang.String r11 = r6.getF7531a()
            r7.r(r11)
            java.lang.Integer r11 = r6.getC()
            r7.M(r11)
            java.lang.String r11 = r6.getB()
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r0 = r7.w()
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode$Delivery r1 = new au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode$Delivery
            au.com.woolworths.android.onesite.modules.collectionmode.common.DeliveryModeVariant r2 = au.com.woolworths.android.onesite.modules.collectionmode.common.DeliveryModeVariant.DeliveryNow
            r1.<init>(r2)
            boolean r0 = r0.equals(r1)
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r11 = au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionModeKt.c(r11, r0)
            r7.i(r11)
        Ld6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor.T(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object U(kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor$setInStoreShoppingMode$1
            if (r0 == 0) goto L14
            r0 = r10
            au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor$setInStoreShoppingMode$1 r0 = (au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor$setInStoreShoppingMode$1) r0
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
            au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor$setInStoreShoppingMode$1 r0 = new au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor$setInStoreShoppingMode$1
            r0.<init>(r9, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r7.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.r
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.ResultKt.b(r10)
            goto L4e
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L31:
            kotlin.ResultKt.b(r10)
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor r10 = r9.e
            java.lang.String r10 = r10.y()
            if (r10 == 0) goto L58
            r7.r = r2
            au.com.woolworths.feature.shop.modeselector.ShoppingModeSelectorRepository r1 = r9.f
            r3 = 0
            java.lang.String r4 = "INSTORE"
            r5 = 0
            r6 = 1
            r8 = 2
            r2 = r10
            java.lang.Object r10 = au.com.woolworths.feature.shop.modeselector.ShoppingModeSelectorRepository.c(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L4e
            return r0
        L4e:
            au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelectorMutationContent r10 = (au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelectorMutationContent) r10
            au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelector r10 = r10.getF7540a()
            r9.X(r10)
            goto L62
        L58:
            timber.log.Timber$Forest r10 = timber.log.Timber.f27013a
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Instore storeId is null"
            r10.o(r1, r0)
        L62:
            kotlin.Unit r10 = kotlin.Unit.f24250a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor.U(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object V(kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor$setPickupShoppingMode$1
            if (r0 == 0) goto L14
            r0 = r10
            au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor$setPickupShoppingMode$1 r0 = (au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor$setPickupShoppingMode$1) r0
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
            au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor$setPickupShoppingMode$1 r0 = new au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor$setPickupShoppingMode$1
            r0.<init>(r9, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r7.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.r
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.ResultKt.b(r10)
            goto L4d
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L31:
            kotlin.ResultKt.b(r10)
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor r10 = r9.e
            java.lang.String r3 = r10.B()
            if (r3 == 0) goto L57
            r7.r = r2
            au.com.woolworths.feature.shop.modeselector.ShoppingModeSelectorRepository r1 = r9.f
            r2 = 0
            java.lang.String r4 = "PICKUP"
            r5 = 0
            r6 = 0
            r8 = 1
            java.lang.Object r10 = au.com.woolworths.feature.shop.modeselector.ShoppingModeSelectorRepository.c(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L4d
            return r0
        L4d:
            au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelectorMutationContent r10 = (au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelectorMutationContent) r10
            au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelector r10 = r10.getF7540a()
            r9.X(r10)
            goto L61
        L57:
            timber.log.Timber$Forest r10 = timber.log.Timber.f27013a
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Store addressId is null"
            r10.o(r1, r0)
        L61:
            kotlin.Unit r10 = kotlin.Unit.f24250a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor.V(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object W(kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor$syncShoppingModePostLogin$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor$syncShoppingModePostLogin$1 r0 = (au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor$syncShoppingModePostLogin$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor$syncShoppingModePostLogin$1 r0 = new au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor$syncShoppingModePostLogin$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r5)     // Catch: java.lang.Exception -> L27
            goto L41
        L27:
            r5 = move-exception
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.b(r5)
            au.com.woolworths.feature.shop.modeselector.ShoppingModeSelectorRepository r5 = r4.f     // Catch: java.lang.Exception -> L27
            r0.r = r3     // Catch: java.lang.Exception -> L27
            r2 = 0
            r3 = 0
            java.lang.Object r5 = r5.a(r2, r2, r3, r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L41
            return r1
        L41:
            au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelectorQueryContent r5 = (au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelectorQueryContent) r5     // Catch: java.lang.Exception -> L27
            au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelector r5 = r5.getF7541a()     // Catch: java.lang.Exception -> L27
            r4.X(r5)     // Catch: java.lang.Exception -> L27
            goto L62
        L4b:
            boolean r0 = r5 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L65
            boolean r0 = r5 instanceof au.com.woolworths.android.onesite.network.ServerErrorException
            if (r0 == 0) goto L62
            au.com.woolworths.foundation.bark.Bark$Companion r0 = au.com.woolworths.foundation.bark.Bark.f8483a
            au.com.woolworths.foundation.bark.common.ReportOwner$Squad r0 = au.com.woolworths.foundation.bark.common.ReportOwner.Squad.m
            au.com.woolworths.foundation.bark.common.ReportOwner r0 = r0.a()
            java.lang.String r1 = "Error while fetching shopping mode post login"
            r2 = 8
            au.com.woolworths.foundation.bark.Bark.Barker.c(r0, r5, r1, r2)
        L62:
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        L65:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor.W(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X(au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelector r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L34
            java.util.List r5 = r5.a()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        Lf:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r5.next()
            boolean r2 = r1 instanceof au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection.ShoppingModeSelectorAddressInfoSection
            if (r2 == 0) goto Lf
            r0.add(r1)
            goto Lf
        L21:
            java.lang.Object r5 = kotlin.collections.CollectionsKt.F(r0)
            au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection$ShoppingModeSelectorAddressInfoSection r5 = (au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection.ShoppingModeSelectorAddressInfoSection) r5
            if (r5 == 0) goto L34
            au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelectorAddressDetails r5 = r5.getF7533a()
            if (r5 == 0) goto L34
            au.com.woolworths.feature.shop.modeselector.model.ShoppingModeDetails r5 = r5.getG()
            goto L35
        L34:
            r5 = 0
        L35:
            if (r5 == 0) goto L61
            java.lang.String r0 = r5.getF7531a()
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor r1 = r4.e
            r1.r(r0)
            java.lang.Integer r0 = r5.getC()
            r1.M(r0)
            java.lang.String r5 = r5.getB()
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r0 = r1.w()
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode$Delivery r2 = new au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode$Delivery
            au.com.woolworths.android.onesite.modules.collectionmode.common.DeliveryModeVariant r3 = au.com.woolworths.android.onesite.modules.collectionmode.common.DeliveryModeVariant.DeliveryNow
            r2.<init>(r3)
            boolean r0 = r0.equals(r2)
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r5 = au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionModeKt.c(r5, r0)
            r1.i(r5)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor.X(au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelector):void");
    }
}
