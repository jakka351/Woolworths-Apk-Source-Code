package au.com.woolworths.shop.checkout.ui.idverification;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.idverification.IdVerificationRepository", f = "IdVerificationRepository.kt", l = {23}, m = "initIdVerification")
/* loaded from: classes4.dex */
final class IdVerificationRepository$initIdVerification$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ IdVerificationRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdVerificationRepository$initIdVerification$1(IdVerificationRepository idVerificationRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = idVerificationRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(this);
    }
}
