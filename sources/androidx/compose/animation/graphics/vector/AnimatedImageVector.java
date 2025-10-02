package androidx.compose.animation.graphics.vector;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.vector.ImageVector;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/graphics/vector/AnimatedImageVector;", "", "Companion", "animation-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AnimatedImageVector {

    /* renamed from: a, reason: collision with root package name */
    public final ImageVector f808a;
    public final ArrayList b;
    public final int c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/graphics/vector/AnimatedImageVector$Companion;", "", "animation-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public AnimatedImageVector(ImageVector imageVector, ArrayList arrayList) {
        Object obj;
        this.f808a = imageVector;
        this.b = arrayList;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int f = ((AnimatedVectorTarget) obj).b.getF();
            int I = CollectionsKt.I(arrayList);
            int i = 1;
            if (1 <= I) {
                while (true) {
                    Object obj2 = arrayList.get(i);
                    int f2 = ((AnimatedVectorTarget) obj2).b.getF();
                    if (f < f2) {
                        obj = obj2;
                        f = f2;
                    }
                    if (i == I) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        AnimatedVectorTarget animatedVectorTarget = (AnimatedVectorTarget) obj;
        this.c = animatedVectorTarget != null ? animatedVectorTarget.b.getF() : 0;
    }
}
