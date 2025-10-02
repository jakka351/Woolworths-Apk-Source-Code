package com.google.firebase.firestore.model;

import androidx.browser.trusted.a;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.util.Assert;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class DocumentKey implements Comparable<DocumentKey> {
    public static final a e;
    public static final ImmutableSortedSet f;
    public final ResourcePath d;

    static {
        a aVar = new a(8);
        e = aVar;
        f = new ImmutableSortedSet(Collections.EMPTY_LIST, aVar);
    }

    public DocumentKey(ResourcePath resourcePath) {
        Assert.b(d(resourcePath), "Not a document key path: %s", resourcePath);
        this.d = resourcePath;
    }

    public static DocumentKey b() {
        List list = Collections.EMPTY_LIST;
        ResourcePath resourcePath = ResourcePath.e;
        return new DocumentKey(list.isEmpty() ? ResourcePath.e : new ResourcePath(list));
    }

    public static DocumentKey c(String str) {
        ResourcePath resourcePathP = ResourcePath.p(str);
        boolean z = false;
        if (resourcePathP.d.size() > 4 && resourcePathP.f(0).equals("projects") && resourcePathP.f(2).equals("databases") && resourcePathP.f(4).equals("documents")) {
            z = true;
        }
        Assert.b(z, "Tried to parse an invalid key: %s", resourcePathP);
        return new DocumentKey((ResourcePath) resourcePathP.n());
    }

    public static boolean d(ResourcePath resourcePath) {
        return resourcePath.d.size() % 2 == 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(DocumentKey documentKey) {
        return this.d.compareTo(documentKey.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DocumentKey.class != obj.getClass()) {
            return false;
        }
        return this.d.equals(((DocumentKey) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return this.d.b();
    }
}
