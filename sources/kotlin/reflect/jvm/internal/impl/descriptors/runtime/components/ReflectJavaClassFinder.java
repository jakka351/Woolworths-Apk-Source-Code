package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaPackage;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class ReflectJavaClassFinder implements JavaClassFinder {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f24365a;

    public ReflectJavaClassFinder(ClassLoader classLoader) {
        this.f24365a = classLoader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    public final ReflectJavaPackage a(FqName fqName) {
        Intrinsics.h(fqName, "fqName");
        return new ReflectJavaPackage(fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    public final void b(FqName packageFqName) {
        Intrinsics.h(packageFqName, "packageFqName");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    public final ReflectJavaClass c(JavaClassFinder.Request request) {
        ClassId classIdA = request.a();
        FqName fqName = classIdA.f24499a;
        String strR = StringsKt.R(classIdA.b.f24500a.f24501a, JwtParser.SEPARATOR_CHAR, '$');
        if (!fqName.f24500a.c()) {
            strR = fqName.f24500a.f24501a + JwtParser.SEPARATOR_CHAR + strR;
        }
        Class clsA = ReflectJavaClassFinderKt.a(this.f24365a, strR);
        if (clsA != null) {
            return new ReflectJavaClass(clsA);
        }
        return null;
    }
}
