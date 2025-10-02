package com.skydoves.balloon.compose;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/skydoves/balloon/compose/BalloonLayoutInfo;", "", "balloon-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BalloonLayoutInfo {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BalloonLayoutInfo) && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + b.a(0, a.b(BitmapDescriptorFactory.HUE_RED, Float.hashCode(BitmapDescriptorFactory.HUE_RED) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BalloonLayoutInfo(x=");
        sb.append(BitmapDescriptorFactory.HUE_RED);
        sb.append(", y=");
        sb.append(BitmapDescriptorFactory.HUE_RED);
        sb.append(", width=");
        sb.append(0);
        sb.append(", height=");
        return YU.a.l(sb, 0, ')');
    }
}
