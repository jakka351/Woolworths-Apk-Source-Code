package kotlinx.serialization.modules;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.ContextualProvider;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"kotlinx/serialization/modules/SerializersModuleKt$overwriteWith$1$1", "Lkotlinx/serialization/modules/SerializersModuleCollector;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SerializersModuleKt$overwriteWith$1$1 implements SerializersModuleCollector {
    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final void a(KClass kClass, Function1 function1) {
        throw null;
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final void b(KClass kClass, Function1 function1) {
        throw null;
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final void c(KClass kClass, KClass kClass2, KSerializer kSerializer) {
        throw null;
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final void d(KClass kClass, KSerializer kSerializer) {
        throw null;
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final void e(KClass kClass, Function1 provider) {
        Intrinsics.h(kClass, "kClass");
        Intrinsics.h(provider, "provider");
        new ContextualProvider.WithTypeArguments(provider);
        throw null;
    }
}
