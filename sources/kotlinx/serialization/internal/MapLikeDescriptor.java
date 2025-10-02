package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/internal/MapLikeDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/HashMapClassDesc;", "Lkotlinx/serialization/internal/LinkedHashMapClassDesc;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class MapLikeDescriptor implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public final String f24805a;
    public final SerialDescriptor b;
    public final SerialDescriptor c;

    public MapLikeDescriptor(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.f24805a = str;
        this.b = serialDescriptor;
        this.c = serialDescriptor2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String name) {
        Intrinsics.h(name, "name");
        Integer numI0 = StringsKt.i0(name);
        if (numI0 != null) {
            return numI0.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor d(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(YU.a.o(YU.a.r(i, "Illegal index ", ", "), this.f24805a, " expects only non-negative indices").toString());
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.b;
        }
        if (i2 == 1) {
            return this.c;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapLikeDescriptor)) {
            return false;
        }
        MapLikeDescriptor mapLikeDescriptor = (MapLikeDescriptor) obj;
        return Intrinsics.c(this.f24805a, mapLikeDescriptor.f24805a) && Intrinsics.c(this.b, mapLikeDescriptor.b) && Intrinsics.c(this.c, mapLikeDescriptor.c);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialKind f() {
        return StructureKind.MAP.f24776a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i) {
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return EmptyList.d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i) {
        if (i >= 0) {
            return EmptyList.d;
        }
        throw new IllegalArgumentException(YU.a.o(YU.a.r(i, "Illegal index ", ", "), this.f24805a, " expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f24805a.hashCode() * 31)) * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i, reason: from getter */
    public final String getF24805a() {
        return this.f24805a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(YU.a.o(YU.a.r(i, "Illegal index ", ", "), this.f24805a, " expects only non-negative indices").toString());
    }

    public final String toString() {
        return this.f24805a + '(' + this.b + ", " + this.c + ')';
    }
}
