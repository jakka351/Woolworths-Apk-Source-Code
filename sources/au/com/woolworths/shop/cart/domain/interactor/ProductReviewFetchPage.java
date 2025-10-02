package au.com.woolworths.shop.cart.domain.interactor;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.cart.data.ProductReviewDataRepository;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/domain/interactor/ProductReviewFetchPage;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductReviewFetchPage {

    /* renamed from: a, reason: collision with root package name */
    public final ProductReviewDataRepository f10429a;

    public ProductReviewFetchPage(ProductReviewDataRepository productReviewDataRepository) {
        this.f10429a = productReviewDataRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(au.com.woolworths.android.onesite.navigation.Activities.ProductsReviewActivity.Source r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.shop.cart.domain.interactor.ProductReviewFetchPage$invoke$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.shop.cart.domain.interactor.ProductReviewFetchPage$invoke$1 r0 = (au.com.woolworths.shop.cart.domain.interactor.ProductReviewFetchPage$invoke$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.cart.domain.interactor.ProductReviewFetchPage$invoke$1 r0 = new au.com.woolworths.shop.cart.domain.interactor.ProductReviewFetchPage$invoke$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Exception -> L27
            goto L3f
        L27:
            r5 = move-exception
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r6)
            au.com.woolworths.shop.cart.data.ProductReviewDataRepository r6 = r4.f10429a     // Catch: java.lang.Exception -> L27
            r0.r = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r6 = r6.a(r5, r0)     // Catch: java.lang.Exception -> L27
            if (r6 != r1) goto L3f
            return r1
        L3f:
            au.com.woolworths.shop.cart.domain.model.PageResult$Success r5 = new au.com.woolworths.shop.cart.domain.model.PageResult$Success     // Catch: java.lang.Exception -> L27
            r5.<init>(r6)     // Catch: java.lang.Exception -> L27
            return r5
        L45:
            au.com.woolworths.shop.cart.domain.model.PageResult$Fail r6 = new au.com.woolworths.shop.cart.domain.model.PageResult$Fail
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.cart.domain.interactor.ProductReviewFetchPage.a(au.com.woolworths.android.onesite.navigation.Activities$ProductsReviewActivity$Source, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
