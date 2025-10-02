package com.airbnb.deeplinkdispatch;

import com.airbnb.deeplinkdispatch.base.MatchIndex;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"deeplinkdispatch-base"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class UrlTreeKt {
    static {
        StringBuilder sb = new StringBuilder("(?<=\\");
        char[] cArr = MatchIndex.d;
        sb.append(cArr[0]);
        sb.append(")(.*)(?=\\");
        sb.append(cArr[1]);
        sb.append(')');
        new Regex(sb.toString());
    }
}
