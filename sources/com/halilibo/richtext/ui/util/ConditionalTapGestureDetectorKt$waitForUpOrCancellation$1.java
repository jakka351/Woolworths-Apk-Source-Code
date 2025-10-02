package com.halilibo.richtext.ui.util;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.halilibo.richtext.ui.util.ConditionalTapGestureDetectorKt", f = "ConditionalTapGestureDetector.kt", l = {182, 197}, m = "waitForUpOrCancellation")
/* loaded from: classes6.dex */
final class ConditionalTapGestureDetectorKt$waitForUpOrCancellation$1 extends ContinuationImpl {
    public AwaitPointerEventScope p;
    public /* synthetic */ Object q;
    public int r;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.r |= Integer.MIN_VALUE;
        return ConditionalTapGestureDetectorKt.a(null, this);
    }
}
