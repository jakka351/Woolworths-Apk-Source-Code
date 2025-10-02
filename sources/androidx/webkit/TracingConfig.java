package androidx.webkit;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class TracingConfig {

    public static class Builder {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface PredefinedCategories {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface TracingMode {
    }
}
