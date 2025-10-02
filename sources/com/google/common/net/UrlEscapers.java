package com.google.common.net;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class UrlEscapers {
    static {
        new PercentEscaper("-_.*", true);
        new PercentEscaper("-._~!$'()*,;&=@:+", false);
        new PercentEscaper("-._~!$'()*,;&=@:+/?", false);
    }
}
