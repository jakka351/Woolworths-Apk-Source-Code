package androidx.camera.camera2.internal.annotation;

import androidx.annotation.RestrictTo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
@RestrictTo
/* loaded from: classes2.dex */
public @interface CameraExecutor {
}
