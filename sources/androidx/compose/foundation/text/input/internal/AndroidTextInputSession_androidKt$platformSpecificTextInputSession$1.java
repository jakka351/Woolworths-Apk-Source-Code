package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt", f = "AndroidTextInputSession.android.kt", l = {59}, m = "platformSpecificTextInputSession")
/* loaded from: classes2.dex */
final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public int q;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.q |= Integer.MIN_VALUE;
        AndroidTextInputSession_androidKt.b(null, null, null, null, null, null, null, null, null, this);
        return CoroutineSingletons.d;
    }
}
