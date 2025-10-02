package androidx.camera.camera2;

import android.content.Context;
import androidx.camera.camera2.internal.Camera2UseCaseConfigFactory;
import androidx.camera.core.impl.UseCaseConfigFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements UseCaseConfigFactory.Provider {
    @Override // androidx.camera.core.impl.UseCaseConfigFactory.Provider
    public final Camera2UseCaseConfigFactory a(Context context) {
        return new Camera2UseCaseConfigFactory(context);
    }
}
