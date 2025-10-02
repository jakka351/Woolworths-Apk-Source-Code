package kotlinx.serialization.descriptors;

import YU.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ClassSerialDescriptorBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final String f24758a;
    public List b;
    public final ArrayList c;
    public final HashSet d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;

    public ClassSerialDescriptorBuilder(String serialName) {
        Intrinsics.h(serialName, "serialName");
        this.f24758a = serialName;
        this.b = EmptyList.d;
        this.c = new ArrayList();
        this.d = new HashSet();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    public static void a(ClassSerialDescriptorBuilder classSerialDescriptorBuilder, String elementName, SerialDescriptor descriptor) {
        classSerialDescriptorBuilder.getClass();
        Intrinsics.h(elementName, "elementName");
        Intrinsics.h(descriptor, "descriptor");
        if (!classSerialDescriptorBuilder.d.add(elementName)) {
            StringBuilder sbU = a.u("Element with name '", elementName, "' is already registered in ");
            sbU.append(classSerialDescriptorBuilder.f24758a);
            throw new IllegalArgumentException(sbU.toString().toString());
        }
        classSerialDescriptorBuilder.c.add(elementName);
        classSerialDescriptorBuilder.e.add(descriptor);
        classSerialDescriptorBuilder.f.add(EmptyList.d);
        classSerialDescriptorBuilder.g.add(false);
    }
}
