package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ReflectJavaRecordComponent extends ReflectJavaMember implements JavaRecordComponent {

    /* renamed from: a, reason: collision with root package name */
    public final Object f24388a;

    public ReflectJavaRecordComponent(Object recordComponent) {
        Intrinsics.h(recordComponent, "recordComponent");
        this.f24388a = recordComponent;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    public final Member I() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object recordComponent = this.f24388a;
        Intrinsics.h(recordComponent, "recordComponent");
        Method method = Java16RecordComponentsLoader.a(recordComponent).b;
        Method method2 = null;
        if (method != null) {
            Object objInvoke = method.invoke(recordComponent, null);
            Intrinsics.f(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method2 = (Method) objInvoke;
        }
        if (method2 != null) {
            return method2;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent
    public final JavaType getType() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object recordComponent = this.f24388a;
        Intrinsics.h(recordComponent, "recordComponent");
        Method method = Java16RecordComponentsLoader.a(recordComponent).f24372a;
        Class cls = null;
        if (method != null) {
            Object objInvoke = method.invoke(recordComponent, null);
            Intrinsics.f(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new ReflectJavaClassifierType(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
