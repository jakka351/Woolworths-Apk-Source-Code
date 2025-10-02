package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/vector/VNode;", "", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "Landroidx/compose/ui/graphics/vector/PathComponent;", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class VNode {

    /* renamed from: a, reason: collision with root package name */
    public Function1 f1819a;

    public abstract void a(DrawScope drawScope);

    /* renamed from: b, reason: from getter */
    public Function1 getF1819a() {
        return this.f1819a;
    }

    public final void c() {
        Function1 f1819a = getF1819a();
        if (f1819a != null) {
            f1819a.invoke(this);
        }
    }

    public void d(Function1 function1) {
        this.f1819a = function1;
    }
}
