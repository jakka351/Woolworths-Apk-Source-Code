package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class zzaqw extends zzhpe {
    public zzaqw(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzhpe
    public final void zze(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
    }
}
