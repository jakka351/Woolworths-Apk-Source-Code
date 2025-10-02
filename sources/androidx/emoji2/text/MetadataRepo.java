package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import androidx.emoji2.text.flatbuffer.MetadataList;

@AnyThread
@RequiresApi
/* loaded from: classes2.dex */
public final class MetadataRepo {

    /* renamed from: a, reason: collision with root package name */
    public final MetadataList f2711a;
    public final char[] b;
    public final Node c = new Node(1024);
    public final Typeface d;

    @RestrictTo
    public static class Node {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray f2712a;
        public TypefaceEmojiRasterizer b;

        public Node(int i) {
            this.f2712a = new SparseArray(i);
        }

        public final void a(TypefaceEmojiRasterizer typefaceEmojiRasterizer, int i, int i2) {
            int iA = typefaceEmojiRasterizer.a(i);
            SparseArray sparseArray = this.f2712a;
            Node node = sparseArray == null ? null : (Node) sparseArray.get(iA);
            if (node == null) {
                node = new Node(1);
                sparseArray.put(typefaceEmojiRasterizer.a(i), node);
            }
            if (i2 > i) {
                node.a(typefaceEmojiRasterizer, i + 1, i2);
            } else {
                node.b = typefaceEmojiRasterizer;
            }
        }
    }

    public MetadataRepo(Typeface typeface, MetadataList metadataList) {
        int i;
        int i2;
        int i3;
        int i4;
        this.d = typeface;
        this.f2711a = metadataList;
        int iA = metadataList.a(6);
        if (iA != 0) {
            int i5 = iA + metadataList.f2719a;
            i = metadataList.b.getInt(metadataList.b.getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.b = new char[i * 2];
        int iA2 = metadataList.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + metadataList.f2719a;
            i2 = metadataList.b.getInt(metadataList.b.getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            TypefaceEmojiRasterizer typefaceEmojiRasterizer = new TypefaceEmojiRasterizer(this, i7);
            MetadataItem metadataItemB = typefaceEmojiRasterizer.b();
            int iA3 = metadataItemB.a(4);
            Character.toChars(iA3 != 0 ? metadataItemB.b.getInt(iA3 + metadataItemB.f2719a) : 0, this.b, i7 * 2);
            MetadataItem metadataItemB2 = typefaceEmojiRasterizer.b();
            int iA4 = metadataItemB2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + metadataItemB2.f2719a;
                i3 = metadataItemB2.b.getInt(metadataItemB2.b.getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            Preconditions.a("invalid metadata codepoint length", i3 > 0);
            Node node = this.c;
            MetadataItem metadataItemB3 = typefaceEmojiRasterizer.b();
            int iA5 = metadataItemB3.a(16);
            if (iA5 != 0) {
                int i9 = iA5 + metadataItemB3.f2719a;
                i4 = metadataItemB3.b.getInt(metadataItemB3.b.getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            node.a(typefaceEmojiRasterizer, 0, i4 - 1);
        }
    }

    public final int a() {
        MetadataList metadataList = this.f2711a;
        int iA = metadataList.a(4);
        if (iA != 0) {
            return metadataList.b.getInt(iA + metadataList.f2719a);
        }
        return 0;
    }
}
