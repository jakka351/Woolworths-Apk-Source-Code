package com.scandit.datacapture.core.common.feedback;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/core/common/feedback/AssetSound;", "Lcom/scandit/datacapture/core/common/feedback/Sound;", "assetName", "", "(Ljava/lang/String;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AssetSound extends Sound {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetSound(@NotNull String assetName) {
        super(assetName);
        Intrinsics.h(assetName, "assetName");
    }
}
