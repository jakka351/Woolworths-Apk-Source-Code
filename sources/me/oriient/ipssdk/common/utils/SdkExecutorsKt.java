package me.oriient.ipssdk.common.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"postToMainThread", "", "runnable", "Ljava/lang/Runnable;", "me.oriient.sdk-common"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SdkExecutorsKt {
    public static final void postToMainThread(@NotNull Runnable runnable) {
        Intrinsics.h(runnable, "runnable");
        SdkExecutors.postToMainThread(runnable);
    }
}
