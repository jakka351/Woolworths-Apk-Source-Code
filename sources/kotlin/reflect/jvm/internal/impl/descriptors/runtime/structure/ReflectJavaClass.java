package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import androidx.constraintlayout.core.state.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.EmptySequence;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ReflectJavaClass extends ReflectJavaElement implements ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner, JavaClass {

    /* renamed from: a, reason: collision with root package name */
    public final Class f24381a;

    public ReflectJavaClass(Class klass) {
        Intrinsics.h(klass, "klass");
        this.f24381a = klass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final boolean E() {
        return this.f24381a.isInterface();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final JavaAnnotation H(FqName fqName) {
        Annotation[] declaredAnnotations;
        Intrinsics.h(fqName, "fqName");
        Class cls = this.f24381a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return ReflectJavaAnnotationOwnerKt.a(declaredAnnotations, fqName);
    }

    public final Class I() {
        return this.f24381a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final Collection a() {
        Class cls;
        Class cls2 = this.f24381a;
        cls = Object.class;
        if (Intrinsics.c(cls2, cls)) {
            return EmptyList.d;
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        Type genericSuperclass = cls2.getGenericSuperclass();
        spreadBuilder.a(genericSuperclass != null ? genericSuperclass : Object.class);
        spreadBuilder.b(cls2.getGenericInterfaces());
        ArrayList arrayList = spreadBuilder.f24269a;
        List listR = CollectionsKt.R(arrayList.toArray(new Type[arrayList.size()]));
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(listR, 10));
        Iterator it = listR.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ReflectJavaClassifierType((Type) it.next()));
        }
        return arrayList2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final FqName d() {
        return ReflectClassUtilKt.a(this.f24381a).a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ReflectJavaClass) {
            return Intrinsics.c(this.f24381a, ((ReflectJavaClass) obj).f24381a);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public final boolean f() {
        return Modifier.isStatic(this.f24381a.getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class cls = this.f24381a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? EmptyList.d : ReflectJavaAnnotationOwnerKt.b(declaredAnnotations);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    public final Name getName() {
        Class cls = this.f24381a;
        if (!cls.isAnonymousClass()) {
            return Name.e(cls.getSimpleName());
        }
        String name = cls.getName();
        return Name.e(StringsKt.b0(name, ".", name));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f24381a.getTypeParameters();
        Intrinsics.g(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public final Visibility getVisibility() {
        int modifiers = this.f24381a.getModifiers();
        return Modifier.isPublic(modifiers) ? Visibilities.Public.c : Modifier.isPrivate(modifiers) ? Visibilities.Private.c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? JavaVisibilities.ProtectedStaticVisibility.c : JavaVisibilities.ProtectedAndPackage.c : JavaVisibilities.PackageVisibility.c;
    }

    public final int hashCode() {
        return this.f24381a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final boolean i() {
        return this.f24381a.isAnnotation();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public final boolean isAbstract() {
        return Modifier.isAbstract(this.f24381a.getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public final boolean isFinal() {
        return Modifier.isFinal(this.f24381a.getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final Collection l() {
        Class<?>[] declaredClasses = this.f24381a.getDeclaredClasses();
        Intrinsics.g(declaredClasses, "getDeclaredClasses(...)");
        return SequencesKt.x(SequencesKt.s(SequencesKt.h(ArraysKt.g(declaredClasses), ReflectJavaClass$$Lambda$0.d), ReflectJavaClass$$Lambda$1.d));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final Collection m() throws SecurityException {
        Method[] declaredMethods = this.f24381a.getDeclaredMethods();
        Intrinsics.g(declaredMethods, "getDeclaredMethods(...)");
        return SequencesKt.x(SequencesKt.r(SequencesKt.g(ArraysKt.g(declaredMethods), new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$$Lambda$2
            public final ReflectJavaClass d;

            {
                this.d = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
                    boolean r0 = r5.isSynthetic()
                    r1 = 0
                    if (r0 == 0) goto La
                    goto L4a
                La:
                    kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass r0 = r4.d
                    java.lang.Class r0 = r0.f24381a
                    boolean r0 = r0.isEnum()
                    r2 = 1
                    if (r0 == 0) goto L49
                    java.lang.String r0 = r5.getName()
                    java.lang.String r3 = "values"
                    boolean r3 = kotlin.jvm.internal.Intrinsics.c(r0, r3)
                    if (r3 == 0) goto L31
                    java.lang.Class[] r5 = r5.getParameterTypes()
                    java.lang.String r0 = "getParameterTypes(...)"
                    kotlin.jvm.internal.Intrinsics.g(r5, r0)
                    int r5 = r5.length
                    if (r5 != 0) goto L2f
                    r5 = r2
                    goto L47
                L2f:
                    r5 = r1
                    goto L47
                L31:
                    java.lang.String r3 = "valueOf"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.c(r0, r3)
                    if (r0 == 0) goto L2f
                    java.lang.Class[] r5 = r5.getParameterTypes()
                    java.lang.Class<java.lang.String> r0 = java.lang.String.class
                    java.lang.Class[] r0 = new java.lang.Class[]{r0}
                    boolean r5 = java.util.Arrays.equals(r5, r0)
                L47:
                    if (r5 != 0) goto L4a
                L49:
                    r1 = r2
                L4a:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$$Lambda$2.invoke(java.lang.Object):java.lang.Object");
            }
        }), ReflectJavaClass$methods$2.d));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final Collection n() throws SecurityException {
        Constructor<?>[] declaredConstructors = this.f24381a.getDeclaredConstructors();
        Intrinsics.g(declaredConstructors, "getDeclaredConstructors(...)");
        return SequencesKt.x(SequencesKt.r(SequencesKt.h(ArraysKt.g(declaredConstructors), ReflectJavaClass$constructors$1.d), ReflectJavaClass$constructors$2.d));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final Sequence o() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class clazz = this.f24381a;
        Intrinsics.h(clazz, "clazz");
        Method method = Java16SealedRecordLoader.a().b;
        Class[] clsArr = null;
        if (method != null) {
            Object objInvoke = method.invoke(clazz, null);
            Intrinsics.f(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
            clsArr = (Class[]) objInvoke;
        }
        if (clsArr == null) {
            return EmptySequence.f24658a;
        }
        ArrayList arrayList = new ArrayList(clsArr.length);
        for (Class cls : clsArr) {
            arrayList.add(new ReflectJavaClassifierType(cls));
        }
        return CollectionsKt.n(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final boolean p() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class clazz = this.f24381a;
        Intrinsics.h(clazz, "clazz");
        Method method = Java16SealedRecordLoader.a().f24374a;
        Boolean bool = null;
        if (method != null) {
            Object objInvoke = method.invoke(clazz, null);
            Intrinsics.f(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final ArrayList s() {
        Class clazz = this.f24381a;
        Intrinsics.h(clazz, "clazz");
        Method method = Java16SealedRecordLoader.a().d;
        Object[] objArr = method != null ? (Object[]) method.invoke(clazz, null) : null;
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new ReflectJavaRecordComponent(obj));
        }
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a.x(ReflectJavaClass.class, sb, ": ");
        sb.append(this.f24381a);
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final ReflectJavaClass u() {
        Class<?> declaringClass = this.f24381a.getDeclaringClass();
        if (declaringClass != null) {
            return new ReflectJavaClass(declaringClass);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final boolean v() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class clazz = this.f24381a;
        Intrinsics.h(clazz, "clazz");
        Method method = Java16SealedRecordLoader.a().c;
        Boolean bool = null;
        if (method != null) {
            Object objInvoke = method.invoke(clazz, null);
            Intrinsics.f(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final boolean y() {
        return this.f24381a.isEnum();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final Collection z() {
        Field[] declaredFields = this.f24381a.getDeclaredFields();
        Intrinsics.g(declaredFields, "getDeclaredFields(...)");
        return SequencesKt.x(SequencesKt.r(SequencesKt.h(ArraysKt.g(declaredFields), ReflectJavaClass$fields$1.d), ReflectJavaClass$fields$2.d));
    }
}
