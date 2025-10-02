package androidx.camera.video.internal;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.utils.DynamicRangeUtil;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class DynamicRangeMatchedEncoderProfilesProvider implements EncoderProfilesProvider {
    public final EncoderProfilesProvider b;
    public final DynamicRange c;
    public final HashMap d = new HashMap();

    public DynamicRangeMatchedEncoderProfilesProvider(EncoderProfilesProvider encoderProfilesProvider, DynamicRange dynamicRange) {
        this.b = encoderProfilesProvider;
        this.c = dynamicRange;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final EncoderProfilesProxy a(int i) {
        return c(i);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final boolean b(int i) {
        return this.b.b(i) && c(i) != null;
    }

    public final EncoderProfilesProxy c(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.d;
        if (map.containsKey(numValueOf)) {
            return (EncoderProfilesProxy) map.get(Integer.valueOf(i));
        }
        EncoderProfilesProvider encoderProfilesProvider = this.b;
        EncoderProfilesProxy.ImmutableEncoderProfilesProxy immutableEncoderProfilesProxyE = null;
        if (encoderProfilesProvider.b(i)) {
            EncoderProfilesProxy encoderProfilesProxyA = encoderProfilesProvider.a(i);
            if (encoderProfilesProxyA != null) {
                ArrayList arrayList = new ArrayList();
                for (EncoderProfilesProxy.VideoProfileProxy videoProfileProxy : encoderProfilesProxyA.d()) {
                    if (DynamicRangeUtil.a(videoProfileProxy, this.c)) {
                        arrayList.add(videoProfileProxy);
                    }
                }
                if (!arrayList.isEmpty()) {
                    immutableEncoderProfilesProxyE = EncoderProfilesProxy.ImmutableEncoderProfilesProxy.e(encoderProfilesProxyA.c(), encoderProfilesProxyA.a(), encoderProfilesProxyA.b(), arrayList);
                }
            }
            map.put(Integer.valueOf(i), immutableEncoderProfilesProxyE);
        }
        return immutableEncoderProfilesProxyE;
    }
}
