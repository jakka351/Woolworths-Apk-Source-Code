package au.com.woolworths.feature.shop.recipes.freshmag.home.data;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.freshmag.home.data.FreshMagHomeRepositoryImpl", f = "FreshMagHomeRepositoryImpl.kt", l = {19}, m = "fetchFreshMagHome")
/* loaded from: classes3.dex */
final class FreshMagHomeRepositoryImpl$fetchFreshMagHome$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ FreshMagHomeRepositoryImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreshMagHomeRepositoryImpl$fetchFreshMagHome$1(FreshMagHomeRepositoryImpl freshMagHomeRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = freshMagHomeRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
