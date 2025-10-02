package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.camera.core.impl.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes7.dex */
final class JvmTypeFactoryImpl implements JvmTypeFactory<JvmType> {

    /* renamed from: a, reason: collision with root package name */
    public static final JvmTypeFactoryImpl f24472a = new JvmTypeFactoryImpl();

    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.l.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.n.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.o.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.p.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static JvmType a(String representation) {
        JvmPrimitiveType jvmPrimitiveType;
        Intrinsics.h(representation, "representation");
        char cCharAt = representation.charAt(0);
        JvmPrimitiveType[] jvmPrimitiveTypeArrValues = JvmPrimitiveType.values();
        int length = jvmPrimitiveTypeArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jvmPrimitiveType = null;
                break;
            }
            jvmPrimitiveType = jvmPrimitiveTypeArrValues[i];
            if (jvmPrimitiveType.c().charAt(0) == cCharAt) {
                break;
            }
            i++;
        }
        if (jvmPrimitiveType != null) {
            return new JvmType.Primitive(jvmPrimitiveType);
        }
        if (cCharAt == 'V') {
            return new JvmType.Primitive(null);
        }
        if (cCharAt == '[') {
            String strSubstring = representation.substring(1);
            Intrinsics.g(strSubstring, "substring(...)");
            return new JvmType.Array(a(strSubstring));
        }
        if (cCharAt == 'L') {
            StringsKt.w(representation, ';');
        }
        String strSubstring2 = representation.substring(1, representation.length() - 1);
        Intrinsics.g(strSubstring2, "substring(...)");
        return new JvmType.Object(strSubstring2);
    }

    public static String c(JvmType type) {
        String strC;
        Intrinsics.h(type, "type");
        if (type instanceof JvmType.Array) {
            return "[" + c(((JvmType.Array) type).i);
        }
        if (type instanceof JvmType.Primitive) {
            JvmPrimitiveType jvmPrimitiveType = ((JvmType.Primitive) type).i;
            return (jvmPrimitiveType == null || (strC = jvmPrimitiveType.c()) == null) ? "V" : strC;
        }
        if (type instanceof JvmType.Object) {
            return b.r(new StringBuilder("L"), ((JvmType.Object) type).i, ';');
        }
        throw new NoWhenBranchMatchedException();
    }

    public final JvmType.Object b(String internalName) {
        Intrinsics.h(internalName, "internalName");
        return new JvmType.Object(internalName);
    }
}
