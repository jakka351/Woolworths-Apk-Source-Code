package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.widget.SharedValues;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes2.dex */
public class ViewTransitionController {

    /* renamed from: a, reason: collision with root package name */
    public final MotionLayout f2350a;
    public HashSet c;
    public ArrayList e;
    public final ArrayList b = new ArrayList();
    public final String d = "ViewTransitionController";
    public final ArrayList f = new ArrayList();

    /* renamed from: androidx.constraintlayout.motion.widget.ViewTransitionController$1, reason: invalid class name */
    class AnonymousClass1 implements SharedValues.SharedValuesListener {
    }

    public ViewTransitionController(MotionLayout motionLayout) {
        this.f2350a = motionLayout;
    }
}
