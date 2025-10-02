package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes7.dex */
public abstract class ReflectJavaAnnotationArgument implements JavaAnnotationArgument {

    /* renamed from: a, reason: collision with root package name */
    public final Name f24379a;

    public static final class Factory {
        public static ReflectJavaAnnotationArgument a(Object obj, Name name) {
            Class<?> cls = obj.getClass();
            List list = ReflectClassUtilKt.f24377a;
            return Enum.class.isAssignableFrom(cls) ? new ReflectJavaEnumValueAnnotationArgument(name, (Enum) obj) : obj instanceof Annotation ? new ReflectJavaAnnotationAsAnnotationArgument(name, (Annotation) obj) : obj instanceof Object[] ? new ReflectJavaArrayAnnotationArgument(name, (Object[]) obj) : obj instanceof Class ? new ReflectJavaClassObjectAnnotationArgument(name, (Class) obj) : new ReflectJavaLiteralAnnotationArgument(obj, name);
        }
    }

    public ReflectJavaAnnotationArgument(Name name) {
        this.f24379a = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument
    public final Name getName() {
        return this.f24379a;
    }
}
