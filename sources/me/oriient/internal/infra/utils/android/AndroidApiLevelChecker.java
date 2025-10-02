package me.oriient.internal.infra.utils.android;

import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.Keep;
import kotlin.Metadata;

@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'¨\u0006\u0004"}, d2 = {"Lme/oriient/internal/infra/utils/android/AndroidApiLevelChecker;", "", "isNougatOrHigher", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface AndroidApiLevelChecker {
    @ChecksSdkIntAtLeast
    boolean isNougatOrHigher();
}
