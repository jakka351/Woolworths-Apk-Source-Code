package com.adobe.mobile;

import java.util.Iterator;

/* loaded from: classes4.dex */
class MessageMatcherEquals extends MessageMatcher {
    @Override // com.adobe.mobile.MessageMatcher
    public boolean a(Object obj) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            boolean z = next instanceof String;
            if (!z || !(obj instanceof String)) {
                boolean z2 = next instanceof Number;
                if (z2 && (obj instanceof Number)) {
                    if (((Number) next).doubleValue() == ((Number) obj).doubleValue()) {
                        return true;
                    }
                } else if (z2 && (obj instanceof String)) {
                    if (MessageMatcher.d(obj) != null && ((Number) next).doubleValue() == MessageMatcher.d(obj).doubleValue()) {
                        return true;
                    }
                } else if (z && (obj instanceof Number) && next.toString().compareToIgnoreCase(obj.toString()) == 0) {
                    return true;
                }
            } else if (next.toString().compareToIgnoreCase(obj.toString()) == 0) {
                return true;
            }
        }
        return false;
    }
}
