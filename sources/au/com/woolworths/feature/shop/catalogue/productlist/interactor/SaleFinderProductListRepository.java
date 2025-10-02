package au.com.woolworths.feature.shop.catalogue.productlist.interactor;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.catalogue.CatalogueApiInterface;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/interactor/SaleFinderProductListRepository;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SaleFinderProductListRepository {

    /* renamed from: a, reason: collision with root package name */
    public final CatalogueApiInterface f6946a;

    public SaleFinderProductListRepository(CatalogueApiInterface catalogueApiInterface) {
        this.f6946a = catalogueApiInterface;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof au.com.woolworths.feature.shop.catalogue.productlist.interactor.SaleFinderProductListRepository$fetchCatalogueProductDetailsList$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.feature.shop.catalogue.productlist.interactor.SaleFinderProductListRepository$fetchCatalogueProductDetailsList$1 r0 = (au.com.woolworths.feature.shop.catalogue.productlist.interactor.SaleFinderProductListRepository$fetchCatalogueProductDetailsList$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.catalogue.productlist.interactor.SaleFinderProductListRepository$fetchCatalogueProductDetailsList$1 r0 = new au.com.woolworths.feature.shop.catalogue.productlist.interactor.SaleFinderProductListRepository$fetchCatalogueProductDetailsList$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r7)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r7)
            r0.r = r3
            au.com.woolworths.feature.shop.catalogue.CatalogueApiInterface r7 = r4.f6946a
            java.lang.Object r7 = r7.c(r5, r6, r0)
            if (r7 != r1) goto L3d
            return r1
        L3d:
            retrofit2.Response r7 = (retrofit2.Response) r7
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.h(r7, r5)
            okhttp3.Response r5 = r7.f27002a
            boolean r6 = r5.s
            if (r6 == 0) goto L55
            java.lang.Object r5 = r7.b
            if (r5 == 0) goto L4f
            goto L66
        L4f:
            retrofit2.HttpException r5 = new retrofit2.HttpException
            r5.<init>(r7)
            throw r5
        L55:
            int r5 = r5.g
            r6 = 404(0x194, float:5.66E-43)
            if (r5 != r6) goto L67
            okhttp3.ResponseBody r5 = r7.c
            if (r5 == 0) goto L67
            au.com.woolworths.feature.shop.catalogue.productlist.model.CatalogueProductDetailsListInfo r5 = new au.com.woolworths.feature.shop.catalogue.productlist.model.CatalogueProductDetailsListInfo
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.d
            r5.<init>(r6)
        L66:
            return r5
        L67:
            retrofit2.HttpException r5 = new retrofit2.HttpException
            r5.<init>(r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.catalogue.productlist.interactor.SaleFinderProductListRepository.a(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
