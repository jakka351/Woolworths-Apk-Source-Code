package au.com.woolworths.feature.shop.barcode.scanner;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerInteractor", f = "BarcodeScannerInteractor.kt", l = {35}, m = "fetchUpliftedProductDetailsByBarcode")
/* loaded from: classes3.dex */
final class BarcodeScannerInteractor$fetchUpliftedProductDetailsByBarcode$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ BarcodeScannerInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodeScannerInteractor$fetchUpliftedProductDetailsByBarcode$1(BarcodeScannerInteractor barcodeScannerInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = barcodeScannerInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(null, this);
    }
}
