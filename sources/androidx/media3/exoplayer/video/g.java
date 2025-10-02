package androidx.media3.exoplayer.video;

import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import com.google.common.base.Supplier;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Supplier {
    @Override // com.google.common.base.Supplier
    public final Object get() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Supplier supplier = PlaybackVideoGraphWrapper.ReflectiveDefaultVideoFrameProcessorFactory.f3201a;
        try {
            Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            Object objInvoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
            objInvoke.getClass();
            return (VideoFrameProcessor.Factory) objInvoke;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
