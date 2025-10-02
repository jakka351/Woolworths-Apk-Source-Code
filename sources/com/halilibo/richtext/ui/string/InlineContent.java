package com.halilibo.richtext.ui.string;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.ratingsandreviews.ui.shared.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/ui/string/InlineContent;", "", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InlineContent {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f16303a;
    public final ComposableLambdaImpl b;

    public InlineContent(a aVar, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.f16303a = (i & 1) != 0 ? null : aVar;
        this.b = composableLambdaImpl;
    }
}
