package au.com.woolworths.shop.checkout.data.source;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.data.source.SubstitutionRepository", f = "SubstitutionRepository.kt", l = {40}, m = "queryProductSubstitution")
/* loaded from: classes4.dex */
final class SubstitutionRepository$queryProductSubstitution$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ SubstitutionRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubstitutionRepository$queryProductSubstitution$1(SubstitutionRepository substitutionRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = substitutionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, 0.0d, this);
    }
}
