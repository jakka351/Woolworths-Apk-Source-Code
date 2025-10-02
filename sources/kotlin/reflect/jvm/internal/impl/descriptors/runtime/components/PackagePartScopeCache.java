package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class PackagePartScopeCache {

    /* renamed from: a, reason: collision with root package name */
    public final DeserializedDescriptorResolver f24364a;
    public final ReflectKotlinClassFinder b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public PackagePartScopeCache(ReflectKotlinClassFinder reflectKotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver) {
        this.f24364a = deserializedDescriptorResolver;
        this.b = reflectKotlinClassFinder;
    }
}
