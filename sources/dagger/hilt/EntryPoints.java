package dagger.hilt;

import dagger.hilt.internal.GeneratedComponent;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.TestSingletonComponent;
import java.lang.annotation.Annotation;

/* loaded from: classes.dex */
public final class EntryPoints {
    public static Object a(Class cls, Object obj) {
        if (!(obj instanceof GeneratedComponent)) {
            if (obj instanceof GeneratedComponentManager) {
                return a(cls, ((GeneratedComponentManager) obj).t3());
            }
            throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + GeneratedComponent.class + " or " + GeneratedComponentManager.class);
        }
        if (obj instanceof TestSingletonComponent) {
            Annotation[] annotations = cls.getAnnotations();
            int length = annotations.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (annotations[i].annotationType().getCanonicalName().contentEquals("dagger.hilt.android.EarlyEntryPoint")) {
                    z = true;
                    break;
                }
                i++;
            }
            Preconditions.a(!z, "Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", cls.getCanonicalName());
        }
        return cls.cast(obj);
    }
}
