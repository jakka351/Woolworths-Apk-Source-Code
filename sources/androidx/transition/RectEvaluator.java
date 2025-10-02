package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* loaded from: classes2.dex */
class RectEvaluator implements TypeEvaluator<Rect> {

    /* renamed from: a, reason: collision with root package name */
    public Rect f3790a;

    @Override // android.animation.TypeEvaluator
    public final Rect evaluate(float f, Rect rect, Rect rect2) {
        Rect rect3 = rect;
        Rect rect4 = rect2;
        int i = rect3.left + ((int) ((rect4.left - r0) * f));
        int i2 = rect3.top + ((int) ((rect4.top - r1) * f));
        int i3 = rect3.right + ((int) ((rect4.right - r2) * f));
        int i4 = rect3.bottom + ((int) ((rect4.bottom - r6) * f));
        Rect rect5 = this.f3790a;
        if (rect5 == null) {
            return new Rect(i, i2, i3, i4);
        }
        rect5.set(i, i2, i3, i4);
        return rect5;
    }
}
