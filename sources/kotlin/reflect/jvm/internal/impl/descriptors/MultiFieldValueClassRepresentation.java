package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;

/* loaded from: classes7.dex */
public final class MultiFieldValueClassRepresentation<Type extends RigidTypeMarker> extends ValueClassRepresentation<Type> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24337a;
    public final Map b;

    public MultiFieldValueClassRepresentation(ArrayList arrayList) {
        this.f24337a = arrayList;
        this.b = MapsKt.p(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation
    public final boolean a(Name name) {
        return this.b.containsKey(name);
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.f24337a + ')';
    }
}
