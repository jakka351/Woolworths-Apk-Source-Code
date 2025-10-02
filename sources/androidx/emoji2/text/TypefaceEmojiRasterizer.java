package androidx.emoji2.text;

import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

@AnyThread
@RequiresApi
/* loaded from: classes2.dex */
public class TypefaceEmojiRasterizer {
    public static final ThreadLocal d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f2713a;
    public final MetadataRepo b;
    public volatile int c = 0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface HasGlyph {
    }

    public TypefaceEmojiRasterizer(MetadataRepo metadataRepo, int i) {
        this.b = metadataRepo;
        this.f2713a = i;
    }

    public final int a(int i) {
        MetadataItem metadataItemB = b();
        int iA = metadataItemB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = metadataItemB.b;
        int i2 = iA + metadataItemB.f2719a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final MetadataItem b() {
        ThreadLocal threadLocal = d;
        MetadataItem metadataItem = (MetadataItem) threadLocal.get();
        if (metadataItem == null) {
            metadataItem = new MetadataItem();
            threadLocal.set(metadataItem);
        }
        MetadataList metadataList = this.b.f2711a;
        int iA = metadataList.a(6);
        if (iA != 0) {
            int i = iA + metadataList.f2719a;
            int i2 = (this.f2713a * 4) + metadataList.b.getInt(i) + i + 4;
            int i3 = metadataList.b.getInt(i2) + i2;
            ByteBuffer byteBuffer = metadataList.b;
            metadataItem.b = byteBuffer;
            if (byteBuffer != null) {
                metadataItem.f2719a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                metadataItem.c = i4;
                metadataItem.d = metadataItem.b.getShort(i4);
                return metadataItem;
            }
            metadataItem.f2719a = 0;
            metadataItem.c = 0;
            metadataItem.d = 0;
        }
        return metadataItem;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        MetadataItem metadataItemB = b();
        int iA = metadataItemB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? metadataItemB.b.getInt(iA + metadataItemB.f2719a) : 0));
        sb.append(", codepoints:");
        MetadataItem metadataItemB2 = b();
        int iA2 = metadataItemB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + metadataItemB2.f2719a;
            i = metadataItemB2.b.getInt(metadataItemB2.b.getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
