package com.scandit.datacapture.core.internal.sdk.ui.hint;

import com.scandit.datacapture.core.internal.module.ui.NativeGuidanceHint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"com/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2Impl$Operation$ShowGuidance", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/a;", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/GuidanceHint;", "a", "Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHint;", "getGuidance-pxbJb70", "()Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHint;", "guidance", "<init>", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHint;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class HintHolderV2Impl$Operation$ShowGuidance implements a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final NativeGuidanceHint guidance;

    public /* synthetic */ HintHolderV2Impl$Operation$ShowGuidance(NativeGuidanceHint nativeGuidanceHint, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeGuidanceHint);
    }

    @NotNull
    /* renamed from: getGuidance-pxbJb70, reason: not valid java name and from getter */
    public final NativeGuidanceHint getGuidance() {
        return this.guidance;
    }

    private HintHolderV2Impl$Operation$ShowGuidance(NativeGuidanceHint guidance) {
        Intrinsics.h(guidance, "guidance");
        this.guidance = guidance;
    }
}
