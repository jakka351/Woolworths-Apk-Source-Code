package androidx.camera.core.resolutionselector;

import android.util.Size;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public final class ResolutionStrategy {
    public static final ResolutionStrategy c;

    /* renamed from: a, reason: collision with root package name */
    public Size f566a;
    public int b;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ResolutionFallbackRule {
    }

    static {
        ResolutionStrategy resolutionStrategy = new ResolutionStrategy();
        resolutionStrategy.f566a = null;
        resolutionStrategy.b = 0;
        c = resolutionStrategy;
    }
}
