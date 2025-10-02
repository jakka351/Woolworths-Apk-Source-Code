package kotlin.reflect.jvm.internal.impl.descriptors.java;

import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;

/* loaded from: classes7.dex */
public final class JavaVisibilities {

    public static final class PackageVisibility extends Visibility {
        public static final PackageVisibility c = new PackageVisibility("package", false);

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final Integer a(Visibility visibility) {
            Intrinsics.h(visibility, "visibility");
            if (this == visibility) {
                return 0;
            }
            MapBuilder mapBuilder = Visibilities.f24346a;
            return (visibility == Visibilities.Private.c || visibility == Visibilities.PrivateToThis.c) ? 1 : -1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final String b() {
            return "public/*package*/";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final Visibility c() {
            return Visibilities.Protected.c;
        }
    }

    public static final class ProtectedAndPackage extends Visibility {
        public static final ProtectedAndPackage c = new ProtectedAndPackage("protected_and_package", true);

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final Integer a(Visibility visibility) {
            Intrinsics.h(visibility, "visibility");
            if (equals(visibility)) {
                return 0;
            }
            if (visibility == Visibilities.Internal.c) {
                return null;
            }
            MapBuilder mapBuilder = Visibilities.f24346a;
            return (visibility == Visibilities.Private.c || visibility == Visibilities.PrivateToThis.c) ? 1 : -1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final String b() {
            return "protected/*protected and package*/";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final Visibility c() {
            return Visibilities.Protected.c;
        }
    }

    public static final class ProtectedStaticVisibility extends Visibility {
        public static final ProtectedStaticVisibility c = new ProtectedStaticVisibility("protected_static", true);

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final String b() {
            return "protected/*protected static*/";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final Visibility c() {
            return Visibilities.Protected.c;
        }
    }
}
