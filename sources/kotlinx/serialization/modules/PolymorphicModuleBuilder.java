package kotlinx.serialization.modules;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/modules/PolymorphicModuleBuilder;", "", "Base", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class PolymorphicModuleBuilder<Base> {

    /* renamed from: a, reason: collision with root package name */
    public final KClass f24876a;
    public final ArrayList b;

    public PolymorphicModuleBuilder(KClass baseClass) {
        Intrinsics.h(baseClass, "baseClass");
        this.f24876a = baseClass;
        this.b = new ArrayList();
    }

    public final void a(KClass subclass, KSerializer serializer) {
        Intrinsics.h(subclass, "subclass");
        Intrinsics.h(serializer, "serializer");
        this.b.add(new Pair(subclass, serializer));
    }
}
