package kotlinx.serialization.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ KSerializer e;
    public final /* synthetic */ KSerializer f;

    public /* synthetic */ a(KSerializer kSerializer, KSerializer kSerializer2, int i) {
        this.d = i;
        this.e = kSerializer;
        this.f = kSerializer2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ClassSerialDescriptorBuilder buildSerialDescriptor = (ClassSerialDescriptorBuilder) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(buildSerialDescriptor, "$this$buildSerialDescriptor");
                ClassSerialDescriptorBuilder.a(buildSerialDescriptor, "key", this.e.getDescriptor());
                ClassSerialDescriptorBuilder.a(buildSerialDescriptor, "value", this.f.getDescriptor());
                break;
            default:
                Intrinsics.h(buildSerialDescriptor, "$this$buildClassSerialDescriptor");
                ClassSerialDescriptorBuilder.a(buildSerialDescriptor, "first", this.e.getDescriptor());
                ClassSerialDescriptorBuilder.a(buildSerialDescriptor, "second", this.f.getDescriptor());
                break;
        }
        return Unit.f24250a;
    }
}
