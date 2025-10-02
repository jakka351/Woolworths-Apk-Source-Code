package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.vision.zzab;

/* loaded from: classes5.dex */
final class zzc {
    public static Rect zza(Text text) {
        int iMin = Integer.MAX_VALUE;
        int iMax = Integer.MIN_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        for (Point point : text.getCornerPoints()) {
            iMin = Math.min(iMin, point.x);
            iMax2 = Math.max(iMax2, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax = Math.max(iMax, point.y);
        }
        return new Rect(iMin, iMin2, iMax2, iMax);
    }

    public static Point[] zza(zzab zzabVar) {
        double dSin = Math.sin(Math.toRadians(zzabVar.zze));
        double dCos = Math.cos(Math.toRadians(zzabVar.zze));
        double d = zzabVar.zza;
        int i = zzabVar.zzc;
        Point[] pointArr = {new Point(zzabVar.zza, zzabVar.zzb), new Point((int) ((i * dCos) + d), (int) ((i * dSin) + zzabVar.zzb)), new Point((int) (d - (i * dSin)), (int) (d + r8.y)), new Point(i, (point.y - point.y) + i)};
        double d2 = pointArr[1].x;
        int i2 = zzabVar.zzd;
        double d3 = i2 * dCos;
        Point point = pointArr[0];
        int i3 = point.x;
        Point point2 = pointArr[2];
        int i4 = point2.x;
        Point point3 = pointArr[1];
        int i5 = (i4 - point3.x) + i3;
        int i6 = point.y;
        return pointArr;
    }
}
