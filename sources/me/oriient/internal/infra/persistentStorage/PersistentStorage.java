package me.oriient.internal.infra.persistentStorage;

import androidx.annotation.Keep;
import java.util.Set;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H&J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\rH&J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u000fH&J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H&J(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0012H&J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0005H&J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000bH&J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\rH&J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000fH&J\u001a\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H&J \u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0012H&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u001d"}, d2 = {"Lme/oriient/internal/infra/persistentStorage/PersistentStorage;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "clear", "", "contains", "", "key", "", "getBoolean", "defValue", "getFloat", "", "getInt", "", "getLong", "", "getString", "getStringSet", "", "defValues", "putBoolean", "value", "putFloat", "putInt", "putLong", "putString", "putStringSet", "values", "remove", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PersistentStorage extends DiProvidable {
    void clear();

    boolean contains(@NotNull String key);

    boolean getBoolean(@NotNull String key, boolean defValue);

    float getFloat(@NotNull String key, float defValue);

    int getInt(@NotNull String key, int defValue);

    long getLong(@NotNull String key, long defValue);

    @Nullable
    String getString(@NotNull String key, @Nullable String defValue);

    @Nullable
    Set<String> getStringSet(@NotNull String key, @Nullable Set<String> defValues);

    void putBoolean(@NotNull String key, boolean value);

    void putFloat(@NotNull String key, float value);

    void putInt(@NotNull String key, int value);

    void putLong(@NotNull String key, long value);

    void putString(@NotNull String key, @Nullable String value);

    void putStringSet(@NotNull String key, @Nullable Set<String> values);

    void remove(@NotNull String key);
}
