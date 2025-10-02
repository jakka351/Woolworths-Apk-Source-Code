package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.Values;
import com.google.firestore.v1.Value;

/* loaded from: classes6.dex */
public class ArrayContainsFilter extends FieldFilter {
    @Override // com.google.firebase.firestore.core.FieldFilter, com.google.firebase.firestore.core.Filter
    public final boolean d(Document document) {
        Value valueD = document.d(this.c);
        return Values.f(valueD) && Values.d(valueD.W(), this.b);
    }
}
