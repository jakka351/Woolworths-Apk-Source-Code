package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.camera.core.impl.b;
import com.medallia.digital.mobilesdk.q2;
import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class JvmPackagePartSource implements DeserializedContainerSource {
    public final JvmClassName b;
    public final JvmClassName c;
    public final KotlinJvmBinaryClass d;

    public JvmPackagePartSource(KotlinJvmBinaryClass kotlinClass, ProtoBuf.Package packageProto, JvmNameResolver nameResolver, DeserializedContainerAbiStability deserializedContainerAbiStability) {
        Intrinsics.h(kotlinClass, "kotlinClass");
        Intrinsics.h(packageProto, "packageProto");
        Intrinsics.h(nameResolver, "nameResolver");
        JvmClassName jvmClassName = new JvmClassName(JvmClassName.e(kotlinClass.c()));
        KotlinClassHeader kotlinClassHeaderA = kotlinClass.a();
        JvmClassName jvmClassNameC = null;
        String str = kotlinClassHeaderA.f24478a != KotlinClassHeader.Kind.l ? null : kotlinClassHeaderA.f;
        if (str != null && str.length() > 0) {
            jvmClassNameC = JvmClassName.c(str);
        }
        this.b = jvmClassName;
        this.c = jvmClassNameC;
        this.d = kotlinClass;
        GeneratedMessageLite.GeneratedExtension packageModuleName = JvmProtoBuf.m;
        Intrinsics.g(packageModuleName, "packageModuleName");
        Integer num = (Integer) ProtoBufUtilKt.a(packageProto, packageModuleName);
        if (num != null) {
            nameResolver.getString(num.intValue());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource
    public final String a() {
        return b.r(new StringBuilder("Class '"), c().a().f24500a.f24501a, '\'');
    }

    public final ClassId c() {
        FqName fqName;
        JvmClassName jvmClassName = this.b;
        String str = jvmClassName.f24548a;
        int iLastIndexOf = str.lastIndexOf(q2.c);
        if (iLastIndexOf == -1) {
            fqName = FqName.c;
            if (fqName == null) {
                JvmClassName.a(9);
                throw null;
            }
        } else {
            fqName = new FqName(str.substring(0, iLastIndexOf).replace('/', JwtParser.SEPARATOR_CHAR));
        }
        String strD = jvmClassName.d();
        Intrinsics.g(strD, "getInternalName(...)");
        return new ClassId(fqName, Name.e(StringsKt.a0('/', strD, strD)));
    }

    public final JvmClassName d() {
        return this.c;
    }

    public final KotlinJvmBinaryClass e() {
        return this.d;
    }

    public final String toString() {
        return "JvmPackagePartSource: " + this.b;
    }
}
