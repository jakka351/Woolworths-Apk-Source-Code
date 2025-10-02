package me.oriient.internal.infra.di;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u00060\u0002j\u0002`\u00102\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0011\u001a\u00060\u0002j\u0002`\u00102\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0014J=\u0010\u0018\u001a\u00020\u0017\"\b\b\u0000\u0010\t*\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001a\u001a\u00020\u0017\"\b\b\u0000\u0010\t*\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J%\u0010\u001b\u001a\u00020\u00172\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\b\b\u0000\u0010\t*\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0004\b \u0010!J3\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\b\b\u0000\u0010\t*\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010\"J-\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001f\"\b\b\u0000\u0010\t*\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0004\b#\u0010!J5\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001f\"\b\b\u0000\u0010\t*\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010\"J%\u0010$\u001a\u00028\u0000\"\b\b\u0000\u0010\t*\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0004\b$\u0010%J/\u0010$\u001a\u00028\u0000\"\b\b\u0000\u0010\t*\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b$\u0010&J'\u0010'\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0004\b'\u0010%J1\u0010'\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b'\u0010&J+\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\b\b\u0000\u0010\t*\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016¢\u0006\u0004\b(\u0010)J3\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\b\b\u0000\u0010\t*\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010*J%\u0010+\u001a\u00028\u0000\"\b\b\u0000\u0010\t*\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016¢\u0006\u0004\b+\u0010,J/\u0010+\u001a\u00028\u0000\"\b\b\u0000\u0010\t*\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b+\u0010-J%\u0010.\u001a\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b.\u0010/J%\u00100\u001a\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b0\u00101R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00105R(\u00108\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u000307068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R$\u0010;\u001a\u0004\u0018\u00010:8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lme/oriient/internal/infra/di/DependencyInjectionImpl;", "Lme/oriient/internal/infra/di/DependencyInjection;", "", "id", "", "isSingletonSynchronizationEnabled", "<init>", "(Ljava/lang/String;Z)V", "Lme/oriient/internal/infra/utils/core/DiProvidable;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/reflect/KClass;", "asInstanceOf", "named", "shouldThrow", "getInternal", "(Lkotlin/reflect/KClass;Ljava/lang/String;Z)Lme/oriient/internal/infra/utils/core/DiProvidable;", "Lme/oriient/internal/infra/di/InstanceKey;", "createInstanceKey", "(Lkotlin/reflect/KClass;Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/Class;", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function0;", "creator", "", "registerSingleton", "(Lkotlin/reflect/KClass;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "registerFactory", "unregister", "(Lkotlin/reflect/KClass;Ljava/lang/String;)V", "clear", "()V", "Lkotlin/Lazy;", "inject", "(Lkotlin/reflect/KClass;)Lkotlin/Lazy;", "(Lkotlin/reflect/KClass;Ljava/lang/String;)Lkotlin/Lazy;", "injectOrNull", "get", "(Lkotlin/reflect/KClass;)Lme/oriient/internal/infra/utils/core/DiProvidable;", "(Lkotlin/reflect/KClass;Ljava/lang/String;)Lme/oriient/internal/infra/utils/core/DiProvidable;", "getOrNull", "injectJava", "(Ljava/lang/Class;)Lkotlin/Lazy;", "(Ljava/lang/Class;Ljava/lang/String;)Lkotlin/Lazy;", "getJava", "(Ljava/lang/Class;)Lme/oriient/internal/infra/utils/core/DiProvidable;", "(Ljava/lang/Class;Ljava/lang/String;)Lme/oriient/internal/infra/utils/core/DiProvidable;", "isRegisteredJava", "(Ljava/lang/Class;Ljava/lang/String;)Z", "isRegistered", "(Lkotlin/reflect/KClass;Ljava/lang/String;)Z", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Z", "Ljava/util/concurrent/ConcurrentHashMap;", "Lme/oriient/internal/infra/di/g;", "dependencies", "Ljava/util/concurrent/ConcurrentHashMap;", "Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Lme/oriient/internal/infra/utils/core/Logger;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "setLogger", "(Lme/oriient/internal/infra/utils/core/Logger;)V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DependencyInjectionImpl implements DependencyInjection {

    @NotNull
    private final ConcurrentHashMap<String, g> dependencies;

    @NotNull
    private final String id;
    private final boolean isSingletonSynchronizationEnabled;

    @Nullable
    private Logger logger;

    public DependencyInjectionImpl() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    private final String createInstanceKey(KClass<?> asInstanceOf, String named) {
        StringBuilder sb = new StringBuilder();
        sb.append(JvmClassMappingKt.b(asInstanceOf).getName());
        sb.append('_');
        if (named == null) {
            named = "";
        }
        sb.append(named);
        return sb.toString();
    }

    private final <T extends DiProvidable> T getInternal(KClass<?> asInstanceOf, String named, boolean shouldThrow) throws h {
        g gVar = this.dependencies.get(createInstanceKey(asInstanceOf, named));
        T t = (T) (gVar != null ? gVar.get() : null);
        if (t != null) {
            return t;
        }
        if (!shouldThrow) {
            return null;
        }
        throw new h("Unable to find a definition of class " + JvmClassMappingKt.b(asInstanceOf).getName() + " named " + named);
    }

    @Override // me.oriient.internal.infra.di.DependencyInjection
    public void clear() {
        Logger logger = getLogger();
        if (logger != null) {
            logger.d("DependencyInjection", "clear() called");
        }
        this.dependencies.clear();
    }

    @Override // me.oriient.internal.infra.di.DependencyInjection
    @NotNull
    public <T extends DiProvidable> T get(@NotNull KClass<?> asInstanceOf) {
        Intrinsics.h(asInstanceOf, "asInstanceOf");
        return (T) get(asInstanceOf, null);
    }

    @Override // me.oriient.internal.infra.di.DependencyInjection
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // me.oriient.internal.infra.di.DependencyInjection
    @NotNull
    public <T extends DiProvidable> T getJava(@NotNull Class<?> asInstanceOf) {
        Intrinsics.h(asInstanceOf, "asInstanceOf");
        return (T) getJava(asInstanceOf, null);
    }

    @Override // me.oriient.internal.infra.di.DependencyInjection
    @Nullable
    public Logger getLogger() {
        return this.logger;
    }

    @Override // me.oriient.internal.infra.di.DependencyInjection
    @Nullable
    public <T extends DiProvidable> T getOrNull(@NotNull KClass<?> asInstanceOf) {
        Intrinsics.h(asInstanceOf, "asInstanceOf");
        return (T) getOrNull(asInstanceOf, null);
    }

    @Override // me.oriient.internal.infra.di.DependencyInjection
    @NotNull
    public <T extends DiProvidable> Lazy<T> inject(@NotNull KClass<?> asInstanceOf) {
        Intrinsics.h(asInstanceOf, "asInstanceOf");
        return LazyKt.b(new a(this, asInstanceOf));
    }

    @Override // me.oriient.internal.infra.di.DependencyInjection
    @NotNull
    public <T extends DiProvidable> Lazy<T> injectJava(@NotNull Class<?> asInstanceOf) {
        Intrinsics.h(asInstanceOf, "asInstanceOf");
        return LazyKt.b(new c(this, asInstanceOf));
    }

    @Override // me.oriient.internal.infra.di.DependencyInjection
    @NotNull
    public <T extends DiProvidable> Lazy<T> injectOrNull(@NotNull KClass<?> asInstanceOf) {
        Intrinsics.h(asInstanceOf, "asInstanceOf");
        return LazyKt.b(new e(this, asInstanceOf));
    }

    @Override // me.oriient.internal.infra.di.DependencyInjection
    public boolean isRegistered(@NotNull KClass<?> asInstanceOf, @Nullable String named) {
        Intrinsics.h(asInstanceOf, "asInstanceOf");
        return isRegisteredJava(JvmClassMappingKt.b(asInstanceOf), named);
    }

    @Override // me.oriient.internal.infra.di.DependencyInjection
    public boolean isRegisteredJava(@NotNull Class<?> asInstanceOf, @Nullable String named) {
        Intrinsics.h(asInstanceOf, "asInstanceOf");
        return this.dependencies.containsKey(createInstanceKey(asInstanceOf, named));
    }

    @Override // me.oriient.internal.infra.di.DependencyInjection
    public <T extends DiProvidable> void registerFactory(@NotNull KClass<?> asInstanceOf, @Nullable String named, @NotNull Function0<? extends T> creator) {
        Intrinsics.h(asInstanceOf, "asInstanceOf");
        Intrinsics.h(creator, "creator");
        Logger logger = getLogger();
        if (logger != null) {
            logger.d("DependencyInjection", "registerFactory: for class " + JvmClassMappingKt.b(asInstanceOf).getName() + ", named " + named);
        }
        this.dependencies.put(createInstanceKey(asInstanceOf, named), new i(creator));
    }

    @Override // me.oriient.internal.infra.di.DependencyInjection
    public <T extends DiProvidable> void registerSingleton(@NotNull KClass<?> asInstanceOf, @Nullable String named, @NotNull Function0<? extends T> creator) {
        g jVar;
        Intrinsics.h(asInstanceOf, "asInstanceOf");
        Intrinsics.h(creator, "creator");
        Logger logger = getLogger();
        if (logger != null) {
            logger.d("DependencyInjection", "registerSingleton: for class " + JvmClassMappingKt.b(asInstanceOf).getName() + ", named " + named);
        }
        ConcurrentHashMap<String, g> concurrentHashMap = this.dependencies;
        String strCreateInstanceKey = createInstanceKey(asInstanceOf, named);
        boolean z = this.isSingletonSynchronizationEnabled;
        if (z) {
            jVar = new k(creator);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            jVar = new j(creator);
        }
        concurrentHashMap.put(strCreateInstanceKey, jVar);
    }

    @Override // me.oriient.internal.infra.di.DependencyInjection
    public void setLogger(@Nullable Logger logger) {
        this.logger = logger;
    }

    @Override // me.oriient.internal.infra.di.DependencyInjection
    public void unregister(@NotNull KClass<?> asInstanceOf, @Nullable String named) {
        Intrinsics.h(asInstanceOf, "asInstanceOf");
        Logger logger = getLogger();
        if (logger != null) {
            logger.d("DependencyInjection", "unregister() called with: asInstanceOf = " + asInstanceOf + ", named = " + named);
        }
        this.dependencies.remove(createInstanceKey(asInstanceOf, named));
    }

    public DependencyInjectionImpl(@NotNull String id, boolean z) {
        Intrinsics.h(id, "id");
        this.id = id;
        this.isSingletonSynchronizationEnabled = z;
        this.dependencies = new ConcurrentHashMap<>();
    }

    private final String createInstanceKey(Class<?> asInstanceOf, String named) {
        StringBuilder sb = new StringBuilder();
        sb.append(asInstanceOf.getName());
        sb.append('_');
        if (named == null) {
            named = "";
        }
        sb.append(named);
        return sb.toString();
    }

    @Override // me.oriient.internal.infra.di.DependencyInjection
    @NotNull
    public <T extends DiProvidable> T get(@NotNull KClass<?> asInstanceOf, @Nullable String named) {
        Intrinsics.h(asInstanceOf, "asInstanceOf");
        T t = (T) getInternal(asInstanceOf, named, true);
        Intrinsics.e(t);
        return t;
    }

    @Override // me.oriient.internal.infra.di.DependencyInjection
    @NotNull
    public <T extends DiProvidable> T getJava(@NotNull Class<?> asInstanceOf, @Nullable String named) throws h {
        Intrinsics.h(asInstanceOf, "asInstanceOf");
        g gVar = this.dependencies.get(createInstanceKey(asInstanceOf, named));
        T t = (T) (gVar != null ? gVar.get() : null);
        if (t != null) {
            return t;
        }
        throw new h("Unable to find a definition of class " + asInstanceOf.getName() + " named " + named);
    }

    @Override // me.oriient.internal.infra.di.DependencyInjection
    @Nullable
    public <T extends DiProvidable> T getOrNull(@NotNull KClass<?> asInstanceOf, @Nullable String named) {
        Intrinsics.h(asInstanceOf, "asInstanceOf");
        return (T) getInternal(asInstanceOf, named, false);
    }

    @Override // me.oriient.internal.infra.di.DependencyInjection
    @NotNull
    public <T extends DiProvidable> Lazy<T> inject(@NotNull KClass<?> asInstanceOf, @NotNull String named) {
        Intrinsics.h(asInstanceOf, "asInstanceOf");
        Intrinsics.h(named, "named");
        return LazyKt.b(new b(this, asInstanceOf, named));
    }

    @Override // me.oriient.internal.infra.di.DependencyInjection
    @NotNull
    public <T extends DiProvidable> Lazy<T> injectJava(@NotNull Class<?> asInstanceOf, @NotNull String named) {
        Intrinsics.h(asInstanceOf, "asInstanceOf");
        Intrinsics.h(named, "named");
        return LazyKt.b(new d(this, asInstanceOf, named));
    }

    @Override // me.oriient.internal.infra.di.DependencyInjection
    @NotNull
    public <T extends DiProvidable> Lazy<T> injectOrNull(@NotNull KClass<?> asInstanceOf, @NotNull String named) {
        Intrinsics.h(asInstanceOf, "asInstanceOf");
        Intrinsics.h(named, "named");
        return LazyKt.b(new f(this, asInstanceOf, named));
    }

    public /* synthetic */ DependencyInjectionImpl(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.constraintlayout.core.state.a.h("toString(...)") : str, (i & 2) != 0 ? false : z);
    }
}
