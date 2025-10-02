package kotlin.jvm.internal;

import androidx.camera.core.impl.b;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KVariance;

@SinceKotlin
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/jvm/internal/TypeReference;", "Lkotlin/reflect/KType;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TypeReference implements KType {
    public final KClassifier d;
    public final List e;
    public final int f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lkotlin/jvm/internal/TypeReference$Companion;", "", "", "IS_MARKED_NULLABLE", "I", "IS_MUTABLE_COLLECTION_TYPE", "IS_NOTHING_TYPE", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24270a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                KVariance kVariance = KVariance.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KVariance kVariance2 = KVariance.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KVariance kVariance3 = KVariance.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f24270a = iArr;
        }
    }

    public TypeReference(KClassifier classifier, List arguments, boolean z) {
        Intrinsics.h(classifier, "classifier");
        Intrinsics.h(arguments, "arguments");
        this.d = classifier;
        this.e = arguments;
        this.f = z ? 1 : 0;
    }

    @Override // kotlin.reflect.KType
    /* renamed from: b, reason: from getter */
    public final List getE() {
        return this.e;
    }

    @Override // kotlin.reflect.KType
    /* renamed from: e, reason: from getter */
    public final KClassifier getD() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeReference)) {
            return false;
        }
        TypeReference typeReference = (TypeReference) obj;
        return Intrinsics.c(this.d, typeReference.d) && Intrinsics.c(this.e, typeReference.e) && this.f == typeReference.f;
    }

    public final String h(boolean z) {
        String name;
        KClassifier kClassifier = this.d;
        KClass kClass = kClassifier instanceof KClass ? (KClass) kClassifier : null;
        Class clsB = kClass != null ? JvmClassMappingKt.b(kClass) : null;
        if (clsB == null) {
            name = kClassifier.toString();
        } else if (clsB.isArray()) {
            name = clsB.equals(boolean[].class) ? "kotlin.BooleanArray" : clsB.equals(char[].class) ? "kotlin.CharArray" : clsB.equals(byte[].class) ? "kotlin.ByteArray" : clsB.equals(short[].class) ? "kotlin.ShortArray" : clsB.equals(int[].class) ? "kotlin.IntArray" : clsB.equals(float[].class) ? "kotlin.FloatArray" : clsB.equals(long[].class) ? "kotlin.LongArray" : clsB.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        } else if (z && clsB.isPrimitive()) {
            Intrinsics.f(kClassifier, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = JvmClassMappingKt.c((KClass) kClassifier).getName();
        } else {
            name = clsB.getName();
        }
        List list = this.e;
        return b.o(name, list.isEmpty() ? "" : CollectionsKt.M(list, ", ", "<", ">", new i(this, 26), 24), l() ? "?" : "");
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + b.d(this.d.hashCode() * 31, 31, this.e);
    }

    @Override // kotlin.reflect.KType
    public final boolean l() {
        return (this.f & 1) != 0;
    }

    public final String toString() {
        return h(false) + " (Kotlin reflection is not available)";
    }
}
