package au.com.woolworths.feature.shop.barcode.scanner;

import android.os.Parcelable;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorCode;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerContract;
import au.com.woolworths.feature.shop.barcode.scanner.analytics.BarcodeScannerScreenActionData;
import au.com.woolworths.foundation.barcode.reader.models.BarcodeData;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.details.models.ProductDetailsData;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.LambdaObserver;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerViewModel$onBarcodeDetectedLegacy$1", f = "BarcodeScannerViewModel.kt", l = {198}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class BarcodeScannerViewModel$onBarcodeDetectedLegacy$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ BarcodeScannerViewModel q;
    public final /* synthetic */ BarcodeData r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodeScannerViewModel$onBarcodeDetectedLegacy$1(BarcodeScannerViewModel barcodeScannerViewModel, BarcodeData barcodeData, Continuation continuation) {
        super(2, continuation);
        this.q = barcodeScannerViewModel;
        this.r = barcodeData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BarcodeScannerViewModel$onBarcodeDetectedLegacy$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BarcodeScannerViewModel$onBarcodeDetectedLegacy$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProductDetailsData productDetailsData;
        List<Parcelable> feed;
        BarcodeScannerViewModel barcodeScannerViewModel = this.q;
        MutableLiveData mutableLiveData = barcodeScannerViewModel.j;
        AnalyticsManager analyticsManager = barcodeScannerViewModel.f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        BarcodeData barcodeData = this.r;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                BarcodeScannerViewModel.r6(barcodeScannerViewModel, barcodeScannerViewModel.j, false, true, null, 5);
                BarcodeScannerInteractor barcodeScannerInteractor = barcodeScannerViewModel.e;
                this.p = 1;
                obj = barcodeScannerInteractor.a(barcodeData, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            productDetailsData = (ProductDetailsData) obj;
        } catch (NoConnectivityException unused) {
            analyticsManager.c(BarcodeScannerScreenActionData.e);
            BarcodeScannerViewModel.r6(barcodeScannerViewModel, mutableLiveData, false, false, BarcodeScannerContract.ErrorState.f, 1);
        } catch (ServerErrorException e) {
            if (ExceptionExtKt.d(e.d, ServerErrorCode.g) != null) {
                analyticsManager.j(BarcodeScannerScreenActionData.j, TrackingMetadata.Companion.a(TrackableValue.D2, barcodeData.f8476a));
                BarcodeScannerViewModel.r6(barcodeScannerViewModel, mutableLiveData, false, false, BarcodeScannerContract.ErrorState.g, 1);
            } else {
                analyticsManager.c(BarcodeScannerScreenActionData.g);
                BarcodeScannerViewModel.r6(barcodeScannerViewModel, mutableLiveData, false, false, BarcodeScannerContract.ErrorState.i, 1);
            }
        }
        if (productDetailsData != null && (feed = productDetailsData.getFeed()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : feed) {
                if (obj2 instanceof ProductCard) {
                    arrayList.add(obj2);
                }
            }
            ProductCard productCard = (ProductCard) CollectionsKt.F(arrayList);
            if (productCard != null) {
                BarcodeScannerScreenActionData barcodeScannerScreenActionData = BarcodeScannerScreenActionData.i;
                TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.D2, barcodeData.f8476a);
                Double dU = ProductCardExtKt.u(productCard);
                trackingMetadataA.a(ProductAnalyticsExtKt.h(productCard, dU != null ? new Float((float) dU.doubleValue()) : null, null, 6));
                analyticsManager.j(barcodeScannerScreenActionData, trackingMetadataA);
                LambdaObserver lambdaObserver = barcodeScannerViewModel.k;
                if (lambdaObserver != null) {
                    DisposableHelper.a(lambdaObserver);
                }
                barcodeScannerViewModel.i.onNext(new BarcodeScannerContract.Actions.LaunchLegacyProductDetails(new Activities.LegacyProductDetails.Extras(new Activities.LegacyProductDetails.ExtrasByData(productDetailsData))));
                BarcodeScannerViewModel.r6(barcodeScannerViewModel, barcodeScannerViewModel.j, false, false, null, 5);
                return Unit.f24250a;
            }
        }
        throw new IllegalStateException("Product details response MUST have  ProductCard data");
    }
}
