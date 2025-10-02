package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.mutation.Overlay;
import java.util.HashMap;
import java.util.TreeSet;

/* loaded from: classes6.dex */
public interface DocumentOverlayCache {
    HashMap a(TreeSet treeSet);

    HashMap b(ResourcePath resourcePath, int i);

    void c(int i);

    HashMap d(int i, int i2, String str);

    void e(int i, HashMap map);

    Overlay f(DocumentKey documentKey);
}
