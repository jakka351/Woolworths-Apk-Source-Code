package com.scandit.datacapture.core.internal.sdk.common.async;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"synchronizedHasNoValue", "", "Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedPromise;", "completion", "Lkotlin/Function0;", "synchronizedSetValueIfNoValue", "success", "", "scandit-capture-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WrappedPromiseUtilsKt {
    public static final void synchronizedHasNoValue(@NotNull NativeWrappedPromise nativeWrappedPromise, @NotNull Function0<Unit> completion) {
        Intrinsics.h(nativeWrappedPromise, "<this>");
        Intrinsics.h(completion, "completion");
        synchronized (nativeWrappedPromise) {
            if (!nativeWrappedPromise.hasValue()) {
                completion.invoke();
            }
        }
    }

    public static final void synchronizedSetValueIfNoValue(@NotNull NativeWrappedPromise nativeWrappedPromise, boolean z) {
        Intrinsics.h(nativeWrappedPromise, "<this>");
        synchronizedHasNoValue(nativeWrappedPromise, new a(nativeWrappedPromise, z));
    }
}
