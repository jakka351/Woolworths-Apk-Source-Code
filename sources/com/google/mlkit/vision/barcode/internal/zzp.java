package com.google.mlkit.vision.barcode.internal;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.mlkit.vision.barcode.common.internal.BarcodeSource;

/* loaded from: classes6.dex */
public final class zzp implements BarcodeSource {

    /* renamed from: a, reason: collision with root package name */
    public final zzu f15999a;

    public zzp(zzu zzuVar) {
        this.f15999a = zzuVar;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final String a() {
        return this.f15999a.zzc;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final int b() {
        return this.f15999a.zzd;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final String c() {
        return this.f15999a.zzb;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Rect getBoundingBox() {
        zzu zzuVar = this.f15999a;
        if (zzuVar.zze == null) {
            return null;
        }
        int i = 0;
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = zzuVar.zze;
            if (i >= pointArr.length) {
                return new Rect(iMin, iMin2, iMax, iMax2);
            }
            Point point = pointArr[i];
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
            i++;
        }
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Point[] getCornerPoints() {
        return this.f15999a.zze;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final int getFormat() {
        return this.f15999a.zza;
    }
}
