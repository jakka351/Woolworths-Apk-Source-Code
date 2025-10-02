package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;

@KeepForSdk
/* loaded from: classes5.dex */
public class MapUtils {
    @KeepForSdk
    public static void writeStringMapToJson(@NonNull StringBuilder sb, @NonNull HashMap<String, String> map) {
        sb.append("{");
        boolean z = true;
        for (String str : map.keySet()) {
            if (!z) {
                sb.append(",");
            }
            String str2 = map.get(str);
            androidx.compose.ui.input.pointer.a.w(sb, "\"", str, "\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                androidx.compose.ui.input.pointer.a.w(sb, "\"", str2, "\"");
            }
            z = false;
        }
        sb.append("}");
    }
}
