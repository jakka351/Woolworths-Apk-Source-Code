package me.oriient.internal.infra.utils.android;

import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.Keep;
import kotlin.Metadata;

@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0017¨\u0006\u0005"}, d2 = {"Lme/oriient/internal/infra/utils/android/AndroidApiLevelCheckerImpl;", "Lme/oriient/internal/infra/utils/android/AndroidApiLevelChecker;", "()V", "isNougatOrHigher", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidApiLevelCheckerImpl implements AndroidApiLevelChecker {
    @Override // me.oriient.internal.infra.utils.android.AndroidApiLevelChecker
    @ChecksSdkIntAtLeast
    public boolean isNougatOrHigher() {
        return true;
    }
}
