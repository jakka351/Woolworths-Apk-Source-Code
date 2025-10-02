package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;

@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class AbstractAnnotationLoader<A> implements AnnotationLoader<A> {

    /* renamed from: a, reason: collision with root package name */
    public final SerializerExtensionProtocol f24562a;

    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AbstractAnnotationLoader(SerializerExtensionProtocol protocol) {
        Intrinsics.h(protocol, "protocol");
        this.f24562a = protocol;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final List a(ProtoContainer protoContainer, MessageLite callableProto, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf.ValueParameter valueParameter) {
        Intrinsics.h(callableProto, "callableProto");
        Iterable iterable = (List) valueParameter.f(this.f24562a.j);
        if (iterable == null) {
            iterable = EmptyList.d;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AnnotationAndConstantLoaderImpl) this).l((ProtoBuf.Annotation) it.next(), protoContainer.f24582a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final ArrayList b(ProtoContainer.Class container) {
        Intrinsics.h(container, "container");
        Iterable iterable = (List) container.d.f(this.f24562a.c);
        if (iterable == null) {
            iterable = EmptyList.d;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AnnotationAndConstantLoaderImpl) this).l((ProtoBuf.Annotation) it.next(), container.f24582a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final List c(ProtoContainer container, ProtoBuf.EnumEntry enumEntry) {
        Intrinsics.h(container, "container");
        Iterable iterable = (List) enumEntry.f(this.f24562a.h);
        if (iterable == null) {
            iterable = EmptyList.d;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AnnotationAndConstantLoaderImpl) this).l((ProtoBuf.Annotation) it.next(), container.f24582a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final ArrayList d(ProtoBuf.TypeParameter proto, NameResolver nameResolver) {
        Intrinsics.h(proto, "proto");
        Intrinsics.h(nameResolver, "nameResolver");
        Iterable iterable = (List) proto.f(this.f24562a.l);
        if (iterable == null) {
            iterable = EmptyList.d;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AnnotationAndConstantLoaderImpl) this).l((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final List f(ProtoContainer protoContainer, ProtoBuf.Property proto) {
        Intrinsics.h(proto, "proto");
        this.f24562a.getClass();
        EmptyList emptyList = EmptyList.d;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(emptyList, 10));
        Iterator<E> it = emptyList.iterator();
        while (it.hasNext()) {
            arrayList.add(((AnnotationAndConstantLoaderImpl) this).l((ProtoBuf.Annotation) it.next(), protoContainer.f24582a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final List g(ProtoContainer protoContainer, MessageLite proto, AnnotatedCallableKind annotatedCallableKind) {
        Intrinsics.h(proto, "proto");
        boolean z = proto instanceof ProtoBuf.Function;
        SerializerExtensionProtocol serializerExtensionProtocol = this.f24562a;
        if (z) {
            serializerExtensionProtocol.getClass();
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int iOrdinal = annotatedCallableKind.ordinal();
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + annotatedCallableKind).toString());
            }
            serializerExtensionProtocol.getClass();
        }
        EmptyList emptyList = EmptyList.d;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(emptyList, 10));
        Iterator<E> it = emptyList.iterator();
        while (it.hasNext()) {
            arrayList.add(((AnnotationAndConstantLoaderImpl) this).l((ProtoBuf.Annotation) it.next(), protoContainer.f24582a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final ArrayList h(ProtoBuf.Type proto, NameResolver nameResolver) {
        Intrinsics.h(proto, "proto");
        Intrinsics.h(nameResolver, "nameResolver");
        Iterable iterable = (List) proto.f(this.f24562a.k);
        if (iterable == null) {
            iterable = EmptyList.d;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AnnotationAndConstantLoaderImpl) this).l((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final List i(ProtoContainer protoContainer, MessageLite proto, AnnotatedCallableKind annotatedCallableKind) {
        List list;
        Intrinsics.h(proto, "proto");
        boolean z = proto instanceof ProtoBuf.Constructor;
        SerializerExtensionProtocol serializerExtensionProtocol = this.f24562a;
        if (z) {
            list = (List) ((ProtoBuf.Constructor) proto).f(serializerExtensionProtocol.b);
        } else if (proto instanceof ProtoBuf.Function) {
            list = (List) ((ProtoBuf.Function) proto).f(serializerExtensionProtocol.d);
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int iOrdinal = annotatedCallableKind.ordinal();
            if (iOrdinal == 1) {
                list = (List) ((ProtoBuf.Property) proto).f(serializerExtensionProtocol.e);
            } else if (iOrdinal == 2) {
                list = (List) ((ProtoBuf.Property) proto).f(serializerExtensionProtocol.f);
            } else {
                if (iOrdinal != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                list = (List) ((ProtoBuf.Property) proto).f(serializerExtensionProtocol.g);
            }
        }
        if (list == null) {
            list = EmptyList.d;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AnnotationAndConstantLoaderImpl) this).l((ProtoBuf.Annotation) it.next(), protoContainer.f24582a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final List k(ProtoContainer protoContainer, ProtoBuf.Property proto) {
        Intrinsics.h(proto, "proto");
        this.f24562a.getClass();
        EmptyList emptyList = EmptyList.d;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(emptyList, 10));
        Iterator<E> it = emptyList.iterator();
        while (it.hasNext()) {
            arrayList.add(((AnnotationAndConstantLoaderImpl) this).l((ProtoBuf.Annotation) it.next(), protoContainer.f24582a));
        }
        return arrayList;
    }
}
