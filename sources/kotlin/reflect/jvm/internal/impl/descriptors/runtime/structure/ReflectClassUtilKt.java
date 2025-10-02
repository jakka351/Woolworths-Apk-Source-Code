package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import io.jsonwebtoken.JwtParser;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class ReflectClassUtilKt {

    /* renamed from: a, reason: collision with root package name */
    public static final List f24377a;
    public static final Map b;
    public static final Map c;
    public static final Map d;

    static {
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        int i = 0;
        List listR = CollectionsKt.R(reflectionFactory.b(Boolean.TYPE), reflectionFactory.b(Byte.TYPE), reflectionFactory.b(Character.TYPE), reflectionFactory.b(Double.TYPE), reflectionFactory.b(Float.TYPE), reflectionFactory.b(Integer.TYPE), reflectionFactory.b(Long.TYPE), reflectionFactory.b(Short.TYPE));
        f24377a = listR;
        List<KClass> list = listR;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (KClass kClass : list) {
            arrayList.add(new Pair(JvmClassMappingKt.c(kClass), JvmClassMappingKt.d(kClass)));
        }
        b = MapsKt.p(arrayList);
        List<KClass> list2 = f24377a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
        for (KClass kClass2 : list2) {
            arrayList2.add(new Pair(JvmClassMappingKt.d(kClass2), JvmClassMappingKt.c(kClass2)));
        }
        c = MapsKt.p(arrayList2);
        List listR2 = CollectionsKt.R(Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(listR2, 10));
        for (Object obj : listR2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            arrayList3.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        d = MapsKt.p(arrayList3);
    }

    public static final ClassId a(Class cls) {
        Intrinsics.h(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null && cls.getSimpleName().length() != 0) {
            Class<?> declaringClass = cls.getDeclaringClass();
            return declaringClass != null ? a(declaringClass).d(Name.e(cls.getSimpleName())) : ClassId.Companion.b(new FqName(cls.getName()));
        }
        FqName fqName = new FqName(cls.getName());
        return new ClassId(fqName.b(), FqName.Companion.a(fqName.f24500a.f()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final String b(Class cls) {
        Intrinsics.h(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return StringsKt.R(cls.getName(), JwtParser.SEPARATOR_CHAR, '/');
            }
            return "L" + StringsKt.R(cls.getName(), JwtParser.SEPARATOR_CHAR, '/') + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final List c(Type type) {
        Intrinsics.h(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return EmptyList.d;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return SequencesKt.x(SequencesKt.j(SequencesKt.m(type, ReflectClassUtilKt$$Lambda$0.d), ReflectClassUtilKt$$Lambda$1.d));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.g(actualTypeArguments, "getActualTypeArguments(...)");
        return ArraysKt.l0(actualTypeArguments);
    }

    public static final ClassLoader d(Class cls) {
        Intrinsics.h(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Intrinsics.g(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }
}
