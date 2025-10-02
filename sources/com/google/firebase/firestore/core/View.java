package com.google.firebase.firestore.core;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.DocumentViewChange;
import com.google.firebase.firestore.core.LimboDocumentChange;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.core.ViewSnapshot;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentCollections;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.DocumentSet;
import com.google.firebase.firestore.remote.TargetChange;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class View {

    /* renamed from: a, reason: collision with root package name */
    public final Query f15469a;
    public ViewSnapshot.SyncState b = ViewSnapshot.SyncState.d;
    public boolean c;
    public DocumentSet d;
    public ImmutableSortedSet e;
    public ImmutableSortedSet f;
    public ImmutableSortedSet g;

    /* renamed from: com.google.firebase.firestore.core.View$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15470a;

        static {
            int[] iArr = new int[DocumentViewChange.Type.values().length];
            f15470a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15470a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15470a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15470a[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class DocumentChanges {

        /* renamed from: a, reason: collision with root package name */
        public final DocumentSet f15471a;
        public final DocumentViewChangeSet b;
        public final boolean c;
        public final ImmutableSortedSet d;

        public DocumentChanges(DocumentSet documentSet, DocumentViewChangeSet documentViewChangeSet, ImmutableSortedSet immutableSortedSet, boolean z) {
            this.f15471a = documentSet;
            this.b = documentViewChangeSet;
            this.d = immutableSortedSet;
            this.c = z;
        }
    }

    public View(Query query, ImmutableSortedSet immutableSortedSet) {
        this.f15469a = query;
        this.d = new DocumentSet(DocumentCollections.f15533a, new ImmutableSortedSet(Collections.EMPTY_LIST, new androidx.camera.core.internal.compat.workaround.a(query.a(), 1)));
        this.e = immutableSortedSet;
        ImmutableSortedSet immutableSortedSet2 = DocumentKey.f;
        this.f = immutableSortedSet2;
        this.g = immutableSortedSet2;
    }

    public static int b(DocumentViewChange documentViewChange) {
        int iOrdinal = documentViewChange.f15445a.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 2;
                }
                throw new IllegalArgumentException("Unknown change type: " + documentViewChange.f15445a);
            }
        }
        return i;
    }

    public final ViewChange a(DocumentChanges documentChanges, TargetChange targetChange, boolean z) {
        List list;
        Document document;
        ViewSnapshot viewSnapshot;
        Assert.b(!documentChanges.c, "Cannot apply changes that need a refill", new Object[0]);
        DocumentSet documentSet = this.d;
        this.d = documentChanges.f15471a;
        this.g = documentChanges.d;
        DocumentViewChangeSet documentViewChangeSet = documentChanges.b;
        documentViewChangeSet.getClass();
        ArrayList arrayList = new ArrayList(documentViewChangeSet.f15446a.values());
        Collections.sort(arrayList, new Comparator() { // from class: com.google.firebase.firestore.core.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                DocumentViewChange documentViewChange = (DocumentViewChange) obj;
                DocumentViewChange documentViewChange2 = (DocumentViewChange) obj2;
                View view = this.d;
                view.getClass();
                int iCompare = Integer.compare(View.b(documentViewChange), View.b(documentViewChange2));
                if (iCompare != 0) {
                    return iCompare;
                }
                return ((Query.QueryComparator) view.f15469a.a()).compare(documentViewChange.b, documentViewChange2.b);
            }
        });
        if (targetChange != null) {
            Iterator it = targetChange.c.iterator();
            while (it.hasNext()) {
                this.e = this.e.b((DocumentKey) it.next());
            }
            Iterator it2 = targetChange.d.iterator();
            while (it2.hasNext()) {
                DocumentKey documentKey = (DocumentKey) it2.next();
                Assert.b(this.e.d.b(documentKey), "Modified document %s not found in view.", documentKey);
            }
            Iterator it3 = targetChange.e.iterator();
            while (it3.hasNext()) {
                this.e = this.e.g((DocumentKey) it3.next());
            }
            this.c = targetChange.b;
        }
        if (!z && this.c) {
            ImmutableSortedSet immutableSortedSet = this.f;
            this.f = DocumentKey.f;
            Iterator it4 = this.d.e.iterator();
            while (it4.hasNext()) {
                Document document2 = (Document) it4.next();
                DocumentKey key = document2.getKey();
                if (!this.e.d.b(key) && (document = (Document) this.d.d.d(key)) != null && !document.f()) {
                    this.f = this.f.b(document2.getKey());
                }
            }
            ArrayList arrayList2 = new ArrayList(this.f.d.size() + immutableSortedSet.d.size());
            Iterator it5 = immutableSortedSet.iterator();
            while (it5.hasNext()) {
                DocumentKey documentKey2 = (DocumentKey) it5.next();
                if (!this.f.d.b(documentKey2)) {
                    arrayList2.add(new LimboDocumentChange(LimboDocumentChange.Type.e, documentKey2));
                }
            }
            Iterator it6 = this.f.iterator();
            while (it6.hasNext()) {
                DocumentKey documentKey3 = (DocumentKey) it6.next();
                if (!immutableSortedSet.d.b(documentKey3)) {
                    arrayList2.add(new LimboDocumentChange(LimboDocumentChange.Type.d, documentKey3));
                }
            }
            list = arrayList2;
        } else {
            list = Collections.EMPTY_LIST;
        }
        int size = this.f.d.size();
        ViewSnapshot.SyncState syncState = ViewSnapshot.SyncState.e;
        ViewSnapshot.SyncState syncState2 = (size == 0 && this.c && !z) ? ViewSnapshot.SyncState.f : syncState;
        boolean z2 = syncState2 != this.b;
        this.b = syncState2;
        if (arrayList.size() != 0 || z2) {
            viewSnapshot = new ViewSnapshot(this.f15469a, documentChanges.f15471a, documentSet, arrayList, syncState2 == syncState, documentChanges.d, z2, false, (targetChange == null || targetChange.f15583a.isEmpty()) ? false : true);
        } else {
            viewSnapshot = null;
        }
        return new ViewChange(viewSnapshot, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.firebase.firestore.core.View.DocumentChanges c(com.google.firebase.database.collection.ImmutableSortedMap r18, com.google.firebase.firestore.core.View.DocumentChanges r19) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.core.View.c(com.google.firebase.database.collection.ImmutableSortedMap, com.google.firebase.firestore.core.View$DocumentChanges):com.google.firebase.firestore.core.View$DocumentChanges");
    }
}
