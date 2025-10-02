package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes7.dex */
public interface DeclaredMemberIndex {

    public static final class Empty implements DeclaredMemberIndex {

        /* renamed from: a, reason: collision with root package name */
        public static final Empty f24430a = new Empty();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public final Set a() {
            return EmptySet.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public final Set b() {
            return EmptySet.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public final JavaField c(Name name) {
            Intrinsics.h(name, "name");
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public final Set d() {
            return EmptySet.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public final Collection e(Name name) {
            Intrinsics.h(name, "name");
            return EmptyList.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public final JavaRecordComponent f(Name name) {
            Intrinsics.h(name, "name");
            return null;
        }
    }

    Set a();

    Set b();

    JavaField c(Name name);

    Set d();

    Collection e(Name name);

    JavaRecordComponent f(Name name);
}
