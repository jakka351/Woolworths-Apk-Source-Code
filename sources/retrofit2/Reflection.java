package retrofit2;

import android.annotation.TargetApi;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes2.dex */
class Reflection {

    @TargetApi
    @IgnoreJRERequirement
    public static final class Android24 extends Reflection {
        @Override // retrofit2.Reflection
        public final Object b(Method method, Class cls, Object obj, Object[] objArr) {
            return DefaultMethodSupport.a(method, cls, obj, objArr);
        }

        @Override // retrofit2.Reflection
        public final boolean c(Method method) {
            return method.isDefault();
        }
    }

    @IgnoreJRERequirement
    /* loaded from: classes8.dex */
    public static class Java8 extends Reflection {
        @Override // retrofit2.Reflection
        public final String a(int i, Method method) {
            Parameter parameter = method.getParameters()[i];
            if (!parameter.isNamePresent()) {
                return super.a(i, method);
            }
            return "parameter '" + parameter.getName() + '\'';
        }

        @Override // retrofit2.Reflection
        public final Object b(Method method, Class cls, Object obj, Object[] objArr) {
            return DefaultMethodSupport.a(method, cls, obj, objArr);
        }

        @Override // retrofit2.Reflection
        public final boolean c(Method method) {
            return method.isDefault();
        }
    }

    public String a(int i, Method method) {
        return "parameter #" + (i + 1);
    }

    public Object b(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean c(Method method) {
        return false;
    }
}
