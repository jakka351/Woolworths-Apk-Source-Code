package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.ContextMenu_androidKt", f = "ContextMenu.android.kt", l = {167}, m = "getContextMenuItemsAvailability")
/* loaded from: classes2.dex */
final class ContextMenu_androidKt$getContextMenuItemsAvailability$2 extends ContinuationImpl {
    public TextFieldSelectionManager p;
    public int q;
    public int r;
    public int s;
    public /* synthetic */ Object t;
    public int u;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.u |= Integer.MIN_VALUE;
        return ContextMenu_androidKt.c(null, this);
    }
}
