package com.scandit.datacapture.core.internal.sdk.ui.hint;

import com.scandit.datacapture.core.C1011g3;
import com.scandit.datacapture.core.common.geometry.Rect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ HintHolderV2Impl f18737a;
    final /* synthetic */ Rect b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(HintHolderV2Impl hintHolderV2Impl, Rect rect) {
        super(0);
        this.f18737a = hintHolderV2Impl;
        this.b = rect;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Map map = this.f18737a.c;
        Rect rect = this.b;
        for (Map.Entry entry : map.entrySet()) {
            ((C1011g3) entry.getValue()).a(ToastHint.m333getHintStyleimpl(((ToastHint) entry.getKey()).m337unboximpl()), rect);
        }
        Map map2 = this.f18737a.d;
        Rect rect2 = this.b;
        for (Map.Entry entry2 : map2.entrySet()) {
            ((C1011g3) entry2.getValue()).a(GuidanceHint.m312getHintStyleimpl(((GuidanceHint) entry2.getKey()).m316unboximpl()), rect2);
        }
        return Unit.f24250a;
    }
}
