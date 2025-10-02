package me.oriient.ipssdk.base.di.java;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0007¢\u0006\u0002\u0010\bJ&\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00040\n\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0007¨\u0006\u000b"}, d2 = {"Lme/oriient/ipssdk/base/di/java/JavaDi;", "", "()V", "get", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lme/oriient/internal/infra/utils/core/DiProvidable;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lme/oriient/internal/infra/utils/core/DiProvidable;", "inject", "Lme/oriient/ipssdk/base/di/java/Lazy;", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class JavaDi {

    @NotNull
    public static final JavaDi INSTANCE = new JavaDi();

    private JavaDi() {
    }

    @JvmStatic
    @NotNull
    public static final <T extends DiProvidable> T get(@NotNull Class<T> clazz) {
        Intrinsics.h(clazz, "clazz");
        return (T) DependencyInjectionKt.getDi().getJava(clazz);
    }

    @JvmStatic
    @NotNull
    public static final <T extends DiProvidable> Lazy<T> inject(@NotNull Class<T> clazz) {
        Intrinsics.h(clazz, "clazz");
        return new Lazy<>(DependencyInjectionKt.getDi().injectJava(clazz));
    }
}
