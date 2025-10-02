package com.scandit.datacapture.tools.internal.sdk;

import com.scandit.datacapture.core.P3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019JQ\u0010\u000b\u001a\u00028\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0002\"\b\b\u0001\u0010\u0004*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJC\u0010\r\u001a\u00028\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0002\"\b\b\u0001\u0010\u0004*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJK\u0010\u0011\u001a\u00020\u0010\"\b\b\u0000\u0010\u0003*\u00020\u0002\"\b\b\u0001\u0010\u0004*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u0002\"\b\b\u0001\u0010\u0004*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u000f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014JG\u0010\u0016\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u0002\"\b\b\u0001\u0010\u0004*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u000f\u001a\u00028\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/scandit/datacapture/tools/internal/sdk/GuavaMapMakerProxyCache;", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "", "K", "V", "Lkotlin/reflect/KClass;", "keyClass", "scope", "key", "Lkotlin/Function0;", "defaultValue", "getOrPut", "(Lkotlin/reflect/KClass;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "require", "(Lkotlin/reflect/KClass;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "value", "", "put", "(Lkotlin/reflect/KClass;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "requireByValue", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Ljava/lang/Object;", "defaultKey", "getByValueOrPut", "(Lkotlin/reflect/KClass;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "<init>", "()V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class GuavaMapMakerProxyCache implements ProxyCache {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f19001a = new LinkedHashMap();
    private final LinkedHashMap b = new LinkedHashMap();

    private final synchronized ConcurrentMap a(KClass kClass, Object obj) {
        ConcurrentMap concurrentMap;
        try {
            if (obj == null) {
                LinkedHashMap linkedHashMap = this.f19001a;
                Object objB = linkedHashMap.get(kClass);
                if (objB == null) {
                    objB = new P3().c().d().b();
                    Intrinsics.g(objB, "MapMaker()\n             …               .makeMap()");
                    linkedHashMap.put(kClass, objB);
                }
                concurrentMap = (ConcurrentMap) objB;
            } else {
                WeakHashMap weakHashMap = (WeakHashMap) this.b.get(kClass);
                if (weakHashMap == null) {
                    weakHashMap = new WeakHashMap();
                    this.b.put(kClass, weakHashMap);
                }
                Object objB2 = weakHashMap.get(obj);
                if (objB2 == null) {
                    objB2 = new P3().c().d().b();
                    Intrinsics.g(objB2, "MapMaker()\n             …               .makeMap()");
                    weakHashMap.put(obj, objB2);
                }
                concurrentMap = (ConcurrentMap) objB2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return concurrentMap;
    }

    @Override // com.scandit.datacapture.tools.internal.sdk.ProxyCache
    @NotNull
    public <K, V> K getByValueOrPut(@NotNull KClass<K> keyClass, @NotNull V value, @NotNull Function0<? extends K> defaultKey) {
        Object next;
        Intrinsics.h(keyClass, "keyClass");
        Intrinsics.h(value, "value");
        Intrinsics.h(defaultKey, "defaultKey");
        ConcurrentMap concurrentMapA = a(keyClass, null);
        Iterator<T> it = concurrentMapA.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Map.Entry) next).getValue() == value) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        K k = entry != null ? (K) entry.getKey() : null;
        if (k == null) {
            k = (K) defaultKey.invoke();
            concurrentMapA.put(k, value);
        }
        Intrinsics.f(k, "null cannot be cast to non-null type K of com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache.getByValueOrPut");
        return k;
    }

    @Override // com.scandit.datacapture.tools.internal.sdk.ProxyCache
    @NotNull
    public <K, V> V getOrPut(@NotNull KClass<K> keyClass, @Nullable Object scope, @NotNull K key, @NotNull Function0<? extends V> defaultValue) {
        Object objPutIfAbsent;
        Intrinsics.h(keyClass, "keyClass");
        Intrinsics.h(key, "key");
        Intrinsics.h(defaultValue, "defaultValue");
        ConcurrentMap concurrentMapA = a(keyClass, scope);
        V v = (V) concurrentMapA.get(key);
        if (v == null && (objPutIfAbsent = concurrentMapA.putIfAbsent(key, (v = (V) defaultValue.invoke()))) != null) {
            v = (V) objPutIfAbsent;
        }
        Intrinsics.f(v, "null cannot be cast to non-null type V of com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache.getOrPut");
        return v;
    }

    @Override // com.scandit.datacapture.tools.internal.sdk.ProxyCache
    public <K, V> void put(@NotNull KClass<K> keyClass, @Nullable Object scope, @NotNull K key, @NotNull V value) {
        Intrinsics.h(keyClass, "keyClass");
        Intrinsics.h(key, "key");
        Intrinsics.h(value, "value");
        a(keyClass, scope).put(key, value);
    }

    @Override // com.scandit.datacapture.tools.internal.sdk.ProxyCache
    @NotNull
    public <K, V> V require(@NotNull KClass<K> keyClass, @Nullable Object scope, @NotNull K key) {
        Intrinsics.h(keyClass, "keyClass");
        Intrinsics.h(key, "key");
        V v = (V) a(keyClass, scope).get(key);
        if (v != null) {
            return v;
        }
        throw new IllegalArgumentException("Cache for class " + keyClass + " contains no key " + key);
    }

    @Override // com.scandit.datacapture.tools.internal.sdk.ProxyCache
    @NotNull
    public <K, V> K requireByValue(@NotNull KClass<K> keyClass, @NotNull V value) {
        Object next;
        Intrinsics.h(keyClass, "keyClass");
        Intrinsics.h(value, "value");
        K k = null;
        Iterator<T> it = a(keyClass, null).entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.c(((Map.Entry) next).getValue(), value)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            k = (K) entry.getKey();
        }
        if (k != null) {
            return k;
        }
        throw new IllegalArgumentException("Cache for class " + keyClass + " contains no key for value " + value);
    }
}
