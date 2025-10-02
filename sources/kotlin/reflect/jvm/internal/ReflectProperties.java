package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* loaded from: classes.dex */
public class ReflectProperties {

    public static class LazySoftVal<T> extends Val<T> implements Function0<T> {
        public final Function0 e;
        public volatile SoftReference f;

        public LazySoftVal(Object obj, Function0 function0) {
            if (function0 == null) {
                throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
            }
            this.f = null;
            this.e = function0;
            if (obj != null) {
                this.f = new SoftReference(obj);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object obj;
            Object obj2 = Val.d;
            SoftReference softReference = this.f;
            if (softReference != null && (obj = softReference.get()) != null) {
                if (obj == obj2) {
                    return null;
                }
                return obj;
            }
            Object objInvoke = this.e.invoke();
            if (objInvoke != null) {
                obj2 = objInvoke;
            }
            this.f = new SoftReference(obj2);
            return objInvoke;
        }
    }

    public static abstract class Val<T> {
        public static final Object d = new AnonymousClass1();

        /* renamed from: kotlin.reflect.jvm.internal.ReflectProperties$Val$1, reason: invalid class name */
        public static class AnonymousClass1 {
        }
    }

    public static LazySoftVal a(CallableMemberDescriptor callableMemberDescriptor, Function0 function0) {
        if (function0 != null) {
            return new LazySoftVal(callableMemberDescriptor, function0);
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
    }
}
