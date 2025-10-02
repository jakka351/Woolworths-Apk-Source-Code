package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import java.io.Serializable;

/* loaded from: classes4.dex */
public interface VisibilityChecker<T extends VisibilityChecker<T>> {

    /* renamed from: com.fasterxml.jackson.databind.introspect.VisibilityChecker$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14286a;

        static {
            int[] iArr = new int[PropertyAccessor.values().length];
            f14286a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14286a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14286a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14286a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14286a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14286a[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class Std implements VisibilityChecker<Std>, Serializable {
        public static final Std i;
        public static final Std j;
        public final JsonAutoDetect.Visibility d;
        public final JsonAutoDetect.Visibility e;
        public final JsonAutoDetect.Visibility f;
        public final JsonAutoDetect.Visibility g;
        public final JsonAutoDetect.Visibility h;

        static {
            JsonAutoDetect.Visibility visibility = JsonAutoDetect.Visibility.d;
            JsonAutoDetect.Visibility visibility2 = JsonAutoDetect.Visibility.e;
            i = new Std(visibility2, visibility2, visibility, visibility, visibility2);
            j = new Std(visibility2, visibility2, visibility2, visibility2, visibility2);
        }

        public Std(JsonAutoDetect.Visibility visibility, JsonAutoDetect.Visibility visibility2, JsonAutoDetect.Visibility visibility3, JsonAutoDetect.Visibility visibility4, JsonAutoDetect.Visibility visibility5) {
            this.d = visibility;
            this.e = visibility2;
            this.f = visibility3;
            this.g = visibility4;
            this.h = visibility5;
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public final boolean a(AnnotatedMethod annotatedMethod) {
            return this.e.a(annotatedMethod.g);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public final boolean b(AnnotatedWithParams annotatedWithParams) {
            return this.g.a(annotatedWithParams.j());
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public final Std c(JsonAutoDetect jsonAutoDetect) {
            JsonAutoDetect.Visibility visibility = jsonAutoDetect.getterVisibility();
            JsonAutoDetect.Visibility visibility2 = JsonAutoDetect.Visibility.g;
            if (visibility == visibility2) {
                visibility = this.d;
            }
            JsonAutoDetect.Visibility visibility3 = visibility;
            JsonAutoDetect.Visibility visibilityIsGetterVisibility = jsonAutoDetect.isGetterVisibility();
            if (visibilityIsGetterVisibility == visibility2) {
                visibilityIsGetterVisibility = this.e;
            }
            JsonAutoDetect.Visibility visibility4 = visibilityIsGetterVisibility;
            JsonAutoDetect.Visibility visibility5 = jsonAutoDetect.setterVisibility();
            if (visibility5 == visibility2) {
                visibility5 = this.f;
            }
            JsonAutoDetect.Visibility visibility6 = visibility5;
            JsonAutoDetect.Visibility visibilityCreatorVisibility = jsonAutoDetect.creatorVisibility();
            if (visibilityCreatorVisibility == visibility2) {
                visibilityCreatorVisibility = this.g;
            }
            JsonAutoDetect.Visibility visibility7 = visibilityCreatorVisibility;
            JsonAutoDetect.Visibility visibilityFieldVisibility = jsonAutoDetect.fieldVisibility();
            if (visibilityFieldVisibility == visibility2) {
                visibilityFieldVisibility = this.h;
            }
            JsonAutoDetect.Visibility visibility8 = visibilityFieldVisibility;
            return (visibility3 == this.d && visibility4 == this.e && visibility6 == this.f && visibility7 == this.g && visibility8 == this.h) ? this : new Std(visibility3, visibility4, visibility6, visibility7, visibility8);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public final boolean d(AnnotatedMethod annotatedMethod) {
            return this.d.a(annotatedMethod.g);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public final boolean e(AnnotatedField annotatedField) {
            return this.h.a(annotatedField.f);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public final boolean f(AnnotatedMethod annotatedMethod) {
            return this.f.a(annotatedMethod.g);
        }

        public final String toString() {
            return "[Visibility: getter=" + this.d + ",isGetter=" + this.e + ",setter=" + this.f + ",creator=" + this.g + ",field=" + this.h + "]";
        }
    }

    boolean a(AnnotatedMethod annotatedMethod);

    boolean b(AnnotatedWithParams annotatedWithParams);

    Std c(JsonAutoDetect jsonAutoDetect);

    boolean d(AnnotatedMethod annotatedMethod);

    boolean e(AnnotatedField annotatedField);

    boolean f(AnnotatedMethod annotatedMethod);
}
