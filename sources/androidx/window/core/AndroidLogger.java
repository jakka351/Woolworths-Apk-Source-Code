package androidx.window.core;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/core/AndroidLogger;", "Landroidx/window/core/Logger;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AndroidLogger implements Logger {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidLogger f3868a = new AndroidLogger();

    @Override // androidx.window.core.Logger
    public final void a(String message) {
        Intrinsics.h(message, "message");
        Log.d("SidecarAdapter", message);
    }
}
