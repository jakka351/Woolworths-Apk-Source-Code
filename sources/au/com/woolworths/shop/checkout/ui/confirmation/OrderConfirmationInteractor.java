package au.com.woolworths.shop.checkout.ui.confirmation;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.shop.checkout.data.source.OrderConfirmationRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationInteractor;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class OrderConfirmationInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final OrderConfirmationRepository f10721a;
    public final CollectionModeInteractor b;
    public final GoogleAdManagerInteractor c;
    public final FeatureToggleManager d;

    public OrderConfirmationInteractor(OrderConfirmationRepository orderConfirmationRepository, CollectionModeInteractor collectionModeInteractor, GoogleAdManagerInteractor googleAdManagerInteractor, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(googleAdManagerInteractor, "googleAdManagerInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f10721a = orderConfirmationRepository;
        this.b = collectionModeInteractor;
        this.c = googleAdManagerInteractor;
        this.d = featureToggleManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationInteractor.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable b(au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmation r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationInteractor$updateOrderConfirmationContents$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationInteractor$updateOrderConfirmationContents$1 r0 = (au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationInteractor$updateOrderConfirmationContents$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationInteractor$updateOrderConfirmationContents$1 r0 = new au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationInteractor$updateOrderConfirmationContents$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 10
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.ResultKt.b(r8)
            goto L6e
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.ResultKt.b(r8)
            java.util.List r7 = r7.f10649a
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            int r2 = kotlin.collections.CollectionsKt.s(r7, r3)
            r8.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
        L45:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L62
            java.lang.Object r2 = r7.next()
            au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent r2 = (au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent) r2
            boolean r5 = r2 instanceof au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent.DynamicSizeAdBannerData
            if (r5 == 0) goto L59
            r5 = r2
            au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent$DynamicSizeAdBannerData r5 = (au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent.DynamicSizeAdBannerData) r5
            goto L5a
        L59:
            r5 = 0
        L5a:
            if (r5 == 0) goto L5e
            au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData r2 = r5.f10650a
        L5e:
            r8.add(r2)
            goto L45
        L62:
            r0.r = r4
            au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor r7 = r6.c
            r2 = 6
            java.io.Serializable r8 = au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor.j(r7, r8, r0, r2)
            if (r8 != r1) goto L6e
            return r1
        L6e:
            java.util.List r8 = (java.util.List) r8
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r7 = new java.util.ArrayList
            int r0 = kotlin.collections.CollectionsKt.s(r8, r3)
            r7.<init>(r0)
            java.util.Iterator r8 = r8.iterator()
        L7f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto La1
            java.lang.Object r0 = r8.next()
            boolean r1 = r0 instanceof au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData
            if (r1 == 0) goto L95
            au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent$DynamicSizeAdBannerData r1 = new au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent$DynamicSizeAdBannerData
            au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData r0 = (au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData) r0
            r1.<init>(r0)
            goto L9d
        L95:
            java.lang.String r1 = "null cannot be cast to non-null type au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent"
            kotlin.jvm.internal.Intrinsics.f(r0, r1)
            r1 = r0
            au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent r1 = (au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent) r1
        L9d:
            r7.add(r1)
            goto L7f
        La1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationInteractor.b(au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmation, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable c(au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmation r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationInteractor$updateOrderConfirmationWithBanners$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationInteractor$updateOrderConfirmationWithBanners$1 r0 = (au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationInteractor$updateOrderConfirmationWithBanners$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationInteractor$updateOrderConfirmationWithBanners$1 r0 = new au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationInteractor$updateOrderConfirmationWithBanners$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 10
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.ResultKt.b(r8)
            goto L73
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.ResultKt.b(r8)
            java.util.List r7 = r7.f10649a
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            int r2 = kotlin.collections.CollectionsKt.s(r7, r3)
            r8.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
        L45:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L66
            java.lang.Object r2 = r7.next()
            au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent r2 = (au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent) r2
            boolean r5 = r2 instanceof au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent.DynamicSizeAdBannerData
            if (r5 == 0) goto L5a
            au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent$DynamicSizeAdBannerData r2 = (au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent.DynamicSizeAdBannerData) r2
            au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData r2 = r2.f10650a
            goto L62
        L5a:
            boolean r5 = r2 instanceof au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent.UniversalInventoryContainer
            if (r5 == 0) goto L62
            au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent$UniversalInventoryContainer r2 = (au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent.UniversalInventoryContainer) r2
            au.com.woolworths.foundation.advertising.data.google.model.UniversalInventoryContainerData r2 = r2.f10651a
        L62:
            r8.add(r2)
            goto L45
        L66:
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer r7 = au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer.h
            r0.r = r4
            au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor r2 = r6.c
            java.io.Serializable r8 = r2.k(r8, r7, r4, r0)
            if (r8 != r1) goto L73
            return r1
        L73:
            java.util.List r8 = (java.util.List) r8
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r7 = new java.util.ArrayList
            int r0 = kotlin.collections.CollectionsKt.s(r8, r3)
            r7.<init>(r0)
            java.util.Iterator r8 = r8.iterator()
        L84:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto La6
            java.lang.Object r0 = r8.next()
            boolean r1 = r0 instanceof au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData
            if (r1 == 0) goto L9a
            au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent$DynamicSizeAdBannerData r1 = new au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent$DynamicSizeAdBannerData
            au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData r0 = (au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData) r0
            r1.<init>(r0)
            goto La2
        L9a:
            java.lang.String r1 = "null cannot be cast to non-null type au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent"
            kotlin.jvm.internal.Intrinsics.f(r0, r1)
            r1 = r0
            au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent r1 = (au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent) r1
        La2:
            r7.add(r1)
            goto L84
        La6:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationInteractor.c(au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmation, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }
}
