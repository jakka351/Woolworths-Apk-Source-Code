package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.feature.product.list.legacy.ProductListContract;
import au.com.woolworths.feature.product.list.legacy.ProductListViewModel$1$6;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListViewModel$1$6$1", f = "ProductListViewModel.kt", l = {DilithiumEngine.DilithiumPolyT1PackedBytes}, m = "emit")
/* loaded from: classes3.dex */
final class ProductListViewModel$1$6$1$emit$1 extends ContinuationImpl {
    public ProductListContract.ProductListFlow p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ProductListViewModel$1$6.AnonymousClass1 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListViewModel$1$6$1$emit$1(ProductListViewModel$1$6.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.r = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.emit(null, this);
    }
}
