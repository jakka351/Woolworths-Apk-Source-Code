package androidx.paging;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.SeparatorState", f = "Separators.kt", l = {214, 216, 217}, m = "onEvent")
/* loaded from: classes2.dex */
final class SeparatorState$onEvent$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ SeparatorState q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorState$onEvent$1(SeparatorState separatorState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = separatorState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SeparatorState$onEvent$1 separatorState$onEvent$1;
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        SeparatorState separatorState = this.q;
        separatorState.getClass();
        int i = this.r;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.r = i - Integer.MIN_VALUE;
            separatorState$onEvent$1 = this;
        } else {
            separatorState$onEvent$1 = new SeparatorState$onEvent$1(separatorState, this);
        }
        Object obj2 = separatorState$onEvent$1.p;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = separatorState$onEvent$1.r;
        if (i2 == 0) {
            ResultKt.b(obj2);
            throw new NoWhenBranchMatchedException();
        }
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj2);
        throw null;
    }
}
