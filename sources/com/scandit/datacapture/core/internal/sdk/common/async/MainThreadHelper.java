package com.scandit.datacapture.core.internal.sdk.common.async;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/common/async/MainThreadHelper;", "", "Lkotlin/Function0;", "", "block", "runOnMainThread", "<init>", "()V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class MainThreadHelper {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f18676a = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function0 tmp0) {
        Intrinsics.h(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public final void runOnMainThread(@NotNull Function0<Unit> block) {
        Intrinsics.h(block, "block");
        if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
            block.invoke();
        } else {
            this.f18676a.post(new androidx.compose.ui.viewinterop.a(7, block));
        }
    }
}
