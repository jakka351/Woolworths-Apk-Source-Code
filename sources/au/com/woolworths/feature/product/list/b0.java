package au.com.woolworths.feature.product.list;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductListViewModel e;

    public /* synthetic */ b0(ProductListViewModel productListViewModel, int i) {
        this.d = i;
        this.e = productListViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke() {
        /*
            r8 = this;
            int r0 = r8.d
            switch(r0) {
                case 0: goto L45;
                case 1: goto L36;
                case 2: goto L27;
                case 3: goto L16;
                default: goto L5;
            }
        L5:
            au.com.woolworths.feature.product.list.ProductListViewModel r0 = r8.e
            au.com.woolworths.feature.product.list.ProductListInteractor r0 = r0.e
            au.com.woolworths.feature.product.list.ProductsListRepository r0 = r0.f5251a
            android.content.SharedPreferences r0 = r0.f5265a
            java.lang.String r1 = "best_value_coach_mark_seen"
            r2 = 1
            androidx.constraintlayout.core.state.a.v(r0, r1, r2)
            kotlin.Unit r0 = kotlin.Unit.f24250a
            return r0
        L16:
            au.com.woolworths.feature.product.list.ProductListViewModel r0 = r8.e
            au.com.woolworths.feature.product.list.ProductListInteractor r0 = r0.e
            au.com.woolworths.feature.product.list.ProductsListRepository r0 = r0.f5251a
            android.content.SharedPreferences r0 = r0.f5265a
            java.lang.String r1 = "for_you_coach_mark_seen"
            r2 = 1
            androidx.constraintlayout.core.state.a.v(r0, r1, r2)
            kotlin.Unit r0 = kotlin.Unit.f24250a
            return r0
        L27:
            au.com.woolworths.feature.product.list.ProductListViewModel r0 = r8.e
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r0 = r0.j
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r1 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.q
            boolean r0 = r0.c(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L36:
            au.com.woolworths.feature.product.list.ProductListViewModel r0 = r8.e
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r0 = r0.j
            au.com.woolworths.base.shopapp.BaseShopAppFeature r1 = au.com.woolworths.base.shopapp.BaseShopAppFeature.h0
            boolean r0 = r0.c(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L45:
            au.com.woolworths.feature.product.list.ProductListViewModel r0 = r8.e
            au.com.woolworths.android.onesite.navigation.Activities$ProductList$Extras r2 = r0.q6()
            androidx.lifecycle.MediatorLiveData r1 = r0.C
            java.lang.Object r3 = r1.e()
            au.com.woolworths.feature.product.list.ProductListContract$ViewState r3 = (au.com.woolworths.feature.product.list.ProductListContract.ViewState) r3
            r4 = 0
            if (r3 == 0) goto L59
            java.lang.String r3 = r3.w
            goto L5a
        L59:
            r3 = r4
        L5a:
            java.lang.Object r5 = r1.e()
            au.com.woolworths.feature.product.list.ProductListContract$ViewState r5 = (au.com.woolworths.feature.product.list.ProductListContract.ViewState) r5
            if (r5 == 0) goto L66
            java.lang.String r5 = r5.x
            r7 = r5
            goto L67
        L66:
            r7 = r4
        L67:
            java.lang.Object r5 = r1.e()
            au.com.woolworths.feature.product.list.ProductListContract$ViewState r5 = (au.com.woolworths.feature.product.list.ProductListContract.ViewState) r5
            if (r5 == 0) goto L73
            java.util.List r5 = r5.y
            if (r5 != 0) goto L75
        L73:
            java.util.List r5 = r0.E
        L75:
            java.lang.Object r1 = r1.e()
            au.com.woolworths.feature.product.list.ProductListContract$ViewState r1 = (au.com.woolworths.feature.product.list.ProductListContract.ViewState) r1
            if (r1 == 0) goto L86
            java.util.Map r1 = r1.z
            if (r1 != 0) goto L82
            goto L86
        L82:
            r6 = r1
            r1 = r4
            r4 = r3
            goto L89
        L86:
            java.lang.Object r1 = r0.F
            goto L82
        L89:
            au.com.woolworths.feature.product.list.ProductListPaginationAdapter r3 = r0.f
            r3.d = r1
            java.util.LinkedHashMap r1 = r3.e
            r1.clear()
            au.com.woolworths.feature.product.list.ProductListPagingSource r1 = new au.com.woolworths.feature.product.list.ProductListPagingSource
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.G = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.b0.invoke():java.lang.Object");
    }
}
