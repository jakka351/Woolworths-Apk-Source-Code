package me.oriient.internal.infra.utils.android;

import android.os.PowerManager;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00060\u0006R\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lme/oriient/internal/infra/utils/android/WakeLockFactoryImpl;", "Lme/oriient/internal/infra/utils/android/WakeLockFactory;", "contextProvider", "Lme/oriient/internal/infra/utils/android/ContextProvider;", "(Lme/oriient/internal/infra/utils/android/ContextProvider;)V", "createWakeLock", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "levelAndFlags", "", "tag", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WakeLockFactoryImpl implements WakeLockFactory {

    @NotNull
    private final ContextProvider contextProvider;

    public WakeLockFactoryImpl(@NotNull ContextProvider contextProvider) {
        Intrinsics.h(contextProvider, "contextProvider");
        this.contextProvider = contextProvider;
    }

    @Override // me.oriient.internal.infra.utils.android.WakeLockFactory
    @NotNull
    public PowerManager.WakeLock createWakeLock(int levelAndFlags, @NotNull String tag) {
        Intrinsics.h(tag, "tag");
        Object systemService = this.contextProvider.getContext().getSystemService("power");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(levelAndFlags, tag);
        Intrinsics.g(wakeLockNewWakeLock, "newWakeLock(...)");
        return wakeLockNewWakeLock;
    }
}
