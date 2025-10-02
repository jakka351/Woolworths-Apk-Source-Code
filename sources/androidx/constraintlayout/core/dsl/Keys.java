package androidx.constraintlayout.core.dsl;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class Keys {
    public static void a(StringBuilder sb, String str) {
        if (Float.isNaN(BitmapDescriptorFactory.HUE_RED)) {
            return;
        }
        sb.append(str);
        sb.append(":");
        sb.append(BitmapDescriptorFactory.HUE_RED);
        sb.append(",\n");
    }
}
