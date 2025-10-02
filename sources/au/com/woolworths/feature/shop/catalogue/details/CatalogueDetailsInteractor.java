package au.com.woolworths.feature.shop.catalogue.details;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.catalogue.CatalogueApiInterface;
import au.com.woolworths.feature.shop.catalogue.CatalogueStoreInteractor;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsInteractor;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CatalogueDetailsInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final CatalogueStoreInteractor f6826a;
    public final CatalogueApiInterface b;

    public CatalogueDetailsInteractor(CatalogueStoreInteractor catalogueStoreInteractor, CatalogueApiInterface catalogueApiInterface) {
        this.f6826a = catalogueStoreInteractor;
        this.b = catalogueApiInterface;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsException.NoConnectivityException, au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsException.ServerException {
        /*
            r4 = this;
            boolean r0 = r7 instanceof au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsInteractor$fetchCatalogue$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsInteractor$fetchCatalogue$1 r0 = (au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsInteractor$fetchCatalogue$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsInteractor$fetchCatalogue$1 r0 = new au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsInteractor$fetchCatalogue$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Exception -> L27
            goto L41
        L27:
            r5 = move-exception
            goto L73
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r7)
            au.com.woolworths.feature.shop.catalogue.CatalogueApiInterface r7 = r4.b     // Catch: java.lang.Exception -> L27
            r0.r = r3     // Catch: java.lang.Exception -> L27
            r2 = 960(0x3c0, float:1.345E-42)
            java.lang.Object r7 = r7.b(r5, r6, r2, r0)     // Catch: java.lang.Exception -> L27
            if (r7 != r1) goto L41
            return r1
        L41:
            retrofit2.Response r7 = (retrofit2.Response) r7     // Catch: java.lang.Exception -> L27
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.h(r7, r5)     // Catch: java.lang.Exception -> L27
            okhttp3.Response r5 = r7.f27002a     // Catch: java.lang.Exception -> L27
            boolean r6 = r5.s     // Catch: java.lang.Exception -> L27
            if (r6 == 0) goto L59
            java.lang.Object r5 = r7.b     // Catch: java.lang.Exception -> L27
            if (r5 == 0) goto L53
            goto L6c
        L53:
            retrofit2.HttpException r5 = new retrofit2.HttpException     // Catch: java.lang.Exception -> L27
            r5.<init>(r7)     // Catch: java.lang.Exception -> L27
            throw r5     // Catch: java.lang.Exception -> L27
        L59:
            int r5 = r5.g     // Catch: java.lang.Exception -> L27
            r6 = 404(0x194, float:5.66E-43)
            if (r5 != r6) goto L6d
            okhttp3.ResponseBody r5 = r7.c     // Catch: java.lang.Exception -> L27
            if (r5 == 0) goto L6d
            au.com.woolworths.feature.shop.catalogue.models.CatalogueSaleDetailInfo r5 = new au.com.woolworths.feature.shop.catalogue.models.CatalogueSaleDetailInfo     // Catch: java.lang.Exception -> L27
            java.lang.String r6 = ""
            kotlin.collections.EmptyList r7 = kotlin.collections.EmptyList.d     // Catch: java.lang.Exception -> L27
            r5.<init>(r6, r7)     // Catch: java.lang.Exception -> L27
        L6c:
            return r5
        L6d:
            retrofit2.HttpException r5 = new retrofit2.HttpException     // Catch: java.lang.Exception -> L27
            r5.<init>(r7)     // Catch: java.lang.Exception -> L27
            throw r5     // Catch: java.lang.Exception -> L27
        L73:
            boolean r6 = r5 instanceof au.com.woolworths.android.onesite.network.NoConnectivityException
            if (r6 == 0) goto L7d
            au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsException$NoConnectivityException r6 = new au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsException$NoConnectivityException
            r6.<init>(r5)
            throw r6
        L7d:
            au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsException$ServerException r6 = new au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsException$ServerException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsInteractor.a(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
