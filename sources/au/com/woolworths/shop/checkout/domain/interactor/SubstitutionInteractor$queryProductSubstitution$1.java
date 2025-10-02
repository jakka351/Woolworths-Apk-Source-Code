package au.com.woolworths.shop.checkout.domain.interactor;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.domain.interactor.SubstitutionInteractor", f = "SubstitutionInteractor.kt", l = {23}, m = "queryProductSubstitution-0E7RQCE")
/* loaded from: classes4.dex */
final class SubstitutionInteractor$queryProductSubstitution$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ SubstitutionInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubstitutionInteractor$queryProductSubstitution$1(SubstitutionInteractor substitutionInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = substitutionInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        Object objA = this.q.a(null, 0.0d, this);
        return objA == CoroutineSingletons.d ? objA : new Result(objA);
    }
}
