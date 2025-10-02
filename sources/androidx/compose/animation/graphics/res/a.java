package androidx.compose.animation.graphics.res;

import android.view.animation.BaseInterpolator;
import androidx.compose.animation.core.Easing;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Easing {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseInterpolator f806a;

    public /* synthetic */ a(BaseInterpolator baseInterpolator) {
        this.f806a = baseInterpolator;
    }

    @Override // androidx.compose.animation.core.Easing
    public final float a(float f) {
        androidx.compose.animation.core.a aVar = AnimatorResources_androidKt.f804a;
        return this.f806a.getInterpolation(f);
    }
}
