package com.scandit.datacapture.core.internal.sdk.ui.hint;

import com.scandit.datacapture.core.C1011g3;
import com.scandit.datacapture.core.internal.module.ui.NativeGuidanceHint;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ HintHolderV2Impl f18735a;
    final /* synthetic */ C1011g3 b;
    final /* synthetic */ NativeGuidanceHint c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(HintHolderV2Impl hintHolderV2Impl, C1011g3 c1011g3, NativeGuidanceHint nativeGuidanceHint) {
        super(0);
        this.f18735a = hintHolderV2Impl;
        this.b = c1011g3;
        this.c = nativeGuidanceHint;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f18735a.removeView(this.b);
        this.f18735a.d.remove(GuidanceHint.m306boximpl(this.c));
        return Unit.f24250a;
    }
}
