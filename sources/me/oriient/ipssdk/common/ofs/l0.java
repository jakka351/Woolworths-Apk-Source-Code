package me.oriient.ipssdk.common.ofs;

import android.content.SharedPreferences;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.common.ips.SharedPreferencesWrapperImpl;
import me.oriient.ipssdk.common.utils.models.SharedPreferencesWrapper;

/* loaded from: classes2.dex */
public final class l0 implements SharedPreferencesWrapper.Editor {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences.Editor f25759a;

    public l0(SharedPreferencesWrapperImpl sharedPreferencesWrapperImpl) {
        this.f25759a = sharedPreferencesWrapperImpl.f25714a.edit();
    }

    @Override // me.oriient.ipssdk.common.utils.models.SharedPreferencesWrapper.Editor
    public final void apply() {
        this.f25759a.apply();
    }

    @Override // me.oriient.ipssdk.common.utils.models.SharedPreferencesWrapper.Editor
    public final SharedPreferencesWrapper.Editor clear() {
        this.f25759a.clear();
        return this;
    }

    @Override // me.oriient.ipssdk.common.utils.models.SharedPreferencesWrapper.Editor
    public final boolean commit() {
        return this.f25759a.commit();
    }

    @Override // me.oriient.ipssdk.common.utils.models.SharedPreferencesWrapper.Editor
    public final SharedPreferencesWrapper.Editor putBoolean(String key, boolean z) {
        Intrinsics.h(key, "key");
        this.f25759a.putBoolean(key, z);
        return this;
    }

    @Override // me.oriient.ipssdk.common.utils.models.SharedPreferencesWrapper.Editor
    public final SharedPreferencesWrapper.Editor putFloat(String key, float f) {
        Intrinsics.h(key, "key");
        this.f25759a.putFloat(key, f);
        return this;
    }

    @Override // me.oriient.ipssdk.common.utils.models.SharedPreferencesWrapper.Editor
    public final SharedPreferencesWrapper.Editor putInt(String key, int i) {
        Intrinsics.h(key, "key");
        this.f25759a.putInt(key, i);
        return this;
    }

    @Override // me.oriient.ipssdk.common.utils.models.SharedPreferencesWrapper.Editor
    public final SharedPreferencesWrapper.Editor putLong(String key, long j) {
        Intrinsics.h(key, "key");
        this.f25759a.putLong(key, j);
        return this;
    }

    @Override // me.oriient.ipssdk.common.utils.models.SharedPreferencesWrapper.Editor
    public final SharedPreferencesWrapper.Editor putString(String key, String str) {
        Intrinsics.h(key, "key");
        this.f25759a.putString(key, str);
        return this;
    }

    @Override // me.oriient.ipssdk.common.utils.models.SharedPreferencesWrapper.Editor
    public final SharedPreferencesWrapper.Editor putStringSet(String key, Set set) {
        Intrinsics.h(key, "key");
        this.f25759a.putStringSet(key, set);
        return this;
    }

    @Override // me.oriient.ipssdk.common.utils.models.SharedPreferencesWrapper.Editor
    public final SharedPreferencesWrapper.Editor remove(String key) {
        Intrinsics.h(key, "key");
        this.f25759a.remove(key);
        return this;
    }
}
