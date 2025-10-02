package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;

/* loaded from: classes.dex */
public final class RuntimeModuleData {

    /* renamed from: a, reason: collision with root package name */
    public final DeserializationComponents f24369a;
    public final PackagePartScopeCache b;

    public static final class Companion {
    }

    public RuntimeModuleData(DeserializationComponents deserializationComponents, PackagePartScopeCache packagePartScopeCache) {
        this.f24369a = deserializationComponents;
        this.b = packagePartScopeCache;
    }
}
