package au.com.woolworths.product.addtocart;

import au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.BERTags;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.product.addtocart.AddToCartViewModel", f = "AddToCartViewModel.kt", l = {BERTags.FLAGS}, m = "replaceTrolleyItem")
/* loaded from: classes4.dex */
final class AddToCartViewModel$replaceTrolleyItem$1 extends ContinuationImpl {
    public UpdateProductInCartExtras p;
    public /* synthetic */ Object q;
    public final /* synthetic */ AddToCartViewModel r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToCartViewModel$replaceTrolleyItem$1(AddToCartViewModel addToCartViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = addToCartViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return AddToCartViewModel.p6(this.r, null, null, this);
    }
}
