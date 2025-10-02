package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.BasePath;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
final class EncodedPath {
    public static ResourcePath a(String str) {
        List list;
        int length = str.length();
        boolean z = false;
        Assert.b(length >= 2, "Invalid path \"%s\"", str);
        if (length == 2) {
            if (str.charAt(0) == 1 && str.charAt(1) == 1) {
                z = true;
            }
            Assert.b(z, "Non-empty path \"%s\" had length 2", str);
            list = Collections.EMPTY_LIST;
        } else {
            int length2 = str.length() - 2;
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < length) {
                int iIndexOf = str.indexOf(1, i);
                if (iIndexOf < 0 || iIndexOf > length2) {
                    throw new IllegalArgumentException(YU.a.h("Invalid encoded resource path: \"", str, "\""));
                }
                int i2 = iIndexOf + 1;
                char cCharAt = str.charAt(i2);
                if (cCharAt == 1) {
                    String strSubstring = str.substring(i, iIndexOf);
                    if (sb.length() != 0) {
                        sb.append(strSubstring);
                        strSubstring = sb.toString();
                        sb.setLength(0);
                    }
                    arrayList.add(strSubstring);
                } else if (cCharAt == 16) {
                    sb.append(str.substring(i, iIndexOf));
                    sb.append((char) 0);
                } else {
                    if (cCharAt != 17) {
                        throw new IllegalArgumentException(YU.a.h("Invalid encoded resource path: \"", str, "\""));
                    }
                    sb.append(str.substring(i, i2));
                }
                i = iIndexOf + 2;
            }
            list = arrayList;
        }
        ResourcePath resourcePath = ResourcePath.e;
        return list.isEmpty() ? ResourcePath.e : new ResourcePath(list);
    }

    public static String b(BasePath basePath) {
        StringBuilder sb = new StringBuilder();
        int size = basePath.d.size();
        for (int i = 0; i < size; i++) {
            if (sb.length() > 0) {
                sb.append((char) 1);
                sb.append((char) 1);
            }
            String strF = basePath.f(i);
            int length = strF.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = strF.charAt(i2);
                if (cCharAt == 0) {
                    sb.append((char) 1);
                    sb.append((char) 16);
                } else if (cCharAt != 1) {
                    sb.append(cCharAt);
                } else {
                    sb.append((char) 1);
                    sb.append((char) 17);
                }
            }
        }
        sb.append((char) 1);
        sb.append((char) 1);
        return sb.toString();
    }
}
