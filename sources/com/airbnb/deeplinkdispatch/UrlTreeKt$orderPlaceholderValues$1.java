package com.airbnb.deeplinkdispatch;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "matchResult", "Lkotlin/text/MatchResult;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UrlTreeKt$orderPlaceholderValues$1 extends Lambda implements Function1<MatchResult, CharSequence> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MatchResult matchResult = (MatchResult) obj;
        Intrinsics.h(matchResult, "matchResult");
        return CollectionsKt.M(CollectionsKt.t0(StringsKt.U(matchResult.getValue(), new char[]{'|'})), lllqqql.c0063ccc0063c, null, null, null, 62);
    }
}
