package com.halilibo.richtext.ui.util;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.halilibo.richtext.ui.util.PressGestureScopeImpl", f = "ConditionalTapGestureDetector.kt", l = {240}, m = "awaitRelease")
/* loaded from: classes6.dex */
final class PressGestureScopeImpl$awaitRelease$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ PressGestureScopeImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressGestureScopeImpl$awaitRelease$1(PressGestureScopeImpl pressGestureScopeImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.r0(this);
    }
}
