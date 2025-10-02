package androidx.camera.core.resolutionselector;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public final class AspectRatioStrategy {
    public static final AspectRatioStrategy b = new AspectRatioStrategy(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f563a;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface AspectRatioFallbackRule {
    }

    public AspectRatioStrategy(int i) {
        this.f563a = i;
    }
}
