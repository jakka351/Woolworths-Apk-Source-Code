package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface PackagePartProvider {

    public static final class Empty implements PackagePartProvider {

        /* renamed from: a, reason: collision with root package name */
        public static final Empty f24475a = new Empty();

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider
        public final void a(String packageFqName) {
            Intrinsics.h(packageFqName, "packageFqName");
        }
    }

    void a(String str);
}
