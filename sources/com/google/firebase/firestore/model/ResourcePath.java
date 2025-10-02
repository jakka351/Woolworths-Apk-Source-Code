package com.google.firebase.firestore.model;

import YU.a;
import com.medallia.digital.mobilesdk.q2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class ResourcePath extends BasePath<ResourcePath> {
    public static final ResourcePath e = new ResourcePath(Collections.EMPTY_LIST);

    public static ResourcePath p(String str) {
        if (str.contains("//")) {
            throw new IllegalArgumentException(a.h("Invalid path (", str, "). Paths must not contain // in them."));
        }
        String[] strArrSplit = str.split(q2.c);
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (!str2.isEmpty()) {
                arrayList.add(str2);
            }
        }
        return new ResourcePath(arrayList);
    }

    @Override // com.google.firebase.firestore.model.BasePath
    public final String b() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            List list = this.d;
            if (i >= list.size()) {
                return sb.toString();
            }
            if (i > 0) {
                sb.append(q2.c);
            }
            sb.append((String) list.get(i));
            i++;
        }
    }

    @Override // com.google.firebase.firestore.model.BasePath
    public final BasePath d(List list) {
        return new ResourcePath(list);
    }
}
