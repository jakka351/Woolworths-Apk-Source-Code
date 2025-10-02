package org.commonmark.internal.util;

import androidx.compose.ui.input.pointer.a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class Html5Entities {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f26853a;

    static {
        HashMap map = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Html5Entities.class.getResourceAsStream("/org/commonmark/internal/util/entities.txt"), StandardCharsets.UTF_8));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        map.put("NewLine", "\n");
                        f26853a = map;
                        return;
                    } else if (line.length() != 0) {
                        int iIndexOf = line.indexOf("=");
                        map.put(line.substring(0, iIndexOf), line.substring(iIndexOf + 1));
                    }
                } finally {
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Failed reading data for HTML named character references", e);
        }
    }

    public static String a(String str) throws NumberFormatException {
        int i;
        if (str.startsWith("&") && str.endsWith(";")) {
            String strH = a.h(1, 1, str);
            if (strH.startsWith("#")) {
                String strSubstring = strH.substring(1);
                if (strSubstring.startsWith("x") || strSubstring.startsWith("X")) {
                    strSubstring = strSubstring.substring(1);
                    i = 16;
                } else {
                    i = 10;
                }
                try {
                    int i2 = Integer.parseInt(strSubstring, i);
                    return i2 == 0 ? "�" : new String(Character.toChars(i2));
                } catch (IllegalArgumentException unused) {
                    return "�";
                }
            }
            String str2 = (String) f26853a.get(strH);
            if (str2 != null) {
                return str2;
            }
        }
        return str;
    }
}
