package dagger.internal;

import dagger.android.AndroidInjector;

/* loaded from: classes.dex */
public final class Preconditions {
    public static void a(Class cls, Object obj) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static void b(AndroidInjector androidInjector, String str, Class cls) {
        if (androidInjector == null) {
            if (!str.contains("%s")) {
                throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
            }
            if (str.indexOf("%s") != str.lastIndexOf("%s")) {
                throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
            }
            throw new NullPointerException(str.replace("%s", String.valueOf(cls.getCanonicalName())));
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void d(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
