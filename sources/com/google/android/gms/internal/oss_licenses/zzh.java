package com.google.android.gms.internal.oss_licenses;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes5.dex */
public final class zzh {
    public static ArrayList zza(Context context, int i) {
        int iIndexOf;
        String[] strArrSplit = zzc(context.getApplicationContext(), "third_party_license_metadata", 0L, -1, i).split("\n");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str : strArrSplit) {
            int iIndexOf2 = str.indexOf(32);
            String[] strArrSplit2 = str.substring(0, iIndexOf2).split(":");
            if (strArrSplit2.length != 2 || iIndexOf2 <= 0) {
                Object[] objArr = {str};
                StringBuilder sb = new StringBuilder(50);
                char c = 0;
                int i2 = 0;
                while (c <= 0 && (iIndexOf = "Invalid license meta-data line:\n%s".indexOf("%s", i2)) != -1) {
                    sb.append((CharSequence) "Invalid license meta-data line:\n%s", i2, iIndexOf);
                    sb.append(objArr[0]);
                    i2 = iIndexOf + 2;
                    c = 1;
                }
                sb.append((CharSequence) "Invalid license meta-data line:\n%s", i2, 34);
                if (c <= 0) {
                    sb.append(" [");
                    sb.append(objArr[0]);
                    sb.append(']');
                }
                throw new IllegalStateException(sb.toString());
            }
            arrayList.add(zzg.zza(str.substring(iIndexOf2 + 1), Long.parseLong(strArrSplit2[0]), Integer.parseInt(strArrSplit2[1])));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static String zzb(Context context, zzg zzgVar, int i) {
        return zzc(context, "third_party_licenses", zzgVar.zzc(), zzgVar.zzd(), i);
    }

    @SuppressLint
    private static String zzc(Context context, String str, long j, int i, int i2) throws Resources.NotFoundException, IOException {
        Resources resources = context.getApplicationContext().getResources();
        InputStream inputStreamOpenRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(i2)));
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStreamOpenRawResource.skip(j);
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            while (i > 0) {
                int i3 = inputStreamOpenRawResource.read(bArr, 0, Math.min(i, 1024));
                if (i3 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i3);
                i -= i3;
            }
            inputStreamOpenRawResource.close();
            try {
                return byteArrayOutputStream.toString("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e);
            }
        } catch (IOException e2) {
            throw new RuntimeException("Failed to read license or metadata text.", e2);
        }
    }
}
