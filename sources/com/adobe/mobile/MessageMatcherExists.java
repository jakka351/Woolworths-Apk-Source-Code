package com.adobe.mobile;

import java.util.Map;

/* loaded from: classes4.dex */
class MessageMatcherExists extends MessageMatcher {
    @Override // com.adobe.mobile.MessageMatcher
    public boolean b(Map... mapArr) {
        Object obj;
        if (mapArr.length > 0) {
            int length = mapArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    obj = null;
                    break;
                }
                Map map = mapArr[i];
                if (map != null && map.containsKey(this.f13271a)) {
                    obj = map.get(this.f13271a);
                    break;
                }
                i++;
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }
}
