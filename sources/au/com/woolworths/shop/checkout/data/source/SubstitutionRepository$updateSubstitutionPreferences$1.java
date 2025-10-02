package au.com.woolworths.shop.checkout.data.source;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.data.source.SubstitutionRepository", f = "SubstitutionRepository.kt", l = {53}, m = "updateSubstitutionPreferences")
/* loaded from: classes4.dex */
final class SubstitutionRepository$updateSubstitutionPreferences$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ SubstitutionRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubstitutionRepository$updateSubstitutionPreferences$1(SubstitutionRepository substitutionRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = substitutionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.c(null, this);
    }
}
