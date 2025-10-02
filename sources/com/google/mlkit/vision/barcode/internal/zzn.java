package com.google.mlkit.vision.barcode.internal;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import com.google.mlkit.vision.barcode.common.internal.BarcodeSource;

/* loaded from: classes6.dex */
public final class zzn implements BarcodeSource {

    /* renamed from: a, reason: collision with root package name */
    public final zzyb f15997a;

    public zzn(zzyb zzybVar) {
        this.f15997a = zzybVar;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final String a() {
        return this.f15997a.zzl();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final int b() {
        return this.f15997a.zzb();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final String c() {
        return this.f15997a.zzm();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Rect getBoundingBox() {
        Point[] pointArrZzo = this.f15997a.zzo();
        if (pointArrZzo == null) {
            return null;
        }
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        for (Point point : pointArrZzo) {
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Point[] getCornerPoints() {
        return this.f15997a.zzo();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final int getFormat() {
        return this.f15997a.zza();
    }
}
