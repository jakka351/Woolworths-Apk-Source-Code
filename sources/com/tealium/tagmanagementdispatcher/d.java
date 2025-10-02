package com.tealium.tagmanagementdispatcher;

import android.webkit.WebView;
import com.tealium.core.TealiumContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class d extends Lambda implements Function0<WebView> {
    public final /* synthetic */ TealiumContext h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TealiumContext tealiumContext) {
        super(0);
        this.h = tealiumContext;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new WebView(this.h.f19130a.f19129a);
    }
}
