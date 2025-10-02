package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

@SourceDebugExtension
/* loaded from: classes7.dex */
public class TypeCheckerState {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24610a;
    public final boolean b;
    public final TypeSystemContext c;
    public final AbstractTypePreparator d;
    public final AbstractTypeRefiner e;
    public int f;
    public ArrayDeque g;
    public SmartSet h;

    public interface ForkPointContext {

        public static final class Default implements ForkPointContext {

            /* renamed from: a, reason: collision with root package name */
            public boolean f24611a;

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.ForkPointContext
            public final void a(Function0 function0) {
                if (this.f24611a) {
                    return;
                }
                this.f24611a = ((Boolean) ((AbstractTypeChecker$$Lambda$1) function0).invoke()).booleanValue();
            }
        }

        void a(Function0 function0);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LowerCapturedTypePolicy {
        public static final /* synthetic */ LowerCapturedTypePolicy[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            LowerCapturedTypePolicy[] lowerCapturedTypePolicyArr = {new LowerCapturedTypePolicy("CHECK_ONLY_LOWER", 0), new LowerCapturedTypePolicy("CHECK_SUBTYPE_AND_LOWER", 1), new LowerCapturedTypePolicy("SKIP_LOWER", 2)};
            d = lowerCapturedTypePolicyArr;
            e = EnumEntriesKt.a(lowerCapturedTypePolicyArr);
        }

        public static LowerCapturedTypePolicy valueOf(String str) {
            return (LowerCapturedTypePolicy) Enum.valueOf(LowerCapturedTypePolicy.class, str);
        }

        public static LowerCapturedTypePolicy[] values() {
            return (LowerCapturedTypePolicy[]) d.clone();
        }
    }

    public static abstract class SupertypesPolicy {

        public static abstract class DoCustomTransform extends SupertypesPolicy {
        }

        @SourceDebugExtension
        public static final class LowerIfFlexible extends SupertypesPolicy {

            /* renamed from: a, reason: collision with root package name */
            public static final LowerIfFlexible f24612a = new LowerIfFlexible();

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            public final RigidTypeMarker a(TypeCheckerState state, KotlinTypeMarker type) {
                Intrinsics.h(state, "state");
                Intrinsics.h(type, "type");
                return state.c.M(type);
            }
        }

        public static final class None extends SupertypesPolicy {

            /* renamed from: a, reason: collision with root package name */
            public static final None f24613a = new None();

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            public final RigidTypeMarker a(TypeCheckerState state, KotlinTypeMarker type) {
                Intrinsics.h(state, "state");
                Intrinsics.h(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        @SourceDebugExtension
        public static final class UpperIfFlexible extends SupertypesPolicy {

            /* renamed from: a, reason: collision with root package name */
            public static final UpperIfFlexible f24614a = new UpperIfFlexible();

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            public final RigidTypeMarker a(TypeCheckerState state, KotlinTypeMarker type) {
                Intrinsics.h(state, "state");
                Intrinsics.h(type, "type");
                return state.c.i(type);
            }
        }

        public abstract RigidTypeMarker a(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker);
    }

    public TypeCheckerState(boolean z, boolean z2, ClassicTypeSystemContext typeSystemContext, KotlinTypePreparator kotlinTypePreparator, KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.h(typeSystemContext, "typeSystemContext");
        Intrinsics.h(kotlinTypePreparator, "kotlinTypePreparator");
        Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f24610a = z;
        this.b = z2;
        this.c = typeSystemContext;
        this.d = kotlinTypePreparator;
        this.e = kotlinTypeRefiner;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.g;
        Intrinsics.e(arrayDeque);
        arrayDeque.clear();
        SmartSet smartSet = this.h;
        Intrinsics.e(smartSet);
        smartSet.clear();
    }

    public boolean b(KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        return true;
    }

    public final void c() {
        if (this.g == null) {
            this.g = new ArrayDeque(4);
        }
        if (this.h == null) {
            int i = SmartSet.f;
            this.h = SmartSet.Companion.a();
        }
    }

    public final KotlinTypeMarker d(KotlinTypeMarker type) {
        Intrinsics.h(type, "type");
        return this.d.a(type);
    }
}
