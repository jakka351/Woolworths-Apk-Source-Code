package au.com.woolworths.shop.buyagain.ui.legacy;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainViewModelLegacy", f = "BuyAgainViewModelLegacy.kt", l = {276}, m = "addToCart$shop_buy_again_release")
/* loaded from: classes4.dex */
final class BuyAgainViewModelLegacy$addToCart$1 extends ContinuationImpl {
    public List p;
    public Map q;
    public /* synthetic */ Object r;
    public final /* synthetic */ BuyAgainViewModelLegacy s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyAgainViewModelLegacy$addToCart$1(BuyAgainViewModelLegacy buyAgainViewModelLegacy, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = buyAgainViewModelLegacy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.q6(null, this);
    }
}
