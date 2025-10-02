package androidx.transition;

import android.view.View;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class VisibilityPropagation extends TransitionPropagation {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f3803a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    public static int c(TransitionValues transitionValues, int i) {
        int[] iArr;
        if (transitionValues == null || (iArr = (int[]) transitionValues.f3796a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }

    @Override // androidx.transition.TransitionPropagation
    public final void a(TransitionValues transitionValues) {
        View view = transitionValues.b;
        HashMap map = transitionValues.f3796a;
        Integer numValueOf = (Integer) map.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        map.put("android:visibilityPropagation:visibility", numValueOf);
        int[] iArr = {iRound, 0};
        view.getLocationOnScreen(iArr);
        int iRound = Math.round(view.getTranslationX()) + iArr[0];
        iArr[0] = (view.getWidth() / 2) + iRound;
        int iRound2 = Math.round(view.getTranslationY()) + iArr[1];
        iArr[1] = iRound2;
        iArr[1] = (view.getHeight() / 2) + iRound2;
        map.put("android:visibilityPropagation:center", iArr);
    }
}
