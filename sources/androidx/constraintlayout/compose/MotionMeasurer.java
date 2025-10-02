package androidx.constraintlayout.compose;

import android.graphics.Matrix;
import androidx.camera.core.impl.e;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPathEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.state.Transition;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@ExperimentalMotionApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/MotionMeasurer;", "Landroidx/constraintlayout/compose/Measurer2;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class MotionMeasurer extends Measurer2 {
    public float j;
    public final androidx.constraintlayout.core.state.Transition k;
    public Constraints l;

    public MotionMeasurer(Density density) {
        super(density);
        this.k = new androidx.constraintlayout.core.state.Transition(new e(density, 2));
    }

    public static void i(DrawScope drawScope, WidgetFrame widgetFrame, AndroidPathEffect androidPathEffect, long j) {
        if (widgetFrame.d()) {
            DrawScope.S(drawScope, j, OffsetKt.a(widgetFrame.b, widgetFrame.c), SizeKt.a(Math.max(0, widgetFrame.d - widgetFrame.b), Math.max(0, widgetFrame.e - widgetFrame.c)), BitmapDescriptorFactory.HUE_RED, new Stroke(3.0f, BitmapDescriptorFactory.HUE_RED, 0, 0, androidPathEffect, 14), null, 104);
            return;
        }
        Matrix matrix = new Matrix();
        if (!Float.isNaN(widgetFrame.j)) {
            matrix.preRotate(widgetFrame.j, ((widgetFrame.d - r5) / 2.0f) + widgetFrame.b, ((widgetFrame.e - r6) / 2.0f) + widgetFrame.c);
        }
        float f = Float.isNaN(widgetFrame.n) ? 1.0f : widgetFrame.n;
        float f2 = Float.isNaN(widgetFrame.o) ? 1.0f : widgetFrame.o;
        matrix.preScale(f, f2, ((widgetFrame.d - r6) / 2.0f) + widgetFrame.b, ((widgetFrame.e - r7) / 2.0f) + widgetFrame.c);
        float f3 = widgetFrame.b;
        float f4 = widgetFrame.c;
        float f5 = widgetFrame.d;
        float f6 = widgetFrame.e;
        float[] fArr = {f3, f4, f5, f4, f5, f6, f3, f6};
        matrix.mapPoints(fArr);
        drawScope.b1(j, OffsetKt.a(fArr[0], fArr[1]), OffsetKt.a(fArr[2], fArr[3]), 3.0f, (464 & 16) != 0 ? 0 : 0, (464 & 32) != 0 ? null : androidPathEffect, 3);
        drawScope.b1(j, OffsetKt.a(fArr[2], fArr[3]), OffsetKt.a(fArr[4], fArr[5]), 3.0f, (464 & 16) != 0 ? 0 : 0, (464 & 32) != 0 ? null : androidPathEffect, 3);
        drawScope.b1(j, OffsetKt.a(fArr[4], fArr[5]), OffsetKt.a(fArr[6], fArr[7]), 3.0f, (464 & 16) != 0 ? 0 : 0, (464 & 32) != 0 ? null : androidPathEffect, 3);
        drawScope.b1(j, OffsetKt.a(fArr[6], fArr[7]), OffsetKt.a(fArr[0], fArr[1]), 3.0f, (464 & 16) != 0 ? 0 : 0, (464 & 32) != 0 ? null : androidPathEffect, 3);
    }

    @Override // androidx.constraintlayout.compose.Measurer2
    public final void d() {
        StringBuilder sb = new StringBuilder("{   root: {interpolated: { left:  0,  top:  0,");
        StringBuilder sb2 = new StringBuilder("  right:   ");
        ConstraintWidgetContainer constraintWidgetContainer = this.b;
        sb2.append(constraintWidgetContainer.v());
        sb2.append(" ,");
        sb.append(sb2.toString());
        sb.append("  bottom:  " + constraintWidgetContainer.p() + " ,");
        sb.append(" } }");
        int[] iArr = new int[50];
        int[] iArr2 = new int[50];
        float[] fArr = new float[100];
        ArrayList arrayList = constraintWidgetContainer.v0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            ConstraintWidget constraintWidget = (ConstraintWidget) arrayList.get(i);
            String str = constraintWidget.k;
            androidx.constraintlayout.core.state.Transition transition = this.k;
            HashMap map = transition.b;
            HashMap map2 = transition.b;
            Transition.WidgetState widgetState = (Transition.WidgetState) map.get(str);
            WidgetFrame widgetFrame = widgetState == null ? null : widgetState.f2303a;
            Transition.WidgetState widgetState2 = (Transition.WidgetState) map2.get(constraintWidget.k);
            WidgetFrame widgetFrame2 = widgetState2 == null ? null : widgetState2.b;
            Transition.WidgetState widgetState3 = (Transition.WidgetState) map2.get(constraintWidget.k);
            WidgetFrame widgetFrame3 = widgetState3 != null ? widgetState3.c : null;
            ArrayList arrayList2 = arrayList;
            float[] fArr2 = new float[124];
            ((Transition.WidgetState) map2.get(constraintWidget.k)).d.f(fArr2, 62);
            int iE = ((Transition.WidgetState) map2.get(constraintWidget.k)).d.e(fArr, iArr, iArr2);
            sb.append(" " + constraintWidget.k + ": {");
            sb.append(" interpolated : ");
            widgetFrame3.e(sb, true);
            sb.append(", start : ");
            widgetFrame.e(sb, false);
            sb.append(", end : ");
            widgetFrame2.e(sb, false);
            if (iE != 0) {
                sb.append("keyTypes : [");
                for (int i2 = 0; i2 < iE; i2++) {
                    sb.append(" " + iArr[i2] + ',');
                }
                sb.append("],\n");
                sb.append("keyPos : [");
                int i3 = iE * 2;
                for (int i4 = 0; i4 < i3; i4++) {
                    sb.append(" " + fArr[i4] + ',');
                }
                sb.append("],\n ");
                sb.append("keyFrames : [");
                for (int i5 = 0; i5 < iE; i5++) {
                    sb.append(" " + iArr2[i5] + ',');
                }
                sb.append("],\n ");
            }
            sb.append(" path : [");
            for (int i6 = 0; i6 < 124; i6++) {
                sb.append(" " + fArr2[i6] + " ,");
            }
            sb.append(" ] ");
            sb.append("}, ");
            i++;
            arrayList = arrayList2;
        }
        sb.append(" }");
        LayoutInformationReceiver layoutInformationReceiver = this.f2248a;
        if (layoutInformationReceiver != null) {
            layoutInformationReceiver.j();
        }
    }

    public final void j(int i, ConstraintSet constraintSet, List list, long j) throws NumberFormatException {
        State state = this.f;
        state.g();
        constraintSet.a(state, list);
        ConstraintLayoutKt.a(state, list);
        ConstraintWidgetContainer constraintWidgetContainer = this.b;
        state.a(constraintWidgetContainer);
        ArrayList arrayList = constraintWidgetContainer.v0;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ConstraintWidget) arrayList.get(i2)).k0 = true;
        }
        c(j);
        constraintWidgetContainer.w0.c(constraintWidgetContainer);
        constraintWidgetContainer.J0 = i;
        LinearSystem.q = constraintWidgetContainer.e0(512);
        this.b.c0(0, 0, 0, 0, 0, 0, 0);
    }
}
