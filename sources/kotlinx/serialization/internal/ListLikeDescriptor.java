package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001\u0082\u0001\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/serialization/internal/ListLikeDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/ArrayClassDesc;", "Lkotlinx/serialization/internal/ArrayListClassDesc;", "Lkotlinx/serialization/internal/HashSetClassDesc;", "Lkotlinx/serialization/internal/LinkedHashSetClassDesc;", "Lkotlinx/serialization/internal/PrimitiveArrayDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ExperimentalSerializationApi
@SourceDebugExtension
/* loaded from: classes7.dex */
public abstract class ListLikeDescriptor implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f24802a;

    public ListLikeDescriptor(SerialDescriptor serialDescriptor) {
        this.f24802a = serialDescriptor;
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
        throw new IllegalArgumentException(name.concat(" is not a valid list index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor d(int i) {
        if (i >= 0) {
            return this.f24802a;
        }
        StringBuilder sbR = YU.a.r(i, "Illegal index ", ", ");
        sbR.append(getF24805a());
        sbR.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbR.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListLikeDescriptor)) {
            return false;
        }
        ListLikeDescriptor listLikeDescriptor = (ListLikeDescriptor) obj;
        return Intrinsics.c(this.f24802a, listLikeDescriptor.f24802a) && Intrinsics.c(getF24805a(), listLikeDescriptor.getF24805a());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialKind f() {
        return StructureKind.LIST.f24775a;
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
        StringBuilder sbR = YU.a.r(i, "Illegal index ", ", ");
        sbR.append(getF24805a());
        sbR.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbR.toString().toString());
    }

    public final int hashCode() {
        return getF24805a().hashCode() + (this.f24802a.hashCode() * 31);
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
        StringBuilder sbR = YU.a.r(i, "Illegal index ", ", ");
        sbR.append(getF24805a());
        sbR.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbR.toString().toString());
    }

    public final String toString() {
        return getF24805a() + '(' + this.f24802a + ')';
    }
}
