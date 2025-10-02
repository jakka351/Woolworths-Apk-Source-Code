package au.com.woolworths.android.onesite.utils.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.utils.coroutines.ControlledRunner", f = "ControlledRunner.kt", l = {66, 68}, m = "cancelPreviousThenRun")
/* loaded from: classes3.dex */
final class ControlledRunner$cancelPreviousThenRun$1 extends ContinuationImpl {
    public Object p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ControlledRunner r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlledRunner$cancelPreviousThenRun$1(ControlledRunner controlledRunner, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = controlledRunner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, this);
    }
}
