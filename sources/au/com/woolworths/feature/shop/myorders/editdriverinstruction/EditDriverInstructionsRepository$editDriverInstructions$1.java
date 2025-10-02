package au.com.woolworths.feature.shop.myorders.editdriverinstruction;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionsRepository", f = "EditDriverInstructionsRepository.kt", l = {30}, m = "editDriverInstructions")
/* loaded from: classes3.dex */
final class EditDriverInstructionsRepository$editDriverInstructions$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ EditDriverInstructionsRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditDriverInstructionsRepository$editDriverInstructions$1(EditDriverInstructionsRepository editDriverInstructionsRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = editDriverInstructionsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
