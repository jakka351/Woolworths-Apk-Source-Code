package au.com.woolworths.pay.internal.network;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface JSONField {
    boolean optional() default false;

    String value() default "";
}
