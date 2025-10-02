package androidx.compose.ui.spatial;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/spatial/RectListDebuggerModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class RectListDebuggerModifierNode extends Modifier.Node implements DrawModifierNode {
    public Paint r;
    public Object s;

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void I(LayoutNodeDrawScope layoutNodeDrawScope) {
        RectList rectList = DelegatableNodeKt.h(this).getRectManager().f2026a;
        Canvas canvasA = AndroidCanvas_androidKt.a(layoutNodeDrawScope.d.e.a());
        Paint paint = this.r;
        long[] jArr = rectList.f2025a;
        int i = rectList.c;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j = jArr[i2];
            long j2 = jArr[i2 + 1];
            long j3 = jArr[i2 + 2];
            canvasA.drawRect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2, paint);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        RectManager rectManager = DelegatableNodeKt.h(this).getRectManager();
        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.ui.spatial.RectListDebuggerModifierNode$onAttach$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DrawModifierNodeKt.a(this.h);
                return Unit.f24250a;
            }
        };
        rectManager.c.g(function0);
        this.s = function0;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        RectManager rectManager = DelegatableNodeKt.h(this).getRectManager();
        Object obj = this.s;
        rectManager.getClass();
        if ((TypeIntrinsics.e(0, obj) ? (Function0) obj : null) == null) {
            return;
        }
        rectManager.c.k(obj);
    }
}
