package androidx.compose.foundation.contextmenu;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt", f = "ContextMenuGestures.android.kt", l = {71}, m = "awaitFirstRightClickDown")
/* loaded from: classes2.dex */
final class ContextMenuGestures_androidKt$awaitFirstRightClickDown$1 extends ContinuationImpl {
    public AwaitPointerEventScope p;
    public /* synthetic */ Object q;
    public int r;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.r |= Integer.MIN_VALUE;
        return ContextMenuGestures_androidKt.a(null, this);
    }
}
