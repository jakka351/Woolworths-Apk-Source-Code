package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class InlineClassRepresentation<Type extends RigidTypeMarker> extends ValueClassRepresentation<Type> {

    /* renamed from: a, reason: collision with root package name */
    public final Name f24334a;
    public final RigidTypeMarker b;

    public InlineClassRepresentation(Name name, RigidTypeMarker underlyingType) {
        Intrinsics.h(underlyingType, "underlyingType");
        this.f24334a = name;
        this.b = underlyingType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation
    public final boolean a(Name name) {
        return this.f24334a.equals(name);
    }

    public final String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f24334a + ", underlyingType=" + this.b + ')';
    }
}
