package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.ElementMarker;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/JsonElementMarker;", "", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JsonElementMarker {

    /* renamed from: a, reason: collision with root package name */
    public final ElementMarker f24862a;
    public boolean b;

    public JsonElementMarker(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        this.f24862a = new ElementMarker(descriptor, new JsonElementMarker$origin$1(this));
    }
}
