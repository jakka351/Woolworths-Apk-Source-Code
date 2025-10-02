package kotlinx.serialization.internal;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/SerialDescriptorForNullable;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/CachedNames;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SerialDescriptorForNullable implements SerialDescriptor, CachedNames {

    /* renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f24818a;
    public final String b;
    public final Set c;

    public SerialDescriptorForNullable(SerialDescriptor original) {
        Intrinsics.h(original, "original");
        this.f24818a = original;
        this.b = original.getB() + '?';
        this.c = Platform_commonKt.a(original);
    }

    @Override // kotlinx.serialization.internal.CachedNames
    /* renamed from: a, reason: from getter */
    public final Set getC() {
        return this.c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String name) {
        Intrinsics.h(name, "name");
        return this.f24818a.c(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor d(int i) {
        return this.f24818a.d(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e */
    public final int getC() {
        return this.f24818a.getC();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SerialDescriptorForNullable) {
            return Intrinsics.c(this.f24818a, ((SerialDescriptorForNullable) obj).f24818a);
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: f */
    public final SerialKind getB() {
        return this.f24818a.getB();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i) {
        return this.f24818a.g(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: getAnnotations */
    public final List getD() {
        return this.f24818a.getD();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i) {
        return this.f24818a.h(i);
    }

    public final int hashCode() {
        return this.f24818a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: isInline */
    public final boolean getL() {
        return this.f24818a.getL();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i) {
        return this.f24818a.j(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f24818a);
        sb.append('?');
        return sb.toString();
    }
}
