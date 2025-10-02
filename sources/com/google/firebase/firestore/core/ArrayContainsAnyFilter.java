package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.Values;
import com.google.firestore.v1.Value;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class ArrayContainsAnyFilter extends FieldFilter {
    @Override // com.google.firebase.firestore.core.FieldFilter, com.google.firebase.firestore.core.Filter
    public final boolean d(Document document) {
        Value valueD = document.d(this.c);
        if (!Values.f(valueD)) {
            return false;
        }
        Iterator it = valueD.W().i().iterator();
        while (it.hasNext()) {
            if (Values.d(this.b.W(), (Value) it.next())) {
                return true;
            }
        }
        return false;
    }
}
