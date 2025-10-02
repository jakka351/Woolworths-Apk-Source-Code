package androidx.camera.camera2.internal;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.Quirks;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class Camera2EncoderProfilesProvider implements EncoderProfilesProvider {
    public final boolean b;
    public final String c;
    public final int d;
    public final HashMap e = new HashMap();
    public final Quirks f;

    @RequiresApi
    public static class Api31Impl {
        public static EncoderProfiles a(int i, String str) {
            return CamcorderProfile.getAll(str, i);
        }
    }

    public Camera2EncoderProfilesProvider(String str, Quirks quirks) throws NumberFormatException {
        boolean z;
        int i;
        this.c = str;
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            Logger.e("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z = false;
            i = -1;
        }
        this.b = z;
        this.d = i;
        this.f = quirks;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b2  */
    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.camera.core.impl.EncoderProfilesProxy a(int r19) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.Camera2EncoderProfilesProvider.a(int):androidx.camera.core.impl.EncoderProfilesProxy");
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final boolean b(int i) {
        return this.b && a(i) != null;
    }
}
