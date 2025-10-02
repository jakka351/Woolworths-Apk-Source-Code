package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class StreamGifDecoder implements ResourceDecoder<InputStream, GifDrawable> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13944a;
    public final ByteBufferGifDecoder b;
    public final ArrayPool c;

    public StreamGifDecoder(ArrayList arrayList, ByteBufferGifDecoder byteBufferGifDecoder, ArrayPool arrayPool) {
        this.f13944a = arrayList;
        this.b = byteBufferGifDecoder;
        this.c = arrayPool;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean a(Object obj, Options options) {
        return !((Boolean) options.b(GifOptions.b)).booleanValue() && ImageHeaderParserUtils.f(this.f13944a, (InputStream) obj, this.c) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource b(Object obj, int i, int i2, Options options) throws IOException {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i3 = inputStream.read(bArr);
                if (i3 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i3);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.b.b(ByteBuffer.wrap(byteArray), i, i2, options);
    }
}
