package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class VectorComponent extends VNode {
    public final GroupComponent b;
    public String c;
    public boolean d;
    public final DrawCache e;
    public Lambda f;
    public final MutableState g;
    public BlendModeColorFilter h;
    public final MutableState i;
    public long j;
    public float k;
    public float l;
    public final Function1 m;

    public VectorComponent(GroupComponent groupComponent) {
        this.b = groupComponent;
        groupComponent.i = new Function1<VNode, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComponent.1
            /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VectorComponent vectorComponent = VectorComponent.this;
                vectorComponent.d = true;
                vectorComponent.f.invoke();
                return Unit.f24250a;
            }
        };
        this.c = "";
        this.d = true;
        this.e = new DrawCache();
        this.f = VectorComponent$invalidateCallback$1.h;
        this.g = SnapshotStateKt.f(null);
        this.i = SnapshotStateKt.f(new Size(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new VectorComponent$drawVectorBlock$1(this);
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public final void a(DrawScope drawScope) {
        e(drawScope, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(androidx.compose.ui.graphics.drawscope.DrawScope r28, float r29, androidx.compose.ui.graphics.ColorFilter r30) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.VectorComponent.e(androidx.compose.ui.graphics.drawscope.DrawScope, float, androidx.compose.ui.graphics.ColorFilter):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        MutableState mutableState = this.i;
        sb.append(Float.intBitsToFloat((int) (((Size) ((SnapshotMutableStateImpl) mutableState).getD()).f1754a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((Size) ((SnapshotMutableStateImpl) mutableState).getD()).f1754a & 4294967295L)));
        sb.append("\n");
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }
}
