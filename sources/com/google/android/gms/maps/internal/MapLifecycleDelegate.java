package com.google.android.gms.maps.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.maps.OnMapReadyCallback;

/* loaded from: classes5.dex */
public interface MapLifecycleDelegate extends LifecycleDelegate {
    void getMapAsync(@NonNull OnMapReadyCallback onMapReadyCallback);
}
