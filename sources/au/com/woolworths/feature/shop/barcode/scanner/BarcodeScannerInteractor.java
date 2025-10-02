package au.com.woolworths.feature.shop.barcode.scanner;

import au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.repository.PermissionFlagInteractorImpl;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.foundation.barcode.reader.models.BarcodeData;
import au.com.woolworths.foundation.shop.collectionmode.RepositoryManager;
import au.com.woolworths.product.details.ProductDetailsRepository;
import au.com.woolworths.shop.product.details.ProductDetailsPageInteractor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerInteractor;", "", "barcode-scanner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BarcodeScannerInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final PermissionFlagInteractorImpl f6646a;
    public final ProductDetailsRepository b;
    public final ProductDetailsPageInteractor c;
    public final RepositoryManager d;
    public final FeatureToggleManager e;
    public final SupportedLinksHelper f;

    public BarcodeScannerInteractor(PermissionFlagInteractorImpl permissionFlagInteractorImpl, ProductDetailsRepository productDetailsRepository, ProductDetailsPageInteractor upliftedProductDetailsInteractor, RepositoryManager repositoryManager, FeatureToggleManager featureToggleManager, SupportedLinksHelper supportedLinksHelper) {
        Intrinsics.h(upliftedProductDetailsInteractor, "upliftedProductDetailsInteractor");
        Intrinsics.h(repositoryManager, "repositoryManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f6646a = permissionFlagInteractorImpl;
        this.b = productDetailsRepository;
        this.c = upliftedProductDetailsInteractor;
        this.d = repositoryManager;
        this.e = featureToggleManager;
        this.f = supportedLinksHelper;
    }

    public final Object a(BarcodeData barcodeData, Continuation continuation) {
        return this.b.a(null, barcodeData, this.d.f(), this.e.c(BaseShopAppFeature.N) ? this.f.a() : null, (SuspendLambda) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(au.com.woolworths.foundation.barcode.reader.models.BarcodeData r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerInteractor$fetchUpliftedProductDetailsByBarcode$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerInteractor$fetchUpliftedProductDetailsByBarcode$1 r0 = (au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerInteractor$fetchUpliftedProductDetailsByBarcode$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerInteractor$fetchUpliftedProductDetailsByBarcode$1 r0 = new au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerInteractor$fetchUpliftedProductDetailsByBarcode$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r6)
            au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper r6 = r4.f
            java.util.List r6 = r6.a()
            r0.r = r3
            au.com.woolworths.shop.product.details.ProductDetailsPageInteractor r2 = r4.c
            java.lang.Object r6 = r2.d(r6, r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            au.com.woolworths.shop.product.details.data.ProductDetailsPage r6 = (au.com.woolworths.shop.product.details.data.ProductDetailsPage) r6
            au.com.woolworths.product.models.ProductCard r5 = au.com.woolworths.shop.product.details.data.ProductDetailsPageKt.a(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerInteractor.b(au.com.woolworths.foundation.barcode.reader.models.BarcodeData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
