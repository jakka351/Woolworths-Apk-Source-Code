package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* loaded from: classes.dex */
public interface SupertypeLoopChecker {

    public static final class EMPTY implements SupertypeLoopChecker {

        /* renamed from: a, reason: collision with root package name */
        public static final EMPTY f24345a = new EMPTY();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker
        public final Collection a(TypeConstructor typeConstructor, Collection superTypes, Function1 function1, Function1 function12) {
            Intrinsics.h(superTypes, "superTypes");
            return superTypes;
        }
    }

    Collection a(TypeConstructor typeConstructor, Collection collection, Function1 function1, Function1 function12);
}
