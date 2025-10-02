package kotlin.jvm.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;

@SinceKotlin
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/jvm/internal/TypeParameterReference;", "Lkotlin/reflect/KTypeParameter;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class TypeParameterReference implements KTypeParameter {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/jvm/internal/TypeParameterReference$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[KVariance.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    KVariance kVariance = KVariance.d;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    KVariance kVariance2 = KVariance.d;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        public static String a(KTypeParameter kTypeParameter) {
            StringBuilder sb = new StringBuilder();
            int iOrdinal = kTypeParameter.j().ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    sb.append("in ");
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sb.append("out ");
                }
            }
            sb.append(kTypeParameter.getName());
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        return obj instanceof TypeParameterReference;
    }

    @Override // kotlin.reflect.KTypeParameter
    public final String getName() {
        return null;
    }

    @Override // kotlin.reflect.KTypeParameter
    public final List getUpperBounds() {
        return null;
    }

    public final int hashCode() {
        Object obj = null;
        obj.getClass();
        throw null;
    }

    @Override // kotlin.reflect.KTypeParameter
    public final KVariance j() {
        return null;
    }

    public final String toString() {
        return Companion.a(this);
    }
}
