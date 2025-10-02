package au.com.woolworths.feature.shop.catalogue.productlist;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.feature.shop.catalogue.productlist.interactor.ConsolidatedProductListInteractor;
import au.com.woolworths.feature.shop.catalogue.productlist.model.ProductList;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListInteractor;", "", "NoTrolleyResultException", "LoadData", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CatalogueProductListInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final ConsolidatedProductListInteractor f6917a;
    public final CollectionModeInteractor b;
    public final TrolleyInteractor c;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListInteractor$LoadData;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LoadData {

        /* renamed from: a, reason: collision with root package name */
        public final ProductList f6918a;
        public final TrolleyResult b;

        public LoadData(ProductList productList, TrolleyResult trolleyResult) {
            Intrinsics.h(productList, "productList");
            this.f6918a = productList;
            this.b = trolleyResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadData)) {
                return false;
            }
            LoadData loadData = (LoadData) obj;
            return Intrinsics.c(this.f6918a, loadData.f6918a) && Intrinsics.c(this.b, loadData.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6918a.hashCode() * 31);
        }

        public final String toString() {
            return "LoadData(productList=" + this.f6918a + ", trolleyResult=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListInteractor$NoTrolleyResultException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoTrolleyResultException extends Exception {
        public static final NoTrolleyResultException d = new NoTrolleyResultException();
    }

    public CatalogueProductListInteractor(ConsolidatedProductListInteractor consolidatedProductListInteractor, CollectionModeInteractor collectionModeInteractor, TrolleyInteractor trolleyInteractor) {
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(trolleyInteractor, "trolleyInteractor");
        this.f6917a = consolidatedProductListInteractor;
        this.b = collectionModeInteractor;
        this.c = trolleyInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0092, code lost:
    
        if (r14 != r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r11, java.lang.String r12, java.lang.String r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListInteractor$loadData$1
            if (r0 == 0) goto L13
            r0 = r14
            au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListInteractor$loadData$1 r0 = (au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListInteractor$loadData$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListInteractor$loadData$1 r0 = new au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListInteractor$loadData$1
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 0
            r4 = 1
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r2 == 0) goto L4d
            if (r2 == r9) goto L49
            if (r2 == r8) goto L43
            if (r2 == r7) goto L3d
            if (r2 != r6) goto L35
            au.com.woolworths.feature.shop.catalogue.productlist.model.ProductList r11 = r0.p
            kotlin.ResultKt.b(r14)
            goto L95
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3d:
            au.com.woolworths.feature.shop.catalogue.productlist.model.ProductList r11 = r0.p
            kotlin.ResultKt.b(r14)
            goto L85
        L43:
            au.com.woolworths.feature.shop.catalogue.productlist.model.ProductList r11 = r0.p
            kotlin.ResultKt.b(r14)
            goto L6e
        L49:
            kotlin.ResultKt.b(r14)
            goto L5b
        L4d:
            kotlin.ResultKt.b(r14)
            r0.s = r9
            au.com.woolworths.feature.shop.catalogue.productlist.interactor.ConsolidatedProductListInteractor r14 = r10.f6917a
            java.lang.Object r14 = r14.a(r11, r12, r13, r0)
            if (r14 != r1) goto L5b
            goto L94
        L5b:
            r11 = r14
            au.com.woolworths.feature.shop.catalogue.productlist.model.ProductList r11 = (au.com.woolworths.feature.shop.catalogue.productlist.model.ProductList) r11
            r0.p = r11
            r0.s = r8
            au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListInteractor$lastTrolleyResultOrNull$2 r12 = new au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListInteractor$lastTrolleyResultOrNull$2
            r12.<init>(r10, r3)
            java.lang.Object r14 = kotlinx.coroutines.TimeoutKt.c(r4, r12, r0)
            if (r14 != r1) goto L6e
            goto L94
        L6e:
            au.com.woolworths.android.onesite.models.TrolleyResult r14 = (au.com.woolworths.android.onesite.models.TrolleyResult) r14
            if (r14 == 0) goto L78
            au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListInteractor$LoadData r12 = new au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListInteractor$LoadData
            r12.<init>(r11, r14)
            return r12
        L78:
            r0.p = r11
            r0.s = r7
            au.com.woolworths.base.shopapp.TrolleyInteractor r12 = r10.c
            java.lang.Object r12 = r12.u(r0)
            if (r12 != r1) goto L85
            goto L94
        L85:
            r0.p = r11
            r0.s = r6
            au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListInteractor$lastTrolleyResultOrNull$2 r12 = new au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListInteractor$lastTrolleyResultOrNull$2
            r12.<init>(r10, r3)
            java.lang.Object r14 = kotlinx.coroutines.TimeoutKt.c(r4, r12, r0)
            if (r14 != r1) goto L95
        L94:
            return r1
        L95:
            au.com.woolworths.android.onesite.models.TrolleyResult r14 = (au.com.woolworths.android.onesite.models.TrolleyResult) r14
            if (r14 == 0) goto L9f
            au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListInteractor$LoadData r12 = new au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListInteractor$LoadData
            r12.<init>(r11, r14)
            return r12
        L9f:
            au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListInteractor$NoTrolleyResultException r11 = au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListInteractor.NoTrolleyResultException.d
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListInteractor.a(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
