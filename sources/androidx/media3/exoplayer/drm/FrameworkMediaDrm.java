package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.metrics.LogSessionId;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.analytics.p;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import com.salesforce.marketingcloud.storage.db.i;
import io.jsonwebtoken.JwsHeader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class FrameworkMediaDrm implements ExoMediaDrm {
    public static final androidx.camera.core.internal.a d = new androidx.camera.core.internal.a(27);

    /* renamed from: a, reason: collision with root package name */
    public final UUID f3086a;
    public final MediaDrm b;
    public int c;

    @RequiresApi
    public static class Api31 {
    }

    public FrameworkMediaDrm(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = C.b;
        Assertions.a("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.f3086a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Util.f2928a >= 27 || !uuid.equals(C.c)) ? uuid : uuid2);
        this.b = mediaDrm;
        this.c = 1;
        if (C.d.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final Map a(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final ExoMediaDrm.ProvisionRequest b() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new ExoMediaDrm.ProvisionRequest(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final byte[] c() {
        return this.b.openSession();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void d(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final byte[] e(byte[] bArr, byte[] bArr2) throws JSONException {
        if (C.c.equals(this.f3086a) && Util.f2928a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(Util.n(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray(i.a.n);
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString(JwsHeader.KEY_ID).replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e) {
                Log.d("ClearKeyUtil", "Failed to adjust response data: ".concat(Util.n(bArr2)), e);
            }
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void f(byte[] bArr, PlayerId playerId) {
        if (Util.f2928a >= 31) {
            try {
                MediaDrm mediaDrm = this.b;
                LogSessionId logSessionIdA = playerId.a();
                LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                    return;
                }
                MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
                playbackComponent.getClass();
                p.e(playbackComponent).setLogSessionId(logSessionIdA);
            } catch (UnsupportedOperationException unused2) {
                Log.g("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final boolean g(String str, byte[] bArr) throws Throwable {
        boolean zEquals;
        int i = Util.f2928a;
        UUID uuid = this.f3086a;
        if (i >= 31) {
            boolean zEquals2 = uuid.equals(C.d);
            MediaDrm mediaDrm = this.b;
            if (zEquals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                zEquals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                zEquals = uuid.equals(C.c);
            }
            if (zEquals) {
                return mediaDrm.requiresSecureDecoder(str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto = null;
        try {
            try {
                MediaCrypto mediaCrypto2 = new MediaCrypto((i >= 27 || !Objects.equals(uuid, C.c)) ? uuid : C.b, bArr);
                try {
                    boolean zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                    return zRequiresSecureDecoderComponent;
                } catch (MediaCryptoException unused) {
                    mediaCrypto = mediaCrypto2;
                    boolean z = !uuid.equals(C.c);
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    return z;
                } catch (Throwable th) {
                    th = th;
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (MediaCryptoException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void h(byte[] bArr) throws DeniedByServerException {
        this.b.provideProvisionResponse(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final int i() {
        return 2;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final CryptoConfig j(byte[] bArr) {
        int i = Util.f2928a;
        UUID uuid = this.f3086a;
        if (i < 27 && Objects.equals(uuid, C.c)) {
            uuid = C.b;
        }
        return new FrameworkCryptoConfig(uuid, bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void k(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void l(final ExoMediaDrm.OnEventListener onEventListener) {
        this.b.setOnEventListener(new MediaDrm.OnEventListener(this) { // from class: androidx.media3.exoplayer.drm.d
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                DefaultDrmSessionManager.MediaDrmHandler mediaDrmHandler = ((DefaultDrmSessionManager.MediaDrmEventListener) onEventListener).f3075a.i;
                mediaDrmHandler.getClass();
                mediaDrmHandler.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b7  */
    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.media3.exoplayer.drm.ExoMediaDrm.KeyRequest m(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instructions count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.drm.FrameworkMediaDrm.m(byte[], java.util.List, int, java.util.HashMap):androidx.media3.exoplayer.drm.ExoMediaDrm$KeyRequest");
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final synchronized void release() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.release();
        }
    }
}
