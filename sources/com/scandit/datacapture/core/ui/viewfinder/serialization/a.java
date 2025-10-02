package com.scandit.datacapture.core.ui.viewfinder.serialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewfinderDeserializerHelper f18976a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ViewfinderDeserializerHelper viewfinderDeserializerHelper) {
        super(0);
        this.f18976a = viewfinderDeserializerHelper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new ViewfinderDeserializerHelperReversedAdapter(this.f18976a, null, 2, null);
    }
}
