package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.BoostExt", f = "BoostExt.kt", l = {83, 85}, m = "addAndBoostProductsGraphQl")
/* loaded from: classes4.dex */
final class BoostExt$addAndBoostProductsGraphQl$1 extends ContinuationImpl {
    public List p;
    public /* synthetic */ Object q;
    public final /* synthetic */ BoostExt r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoostExt$addAndBoostProductsGraphQl$1(BoostExt boostExt, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = boostExt;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, this);
    }
}
