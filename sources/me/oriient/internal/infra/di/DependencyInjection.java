package me.oriient.internal.infra.di;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\f\u001a\u00020\rH&J#\u0010\u000e\u001a\u0002H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H&¢\u0006\u0002\u0010\u0013J-\u0010\u000e\u001a\u0002H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\u0015J#\u0010\u0016\u001a\u0002H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0017H&¢\u0006\u0002\u0010\u0018J-\u0010\u0016\u001a\u0002H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\u0019J%\u0010\u001a\u001a\u0004\u0018\u0001H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H&¢\u0006\u0002\u0010\u0013J/\u0010\u001a\u001a\u0004\u0018\u0001H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\u0015J$\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u001c\"\b\b\u0000\u0010\u000f*\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H&J,\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u001c\"\b\b\u0000\u0010\u000f*\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u0014\u001a\u00020\u0003H&J$\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u001c\"\b\b\u0000\u0010\u000f*\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0017H&J,\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u001c\"\b\b\u0000\u0010\u000f*\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u0014\u001a\u00020\u0003H&J&\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000f0\u001c\"\b\b\u0000\u0010\u000f*\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H&J.\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000f0\u001c\"\b\b\u0000\u0010\u000f*\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u0014\u001a\u00020\u0003H&J \u0010\u001f\u001a\u00020 2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003H&J\u001e\u0010!\u001a\u00020 2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H&J8\u0010\"\u001a\u00020\r\"\b\b\u0000\u0010\u000f*\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u000f0$H&J8\u0010%\u001a\u00020\r\"\b\b\u0000\u0010\u000f*\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u000f0$H&J \u0010&\u001a\u00020\r2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006'"}, d2 = {"Lme/oriient/internal/infra/di/DependencyInjection;", "", "id", "", "getId", "()Ljava/lang/String;", "logger", "Lme/oriient/internal/infra/utils/core/Logger;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "setLogger", "(Lme/oriient/internal/infra/utils/core/Logger;)V", "clear", "", "get", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lme/oriient/internal/infra/utils/core/DiProvidable;", "asInstanceOf", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)Lme/oriient/internal/infra/utils/core/DiProvidable;", "named", "(Lkotlin/reflect/KClass;Ljava/lang/String;)Lme/oriient/internal/infra/utils/core/DiProvidable;", "getJava", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lme/oriient/internal/infra/utils/core/DiProvidable;", "(Ljava/lang/Class;Ljava/lang/String;)Lme/oriient/internal/infra/utils/core/DiProvidable;", "getOrNull", "inject", "Lkotlin/Lazy;", "injectJava", "injectOrNull", "isRegistered", "", "isRegisteredJava", "registerFactory", "creator", "Lkotlin/Function0;", "registerSingleton", "unregister", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DependencyInjection {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ boolean isRegistered$default(DependencyInjection dependencyInjection, KClass kClass, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isRegistered");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return dependencyInjection.isRegistered(kClass, str);
        }

        public static /* synthetic */ void registerFactory$default(DependencyInjection dependencyInjection, KClass kClass, String str, Function0 function0, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerFactory");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            dependencyInjection.registerFactory(kClass, str, function0);
        }

        public static /* synthetic */ void registerSingleton$default(DependencyInjection dependencyInjection, KClass kClass, String str, Function0 function0, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerSingleton");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            dependencyInjection.registerSingleton(kClass, str, function0);
        }

        public static /* synthetic */ void unregister$default(DependencyInjection dependencyInjection, KClass kClass, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unregister");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            dependencyInjection.unregister(kClass, str);
        }
    }

    void clear();

    @NotNull
    <T extends DiProvidable> T get(@NotNull KClass<?> asInstanceOf);

    @NotNull
    <T extends DiProvidable> T get(@NotNull KClass<?> asInstanceOf, @Nullable String named);

    @NotNull
    String getId();

    @NotNull
    <T extends DiProvidable> T getJava(@NotNull Class<?> asInstanceOf);

    @NotNull
    <T extends DiProvidable> T getJava(@NotNull Class<?> asInstanceOf, @Nullable String named);

    @Nullable
    Logger getLogger();

    @Nullable
    <T extends DiProvidable> T getOrNull(@NotNull KClass<?> asInstanceOf);

    @Nullable
    <T extends DiProvidable> T getOrNull(@NotNull KClass<?> asInstanceOf, @Nullable String named);

    @NotNull
    <T extends DiProvidable> Lazy<T> inject(@NotNull KClass<?> asInstanceOf);

    @NotNull
    <T extends DiProvidable> Lazy<T> inject(@NotNull KClass<?> asInstanceOf, @NotNull String named);

    @NotNull
    <T extends DiProvidable> Lazy<T> injectJava(@NotNull Class<?> asInstanceOf);

    @NotNull
    <T extends DiProvidable> Lazy<T> injectJava(@NotNull Class<?> asInstanceOf, @NotNull String named);

    @NotNull
    <T extends DiProvidable> Lazy<T> injectOrNull(@NotNull KClass<?> asInstanceOf);

    @NotNull
    <T extends DiProvidable> Lazy<T> injectOrNull(@NotNull KClass<?> asInstanceOf, @NotNull String named);

    boolean isRegistered(@NotNull KClass<?> asInstanceOf, @Nullable String named);

    boolean isRegisteredJava(@NotNull Class<?> asInstanceOf, @Nullable String named);

    <T extends DiProvidable> void registerFactory(@NotNull KClass<?> asInstanceOf, @Nullable String named, @NotNull Function0<? extends T> creator);

    <T extends DiProvidable> void registerSingleton(@NotNull KClass<?> asInstanceOf, @Nullable String named, @NotNull Function0<? extends T> creator);

    void setLogger(@Nullable Logger logger);

    void unregister(@NotNull KClass<?> asInstanceOf, @Nullable String named);
}
