package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.Values;
import com.google.firestore.v1.Value;

/* loaded from: classes6.dex */
public class NotInFilter extends FieldFilter {
    @Override // com.google.firebase.firestore.core.FieldFilter, com.google.firebase.firestore.core.Filter
    public final boolean d(Document document) {
        Value valueD;
        Value value = this.b;
        return (Values.d(value.W(), Values.b) || (valueD = document.d(this.c)) == null || valueD.i0() || Values.d(value.W(), valueD)) ? false : true;
    }
}
