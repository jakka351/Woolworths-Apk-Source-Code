package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.vision.zzab;
import com.google.android.gms.internal.vision.zzah;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class TextBlock implements Text {
    private zzah[] zza;
    private Point[] zzb;
    private List<Line> zzc;
    private String zzd;
    private Rect zze;

    public TextBlock(SparseArray<zzah> sparseArray) {
        this.zza = new zzah[sparseArray.size()];
        int i = 0;
        while (true) {
            zzah[] zzahVarArr = this.zza;
            if (i >= zzahVarArr.length) {
                return;
            }
            zzahVarArr[i] = sparseArray.valueAt(i);
            i++;
        }
    }

    @Override // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public Rect getBoundingBox() {
        if (this.zze == null) {
            this.zze = zzc.zza(this);
        }
        return this.zze;
    }

    @Override // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public List<? extends Text> getComponents() {
        if (this.zza.length == 0) {
            return new ArrayList(0);
        }
        if (this.zzc == null) {
            this.zzc = new ArrayList(this.zza.length);
            for (zzah zzahVar : this.zza) {
                this.zzc.add(new Line(zzahVar));
            }
        }
        return this.zzc;
    }

    @Override // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public Point[] getCornerPoints() {
        zzah[] zzahVarArr;
        if (this.zzb == null) {
            int i = 0;
            if (this.zza.length == 0) {
                this.zzb = new Point[0];
            } else {
                int iMax = Integer.MIN_VALUE;
                int i2 = 0;
                int iMin = Integer.MAX_VALUE;
                int iMin2 = Integer.MAX_VALUE;
                int iMax2 = Integer.MIN_VALUE;
                while (true) {
                    zzahVarArr = this.zza;
                    if (i2 >= zzahVarArr.length) {
                        break;
                    }
                    zzab zzabVar = zzahVarArr[i2].zzb;
                    zzab zzabVar2 = zzahVarArr[i].zzb;
                    int i3 = -zzabVar2.zza;
                    int i4 = -zzabVar2.zzb;
                    double dSin = Math.sin(Math.toRadians(zzabVar2.zze));
                    double dCos = Math.cos(Math.toRadians(zzabVar2.zze));
                    Point[] pointArr = new Point[4];
                    int i5 = i;
                    int i6 = i2;
                    Point point = new Point(zzabVar.zza, zzabVar.zzb);
                    pointArr[i5] = point;
                    point.offset(i3, i4);
                    Point point2 = pointArr[i5];
                    int i7 = point2.x;
                    int i8 = point2.y;
                    int i9 = (int) ((i8 * dSin) + (i7 * dCos));
                    int i10 = (int) ((i8 * dCos) + ((-i7) * dSin));
                    point2.x = i9;
                    point2.y = i10;
                    pointArr[1] = new Point(zzabVar.zzc + i9, i10);
                    pointArr[2] = new Point(zzabVar.zzc + i9, zzabVar.zzd + i10);
                    pointArr[3] = new Point(i9, i10 + zzabVar.zzd);
                    for (int i11 = i5; i11 < 4; i11++) {
                        Point point3 = pointArr[i11];
                        iMin = Math.min(iMin, point3.x);
                        iMax = Math.max(iMax, point3.x);
                        iMin2 = Math.min(iMin2, point3.y);
                        iMax2 = Math.max(iMax2, point3.y);
                    }
                    i2 = i6 + 1;
                    i = i5;
                }
                int i12 = i;
                zzab zzabVar3 = zzahVarArr[i12].zzb;
                int i13 = zzabVar3.zza;
                int i14 = zzabVar3.zzb;
                double dSin2 = Math.sin(Math.toRadians(zzabVar3.zze));
                double dCos2 = Math.cos(Math.toRadians(zzabVar3.zze));
                Point[] pointArr2 = {new Point(iMin, iMin2), new Point(iMax, iMin2), new Point(iMax, iMax2), new Point(iMin, iMax2)};
                for (int i15 = i12; i15 < 4; i15++) {
                    Point point4 = pointArr2[i15];
                    int i16 = point4.x;
                    int i17 = point4.y;
                    point4.x = (int) ((i16 * dCos2) - (i17 * dSin2));
                    point4.y = (int) ((i17 * dCos2) + (i16 * dSin2));
                    point4.offset(i13, i14);
                }
                this.zzb = pointArr2;
            }
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public String getLanguage() {
        String str = this.zzd;
        if (str != null) {
            return str;
        }
        HashMap map = new HashMap();
        for (zzah zzahVar : this.zza) {
            map.put(zzahVar.zzd, Integer.valueOf((map.containsKey(zzahVar.zzd) ? ((Integer) map.get(zzahVar.zzd)).intValue() : 0) + 1));
        }
        String str2 = (String) ((Map.Entry) Collections.max(map.entrySet(), new zza(this))).getKey();
        this.zzd = str2;
        if (str2 == null || str2.isEmpty()) {
            this.zzd = "und";
        }
        return this.zzd;
    }

    @Override // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public String getValue() {
        zzah[] zzahVarArr = this.zza;
        if (zzahVarArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(zzahVarArr[0].zzc);
        for (int i = 1; i < this.zza.length; i++) {
            sb.append("\n");
            sb.append(this.zza[i].zzc);
        }
        return sb.toString();
    }
}
