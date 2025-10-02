package com.google.common.xml;

import com.google.common.annotations.GwtCompatible;
import com.google.common.escape.Escapers;
import java.util.HashMap;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes6.dex */
public class XmlEscapers {
    static {
        Escapers.Builder builder = new Escapers.Builder();
        builder.b = (char) 65533;
        builder.c = "�";
        char c = 0;
        while (true) {
            HashMap map = builder.f14912a;
            if (c > 31) {
                map.put('&', "&amp;");
                map.put('<', "&lt;");
                map.put('>', "&gt;");
                builder.a();
                map.put('\'', "&apos;");
                map.put('\"', "&quot;");
                builder.a();
                map.put('\t', "&#x9;");
                map.put('\n', "&#xA;");
                map.put('\r', "&#xD;");
                builder.a();
                return;
            }
            if (c != '\t' && c != '\n' && c != '\r') {
                map.put(Character.valueOf(c), "�");
            }
            c = (char) (c + 1);
        }
    }
}
