package au.com.woolworths.feature.shop.homepage.presentation;

import au.com.woolworths.feature.shop.homepage.presentation.FlowExtKt$throttleFirst$2$1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.homepage.presentation.FlowExtKt$throttleFirst$2$1$1$1", f = "FlowExt.kt", l = {26}, m = "emit")
/* loaded from: classes3.dex */
final class FlowExtKt$throttleFirst$2$1$1$1$emit$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ FlowExtKt$throttleFirst$2$1.AnonymousClass1.C01671 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$throttleFirst$2$1$1$1$emit$1(FlowExtKt$throttleFirst$2$1.AnonymousClass1.C01671 c01671, Continuation continuation) {
        super(continuation);
        this.q = c01671;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.emit(null, this);
    }
}
