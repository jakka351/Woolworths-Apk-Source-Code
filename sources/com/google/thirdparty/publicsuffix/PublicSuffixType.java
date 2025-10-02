package com.google.thirdparty.publicsuffix;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;

@Beta
@GwtCompatible
/* loaded from: classes6.dex */
public enum PublicSuffixType {
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE(':', ','),
    /* JADX INFO: Fake field, exist only in values array */
    REGISTRY('!', '?');

    public final char d;
    public final char e;

    PublicSuffixType(char c, char c2) {
        this.d = c;
        this.e = c2;
    }
}
