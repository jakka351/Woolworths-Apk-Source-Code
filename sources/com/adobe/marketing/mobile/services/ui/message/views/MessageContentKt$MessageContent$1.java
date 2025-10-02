package com.adobe.marketing.mobile.services.ui.message.views;

import android.content.Context;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
final class MessageContentKt$MessageContent$1 extends Lambda implements Function1<Context, WebView> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.h(it, "it");
        new WebView(it);
        throw null;
    }
}
