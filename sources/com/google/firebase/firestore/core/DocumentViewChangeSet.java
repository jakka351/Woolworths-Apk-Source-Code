package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.DocumentViewChange;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.util.Assert;
import java.util.TreeMap;

/* loaded from: classes6.dex */
public class DocumentViewChangeSet {

    /* renamed from: a, reason: collision with root package name */
    public final TreeMap f15446a = new TreeMap();

    public final void a(DocumentViewChange documentViewChange) {
        Document document = documentViewChange.b;
        DocumentKey key = document.getKey();
        TreeMap treeMap = this.f15446a;
        DocumentViewChange documentViewChange2 = (DocumentViewChange) treeMap.get(key);
        if (documentViewChange2 == null) {
            treeMap.put(key, documentViewChange);
            return;
        }
        DocumentViewChange.Type type = documentViewChange2.f15445a;
        DocumentViewChange.Type type2 = documentViewChange.f15445a;
        DocumentViewChange.Type type3 = DocumentViewChange.Type.g;
        DocumentViewChange.Type type4 = DocumentViewChange.Type.e;
        if (type2 != type4 && type == type3) {
            treeMap.put(key, documentViewChange);
            return;
        }
        DocumentViewChange.Type type5 = DocumentViewChange.Type.d;
        if (type2 == type3 && type != type5) {
            treeMap.put(key, new DocumentViewChange(type, document));
            return;
        }
        DocumentViewChange.Type type6 = DocumentViewChange.Type.f;
        if (type2 == type6 && type == type6) {
            treeMap.put(key, new DocumentViewChange(type6, document));
            return;
        }
        if (type2 == type6 && type == type4) {
            treeMap.put(key, new DocumentViewChange(type4, document));
            return;
        }
        if (type2 == type5 && type == type4) {
            treeMap.remove(key);
            return;
        }
        if (type2 == type5 && type == type6) {
            treeMap.put(key, new DocumentViewChange(type5, documentViewChange2.b));
        } else if (type2 == type4 && type == type5) {
            treeMap.put(key, new DocumentViewChange(type6, document));
        } else {
            Assert.a("Unsupported combination of changes %s after %s", type2, type);
            throw null;
        }
    }
}
