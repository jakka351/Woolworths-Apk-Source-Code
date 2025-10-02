package kotlinx.serialization.descriptors;

import YU.a;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.MapBuilderValues;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.internal.PrimitiveSerialDescriptor;
import kotlinx.serialization.internal.PrimitivesKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SerialDescriptorsKt {
    public static final PrimitiveSerialDescriptor a(String str) {
        if (StringsKt.D(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object it = ((MapBuilderValues) PrimitivesKt.f24817a.values()).iterator();
        while (((MapBuilder.Itr) it).hasNext()) {
            KSerializer kSerializer = (KSerializer) ((MapBuilder.ValuesItr) it).next();
            if (str.equals(kSerializer.getB().getB())) {
                StringBuilder sbU = a.u("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbU.append(Reflection.f24268a.b(kSerializer.getClass()).B());
                sbU.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(StringsKt.m0(sbU.toString()));
            }
        }
        return new PrimitiveSerialDescriptor(str, PrimitiveKind.STRING.f24770a);
    }

    public static final SerialDescriptorImpl b(String str, SerialDescriptor[] serialDescriptorArr, Function1 function1) {
        if (StringsKt.D(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new ClassSerialDescriptorBuilder(str);
        function1.invoke(classSerialDescriptorBuilder);
        return new SerialDescriptorImpl(str, StructureKind.CLASS.f24774a, classSerialDescriptorBuilder.c.size(), ArraysKt.l0(serialDescriptorArr), classSerialDescriptorBuilder);
    }

    public static SerialDescriptorImpl c(String str, SerialDescriptor[] serialDescriptorArr) {
        if (StringsKt.D(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new ClassSerialDescriptorBuilder(str);
        return new SerialDescriptorImpl(str, StructureKind.CLASS.f24774a, classSerialDescriptorBuilder.c.size(), ArraysKt.l0(serialDescriptorArr), classSerialDescriptorBuilder);
    }

    public static final SerialDescriptorImpl d(String serialName, SerialKind serialKind, SerialDescriptor[] serialDescriptorArr, Function1 function1) {
        Intrinsics.h(serialName, "serialName");
        if (StringsKt.D(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (serialKind.equals(StructureKind.CLASS.f24774a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new ClassSerialDescriptorBuilder(serialName);
        function1.invoke(classSerialDescriptorBuilder);
        return new SerialDescriptorImpl(serialName, serialKind, classSerialDescriptorBuilder.c.size(), ArraysKt.l0(serialDescriptorArr), classSerialDescriptorBuilder);
    }

    public static SerialDescriptorImpl e(String serialName, SerialKind serialKind, SerialDescriptor[] serialDescriptorArr) {
        Intrinsics.h(serialName, "serialName");
        if (StringsKt.D(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (serialKind.equals(StructureKind.CLASS.f24774a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new ClassSerialDescriptorBuilder(serialName);
        return new SerialDescriptorImpl(serialName, serialKind, classSerialDescriptorBuilder.c.size(), ArraysKt.l0(serialDescriptorArr), classSerialDescriptorBuilder);
    }
}
