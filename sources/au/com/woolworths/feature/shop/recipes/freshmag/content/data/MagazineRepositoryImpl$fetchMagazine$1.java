package au.com.woolworths.feature.shop.recipes.freshmag.content.data;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.freshmag.content.data.MagazineRepositoryImpl", f = "MagazineRepositoryImpl.kt", l = {22}, m = "fetchMagazine")
/* loaded from: classes3.dex */
final class MagazineRepositoryImpl$fetchMagazine$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ MagazineRepositoryImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagazineRepositoryImpl$fetchMagazine$1(MagazineRepositoryImpl magazineRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = magazineRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
