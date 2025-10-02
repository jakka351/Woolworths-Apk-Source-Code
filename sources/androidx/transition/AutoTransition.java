package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes2.dex */
public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        W();
    }

    public final void W() {
        V(1);
        R(new Fade(2));
        R(new ChangeBounds());
        R(new Fade(1));
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        W();
    }
}
