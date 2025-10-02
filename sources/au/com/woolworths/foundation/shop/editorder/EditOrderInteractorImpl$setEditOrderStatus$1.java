package au.com.woolworths.foundation.shop.editorder;

import au.com.woolworths.foundation.shop.editorder.data.SetEditOrderStatusResponse;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.shop.editorder.EditOrderInteractorImpl", f = "EditOrderInteractorImpl.kt", l = {52, 55}, m = "setEditOrderStatus")
/* loaded from: classes4.dex */
final class EditOrderInteractorImpl$setEditOrderStatus$1 extends ContinuationImpl {
    public SetEditOrderStatusResponse p;
    public /* synthetic */ Object q;
    public final /* synthetic */ EditOrderInteractorImpl r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditOrderInteractorImpl$setEditOrderStatus$1(EditOrderInteractorImpl editOrderInteractorImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = editOrderInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.I(null, null, this);
    }
}
