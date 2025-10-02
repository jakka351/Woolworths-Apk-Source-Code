package me.oriient.internal.infra.persistentStorage;

import android.content.SharedPreferences;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class a implements PersistentStorage {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f24975a;

    public a(SharedPreferences prefs) {
        Intrinsics.h(prefs, "prefs");
        this.f24975a = prefs;
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public final void clear() {
        this.f24975a.edit().clear().apply();
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public final boolean contains(String key) {
        Intrinsics.h(key, "key");
        return this.f24975a.contains(key);
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public final boolean getBoolean(String key, boolean z) {
        Intrinsics.h(key, "key");
        return this.f24975a.getBoolean(key, z);
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public final float getFloat(String key, float f) {
        Intrinsics.h(key, "key");
        return this.f24975a.getFloat(key, f);
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public final int getInt(String key, int i) {
        Intrinsics.h(key, "key");
        return this.f24975a.getInt(key, i);
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public final long getLong(String key, long j) {
        Intrinsics.h(key, "key");
        return this.f24975a.getLong(key, j);
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public final String getString(String key, String str) {
        Intrinsics.h(key, "key");
        return this.f24975a.getString(key, str);
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public final Set getStringSet(String key, Set set) {
        Intrinsics.h(key, "key");
        return this.f24975a.getStringSet(key, set);
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public final void putBoolean(String key, boolean z) {
        Intrinsics.h(key, "key");
        this.f24975a.edit().putBoolean(key, z).apply();
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public final void putFloat(String key, float f) {
        Intrinsics.h(key, "key");
        this.f24975a.edit().putFloat(key, f).apply();
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public final void putInt(String key, int i) {
        Intrinsics.h(key, "key");
        this.f24975a.edit().putInt(key, i).apply();
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public final void putLong(String key, long j) {
        Intrinsics.h(key, "key");
        this.f24975a.edit().putLong(key, j).apply();
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public final void putString(String key, String str) {
        Intrinsics.h(key, "key");
        c.v(this.f24975a, key, str);
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public final void putStringSet(String key, Set set) {
        Intrinsics.h(key, "key");
        this.f24975a.edit().putStringSet(key, set).apply();
    }

    @Override // me.oriient.internal.infra.persistentStorage.PersistentStorage
    public final void remove(String key) {
        Intrinsics.h(key, "key");
        this.f24975a.edit().remove(key).apply();
    }
}
