package androidx.compose.ui.spatial;

import android.annotation.SuppressLint;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/spatial/RectListDebuggerModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/spatial/RectListDebuggerModifierNode;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint
/* loaded from: classes2.dex */
final class RectListDebuggerModifierElement extends ModifierNodeElement<RectListDebuggerModifierNode> {
    static {
        new RectListDebuggerModifierElement();
    }

    private RectListDebuggerModifierElement() {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        RectListDebuggerModifierNode rectListDebuggerModifierNode = new RectListDebuggerModifierNode();
        AndroidPaint androidPaintA = AndroidPaint_androidKt.a();
        androidPaintA.d(Color.g);
        androidPaintA.r(1);
        rectListDebuggerModifierNode.r = androidPaintA.f1759a;
        return rectListDebuggerModifierNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* bridge */ /* synthetic */ void b(Modifier.Node node) {
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 123;
    }
}
