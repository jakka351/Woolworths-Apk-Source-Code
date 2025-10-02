package kotlin.reflect.jvm.internal;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference2;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference2;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;
import kotlin.reflect.full.KClassifiers;
import kotlin.reflect.jvm.ReflectLambdaKt;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;

/* loaded from: classes.dex */
public class ReflectionFactoryImpl extends ReflectionFactory {
    public static KDeclarationContainerImpl m(CallableReference callableReference) {
        KDeclarationContainer owner = callableReference.getOwner();
        return owner instanceof KDeclarationContainerImpl ? (KDeclarationContainerImpl) owner : EmptyContainerForLocal.e;
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KFunction a(FunctionReference functionReference) {
        return new KFunctionImpl(m(functionReference), functionReference.getK(), functionReference.getSignature(), functionReference.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KClass b(Class cls) {
        return CachesKt.a(cls);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KDeclarationContainer c(Class jClass) {
        CacheByClass cacheByClass = CachesKt.f24276a;
        Intrinsics.h(jClass, "jClass");
        return (KDeclarationContainer) CachesKt.b.a(jClass);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KMutableProperty0 d(MutablePropertyReference0 mutablePropertyReference0) {
        return new KMutableProperty0Impl(m(mutablePropertyReference0), mutablePropertyReference0.getK(), mutablePropertyReference0.getSignature(), mutablePropertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KMutableProperty1 e(MutablePropertyReference1 mutablePropertyReference1) {
        return new KMutableProperty1Impl(m(mutablePropertyReference1), mutablePropertyReference1.getK(), mutablePropertyReference1.getSignature(), mutablePropertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KMutableProperty2 f(MutablePropertyReference2 mutablePropertyReference2) {
        return new KMutableProperty2Impl(m(mutablePropertyReference2), mutablePropertyReference2.getK(), mutablePropertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KProperty0 g(PropertyReference0 propertyReference0) {
        return new KProperty0Impl(m(propertyReference0), propertyReference0.getK(), propertyReference0.getSignature(), propertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KProperty1 h(PropertyReference1 propertyReference1) {
        return new KProperty1Impl(m(propertyReference1), propertyReference1.getK(), propertyReference1.getSignature(), propertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KProperty2 i(PropertyReference2 propertyReference2) {
        return new KProperty2Impl(m(propertyReference2), propertyReference2.getK(), propertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final String j(FunctionBase functionBase) {
        KFunctionImpl kFunctionImplB;
        KFunctionImpl kFunctionImplA = ReflectLambdaKt.a(functionBase);
        if (kFunctionImplA == null || (kFunctionImplB = UtilKt.b(kFunctionImplA)) == null) {
            return super.j(functionBase);
        }
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f24292a;
        return ReflectionObjectRenderer.c(kFunctionImplB.t());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final String k(Lambda lambda) {
        return j(lambda);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KType l(KClass kClass, List arguments, boolean z) {
        if (!(kClass instanceof ClassBasedDeclarationContainer)) {
            return KClassifiers.a(kClass, arguments, z, Collections.EMPTY_LIST);
        }
        Class jClass = ((ClassBasedDeclarationContainer) kClass).getE();
        CacheByClass cacheByClass = CachesKt.f24276a;
        Intrinsics.h(jClass, "jClass");
        Intrinsics.h(arguments, "arguments");
        if (arguments.isEmpty()) {
            return z ? (KType) CachesKt.d.a(jClass) : (KType) CachesKt.c.a(jClass);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) CachesKt.e.a(jClass);
        Pair pair = new Pair(arguments, Boolean.valueOf(z));
        Object obj = concurrentHashMap.get(pair);
        if (obj == null) {
            KTypeImpl kTypeImplA = KClassifiers.a(CachesKt.a(jClass), arguments, z, EmptyList.d);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(pair, kTypeImplA);
            obj = objPutIfAbsent == null ? kTypeImplA : objPutIfAbsent;
        }
        return (KType) obj;
    }
}
