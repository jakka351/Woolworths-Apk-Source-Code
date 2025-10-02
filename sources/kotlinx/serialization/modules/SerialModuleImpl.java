package kotlinx.serialization.modules;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.modules.ContextualProvider;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/modules/SerialModuleImpl;", "Lkotlinx/serialization/modules/SerializersModule;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SerialModuleImpl extends SerializersModule {

    /* renamed from: a, reason: collision with root package name */
    public final Map f24877a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final boolean f;

    public SerialModuleImpl(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider, boolean z) {
        Intrinsics.h(class2ContextualFactory, "class2ContextualFactory");
        Intrinsics.h(polyBase2Serializers, "polyBase2Serializers");
        Intrinsics.h(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        Intrinsics.h(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        Intrinsics.h(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f24877a = class2ContextualFactory;
        this.b = polyBase2Serializers;
        this.c = polyBase2DefaultSerializerProvider;
        this.d = polyBase2NamedSerializers;
        this.e = polyBase2DefaultDeserializerProvider;
        this.f = z;
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public final void a(SerializersModuleCollector serializersModuleCollector) {
        for (Map.Entry entry : this.f24877a.entrySet()) {
            KClass kClass = (KClass) entry.getKey();
            ContextualProvider contextualProvider = (ContextualProvider) entry.getValue();
            if (contextualProvider instanceof ContextualProvider.Argless) {
                Intrinsics.f(kClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                KSerializer kSerializerB = ((ContextualProvider.Argless) contextualProvider).getF24874a();
                Intrinsics.f(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                serializersModuleCollector.d(kClass, kSerializerB);
            } else {
                if (!(contextualProvider instanceof ContextualProvider.WithTypeArguments)) {
                    throw new NoWhenBranchMatchedException();
                }
                serializersModuleCollector.e(kClass, ((ContextualProvider.WithTypeArguments) contextualProvider).getF24875a());
            }
        }
        for (Map.Entry entry2 : this.b.entrySet()) {
            KClass kClass2 = (KClass) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                KClass kClass3 = (KClass) entry3.getKey();
                KSerializer kSerializer = (KSerializer) entry3.getValue();
                Intrinsics.f(kClass2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.f(kClass3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.f(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                serializersModuleCollector.c(kClass2, kClass3, kSerializer);
            }
        }
        for (Map.Entry entry4 : this.c.entrySet()) {
            KClass kClass4 = (KClass) entry4.getKey();
            Function1 function1 = (Function1) entry4.getValue();
            Intrinsics.f(kClass4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.f(function1, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            TypeIntrinsics.d(1, function1);
            serializersModuleCollector.b(kClass4, function1);
        }
        for (Map.Entry entry5 : this.e.entrySet()) {
            KClass kClass5 = (KClass) entry5.getKey();
            Function1 function12 = (Function1) entry5.getValue();
            Intrinsics.f(kClass5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.f(function12, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            TypeIntrinsics.d(1, function12);
            serializersModuleCollector.a(kClass5, function12);
        }
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public final KSerializer b(KClass kClass, List typeArgumentsSerializers) {
        Intrinsics.h(kClass, "kClass");
        Intrinsics.h(typeArgumentsSerializers, "typeArgumentsSerializers");
        ContextualProvider contextualProvider = (ContextualProvider) this.f24877a.get(kClass);
        KSerializer kSerializerA = contextualProvider != null ? contextualProvider.a(typeArgumentsSerializers) : null;
        if (kSerializerA instanceof KSerializer) {
            return kSerializerA;
        }
        return null;
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    /* renamed from: c, reason: from getter */
    public final boolean getF() {
        return this.f;
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public final DeserializationStrategy d(KClass baseClass, String str) {
        Intrinsics.h(baseClass, "baseClass");
        Map map = (Map) this.d.get(baseClass);
        KSerializer kSerializer = map != null ? (KSerializer) map.get(str) : null;
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Object obj = this.e.get(baseClass);
        Function1 function1 = TypeIntrinsics.e(1, obj) ? (Function1) obj : null;
        if (function1 != null) {
            return (DeserializationStrategy) function1.invoke(str);
        }
        return null;
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public final SerializationStrategy e(KClass baseClass, Object value) {
        Intrinsics.h(baseClass, "baseClass");
        Intrinsics.h(value, "value");
        if (baseClass.z(value)) {
            Map map = (Map) this.b.get(baseClass);
            KSerializer kSerializer = map != null ? (KSerializer) map.get(Reflection.f24268a.b(value.getClass())) : null;
            KSerializer kSerializer2 = kSerializer instanceof SerializationStrategy ? kSerializer : null;
            if (kSerializer2 != null) {
                return kSerializer2;
            }
            Object obj = this.c.get(baseClass);
            Function1 function1 = TypeIntrinsics.e(1, obj) ? (Function1) obj : null;
            if (function1 != null) {
                return (SerializationStrategy) function1.invoke(value);
            }
        }
        return null;
    }
}
