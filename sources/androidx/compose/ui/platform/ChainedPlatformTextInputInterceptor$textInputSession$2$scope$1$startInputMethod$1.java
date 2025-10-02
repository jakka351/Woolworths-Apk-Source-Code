package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1", f = "PlatformTextInputModifierNode.kt", l = {230}, m = "startInputMethod")
/* loaded from: classes2.dex */
final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1(ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = chainedPlatformTextInputInterceptor$textInputSession$2$scope$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        this.q.a(null, this);
        return CoroutineSingletons.d;
    }
}
