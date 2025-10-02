package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DragAndDrop_androidKt {
    public static final long a(DragAndDropEvent dragAndDropEvent) {
        DragEvent dragEvent = dragAndDropEvent.f1739a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
    }
}
