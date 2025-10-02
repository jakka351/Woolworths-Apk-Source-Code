package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.StringsKt;

/* loaded from: classes7.dex */
public final class JvmAbi {

    /* renamed from: a, reason: collision with root package name */
    public static final FqName f24407a;
    public static final ClassId b;

    static {
        FqName fqName = new FqName("kotlin.jvm.JvmField");
        f24407a = fqName;
        ClassId.Companion.b(fqName);
        ClassId.Companion.b(new FqName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        b = ClassId.Companion.a("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String a(String propertyName) {
        Intrinsics.h(propertyName, "propertyName");
        if (c(propertyName)) {
            return propertyName;
        }
        return "get" + CapitalizeDecapitalizeKt.a(propertyName);
    }

    public static final String b(String str) {
        String strA;
        StringBuilder sb = new StringBuilder("set");
        if (c(str)) {
            strA = str.substring(2);
            Intrinsics.g(strA, "substring(...)");
        } else {
            strA = CapitalizeDecapitalizeKt.a(str);
        }
        sb.append(strA);
        return sb.toString();
    }

    public static final boolean c(String name) {
        Intrinsics.h(name, "name");
        if (StringsKt.W(name, "is", false) && name.length() != 2) {
            char cCharAt = name.charAt(2);
            if (Intrinsics.j(97, cCharAt) > 0 || Intrinsics.j(cCharAt, 122) > 0) {
                return true;
            }
        }
        return false;
    }
}
