package au.com.woolworths.android.onesite.modules.search.searchscreen;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchTile;
import au.com.woolworths.feature.shop.ask.olive.AskOliveFeatures;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.shop.buyagain.ShopBuyAgainFeature;
import au.com.woolworths.shop.buyagain.domain.BuyAgainEntryPointInteractor;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchViewConditionsChecker;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchViewConditionsChecker {

    /* renamed from: a, reason: collision with root package name */
    public final ScreenOptions f4425a;
    public final BuyAgainEntryPointInteractor b;
    public final FeatureToggleManager c;
    public final ShopAppRegionInteractor d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[SearchTile.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SearchTile searchTile = SearchTile.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SearchTile searchTile2 = SearchTile.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                SearchTile searchTile3 = SearchTile.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                SearchTile searchTile4 = SearchTile.d;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public SearchViewConditionsChecker(ScreenOptions screenOptions, BuyAgainEntryPointInteractor buyAgainEntryPointInteractor, FeatureToggleManager featureToggleManager, ShopAppRegionInteractor shopAppRegionInteractor) {
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        this.f4425a = screenOptions;
        this.b = buyAgainEntryPointInteractor;
        this.c = featureToggleManager;
        this.d = shopAppRegionInteractor;
        final int i = 0;
        this.e = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.android.onesite.modules.search.searchscreen.i
            public final /* synthetic */ SearchViewConditionsChecker e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i) {
                    case 0:
                        zC = this.e.c.c(BaseShopAppFeature.h0);
                        break;
                    case 1:
                        zC = this.e.c.c(BaseShopAppFeature.j0);
                        break;
                    default:
                        zC = this.e.c.c(AskOliveFeatures.g);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
        final int i2 = 1;
        this.f = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.android.onesite.modules.search.searchscreen.i
            public final /* synthetic */ SearchViewConditionsChecker e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i2) {
                    case 0:
                        zC = this.e.c.c(BaseShopAppFeature.h0);
                        break;
                    case 1:
                        zC = this.e.c.c(BaseShopAppFeature.j0);
                        break;
                    default:
                        zC = this.e.c.c(AskOliveFeatures.g);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
        final int i3 = 2;
        this.g = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.android.onesite.modules.search.searchscreen.i
            public final /* synthetic */ SearchViewConditionsChecker e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i3) {
                    case 0:
                        zC = this.e.c.c(BaseShopAppFeature.h0);
                        break;
                    case 1:
                        zC = this.e.c.c(BaseShopAppFeature.j0);
                        break;
                    default:
                        zC = this.e.c.c(AskOliveFeatures.g);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
    }

    public final boolean a() {
        BuyAgainEntryPointInteractor buyAgainEntryPointInteractor = this.b;
        if (buyAgainEntryPointInteractor.f10252a.d()) {
            return (!buyAgainEntryPointInteractor.b.b() || buyAgainEntryPointInteractor.c.c(ShopBuyAgainFeature.d)) && this.f4425a.b;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchTile r10) {
        /*
            r9 = this;
            au.com.woolworths.android.onesite.modules.search.searchscreen.ScreenOptions r0 = r9.f4425a
            boolean r1 = r0.f
            boolean r2 = r0.e
            java.lang.String r3 = "searchTile"
            kotlin.jvm.internal.Intrinsics.h(r10, r3)
            int r10 = r10.ordinal()
            au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor r3 = r9.d
            kotlin.Lazy r4 = r9.e
            r5 = 0
            r6 = 1
            if (r10 == 0) goto L8c
            kotlin.Lazy r7 = r9.g
            if (r10 == r6) goto L77
            r8 = 2
            if (r10 == r8) goto L55
            r0 = 3
            if (r10 == r0) goto L44
            r0 = 4
            if (r10 != r0) goto L3e
            java.lang.Object r10 = r7.getD()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto La9
            if (r2 != 0) goto La9
            if (r1 != 0) goto La9
            au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchTile r10 = au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchTile.e
            boolean r10 = r9.b(r10)
            if (r10 != 0) goto La9
            goto La8
        L3e:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L44:
            boolean r10 = r9.a()
            if (r10 == 0) goto La9
            if (r2 != 0) goto La9
            au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchTile r10 = au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchTile.e
            boolean r10 = r9.b(r10)
            if (r10 != 0) goto La9
            goto La8
        L55:
            boolean r10 = r0.f4406a
            if (r10 == 0) goto La9
            java.lang.Object r10 = r4.getD()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto La9
            au.com.woolworths.android.onesite.modules.common.Region r10 = r3.b()
            au.com.woolworths.android.onesite.modules.common.Region r0 = au.com.woolworths.android.onesite.modules.common.Region.j
            if (r10 != r0) goto L6e
            return r5
        L6e:
            au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchTile r10 = au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchTile.d
            boolean r10 = r9.b(r10)
            if (r10 != 0) goto La9
            goto La8
        L77:
            java.lang.Object r10 = r7.getD()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto La9
            boolean r10 = r9.a()
            if (r10 == 0) goto La9
            if (r2 != 0) goto La9
            goto La8
        L8c:
            boolean r10 = r0.d
            if (r10 == 0) goto La6
            java.lang.Object r10 = r4.getD()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto La6
            au.com.woolworths.android.onesite.modules.common.Region r10 = r3.b()
            au.com.woolworths.android.onesite.modules.common.Region r0 = au.com.woolworths.android.onesite.modules.common.Region.j
            if (r10 != r0) goto La5
            goto La6
        La5:
            return r6
        La6:
            if (r1 == 0) goto La9
        La8:
            return r6
        La9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.search.searchscreen.SearchViewConditionsChecker.b(au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchTile):boolean");
    }
}
