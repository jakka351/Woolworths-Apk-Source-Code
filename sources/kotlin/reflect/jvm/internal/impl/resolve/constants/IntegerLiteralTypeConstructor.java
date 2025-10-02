package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class IntegerLiteralTypeConstructor implements TypeConstructor {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f24540a;
    public final Lazy b;

    @SourceDebugExtension
    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Mode {
            public static final /* synthetic */ Mode[] d;
            public static final /* synthetic */ EnumEntries e;

            static {
                Mode[] modeArr = {new Mode("COMMON_SUPER_TYPE", 0), new Mode("INTERSECTION_TYPE", 1)};
                d = modeArr;
                e = EnumEntriesKt.a(modeArr);
            }

            public static Mode valueOf(String str) {
                return (Mode) Enum.valueOf(Mode.class, str);
            }

            public static Mode[] values() {
                return (Mode[]) d.clone();
            }
        }

        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[Mode.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    Mode[] modeArr = Mode.d;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v17, types: [kotlin.reflect.jvm.internal.impl.types.SimpleType] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.SimpleType] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.util.LinkedHashSet, java.util.Set] */
        public static SimpleType a(ArrayList arrayList) {
            Mode[] modeArr = Mode.d;
            if (arrayList.isEmpty()) {
                return null;
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            ?? next = it.next();
            while (it.hasNext()) {
                SimpleType simpleType = (SimpleType) it.next();
                next = (SimpleType) next;
                if (next != 0 && simpleType != null) {
                    TypeConstructor typeConstructorJ0 = next.J0();
                    TypeConstructor typeConstructorJ02 = simpleType.J0();
                    boolean z = typeConstructorJ0 instanceof IntegerLiteralTypeConstructor;
                    if (z && (typeConstructorJ02 instanceof IntegerLiteralTypeConstructor)) {
                        IntegerLiteralTypeConstructor integerLiteralTypeConstructor = new IntegerLiteralTypeConstructor(CollectionsKt.N0(((IntegerLiteralTypeConstructor) typeConstructorJ0).f24540a, ((IntegerLiteralTypeConstructor) typeConstructorJ02).f24540a));
                        TypeAttributes.e.getClass();
                        TypeAttributes attributes = TypeAttributes.f;
                        Intrinsics.h(attributes, "attributes");
                        next = KotlinTypeFactory.e(EmptyList.d, ErrorUtils.a(ErrorScopeKind.f, true, "unknown integer literal type"), attributes, integerLiteralTypeConstructor, false);
                    } else if (z) {
                        if (((IntegerLiteralTypeConstructor) typeConstructorJ0).f24540a.contains(simpleType)) {
                            next = simpleType;
                        }
                    } else if (!(typeConstructorJ02 instanceof IntegerLiteralTypeConstructor) || !((IntegerLiteralTypeConstructor) typeConstructorJ02).f24540a.contains(next)) {
                    }
                }
                next = 0;
            }
            return (SimpleType) next;
        }
    }

    public IntegerLiteralTypeConstructor(LinkedHashSet linkedHashSet) {
        TypeAttributes.e.getClass();
        TypeAttributes attributes = TypeAttributes.f;
        Intrinsics.h(attributes, "attributes");
        KotlinTypeFactory.e(EmptyList.d, ErrorUtils.a(ErrorScopeKind.f, true, "unknown integer literal type"), attributes, this, false);
        this.b = LazyKt.b(new IntegerLiteralTypeConstructor$$Lambda$0());
        this.f24540a = linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final Collection a() {
        return (List) this.b.getD();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final ClassifierDescriptor c() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean d() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        return EmptyList.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final KotlinBuiltIns p() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegerLiteralType");
        sb.append("[" + CollectionsKt.M(this.f24540a, ",", null, null, IntegerLiteralTypeConstructor$$Lambda$1.d, 30) + ']');
        return sb.toString();
    }
}
