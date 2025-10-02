package com.scandit.datacapture.core.area.serialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LocationSelectionDeserializerHelper f18417a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LocationSelectionDeserializerHelper locationSelectionDeserializerHelper) {
        super(0);
        this.f18417a = locationSelectionDeserializerHelper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new LocationSelectionDeserializerHelperReversedAdapter(this.f18417a, null, 2, null);
    }
}
