package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import com.scandit.datacapture.core.common.geometry.Size2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/DataCaptureViewSize;", "", "Lcom/scandit/datacapture/core/common/geometry/Size2;", "a", "Lcom/scandit/datacapture/core/common/geometry/Size2;", "getSize", "()Lcom/scandit/datacapture/core/common/geometry/Size2;", "size", "", "b", "I", "getRotation", "()I", "rotation", "<init>", "(Lcom/scandit/datacapture/core/common/geometry/Size2;I)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class DataCaptureViewSize {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Size2 size;

    /* renamed from: b, reason: from kotlin metadata */
    private final int rotation;

    public DataCaptureViewSize(@NotNull Size2 size, int i) {
        Intrinsics.h(size, "size");
        this.size = size;
        this.rotation = i;
    }

    public final int getRotation() {
        return this.rotation;
    }

    @NotNull
    public final Size2 getSize() {
        return this.size;
    }
}
