package kotlinx.serialization.modules;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.modules.ContextualProvider;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/modules/SerializersModuleBuilder;", "Lkotlinx/serialization/modules/SerializersModuleCollector;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SerializersModuleBuilder implements SerializersModuleCollector {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f24878a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public boolean f;

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final void a(KClass kClass, Function1 function1) {
        HashMap map = this.e;
        Function1 function12 = (Function1) map.get(kClass);
        if (function12 == null || function12.equals(function1)) {
            map.put(kClass, function1);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + kClass + " is already registered: " + function12);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final void b(KClass kClass, Function1 function1) {
        HashMap map = this.c;
        Function1 function12 = (Function1) map.get(kClass);
        if (function12 == null || function12.equals(function1)) {
            map.put(kClass, function1);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for " + kClass + " is already registered: " + function12);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final void c(KClass kClass, KClass kClass2, KSerializer kSerializer) {
        g(kClass, kClass2, kSerializer);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final void d(KClass kClass, KSerializer kSerializer) {
        Intrinsics.h(kClass, "kClass");
        h(kClass, new ContextualProvider.Argless(kSerializer));
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final void e(KClass kClass, Function1 provider) {
        Intrinsics.h(kClass, "kClass");
        Intrinsics.h(provider, "provider");
        h(kClass, new ContextualProvider.WithTypeArguments(provider));
    }

    public final SerialModuleImpl f() {
        return new SerialModuleImpl(this.f24878a, this.b, this.c, this.d, this.e, this.f);
    }

    public final void g(KClass baseClass, KClass concreteClass, KSerializer concreteSerializer) {
        Object next;
        Intrinsics.h(baseClass, "baseClass");
        Intrinsics.h(concreteClass, "concreteClass");
        Intrinsics.h(concreteSerializer, "concreteSerializer");
        String b = concreteSerializer.getB().getF24814a();
        HashMap map = this.b;
        Object map2 = map.get(baseClass);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(baseClass, map2);
        }
        Map map3 = (Map) map2;
        KSerializer kSerializer = (KSerializer) map3.get(concreteClass);
        HashMap map4 = this.d;
        Object map5 = map4.get(baseClass);
        if (map5 == null) {
            map5 = new HashMap();
            map4.put(baseClass, map5);
        }
        Map map6 = (Map) map5;
        if (kSerializer != null) {
            if (!kSerializer.equals(concreteSerializer)) {
                throw new SerializerAlreadyRegisteredException("Serializer for " + concreteClass + " already registered in the scope of " + baseClass);
            }
        }
        KSerializer kSerializer2 = (KSerializer) map6.get(b);
        if (kSerializer2 == null) {
            map3.put(concreteClass, concreteSerializer);
            map6.put(b, concreteSerializer);
            return;
        }
        Object obj = map.get(baseClass);
        Intrinsics.e(obj);
        Iterator it = CollectionsKt.n(((Map) obj).entrySet()).f24253a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Map.Entry) next).getValue() == kSerializer2) {
                    break;
                }
            }
        }
        throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + baseClass + "' have the same serial name '" + b + "': '" + concreteClass + "' and '" + ((Map.Entry) next) + '\'');
    }

    public final void h(KClass forClass, ContextualProvider contextualProvider) {
        Intrinsics.h(forClass, "forClass");
        HashMap map = this.f24878a;
        ContextualProvider contextualProvider2 = (ContextualProvider) map.get(forClass);
        if (contextualProvider2 != null && !contextualProvider2.equals(contextualProvider)) {
            throw new SerializerAlreadyRegisteredException("Contextual serializer or serializer provider for " + forClass + " already registered in this module");
        }
        map.put(forClass, contextualProvider);
        if (PlatformKt.c(forClass)) {
            this.f = true;
        }
    }
}
