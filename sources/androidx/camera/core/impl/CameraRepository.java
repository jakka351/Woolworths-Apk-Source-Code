package androidx.camera.core.impl;

import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.Logger;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class CameraRepository {

    /* renamed from: a, reason: collision with root package name */
    public final Object f478a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();

    public CameraRepository() {
        new HashSet();
    }

    public final LinkedHashSet a() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f478a) {
            linkedHashSet = new LinkedHashSet(this.b.values());
        }
        return linkedHashSet;
    }

    public final void b(CameraFactory cameraFactory) {
        synchronized (this.f478a) {
            try {
                for (String str : cameraFactory.c()) {
                    Logger.a("CameraRepository", "Added camera: " + str);
                    this.b.put(str, cameraFactory.b(str));
                }
            } catch (CameraUnavailableException e) {
                throw new InitializationException(e);
            }
        }
    }
}
