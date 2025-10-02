package au.com.woolworths.shop.lists.ui.magicmatch.interactor;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.magicmatch.interactor.MagicMatchRepository", f = "MagicMatchRepository.kt", l = {142}, m = "magicMatchProductList")
/* loaded from: classes4.dex */
final class MagicMatchRepository$magicMatchProductList$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ MagicMatchRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagicMatchRepository$magicMatchProductList$1(MagicMatchRepository magicMatchRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = magicMatchRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
