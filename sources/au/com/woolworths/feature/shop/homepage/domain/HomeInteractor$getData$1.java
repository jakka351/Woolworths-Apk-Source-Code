package au.com.woolworths.feature.shop.homepage.domain;

import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.feature.shop.homepage.data.HomeRepository;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.homepage.domain.HomeInteractor", f = "HomeInteractor.kt", l = {43, 56, 51}, m = "getData")
/* loaded from: classes3.dex */
final class HomeInteractor$getData$1 extends ContinuationImpl {
    public String p;
    public HomeRepository q;
    public CollectionMode r;
    public String s;
    public boolean t;
    public /* synthetic */ Object u;
    public final /* synthetic */ HomeInteractor v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeInteractor$getData$1(HomeInteractor homeInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.v = homeInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.T(this);
    }
}
