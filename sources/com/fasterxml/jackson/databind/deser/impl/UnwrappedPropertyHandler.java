package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class UnwrappedPropertyHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14254a;

    public UnwrappedPropertyHandler() {
        this.f14254a = new ArrayList();
    }

    public final void a(DeserializationContext deserializationContext, Object obj, TokenBuffer tokenBuffer) {
        ArrayList arrayList = this.f14254a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) arrayList.get(i);
            TokenBuffer.Parser parserM2 = tokenBuffer.m2(tokenBuffer.e);
            parserM2.N1();
            settableBeanProperty.h(parserM2, deserializationContext, obj);
        }
    }

    public UnwrappedPropertyHandler(ArrayList arrayList) {
        this.f14254a = arrayList;
    }
}
