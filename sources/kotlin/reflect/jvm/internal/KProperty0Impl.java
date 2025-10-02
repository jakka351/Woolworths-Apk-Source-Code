package kotlin.reflect.jvm.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty0;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import kotlin.reflect.jvm.KCallablesJvm;
import kotlin.reflect.jvm.internal.KProperty0Impl;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\nB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty0Impl;", "V", "Lkotlin/reflect/KProperty0;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "Getter", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public class KProperty0Impl<V> extends KPropertyImpl<V> implements KProperty0<V> {
    public final Object q;
    public final Object r;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/KProperty0$Getter;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Getter<R> extends KPropertyImpl.Getter<R> implements KProperty0.Getter<R> {
        public final KProperty0Impl m;

        public Getter(KProperty0Impl kProperty0Impl) {
            this.m = kProperty0Impl;
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor
        public final KPropertyImpl D() {
            return this.m;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.m.get();
        }

        @Override // kotlin.reflect.KProperty.Accessor
        public final KProperty m() {
            return this.m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(KDeclarationContainerImpl kDeclarationContainerImpl, PropertyDescriptor descriptor) {
        super(kDeclarationContainerImpl, descriptor);
        Intrinsics.h(descriptor, "descriptor");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.d;
        this.q = LazyKt.a(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KProperty0Impl$$Lambda$0
            public final KProperty0Impl d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new KProperty0Impl.Getter(this.d);
            }
        });
        this.r = LazyKt.a(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KProperty0Impl$$Lambda$1
            public final KProperty0Impl d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws IllegalPropertyDelegateAccessException, SecurityException {
                KProperty0Impl kProperty0Impl = this.d;
                Object objC = kProperty0Impl.C();
                try {
                    Object obj = KPropertyImpl.p;
                    Object objA = kProperty0Impl.A() ? ValueClassAwareCallerKt.a(kProperty0Impl.m, kProperty0Impl.t()) : null;
                    if (objA == obj) {
                        objA = null;
                    }
                    kProperty0Impl.A();
                    AccessibleObject accessibleObject = objC != null ? (AccessibleObject) objC : null;
                    if (accessibleObject != null) {
                        accessibleObject.setAccessible(KCallablesJvm.a(kProperty0Impl));
                    }
                    if (objC == null) {
                        return null;
                    }
                    if (objC instanceof Field) {
                        return ((Field) objC).get(objA);
                    }
                    if (!(objC instanceof Method)) {
                        throw new AssertionError("delegate field/method " + objC + " neither field nor method");
                    }
                    int length = ((Method) objC).getParameterTypes().length;
                    if (length == 0) {
                        return ((Method) objC).invoke(null, null);
                    }
                    if (length == 1) {
                        Method method = (Method) objC;
                        if (objA == null) {
                            Class<?> cls = ((Method) objC).getParameterTypes()[0];
                            Intrinsics.g(cls, "get(...)");
                            objA = UtilKt.e(cls);
                        }
                        return method.invoke(null, objA);
                    }
                    if (length == 2) {
                        Method method2 = (Method) objC;
                        Class<?> cls2 = ((Method) objC).getParameterTypes()[1];
                        Intrinsics.g(cls2, "get(...)");
                        return method2.invoke(null, objA, UtilKt.e(cls2));
                    }
                    throw new AssertionError("delegate method " + objC + " should take 0, 1, or 2 parameters");
                } catch (IllegalAccessException e) {
                    throw new IllegalPropertyDelegateAccessException("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.KPropertyImpl
    public final KPropertyImpl.Getter E() {
        return (Getter) this.q.getD();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KProperty0
    public final Object get() {
        return ((Getter) this.q.getD()).call(new Object[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KProperty0
    public final Object getDelegate() {
        return this.r.getD();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KProperty
    public final KProperty.Getter getGetter() {
        return (Getter) this.q.getD();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KProperty
    public final KProperty0.Getter getGetter() {
        return (Getter) this.q.getD();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(KDeclarationContainerImpl kDeclarationContainerImpl, String name, String signature, Object obj) {
        super(kDeclarationContainerImpl, name, signature, obj);
        Intrinsics.h(name, "name");
        Intrinsics.h(signature, "signature");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.d;
        this.q = LazyKt.a(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KProperty0Impl$$Lambda$0
            public final KProperty0Impl d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new KProperty0Impl.Getter(this.d);
            }
        });
        this.r = LazyKt.a(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KProperty0Impl$$Lambda$1
            public final KProperty0Impl d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws IllegalPropertyDelegateAccessException, SecurityException {
                KProperty0Impl kProperty0Impl = this.d;
                Object objC = kProperty0Impl.C();
                try {
                    Object obj2 = KPropertyImpl.p;
                    Object objA = kProperty0Impl.A() ? ValueClassAwareCallerKt.a(kProperty0Impl.m, kProperty0Impl.t()) : null;
                    if (objA == obj2) {
                        objA = null;
                    }
                    kProperty0Impl.A();
                    AccessibleObject accessibleObject = objC != null ? (AccessibleObject) objC : null;
                    if (accessibleObject != null) {
                        accessibleObject.setAccessible(KCallablesJvm.a(kProperty0Impl));
                    }
                    if (objC == null) {
                        return null;
                    }
                    if (objC instanceof Field) {
                        return ((Field) objC).get(objA);
                    }
                    if (!(objC instanceof Method)) {
                        throw new AssertionError("delegate field/method " + objC + " neither field nor method");
                    }
                    int length = ((Method) objC).getParameterTypes().length;
                    if (length == 0) {
                        return ((Method) objC).invoke(null, null);
                    }
                    if (length == 1) {
                        Method method = (Method) objC;
                        if (objA == null) {
                            Class<?> cls = ((Method) objC).getParameterTypes()[0];
                            Intrinsics.g(cls, "get(...)");
                            objA = UtilKt.e(cls);
                        }
                        return method.invoke(null, objA);
                    }
                    if (length == 2) {
                        Method method2 = (Method) objC;
                        Class<?> cls2 = ((Method) objC).getParameterTypes()[1];
                        Intrinsics.g(cls2, "get(...)");
                        return method2.invoke(null, objA, UtilKt.e(cls2));
                    }
                    throw new AssertionError("delegate method " + objC + " should take 0, 1, or 2 parameters");
                } catch (IllegalAccessException e) {
                    throw new IllegalPropertyDelegateAccessException("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e);
                }
            }
        });
    }
}
