package androidx.camera.core.internal;

import androidx.camera.core.ZoomState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes2.dex */
public abstract class ImmutableZoomState implements ZoomState {
    public static ZoomState e() {
        return new AutoValue_ImmutableZoomState(1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED);
    }

    public static ZoomState f(ZoomState zoomState) {
        return new AutoValue_ImmutableZoomState(zoomState.d(), zoomState.a(), zoomState.c(), zoomState.b());
    }
}
