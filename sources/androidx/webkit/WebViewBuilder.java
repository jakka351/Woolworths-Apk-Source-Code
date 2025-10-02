package androidx.webkit;

import androidx.annotation.RequiresOptIn;
import androidx.annotation.RestrictTo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@RestrictTo
/* loaded from: classes2.dex */
public final class WebViewBuilder {

    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @RequiresOptIn
    @Retention(RetentionPolicy.CLASS)
    public @interface Experimental {
    }
}
