package com.otaliastudios.zoom;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/otaliastudios/zoom/ZoomLogger;", "", "Companion", "LogLevel", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class ZoomLogger {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/otaliastudios/zoom/ZoomLogger$Companion;", "", "", "LEVEL_ERROR", "I", "LEVEL_INFO", "LEVEL_VERBOSE", "LEVEL_WARNING", "level", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/zoom/ZoomLogger$LogLevel;", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface LogLevel {
    }

    public ZoomLogger(String str) {
    }

    public static String c(int i, Object... objArr) {
        return 3 <= i ? ArraysKt.U(objArr, " ", null, null, null, 62) : "";
    }

    public final void a(String message) {
        Intrinsics.h(message, "message");
    }

    public final void b(Object... objArr) {
        a(c(1, Arrays.copyOf(objArr, objArr.length)));
    }

    public final void d(Object... objArr) {
        String message = c(0, Arrays.copyOf(objArr, objArr.length));
        Intrinsics.h(message, "message");
    }

    public final void e(String message) {
        Intrinsics.h(message, "message");
    }
}
