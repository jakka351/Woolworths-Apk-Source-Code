package me.oriient.ipssdk.common.ips;

import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.common.ofs.l0;
import me.oriient.ipssdk.common.utils.models.SharedPreferencesWrapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u00072\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lme/oriient/ipssdk/common/ips/SharedPreferencesWrapperImpl;", "Lme/oriient/ipssdk/common/utils/models/SharedPreferencesWrapper;", "Landroid/content/SharedPreferences;", "prefs", "<init>", "(Landroid/content/SharedPreferences;)V", "", "", "getAll", "()Ljava/util/Map;", "key", "defValue", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "defValues", "getStringSet", "(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;", "", "getInt", "(Ljava/lang/String;I)I", "", "getLong", "(Ljava/lang/String;J)J", "", "getFloat", "(Ljava/lang/String;F)F", "", "getBoolean", "(Ljava/lang/String;Z)Z", "contains", "(Ljava/lang/String;)Z", "Lme/oriient/ipssdk/common/utils/models/SharedPreferencesWrapper$Editor;", "edit", "()Lme/oriient/ipssdk/common/utils/models/SharedPreferencesWrapper$Editor;", "me/oriient/ipssdk/common/ofs/l0", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SharedPreferencesWrapperImpl implements SharedPreferencesWrapper {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f25714a;
    private final l0 b;

    public SharedPreferencesWrapperImpl(@NotNull SharedPreferences prefs) {
        Intrinsics.h(prefs, "prefs");
        this.f25714a = prefs;
        this.b = new l0(this);
    }

    @Override // me.oriient.ipssdk.common.utils.models.SharedPreferencesWrapper
    public boolean contains(@NotNull String key) {
        Intrinsics.h(key, "key");
        return this.f25714a.contains(key);
    }

    @Override // me.oriient.ipssdk.common.utils.models.SharedPreferencesWrapper
    @NotNull
    public SharedPreferencesWrapper.Editor edit() {
        return this.b;
    }

    @Override // me.oriient.ipssdk.common.utils.models.SharedPreferencesWrapper
    @NotNull
    public Map<String, ?> getAll() {
        Map<String, ?> all = this.f25714a.getAll();
        Intrinsics.g(all, "getAll(...)");
        return all;
    }

    @Override // me.oriient.ipssdk.common.utils.models.SharedPreferencesWrapper
    public boolean getBoolean(@NotNull String key, boolean defValue) {
        Intrinsics.h(key, "key");
        return this.f25714a.getBoolean(key, defValue);
    }

    @Override // me.oriient.ipssdk.common.utils.models.SharedPreferencesWrapper
    public float getFloat(@NotNull String key, float defValue) {
        Intrinsics.h(key, "key");
        return this.f25714a.getFloat(key, defValue);
    }

    @Override // me.oriient.ipssdk.common.utils.models.SharedPreferencesWrapper
    public int getInt(@NotNull String key, int defValue) {
        Intrinsics.h(key, "key");
        return this.f25714a.getInt(key, defValue);
    }

    @Override // me.oriient.ipssdk.common.utils.models.SharedPreferencesWrapper
    public long getLong(@NotNull String key, long defValue) {
        Intrinsics.h(key, "key");
        return this.f25714a.getLong(key, defValue);
    }

    @Override // me.oriient.ipssdk.common.utils.models.SharedPreferencesWrapper
    @Nullable
    public String getString(@NotNull String key, @Nullable String defValue) {
        Intrinsics.h(key, "key");
        return this.f25714a.getString(key, defValue);
    }

    @Override // me.oriient.ipssdk.common.utils.models.SharedPreferencesWrapper
    @Nullable
    public Set<String> getStringSet(@NotNull String key, @Nullable Set<String> defValues) {
        Intrinsics.h(key, "key");
        return this.f25714a.getStringSet(key, defValues);
    }
}
