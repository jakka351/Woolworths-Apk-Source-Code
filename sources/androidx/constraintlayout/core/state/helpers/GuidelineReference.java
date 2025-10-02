package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.Reference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class GuidelineReference implements Facade, Reference {

    /* renamed from: a, reason: collision with root package name */
    public final State f2306a;
    public int b;
    public Guideline c;
    public int d = -1;
    public int e = -1;
    public float f = BitmapDescriptorFactory.HUE_RED;
    public String g;

    public GuidelineReference(State state) {
        this.f2306a = state;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public final ConstraintWidget a() {
        if (this.c == null) {
            this.c = new Guideline();
        }
        return this.c;
    }

    @Override // androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference
    public final void apply() {
        this.c.a0(this.b);
        int i = this.d;
        if (i != -1) {
            Guideline guideline = this.c;
            if (i <= -1) {
                guideline.getClass();
                return;
            }
            guideline.v0 = -1.0f;
            guideline.w0 = i;
            guideline.x0 = -1;
            return;
        }
        int i2 = this.e;
        if (i2 != -1) {
            Guideline guideline2 = this.c;
            if (i2 <= -1) {
                guideline2.getClass();
                return;
            }
            guideline2.v0 = -1.0f;
            guideline2.w0 = -1;
            guideline2.x0 = i2;
            return;
        }
        Guideline guideline3 = this.c;
        float f = this.f;
        if (f <= -1.0f) {
            guideline3.getClass();
            return;
        }
        guideline3.v0 = f;
        guideline3.w0 = -1;
        guideline3.x0 = -1;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public final void b(ConstraintWidget constraintWidget) {
        if (constraintWidget instanceof Guideline) {
            this.c = (Guideline) constraintWidget;
        } else {
            this.c = null;
        }
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public final Facade c() {
        return null;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public final Object getKey() {
        return this.g;
    }
}
