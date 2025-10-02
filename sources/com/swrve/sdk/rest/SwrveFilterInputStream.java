package com.swrve.sdk.rest;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class SwrveFilterInputStream extends FilterInputStream {
    public boolean d;

    public SwrveFilterInputStream(InputStream inputStream) {
        super(inputStream);
        this.d = true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        if (this.d && (i3 = super.read(bArr, i, i2)) != -1) {
            return i3;
        }
        this.d = false;
        return -1;
    }
}
