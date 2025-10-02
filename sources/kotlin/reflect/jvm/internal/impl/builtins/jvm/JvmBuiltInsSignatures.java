package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class JvmBuiltInsSignatures {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f24330a = SetsKt.h(SignatureBuildingComponents.d("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
    public static final LinkedHashSet b;
    public static final LinkedHashSet c;
    public static final LinkedHashSet d;
    public static final LinkedHashSet e;
    public static final LinkedHashSet f;
    public static final LinkedHashSet g;

    static {
        List<JvmPrimitiveType> listR = CollectionsKt.R(JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JvmPrimitiveType jvmPrimitiveType : listR) {
            FqName fqName = jvmPrimitiveType.g;
            if (fqName == null) {
                JvmPrimitiveType.a(15);
                throw null;
            }
            String strB = fqName.f24500a.f().b();
            Intrinsics.g(strB, "asString(...)");
            CollectionsKt.h(SignatureBuildingComponents.c(strB, jvmPrimitiveType.e + "Value()" + jvmPrimitiveType.c()), linkedHashSet);
        }
        b = SetsKt.g(SetsKt.g(SetsKt.g(SetsKt.g(SetsKt.g(SetsKt.g(linkedHashSet, SignatureBuildingComponents.d("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), SignatureBuildingComponents.c("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), SignatureBuildingComponents.c("Double", "isInfinite()Z", "isNaN()Z")), SignatureBuildingComponents.c("Float", "isInfinite()Z", "isNaN()Z")), SignatureBuildingComponents.c("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), SignatureBuildingComponents.c("CharSequence", "isEmpty()Z"));
        c = SignatureBuildingComponents.d("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        d = SetsKt.g(SetsKt.g(SetsKt.g(SetsKt.g(SetsKt.g(SetsKt.g(SignatureBuildingComponents.c("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), SignatureBuildingComponents.d("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), SignatureBuildingComponents.c("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), SignatureBuildingComponents.c("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), SignatureBuildingComponents.d("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), SignatureBuildingComponents.d("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), SignatureBuildingComponents.d("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        e = SetsKt.g(SetsKt.g(SignatureBuildingComponents.d("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), SignatureBuildingComponents.d("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), SignatureBuildingComponents.d("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.BOOLEAN;
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.BYTE;
        List listR2 = CollectionsKt.R(jvmPrimitiveType2, jvmPrimitiveType3, JvmPrimitiveType.DOUBLE, JvmPrimitiveType.FLOAT, jvmPrimitiveType3, JvmPrimitiveType.INT, JvmPrimitiveType.LONG, JvmPrimitiveType.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = listR2.iterator();
        while (it.hasNext()) {
            FqName fqName2 = ((JvmPrimitiveType) it.next()).g;
            if (fqName2 == null) {
                JvmPrimitiveType.a(15);
                throw null;
            }
            String strB2 = fqName2.f24500a.f().b();
            Intrinsics.g(strB2, "asString(...)");
            String[] strArrA = SignatureBuildingComponents.a("Ljava/lang/String;");
            CollectionsKt.h(SignatureBuildingComponents.c(strB2, (String[]) Arrays.copyOf(strArrA, strArrA.length)), linkedHashSet2);
        }
        String[] strArrA2 = SignatureBuildingComponents.a("D");
        LinkedHashSet linkedHashSetG = SetsKt.g(linkedHashSet2, SignatureBuildingComponents.c("Float", (String[]) Arrays.copyOf(strArrA2, strArrA2.length)));
        String[] strArrA3 = SignatureBuildingComponents.a("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f = SetsKt.g(linkedHashSetG, SignatureBuildingComponents.c("String", (String[]) Arrays.copyOf(strArrA3, strArrA3.length)));
        String[] strArrA4 = SignatureBuildingComponents.a("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        g = SignatureBuildingComponents.c("Throwable", (String[]) Arrays.copyOf(strArrA4, strArrA4.length));
    }

    public static LinkedHashSet a() {
        return f;
    }

    public static LinkedHashSet b() {
        return e;
    }

    public static LinkedHashSet c() {
        return g;
    }

    public static boolean d(FqNameUnsafe fqNameUnsafe) {
        return fqNameUnsafe.equals(StandardNames.FqNames.g) || StandardNames.FqNames.g0.get(fqNameUnsafe) != null;
    }

    public static boolean e(FqNameUnsafe fqNameUnsafe) {
        if (d(fqNameUnsafe)) {
            return true;
        }
        String str = JavaToKotlinClassMap.f24321a;
        ClassId classIdE = JavaToKotlinClassMap.e(fqNameUnsafe);
        if (classIdE == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(classIdE.a().f24500a.f24501a));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
