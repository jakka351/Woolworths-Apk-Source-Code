package com.salesforce.marketingcloud.analytics;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.List;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public final class c {
    private c() {
    }

    public static String[] a(@NonNull String str) {
        return str.split("\\s*,\\s*");
    }

    public static String a(List<b> list) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (b bVar : list) {
            if (bVar != null) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                sb.append(bVar.d());
            }
        }
        return sb.toString();
    }
}
