package androidx.compose.ui.graphics.vector;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/GroupComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class GroupComponent extends VNode {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = Color.k;
    public List f;
    public boolean g;
    public AndroidPath h;
    public Function1 i;
    public final Function1 j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public GroupComponent() {
        int i = VectorKt.f1820a;
        this.f = EmptyList.d;
        this.g = true;
        this.j = new Function1<VNode, Unit>() { // from class: androidx.compose.ui.graphics.vector.GroupComponent$wrappedListener$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                VNode vNode = (VNode) obj;
                GroupComponent groupComponent = this.h;
                groupComponent.g(vNode);
                Function1 function1 = groupComponent.i;
                if (function1 != null) {
                    function1.invoke(vNode);
                }
                return Unit.f24250a;
            }
        };
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public final void a(DrawScope drawScope) {
        if (this.s) {
            float[] fArrA = this.b;
            if (fArrA == null) {
                fArrA = Matrix.a();
                this.b = fArrA;
            } else {
                Matrix.d(fArrA);
            }
            Matrix.h(fArrA, this.q + this.m, this.r + this.n, 4);
            float f = this.l;
            if (fArrA.length >= 16) {
                double d = f * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f2 = fArrA[0];
                float f3 = fArrA[4];
                float f4 = (fSin * f3) + (fCos * f2);
                float f5 = -fSin;
                float f6 = (f3 * fCos) + (f2 * f5);
                float f7 = fArrA[1];
                float f8 = fArrA[5];
                float f9 = (fSin * f8) + (fCos * f7);
                float f10 = fArrA[2];
                float f11 = fArrA[6];
                float f12 = (fSin * f11) + (fCos * f10);
                float f13 = fArrA[3];
                float f14 = fArrA[7];
                fArrA[0] = f4;
                fArrA[1] = f9;
                fArrA[2] = f12;
                fArrA[3] = (fSin * f14) + (fCos * f13);
                fArrA[4] = f6;
                fArrA[5] = (f8 * fCos) + (f7 * f5);
                fArrA[6] = (f11 * fCos) + (f10 * f5);
                fArrA[7] = (fCos * f14) + (f5 * f13);
            }
            Matrix.e(fArrA, this.o, this.p);
            Matrix.h(fArrA, -this.m, -this.n, 4);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                AndroidPath androidPathA = this.h;
                if (androidPathA == null) {
                    androidPathA = AndroidPath_androidKt.a();
                    this.h = androidPathA;
                }
                PathParserKt.b(this.f, androidPathA);
            }
            this.g = false;
        }
        CanvasDrawScope$drawContext$1 e = drawScope.getE();
        long jD = e.d();
        e.a().save();
        try {
            CanvasDrawScopeKt$asDrawTransform$1 canvasDrawScopeKt$asDrawTransform$1 = e.f1798a;
            float[] fArr = this.b;
            if (fArr != null) {
                canvasDrawScopeKt$asDrawTransform$1.f1799a.a().r(fArr);
            }
            AndroidPath androidPath = this.h;
            if (!this.f.isEmpty() && androidPath != null) {
                canvasDrawScopeKt$asDrawTransform$1.a(androidPath, 1);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((VNode) arrayList.get(i)).a(drawScope);
            }
            b.C(e, jD);
        } catch (Throwable th) {
            b.C(e, jD);
            throw th;
        }
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    /* renamed from: b, reason: from getter */
    public final Function1 getI() {
        return this.i;
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public final void d(Function1 function1) {
        this.i = function1;
    }

    public final void e(int i, VNode vNode) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, vNode);
        } else {
            arrayList.add(vNode);
        }
        g(vNode);
        vNode.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = VectorKt.f1820a;
            if (Color.h(j2) == Color.h(j) && Color.g(j2) == Color.g(j) && Color.e(j2) == Color.e(j)) {
                return;
            }
            this.d = false;
            this.e = Color.k;
        }
    }

    public final void g(VNode vNode) {
        if (!(vNode instanceof PathComponent)) {
            if (vNode instanceof GroupComponent) {
                GroupComponent groupComponent = (GroupComponent) vNode;
                if (groupComponent.d && this.d) {
                    f(groupComponent.e);
                    return;
                } else {
                    this.d = false;
                    this.e = Color.k;
                    return;
                }
            }
            return;
        }
        PathComponent pathComponent = (PathComponent) vNode;
        Brush brush = pathComponent.b;
        if (this.d && brush != null) {
            if (brush instanceof SolidColor) {
                f(((SolidColor) brush).f1783a);
            } else {
                this.d = false;
                this.e = Color.k;
            }
        }
        Brush brush2 = pathComponent.g;
        if (this.d && brush2 != null) {
            if (brush2 instanceof SolidColor) {
                f(((SolidColor) brush2).f1783a);
            } else {
                this.d = false;
                this.e = Color.k;
            }
        }
    }

    public final void h(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList = this.c;
            if (i < arrayList.size()) {
                ((VNode) arrayList.get(i)).d(null);
                arrayList.remove(i);
            }
        }
        c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            VNode vNode = (VNode) arrayList.get(i);
            sb.append("\t");
            sb.append(vNode.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
