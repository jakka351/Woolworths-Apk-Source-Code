package me.oriient.internal.infra.utils.android;

import android.os.PowerManager;
import androidx.annotation.Keep;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00060\u0003R\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lme/oriient/internal/infra/utils/android/WakeLockFactory;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "createWakeLock", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "levelAndFlags", "", "tag", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface WakeLockFactory extends DiProvidable {
    @NotNull
    PowerManager.WakeLock createWakeLock(int levelAndFlags, @NotNull String tag);
}
