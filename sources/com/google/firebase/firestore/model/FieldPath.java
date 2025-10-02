package com.google.firebase.firestore.model;

import YU.a;
import androidx.compose.ui.platform.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class FieldPath extends BasePath<FieldPath> {
    public static final FieldPath e = new FieldPath(Collections.singletonList("__name__"));
    public static final FieldPath f = new FieldPath(Collections.EMPTY_LIST);

    public static FieldPath p(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean z = false;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\') {
                i++;
                if (i == str.length()) {
                    throw new IllegalArgumentException("Trailing escape character is not allowed");
                }
                sb.append(str.charAt(i));
            } else if (cCharAt == '.') {
                if (z) {
                    sb.append(cCharAt);
                } else {
                    String string = sb.toString();
                    if (string.isEmpty()) {
                        throw new IllegalArgumentException(a.h("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
                    }
                    StringBuilder sb2 = new StringBuilder();
                    arrayList.add(string);
                    sb = sb2;
                }
            } else if (cCharAt == '`') {
                z = !z;
            } else {
                sb.append(cCharAt);
            }
            i++;
        }
        String string2 = sb.toString();
        if (string2.isEmpty()) {
            throw new IllegalArgumentException(a.h("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
        }
        arrayList.add(string2);
        return new FieldPath(arrayList);
    }

    @Override // com.google.firebase.firestore.model.BasePath
    public final String b() {
        char cCharAt;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            List list = this.d;
            if (i >= list.size()) {
                return sb.toString();
            }
            if (i > 0) {
                sb.append(".");
            }
            String strReplace = ((String) list.get(i)).replace("\\", "\\\\").replace("`", "\\`");
            if (strReplace.isEmpty() || ((cCharAt = strReplace.charAt(0)) != '_' && ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z')))) {
                strReplace = i.a('`', "`", strReplace);
                break;
                break;
            }
            for (int i2 = 1; i2 < strReplace.length(); i2++) {
                char cCharAt2 = strReplace.charAt(i2);
                if (cCharAt2 != '_' && ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && (cCharAt2 < '0' || cCharAt2 > '9')))) {
                    strReplace = i.a('`', "`", strReplace);
                    break;
                }
            }
            sb.append(strReplace);
            i++;
        }
    }

    @Override // com.google.firebase.firestore.model.BasePath
    public final BasePath d(List list) {
        return new FieldPath(list);
    }
}
