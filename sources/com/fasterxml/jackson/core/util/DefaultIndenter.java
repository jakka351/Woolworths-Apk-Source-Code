package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;

/* loaded from: classes4.dex */
public class DefaultIndenter extends DefaultPrettyPrinter.NopIndenter {
    public static final DefaultIndenter g;
    public final String f;
    public final int e = 2;
    public final char[] d = new char[32];

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
        } catch (Throwable unused) {
            property = "\n";
        }
        g = new DefaultIndenter(property);
    }

    public DefaultIndenter(String str) {
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            "  ".getChars(0, 2, this.d, i);
            i += 2;
        }
        this.f = str;
    }

    @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter
    public final void a(JsonGenerator jsonGenerator, int i) {
        jsonGenerator.O0(this.f);
        if (i <= 0) {
            return;
        }
        int length = i * this.e;
        while (true) {
            char[] cArr = this.d;
            if (length <= cArr.length) {
                jsonGenerator.P0(cArr, length);
                return;
            } else {
                jsonGenerator.P0(cArr, cArr.length);
                length -= cArr.length;
            }
        }
    }
}
