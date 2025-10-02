package com.scandit.datacapture.barcode.internal.module.pick.data;

import YU.a;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes6.dex */
public final class NativeBarcodePickProduct {
    final String identifier;
    final int quantity;

    public NativeBarcodePickProduct(String str, int i) {
        this.identifier = str;
        this.quantity = i;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NativeBarcodePickProduct{identifier=");
        sb.append(this.identifier);
        sb.append(",quantity=");
        return a.m(sb, this.quantity, "}");
    }
}
