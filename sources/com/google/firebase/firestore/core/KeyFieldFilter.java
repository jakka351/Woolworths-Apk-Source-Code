package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.v1.Value;

/* loaded from: classes6.dex */
public class KeyFieldFilter extends FieldFilter {
    public final DocumentKey d;

    public KeyFieldFilter(FieldPath fieldPath, FieldFilter.Operator operator, Value value) {
        super(fieldPath, operator, value);
        Assert.b(Values.i(value), "KeyFieldFilter expects a ReferenceValue", new Object[0]);
        this.d = DocumentKey.c(value.e0());
    }

    @Override // com.google.firebase.firestore.core.FieldFilter, com.google.firebase.firestore.core.Filter
    public final boolean d(Document document) {
        return f(document.getKey().compareTo(this.d));
    }
}
