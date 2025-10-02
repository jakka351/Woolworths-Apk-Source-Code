package au.com.woolworths.shop.product.details;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeTypeDataKt;
import au.com.woolworths.base.shopapp.remoteconfig.ShopRemoteConfig;
import au.com.woolworths.foundation.barcode.reader.models.BarcodeData;
import au.com.woolworths.foundation.barcode.reader.models.BarcodeSymbology;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.shop.graphql.type.BarcodeType;
import au.com.woolworths.shop.graphql.type.MarketplaceShippingInfo;
import au.com.woolworths.shop.graphql.type.ProductDetailsPageInput;
import au.com.woolworths.shop.graphql.type.ShoppingModeType;
import au.com.woolworths.shop.product.details.data.FooterButtonAction;
import com.apollographql.apollo.api.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsPageInteractorImpl;", "Lau/com/woolworths/shop/product/details/ProductDetailsPageInteractor;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductDetailsPageInteractorImpl implements ProductDetailsPageInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final ProductDetailsPageRepository f12589a;
    public final CollectionModeInteractor b;
    public final MutableStateFlow c;
    public final StateFlow d;
    public final int e;

    public ProductDetailsPageInteractorImpl(ProductDetailsPageRepository productDetailsPageRepository, CollectionModeInteractor collectionModeInteractor, FeatureToggleManager featureToggleManager) {
        int iIntValue;
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f12589a = productDetailsPageRepository;
        this.b = collectionModeInteractor;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(null);
        this.c = mutableStateFlowA;
        this.d = mutableStateFlowA;
        Integer numI0 = StringsKt.i0(featureToggleManager.e(ShopRemoteConfig.l, false));
        if (numI0 != null) {
            iIntValue = numI0.intValue();
        } else {
            Bark.Companion companion = Bark.f8483a;
            Bark.Barker.c(new ReportOwner(ReportOwner.Squad.q), new IllegalStateException("Retry value cannot be null"), null, 12);
            iIntValue = 3;
        }
        this.e = iIntValue;
    }

    @Override // au.com.woolworths.shop.product.details.ProductDetailsPageInteractor
    public final void a() {
        this.c.setValue(null);
    }

    @Override // au.com.woolworths.shop.product.details.ProductDetailsPageInteractor
    /* renamed from: b, reason: from getter */
    public final StateFlow getD() {
        return this.d;
    }

    @Override // au.com.woolworths.shop.product.details.ProductDetailsPageInteractor
    public final Object c(String str, List list, BarcodeData barcodeData, String str2, String str3, ContinuationImpl continuationImpl) {
        BarcodeType barcodeType;
        Optional optionalA = Optional.Companion.a(str);
        CollectionModeInteractor collectionModeInteractor = this.b;
        MarketplaceShippingInfo marketplaceShippingInfo = null;
        Optional optionalA2 = Optional.Companion.a(collectionModeInteractor.b() ? collectionModeInteractor.a() : null);
        ShoppingModeType shoppingModeTypeA = ShoppingModeTypeDataKt.a(collectionModeInteractor.w());
        Optional optionalA3 = Optional.Companion.a(barcodeData != null ? barcodeData.f8476a : null);
        if (barcodeData != null) {
            BarcodeSymbology barcodeSymbology = barcodeData.b;
            HashMap map = ProductDetailsPageInteractorKt.f12590a;
            int iOrdinal = barcodeSymbology.ordinal();
            if (iOrdinal == 0) {
                barcodeType = BarcodeType.f;
            } else if (iOrdinal == 1) {
                barcodeType = BarcodeType.l;
            } else if (iOrdinal == 2) {
                barcodeType = BarcodeType.g;
            } else if (iOrdinal == 3) {
                barcodeType = BarcodeType.k;
            } else if (iOrdinal == 5) {
                barcodeType = BarcodeType.j;
            } else if (iOrdinal == 11) {
                barcodeType = BarcodeType.i;
            } else if (iOrdinal != 12) {
                switch (iOrdinal) {
                    case 18:
                        barcodeType = BarcodeType.n;
                        break;
                    case 19:
                        barcodeType = BarcodeType.m;
                        break;
                    case 20:
                        barcodeType = BarcodeType.o;
                        break;
                    default:
                        barcodeType = BarcodeType.f;
                        break;
                }
            } else {
                barcodeType = BarcodeType.h;
            }
        } else {
            barcodeType = null;
        }
        Optional optionalA4 = Optional.Companion.a(barcodeType);
        if (list == null) {
            list = EmptyList.d;
        }
        List list2 = list;
        List list3 = FooterButtonAction.m;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((AbstractList) list3).iterator();
        while (it.hasNext()) {
            String str4 = ((FooterButtonAction) it.next()).d;
            if (str4 != null) {
                arrayList.add(str4);
            }
        }
        if (str2 != null && str3 != null) {
            marketplaceShippingInfo = new MarketplaceShippingInfo(Optional.Companion.a(str2), Optional.Companion.a(str3));
        }
        return this.f12589a.b(new ProductDetailsPageInput(optionalA, optionalA3, optionalA4, Optional.Companion.a(marketplaceShippingInfo), shoppingModeTypeA, optionalA2, arrayList, list2), collectionModeInteractor.b(), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // au.com.woolworths.shop.product.details.ProductDetailsPageInteractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.util.List r9, au.com.woolworths.foundation.barcode.reader.models.BarcodeData r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof au.com.woolworths.shop.product.details.ProductDetailsPageInteractorImpl$fetchAndCacheProductDetailsPage$1
            if (r0 == 0) goto L14
            r0 = r11
            au.com.woolworths.shop.product.details.ProductDetailsPageInteractorImpl$fetchAndCacheProductDetailsPage$1 r0 = (au.com.woolworths.shop.product.details.ProductDetailsPageInteractorImpl$fetchAndCacheProductDetailsPage$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.r = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            au.com.woolworths.shop.product.details.ProductDetailsPageInteractorImpl$fetchAndCacheProductDetailsPage$1 r0 = new au.com.woolworths.shop.product.details.ProductDetailsPageInteractorImpl$fetchAndCacheProductDetailsPage$1
            r0.<init>(r8, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r7.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.r
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            kotlin.ResultKt.b(r11)
            r1 = r8
            goto L44
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            kotlin.ResultKt.b(r11)
            r7.r = r2
            r2 = 0
            r5 = 0
            r6 = 0
            r1 = r8
            r3 = r9
            r4 = r10
            java.lang.Object r11 = r1.c(r2, r3, r4, r5, r6, r7)
            if (r11 != r0) goto L44
            return r0
        L44:
            r9 = r11
            au.com.woolworths.shop.product.details.data.ProductDetailsPage r9 = (au.com.woolworths.shop.product.details.data.ProductDetailsPage) r9
            kotlinx.coroutines.flow.MutableStateFlow r10 = r1.c
            r10.setValue(r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.product.details.ProductDetailsPageInteractorImpl.d(java.util.List, au.com.woolworths.foundation.barcode.reader.models.BarcodeData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:32|(1:34)(1:35)|67|36|(1:38)|41|(4:44|(3:73|46|76)(1:75)|74|42)|72|(1:48)(1:50)|49|51|(3:54|55|(1:57)(2:60|61))|59) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
    
        r6 = r1;
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
    
        r6 = r1;
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011d, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(500, r4) == r5) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0100 A[Catch: NoConnectivityException -> 0x003d, ServerErrorException -> 0x0040, TryCatch #3 {NoConnectivityException -> 0x003d, ServerErrorException -> 0x0040, blocks: (B:13:0x0037, B:55:0x00fc, B:57:0x0100, B:60:0x0120, B:20:0x0053), top: B:69:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0120 A[Catch: NoConnectivityException -> 0x003d, ServerErrorException -> 0x0040, TRY_LEAVE, TryCatch #3 {NoConnectivityException -> 0x003d, ServerErrorException -> 0x0040, blocks: (B:13:0x0037, B:55:0x00fc, B:57:0x0100, B:60:0x0120, B:20:0x0053), top: B:69:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x011d -> B:14:0x003a). Please report as a decompilation issue!!! */
    @Override // au.com.woolworths.shop.product.details.ProductDetailsPageInteractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r17, java.util.List r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.product.details.ProductDetailsPageInteractorImpl.e(java.lang.String, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
