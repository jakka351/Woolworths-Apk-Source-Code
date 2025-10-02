package kotlin.reflect.jvm;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeBase;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ReflectJvmMapping {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                KotlinClassHeader.Kind.Companion companion = KotlinClassHeader.Kind.e;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KotlinClassHeader.Kind.Companion companion2 = KotlinClassHeader.Kind.e;
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KotlinClassHeader.Kind.Companion companion3 = KotlinClassHeader.Kind.e;
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public static final Field a(KProperty kProperty) {
        Intrinsics.h(kProperty, "<this>");
        KPropertyImpl kPropertyImplC = UtilKt.c(kProperty);
        if (kPropertyImplC != null) {
            return (Field) kPropertyImplC.n.getD();
        }
        return null;
    }

    public static final Method b(KFunction kFunction) {
        Caller callerQ;
        Intrinsics.h(kFunction, "<this>");
        KCallableImpl kCallableImplA = UtilKt.a(kFunction);
        Member f24299a = (kCallableImplA == null || (callerQ = kCallableImplA.q()) == null) ? null : callerQ.getF24299a();
        if (f24299a instanceof Method) {
            return (Method) f24299a;
        }
        return null;
    }

    public static final Type c(KType kType) {
        Type typeD;
        Intrinsics.h(kType, "<this>");
        Type typeD2 = ((KTypeImpl) kType).d();
        return typeD2 == null ? (!(kType instanceof KTypeBase) || (typeD = ((KTypeBase) kType).d()) == null) ? TypesJVMKt.b(kType, false) : typeD : typeD2;
    }
}
