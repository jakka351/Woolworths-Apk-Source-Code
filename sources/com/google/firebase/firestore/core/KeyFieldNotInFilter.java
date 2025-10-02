package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firestore.v1.Value;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class KeyFieldNotInFilter extends FieldFilter {
    public final ArrayList d;

    /* JADX WARN: Illegal instructions before constructor call */
    public KeyFieldNotInFilter(FieldPath fieldPath, Value value) {
        FieldFilter.Operator operator = FieldFilter.Operator.NOT_IN;
        super(fieldPath, operator, value);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        arrayList.addAll(KeyFieldInFilter.g(operator, value));
    }

    @Override // com.google.firebase.firestore.core.FieldFilter, com.google.firebase.firestore.core.Filter
    public final boolean d(Document document) {
        return !this.d.contains(document.getKey());
    }
}
