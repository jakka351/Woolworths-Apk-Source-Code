package kotlin.reflect.jvm.internal.impl.resolve.sam;

import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNullableValues;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class SamConversionResolverImpl implements SamConversionResolver {

    /* renamed from: a, reason: collision with root package name */
    public final CacheWithNullableValues f24551a;

    public SamConversionResolverImpl(LockBasedStorageManager lockBasedStorageManager) {
        this.f24551a = lockBasedStorageManager.i();
    }
}
