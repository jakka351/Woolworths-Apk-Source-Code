package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

@RestrictTo
/* loaded from: classes2.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2436a = versionedParcel.l(iconCompat.f2436a, 1);
        byte[] bArrH = iconCompat.c;
        if (versionedParcel.j(2)) {
            bArrH = versionedParcel.h();
        }
        iconCompat.c = bArrH;
        Parcelable parcelableM = iconCompat.d;
        if (versionedParcel.j(3)) {
            parcelableM = versionedParcel.m();
        }
        iconCompat.d = parcelableM;
        iconCompat.e = versionedParcel.l(iconCompat.e, 4);
        iconCompat.f = versionedParcel.l(iconCompat.f, 5);
        Parcelable parcelableM2 = iconCompat.g;
        if (versionedParcel.j(6)) {
            parcelableM2 = versionedParcel.m();
        }
        iconCompat.g = (ColorStateList) parcelableM2;
        String strN = iconCompat.i;
        if (versionedParcel.j(7)) {
            strN = versionedParcel.n();
        }
        iconCompat.i = strN;
        String strN2 = iconCompat.j;
        if (versionedParcel.j(8)) {
            strN2 = versionedParcel.n();
        }
        iconCompat.j = strN2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f2436a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr = iconCompat.c;
                iconCompat.b = bArr;
                iconCompat.f2436a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str;
                if (iconCompat.f2436a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.q(true, true);
        boolean zF = versionedParcel.f();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f2436a) {
            case -1:
                if (!zF) {
                    iconCompat.d = (Parcelable) iconCompat.b;
                    break;
                } else {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
            case 1:
            case 5:
                if (!zF) {
                    iconCompat.d = (Parcelable) iconCompat.b;
                    break;
                } else {
                    Bitmap bitmap = (Bitmap) iconCompat.b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    iconCompat.c = byteArrayOutputStream.toByteArray();
                    break;
                }
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f2436a;
        if (-1 != i) {
            versionedParcel.v(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            versionedParcel.p(2);
            versionedParcel.s(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            versionedParcel.p(3);
            versionedParcel.w(parcelable);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            versionedParcel.v(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            versionedParcel.v(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            versionedParcel.p(6);
            versionedParcel.w(colorStateList);
        }
        String str = iconCompat.i;
        if (str != null) {
            versionedParcel.p(7);
            versionedParcel.x(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            versionedParcel.p(8);
            versionedParcel.x(str2);
        }
    }
}
