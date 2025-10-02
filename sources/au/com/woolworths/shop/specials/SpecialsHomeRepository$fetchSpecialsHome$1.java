package au.com.woolworths.shop.specials;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.specials.SpecialsHomeRepository", f = "SpecialsHomeRepository.kt", l = {68}, m = "fetchSpecialsHome")
/* loaded from: classes4.dex */
final class SpecialsHomeRepository$fetchSpecialsHome$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ SpecialsHomeRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpecialsHomeRepository$fetchSpecialsHome$1(SpecialsHomeRepository specialsHomeRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = specialsHomeRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, null, null, this);
    }
}
