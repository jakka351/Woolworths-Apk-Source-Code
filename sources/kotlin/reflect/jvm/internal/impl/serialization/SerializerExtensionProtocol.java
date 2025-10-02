package kotlin.reflect.jvm.internal.impl.serialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* loaded from: classes.dex */
public class SerializerExtensionProtocol {

    /* renamed from: a, reason: collision with root package name */
    public final ExtensionRegistryLite f24561a;
    public final GeneratedMessageLite.GeneratedExtension b;
    public final GeneratedMessageLite.GeneratedExtension c;
    public final GeneratedMessageLite.GeneratedExtension d;
    public final GeneratedMessageLite.GeneratedExtension e;
    public final GeneratedMessageLite.GeneratedExtension f;
    public final GeneratedMessageLite.GeneratedExtension g;
    public final GeneratedMessageLite.GeneratedExtension h;
    public final GeneratedMessageLite.GeneratedExtension i;
    public final GeneratedMessageLite.GeneratedExtension j;
    public final GeneratedMessageLite.GeneratedExtension k;
    public final GeneratedMessageLite.GeneratedExtension l;

    public SerializerExtensionProtocol(ExtensionRegistryLite extensionRegistryLite, GeneratedMessageLite.GeneratedExtension packageFqName, GeneratedMessageLite.GeneratedExtension constructorAnnotation, GeneratedMessageLite.GeneratedExtension classAnnotation, GeneratedMessageLite.GeneratedExtension functionAnnotation, GeneratedMessageLite.GeneratedExtension propertyAnnotation, GeneratedMessageLite.GeneratedExtension propertyGetterAnnotation, GeneratedMessageLite.GeneratedExtension propertySetterAnnotation, GeneratedMessageLite.GeneratedExtension enumEntryAnnotation, GeneratedMessageLite.GeneratedExtension compileTimeValue, GeneratedMessageLite.GeneratedExtension parameterAnnotation, GeneratedMessageLite.GeneratedExtension typeAnnotation, GeneratedMessageLite.GeneratedExtension typeParameterAnnotation) {
        Intrinsics.h(packageFqName, "packageFqName");
        Intrinsics.h(constructorAnnotation, "constructorAnnotation");
        Intrinsics.h(classAnnotation, "classAnnotation");
        Intrinsics.h(functionAnnotation, "functionAnnotation");
        Intrinsics.h(propertyAnnotation, "propertyAnnotation");
        Intrinsics.h(propertyGetterAnnotation, "propertyGetterAnnotation");
        Intrinsics.h(propertySetterAnnotation, "propertySetterAnnotation");
        Intrinsics.h(enumEntryAnnotation, "enumEntryAnnotation");
        Intrinsics.h(compileTimeValue, "compileTimeValue");
        Intrinsics.h(parameterAnnotation, "parameterAnnotation");
        Intrinsics.h(typeAnnotation, "typeAnnotation");
        Intrinsics.h(typeParameterAnnotation, "typeParameterAnnotation");
        this.f24561a = extensionRegistryLite;
        this.b = constructorAnnotation;
        this.c = classAnnotation;
        this.d = functionAnnotation;
        this.e = propertyAnnotation;
        this.f = propertyGetterAnnotation;
        this.g = propertySetterAnnotation;
        this.h = enumEntryAnnotation;
        this.i = compileTimeValue;
        this.j = parameterAnnotation;
        this.k = typeAnnotation;
        this.l = typeParameterAnnotation;
    }
}
