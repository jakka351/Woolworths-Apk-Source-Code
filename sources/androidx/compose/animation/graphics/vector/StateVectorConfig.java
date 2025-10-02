package androidx.compose.animation.graphics.vector;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.VectorConfig;
import androidx.compose.ui.graphics.vector.VectorProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/graphics/vector/StateVectorConfig;", "Landroidx/compose/ui/graphics/vector/VectorConfig;", "animation-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class StateVectorConfig implements VectorConfig {

    /* renamed from: a, reason: collision with root package name */
    public State f818a;
    public State b;
    public State c;
    public State d;
    public State e;
    public State f;
    public State g;
    public State h;
    public State i;
    public State j;
    public State k;
    public State l;
    public State m;
    public State n;
    public State o;
    public State p;

    @Override // androidx.compose.ui.graphics.vector.VectorConfig
    public final Object a(VectorProperty vectorProperty, Object obj) {
        List list;
        if (vectorProperty instanceof VectorProperty.Rotation) {
            State state = this.f818a;
            if (state != null) {
                return Float.valueOf(((Number) state.getD()).floatValue());
            }
        } else if (vectorProperty instanceof VectorProperty.PivotX) {
            State state2 = this.b;
            if (state2 != null) {
                return Float.valueOf(((Number) state2.getD()).floatValue());
            }
        } else if (vectorProperty instanceof VectorProperty.PivotY) {
            State state3 = this.c;
            if (state3 != null) {
                return Float.valueOf(((Number) state3.getD()).floatValue());
            }
        } else if (vectorProperty instanceof VectorProperty.ScaleX) {
            State state4 = this.d;
            if (state4 != null) {
                return Float.valueOf(((Number) state4.getD()).floatValue());
            }
        } else if (vectorProperty instanceof VectorProperty.ScaleY) {
            State state5 = this.e;
            if (state5 != null) {
                return Float.valueOf(((Number) state5.getD()).floatValue());
            }
        } else if (vectorProperty instanceof VectorProperty.TranslateX) {
            State state6 = this.f;
            if (state6 != null) {
                return Float.valueOf(((Number) state6.getD()).floatValue());
            }
        } else if (vectorProperty instanceof VectorProperty.TranslateY) {
            State state7 = this.g;
            if (state7 != null) {
                return Float.valueOf(((Number) state7.getD()).floatValue());
            }
        } else if (vectorProperty instanceof VectorProperty.PathData) {
            State state8 = this.h;
            if (state8 != null && (list = (List) state8.getD()) != null) {
                return list;
            }
        } else if (vectorProperty instanceof VectorProperty.Fill) {
            State state9 = this.i;
            if (state9 != null) {
                return new SolidColor(((Color) state9.getD()).f1766a);
            }
        } else if (vectorProperty instanceof VectorProperty.FillAlpha) {
            State state10 = this.m;
            if (state10 != null) {
                return Float.valueOf(((Number) state10.getD()).floatValue());
            }
        } else if (vectorProperty instanceof VectorProperty.Stroke) {
            State state11 = this.j;
            if (state11 != null) {
                return new SolidColor(((Color) state11.getD()).f1766a);
            }
        } else if (vectorProperty instanceof VectorProperty.StrokeLineWidth) {
            State state12 = this.k;
            if (state12 != null) {
                return Float.valueOf(((Number) state12.getD()).floatValue());
            }
        } else if (vectorProperty instanceof VectorProperty.StrokeAlpha) {
            State state13 = this.l;
            if (state13 != null) {
                return Float.valueOf(((Number) state13.getD()).floatValue());
            }
        } else if (vectorProperty instanceof VectorProperty.TrimPathStart) {
            State state14 = this.n;
            if (state14 != null) {
                return Float.valueOf(((Number) state14.getD()).floatValue());
            }
        } else if (vectorProperty instanceof VectorProperty.TrimPathEnd) {
            State state15 = this.o;
            if (state15 != null) {
                return Float.valueOf(((Number) state15.getD()).floatValue());
            }
        } else {
            if (!(vectorProperty instanceof VectorProperty.TrimPathOffset)) {
                throw new NoWhenBranchMatchedException();
            }
            State state16 = this.p;
            if (state16 != null) {
                return Float.valueOf(((Number) state16.getD()).floatValue());
            }
        }
        return obj;
    }
}
