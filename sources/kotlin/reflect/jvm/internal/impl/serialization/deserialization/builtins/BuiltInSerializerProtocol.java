package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class BuiltInSerializerProtocol extends SerializerExtensionProtocol {
    public static final BuiltInSerializerProtocol m;

    static {
        ExtensionRegistryLite extensionRegistryLite = new ExtensionRegistryLite();
        BuiltInsProtoBuf.a(extensionRegistryLite);
        GeneratedMessageLite.GeneratedExtension packageFqName = BuiltInsProtoBuf.f24484a;
        Intrinsics.g(packageFqName, "packageFqName");
        GeneratedMessageLite.GeneratedExtension constructorAnnotation = BuiltInsProtoBuf.c;
        Intrinsics.g(constructorAnnotation, "constructorAnnotation");
        GeneratedMessageLite.GeneratedExtension classAnnotation = BuiltInsProtoBuf.b;
        Intrinsics.g(classAnnotation, "classAnnotation");
        GeneratedMessageLite.GeneratedExtension functionAnnotation = BuiltInsProtoBuf.d;
        Intrinsics.g(functionAnnotation, "functionAnnotation");
        GeneratedMessageLite.GeneratedExtension propertyAnnotation = BuiltInsProtoBuf.e;
        Intrinsics.g(propertyAnnotation, "propertyAnnotation");
        GeneratedMessageLite.GeneratedExtension propertyGetterAnnotation = BuiltInsProtoBuf.f;
        Intrinsics.g(propertyGetterAnnotation, "propertyGetterAnnotation");
        GeneratedMessageLite.GeneratedExtension propertySetterAnnotation = BuiltInsProtoBuf.g;
        Intrinsics.g(propertySetterAnnotation, "propertySetterAnnotation");
        GeneratedMessageLite.GeneratedExtension enumEntryAnnotation = BuiltInsProtoBuf.i;
        Intrinsics.g(enumEntryAnnotation, "enumEntryAnnotation");
        GeneratedMessageLite.GeneratedExtension compileTimeValue = BuiltInsProtoBuf.h;
        Intrinsics.g(compileTimeValue, "compileTimeValue");
        GeneratedMessageLite.GeneratedExtension parameterAnnotation = BuiltInsProtoBuf.j;
        Intrinsics.g(parameterAnnotation, "parameterAnnotation");
        GeneratedMessageLite.GeneratedExtension typeAnnotation = BuiltInsProtoBuf.k;
        Intrinsics.g(typeAnnotation, "typeAnnotation");
        GeneratedMessageLite.GeneratedExtension typeParameterAnnotation = BuiltInsProtoBuf.l;
        Intrinsics.g(typeParameterAnnotation, "typeParameterAnnotation");
        m = new BuiltInSerializerProtocol(extensionRegistryLite, packageFqName, constructorAnnotation, classAnnotation, functionAnnotation, propertyAnnotation, propertyGetterAnnotation, propertySetterAnnotation, enumEntryAnnotation, compileTimeValue, parameterAnnotation, typeAnnotation, typeParameterAnnotation);
    }

    public static String a(FqName fqName) {
        String strB;
        Intrinsics.h(fqName, "fqName");
        StringBuilder sb = new StringBuilder();
        FqNameUnsafe fqNameUnsafe = fqName.f24500a;
        sb.append(StringsKt.R(fqNameUnsafe.f24501a, JwtParser.SEPARATOR_CHAR, '/'));
        sb.append('/');
        if (fqNameUnsafe.c()) {
            strB = "default-package";
        } else {
            strB = fqNameUnsafe.f().b();
            Intrinsics.g(strB, "asString(...)");
        }
        sb.append(strB.concat(".kotlin_builtins"));
        return sb.toString();
    }
}
