package au.com.woolworths.foundation.shop.editorder;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.shop.editorder.EditOrderRepository", f = "EditOrderRepository.kt", l = {43}, m = "fetchEditOrderStatus")
/* loaded from: classes4.dex */
final class EditOrderRepository$fetchEditOrderStatus$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ EditOrderRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditOrderRepository$fetchEditOrderStatus$1(EditOrderRepository editOrderRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = editOrderRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
