package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataItem;

@RequiresApi
/* loaded from: classes2.dex */
public abstract class EmojiSpan extends ReplacementSpan {
    public final TypefaceEmojiRasterizer e;
    public final Paint.FontMetricsInt d = new Paint.FontMetricsInt();
    public short f = -1;
    public float g = 1.0f;

    public EmojiSpan(TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        Preconditions.e(typefaceEmojiRasterizer, "rasterizer cannot be null");
        this.e = typefaceEmojiRasterizer;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.d;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        TypefaceEmojiRasterizer typefaceEmojiRasterizer = this.e;
        this.g = fAbs / (typefaceEmojiRasterizer.b().a(14) != 0 ? r8.b.getShort(r1 + r8.f2719a) : (short) 0);
        MetadataItem metadataItemB = typefaceEmojiRasterizer.b();
        int iA = metadataItemB.a(14);
        if (iA != 0) {
            metadataItemB.b.getShort(iA + metadataItemB.f2719a);
        }
        short s = (short) ((typefaceEmojiRasterizer.b().a(12) != 0 ? r5.b.getShort(r7 + r5.f2719a) : (short) 0) * this.g);
        this.f = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
