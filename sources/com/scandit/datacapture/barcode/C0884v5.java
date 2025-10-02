package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.common.graphic.ImageBuffer;
import com.scandit.datacapture.core.data.FrameData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.v5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0884v5 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function1 f18235a;
    final /* synthetic */ C0899w5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0884v5(Function1 function1, C0899w5 c0899w5) {
        super(1);
        this.f18235a = function1;
        this.b = c0899w5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FrameData frame = (FrameData) obj;
        Intrinsics.h(frame, "frame");
        ImageBuffer imageBuffer = frame.getImageBuffer();
        int width = imageBuffer.getWidth();
        int height = imageBuffer.getHeight();
        this.f18235a.invoke(Float.valueOf(Math.max(height, width) / Math.min(height, width)));
        this.b.f18248a = null;
        return Unit.f24250a;
    }
}
