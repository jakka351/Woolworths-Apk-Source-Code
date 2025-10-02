package com.scandit.datacapture.core.source;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class h extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SequenceFrameSourceProcessListener f18853a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SequenceFrameSourceProcessListener sequenceFrameSourceProcessListener) {
        super(1);
        this.f18853a = sequenceFrameSourceProcessListener;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte[] buffer = (byte[]) obj;
        Intrinsics.h(buffer, "buffer");
        this.f18853a.processingFinished(buffer);
        return Unit.f24250a;
    }
}
