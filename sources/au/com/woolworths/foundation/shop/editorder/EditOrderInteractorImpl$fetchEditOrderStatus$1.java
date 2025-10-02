package au.com.woolworths.foundation.shop.editorder;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.shop.editorder.EditOrderInteractorImpl", f = "EditOrderInteractorImpl.kt", l = {95}, m = "fetchEditOrderStatus")
/* loaded from: classes4.dex */
final class EditOrderInteractorImpl$fetchEditOrderStatus$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ EditOrderInteractorImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditOrderInteractorImpl$fetchEditOrderStatus$1(EditOrderInteractorImpl editOrderInteractorImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = editOrderInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.t(this);
    }
}
