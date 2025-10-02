package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class ReflectKotlinClassFinder implements KotlinClassFinder {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f24367a;

    public ReflectKotlinClassFinder(ClassLoader classLoader) {
        this.f24367a = classLoader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder
    public final KotlinClassFinder.Result.KotlinClass a(ClassId classId, MetadataVersion metadataVersion) {
        ReflectKotlinClass reflectKotlinClassA;
        Intrinsics.h(classId, "classId");
        Intrinsics.h(metadataVersion, "metadataVersion");
        String strR = StringsKt.R(classId.b.f24500a.f24501a, JwtParser.SEPARATOR_CHAR, '$');
        FqName fqName = classId.f24499a;
        if (!fqName.f24500a.c()) {
            strR = fqName + JwtParser.SEPARATOR_CHAR + strR;
        }
        Class clsA = ReflectJavaClassFinderKt.a(this.f24367a, strR);
        if (clsA == null || (reflectKotlinClassA = ReflectKotlinClass.Factory.a(clsA)) == null) {
            return null;
        }
        return new KotlinClassFinder.Result.KotlinClass(reflectKotlinClassA);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder
    public final KotlinClassFinder.Result.KotlinClass b(JavaClass javaClass, MetadataVersion metadataVersion) {
        String str;
        Class clsA;
        ReflectKotlinClass reflectKotlinClassA;
        Intrinsics.h(javaClass, "javaClass");
        Intrinsics.h(metadataVersion, "metadataVersion");
        FqName fqNameD = javaClass.d();
        if (fqNameD == null || (str = fqNameD.f24500a.f24501a) == null || (clsA = ReflectJavaClassFinderKt.a(this.f24367a, str)) == null || (reflectKotlinClassA = ReflectKotlinClass.Factory.a(clsA)) == null) {
            return null;
        }
        return new KotlinClassFinder.Result.KotlinClass(reflectKotlinClassA);
    }
}
