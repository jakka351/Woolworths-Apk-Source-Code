package com.adobe.marketing.mobile.services;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;

@SuppressLint
/* loaded from: classes.dex */
class SharedPreferencesNamedCollection implements NamedCollection {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f13240a;
    public final SharedPreferences.Editor b;

    public SharedPreferencesNamedCollection(SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        this.f13240a = sharedPreferences;
        this.b = editor;
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public final void a(long j, String str) {
        this.b.putLong(str, j);
        c();
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public final void b(int i) {
        this.b.putInt("Launches", i);
        c();
    }

    public final void c() {
        if (this.b.commit()) {
            return;
        }
        Log.b("Services", "SharedPreferencesNamedCollection", "Android SharedPreference unable to commit the persisted data", new Object[0]);
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public final boolean contains(String str) {
        return this.f13240a.contains(str);
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public final boolean getBoolean(String str) {
        return this.f13240a.getBoolean(str, false);
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public final long getLong(String str, long j) {
        return this.f13240a.getLong(str, j);
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public final String getString(String str) {
        return this.f13240a.getString(str, null);
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public final void remove(String str) {
        this.b.remove(str);
        c();
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public final void setBoolean(String str, boolean z) {
        this.b.putBoolean(str, z);
        c();
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public final void setString(String str, String str2) {
        this.b.putString(str, str2);
        c();
    }
}
