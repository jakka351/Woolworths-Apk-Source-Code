package au.com.woolworths.feature.shop.marketplace.ui.marketplace;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.marketplace.data.models.Marketplace;
import au.com.woolworths.feature.shop.marketplace.data.source.MarketplaceRepositoryImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplaceInteractor;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MarketplaceInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final MarketplaceRepositoryImpl f7495a;
    public Marketplace b;
    public Marketplace c;

    public MarketplaceInteractor(MarketplaceRepositoryImpl marketplaceRepositoryImpl) {
        this.f7495a = marketplaceRepositoryImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceInteractor$fetchMarketplaceBrands$2
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceInteractor$fetchMarketplaceBrands$2 r0 = (au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceInteractor$fetchMarketplaceBrands$2) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceInteractor$fetchMarketplaceBrands$2 r0 = new au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceInteractor$fetchMarketplaceBrands$2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L40
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.ResultKt.b(r5)
            r0.r = r3
            au.com.woolworths.shop.graphql.type.MarketplaceLandingPageName r5 = au.com.woolworths.shop.graphql.type.MarketplaceLandingPageName.j
            r2 = 0
            au.com.woolworths.feature.shop.marketplace.data.source.MarketplaceRepositoryImpl r3 = r4.f7495a
            java.lang.Object r5 = r3.a(r5, r2, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            r0 = r5
            au.com.woolworths.feature.shop.marketplace.data.models.Marketplace r0 = (au.com.woolworths.feature.shop.marketplace.data.models.Marketplace) r0
            r4.b = r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceInteractor.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceInteractor$fetchMarketplaceSellers$2
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceInteractor$fetchMarketplaceSellers$2 r0 = (au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceInteractor$fetchMarketplaceSellers$2) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceInteractor$fetchMarketplaceSellers$2 r0 = new au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceInteractor$fetchMarketplaceSellers$2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L40
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.ResultKt.b(r5)
            r0.r = r3
            au.com.woolworths.shop.graphql.type.MarketplaceLandingPageName r5 = au.com.woolworths.shop.graphql.type.MarketplaceLandingPageName.k
            r2 = 0
            au.com.woolworths.feature.shop.marketplace.data.source.MarketplaceRepositoryImpl r3 = r4.f7495a
            java.lang.Object r5 = r3.a(r5, r2, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            r0 = r5
            au.com.woolworths.feature.shop.marketplace.data.models.Marketplace r0 = (au.com.woolworths.feature.shop.marketplace.data.models.Marketplace) r0
            r4.c = r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceInteractor.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
