package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.core.util.ObjectsCompat;

@RestrictTo
/* loaded from: classes2.dex */
public class AnimationUtilsCompat {
    public static Interpolator a(int i, Context context) throws Resources.NotFoundException {
        Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, i);
        ObjectsCompat.a(interpolatorLoadInterpolator, "Failed to parse interpolator, no start tag found");
        return interpolatorLoadInterpolator;
    }
}
