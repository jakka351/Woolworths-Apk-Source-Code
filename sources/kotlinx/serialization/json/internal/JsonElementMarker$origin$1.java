package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class JsonElementMarker$origin$1 extends FunctionReferenceImpl implements Function2<SerialDescriptor, Integer, Boolean> {
    public JsonElementMarker$origin$1(JsonElementMarker jsonElementMarker) {
        super(2, jsonElementMarker, JsonElementMarker.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SerialDescriptor p0 = (SerialDescriptor) obj;
        int iIntValue = ((Number) obj2).intValue();
        Intrinsics.h(p0, "p0");
        JsonElementMarker jsonElementMarker = (JsonElementMarker) this.receiver;
        jsonElementMarker.getClass();
        boolean z = !p0.j(iIntValue) && p0.d(iIntValue).b();
        jsonElementMarker.b = z;
        return Boolean.valueOf(z);
    }
}
