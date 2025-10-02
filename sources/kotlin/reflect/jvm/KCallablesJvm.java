package kotlin.reflect.jvm;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.calls.Caller;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
/* loaded from: classes7.dex */
public final class KCallablesJvm {
    public static final boolean a(KCallable kCallable) {
        Caller callerQ;
        Caller callerS;
        if (kCallable instanceof KMutableProperty) {
            KProperty kProperty = (KProperty) kCallable;
            Field fieldA = ReflectJvmMapping.a(kProperty);
            if (!(fieldA != null ? fieldA.isAccessible() : true)) {
                return false;
            }
            Method methodB = ReflectJvmMapping.b(kProperty.getGetter());
            if (!(methodB != null ? methodB.isAccessible() : true)) {
                return false;
            }
            Method methodB2 = ReflectJvmMapping.b(((KMutableProperty) kCallable).c());
            if (!(methodB2 != null ? methodB2.isAccessible() : true)) {
                return false;
            }
        } else if (kCallable instanceof KProperty) {
            KProperty kProperty2 = (KProperty) kCallable;
            Field fieldA2 = ReflectJvmMapping.a(kProperty2);
            if (!(fieldA2 != null ? fieldA2.isAccessible() : true)) {
                return false;
            }
            Method methodB3 = ReflectJvmMapping.b(kProperty2.getGetter());
            if (!(methodB3 != null ? methodB3.isAccessible() : true)) {
                return false;
            }
        } else if (kCallable instanceof KProperty.Getter) {
            Field fieldA3 = ReflectJvmMapping.a(((KProperty.Getter) kCallable).m());
            if (!(fieldA3 != null ? fieldA3.isAccessible() : true)) {
                return false;
            }
            Method methodB4 = ReflectJvmMapping.b((KFunction) kCallable);
            if (!(methodB4 != null ? methodB4.isAccessible() : true)) {
                return false;
            }
        } else if (kCallable instanceof KMutableProperty.Setter) {
            Field fieldA4 = ReflectJvmMapping.a(((KMutableProperty.Setter) kCallable).m());
            if (!(fieldA4 != null ? fieldA4.isAccessible() : true)) {
                return false;
            }
            Method methodB5 = ReflectJvmMapping.b((KFunction) kCallable);
            if (!(methodB5 != null ? methodB5.isAccessible() : true)) {
                return false;
            }
        } else {
            if (!(kCallable instanceof KFunction)) {
                throw new UnsupportedOperationException("Unknown callable: " + kCallable + " (" + kCallable.getClass() + ')');
            }
            KFunction kFunction = (KFunction) kCallable;
            Method methodB6 = ReflectJvmMapping.b(kFunction);
            if (!(methodB6 != null ? methodB6.isAccessible() : true)) {
                return false;
            }
            KCallableImpl kCallableImplA = UtilKt.a(kCallable);
            Object f24299a = (kCallableImplA == null || (callerS = kCallableImplA.s()) == null) ? null : callerS.getF24299a();
            AccessibleObject accessibleObject = f24299a instanceof AccessibleObject ? (AccessibleObject) f24299a : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            KCallableImpl kCallableImplA2 = UtilKt.a(kFunction);
            Object f24299a2 = (kCallableImplA2 == null || (callerQ = kCallableImplA2.q()) == null) ? null : callerQ.getF24299a();
            Constructor constructor = f24299a2 instanceof Constructor ? (Constructor) f24299a2 : null;
            if (!(constructor != null ? constructor.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }
}
