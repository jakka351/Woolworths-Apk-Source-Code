package au.com.woolworths.feature.shop.recipes.freshmag.content.domain;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.freshmag.content.domain.MagazineInteractor", f = "MagazineInteractor.kt", l = {19}, m = "fetchMagazine")
/* loaded from: classes3.dex */
final class MagazineInteractor$fetchMagazine$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ MagazineInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagazineInteractor$fetchMagazine$1(MagazineInteractor magazineInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = magazineInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
