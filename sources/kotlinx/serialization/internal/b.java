package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;

/* loaded from: classes7.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                ObjectSerializer objectSerializer = (ObjectSerializer) this.e;
                ClassSerialDescriptorBuilder buildSerialDescriptor = (ClassSerialDescriptorBuilder) obj;
                Intrinsics.h(buildSerialDescriptor, "$this$buildSerialDescriptor");
                List list = objectSerializer.b;
                Intrinsics.h(list, "<set-?>");
                buildSerialDescriptor.b = list;
                return Unit.f24250a;
            case 1:
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = (PluginGeneratedSerialDescriptor) this.e;
                int iIntValue = ((Integer) obj).intValue();
                return pluginGeneratedSerialDescriptor.e[iIntValue] + ": " + pluginGeneratedSerialDescriptor.d(iIntValue).getF24816a();
            case 2:
                TripleSerializer tripleSerializer = (TripleSerializer) this.e;
                ClassSerialDescriptorBuilder buildClassSerialDescriptor = (ClassSerialDescriptorBuilder) obj;
                Intrinsics.h(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                ClassSerialDescriptorBuilder.a(buildClassSerialDescriptor, "first", tripleSerializer.f24824a.getB());
                ClassSerialDescriptorBuilder.a(buildClassSerialDescriptor, "second", tripleSerializer.b.getB());
                ClassSerialDescriptorBuilder.a(buildClassSerialDescriptor, "third", tripleSerializer.c.getB());
                return Unit.f24250a;
            default:
                KSerializer kSerializer = (KSerializer) this.e;
                List it = (List) obj;
                Intrinsics.h(it, "it");
                return kSerializer;
        }
    }
}
