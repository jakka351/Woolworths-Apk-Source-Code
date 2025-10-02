package me.oriient.ipssdk.common.utils.models;

import androidx.annotation.Keep;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\u0016J\u0011\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016J(\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014H\u0016¨\u0006\u0017"}, d2 = {"Lme/oriient/ipssdk/common/utils/models/SharedPreferencesWrapper;", "", "contains", "", "key", "", "edit", "Lme/oriient/ipssdk/common/utils/models/SharedPreferencesWrapper$Editor;", "getAll", "", "getBoolean", "defValue", "getFloat", "", "getInt", "", "getLong", "", "getString", "getStringSet", "", "defValues", "Editor", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SharedPreferencesWrapper {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean contains(@NotNull SharedPreferencesWrapper sharedPreferencesWrapper, @NotNull String key) {
            Intrinsics.h(key, "key");
            return false;
        }

        @NotNull
        public static Map<String, ?> getAll(@NotNull SharedPreferencesWrapper sharedPreferencesWrapper) {
            return EmptyMap.d;
        }

        public static boolean getBoolean(@NotNull SharedPreferencesWrapper sharedPreferencesWrapper, @NotNull String key, boolean z) {
            Intrinsics.h(key, "key");
            return false;
        }

        public static float getFloat(@NotNull SharedPreferencesWrapper sharedPreferencesWrapper, @NotNull String key, float f) {
            Intrinsics.h(key, "key");
            return BitmapDescriptorFactory.HUE_RED;
        }

        public static int getInt(@NotNull SharedPreferencesWrapper sharedPreferencesWrapper, @NotNull String key, int i) {
            Intrinsics.h(key, "key");
            return 0;
        }

        public static long getLong(@NotNull SharedPreferencesWrapper sharedPreferencesWrapper, @NotNull String key, long j) {
            Intrinsics.h(key, "key");
            return 0L;
        }

        @Nullable
        public static String getString(@NotNull SharedPreferencesWrapper sharedPreferencesWrapper, @NotNull String key, @Nullable String str) {
            Intrinsics.h(key, "key");
            return null;
        }

        @Nullable
        public static Set<String> getStringSet(@NotNull SharedPreferencesWrapper sharedPreferencesWrapper, @NotNull String key, @Nullable Set<String> set) {
            Intrinsics.h(key, "key");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0000H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H&J\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\fH&J\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000eH&J\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0010H&J\u001a\u0010\u0011\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH&J \u0010\u0012\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH&¨\u0006\u0016"}, d2 = {"Lme/oriient/ipssdk/common/utils/models/SharedPreferencesWrapper$Editor;", "", "apply", "", "clear", "commit", "", "putBoolean", "key", "", "value", "putFloat", "", "putInt", "", "putLong", "", "putString", "putStringSet", "values", "", "remove", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Editor {
        void apply();

        @NotNull
        Editor clear();

        boolean commit();

        @NotNull
        Editor putBoolean(@NotNull String key, boolean value);

        @NotNull
        Editor putFloat(@NotNull String key, float value);

        @NotNull
        Editor putInt(@NotNull String key, int value);

        @NotNull
        Editor putLong(@NotNull String key, long value);

        @NotNull
        Editor putString(@NotNull String key, @Nullable String value);

        @NotNull
        Editor putStringSet(@NotNull String key, @Nullable Set<String> values);

        @NotNull
        Editor remove(@NotNull String key);
    }

    boolean contains(@NotNull String key);

    @NotNull
    Editor edit();

    @NotNull
    Map<String, ?> getAll();

    boolean getBoolean(@NotNull String key, boolean defValue);

    float getFloat(@NotNull String key, float defValue);

    int getInt(@NotNull String key, int defValue);

    long getLong(@NotNull String key, long defValue);

    @Nullable
    String getString(@NotNull String key, @Nullable String defValue);

    @Nullable
    Set<String> getStringSet(@NotNull String key, @Nullable Set<String> defValues);
}
