package com.google.zxing.datamatrix.encoder;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* loaded from: classes6.dex */
final class DataMatrixSymbolInfo144 extends SymbolInfo {
    @Override // com.google.zxing.datamatrix.encoder.SymbolInfo
    public final int a(int i) {
        if (i <= 8) {
            return 156;
        }
        return ModuleDescriptor.MODULE_VERSION;
    }

    @Override // com.google.zxing.datamatrix.encoder.SymbolInfo
    public final int c() {
        return 10;
    }
}
