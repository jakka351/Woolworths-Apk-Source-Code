package com.google.android.gms.internal.measurement;

import au.com.woolworths.shop.checkout.ui.confirmation.c;

/* loaded from: classes.dex */
final class zzor extends IllegalArgumentException {
    public zzor(int i, int i2) {
        super(c.j(String.valueOf(i).length() + (byte) 32 + String.valueOf(i2).length(), i, i2, "Unpaired surrogate at index ", " of "));
    }
}
