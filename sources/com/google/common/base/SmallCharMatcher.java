package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.CharMatcher;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class SmallCharMatcher extends CharMatcher.NamedFastMatcher {
    @Override // com.google.common.base.CharMatcher
    public final boolean m(char c) {
        return false;
    }
}
