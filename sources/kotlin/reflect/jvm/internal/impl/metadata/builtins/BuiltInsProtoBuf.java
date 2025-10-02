package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* loaded from: classes.dex */
public final class BuiltInsProtoBuf {

    /* renamed from: a, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension f24484a = GeneratedMessageLite.c(ProtoBuf.Package.n, 0, null, 151, WireFormat.FieldType.j, Integer.class);
    public static final GeneratedMessageLite.GeneratedExtension b;
    public static final GeneratedMessageLite.GeneratedExtension c;
    public static final GeneratedMessageLite.GeneratedExtension d;
    public static final GeneratedMessageLite.GeneratedExtension e;
    public static final GeneratedMessageLite.GeneratedExtension f;
    public static final GeneratedMessageLite.GeneratedExtension g;
    public static final GeneratedMessageLite.GeneratedExtension h;
    public static final GeneratedMessageLite.GeneratedExtension i;
    public static final GeneratedMessageLite.GeneratedExtension j;
    public static final GeneratedMessageLite.GeneratedExtension k;
    public static final GeneratedMessageLite.GeneratedExtension l;

    static {
        ProtoBuf.Class r0 = ProtoBuf.Class.N;
        ProtoBuf.Annotation annotation = ProtoBuf.Annotation.j;
        WireFormat.FieldType fieldType = WireFormat.FieldType.p;
        b = GeneratedMessageLite.b(r0, annotation, 150, fieldType, ProtoBuf.Annotation.class);
        c = GeneratedMessageLite.b(ProtoBuf.Constructor.m, annotation, 150, fieldType, ProtoBuf.Annotation.class);
        d = GeneratedMessageLite.b(ProtoBuf.Function.y, annotation, 150, fieldType, ProtoBuf.Annotation.class);
        ProtoBuf.Property property = ProtoBuf.Property.y;
        e = GeneratedMessageLite.b(property, annotation, 150, fieldType, ProtoBuf.Annotation.class);
        f = GeneratedMessageLite.b(property, annotation, 152, fieldType, ProtoBuf.Annotation.class);
        g = GeneratedMessageLite.b(property, annotation, 153, fieldType, ProtoBuf.Annotation.class);
        ProtoBuf.Annotation.Argument.Value value = ProtoBuf.Annotation.Argument.Value.s;
        h = GeneratedMessageLite.c(property, value, value, 151, fieldType, ProtoBuf.Annotation.Argument.Value.class);
        i = GeneratedMessageLite.b(ProtoBuf.EnumEntry.j, annotation, 150, fieldType, ProtoBuf.Annotation.class);
        j = GeneratedMessageLite.b(ProtoBuf.ValueParameter.o, annotation, 150, fieldType, ProtoBuf.Annotation.class);
        k = GeneratedMessageLite.b(ProtoBuf.Type.w, annotation, 150, fieldType, ProtoBuf.Annotation.class);
        l = GeneratedMessageLite.b(ProtoBuf.TypeParameter.p, annotation, 150, fieldType, ProtoBuf.Annotation.class);
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.a(f24484a);
        extensionRegistryLite.a(b);
        extensionRegistryLite.a(c);
        extensionRegistryLite.a(d);
        extensionRegistryLite.a(e);
        extensionRegistryLite.a(f);
        extensionRegistryLite.a(g);
        extensionRegistryLite.a(h);
        extensionRegistryLite.a(i);
        extensionRegistryLite.a(j);
        extensionRegistryLite.a(k);
        extensionRegistryLite.a(l);
    }
}
