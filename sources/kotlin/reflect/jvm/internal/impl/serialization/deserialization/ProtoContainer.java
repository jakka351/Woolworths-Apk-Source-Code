package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes.dex */
public abstract class ProtoContainer {

    /* renamed from: a, reason: collision with root package name */
    public final NameResolver f24582a;
    public final TypeTable b;
    public final SourceElement c;

    public static final class Class extends ProtoContainer {
        public final ProtoBuf.Class d;
        public final Class e;
        public final ClassId f;
        public final ProtoBuf.Class.Kind g;
        public final boolean h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Class(ProtoBuf.Class classProto, NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement, Class r6) {
            super(nameResolver, typeTable, sourceElement);
            Intrinsics.h(classProto, "classProto");
            Intrinsics.h(nameResolver, "nameResolver");
            this.d = classProto;
            this.e = r6;
            this.f = NameResolverUtilKt.a(nameResolver, classProto.h);
            ProtoBuf.Class.Kind kind = (ProtoBuf.Class.Kind) Flags.f.c(classProto.g);
            this.g = kind == null ? ProtoBuf.Class.Kind.CLASS : kind;
            this.h = Flags.g.e(classProto.g).booleanValue();
            Flags.h.getClass();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        public final FqName a() {
            return this.f.a();
        }
    }

    /* loaded from: classes7.dex */
    public static final class Package extends ProtoContainer {
        public final FqName d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Package(FqName fqName, NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement) {
            super(nameResolver, typeTable, sourceElement);
            Intrinsics.h(fqName, "fqName");
            Intrinsics.h(nameResolver, "nameResolver");
            this.d = fqName;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        public final FqName a() {
            return this.d;
        }
    }

    public ProtoContainer(NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement) {
        this.f24582a = nameResolver;
        this.b = typeTable;
        this.c = sourceElement;
    }

    public abstract FqName a();

    public final String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
