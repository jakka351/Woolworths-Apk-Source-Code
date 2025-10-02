package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public interface CallAdapter<R, T> {

    public static abstract class Factory {
        public static Type b(ParameterizedType parameterizedType) {
            return Utils.d(0, parameterizedType);
        }

        public static Class c(Type type) {
            return Utils.e(type);
        }

        public abstract CallAdapter a(Type type, Annotation[] annotationArr);
    }

    Type a();

    Object b(Call call);
}
