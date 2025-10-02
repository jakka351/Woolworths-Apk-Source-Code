package com.airbnb.deeplinkdispatch;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UtilsKt$validateConfigurablePathSegmentReplacements$1$1$1 extends Lambda implements Function1<byte[], CharSequence> {
    public static final UtilsKt$validateConfigurablePathSegmentReplacements$1$1$1 h = new UtilsKt$validateConfigurablePathSegmentReplacements$1$1$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte[] it = (byte[]) obj;
        Intrinsics.h(it, "it");
        return new String(it, Charsets.f24671a);
    }
}
