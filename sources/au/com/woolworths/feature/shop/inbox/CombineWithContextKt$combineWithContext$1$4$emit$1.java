package au.com.woolworths.feature.shop.inbox;

import au.com.woolworths.feature.shop.inbox.CombineWithContextKt$combineWithContext$1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.inbox.CombineWithContextKt$combineWithContext$1$4", f = "CombineWithContext.kt", l = {31}, m = "emit")
/* loaded from: classes3.dex */
final class CombineWithContextKt$combineWithContext$1$4$emit$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ CombineWithContextKt$combineWithContext$1.AnonymousClass4 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineWithContextKt$combineWithContext$1$4$emit$1(CombineWithContextKt$combineWithContext$1.AnonymousClass4 anonymousClass4, Continuation continuation) {
        super(continuation);
        this.q = anonymousClass4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.emit(null, this);
    }
}
