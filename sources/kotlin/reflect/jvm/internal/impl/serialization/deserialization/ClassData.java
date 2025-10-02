package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;

/* loaded from: classes.dex */
public final class ClassData {

    /* renamed from: a, reason: collision with root package name */
    public final NameResolver f24566a;
    public final ProtoBuf.Class b;
    public final BinaryVersion c;
    public final SourceElement d;

    public ClassData(NameResolver nameResolver, ProtoBuf.Class classProto, BinaryVersion binaryVersion, SourceElement sourceElement) {
        Intrinsics.h(nameResolver, "nameResolver");
        Intrinsics.h(classProto, "classProto");
        Intrinsics.h(sourceElement, "sourceElement");
        this.f24566a = nameResolver;
        this.b = classProto;
        this.c = binaryVersion;
        this.d = sourceElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassData)) {
            return false;
        }
        ClassData classData = (ClassData) obj;
        return Intrinsics.c(this.f24566a, classData.f24566a) && Intrinsics.c(this.b, classData.b) && Intrinsics.c(this.c, classData.c) && Intrinsics.c(this.d, classData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f24566a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.f24566a + ", classProto=" + this.b + ", metadataVersion=" + this.c + ", sourceElement=" + this.d + ')';
    }
}
