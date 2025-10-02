package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor", f = "PlatformTextInputModifierNode.kt", l = {219}, m = "textInputSession")
/* loaded from: classes2.dex */
final class ChainedPlatformTextInputInterceptor$textInputSession$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ChainedPlatformTextInputInterceptor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainedPlatformTextInputInterceptor$textInputSession$1(ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = chainedPlatformTextInputInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        this.q.a(null, null, this);
        return CoroutineSingletons.d;
    }
}
