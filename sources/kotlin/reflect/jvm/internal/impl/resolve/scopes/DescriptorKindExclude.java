package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;

/* loaded from: classes7.dex */
public abstract class DescriptorKindExclude {

    public static final class NonExtensions extends DescriptorKindExclude {

        /* renamed from: a, reason: collision with root package name */
        public static final NonExtensions f24552a = new NonExtensions();
        public static final int b;

        static {
            DescriptorKindFilter.Companion companion = DescriptorKindFilter.c;
            companion.getClass();
            int i = DescriptorKindFilter.k;
            companion.getClass();
            int i2 = DescriptorKindFilter.i;
            companion.getClass();
            b = (~(DescriptorKindFilter.j | i2)) & i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        public final int a() {
            return b;
        }
    }

    public static final class TopLevelPackages extends DescriptorKindExclude {

        /* renamed from: a, reason: collision with root package name */
        public static final TopLevelPackages f24553a = new TopLevelPackages();

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        public final int a() {
            return 0;
        }
    }

    public abstract int a();

    public final String toString() {
        return getClass().getSimpleName();
    }
}
