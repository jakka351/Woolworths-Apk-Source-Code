package me.oriient.internal.infra.persistentStorage;

import androidx.annotation.Keep;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0006H\u0016J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\bH\u0016J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\nH\u0016J\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\fH\u0016J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0016J(\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u00062\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010H\u0016J\u0018\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\bH\u0016J\u0018\u0010 \u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\nH\u0016J\u0018\u0010!\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\fH\u0016J\u0018\u0010\"\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\u001a\u0010#\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u0016J \u0010$\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010H\u0016J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0006H\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00100\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lme/oriient/internal/infra/persistentStorage/InMemoryStorage;", "Lme/oriient/internal/infra/persistentStorage/PersistentStorage;", "()V", "all", "", "", "", "booleans", "", "floats", "", "ints", "", "longs", "", "stringSets", "", "strings", "clear", "", "contains", "key", "getBoolean", "defValue", "getFloat", "getInt", "getLong", "getString", "getStringSet", "defValues", "putBoolean", "value", "putFloat", "putInt", "putLong", "putString", "putStringSet", "values", "remove", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class InMemoryStorage implements PersistentStorage {

    @NotNull
    private final List<Map<String, ?>> all;

    @NotNull
    private final Map<String, Boolean> booleans;

    @NotNull
    private final Map<String, Float> floats;

    @NotNull
    private final Map<String, Integer> ints;

    @NotNull
    private final Map<String, Long> longs;

    @NotNull
    private final Map<String, Set<String>> stringSets;

    @NotNull
    private final Map<String, String> strings;

    public InMemoryStorage() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.strings = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.floats = linkedHashMap2;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        this.booleans = linkedHashMap3;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        this.ints = linkedHashMap4;
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        this.longs = linkedHashMap5;
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        this.stringSets = linkedHashMap6;
        this.all = CollectionsKt.R(linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4, linkedHashMap5, linkedHashMap6);
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public void clear() {
        Iterator<T> it = this.all.iterator();
        while (it.hasNext()) {
            ((Map) it.next()).clear();
        }
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public boolean contains(@NotNull String key) {
        Intrinsics.h(key, "key");
        Iterator<T> it = this.all.iterator();
        while (it.hasNext()) {
            if (((Map) it.next()).containsKey(key)) {
                return true;
            }
        }
        return false;
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public boolean getBoolean(@NotNull String key, boolean defValue) {
        Intrinsics.h(key, "key");
        Boolean bool = this.booleans.get(key);
        return bool != null ? bool.booleanValue() : defValue;
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public float getFloat(@NotNull String key, float defValue) {
        Intrinsics.h(key, "key");
        Float f = this.floats.get(key);
        return f != null ? f.floatValue() : defValue;
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public int getInt(@NotNull String key, int defValue) {
        Intrinsics.h(key, "key");
        Integer num = this.ints.get(key);
        return num != null ? num.intValue() : defValue;
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public long getLong(@NotNull String key, long defValue) {
        Intrinsics.h(key, "key");
        Long l = this.longs.get(key);
        return l != null ? l.longValue() : defValue;
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    @Nullable
    public String getString(@NotNull String key, @Nullable String defValue) {
        Intrinsics.h(key, "key");
        String str = this.strings.get(key);
        return str == null ? defValue : str;
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    @Nullable
    public Set<String> getStringSet(@NotNull String key, @Nullable Set<String> defValues) {
        Intrinsics.h(key, "key");
        Set<String> set = this.stringSets.get(key);
        return set == null ? defValues : set;
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public void putBoolean(@NotNull String key, boolean value) {
        Intrinsics.h(key, "key");
        this.booleans.put(key, Boolean.valueOf(value));
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public void putFloat(@NotNull String key, float value) {
        Intrinsics.h(key, "key");
        this.floats.put(key, Float.valueOf(value));
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public void putInt(@NotNull String key, int value) {
        Intrinsics.h(key, "key");
        this.ints.put(key, Integer.valueOf(value));
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public void putLong(@NotNull String key, long value) {
        Intrinsics.h(key, "key");
        this.longs.put(key, Long.valueOf(value));
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public void putString(@NotNull String key, @Nullable String value) {
        Intrinsics.h(key, "key");
        this.strings.put(key, value);
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public void putStringSet(@NotNull String key, @Nullable Set<String> values) {
        Intrinsics.h(key, "key");
        this.stringSets.put(key, values);
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public void remove(@NotNull String key) {
        Intrinsics.h(key, "key");
        Iterator<T> it = this.all.iterator();
        while (it.hasNext() && ((Map) it.next()).remove(key) == null) {
        }
    }
}
