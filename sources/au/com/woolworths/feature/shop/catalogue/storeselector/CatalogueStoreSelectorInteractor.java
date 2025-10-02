package au.com.woolworths.feature.shop.catalogue.storeselector;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.catalogue.CatalogueApiInterface;
import au.com.woolworths.feature.shop.catalogue.CatalogueConfigInteractorImpl;
import au.com.woolworths.feature.shop.catalogue.CatalogueStoreInteractor;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/storeselector/CatalogueStoreSelectorInteractor;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CatalogueStoreSelectorInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final CatalogueApiInterface f6952a;
    public final CatalogueStoreInteractor b;

    public CatalogueStoreSelectorInteractor(CatalogueApiInterface catalogueApiInterface, CatalogueConfigInteractorImpl catalogueConfigInteractorImpl, CatalogueStoreInteractor catalogueStoreInteractor) {
        this.f6952a = catalogueApiInterface;
        this.b = catalogueStoreInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws au.com.woolworths.android.onesite.network.NoConnectivityException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorInteractor$searchForMatchingStore$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorInteractor$searchForMatchingStore$1 r0 = (au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorInteractor$searchForMatchingStore$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorInteractor$searchForMatchingStore$1 r0 = new au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorInteractor$searchForMatchingStore$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r6)     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            goto L43
        L27:
            r5 = move-exception
            goto L73
        L29:
            r5 = move-exception
            goto L84
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.b(r6)
            au.com.woolworths.feature.shop.catalogue.CatalogueApiInterface r6 = r4.f6952a     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            java.lang.String r2 = "126"
            r0.r = r3     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            java.lang.Object r6 = r6.a(r2, r5, r0)     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            if (r6 != r1) goto L43
            return r1
        L43:
            retrofit2.Response r6 = (retrofit2.Response) r6     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.h(r6, r5)     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            okhttp3.Response r5 = r6.f27002a     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            boolean r0 = r5.s     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            if (r0 == 0) goto L5b
            java.lang.Object r5 = r6.b     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            if (r5 == 0) goto L55
            goto L6c
        L55:
            retrofit2.HttpException r5 = new retrofit2.HttpException     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            r5.<init>(r6)     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            throw r5     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
        L5b:
            int r5 = r5.g     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            r0 = 404(0x194, float:5.66E-43)
            if (r5 != r0) goto L6d
            okhttp3.ResponseBody r5 = r6.c     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            if (r5 == 0) goto L6d
            au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreSearchListInfo r5 = new au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreSearchListInfo     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.d     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            r5.<init>(r6)     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
        L6c:
            return r5
        L6d:
            retrofit2.HttpException r5 = new retrofit2.HttpException     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            r5.<init>(r6)     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            throw r5     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
        L73:
            au.com.woolworths.android.onesite.network.ServerError r6 = new au.com.woolworths.android.onesite.network.ServerError
            au.com.woolworths.android.onesite.network.ServerErrorCode r0 = au.com.woolworths.android.onesite.network.ServerErrorCode.e
            java.lang.String r1 = r5.getMessage()
            r6.<init>(r0, r1)
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = new au.com.woolworths.android.onesite.network.ServerErrorException
            r0.<init>(r6, r5)
            throw r0
        L84:
            au.com.woolworths.android.onesite.network.NoConnectivityException r6 = new au.com.woolworths.android.onesite.network.NoConnectivityException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorInteractor.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
