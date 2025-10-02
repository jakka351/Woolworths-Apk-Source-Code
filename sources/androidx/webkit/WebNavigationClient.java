package androidx.webkit;

import androidx.annotation.RequiresOptIn;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ExperimentalNavigationCallback
/* loaded from: classes2.dex */
public interface WebNavigationClient {

    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @RequiresOptIn
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalNavigationCallback {
    }
}
