package com.google.android.gms.internal.p000authapi;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zbbh extends zbbi {
    final transient int zba;
    final transient int zbb;
    final /* synthetic */ zbbi zbc;

    public zbbh(zbbi zbbiVar, int i, int i2) {
        Objects.requireNonNull(zbbiVar);
        this.zbc = zbbiVar;
        this.zba = i;
        this.zbb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zbbc.zba(i, this.zbb, "index");
        return this.zbc.get(i + this.zba);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbb;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbf
    public final Object[] zbb() {
        return this.zbc.zbb();
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbf
    public final int zbc() {
        return this.zbc.zbc() + this.zba;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbf
    public final int zbd() {
        return this.zbc.zbc() + this.zba + this.zbb;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbf
    public final boolean zbf() {
        return true;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbi, java.util.List
    /* renamed from: zbh, reason: merged with bridge method [inline-methods] */
    public final zbbi subList(int i, int i2) {
        zbbc.zbc(i, i2, this.zbb);
        int i3 = this.zba;
        return this.zbc.subList(i + i3, i2 + i3);
    }
}
