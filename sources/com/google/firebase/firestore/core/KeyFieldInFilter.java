package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.v1.Value;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class KeyFieldInFilter extends FieldFilter {
    public final ArrayList d;

    /* JADX WARN: Illegal instructions before constructor call */
    public KeyFieldInFilter(FieldPath fieldPath, Value value) {
        FieldFilter.Operator operator = FieldFilter.Operator.IN;
        super(fieldPath, operator, value);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        arrayList.addAll(g(operator, value));
    }

    public static ArrayList g(FieldFilter.Operator operator, Value value) {
        Assert.b(operator == FieldFilter.Operator.IN || operator == FieldFilter.Operator.NOT_IN, "extractDocumentKeysFromArrayValue requires IN or NOT_IN operators", new Object[0]);
        Assert.b(Values.f(value), "KeyFieldInFilter/KeyFieldNotInFilter expects an ArrayValue", new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (Value value2 : value.W().i()) {
            Assert.b(Values.i(value2), YU.a.o(new StringBuilder("Comparing on key with "), operator.d, ", but an array value was not a ReferenceValue"), new Object[0]);
            arrayList.add(DocumentKey.c(value2.e0()));
        }
        return arrayList;
    }

    @Override // com.google.firebase.firestore.core.FieldFilter, com.google.firebase.firestore.core.Filter
    public final boolean d(Document document) {
        return this.d.contains(document.getKey());
    }
}
