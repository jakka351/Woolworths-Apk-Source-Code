package androidx.camera.core.resolutionselector;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public final class ResolutionSelector {

    /* renamed from: a, reason: collision with root package name */
    public final AspectRatioStrategy f564a;
    public final ResolutionStrategy b;
    public final ResolutionFilter c;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface AllowedResolutionMode {
    }

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public AspectRatioStrategy f565a = AspectRatioStrategy.b;
        public ResolutionStrategy b = null;
        public ResolutionFilter c = null;

        public final ResolutionSelector a() {
            return new ResolutionSelector(this.f565a, this.b, this.c);
        }
    }

    public ResolutionSelector(AspectRatioStrategy aspectRatioStrategy, ResolutionStrategy resolutionStrategy, ResolutionFilter resolutionFilter) {
        this.f564a = aspectRatioStrategy;
        this.b = resolutionStrategy;
        this.c = resolutionFilter;
    }
}
