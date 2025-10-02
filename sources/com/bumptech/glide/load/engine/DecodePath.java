package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DecodePath<DataType, ResourceType, Transcode> {

    /* renamed from: a, reason: collision with root package name */
    public final Class f13802a;
    public final List b;
    public final ResourceTranscoder c;
    public final Pools.Pool d;
    public final String e;

    /* loaded from: classes4.dex */
    public interface DecodeCallback<ResourceType> {
    }

    public DecodePath(Class cls, Class cls2, Class cls3, List list, ResourceTranscoder resourceTranscoder, Pools.Pool pool) {
        this.f13802a = cls;
        this.b = list;
        this.c = resourceTranscoder;
        this.d = pool;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final Resource a(DataRewinder dataRewinder, int i, int i2, Options options, List list) throws GlideException {
        List list2 = this.b;
        int size = list2.size();
        Resource resourceB = null;
        for (int i3 = 0; i3 < size; i3++) {
            ResourceDecoder resourceDecoder = (ResourceDecoder) list2.get(i3);
            try {
                if (resourceDecoder.a(dataRewinder.a(), options)) {
                    resourceB = resourceDecoder.b(dataRewinder.a(), i, i2, options);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + resourceDecoder, e);
                }
                list.add(e);
            }
            if (resourceB != null) {
                break;
            }
        }
        if (resourceB != null) {
            return resourceB;
        }
        throw new GlideException(this.e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f13802a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}
