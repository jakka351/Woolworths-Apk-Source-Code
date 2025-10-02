package com.scandit.datacapture.core.internal.sdk.ui.hint;

import com.scandit.datacapture.core.internal.module.ui.NativeToastHint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"com/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2Impl$Operation$HideToast", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/a;", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/ToastHint;", "a", "Lcom/scandit/datacapture/core/internal/module/ui/NativeToastHint;", "getToast-PdIe9CU", "()Lcom/scandit/datacapture/core/internal/module/ui/NativeToastHint;", "toast", "<init>", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeToastHint;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class HintHolderV2Impl$Operation$HideToast implements a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final NativeToastHint toast;

    public /* synthetic */ HintHolderV2Impl$Operation$HideToast(NativeToastHint nativeToastHint, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeToastHint);
    }

    @NotNull
    /* renamed from: getToast-PdIe9CU, reason: not valid java name and from getter */
    public final NativeToastHint getToast() {
        return this.toast;
    }

    private HintHolderV2Impl$Operation$HideToast(NativeToastHint toast) {
        Intrinsics.h(toast, "toast");
        this.toast = toast;
    }
}
