package kotlinx.serialization;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ SealedClassSerializer e;

    public /* synthetic */ a(SealedClassSerializer sealedClassSerializer, int i) {
        this.d = i;
        this.e = sealedClassSerializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ClassSerialDescriptorBuilder buildSerialDescriptor = (ClassSerialDescriptorBuilder) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(buildSerialDescriptor, "$this$buildSerialDescriptor");
                ClassSerialDescriptorBuilder.a(buildSerialDescriptor, "type", StringSerializer.b);
                StringBuilder sb = new StringBuilder("kotlinx.serialization.Sealed<");
                SealedClassSerializer sealedClassSerializer = this.e;
                sb.append(sealedClassSerializer.f24751a.B());
                sb.append('>');
                a aVar = new a(sealedClassSerializer, 1);
                ClassSerialDescriptorBuilder.a(buildSerialDescriptor, "value", SerialDescriptorsKt.d(sb.toString(), SerialKind.CONTEXTUAL.f24772a, new SerialDescriptor[0], aVar));
                List list = sealedClassSerializer.b;
                Intrinsics.h(list, "<set-?>");
                buildSerialDescriptor.b = list;
                break;
            default:
                Intrinsics.h(buildSerialDescriptor, "$this$buildSerialDescriptor");
                for (Map.Entry entry : this.e.e.entrySet()) {
                    ClassSerialDescriptorBuilder.a(buildSerialDescriptor, (String) entry.getKey(), ((KSerializer) entry.getValue()).getB());
                }
                break;
        }
        return Unit.f24250a;
    }
}
