package com.adobe.mobile;

import java.util.Iterator;

/* loaded from: classes4.dex */
final class MessageMatcherGreaterThanOrEqual extends MessageMatcher {
    @Override // com.adobe.mobile.MessageMatcher
    public final boolean a(Object obj) {
        Double d = MessageMatcher.d(obj);
        if (d == null) {
            return false;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next instanceof Number) && d.doubleValue() >= ((Number) next).doubleValue()) {
                return true;
            }
        }
        return false;
    }
}
