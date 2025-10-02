package com.adobe.mobile;

import java.util.Iterator;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
final class MessageMatcherEndsWith extends MessageMatcher {
    @Override // com.adobe.mobile.MessageMatcher
    public final boolean a(Object obj) {
        boolean z = obj instanceof Number;
        if (!(obj instanceof String) && !z) {
            return false;
        }
        String string = obj.toString();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof String) {
                if (string.matches("(?i).*" + Pattern.quote(next.toString()))) {
                    return true;
                }
            }
        }
        return false;
    }
}
