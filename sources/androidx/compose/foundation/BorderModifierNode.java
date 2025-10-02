package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/BorderModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BorderModifierNode extends DelegatingNode {
    public BorderCache t;
    public float u;
    public SolidColor v;
    public Shape w;
    public final CacheDrawModifierNode x;

    public BorderModifierNode(float f, SolidColor solidColor, Shape shape) {
        this.u = f;
        this.v = solidColor;
        this.w = shape;
        CacheDrawModifierNode cacheDrawModifierNodeA = DrawModifierKt.a(new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.BorderModifierNode$drawWithCacheModifierNode$1
            {
                super(1);
            }

            /* JADX WARN: Removed duplicated region for block: B:43:0x0173  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x01cc  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r49) {
                /*
                    Method dump skipped, instructions count: 973
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BorderModifierNode$drawWithCacheModifierNode$1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        s2(cacheDrawModifierNodeA);
        this.x = cacheDrawModifierNodeA;
    }
}
